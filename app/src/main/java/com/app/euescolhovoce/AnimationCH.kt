package com.app.euescolhovoce

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.*

@Composable
fun AnimationTh(navController: NavController, image: Int) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.mybau))
    val progress by animateLottieCompositionAsState(composition = composition, speed = 6f)
    var isAnimationComplete by remember { mutableStateOf(false) }

    Scaffold(){ innerPadding ->

        LaunchedEffect(progress) {
            if (progress == 1f) {
                isAnimationComplete = true
            }
        }

        Box(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
            if (isAnimationComplete) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .graphicsLayer {
                            alpha = 0.8f // Transparência do fundo
                        }
                        .background(Color.Transparent.copy(alpha = 0.1f))
                )

                // Carta sobreposta
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.Center)
                        .background(Color.Transparent).clickable {
                   navController.navigate("Main")
                        } // Cor de fundo da carta
                ) {
                    Image(
                        painter = painterResource(id = image),
                        contentDescription = "Imagem da Carta",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            } else {
                // Exibe a animação
                LottieAnimation(
                    composition = composition,
                    progress = { progress },
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }

}
