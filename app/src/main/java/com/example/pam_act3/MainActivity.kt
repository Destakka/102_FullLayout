package com.example.pam_act3

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_act3.ui.theme.PAM_Act3Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_Act3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    )
    {
        Text(
            text = "Desta",
            fontSize = 40.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp)
            )
        Spacer(modifier = Modifier.padding(13.dp))
        
        BoxScreen()

        Spacer(modifier = Modifier.padding(13.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(13.dp))

        Box2()
        
    }
}

@Composable
fun BoxScreen() {
    val image = painterResource(id = R.drawable.bg)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(Color.Cyan)
    )
    {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
                ) {
            Image(painter = image,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
            )
            Text(
                text = "Rain",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(13.dp)
            )
        }
    }


}

@Composable
fun Lokasi(){
    Text(text = "19°C", fontSize = 64.sp, fontWeight = FontWeight.Bold)

    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier.size(35.dp)
        )


        Text(text = "Yogyakarta", fontSize = 40.sp, fontWeight = FontWeight.Bold)
    }
    Text(text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center
    )

}

@Composable
fun Box2(){
    Box(modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .fillMaxWidth()
        .background(Color.Cyan)){

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAM_Act3Theme {
        HomeScreen()
    }
}