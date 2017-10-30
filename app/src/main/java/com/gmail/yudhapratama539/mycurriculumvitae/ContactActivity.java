package com.gmail.yudhapratama539.mycurriculumvitae;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import tyrantgit.explosionfield.ExplosionField;

public class ContactActivity extends AppCompatActivity {
    private ExplosionField mExplosionField;
    private ImageView imageViewFacebook, imageViewInstagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("My Contact");

        imageViewFacebook=(ImageView)findViewById(R.id.imagefb);
        imageViewInstagram=(ImageView)findViewById(R.id.imageinsta);
        mExplosionField = ExplosionField.attach2Window(this);

        imageViewFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mExplosionField.explode(imageViewFacebook);
                Uri uri = Uri.parse("https://www.facebook.com/Kudkud32"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        imageViewInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mExplosionField.explode(imageViewInstagram);
                Uri uri = Uri.parse("https://www.instagram.com/yudha.putra__/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home){
            //finish();
            Intent intent=new Intent(ContactActivity.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
