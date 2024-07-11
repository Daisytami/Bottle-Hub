package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignUpScreen
import net.ezra.ui.bottomnav.AccountScreen
import net.ezra.ui.bottomnav.CommunityScreen
import net.ezra.ui.bottomnav.MoreScreen
import net.ezra.ui.companies.EcandiScreen
import net.ezra.ui.companies.GreenScreen
import net.ezra.ui.companies.PureScreen
import net.ezra.ui.companies.TakatakaScreen
import net.ezra.ui.dashboard.DashboardScreen
//import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.products.AddProductScreen
import net.ezra.ui.products.ProductDetailScreen
import net.ezra.ui.products.ProductListScreen
import net.ezra.ui.products.UpdateProductScreen
import net.ezra.ui.students.AddStudents
import net.ezra.ui.students.Search
import net.ezra.ui.students.Students

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME


) {


    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }


        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_VIEW_STUDENTS) {
           Students(navController = navController, viewModel = viewModel() )
        }

        composable(ROUTE_SEARCH) {
            Search(navController)
        }

        composable(ROUTE_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUTE_REGISTER) {
           SignUpScreen(navController = navController) {

           }
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController){}
        }

        composable(ROUTE_ADD_PRODUCT) {
            AddProductScreen(navController = navController){}
        }

        composable(ROUTE_VIEW_PROD) {
            ProductListScreen(navController = navController, products = listOf() )
        }


        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController, productId)
        }

        composable(ROUTE_ECANDI) {
            EcandiScreen(navController)
        }
        composable(ROUTE_PURE) {
            PureScreen(navController)
        }
        composable(ROUTE_MR_GREEN) {
            GreenScreen(navController)
        }
        composable(ROUTE_TAKATAKA) {
            TakatakaScreen(navController)
        }
        composable(ROUTE_COMMUNITY) {
            CommunityScreen(navController)
        }
        composable(ROUTE_MORE) {
            MoreScreen(navController)
        }
        composable(ROUTE_ACCOUNT) {
            AccountScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT) {
            AccountScreen(navController)
        }












    }
}









