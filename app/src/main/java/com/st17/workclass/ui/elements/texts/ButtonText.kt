package com.st17.workclass.ui.elements.texts

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.White

@Composable
fun text(string: String = "text", color: Color = Black){
    Text(string, fontSize = 14.sp, color = color, modifier = Modifier.wrapContentSize())
}