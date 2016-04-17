package cherinoh.soundbiteapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ImageButton imgButton1, imgButton2, imgButton3, imgButton4, imgButton5, imgButton6;  //Trump, Cruz, Carson, Obama, Kasich, Huckabee
    Button button;
    private MediaPlayer mp1, mp2, mp3, mp4, mp5, mp6, MLG; //same order, airhorn

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying1();
                stopPlaying2();
                stopPlaying3();
                stopPlaying4();
                stopPlaying5();
                stopPlaying6();
                mp2 = MediaPlayer.create(MainActivity.this, R.raw.trump);
                mp2.start();
            }
        });
        imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying1();
                stopPlaying2();
                stopPlaying3();
                stopPlaying4();
                stopPlaying5();
                stopPlaying6();
                mp2 = MediaPlayer.create(MainActivity.this, R.raw.cruz2);
                mp2.start();
            }
        });
        imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying1();
                stopPlaying2();
                stopPlaying3();
                stopPlaying4();
                stopPlaying5();
                stopPlaying6();
                mp3 = MediaPlayer.create(MainActivity.this, R.raw.ben);
                mp3.start();
            }
        });

        imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying1();
                stopPlaying2();
                stopPlaying3();
                stopPlaying4();
                stopPlaying5();
                stopPlaying6();
                mp4 = MediaPlayer.create(MainActivity.this, R.raw.obama);
                mp4.start();
            }
        });
        imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying1();
                stopPlaying2();
                stopPlaying3();
                stopPlaying4();
                stopPlaying5();
                stopPlaying6();
                mp5 = MediaPlayer.create(MainActivity.this, R.raw.kasich);
                mp5.start();
            }
        });
        imgButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying1();
                stopPlaying2();
                stopPlaying3();
                stopPlaying4();
                stopPlaying5();
                stopPlaying6();
                mp6 = MediaPlayer.create(MainActivity.this, R.raw.huckabee);
                mp6.start();
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MLG = MediaPlayer.create(MainActivity.this, R.raw.mlg);
                MLG.start();
            }
        });
    }
    private void stopPlaying1(){
        if (mp1 != null) {
            mp1.stop();
            mp1.release();
            mp1 = null;
        }
    }
    private void stopPlaying2(){
        if (mp2 != null) {
            mp2.stop();
            mp2.release();
            mp2 = null;
        }
    }
    private void stopPlaying3(){
        if (mp3 != null) {
            mp3.stop();
            mp3.release();
            mp3 = null;
        }
    }
    private void stopPlaying4(){
        if (mp4 != null) {
            mp4.stop();
            mp4.release();
            mp4 = null;
        }
    }
    private void stopPlaying5(){
        if (mp5 != null) {
            mp5.stop();
            mp5.release();
            mp5 = null;
        }
    }
    private void stopPlaying6(){
        if (mp6 != null) {
            mp6.stop();
            mp6.release();
            mp6 = null;
        }
    }
}