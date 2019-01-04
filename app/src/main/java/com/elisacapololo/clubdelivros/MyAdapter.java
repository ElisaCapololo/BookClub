package com.elisacapololo.clubdelivros;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContext;
    private List<Book> list;

    public MyAdapter(Context mContext, List<Book> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.item_book, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.book_title.setText(list.get(i).getTitle());
        viewHolder.cover_book.setImageResource(list.get(i).getCover());
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, BookActivity.class);
                //passing data to the book activity

                intent.putExtra("Title", list.get(i).getTitle());
                intent.putExtra("Description", list.get(i).getDescription());
                intent.putExtra("Image", list.get(i).getCover());
                intent.putExtra("Category", list.get(i).getCategory());

                //start activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView book_title;
        ImageView cover_book;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            book_title = itemView.findViewById(R.id.title_book);
            cover_book = itemView.findViewById(R.id.image_book);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }

}
