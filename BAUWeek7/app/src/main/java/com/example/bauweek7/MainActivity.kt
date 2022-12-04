package com.example.bauweek7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Override Menu Creation Process
    //This function is only available through classes that inherits Main Activity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.opt_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.menu_add ->{
                Toast.makeText(this,"Add Menu Clicked",Toast.LENGTH_SHORT).show()
            }
            R.id.menu_edit ->{
                Toast.makeText(this,"Edit Menu Clicked",Toast.LENGTH_SHORT).show()
            }
            R.id.menu_delete ->{
                Toast.makeText(this,"Delete Menu Clicked",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}