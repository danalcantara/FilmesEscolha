package com.app.euescolhovoce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.euescolhovoce.AnimationTh
import com.app.euescolhovoce.Principia
import com.app.euescolhovoce.R
import kotlin.random.Random

@Composable
fun navigationapp() {
val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Main"
    ) {

        composable("Main"){
            Principia(navController)
        }
        composable("AnimationTh"){
            val randomNumbers = Random.nextInt(1, 10)
            when(randomNumbers){
             1 -> {
                 AnimationTh(navController, R.drawable.debi)
             }

                2 -> {
                 AnimationTh(navController, R.drawable.todomundoempanico)
             }
                3 -> {
                 AnimationTh(navController, R.drawable.vaiquedacerto)
             }

                4 -> {
                 AnimationTh(navController, R.drawable.badboys)
             }
                5 -> {
                 AnimationTh(navController, R.drawable.quemficamario)
             }
                6 -> {
                 AnimationTh(navController, R.drawable.nsepare)
             }
                7 -> {
                 AnimationTh(navController, R.drawable.amarracao)
             }
                8 -> {
                 AnimationTh(navController, R.drawable.barraco)
             }
                9 -> {
                 AnimationTh(navController, R.drawable.codade)
             }
                10 -> {
                 AnimationTh(navController, R.drawable.corre)
             }
            }

        }
    }
}