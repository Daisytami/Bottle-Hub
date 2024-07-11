package net.ezra.ui.bottomnav

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import net.ezra.navigation.ROUTE_COMMUNITY
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MORE

@Composable
fun MoreScreen(navController: NavHostController) {
    BackHandler {navController.navigate(ROUTE_HOME){
        popUpTo(ROUTE_MORE){
            inclusive = true} }

    }
}