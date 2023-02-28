package demo.com;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {

    private ImageView imageViewDrill;
    private TextView textViewTitle;
    private TextView textViewInfo;
    private String title;
    private String info;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_drill);
        imageViewDrill = findViewById(R.id.imageViewDrill);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewInfo = findViewById(R.id.textViewInfo);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        Intent intent = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("id")) {
            title = intent.getStringExtra("title");
            info = intent.getStringExtra("info");
            id = intent.getIntExtra("id", -1);
            textViewTitle.setText(title);
            textViewInfo.setText(info);
            imageViewDrill.setImageResource(id);
        } else {
            Intent backToCategory = new Intent(this, DrillCategoryActivity.class);
            startActivity(backToCategory);
        }
    }
}