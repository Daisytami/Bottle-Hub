package net.ezra.ui.companies

import android.content.Intent
import android.net.Uri
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_PRODUCT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_ECANDI
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MR_GREEN
import net.ezra.navigation.ROUTE_PURE
import net.ezra.navigation.ROUTE_REGISTER
import net.ezra.navigation.ROUTE_UPDATE_PRODUCT
import net.ezra.navigation.ROUTE_VIEW_PROD


@Composable
fun PureScreen(navController: NavHostController) {
    BackHandler {navController.navigate(ROUTE_HOME){
        popUpTo(ROUTE_PURE){
            inclusive = true} }

    }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn {
            item {
                Card(
                    colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth()
                        .padding(all = 30.dp)
                        .align(Alignment.CenterEnd)
                )
                {
                    Box(
                        modifier = Modifier
                            .height(200.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.purep),
                            contentScale = ContentScale.Crop,
                            contentDescription = "pure",
                            modifier = Modifier
                                .width(200.dp)
                                .height(200.dp)
                            //  .wrapContentSize(align = Alignment.Center)
                        )

                    }
                }
            }
            //lazy row showcasing the companies'look
            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.padding(12.dp)
                ) {
                    item {
                        Card(
                            shape = RoundedCornerShape(2.dp),
                            modifier = Modifier
                                .height(200.dp)
                                .width(300.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.chapo),
                                    contentScale = ContentScale.Crop,
                                    contentDescription = "chapo",
                                    modifier = Modifier
                                        .fillMaxSize()
                                )
                            }
                        }
                    }

                    item {
                        Card(
                            shape = RoundedCornerShape(2.dp),
                            modifier = Modifier
                                .height(200.dp)
                                .width(300.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.commbin),
                                    contentScale = ContentScale.Crop,
                                    contentDescription = "commbin",
                                    modifier = Modifier
                                        .fillMaxSize()
                                )
                            }
                        }
                    }

                    item {
                        Card(
                            shape = RoundedCornerShape(2.dp),
                            modifier = Modifier
                                .height(200.dp)
                                .width(300.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp)
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.recycling),
                                    contentScale = ContentScale.Crop,
                                    contentDescription = "recycling",
                                    modifier = Modifier
                                        .fillMaxSize()
                                )
                            }
                        }
                    }
                }
            }

            item {
                Card(
                    colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .height(200.dp)
                        .width(400.dp)
                        .padding(all = 30.dp)
                        .align(Alignment.Center)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                            .clip(
                                RoundedCornerShape(
                                    bottomStart = 20.dp,
                                    bottomEnd = 20.dp
                                )
                            )
                    ) {
                        Text(
                            text = "500-200 ML Plastic Bottle",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = " Quantity : 10 Bottles for 300 Ksh",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(12.dp)) // Reduced height here
                        Button(
                            onClick = {
                                navController.navigate(ROUTE_ADD_PRODUCT) {
                                    popUpTo(ROUTE_ECANDI) { inclusive = true }
                                }
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xff13818B)
                            ),
                            modifier = Modifier
                                .width(200.dp)
                                .height(40.dp)
                                .align(Alignment.CenterHorizontally)
                        ) {
                            Text(
                                text = "ADD TO CART",
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .height(200.dp)
                        .width(400.dp)
                        .padding(all = 30.dp)
                        .align(Alignment.Center)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                            .clip(
                                RoundedCornerShape(
                                    bottomStart = 20.dp,
                                    bottomEnd = 20.dp
                                )
                            )
                    ) {
                        Text(
                            text = "1-2 Liter Plastic Bottle",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = " Quantity : 10 Bottles for 300 Ksh",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(12.dp)) // Reduced height here
                        Button(
                            onClick = {
                                navController.navigate(ROUTE_ADD_PRODUCT) {
                                    popUpTo(ROUTE_ECANDI) { inclusive = true }
                                }
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xff13818B)
                            ),
                            modifier = Modifier
                                .width(200.dp)
                                .height(40.dp)
                                .align(Alignment.CenterHorizontally)
                        ) {
                            Text(
                                text = "ADD TO CART",
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .height(200.dp)
                        .width(400.dp)
                        .padding(all = 30.dp)
                        .align(Alignment.Center)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                            .clip(
                                RoundedCornerShape(
                                    bottomStart = 20.dp,
                                    bottomEnd = 20.dp
                                )
                            )
                    ) {
                        Text(
                            text = " 3-5 Liter Plastic Bottle",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = " Quantity : 10 Bottles for 300 Ksh",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(12.dp)) // Reduced height here
                        Button(
                            onClick = {
                                navController.navigate(ROUTE_ADD_PRODUCT) {
                                    popUpTo(ROUTE_ECANDI) { inclusive = true }
                                }
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xff13818B)
                            ),
                            modifier = Modifier
                                .width(200.dp)
                                .height(40.dp)
                                .align(Alignment.CenterHorizontally)
                        ) {
                            Text(
                                text = "ADD TO CART",
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }

            item {
                Card(
                    colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .height(200.dp)
                        .width(400.dp)
                        .padding(all = 30.dp)
                        .align(Alignment.Center)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                            .clip(
                                RoundedCornerShape(
                                    bottomStart = 20.dp,
                                    bottomEnd = 20.dp
                                )
                            )
                    ) {
                        Text(
                            text = "10 Liter Plastic Bottle",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = " Quantity : 10 Bottles for 300 Ksh",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(12.dp)) // Reduced height here
                        Button(
                            onClick = {
                                navController.navigate(ROUTE_ADD_PRODUCT) {
                                    popUpTo(ROUTE_ECANDI) { inclusive = true }
                                }
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xff13818B)
                            ),
                            modifier = Modifier
                                .width(200.dp)
                                .height(40.dp)
                                .align(Alignment.CenterHorizontally)
                        ) {
                            Text(
                                text = "ADD TO CART",
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    // elevation = 8.dp,

                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = "Accepted Materials",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "PET bottles, HDPE containers, plastic utensils",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Contact Information",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(8.dp))
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.savedb),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Black)
                            )
                            Text(
                                text = "Phone number: +254 700 000 000",
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color.Black
                            )
                        }
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.savedb),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Black)
                            )
                            Text(
                                text = "Email: example@example.com",
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color.Black
                            )
                        }
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.savedb),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Black)
                            )
                            Text(
                                text = "Social Media: @recyclingcenter",
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color.Black
                            )
                        }



                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.savedb),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                                    Color.Black
                                )
                            )
                            Image(
                                painter = painterResource(id = R.drawable.savedb),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                                    Color.Black
                                )
                            )
                            Image(
                                painter = painterResource(id = R.drawable.savedb),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                                    Color.Black
                                )
                            )
                            Image(
                                painter = painterResource(id = R.drawable.savedb),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                                    Color.Black
                                )
                            )
                        }


                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Operating Hours",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Monday to Friday, 8 AM to 5 PM",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Black
                        )
                    }
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xff5faab1)),
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

                                //  callLauncher.launch(intent)
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
                        color = Color.Black
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
                        color = Color.Black
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
                        color = Color.Black
                    )

                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_DASHBOARD) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "Dashboard",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.Black
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
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_UPDATE_PRODUCT) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "Update Products",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "You're welcome",
                        fontSize = 30.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_REGISTER) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "Register",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_LOGIN) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "login ",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
            }
        }

        }
    }


