package com.azimut4946777.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.azimut4946777.shoppinglist.data.ShopListRepositoryImpl
import com.azimut4946777.shoppinglist.data.ShopListRepositoryImpl.getShopList
import com.azimut4946777.shoppinglist.domain.DeleteShopItemUseCase
import com.azimut4946777.shoppinglist.domain.EditShopItemUseCase
import com.azimut4946777.shoppinglist.domain.GetShopListUseCase
import com.azimut4946777.shoppinglist.domain.ShopItem

class MainViewModel: ViewModel() {
    private val  repository = ShopListRepositoryImpl


    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)

    }
    fun changeEnabledState(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)

    }


}