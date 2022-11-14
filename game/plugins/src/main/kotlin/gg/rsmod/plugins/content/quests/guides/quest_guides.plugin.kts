package gg.rsmod.plugins.content.quests.guides

import gg.rsmod.plugins.content.quests.Quest
import gg.rsmod.plugins.content.quests.QuestTab

/**
 * @author Gallus
 */

/**
 * On making a quest guide, make sure to always set if one is unavailable
 * player.setComponentText(interfaceId = 119, component = 7, text = "")
 * TODO: guides in own files
 */

on_button(interfaceId = QuestTab.QUEST_INTERFACE_ID, component = 11){
    QuestTab.search(this.player)
}

on_button(interfaceId = QuestTab.QUEST_INTERFACE_ID, component = 7) {
    val slot = player.getInteractingSlot()
    val foundQuest = Quest.values.firstOrNull { e -> e.slot == slot }
    if (foundQuest != null) {
        QuestTab.openJournal(this.player, foundQuest)
        player.message("Quest: ${foundQuest.questName}.")
    } else {
        player.message("Quest: slot[${slot}] is not listed.")
    }
}
