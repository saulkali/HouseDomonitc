package com.fackerdev.housedomonitc.common.network

import android.app.Service
import android.content.Intent
import android.os.IBinder
import org.eclipse.paho.android.service.MqttAndroidClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions

class MQTTClient: Service() {
    private val mClient by lazy {
        val mqttClient = MqttAndroidClient(this,"tcp://${mHost}:${mPort}",mClientId)
        val options = MqttConnectOptions()
        options.userName = mClientId
        options.password = mPassword.toCharArray()
        mqttClient.connect(options)
        mqttClient
    }

    private lateinit var mHost:String
    private lateinit var mPassword:String
    private lateinit var mClientId:String
    private lateinit var mPort:String

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mHost = intent?.getStringExtra("host") ?: ""
        mPort = intent?.getStringExtra("port") ?: ""
        mClientId = intent?.getStringExtra("clientId") ?: ""
        mPassword = intent?.getStringExtra("password") ?: ""
        return super.onStartCommand(intent, flags, startId)
    }

}