package com.design.demo1

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.OvershootInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.animation.doOnEnd
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.design.demo1.ui.theme.Demo1Theme


class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition { // Splash Screen Shows Up until the condition is true
                !viewModel.isReady.value
            }
            setOnExitAnimationListener { splashScreens ->
                val zoomX = ObjectAnimator.ofFloat(
                    splashScreens.iconView,
                    View.SCALE_X,
                    0.6f,
                    0.0f
                )
                zoomX.interpolator = OvershootInterpolator()
                zoomX.duration = 500L
                zoomX.doOnEnd { splashScreens.remove() }
                val zoomY = ObjectAnimator.ofFloat(
                    splashScreens.iconView,
                    View.SCALE_Y,
                    0.6f,
                    0.0f
                )
                zoomY.interpolator = OvershootInterpolator()
                zoomY.duration = 500L
                zoomY.doOnEnd { splashScreens.remove() }

                zoomX.start()
                zoomY.start()
            }
        }
        setContent {
            Demo1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    YourTask()
                }
            }
        }
    }
}


@Composable
fun YourTask() {
// Implement a searching technique which will find the closest match in assending order
    val list =
        listOf("ayush", "naveen", "abhishek", "anubhaw", "aakash", "naal", "naali", "ashmaan")

    // input = naa
    // output should be = {"naal",,"naali","naveen"}

    // Write your Code Here


}


@Preview(showBackground = true)
@Composable
private fun YourTaskPrev() {
    YourTask()
}