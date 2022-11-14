package gg.rsmod.plugins.content.npcs.combat.goblin

/**
 *
 */
val goblins = arrayOf(
    Npcs.GOBLIN_3028, Npcs.GOBLIN_3029, Npcs.GOBLIN_3030,
    Npcs.GOBLIN_3031, Npcs.GOBLIN_3032, Npcs.GOBLIN_3033,
    Npcs.GOBLIN_3034, Npcs.GOBLIN_3035, Npcs.GOBLIN_3036
)

goblins.forEach { goblin ->
    set_combat_def(goblin) {
        configs {
            attackSpeed = 4
            respawnDelay = 35
        }

        /**
         * The base stats for the [Goblin] creature
         *
         * @param hitpoints : the max hitpoints
         * @param attack : the attack level
         * @param defence : the defence level
         * @param strength : the strength level
         * @param magic : the magic level
         * @param ranged : the range level
         */
        stats {
            hitpoints = 5
            attack = 1
            defence = 1
            strength = 1
            magic = 1
            ranged = 1
        }

        /**
         * The combat bonuses for the [Goblin] creature
         */
        bonuses {
            attackBonus = -21
            strengthBonus = -15
            attackMagic = 0
            magicDamageBonus = 0
            attackRanged = 0
            rangedStrengthBonus = 0

            defenceStab = -15
            defenceSlash = -15
            defenceCrush = -15
            defenceMagic = -15
            defenceRanged = -15
        }

        /**
         * The combat animations for the [Goblin] creature
         */
        anims {
            death = 6182
            block = 6183
            attack = 6184
        }
    }
}