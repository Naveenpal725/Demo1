package com.design.demo1

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.OvershootInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
                    ShippingCard(modifier = Modifier.fillMaxSize())
//                    ShippingCardPage(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun ShippingCard(modifier: Modifier) {
    Column(
        modifier = modifier
    ) {

    }
}

@Composable
fun ShippingCardPage(modifier: Modifier) {
    Column(
        modifier = modifier
    ) {

    }
}

@Preview(showBackground = true)
@Composable
private fun YourTaskPrev() {
    ShippingCard(modifier = Modifier.fillMaxSize())
//    ShippingCardPage(modifier = Modifier.fillMaxSize())
}


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimationComp() {
    var visible by rememberSaveable {
        mutableStateOf(false)
    }
    var isRound by rememberSaveable {
        mutableStateOf(false)
    }
    Column {
        Button(onClick = {
            visible = !visible
            isRound = !isRound
        }) {
            Text(text = "Toggle")
        }
//        val transition = updateTransition(targetState = isRound, label = null)
//        val borderR by transition.animateInt(
//            transitionSpec = { tween(2000) },
//            label = "",
//            targetValueByState = { isRound ->
//                if (isRound) 100 else 0
//            }
//            )
//         val color by transition.animateColor(
//             transitionSpec = {tween (1000)
//             },
//             label = "",
//         ) {isRound ->
//             if (isRound) Color.Red else Color.Green
//         }
//        val borderR by animateIntAsState(
//            targetValue = if (isRound) 40 else 20,
//            label = " ",
//            animationSpec = tween(100)
        //spring(Spring.DampingRatioHighBouncy, Spring.StiffnessLow)
        //tween(3000, 500)
//        )

//        val repeatable = rememberInfiniteTransition(label = "")
//        val color by repeatable.animateColor(
//            initialValue = Color.Red,
//            targetValue = Color.Green,
//            animationSpec = infiniteRepeatable(
//                animation = tween(2000),
//                repeatMode = RepeatMode.Reverse,
//            ),
//            label = ""
//        )
//        Box(
//            modifier = Modifier
//                .size(200.dp)
////                .clip(RoundedCornerShape(borderR))
//                .background(color)
//        )
//        AnimatedVisibility(
//            visible = visible,
//            enter = slideInHorizontally() + fadeIn(),
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(1f)
//        ) {
//            Box(modifier = Modifier.background(Color.Red))
//        }


//        AnimatedContent(
//            targetState = visible,
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(1f),
//            label = "",
//            transitionSpec = { slideInHorizontally(initialOffsetX = {
//                if (visible) it else -it
//            }) togetherWith slideOutHorizontally(
//                targetOffsetX = {
//                if (visible) -it else it
//                }
//            ) },
//        ) {isVisible ->
//            if (isVisible) {
//                Box(Modifier.background(Color.Red))
//            } else {
//                Box(Modifier.background(Color.Green))
//            }
//        }

    }
}


//
//@Composable
//fun YourTask() {
//// Implement a searching technique which will find the closest match in assending order
//    val list =
//        listOf("ayush", "naveen", "abhishek", "anubhaw", "aakash", "naal", "naali", "ashmaan")
//
//    // input = naa
//    // output should be = {"naal",,"naali","naveen"}
//
//    // Write your Code Here
//
//
//}


