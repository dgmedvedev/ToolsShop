package demo.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {

    private TextView textView2;
    private TextView textView3;
    private String title;
    private String info;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_drill);

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        info = intent.getStringExtra("info");
        id = intent.getIntExtra("id", 0);

        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        textView2.setText(title);
        textView3.setText(info);
    }
}