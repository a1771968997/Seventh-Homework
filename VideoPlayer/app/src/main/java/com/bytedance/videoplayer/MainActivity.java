package com.bytedance.videoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoview);
        mediaController =new MediaController(this);
        videoView.setVideoPath(getVideoPath(R.raw.bytedance));
        videoView.setMediaController(mediaController);
        videoView.start();
        videoView.requestFocus();
        //ImageView imageView = findViewById(R.id.imageView);
        //tring url = "https://s3.pstatp.com/toutiao/static/img/logo.271e845.png";
        //Glide.with(this).load(url).into(imageView);
    }
    private String getVideoPath(int resId) {
        return "android.resource://" + this.getPackageName() + "/" + resId;
    }
}
