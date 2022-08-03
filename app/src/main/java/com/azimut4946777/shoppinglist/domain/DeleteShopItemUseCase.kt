package com.azimut4946777.shoppinglist.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem){
          shopListRepository.deleteShopItem(shopItem)
    }
}