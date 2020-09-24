package gg.rsmod.plugins.content.npcs.barrows

spawn_npc(Npcs.AHRIM_THE_BLIGHTED, 3565, 3289, 0, 2);
spawn_npc(Npcs.AHRIM_THE_BLIGHTED, 3563, 3286, 0, 2);
spawn_npc(Npcs.AHRIM_THE_BLIGHTED, 3563, 3291, 0, 2);
spawn_npc(Npcs.AHRIM_THE_BLIGHTED, 3567, 3291, 0, 2);
spawn_npc(Npcs.AHRIM_THE_BLIGHTED, 3568, 3288, 0, 2);

set_combat_def(Npcs.AHRIM_THE_BLIGHTED) {
    configs {
        attackSpeed = 6
        respawnDelay = 50
    }

    stats {
        hitpoints = 100
        magic = 100
        defence = 100
    }

    anims {
        attack = 729
        block = 2079
        death = 2925
    }
}

npc_drop_table(Npcs.AHRIM_THE_BLIGHTED) {
    val map = HashMap<Int, Int>()
    val drops = intArrayOf(Items.AHRIMS_HOOD, Items.AHRIMS_STAFF, Items.AHRIMS_ROBETOP, Items.AHRIMS_ROBESKIRT, Items.AMULET_OF_THE_DAMNED)
    var random = world.random(1..30)
    if(random == 1) {
        map[drops.random()] = 1
    }
    map
}