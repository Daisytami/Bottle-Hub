package net.ezra.ui.home
import android.annotation.SuppressLint
import android.content.Intent
import androidx.activity.compose.BackHandler
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

import net.ezra.R
import net.ezra.navigation.ROUTE_COMMUNITY
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_ECANDI
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MR_GREEN
import net.ezra.navigation.ROUTE_PURE
import net.ezra.navigation.ROUTE_TAKATAKA
import net.ezra.navigation.ROUTE_VIEW_PROD


data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    var isDrawerOpen by remember { mutableStateOf(false) }

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }
    BackHandler {navController.navigate(ROUTE_HOME){
        popUpTo(ROUTE_MR_GREEN){
            inclusive = true} }

    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.bottle),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier.padding(12.dp)
                    )
                },

                navigationIcon = {
                    androidx.compose.material.IconButton(onClick = {
                        navController.navigate(ROUTE_VIEW_PROD)
                    }) {
                        androidx.compose.material.Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            "backIcon",
                            tint =Color(0xff0A3942)
                        )
                    }
                },
               /* navigationIcon = {
                    if (!isDrawerOpen) {
                        IconButton(onClick = { isDrawerOpen = true }) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = "Menu",
                                tint = Color.Black
                            )
                        }
                    }
                },*/
                actions = {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            tint = Color(0xff0A3942)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xffa9f8f6),
                    titleContentColor = Color.Black,
                )
            )
        },
        bottomBar = {
            BottomBar(navController = navController)
        },

        content = {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = (Color(0xffffffff)))
                    .clickable {
                        if (isDrawerOpen) {
                            isDrawerOpen = false
                        }
                    }//   color = (Color(0xff5D5D5D)),
            ) {
                LazyColumn {
                    item{
                Card(
                colors = CardDefaults.cardColors(Color(0xffD5E8F8)),
                shape = RoundedCornerShape(2.dp),
                modifier = Modifier
                .height(200.dp)
                    .padding(top=100.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
                .fillMaxWidth(),
                ) {
                    Box(
                        modifier = Modifier
                            .height(200.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.algea),
                            contentScale = ContentScale.Crop,
                            contentDescription = "gigi",
                            modifier = Modifier
                                .fillMaxSize(),
                        )
                        Text(
                            text = "Go Green",
                            color = Color.White,
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                        )
                    }
                }

                        Spacer(modifier = Modifier
                            .size(10.dp))

                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier.padding(horizontal = 12.dp)
                        ) {
                            item {
                                Card(
                                    shape = RoundedCornerShape(2.dp),
                                    modifier = Modifier
                                        .height(200.dp)
                                        .width(300.dp),

                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(200.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.river), // Replace with your actual drawable resource ID
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "clean river",
                                            modifier = Modifier
                                                .fillMaxSize()
                                        )
                                        Text(
                                            text = "Recycle and Earn with BottleHub!",
                                            color = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.Center))
                                    }
                                }
                            }
                            item {
                                Card(
                                    shape = RoundedCornerShape(2.dp),
                                    modifier = Modifier
                                        .height(200.dp)
                                        .width(300.dp),
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(200.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.commbin), // Replace with your actual drawable resource ID
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "people helping to recycle",
                                            modifier = Modifier
                                                .fillMaxSize()
                                        )

                                        Text(
                                            text = "Join the movement. Reduce plastic waste, together.",
                                            color = Color.Black,
                                            modifier = Modifier
                                                .align(Alignment.BottomCenter))
                                    }
                                }
                            }
                            item {
                                Card(
                                    shape = RoundedCornerShape(2.dp),

                                    modifier = Modifier

                                        .height(200.dp)
                                        .width(300.dp),

                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(200.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.recycling), // Replace with your actual drawable resource ID
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "circle of recycle",
                                            modifier = Modifier
                                                .fillMaxSize()

                                        )
                                        Text(
                                            text = "Give your bottles a second life. Choose BottleHub",
                                            color = Color.Black,
                                            modifier = Modifier
                                                .align(Alignment.BottomCenter))
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier
                            .size(10.dp))

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                Card(
                                    shape = RoundedCornerShape(15.dp),
                                    colors = CardDefaults.cardColors(Color(0xffA9F8F6)),
                                    modifier = Modifier
                                        .size(180.dp)
                                        .padding(start = 10.dp)
                                ) {
                                    Box(modifier = Modifier
                                        .height(200.dp),
                                    )

                                    {
                                        Image(
                                            painter = painterResource(id = R.drawable.eca),
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "limuru recycling",
                                            modifier = Modifier
                                                .size(150.dp)
                                                .clickable {
                                                    navController.navigate(ROUTE_ECANDI) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                                    }
                                                }
                                        )
                                        Text(
                                            text = "ECANDI",
                                            color = Color.Black,
                                            modifier = Modifier
                                                .align(Alignment.BottomCenter))

                                    }
                                }

                                Card(
                                    shape = RoundedCornerShape(15.dp),
                                    colors = CardDefaults.cardColors(Color(0xffA9F8F6)),
                                    modifier = Modifier
                                        .size(180.dp)
                                        //.background( color=(Color(0xffA9F8F6)),)

                                ) {
                                    Box(modifier = Modifier.height(200.dp)) {
                                        Image(

                                            painter = painterResource(id = R.drawable.mrgreen),
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "Mr green",
                                            modifier = Modifier
                                                .size(150.dp)
                                                .align(alignment = Alignment.Center)
                                                .clickable {
                                                    navController.navigate(ROUTE_MR_GREEN) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                                    }
                                                },
                                        )
                                        Text(
                                            text = "MR. GREEN AFRICA ",
                                            color = Color.Black,
                                            modifier = Modifier
                                                .align(Alignment.BottomCenter))
                                    }
                                }
                            }

                            Row(
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                Card(
                                    shape = RoundedCornerShape(15.dp),
                                    colors = CardDefaults.cardColors(Color(0xffA9F8F6)),
                                    modifier = Modifier
                                        .size(180.dp)
                                        .padding(start = 10.dp)
                                ) {
                                    Box(modifier = Modifier.height(200.dp)) {
                                        Image(
                                            painter = painterResource(id = R.drawable.takak),
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "TAKATAKA",
                                            modifier = Modifier
                                                .size(150.dp)

                                                .clickable {
                                                    navController.navigate(ROUTE_TAKATAKA) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                                    }
                                                },
                                        )
                                        Text(
                                            text = "",
                                            color = Color.Black,
                                            modifier = Modifier
                                                .align(Alignment.BottomCenter))


                                    }
                                }
                                //.background(Color(0xff6df3f1))

                                Card(
                                    shape = RoundedCornerShape(15.dp),
                                    colors = CardDefaults.cardColors(Color(0xffA9F8F6)),
                                    modifier = Modifier
                                        .size(180.dp)



                                ) {
                                    Box(modifier = Modifier.height(200.dp)) {
                                        Image(
                                            painter = painterResource(id = R.drawable.pureplanet),
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "gigi",
                                            modifier = Modifier
                                                .size(220.dp)
                                                .clickable {
                                                    navController.navigate(ROUTE_PURE) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                                    }
                                                },
                                        )
                                        Text(
                                            text = "",
                                            color = Color.Black,
                                            modifier = Modifier
                                                .align(Alignment.BottomCenter))
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier
                            .size(10.dp))

                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier.padding(horizontal = 12.dp)
                        ) {
                            item {
                                Card(
                                    shape = RoundedCornerShape(2.dp),
                                    modifier = Modifier
                                        .height(200.dp)
                                        .width(300.dp),

                                    ) {
                                    Box(
                                        modifier = Modifier
                                            .height(200.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.algea), // Replace with your actual drawable resource ID
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "clean river",
                                            modifier = Modifier
                                                .fillMaxSize()
                                        )
                                        Text(
                                            text = "Why we need to save the environment",
                                            color = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.Center)
                                        )
                                    }
                                }
                            }
                            item {
                                Card(
                                    shape = RoundedCornerShape(2.dp),
                                    modifier = Modifier
                                        .height(200.dp)
                                        .width(300.dp),
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(200.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.save), // Replace with your actual drawable resource ID
                                            contentScale = ContentScale.Crop,
                                            contentDescription = "people helping to recycle",
                                            modifier = Modifier
                                                .fillMaxSize()
                                        )

                                        Text(
                                            text = "They are plenty and we are the solutions.",
                                            color = Color.Black,
                                            modifier = Modifier
                                                .align(Alignment.BottomCenter)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    )

   AnimatedDrawer(
        isOpen = isDrawerOpen,
        onClose = { isDrawerOpen = false }
    )
}


