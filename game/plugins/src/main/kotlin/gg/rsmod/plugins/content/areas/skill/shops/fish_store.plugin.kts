package gg.rsmod.plugins.content.areas.clanwars.shops

import gg.rsmod.plugins.content.mechanics.shops.CoinCurrency

create_shop("Bait and Tackle Shop", CoinCurrency(), stockType = StockType.INFINITE, purchasePolicy = PurchasePolicy.BUY_STOCK) {
    items[0] = ShopItem(Items.SMALL_FISHING_NET, 10500000)
    items[1] = ShopItem(Items.BIG_FISHING_NET, 10500000)
    items[2] = ShopItem(Items.FLY_FISHING_ROD, 10500000)
    items[3] = ShopItem(Items.FISHING_ROD, 10500000)
    items[4] = ShopItem(Items.FLY_FISHING_ROD, 10500000)
    items[5] = ShopItem(Items.LOBSTER_POT, 10500000)
    items[6] = ShopItem(Items.HARPOON, 10500000)
    items[7] = ShopItem(Items.KARAMBWAN_VESSEL, 10500000)
    items[8] = ShopItem(Items.FEATHER, 10500000)
    items[9] = ShopItem(Items.FISHING_BAIT, 10500000)
}