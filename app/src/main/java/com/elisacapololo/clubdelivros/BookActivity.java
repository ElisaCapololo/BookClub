package com.elisacapololo.clubdelivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView titleTextView, descriptionTextView, categoryTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        getSupportActionBar().setTitle("Book");

        titleTextView = findViewById(R.id.title_book_download);
        descriptionTextView = findViewById(R.id.about_book_download);
        imageView = findViewById(R.id.image_book_download);
        categoryTextView = findViewById(R.id.category_book_download);

        //Receive data
        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String description = intent.getExtras().getString("Description");
        int cover = intent.getExtras().getInt("Image");
        String category = intent.getExtras().getString("Category");

        //Settings value

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(cover);
        categoryTextView.setText(category);


    }
}
