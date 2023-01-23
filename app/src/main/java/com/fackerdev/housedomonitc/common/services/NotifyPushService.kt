package com.fackerdev.housedomonitc.common.services

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class NotifyPushService: Service() {
    private var count = 0

    inner class CounterBinder : Binder() {
        fun getCount() = count
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return CounterBinder()
    }
    
    fun incrementCount() {
        count++
    }
}