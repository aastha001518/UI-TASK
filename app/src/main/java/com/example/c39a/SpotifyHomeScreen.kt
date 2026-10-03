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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Change these to your own image names (files in res/drawable).
private val img1 = R.drawable. lanaa
private val img2 = R.drawable. weekndd
private val img3 = R.drawable.tate
private val img4 = R.drawable. snd
private val img5 = R.drawable.trk
private val img6 = R.drawable.dmx

@Composable
fun SpotifyHomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Jump back in",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("♫", color = Color.White, fontSize = 26.sp)
                Spacer(modifier = Modifier.width(18.dp))
                Text("⏱", color = Color.White, fontSize = 24.sp)
                Spacer(modifier = Modifier.width(18.dp))
                Text("⚙", color = Color.White, fontSize = 24.sp)
            }
        }

        Spacer(modifier = Modifier.height(28.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            ArtistCircle("Lana Del Rey", img1)
            ArtistCircle("The Weeknd", img2)
            ArtistCircle("Tate McRae", img3)
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(img4),
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(6.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    "#MADEFORYOU",
                    color = Color.Gray,
                    fontSize = 12.sp
                )
                Text(
                    "Your 2026 sound",
                    color = Color.White,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            AlbumCard(
                title = "Your Top Tracks",
                image = img5,
                titleColor = Color.White,
                modifier = Modifier.weight(1f)
            )
            AlbumCard(
                title = "Daily Mix 1",
                image = img6,
                titleColor = Color.White,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(28.dp))


        Text(
            "Chill picks",
            color = Color.White,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(14.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            AlbumCard(
                title = "Lana Del Rey, The Weeknd,\nTate McRae",
                image = img1,
                titleColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
            AlbumCard(
                title = "Tate McRae, The Weeknd,\nLana Del Rey",
                image = img2,
                titleColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun ArtistCircle(name: String, image: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(image),
            contentDescription = name,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            name,
            color = Color.White,
            fontSize = 14.sp
        )
    }
}

@Composable
fun AlbumCard(
    title: String,
    image: Int,
    titleColor: Color,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(image),
            contentDescription = title,
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            title,
            color = titleColor,
            fontSize = 14.sp,
            lineHeight = 20.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SpotifyHomeScreenPreview() {
    SpotifyHomeScreen()
}
 