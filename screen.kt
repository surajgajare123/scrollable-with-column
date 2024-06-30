package com.example.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 500)
@Composable
fun Getlist() {
    Column (modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategory().map { item->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    }
}
@Composable
fun BlogCategory(img : Int, title : String, subtitle: String) {
    Card(
        modifier = Modifier.padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "img",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .clip(CircleShape)
            )
            ItemDiscription(title, subtitle, Modifier)

        }
    }
}

@Composable
private fun ItemDiscription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = Modifier ) {
        Text(
            text = title,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
        )
    }
}

data class Category(val img : Int , val title : String , val subtitle : String)

fun getCategory(): MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.a,"Programming", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"developer", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"desinger", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"creater", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"visulation", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"virtual", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"beginning", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"Programming", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"developer", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"desinger", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"creater", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"visulation", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"virtual", "learn new things from suraj"))
    list.add(Category(R.drawable.a,"beginning", "learn new things from suraj"))
    return list

}
