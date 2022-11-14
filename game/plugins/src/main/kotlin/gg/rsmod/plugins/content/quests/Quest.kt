package gg.rsmod.plugins.content.quests

/**
 * @author Gallus
 */
enum class Quest(val slot: Int, val varp: Int = 0, val varbit: Int = 0, val questName: String) {
    // f2p quests
    BELOW_ICE_MOUNTAIN(slot = 21, varp = -1, questName = "Below Ice Mountain"),
    BLACK_KNIGHTS_FORTRESS(slot = 0, varp = 130, questName = "Black Knights' Fortress"),
    COOKS_ASSISTANT(slot = 1, varp = 29, questName = "Cook's Assistant"),
    THE_CORSAIR_CURSE(slot = 2, varbit = 6071, questName = "The Corsair Curse"),
    DEMON_SLAYER(slot = 3, varbit = 2561, questName = "Demon Slayer"),
    DORICS_QUEST(slot = 4, varp = 31, questName = "Doric's Quest"),
    DRAGON_SLAYER(slot = 5, varp = 176, questName = "Dragon Slayer 1"),
    ERNEST_THE_CHICKEN(slot = 6, varp = 32, questName = "Ernest the Chicken"),
    GOBLIN_DIPLOMACY(slot = 7, varbit = 2378, questName = "Goblin Diplomacy"),
    IMP_CATCHER(slot = 8, varp = 160, questName = "Imp Catcher"),
    THE_KNIGHTS_SWORD(slot = 9, varp = 122, questName = "The Knight's Sword"),
    MISTHALIN_MYSTERY(slot = 10, varbit = 3468, questName = "Misthalin Mystery"),
    PIRATES_TREASURE(slot = 11, varp = 71, questName = "Pirate's Treasure"),
    PRINCE_ALI_RESCUE(slot = 12, varp = 273, questName = "Prince Ali Rescue"),
    THE_RESTLESS_GHOST(slot = 13, varp = 107, questName = "The Restless Ghost"),
    ROMEO_AND_JULIET(slot = 14, varp = 144, questName = "Romeo & Juliet"),
    RUNE_MYSTERIES(slot = 15, varp = 63, questName = "Rune Mysteries"),
    SHEEP_SHEARER(slot = 16, varp = 179, questName = "Sheep Shearer"),
    SHIELD_OF_ARRAV(slot = 17, varp = 145, questName = "Shield of Arrav"),
    VAMPIRE_SLAYER(slot = 18, varp = 178, questName = "Vampyre Slayer"),
    WITCHS_POTION(slot = 19, varp = 67, questName = "Witch's Potion"),
    X_MARKS_THE_SPOT(slot = 20, varp = -1, varbit = -1, questName = "X Marks the Spot");

    companion object {
        val values = enumValues<Quest>()
    }
}