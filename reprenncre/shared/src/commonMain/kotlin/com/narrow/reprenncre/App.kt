package com.narrow.reprenncre

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.narrow.reprenncre.theme.AppTheme
import com.narrow.reprenncre.theme.ColorFamily
import org.jetbrains.compose.resources.painterResource

import reprenncre.shared.generated.resources.Res
import reprenncre.shared.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    AppTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier.background(MaterialTheme.colorScheme.background)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting", style = TextStyle(color = MaterialTheme.colorScheme.primaryContainer))
                }
            }
        }
    }
}