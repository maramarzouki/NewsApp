package tn.m1pdam.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<Article> articlesList;
    Context mContext;

    public Adapter(List<Article> articlesList, Context mContext) {
        this.articlesList = articlesList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adapter, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Article a = articlesList.get(position);
        holder.title.setText(a.getTitle());
        holder.desc.setText(a.getDesc());
        int imageResId = holder.itemView.getResources().getIdentifier(a.getImg(),"drawable",holder.itemView.getContext().getPackageName()
        );
        holder.img.setImageResource(imageResId);

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, FullArticle.class);
            intent.putExtra("title", a.getTitle());
            intent.putExtra("desc", a.getDesc());
            intent.putExtra("img", a.getImg());
            intent.putExtra("content", a.getContent());
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return articlesList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, desc;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
            img = itemView.findViewById(R.id.img);
        }
    }
}