package com.example.notesappwithfirebase.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notesappwithfirebase.Screens.InsertNotesScreen
import com.example.notesappwithfirebase.Screens.NotesScreen
import com.example.notesappwithfirebase.Screens.SplashScreen


@Composable
fun NotesNavigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "splash")
    {
        composable(NotesNavigationItem.SplashScreen.route)
        {
            SplashScreen(navHostController)
        }

        composable(NotesNavigationItem.HomeScreen.route)
        {
            NotesScreen(navHostController)
        }

        composable(NotesNavigationItem.InsertNotesScreen.route + "/{id}")
        {
            val id = it.arguments?.getString("id")
            InsertNotesScreen(navHostController, id )
        }
    }

}