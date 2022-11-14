package gg.rsmod.plugins.content.quests

/**
 * @author Gallus
 */

//on_login {
//    player.setInterfaceEvents(interfaceId = QuestTab.QUEST_INTERFACE_ID, component = 0, range = 0 until 0, setting = 6)
//    player.setInterfaceEvents(interfaceId = QuestTab.QUEST_INTERFACE_ID, component = 2, range = 0 until 7, setting = 6)
//    player.setInterfaceEvents(interfaceId = QuestTab.QUEST_INTERFACE_ID, component = 4, range = -1 until -1, setting = 6)
//    player.setInterfaceEvents(interfaceId = QuestTab.QUEST_INTERFACE_ID, component = 5, range = 0 until 5, setting = 6)
//    player.setInterfaceEvents(interfaceId = QuestTab.QUEST_INTERFACE_ID, component = 6, range = -1 until -1, setting = 6)
//    player.setInterfaceEvents(interfaceId = QuestTab.QUEST_INTERFACE_ID, component = 7, range = 0 until 172, setting = 6)
//}

val quest_tab_map = mapOf<Int, Int>(
    548 to 50,
    161 to 53,
    164 to 52,
    165 to 52 // don't konw about this or how to get to "fullscreen" to check
)

/**
 * Quest setting button
 */


fun openQuestTab(p: Player) {
    p.openInterface(InterfaceDestination.QUEST_ROOT)
    when (p.getVarbit(Varbits.PLAYER_SUMMARY_FOCUS_TAB)) {
        0 -> {}// character summary
        1 -> { // Quest list
            p.openInterface(629, 2, 399, 2)
            p.setInterfaceEvents(399, 6, 0, 20, 2)
            p.setInterfaceEvents(399, 7, 0, 122, 2)
            p.setInterfaceEvents(399, 8, 0, 12, 2)
        }
        2 -> {} // Achievement Diary
        3 -> { // Kourend Favour
            p.openInterface(629, 2, 245, 1)
        }
        else -> { // all else fails show quests
            p.setVarbit(Varbits.PLAYER_SUMMARY_FOCUS_TAB, 1)
            openQuestTab(p)
        }
    }
}