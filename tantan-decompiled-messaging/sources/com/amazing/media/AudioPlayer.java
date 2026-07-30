package com.amazing.media;

import android.media.MediaPlayer;
import com.amazing.annotation.EffectKeep;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class AudioPlayer {
    private MediaPlayer mMediaPlayer = new MediaPlayer();
    private String mPath;

    @EffectKeep
    public AudioPlayer(String str) {
        this.mPath = str;
    }

    @EffectKeep
    public void destroy() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
    }

    @EffectKeep
    public boolean isPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    @EffectKeep
    public void pause() {
        this.mMediaPlayer.pause();
    }

    @EffectKeep
    public void play() {
        this.mMediaPlayer.reset();
        if (prepare()) {
            this.mMediaPlayer.start();
        }
    }

    @EffectKeep
    public boolean prepare() {
        try {
            this.mMediaPlayer.setDataSource(this.mPath);
            this.mMediaPlayer.setAudioStreamType(3);
            this.mMediaPlayer.prepare();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @EffectKeep
    public void resume() {
        this.mMediaPlayer.start();
    }

    @EffectKeep
    public void setLoop(boolean z) {
        this.mMediaPlayer.setLooping(z);
    }

    @EffectKeep
    public void stop() {
        this.mMediaPlayer.stop();
    }
}
