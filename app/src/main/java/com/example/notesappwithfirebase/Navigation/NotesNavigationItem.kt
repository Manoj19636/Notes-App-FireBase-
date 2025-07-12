package com.example.notesappwithfirebase.Navigation

sealed class NotesNavigationItem(val route: String) {

    object SplashScreen : NotesNavigationItem(route = "splash")
    object HomeScreen : NotesNavigationItem(route = "home")
    object InsertNotesScreen : NotesNavigationItem(route = "insert")

}