package com.zephyr.vpn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF08111F)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "ZEPHYR VPN",
                            color = Color.White,
                            style = MaterialTheme.typography.headlineLarge
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Secure connection",
                            color = Color(0xFF48B8FF)
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        Button(onClick = {}) {
                            Text("CONNECT")
                        }
                    }
                }
            }
        }
    }
}
