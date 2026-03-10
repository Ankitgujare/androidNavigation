package com.example.navigatiobasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigatiobasics.pass_agrument___02.AppNav.AppNav
import com.example.navigatiobasics.ui.theme.NavigatioBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigatioBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   // AppNav()
                    AppNav()
                }
            }
        }
    }
}

