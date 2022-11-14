package gg.rsmod.game.model.songs

/**
 * Represents the quests and their current stage.
 *
 * @author Gallus
 *
 * @param id
 * The [Song] slot id.
 *
 * @param unlocked
 * The [Song] unlock state. By default an unlocked [Song] will be state 0
 *
 */
data class Song(val id: Int, var unlocked: Int)