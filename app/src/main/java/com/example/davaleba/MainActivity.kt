package com.example.davaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val productList=ArrayList<Product>()
        productList.add(Product(1 ,  "https://scontent.ftbs5-2.fna.fbcdn.net/v/t1.0-9/121975209_3545845362121599_3966441005132153415_o.jpg?_nc_cat=109&ccb=2&_nc_sid=09cbfe&_nc_ohc=dcBKve5YPFkAX9r6TyI&_nc_ht=scontent.ftbs5-2.fna&oh=8e26ded3d14e1815029ea99ccb5b0b78&oe=60320C0C"))
        productList.add(Product(2 ,  "https://scontent.ftbs5-1.fna.fbcdn.net/v/t1.0-9/82799246_2834041153302027_7661705585678614528_o.jpg?_nc_cat=111&ccb=2&_nc_sid=174925&_nc_ohc=xYVL3LA-Uo0AX8z2yZN&_nc_ht=scontent.ftbs5-1.fna&oh=8366e924ea6e906c5fbbab943cd555f2&oe=602FD529"))
        productList.add(Product(3 ,  "https://source.unsplash.com/random"))
        productList.add(Product(4 ,  "https://source.unsplash.com/random"))
        productList.add(Product(5 ,  "https://source.unsplash.com/random"))
        productList.add(Product(6 ,  "https://source.unsplash.com/random"))
        productList.add(Product(7 ,  "https://source.unsplash.com/random"))
        productList.add(Product(8 ,  "https://source.unsplash.com/random"))
        productList.add(Product(9 ,  "https://source.unsplash.com/random"))
        productList.add(Product(10 ,  "https://source.unsplash.com/random"))

        val productAdapter=ProductAdapter(productList)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = productAdapter

    }

}
