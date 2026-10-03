
package com.example.c39a

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InstagramUI() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("‹", fontSize = 28.sp)

            Text(
                "aastha",
                style = TextStyle(
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text("⋯", fontSize = 28.sp)
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.finallily),
                contentDescription = "Profile picture",
                modifier = Modifier
                    .clip(CircleShape)
                    .height(85.dp)
                    .width(85.dp),
                contentScale = ContentScale.Crop
            )

            ProfileStat("9", "Posts")
            ProfileStat("500", "Followers")
            ProfileStat("100", "Following")
        }


        Column(
            modifier = Modifier.padding(
                start = 30.dp,
                top = 8.dp
            )
        ) {
            Text(
                "Aastha Bastakoti",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(
                "Gemini",
                fontWeight = FontWeight.Light
            )

            Text(
                buildAnnotatedString {
                    append("Computing Student ")

                    withStyle(
                        style = SpanStyle(color = Color.Blue)
                    ) {
                        append("@softwarica")
                    }
                }
            )

            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(color = Color.Blue)
                    ) {
                        append("instagram.com")
                    }
                }
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                buildAnnotatedString {
                    append("Followed by ")

                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("friends ")
                    }

                    append("and ")

                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("1 other")
                    }
                }
            )
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ElevatedButton(
                onClick = {},
                modifier = Modifier
                    .weight(2f)
                    .padding(end = 4.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text("Follow")
            }

            ElevatedButton(
                onClick = {},
                modifier = Modifier
                    .weight(2f)
                    .padding(end = 4.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black
                )
            ) {
                Text("Message")
            }

            ElevatedButton(
                onClick = {},
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black
                )
            ) {
                Text("+")
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 6.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            StoryHighlight("Story 1", R.drawable.finallily)
            StoryHighlight("Story 2", R.drawable.finallily)
            StoryHighlight("Story 3", R.drawable.finallily)
            StoryHighlight("Story 4", R.drawable.finallily)
            StoryHighlight("Story 5", R.drawable.finallily)
        }

        HorizontalDivider()


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "▦   POSTS",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }


        repeat(2) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 2.dp),
                horizontalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                repeat(3) {
                    PostBox(
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileStat(
    count: String,
    label: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            count,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Text(
            label,
            style = TextStyle(fontSize = 14.sp)
        )
    }
}

@Composable
fun StoryHighlight(
    label: String,
    imageId: Int
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageId),
            contentDescription = label,
            modifier = Modifier
                .clip(CircleShape)
                .height(60.dp)
                .width(60.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            label,
            fontSize = 11.sp
        )
    }
}

@Composable
fun PostBox(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .height(115.dp)
            .background(Color(0xFFE0E0E0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Photo",
            color = Color.Gray
        )
    }
}
@Preview(showBackground = true)
@Composable
fun InstagramUIPreview() {
    InstagramUI()
}