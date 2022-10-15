package com.azimut4946777.shoppinglist.domain

class DeleteAllShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteAllShopItem(shopList: MutableList<ShopItem>) {
        shopListRepository.deleteAllShopItem(shopList)
    }
}