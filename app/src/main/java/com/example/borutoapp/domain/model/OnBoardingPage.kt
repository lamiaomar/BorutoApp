package com.example.borutoapp.domain.model

import androidx.annotation.DrawableRes
import com.example.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
){
    object First: OnBoardingPage(
        image = R.drawable.books,
        title = "Greetings",
        description = "Are you a Boruto fan ?"
    )
    object Second: OnBoardingPage(
        image = R.drawable.cake,
        title = "Explore",
        description = "Find your favorite heroes"
    )
    object Third: OnBoardingPage(
        image = R.drawable.ice,
        title = "Power",
        description = "Check out your heroes power and see how much are they strong comparing to others "
    )
}
