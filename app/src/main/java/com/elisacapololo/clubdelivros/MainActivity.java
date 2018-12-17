package com.elisacapololo.clubdelivros;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bookList = new ArrayList<>();
        bookList.add(new Book("New Planet in my eyes part I", "Category", "Description book",
                R.drawable.jupiter, "upload","download"));
        bookList.add(new Book("The first pass", "Category", "Description book",
                R.drawable.mars, "upload","download"));
        bookList.add(new Book("DevFestLuanda", "Category", "Description book",
                R.drawable.devfest, "upload","download"));
        bookList.add(new Book("New Planet", "Category", "Description book",
                R.drawable.jupiter, "upload","download"));
        bookList.add(new Book("The first pass", "Category", "Description book",
                R.drawable.mars, "upload","download"));
        bookList.add(new Book("DevFestLuanda", "Category", "Description book",
                R.drawable.devfest, "upload","download"));
        bookList.add(new Book("New Planet", "Category", "Description book",
                R.drawable.jupiter, "upload","download"));
        bookList.add(new Book("The first pass", "Category", "Description book",
                R.drawable.mars, "upload","download"));
        bookList.add(new Book("DevFestLuanda", "Category", "Description book",
                R.drawable.earth, "upload","download"));
        bookList.add(new Book("DevFestLuanda", "Category", "Description book",
                R.drawable.devfest, "upload","download"));
        bookList.add(new Book("New Planet", "Category", "Description book",
                R.drawable.jupiter, "upload","download"));
        bookList.add(new Book("New Planet in my eyes part I", "Category", "Description book",
                R.drawable.jupiter, "upload","download"));
        bookList.add(new Book("The first pass", "Category", "Description book",
                R.drawable.mars, "upload","download"));



        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        MyAdapter myAdaptar = new MyAdapter(this, bookList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdaptar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
