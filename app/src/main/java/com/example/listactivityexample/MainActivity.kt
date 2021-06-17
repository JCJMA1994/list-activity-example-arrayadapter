package com.example.listactivityexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.arrayAdapterListView()

    }
    //Funcion para crear el array de la List View
    private fun arrayAdapterListView() {
        val arrayAdapter: ArrayAdapter<*>

        val programmingLanguage = mutableListOf("Java", "Android", "JavaEE", "JSP", "JDBC")
        val listViewExample = findViewById<ListView>(R.id.listViewExample)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, programmingLanguage)
        listViewExample.adapter = arrayAdapter
        listViewExample.choiceMode = ListView.CHOICE_MODE_SINGLE

        listViewExample.setOnItemClickListener {
                parent, _, position, _ ->
            Toast.makeText(this, "You chose " + parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show()
        }
    }
}