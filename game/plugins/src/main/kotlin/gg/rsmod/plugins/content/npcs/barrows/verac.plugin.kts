package gg.rsmod.plugins.content.npcs.barrows

spawn_npc(Npcs.VERAC_THE_DEFILED, 3557, 3297, 0, 2);
spawn_npc(Npcs.VERAC_THE_DEFILED, 3559, 3300, 0, 2);
spawn_npc(Npcs.VERAC_THE_DEFILED, 3555, 3297, 0, 2);
spawn_npc(Npcs.VERAC_THE_DEFILED, 3555, 3294, 0, 2);
spawn_npc(Npcs.VERAC_THE_DEFILED, 3559, 3294, 0, 2);

set_combat_def(Npcs.VERAC_THE_DEFILED) {
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

npc_drop_table(Npcs.VERAC_THE_DEFILED) {
    val map = HashMap<Int, Int>()
    val drops = intArrayOf(Items.VERACS_HELM, Items.VERACS_FLAIL, Items.VERACS_BRASSARD, Items.VERACS_PLATESKIRT, Items.AMULET_OF_THE_DAMNED)
    var random = world.random(1..30)
    if(random == 1) {
        map[drops.random()] = 1
    }
    map
}