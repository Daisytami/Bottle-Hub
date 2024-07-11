package net.ezra.ui.companies

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_PRODUCT
import net.ezra.navigation.ROUTE_ECANDI
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MR_GREEN
import net.ezra.navigation.ROUTE_VIEW_PROD

@Composable
fun GreenScreen(navController: NavHostController) {
    BackHandler {navController.navigate(ROUTE_HOME){
        popUpTo(ROUTE_MR_GREEN){
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
                            painter = painterResource(id = R.drawable.mrg),
                            contentScale = ContentScale.Crop,
                            contentDescription = "mr green",
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


        }
    }
}