package net.ezra.ui.bottomnav

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.TopAppBar
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.ezra.R
import net.ezra.navigation.ROUTE_COMMUNITY
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MR_GREEN



@Composable
fun CommunityScreen(navController: NavHostController) {
    var searchText by remember { mutableStateOf("") }

    BackHandler {
        navController.navigate(ROUTE_HOME) {
            popUpTo(ROUTE_COMMUNITY) {
                inclusive = true
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xfff3f6f4))
    ) {
        LazyColumn(
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            item {
                TopAppBar(
                    backgroundColor = Color.White,
                    elevation = 0.dp,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_4),
                            contentDescription = "Profile",
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(Color.Gray),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))

                            TextField(
                                value = searchText,
                                onValueChange = { searchText = it },
                                placeholder = { Text(text = "Search", color = Color.Black) },
                                modifier = Modifier
                                    .weight(1f)
                                    .height(52.dp)
                                    .background(Color(0xFFEFEFEF), CircleShape)
                                    .padding(horizontal = 8.dp),
                                colors = TextFieldDefaults.textFieldColors(
                                    backgroundColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent
                                ),
                                singleLine = true,
                                shape = CircleShape,
                                textStyle = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp
                                )
                            )

                            Spacer(modifier = Modifier.width(8.dp))

                            IconButton(
                                onClick = { /* TODO: Handle notification click */ },
                                modifier = Modifier
                                    .background(Color(0xFFEFEFEF), CircleShape)
                                    .size(48.dp)
                            ) {
                                Icon(
                                    Icons.Filled.Notifications,
                                    contentDescription = "Notifications",
                                    modifier = Modifier
                                     //   .background(Color(0xFFEFEFEF), CircleShape)
                                        .size(30.dp)
                                    //tint = Color(0xff13818B) // Adjust color as needed
                                )
                            }
                        }


                    }
                }
            }

            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF13818B)),
                            shape = CircleShape,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text("Popular", color = Color.White)
                        }
                    }

                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFEFEFEF)),
                            shape = CircleShape,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text("Following", color = Color.Black)
                        }
                    }

                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFEFEFEF)),
                            shape = CircleShape,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.savedb),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable { /* Handle click */ },
                                //colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Black)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Saved", color = Color.Black)
                        }
                    }

                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFEFEFEF)),
                            shape = CircleShape,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text("My comments", color = Color.Black)
                        }
                    }
                }

            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_4),
                            contentDescription = "Profile",
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(Color.Gray),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("DIY Recycling Projects")
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(".")
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Follow", color = Color(0xFF43b9f4))
                    }
                    Icon(
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }

            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    androidx.compose.material3.Card(
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .height(200.dp)
                            .width(400.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(200.dp)
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.river),
                                contentScale = ContentScale.Crop,
                                contentDescription = "clean river",
                                modifier = Modifier.fillMaxSize()
                            )
                            androidx.compose.material3.Text(
                                text = "What have you contributed to saving " +
                                        "the environment in your" +
                                        " community or your own home ",
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.Center)
                            )
                        }
                    }
                }
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { }
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f)
                    ) {
                        Spacer(modifier = Modifier.width(6.dp))
                        Icon(
                            imageVector = Icons.Filled.FavoriteBorder,
                            contentDescription = "",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(25.dp)
                                .clickable { }
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("4.3K")
                        Spacer(modifier = Modifier.width(20.dp))
                        Image(
                            painter = painterResource(id = R.drawable.think),
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .clickable { /* Handle click */ },
                            //colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Black)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("3.3K")
                    }
                    Image(
                        painter = painterResource(id = R.drawable.saved),
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp)
                            .clickable { /* Handle click */ },
                       // colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Black)
                    )
                }
            }

            item {
                Card(
                    shape = RoundedCornerShape(8.dp),
                    backgroundColor = Color(0xFFE0E0E0), // Light gray color for the card background
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(150.dp) // Increased height for better readability
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp), // Padding inside the card for better text alignment
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "At home, I recycle, compost, conserve energy and water, and avoid single-use plastics. I have been involved in several community projects. In my community, I join clean-ups, tree-planting events, support local farmers, participate in awareness campaigns, and advocate for green policies. These efforts collectively help protect and preserve our environment. This has been a great experience for me and my family.",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 14.sp, // Adjusted font size for better readability
                                lineHeight = 20.sp // Increased line height for better text spacing
                            )
                        )
                    }
                }
            }


            item {
                Text(
                    "View all 3.3k comments",
                    color = Color(0xFF13818B),
                    modifier = Modifier
                        .wrapContentSize(Alignment.Center)
                        .padding(8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Interests",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                        //modifier = Modifier.padding(start = 8.dp)
                    )
                    Text(
                        text = "See all",
                        modifier = Modifier
                         //.padding(start=10.dp)
                            .size(16.dp),
                        color = Color(0xFF13818B)

                    )
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowRight,
                        contentDescription = "",
                        tint = Color(0xFF13818B),
                        modifier = Modifier.size(25.dp)
                    )
                }
            }

            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.padding(horizontal = 12.dp)
                ) {
                    item {
                        Card(
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier
                                .size(180.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.river),
                                contentScale = ContentScale.Crop,
                                contentDescription = "Clean river",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                    item {
                        Card(
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier
                                .size(180.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.commbin),
                                contentScale = ContentScale.Crop,
                                contentDescription = "People helping to recycle",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                    item {
                        Card(
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier
                                .size(180.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.recycling),
                                contentScale = ContentScale.Crop,
                                contentDescription = "Circle of recycle",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
            }
        }
    }
}

