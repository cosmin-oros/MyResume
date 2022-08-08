package com.example.myresume.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myresume.ImageCard
import com.example.myresume.navigation.Screen

@Composable
fun ProjectsScreen(navController: NavController) {
    //create image cards that are clickable and expand with more info about the project

    val annotatedLinkString: AnnotatedString = buildAnnotatedString {

        val str = "Click this link to go to my projects"
        val startIndex = str.indexOf("link")
        val endIndex = startIndex + 4
        append(str)
        addStyle(
            style = SpanStyle(
                color = androidx.compose.ui.graphics.Color.Red,
                fontSize = 20.sp,
                textDecoration = TextDecoration.Underline
            ),
            start = startIndex,
            end = endIndex
        )

        // attach a string annotation that stores a URL to the text "link"
        addStringAnnotation(
            tag = "URL",
            annotation = "https://github.com/cosmin-oros?tab=repositories",
            start = startIndex,
            end = endIndex
        )

    }

    // UriHandler parse and opens URI inside AnnotatedString Item in Browse
    val uriHandler = LocalUriHandler.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // put two cards on a row

        Row(

        ) {
            /*ImageCard(
                painter = ,
                contentDescription = ,
                title =
            )*/

            Spacer(modifier = Modifier.width(16.dp))

            /*ImageCard(
                painter = ,
                contentDescription = ,
                title =
            )*/
        }

        Spacer(modifier = Modifier.size(16.dp))

        Row(

        ) {
            /*ImageCard(
                painter = ,
                contentDescription = ,
                title =
            )*/

            Spacer(modifier = Modifier.width(16.dp))

            /*ImageCard(
                painter = ,
                contentDescription = ,
                title =
            )*/
        }

        Spacer(modifier = Modifier.size(16.dp))

        ClickableText(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            text = annotatedLinkString,
            style = TextStyle(
                fontSize = 18.sp,
                color = androidx.compose.ui.graphics.Color.White
            ),
            onClick = {
                annotatedLinkString
                    .getStringAnnotations("URL", it, it)
                    .firstOrNull()?.let { stringAnnotation ->
                        uriHandler.openUri(stringAnnotation.item)
                    }
            }
        )
    }
}