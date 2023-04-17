package com.example.android_permission.latihan_2

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android_permission.R
import com.example.android_permission.databinding.ActivityWifiPermissionBinding

class WifiPermission : AppCompatActivity() {
    lateinit var binding : ActivityWifiPermissionBinding
    lateinit var wifiManager: WifiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWifiPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

        binding.btnOn.setOnClickListener {
            wifiManager.isWifiEnabled = true
            Toast.makeText(this, "Wifi enabled", Toast.LENGTH_SHORT).show()
        }
        binding.btnOff.setOnClickListener {
            wifiManager.isWifiEnabled = false
            Toast.makeText(this, "Wifi disabled", Toast.LENGTH_SHORT).show()
        }
    }
}