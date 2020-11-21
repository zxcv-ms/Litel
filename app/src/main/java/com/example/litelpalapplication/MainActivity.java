package com.example.litelpalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LitePal.initialize(this);
        setContentView(R.layout.activity_main);

        Button createDatabase = findViewById(R.id.cerate_database);
        createDatabase.setOnClickListener(this);
        Button addData = findViewById(R.id.add_data);
        addData.setOnClickListener(this);
        Button deleteData = findViewById(R.id.delete_data);
        deleteData.setOnClickListener(this);
        Button updateData = findViewById(R.id.update_data);
        updateData.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cerate_database:
            LitePal.getDatabase();
            case R.id.add_data:
                Album album = new Album();
                album.setName("album");
                album.setPrice(10.99f);
                album.save();
                Song song1 = new Song();
                song1.setName("song1");
                song1.setDuration(320);
                song1.setAlbum(album);
                song1.save();
                Song song2 = new Song();
                song2.setName("song2");
                song2.setDuration(356);
                song2.setAlbum(album);
                song2.save();
            case R.id.update_data:
                Album albumToUpdate = LitePal.find(Album.class, 1);
                albumToUpdate.setPrice(20.99f); // raise the price
                albumToUpdate.save();

        }
    }
}
