package gg.rsmod.plugins.content.quests.free.cooks_assistant

import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.InterfaceDestination.*
import gg.rsmod.plugins.api.ext.*
import gg.rsmod.plugins.content.quests.Quest
import gg.rsmod.plugins.content.quests.QuestTab.QUEST_JOURNAL_INTERFACE_ID
import gg.rsmod.plugins.content.quests.QuestTab.QUEST_TITLE_COMPONENT_ID

object cooks_assistant_journal {

    val completed_state = 2
    val quest = Quest.COOKS_ASSISTANT

    fun openJournal(p: Player) {
        val varp = p.getVarp(quest.varp)
        p.openInterface(QUEST_JOURNAL_INTERFACE_ID, MAIN_SCREEN)
        p.setComponentText(interfaceId = QUEST_JOURNAL_INTERFACE_ID, component = QUEST_TITLE_COMPONENT_ID, text = "[${quest.questName}]")
        when(varp) {
            0 -> {
                p.line("{I can start this quest by speaking to the} [Cook] {in the}", 4)
                p.line("[Kitchen] {on the ground floor of} [Lumbridge Castle].")
                p.runClientScript(2523, 0, 11)
            }
            1,3,4,5,6,7,8,9 -> {
                p.line("{It's the} [Duke of Lumbridge's] {bithday and I have to help}", 4)
                p.line("{his} [Cook] {make him a} [birthday cake]. {To do this I need to}")
                p.line("{bring him the following ingredients}.")
                // gave milk | gave milk and flour | gave milk and egg | gave all 3
                if (varp == 3 || varp == 6 || varp == 7 || varp == 9){
                    p.line("<str>I have given the cook a bucket of milk.</str>", 7)
                } else {
                    p.line("{I need to find a} [bucket of milk] {. There's a cattle field east}", 7)
                    p.line("{of Lumbridge, I should make sure I take an empty bucket}")
                    p.line("{with me.}")
                }
                // gave flour | gave milk and flour | gave flour and egg | gave all 3
                if (varp == 4 || varp == 6 || varp == 8 || varp == 9){
                    p.line("<str>I have given the cook a pot of flour.</str>", 8)
                } else {
                    p.line("{I need to find a} [pot of flour] {. There's a mill found north-}", 8)
                    p.line("{west of Lumbridge, I should take an empty pot with me.}")
                }
                // gave egg | gave milk and egg | gave flour and egg | gave all 3
                if (varp == 5 || varp == 7 || varp == 8 || varp == 9) {
                    p.line("<str>I have given the cook an egg.</str>", 9)
                } else {
                    p.line("{I need to find an} [egg] {. The cook normally gets his eggs from}", 9)
                    p.line("{the Groats' farm, found just to the west of the cattle}")
                    p.line("{field.}")
                }
                p.runClientScript(2523, 0, 11)
            }
            completed_state -> {

            }
        }

    }

}