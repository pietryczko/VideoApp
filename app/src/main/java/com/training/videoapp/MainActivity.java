 package com.training.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

 public class MainActivity extends AppCompatActivity {

    VideoView videoView, videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.video_view);
        videoView2 = findViewById(R.id.video_View2);

        //Local videos
        videoView.setVideoPath("android.resource://" + getPackageName()+"/" +R.raw.truck);

        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);
        videoView.start();

        //Videos from internet
        Uri uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/000/168/original/Record.mp4");
        videoView2.setVideoURI(uri);

        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        videoView2.setMediaController(mc2);
        videoView2.start();
    }
}