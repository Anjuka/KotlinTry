package com.ahn.kotlintry

data class Hobbies(var title: String)
        object Supplier{

            var hobbies = listOf<Hobbies>(
                Hobbies("Reading"),
                Hobbies("Sleeping"),
                Hobbies("Swimming"),
                Hobbies("Climbing"),
                Hobbies("Collecting Stamps"),
                Hobbies("Dancing"),
            )

}