package com.bams.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.material.*
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.bams.businesscard.ui.theme.BusinessCardTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}


@Composable
fun BusinessCardApp(modifier: Modifier = Modifier){
    Column(
        modifier
            .fillMaxSize(1f)
            .background(Color.Green),
    ) {
        val image = painterResource(R.drawable.luffy_gear_5)
        Column(
            modifier
                .weight(3f)
                .background(Color.Blue)
                .background(Color(0xFF154360))
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
            Text(text = "Bambang Jayasantika", color = Color.White, fontSize = 30.sp)
            Text(text = "Android Developer",  color = Color(0xFF3ddc84), fontWeight = FontWeight.Bold)

            /* Text(
                    text = "Demo Text",
                    style = TextStyle(
                        color = Color.Red,
                        fontSize = 16.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.W800,
                        fontStyle = FontStyle.Italic,
                        letterSpacing = 0.5.em,
                        background = Color.LightGray,
                        textDecoration = TextDecoration.Underline
                    )
                )*/

        }
        /*Column(
            modifier
                .weight(1f)
                .background(Color.DarkGray)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text(text = "Contact 1", color = Color.White)
            Text(text = "Contact 2", color = Color.White)
            Text(text = "Contact 3", color = Color.White)
        }*/

        Column(modifier.weight(1f))
        {
            SecondSection(modifier.weight(1f))
        }


    }
}



@Composable
fun SecondSection(modifier: Modifier) {
    Column(
        modifier
            .background(Color.DarkGray)
            .background(Color(0xFF154360))
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth(1f)
                .width(12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row() {

            Icon(modifier = Modifier.weight(1f,true),
                painter = painterResource(R.drawable.ic_baseline_call_24),
                contentDescription = null, tint = Color(0xFF3ddc84))
            Text(modifier = Modifier.weight(4f,true),
                text = "+62 821-1967-2799",
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth(1f)
                .width(12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))

        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth(1f)
                .width(12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row() {

            Icon(
                modifier = Modifier.weight(1f, true),
                painter = painterResource(R.drawable.ic_baseline_email_24),
                contentDescription = null, tint =  Color(0xFF3ddc84)
            )

            Text(
                modifier = Modifier.weight(4f,true),
                text = "bambangjayasantika23@gmail.com", color = Color.White)

        }
        Spacer(modifier = Modifier.height(56.dp))
    }
}





@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}