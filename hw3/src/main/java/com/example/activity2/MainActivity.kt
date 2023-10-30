package com.example.activity2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.activity2.databinding.ActivityMainBinding
import com.example.activity2.ui.theme.Activity2Theme

class MainActivity : ComponentActivity() {
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        foodList = ArrayList()
        foodAdapter = FoodAdapter(foodList)
        foodListItems()

        binding.recyclerView.layoutManager =
            LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = foodAdapter
    }

    private fun foodListItems(){
        foodList.add(Food(R.drawable.pizza1,"Neapolitan Pizza"))
        foodList.add(Food(R.drawable.pizza2,"Margherita Pizza"))
        foodList.add(Food(R.drawable.pizza3,"Marinara Pizza"))
        foodList.add(Food(R.drawable.pizza4,"The Sicilian Pizza"))
        foodList.add(Food(R.drawable.pizza5,"Roman-style Pizza"))
        foodList.add(Food(R.drawable.pizza6,"The Staple American Pizza"))
        foodList.add(Food(R.drawable.pizza7,"Meatball Pizza"))
        foodList.add(Food(R.drawable.pizza8,"Stromboli Pizza"))
        foodList.add(Food(R.drawable.pizza9,"The New York-style Pizza"))
        foodList.add(Food(R.drawable.pizza10,"The Californian Pizza"))
        foodList.add(Food(R.drawable.pizza11,"The Detroit Pizza"))
        foodList.add(Food(R.drawable.pizza12,"The St. Louis Pizza"))
        foodList.add(Food(R.drawable.pizza13,"Canadian Pizza"))
        foodList.add(Food(R.drawable.pizza14,"The Mexican Pizza"))
        foodList.add(Food(R.drawable.pizza15,"South American Pizza"))
        foodList.add(Food(R.drawable.pizza16,"French Pizza"))
    }
}