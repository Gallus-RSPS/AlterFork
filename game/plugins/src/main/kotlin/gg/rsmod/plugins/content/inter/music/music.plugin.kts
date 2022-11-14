package gg.rsmod.plugins.content.inter.music

/**
 * @author Gallus
 */

val musicDefs = MusicTracks.musicDefinitions

val varpId = intArrayOf(0, 20, 21, 22, 23, 24, 25, 298, 311, 346, 414, 464, 598, 662, 721, 906, 1009, 1338, 1681, 2065, 2237)

on_login {
    player.setInterfaceEvents(interfaceId = 239, component = 3, range = 0 until 600, setting = 6)
    player.setComponentHidden(interfaceId = 239, component = 0, hidden = false)
}

musicDefs.values.forEach { regions ->
    on_enter_region(regions.regionOptions.iterator().next()) {
        player.message("You've entered a new region: " + player.tile.regionId);
        val bit = (1 shl regions.bitId)
        val varp = varpId[regions.varpId]
        if (regions.bitId != -1) {
            if ((player.getVarp(varp) and bit) == 0) {
                player.setVarp(varp, player.getVarp(varp) or bit)
                player.setSong((regions.slot - 1), 1)
                player.message("You have unlocked the music track: " + regions.songName.red())
            }
        }
        PlaySong.playSong(player, regions)
    }
}

on_button(interfaceId = 239, component = 3) p@ {
    val slot = player.getInteractingSlot()
    val song = MusicTracks.values.firstOrNull { e -> e.slot == (slot + 1) } ?: return@p
    val bit = (1 shl song.bitId)
    val varp = varpId[song.varpId]

    if (song.bitId != -1) {
        if ((player.getVarp(varp) and bit) == 0){
            player.message("This song is not unlocked yet.")
        } else {
            PlaySong.playSong(player, song)
        }
    } else {
        PlaySong.playSong(player, song)
    }
}



on_button(interfaceId = 239, component = 11) { // Loop Button
    if (player.getVarbit(4137) == 0){
        player.setVarbit(4137, 1)
    } else {
        player.setVarbit(4137, 0)
    }
}
on_button(interfaceId = 239, component = 7) { // Auto Button
    player.setVarp(18, 1)
}
on_button(interfaceId = 239, component = 9) { // Manual Button
    player.setVarp(18, 0)
}

fun String.red() = "<col=a61005>$this</col>"