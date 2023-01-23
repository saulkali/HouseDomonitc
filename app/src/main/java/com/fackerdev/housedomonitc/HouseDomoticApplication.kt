package com.fackerdev.housedomonitc

import android.app.Application
import org.ini4j.Wini

class HouseDomoticApplication:Application() {
    lateinit var config:Wini

    override fun onCreate() {
        super.onCreate()

        setupInitConfig()
    }

    private fun setupInitConfig() {
        config = Wini()

        val fileConfig = assets.open("config.ini")
        config.load(fileConfig)
        fileConfig.close()

    }
}