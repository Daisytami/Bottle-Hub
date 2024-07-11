package net.ezra.ui.bottomnav

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import net.ezra.navigation.ROUTE_ACCOUNT
import net.ezra.navigation.ROUTE_COMMUNITY
import net.ezra.navigation.ROUTE_HOME

@Composable
fun AccountScreen(navController: NavHostController) {
    BackHandler {navController.navigate(ROUTE_HOME){
        popUpTo(ROUTE_ACCOUNT){
            inclusive = true} }

    }
}