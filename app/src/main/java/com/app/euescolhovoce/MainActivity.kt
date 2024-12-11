package com.app.euescolhovoce



import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.app.euescolhovoce.navigation.navigationapp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navigationapp()
        }
    }
}