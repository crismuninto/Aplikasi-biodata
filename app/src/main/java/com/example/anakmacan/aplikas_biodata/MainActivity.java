package com.example.anakmacan.aplikas_biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void phoneNumber(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:085973755035"));
        startActivity(intent);
    }

    public void urlWeb(View view) {
        Uri uri = Uri.parse("http://student.blog.dinus.ac.id/crismunianto/2016/11/28/notasi-menentukan-status-program-studi/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void homeLocation(View view) {
        Uri uri = Uri.parse("geo:0,0?q=-6.4588,110.7630");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void email(View view)
    {
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_EMAIL, new String[] {"crismunianto@gmail.com"});
        it.putExtra(Intent.EXTRA_CC, new String[] {"crismunianto2@gmail.com"});

        try {
            startActivity(Intent.createChooser(it, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }

}
