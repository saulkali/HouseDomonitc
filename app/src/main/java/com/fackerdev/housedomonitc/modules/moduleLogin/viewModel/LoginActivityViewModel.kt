package com.fackerdev.housedomonitc.modules.moduleLogin.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fackerdev.housedomonitc.common.entities.UserEntity

class LoginActivityViewModel:ViewModel() {
    val mUserEntity:MutableLiveData<UserEntity> = MutableLiveData()

}