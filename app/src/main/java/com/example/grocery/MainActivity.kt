package com.example.grocery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1- AdapterView : RecyclerView
        val recyclerView: RecyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        //2- Data Source : List of ItemModel Objects

        var groceryItems: ArrayList<ItemModel> = ArrayList()

        val v1 = ItemModel("Fruits","Fresh Fruits from the Garden ",R.drawable.fruits)
        val v2 = ItemModel("Bakery","Fresh Fruits from the Garden ",R.drawable.bakery)
        val v3 = ItemModel("Beverage","Fresh Fruits from the Garden ",R.drawable.beverage)
        val v4 = ItemModel("Snacks","Fresh Fruits from the Garden ",R.drawable.snacks)
        val v5 = ItemModel("Vegetables","Fresh Fruits from the Garden ",R.drawable.vegetable)
        val v6 = ItemModel("Eggs","Fresh Fruits from the Garden ",R.drawable.eggs)
        val v7 = ItemModel("Choclate","Fresh Fruits from the Garden ",R.drawable.choclate)
        val v8 = ItemModel("Chicken","Fresh Fruits from the Garden ",R.drawable.chicken)
        val v9 = ItemModel("Candy","Fresh Fruits from the Garden ",R.drawable.candy)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)
        groceryItems.add(v7)
        groceryItems.add(v8)
        groceryItems.add(v9)


        //3- Adapter
        val adapter= MyAdapter(groceryItems)
        recyclerView.adapter=adapter

    }
}