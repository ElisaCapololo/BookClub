package com.elisacapololo.clubdelivros;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<Book> bookList;
    Dialog addItemDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Books Club");

        bookList = new ArrayList<>();
        bookList.add(new Book("New Planet in my eyes part I", "Romance", "Description book",
                R.drawable.jupiter, "upload","download"));
        bookList.add(new Book("The first pass", "Psicologia", "Description book",
                R.drawable.mars, "upload","download"));
        bookList.add(new Book("DevFestLuanda", "Category", "Description book",
                R.drawable.devfest, "upload","download"));
        bookList.add(new Book("New Planet", "Motivação pessoal", "Description book",
                R.drawable.jupiter, "upload","download"));
        bookList.add(new Book("The first pass", "Category", "Description book",
                R.drawable.mars, "upload","download"));
        bookList.add(new Book("DevFestLuanda", "Category", "Description book",
                R.drawable.devfest, "upload","download"));
        bookList.add(new Book("New Planet", "Auto-introdução", "Description book",
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
                Toast.makeText(Main2Activity.this, "Add a new Book", Toast.LENGTH_SHORT).show();
                showDialog();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //Código para criar uma Dialog e mostrar o formulario de add new Book
    private void showDialog() {
        addItemDialog = new Dialog(Main2Activity.this);
        addItemDialog.setContentView(R.layout.item_dialog);

        addItemDialog.setTitle("Add a new item");
        addItemDialog.show();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case  R.id.nav_allBooks:
                Intent intentAllBooks = new Intent(this, Main2Activity.class);
                startActivity(intentAllBooks);
                break;
            case R.id.nav_download:
                Intent intentDownload = new Intent(this, DownloadedActivity.class);
                startActivity(intentDownload);
                break;
            case  R.id.nav_about:
                break;
            case R.id.nav_contributors:
                break;
            case R.id.nav_settings:
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
