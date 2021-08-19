package com.karimsinouh.bottomnavigationicons

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route:String,
    @StringRes val title:Int,
    val icon:ImageVector
){


    object Home:Screen("home",R.string.home, Icons.Rounded.Home)
    object Favorites:Screen("favorites",R.string.favorites,Icons.Rounded.Favorite)
    object Profile:Screen("profile",R.string.profile,Icons.Rounded.Person)
    object Settings:Screen("settings",R.string.settings,Icons.Rounded.Settings)

}
