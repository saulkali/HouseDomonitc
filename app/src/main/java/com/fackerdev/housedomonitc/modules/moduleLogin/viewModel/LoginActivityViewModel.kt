package com.fackerdev.housedomonitc.modules.moduleLogin.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fackerdev.housedomonitc.common.entities.UserEntity
import com.fackerdev.housedomonitc.common.network.MQTTClient

class LoginActivityViewModel:ViewModel() {
    val mUserEntity:MutableLiveData<UserEntity> = MutableLiveData()
    private val mMqttClient:MutableLiveData<MQTTClient> = MutableLiveData()
}