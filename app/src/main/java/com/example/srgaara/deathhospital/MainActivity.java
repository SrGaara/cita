package com.example.srgaara.deathhospital;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static String APP_DIRECTORY = "MyPictureApp/";
    private static String MEDIA_DIRECTORY = APP_DIRECTORY + "PictureApp";

    private final int MY_PERMISSIONS = 100;
    private final int PHOTO_CODE = 200;
    private final int SELECT_PICTURE = 300;

 //   private ImageView mSetImage;
   // private Button mOptionButton;
    //private RelativeLayout mRlView;

    private String mPath;

     //@Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);

      }
         // Spinner spinner = (Spinner) findViewById(R.id.spinner);
       //   String[] letra = {"A","B","C","D","E"};
         // spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letra));}

    public void cambio(View view){
        Intent objI = new Intent(MainActivity.this, pantallados.class);
        startActivity(objI);
    }
}

