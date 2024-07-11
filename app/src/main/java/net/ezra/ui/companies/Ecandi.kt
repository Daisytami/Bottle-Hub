package net.ezra.ui.companies

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.LocationOn
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_PRODUCT
import net.ezra.navigation.ROUTE_COMMUNITY
import net.ezra.navigation.ROUTE_ECANDI
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_VIEW_PROD

@Composable
fun EcandiScreen(navController: NavHostController) {
    BackHandler {navController.navigate(ROUTE_HOME){
        popUpTo(ROUTE_ECANDI){
            inclusive = true} }

    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background( color=(Color(0xffd1fcfa)),)
    ) {
        LazyColumn {
            item {
                Card(
                    colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .padding (all = 20.dp)
                        .height(300.dp)
                        .width(400.dp)
                )
                {
                    Box(
                        modifier = Modifier
                            .height(300.dp)
                    ) {

                              /*  Icon(
                                    Icons.AutoMirrored.Filled.ArrowBack,
                                    "backIcon",
                                    tint = Color.Black

                                        (onClick = {
                                        navController.navigate(ROUTE_HOME)
                                    })
                                )
                        androidx.compose.material3.Icon(Icons.Filled.ArrowBack, "backIcon",tint = Color.Black,)*/

                      Image(
                            painter = painterResource(id = R.drawable.eca),
                            contentScale = ContentScale.Crop,
                            contentDescription = "ecadi",
                            modifier = Modifier
                                .fillMaxSize()
                              //  .wrapContentSize(align = Alignment.Center)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ecadi),
                            contentScale = ContentScale.Crop,
                            contentDescription = "ecadi",
                            modifier = Modifier
                                .fillMaxSize()
                             .wrapContentSize(align = Alignment.Center)
                        )
                    }
                }

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

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.padding(12.dp)
                ) {
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Card(
                                shape = RoundedCornerShape(16.dp),
                                colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp)
                                    .offset(y = 8.dp) // Slightly elevate the card
                            ) {
                                Column {
                                    Image(
                                        painter = painterResource(id = R.drawable.bottle10),  // Use the image you uploaded
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .height(300.dp)
                                            .fillMaxWidth()
                                            .clip(
                                                RoundedCornerShape(
                                                    topStart = 16.dp,
                                                    topEnd = 16.dp
                                                )
                                            )
                                    )
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(12.dp)
                                            .clip(
                                                RoundedCornerShape(
                                                    bottomStart = 16.dp,
                                                    bottomEnd = 16.dp
                                                )
                                            )
                                    ) {
                                        Text(
                                            text = "10 Liter Plastic Bottle",
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = " 10 Bottles for 300 Ksh",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Row {
                                        Text(
                                            text = "Plastic Color:",
                                            fontSize = 16.sp,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        listOf("Blue", "Green").forEach { color ->
                                            Text(
                                                text = color,
                                                fontSize = 16.sp,
                                                color = Color.Gray,
                                                modifier = Modifier.padding(end = 8.dp)
                                            )
                                        }
                                    }
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Row {
                                        Text(
                                            text = "Quantity:",
                                            fontSize = 16.sp,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = "5",
                                            fontSize = 16.sp,
                                            color = Color.Gray
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(12.dp))
                                    Button(
                                        onClick = {
                                            navController.navigate(ROUTE_ADD_PRODUCT) {
                                                popUpTo(ROUTE_ECANDI) { inclusive = true }
                                            }
                                         },
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xff13818B
                                            )
                                        ),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(bottom =10.dp)
                                            .height(48.dp)
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
                    }
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Card(
                                shape = RoundedCornerShape(16.dp),
                                colors = CardDefaults.cardColors(Color(0xffbcbcbc)),//0xffA9F8F6)),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp)
                                    .offset(y = 8.dp) // Slightly elevate the card
                            ) {
                                Column {
                                    Image(
                                        painter = painterResource(id = R.drawable.bottle2large),  // Use the image you uploaded
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .height(300.dp)
                                            .fillMaxWidth()
                                            .clip(
                                                RoundedCornerShape(
                                                    topStart = 16.dp,
                                                    topEnd = 16.dp
                                                )
                                            )
                                    )
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(12.dp)
                                            .clip(
                                                RoundedCornerShape(
                                                    bottomStart = 16.dp,
                                                    bottomEnd = 16.dp
                                                )
                                            )
                                    ) {
                                        Text(
                                            text = "3-5 Liter Plastic Bottle",
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = "  8 Bottles for 300 Ksh",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Row {
                                        Text(
                                            text = "Plastic Color:",
                                            fontSize = 16.sp,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        listOf("Blue", "Green").forEach { color ->
                                            Text(
                                                text = color,
                                                fontSize = 16.sp,
                                                color = Color.Gray,
                                                modifier = Modifier.padding(end = 8.dp)
                                            )
                                        }
                                    }
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Row {
                                        Text(
                                            text = "Quantity:",
                                            fontSize = 16.sp,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = "5",
                                            fontSize = 16.sp,
                                            color = Color.Gray
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(12.dp))
                                    Button(
                                        onClick = { navController.navigate(ROUTE_ADD_PRODUCT) {
                                            popUpTo(ROUTE_ECANDI) { inclusive = true }
                                        } },
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xff13818B
                                            )
                                        ),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(bottom =10.dp)
                                            .height(48.dp)
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
                    }
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Card(
                                shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp)
                                    .offset(y = 8.dp) // Slightly elevate the card
                            ) {
                                Column {
                                    Image(
                                        painter = painterResource(id = R.drawable.trial12l),  // Use the image you uploaded
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .height(300.dp)
                                            .fillMaxWidth()
                                            .clip(
                                                RoundedCornerShape(
                                                    topStart = 16.dp,
                                                    topEnd = 16.dp
                                                )
                                            )
                                    )
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(12.dp)
                                            .clip(
                                                RoundedCornerShape(
                                                    bottomStart = 16.dp,
                                                    bottomEnd = 16.dp
                                                )
                                            )
                                    ) {
                                        Text(
                                            text = "1-2 Liter Plastic Bottle",
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = " 10 Bottles for 300 Ksh",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Row {
                                        Text(
                                            text = "Plastic Color:",
                                            fontSize = 16.sp,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        listOf("Blue", "Green").forEach { color ->
                                            Text(
                                                text = color,
                                                fontSize = 16.sp,
                                                color = Color.Gray,
                                                modifier = Modifier.padding(end = 8.dp)
                                            )
                                        }
                                    }
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Row {
                                        Text(
                                            text = "Quantity:",
                                            fontSize = 16.sp,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = "5",
                                            fontSize = 16.sp,
                                            color = Color.Gray
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(12.dp))
                                    Button(
                                        onClick = { navController.navigate(ROUTE_ADD_PRODUCT) {
                                            popUpTo(ROUTE_ECANDI) { inclusive = true }
                                        }
                                                  },
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xff13818B
                                            )
                                        ),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(bottom =10.dp)
                                            .height(48.dp)
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
                    }
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp)
                        ) {
                            Card(
                                shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(Color(0xffbcbcbc)),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp)
                                    .offset(y = 8.dp) // Slightly elevate the card
                            ) {
                                Column {
                                    Image(
                                        painter = painterResource(id = R.drawable.ml500),  // Use the image you uploaded
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .height(300.dp)
                                            .fillMaxWidth()
                                            .clip(
                                                RoundedCornerShape(
                                                    topStart = 16.dp,
                                                    topEnd = 16.dp
                                                )
                                            )
                                            .align(Alignment.CenterHorizontally)
                                    )
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(12.dp)
                                            .clip(
                                                RoundedCornerShape(
                                                    bottomStart = 16.dp,
                                                    bottomEnd = 16.dp
                                                )
                                            )
                                    ) {
                                        Text(
                                            text = "500-200 ML Plastic Bottle",
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = " 10 Bottles for 300 Ksh",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Row {
                                        Text(
                                            text = "Plastic Color:",
                                            fontSize = 16.sp,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        listOf("Blue", "Green").forEach { color ->
                                            Text(
                                                text = color,
                                                fontSize = 16.sp,
                                                color = Color.Gray,
                                                modifier = Modifier.padding(end = 8.dp)
                                            )
                                        }
                                    }
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Row {
                                        Text(
                                            text = "Quantity:",
                                            fontSize = 16.sp,
                                            color = Color.Black
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = "5",
                                            fontSize = 16.sp,
                                            color = Color.Gray
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(12.dp))
                                    Button(
                                        onClick = { navController.navigate(ROUTE_ADD_PRODUCT) {
                                            popUpTo(ROUTE_ECANDI) { inclusive = true }
                                        } },
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(
                                                0xff13818B
                                            )
                                        ),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(bottom =10.dp)
                                            .height(48.dp)
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
                            text = "PET bottles, HDPE containers, plastic Bottles",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Contact Information",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier
                                .size(16.dp),
                                    color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(8.dp))
                        Row {
                            Icon(
                                imageVector = Icons.Filled.Call,
                                contentDescription = "",

                                modifier = Modifier.size(16.dp)
                            )
                            Text(
                                text = "Phone number: +254 730 000 001",
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color.Black
                            )
                        }
                        Row {
                            Icon(
                                imageVector = Icons.Filled.Email,
                                contentDescription = "",
                              //  tint = Color(0xFF08f3d1),
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                            )
                            Text(
                                text = "Email: ecandi@gmail.com",
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color.Black
                            )
                        }
                        Row {
                            Icon(
                                imageVector = Icons.Filled.CheckCircle,
                                contentDescription = "",
                                //tint = Color(0xFF08f3d1),
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                            )
                            Text(
                                text = "Website:ecandi.co.ke ",
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier
                                    .size(16.dp),
                                   // .clickable { ecandi.co.ke },

                                color = Color.Black
                            )
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.insta),
                                contentDescription = "instagram",
                                modifier = Modifier
                                    .size(30.dp)
                                    .clickable { /* Handle click */ },

                                )

                            Spacer(modifier = Modifier.width(30.dp))
                            Image(
                                painter = painterResource(id = R.drawable.face),
                                contentDescription = "facebook",
                                modifier = Modifier
                                    .size(30.dp)
                                    .clickable { /* Handle click */ },
                               // colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                                //    Color.Black
                               // )
                            )
                            Spacer(modifier = Modifier.width(30.dp))
                            Image(
                                painter = painterResource(id = R.drawable.twiter),
                                contentDescription = "twitter",
                                modifier = Modifier
                                    .size(30.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                                    Color.Black
                                )
                            )
                            Spacer(modifier = Modifier.width(30.dp))
                            Image(
                                painter = painterResource(id = R.drawable.what),
                                contentDescription = "Whatsapp",
                                modifier = Modifier
                                    .size(30.dp)
                                    .clickable { /* Handle click */ },
                                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                                    Color.Black
                                )
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Drop off Location",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Taifa road,beside KCB bank",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Open on Monday to Friday, 8 AM to 4 PM",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Black
                        )


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



















