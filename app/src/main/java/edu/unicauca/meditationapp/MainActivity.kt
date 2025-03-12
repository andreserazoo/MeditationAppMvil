package edu.unicauca.meditationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.unicauca.meditationapp.ui.theme.MeditationappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeditationappTheme {

                }
            }
        }
    }

@Composable

fun BarraBusqueda(
    modifier: Modifier = Modifier
){
    TextField(
       value = "",
        onValueChange  = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },

        placeholder = {
            Text(text = stringResource(R.string.search))
        },

        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.surface
        ),

        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )

}

@Preview
@Composable
fun PreviewBarraDeBusqueda(){
    BarraBusqueda()
}

@Composable
fun CuadroAlineaTuCuerpo(
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier
    ){
        Image(
            painter = painterResource(R.drawable.ab1_inversions),
            contentDescription = stringResource(R.string.alinea_tu_cuerpo_txt)
        )
        Text(
            text =(stringResource(R.string.ab1_inversions_txt)))
    }

}
@Preview
@Composable
fun PreviewCuadroAlineaTuCuerpo(){
    CuadroAlineaTuCuerpo()
}