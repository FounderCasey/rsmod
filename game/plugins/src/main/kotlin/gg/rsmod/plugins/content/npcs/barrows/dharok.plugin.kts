package gg.rsmod.plugins.content.npcs.barrows

spawn_npc(Npcs.DHAROK_THE_WRETCHED, 3576, 3298, 0, 2);
spawn_npc(Npcs.DHAROK_THE_WRETCHED, 3576, 3300, 0, 2);
spawn_npc(Npcs.DHAROK_THE_WRETCHED, 3573, 3299, 0, 2);
spawn_npc(Npcs.DHAROK_THE_WRETCHED, 3578, 3296, 0, 2);
spawn_npc(Npcs.DHAROK_THE_WRETCHED, 3574, 3295, 0, 2);

set_combat_def(Npcs.DHAROK_THE_WRETCHED) {
    configs {
        attackSpeed = 7
        respawnDelay = 50
    }

    stats {
        hitpoints = 100
        attack = 100
        strength = 100
        defence = 100
    }

    anims {
        attack = 2067
        block = 424
        death = 2925
    }
}

npc_drop_table(Npcs.DHAROK_THE_WRETCHED) {
    val map = HashMap<Int, Int>()
    val drops = intArrayOf(Items.DHAROKS_HELM, Items.DHAROKS_GREATAXE, Items.DHAROKS_PLATEBODY, Items.DHAROKS_PLATELEGS, Items.AMULET_OF_THE_DAMNED)
    var random = world.random(1..30)
    if(random == 1) {
        map[drops.random()] = 1
    }
    map
}