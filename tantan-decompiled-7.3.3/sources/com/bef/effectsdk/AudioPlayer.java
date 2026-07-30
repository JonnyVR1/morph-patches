package com.bef.effectsdk;

import android.media.MediaPlayer;
import android.util.Log;
import com.amazing.annotation.EffectKeep;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class AudioPlayer {
    public static final String TAG = "AudioPlayer";
    private long mNativePtr;
    private MediaPlayer mMediaPlayer = null;
    private boolean mIsPrepared = false;
    private String mFilename = null;

    @EffectKeep
    public AudioPlayer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EffectKeep
    public native void nativeOnCompletion(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @EffectKeep
    public native void nativeOnError(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    @EffectKeep
    public native void nativeOnInfo(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    @EffectKeep
    public native void nativeOnPrepared(long j);

    @EffectKeep
    public float getCurrentPlayTime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition() / 1000.0f;
        }
        Log.e(TAG, "MediaPlayer is null!");
        return 0.0f;
    }

    @EffectKeep
    public float getTotalPlayTime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration() / 1000.0f;
        }
        Log.e(TAG, "MediaPlayer is null!");
        return 0.0f;
    }

    @EffectKeep
    public int init() {
        this.mIsPrepared = false;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer2;
        mediaPlayer2.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.bef.effectsdk.AudioPlayer.1
            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer3, int i, int i2) {
                String str = AudioPlayer.TAG;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnInfo(audioPlayer.mNativePtr, i, i2);
                return false;
            }
        });
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.bef.effectsdk.AudioPlayer.2
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer3, int i, int i2) {
                String str = AudioPlayer.TAG;
                try {
                    AudioPlayer.this.mMediaPlayer.stop();
                    AudioPlayer.this.mMediaPlayer.release();
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(AudioPlayer.TAG, "MediaPlayer stop exception on error " + e.toString());
                }
                AudioPlayer.this.mMediaPlayer = null;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnError(audioPlayer.mNativePtr, i, i2);
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.bef.effectsdk.AudioPlayer.3
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer3) {
                String str = AudioPlayer.TAG;
                AudioPlayer.this.mIsPrepared = true;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnPrepared(audioPlayer.mNativePtr);
            }
        });
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.bef.effectsdk.AudioPlayer.4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer3) {
                String str = AudioPlayer.TAG;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnCompletion(audioPlayer.mNativePtr);
            }
        });
        return 0;
    }

    @EffectKeep
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            Log.e(TAG, "MediaPlayer is null!");
            return false;
        }
        if (!this.mIsPrepared) {
            Log.e(TAG, "MediaPlayer is null!");
            return false;
        }
        try {
            return mediaPlayer.isPlaying();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "MediaPlayer isPlaying exception. " + e.toString());
            return false;
        }
    }

    @EffectKeep
    public boolean pause() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            Log.e(TAG, "MediaPlayer is null!");
            return false;
        }
        if (this.mIsPrepared) {
            mediaPlayer.pause();
            return true;
        }
        Log.e(TAG, "MediaPlayer is null!");
        return false;
    }

    @EffectKeep
    public int release() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        try {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "MediaPlayer stop exception on release " + e.toString());
        }
        this.mMediaPlayer = null;
        return 0;
    }

    @EffectKeep
    public boolean resume() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            Log.e(TAG, "MediaPlayer is null!");
            return false;
        }
        if (this.mIsPrepared) {
            mediaPlayer.start();
            return true;
        }
        Log.e(TAG, "MediaPlayer is null!");
        return false;
    }

    @EffectKeep
    public boolean seek(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            Log.e(TAG, "MediaPlayer is null!");
            return false;
        }
        if (!this.mIsPrepared) {
            Log.e(TAG, "MediaPlayer is null!");
            return false;
        }
        try {
            mediaPlayer.seekTo(i);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "MediaPlayer seek exception. " + e.toString());
            return true;
        }
    }

    @EffectKeep
    public void setDataSource(String str) {
        if (this.mMediaPlayer == null) {
            init();
        }
        if (str.equals(this.mFilename) && this.mIsPrepared && this.mMediaPlayer.isPlaying()) {
            return;
        }
        try {
            this.mMediaPlayer.reset();
            this.mMediaPlayer.setDataSource(str);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "MediaPlayer setDataSource exception. " + e.toString());
        }
        this.mFilename = str;
    }

    @EffectKeep
    public boolean setLoop(boolean z) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            Log.e(TAG, "MediaPlayer is null!");
            return false;
        }
        mediaPlayer.setLooping(z);
        return true;
    }

    @EffectKeep
    public void setNativePtr(long j) {
        this.mNativePtr = j;
    }

    @EffectKeep
    public boolean setVolume(float f) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            Log.e(TAG, "MediaPlayer is null!");
            return false;
        }
        if (this.mIsPrepared) {
            mediaPlayer.setVolume(f, f);
            return true;
        }
        Log.e(TAG, "MediaPlayer is null!");
        return false;
    }

    @EffectKeep
    public void startPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        try {
            if (!this.mIsPrepared) {
                mediaPlayer.prepare();
                this.mIsPrepared = true;
            }
            this.mMediaPlayer.start();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "MediaPlayer setDataSource exception. " + e.toString());
        }
    }

    @EffectKeep
    public void stopPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            Log.e(TAG, "MediaPlayer is null!");
            return;
        }
        if (this.mIsPrepared) {
            try {
                mediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(TAG, "MediaPlayer stop exception on stop " + e.toString());
            }
            this.mMediaPlayer = null;
            this.mIsPrepared = false;
        }
    }
}
