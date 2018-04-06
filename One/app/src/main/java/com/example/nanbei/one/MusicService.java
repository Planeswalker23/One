package com.example.nanbei.one;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

/**
 * Created by nanbei on 2017/12/25.
 */


public class MusicService extends Service {
    public MediaPlayer mediaPlayer;
    public boolean tag = false;

    public MusicService() {
        mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer = MediaPlayer.create(this, R.raw.music);
            //mediaPlayer.setDataSource("/data/music.mp3");
            mediaPlayer.prepare();
            mediaPlayer.setLooping(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //  通过 Binder 来保持 Activity 和 Service 的通信
    public MyBinder binder = new MyBinder();
    public class MyBinder extends Binder {
        MusicService getService() {
            return MusicService.this;
        }
    }

    public void playOrPause() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        } else {
            mediaPlayer.start();
        }
    }

    public void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            try {
                mediaPlayer.reset();
                mediaPlayer = MediaPlayer.create(this, R.raw.music);
                //mediaPlayer.setDataSource("/data/music.mp3");
                mediaPlayer.prepare();
                mediaPlayer.seekTo(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
}

