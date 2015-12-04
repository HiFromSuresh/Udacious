package com.gmail.sureshssk2006.udacious;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.spotify_streamer);
        //btn.setOnClickListener(this);
    }

    public void spotifyStreamer(View view){
        Toast.makeText(getApplicationContext(), "You have clicked the Spotify streamer", Toast.LENGTH_SHORT).show();
    }

    public void scoresApp(View view){
        Toast.makeText(getApplicationContext(),"You have clicked the Scores App", Toast.LENGTH_SHORT).show();
    }

    public void libraryApp(View view){
        Toast.makeText(getApplicationContext(),"You have clicked the Library app", Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View view){
        Toast.makeText(getApplicationContext(),"You have clicked the buildItBigger", Toast.LENGTH_SHORT).show();
    }

    public void xyzReader(View view){
        Toast.makeText(getApplicationContext(),"You have clicked the xyzReader", Toast.LENGTH_SHORT).show();
    }

    public void myOwnApp(View view){
        Toast.makeText(getApplicationContext(),"You have clicked the My Own App", Toast.LENGTH_SHORT).show();
    }
}
