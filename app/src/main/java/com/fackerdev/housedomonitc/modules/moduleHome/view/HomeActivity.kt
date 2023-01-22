package com.fackerdev.housedomonitc.modules.moduleHome.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fackerdev.housedomonitc.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var mBinding:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }
}