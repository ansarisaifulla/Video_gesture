package com.example.videogesture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;
import java.util.ArrayList;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    private GestureDetectorCompat gestureDetectorCompat=null;
    private VideoView videoView;

    TextView txt_n;
    TextView txt;
    public int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=(VideoView)findViewById(R.id.video_id);
        txt_n=(TextView)findViewById(R.id.txt_name);
        gestureControl ges=new gestureControl();
        ges.setActivity(this);
        gestureDetectorCompat=new GestureDetectorCompat(this,ges);

        String path1 = "android.resource://" + getPackageName() + "/" + R.raw.war;
        Uri uri1= Uri.parse(path1);
        videoView.setVideoURI(uri1);
               videoView.start();
               txt_n.setText("War Trailer");

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
         gestureDetectorCompat.onTouchEvent(event);
        return true;
    }
    public void swipeRight(){

        Intent intent;
        intent = new Intent(MainActivity.this,swipe.class);
        startActivity(intent);
    }
    public void swipeLeft() {


        OpenDialogue();
    }

    public void OpenDialogue() {
        Dialogue_act dia=new Dialogue_act();
        dia.show(getSupportFragmentManager(),"Subscribe");
    }

    public void swipeUp()
    {
        count++;
        if(count==5)
        {
            count=1;
        }



            switch(count)
            {
                case 1:
                    String path1 = "android.resource://" + getPackageName() + "/" + R.raw.war;
                    Uri uri1 = Uri.parse(path1);
                    videoView.setVideoURI(uri1);
                    videoView.start();
                    txt_n.setText("War Trailer");

                    break;
                case 2:
                    String path2 = "android.resource://" + getPackageName() + "/" + R.raw.animation;
                    Uri uri2 = Uri.parse(path2);
                    videoView.setVideoURI(uri2);
                    videoView.start();
                    txt_n.setText("Animation");
                    break;
                case 3:
                    String path3 = "android.resource://" + getPackageName() + "/" + R.raw.water;
                    Uri uri3 = Uri.parse(path3);
                    videoView.setVideoURI(uri3);
                    videoView.start();
                    txt_n.setText("WaterLife ");
                    break;
                case 4:
                    String path4 = "android.resource://" + getPackageName() + "/" + R.raw.compsa;
                    Uri uri4 = Uri.parse(path4);
                    videoView.setVideoURI(uri4);
                    videoView.start();
                    txt_n.setText("Compsa Trailer");
                    break;
            }


    }
    public void swipeDown()
    {

        count--;
        if(count==0)
        {
            count=4;
        }



        switch(count)
        {
            case 1:
                String path1 = "android.resource://" + getPackageName() + "/" + R.raw.war;
                Uri uri1 = Uri.parse(path1);
                videoView.setVideoURI(uri1);
                videoView.start();
                txt_n.setText("War Trailer");

                break;
            case 2:
                String path2 = "android.resource://" + getPackageName() + "/" + R.raw.animation;
                Uri uri2 = Uri.parse(path2);
                videoView.setVideoURI(uri2);
                videoView.start();
                txt_n.setText("Animation");
                break;
            case 3:
                String path3 = "android.resource://" + getPackageName() + "/" + R.raw.water;
                Uri uri3 = Uri.parse(path3);
                videoView.setVideoURI(uri3);
                videoView.start();
                txt_n.setText("WaterLife ");
                break;
            case 4:
                String path4 = "android.resource://" + getPackageName() + "/" + R.raw.compsa;
                Uri uri4 = Uri.parse(path4);
                videoView.setVideoURI(uri4);
                videoView.start();
                txt_n.setText("Compsa Trailer");
                break;
        }
    }
}
