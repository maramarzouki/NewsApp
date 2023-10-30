package tn.m1pdam.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FullArticle extends AppCompatActivity {

    TextView t, content, description;
    ImageView image;
    Button share;
    String title, cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_article);
        setTitle("");

        t = findViewById(R.id.artitle);
        description = findViewById(R.id.ardesc);
        content = findViewById(R.id.content);
        image = findViewById(R.id.artimg);
        share = findViewById(R.id.shareBtn);

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        String img = intent.getStringExtra("img");
        cont = intent.getStringExtra("content");

        t.setText(title);
        description.setText(desc);
        int imageResId = getResources().getIdentifier(img,"drawable",getPackageName());
        image.setImageResource(imageResId);
        content.setText(cont);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT, title);
                intent.putExtra(Intent.EXTRA_TEXT, cont);
                startActivity(intent);
            }
        });
    }
}