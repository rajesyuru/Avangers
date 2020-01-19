package com.example.avangers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mlistView;
    private Avanger[] mAvangers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = findViewById(R.id.listView);

        mAvangers = new Avanger[] {
                new Avanger("Captain America", R.drawable.captain),
                new Avanger("Black Widow", R.drawable.blackwidow),
                new Avanger("Thor", R.drawable.thor),
                new Avanger("Spider Man", R.drawable.spiderman),
                new Avanger("Hulk", R.drawable.hulk),
                new Avanger("Loki", R.drawable.loki),
        };

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.avanger_item, mAvangers);

        mlistView.setAdapter(customAdapter);

    }
}
