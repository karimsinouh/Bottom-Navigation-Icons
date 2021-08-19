package com.karimsinouh.bottomnavigationicons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.mutableStateOf
import com.karimsinouh.bottomnavigationicons.ui.theme.BottomNavigationIconsTheme
import androidx.compose.ui.graphics.toArgb
import com.karimsinouh.bottomnavigationicons.ui.customComposables.CustomBottomNavigation

class MainActivity : ComponentActivity() {


    private val currentRoute= mutableStateOf(Screen.Home.route)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationIconsTheme {

                window.statusBarColor=MaterialTheme.colors.primary.toArgb()

                Scaffold(
                    bottomBar = {
                        CustomBottomNavigation(
                            selectedRoute = currentRoute.value,
                            onItemSelected = {
                                currentRoute.value=it.route
                            }
                        )
                    },
                    backgroundColor = MaterialTheme.colors.primary,
                    contentColor = MaterialTheme.colors.onSurface
                ) {

                }

            }
        }
    }
}

