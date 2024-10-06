package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SplitScreen(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}
@Composable
fun Comp(titre:String,desc:String,bgcolor:Color,modifier:Modifier=Modifier)
{
    Box(
        modifier = modifier
            .background(bgcolor)
            .fillMaxSize()
            .padding(16.dp),

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = titre,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = desc,
                modifier = Modifier.align(Alignment.CenterHorizontally)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
            )
        }
    }
}
@Composable
fun SplitScreen(modifier: Modifier = Modifier) {
    Column(
        modifier= modifier
            .fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ){
            Comp(
                titre = stringResource(R.string.text),
                desc =stringResource(R.string.text_desc) ,
                bgcolor = Color(0xFFEADDFF),
                modifier=Modifier.weight(1f)
            )
            Comp(
                titre = stringResource(R.string.image),
                desc =stringResource(R.string.image_desc) ,
                bgcolor = Color(0xFFD0BCFF),
                modifier=Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ){
            Comp(
                titre = stringResource(R.string.row),
                desc =stringResource(R.string.row_desc) ,
                bgcolor = Color(0xFFB69DF8),
                modifier=Modifier.weight(1f)
            )
            Comp(
                titre = stringResource(R.string.col),
                desc =stringResource(R.string.col_desc) ,
                bgcolor = Color(0xFFD0BCFF),
                modifier=Modifier.weight(1f)
            )
        }

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantComposeTheme {
           Surface (
               modifier = Modifier.fillMaxSize(),
               color = MaterialTheme.colorScheme.background
               ){
               SplitScreen()
        }
    }
}