@Composable
fun AnimatedDrawer(isOpen: Boolean, onClose: () -> Unit) {
    val drawerWidth = remember { Animatable(if (isOpen) 250f else 0f) }

    LaunchedEffect(isOpen) {
        drawerWidth.animateTo(if (isOpen) 250f else 0f, animationSpec = tween(durationMillis = 300))
    }

    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(drawerWidth.value.dp)
           ,
       color = Color(0xff4A4D4D),
        //elevation = 16.dp
    ) {
        Column {

            Text(
                text = "Drawer Item 2"
            )
            Text(
                text = "Drawer Item 3",
              modifier = Modifier.clickable {  }
            )
            Spacer(modifier = Modifier.height(16.dp))
            //Text(text = stringResource(id = R.string.developer))

        }

    }
}






@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color(0xffa9f8f6)


    ) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"", tint = Color(0xff0A3942))
        },
            label = { Text(text = "Home",color =  Color.Black) }, selected = (selectedIndex.value == 0), onClick =
            {navController.navigate(ROUTE_DASHBOARD) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person,"",tint = Color(0xff0A3942))
        },
            label = { Text(text = "Community",color =  Color.Black) }, selected = (selectedIndex.value == 1),
            onClick = {navController.navigate(ROUTE_COMMUNITY) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }

            })

       /* BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person,"", tint =Color(0xff0A3942))
        },
            label = { Text(text = "Account",color =  Color.Black) }, selected = (selectedIndex.value == 0),
            onClick = {navController.navigate(ROUTE_ACCOUNT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }

            })*/
