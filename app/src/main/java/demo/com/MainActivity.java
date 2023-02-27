package demo.com;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        listViewTools = findViewById(R.id.listViewTools);
        listViewTools.setOnItemClickListener((adapterView, view, position, id) -> {
            switch (position) {
                case 0:
                    Intent intentDrill = new Intent(getApplicationContext(), DrillCategoryActivity.class);
                    startActivity(intentDrill);
                    break;
            }
        });
    }
}