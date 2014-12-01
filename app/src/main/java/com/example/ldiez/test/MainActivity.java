package com.example.ldiez.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {

    private Button calcular;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView)findViewById(R.id.image);
        calcular = (Button)findViewById(R.id.calcular);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String random_image;
                Random r = new Random();
                int palo = r.nextInt(3) + 1;
                String carta = String.format("%02d", r.nextInt(13));
                random_image = "i" + palo + carta;

                int naipe = getResources().getIdentifier(random_image, "drawable",  getPackageName());
                image.setImageResource(naipe);
            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