//add rewards instead of more
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.ExitToApp,"", tint = Color(0xff0A3942))
        },
            label = { Text(text ="View Items",color =  Color.Black) }, selected = (selectedIndex.value == 0), onClick =
            {navController.navigate(ROUTE_VIEW_PROD) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }

            })

       /* BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "",tint = Color.White)
        },
            label = { Text(
                text = "Students",
                color =  Color.White) },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(ROUTE_SEARCH) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })
             BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.ShoppingCart,"", tint = Color.White)
        },
            label = { Text(text = "Home",color =  Color.White) }, selected = (selectedIndex.value == 0), onClick = {

            })*/

        /* Column(
                           modifier = Modifier
                               .fillMaxSize()
                               .background(Color(dfhx)),
                           verticalArrangement = Arrangement.Center,
                           horizontalAlignment = Alignment.CenterHorizontally
                       ) {

                           Text(
                               text = stringResource(id = R.string.call),
                               fontSize = 20.sp,
                               modifier = Modifier
                                   .padding(16.dp)
                                   .clickable {

                                       val intent = Intent(Intent.ACTION_DIAL)
                                       intent.data = Uri.parse("tel:+254796759850")

                                       callLauncher.launch(intent)
                                   }
                           )

                           Text(
                               text = stringResource(id = R.string.developer),
                               fontSize = 20.sp,
                           )

                           Spacer(modifier = Modifier.height(15.dp))

                           Text(
                               modifier = Modifier

                                   .clickable {
                                       navController.navigate(ROUTE_LOGIN) {
                                           popUpTo(ROUTE_HOME) { inclusive = true }
                                       }
                                   },
                               text = "Login Here",
                               textAlign = TextAlign.Center,
                               fontSize = 20.sp,
                               color = MaterialTheme.colorScheme.onSurface
                           )



                           Text(
                               modifier = Modifier

                                   .clickable {
                                       navController.navigate(ROUTE_ADD_PRODUCT) {
                                           popUpTo(ROUTE_HOME) { inclusive = true }
                                       }
                                   },
                               text = "Add Products",
                               textAlign = TextAlign.Center,
                               fontSize = 20.sp,
                               color = MaterialTheme.colorScheme.onSurface
                           )

                           Text(
                               modifier = Modifier

                                   .clickable {
                                       navController.navigate(ROUTE_ADD_STUDENTS) {
                                           popUpTo(ROUTE_HOME) { inclusive = true }
                                       }
                                   },
                               text = "Add Students",
                               textAlign = TextAlign.Center,
                               fontSize = 20.sp,
                               color = MaterialTheme.colorScheme.onSurface
                           )

                           Text(
                               modifier = Modifier

                                   .clickable {
                                       navController.navigate(ROUTE_VIEW_PROD) {
                                           popUpTo(ROUTE_HOME) { inclusive = true }
                                       }
                                   },
                               text = "view Products",
                               textAlign = TextAlign.Center,
                               fontSize = 20.sp,
                               color = MaterialTheme.colorScheme.onSurface
                           )



                           Spacer(modifier = Modifier.height(15.dp))

                           Text(
                               text = "You're welcome",
                               fontSize = 30.sp,
                               color = Color.White
                           )



                       }*/
    }
}
//                    LazyColumn {
//                        item {
//                            Image(
//                                painter = painterResource(id = R.drawable.bottlo),
//                                contentDescription = "gigi",
//                                modifier = Modifier
//                                    .height(200.dp)
//                                    .width(400.dp),
//                            )
//                            Spacer(
//                                modifier = Modifier
//                                    .width(10.dp)
//                            )
//                            Image(
//                                painter = painterResource(id = R.drawable.bottlo),
//                                contentDescription = "gigi",
//                                modifier = Modifier
//                                    .height(200.dp)
//                                    .width(400.dp),
//                            )
//                            Spacer(
//                                modifier = Modifier
//                                    .width(10.dp)
//                            )
//                            Image(
//                                painter = painterResource(id = R.drawable.bottlo),
//                                contentDescription = "gigi",
//                                modifier = Modifier
//                                    .height(200.dp)
//                                    .width(400.dp),
//                            )
//                            Spacer(
//                                modifier = Modifier
//                                    .width(10.dp)
//                            )
//                        }
//                    }
