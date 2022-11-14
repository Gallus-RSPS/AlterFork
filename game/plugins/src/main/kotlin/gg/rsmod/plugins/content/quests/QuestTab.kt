package gg.rsmod.plugins.content.quests

import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.InterfaceDestination
import gg.rsmod.plugins.api.ext.*
import gg.rsmod.plugins.content.quests.free.cooks_assistant.cooks_assistant_journal

/**
 * @author Gallus
 */

private var notAdded = "This quest has not yet been added."

object QuestTab {
    const val QUEST_INTERFACE_ID = 399
    const val QUEST_INTERFACE_COMPONENT = 7
    const val QUEST_JOURNAL_INTERFACE_ID = 119
    const val QUEST_TITLE_COMPONENT_ID = 2
    const val REWARD_ID = 288
    const val QUEST_POINTS_VARP = 101
    const val QUEST_SETTINGS_INTERFACE_ID = 134

    /**
     * Search function
     */
    fun search(p: Player) {
        p.openInterface(QUEST_SETTINGS_INTERFACE_ID, InterfaceDestination.MAIN_SCREEN)
        p.runClientScript(600, 0, 1, 15, 30408716)
        p.setComponentText(QUEST_SETTINGS_INTERFACE_ID, 11, "<col=ff981f>Quest List<col=f4f4f4>*</col></col>")
    }

    /**
     * Opens the Quest Journal
     */
    fun openJournal(p: Player, quest: Quest) {
        when (quest.slot) {
            1 -> cooks_assistant_journal.openJournal(p)
            else -> p.message(notAdded)
        }
    }
}