package com.gmail.yudhapratama539.mycurriculumvitae;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class SingleImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_image);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Preview Image");

        int imId = this.getIntent().getExtras().getInt("posisi");
        ImageView iv = (ImageView) findViewById(R.id.singleimage);
        int image = ImageAdapter.mThumbIds[imId];
        iv.setImageResource(image);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home){
            //finish();
            Intent intent=new Intent(SingleImage.this, HobbyActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
