package com.example.borutoapp.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.borutoapp.R
import com.example.borutoapp.ui.theme.Purple200
import com.example.borutoapp.ui.theme.Purple500
import com.example.borutoapp.ui.theme.Purple700
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.draw.rotate

@Composable
fun SplashScreen(navController: NavHostController) {
    val rotate = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true) {
        rotate.animateTo(
            targetValue = 360f,
            animationSpec = tween(
                durationMillis = 1000,
                delayMillis = 200
            )
        )
    }

    Splash(rotate = rotate.value)
}

@Composable
fun Splash(rotate: Float) {
    if (isSystemInDarkTheme()) {
        Box(
            modifier = Modifier
                .background(Color.Black)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.rotate(degrees = rotate),
                painter = painterResource(id = R.drawable.ic_baseline_view_in_ar_24),
                contentDescription = "App logo"
            )
        }
    } else {
        Box(
            modifier = Modifier
                .background(Brush.verticalGradient(listOf(Purple700, Purple500, Purple200)))
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.rotate(degrees = rotate),
                painter = painterResource(id = R.drawable.ic_baseline_view_in_ar_24),
                contentDescription = "App logo"
            )
        }
    }

}
//
//@Composable
//@Preview
//fun SplashScreenPreview() {
//    Splash(0f)
//}