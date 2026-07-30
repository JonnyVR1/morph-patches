package com.momo.xeengine.widget;

import android.media.MediaPlayer;
import android.view.Surface;
import androidx.annotation.Keep;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class MediaPlayerImpl implements IVideoPlayer, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener {
    private String errorMessage;
    private CountDownLatch firstFrameLatch;
    private MediaPlayer mediaPlayer;
    private String videoPath;
    private boolean videoRenderingStart = false;
    private boolean hasError = false;
    private boolean mute = false;
    private float volume = 1.0f;

    public MediaPlayerImpl() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        mediaPlayer.setOnInfoListener(this);
        this.mediaPlayer.setOnErrorListener(this);
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public long getCurrentPosition() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public long getDuration() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public int getVideoHeight() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public int getVideoWidth() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.hasError = true;
        this.errorMessage = "what=" + i + ", extra=" + i2;
        CountDownLatch countDownLatch = this.firstFrameLatch;
        if (countDownLatch == null) {
            return false;
        }
        countDownLatch.countDown();
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        try {
            this.videoRenderingStart = true;
            CountDownLatch countDownLatch = this.firstFrameLatch;
            if (countDownLatch == null) {
                return false;
            }
            countDownLatch.countDown();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public boolean pause() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            try {
                this.mediaPlayer.pause();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public void prepare() throws IOException {
        this.videoRenderingStart = false;
        this.hasError = false;
        this.firstFrameLatch = new CountDownLatch(1);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.prepare();
        }
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public void quickStart() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(0);
            this.mediaPlayer.start();
        }
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public void release() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
        this.videoRenderingStart = false;
        this.hasError = false;
        this.firstFrameLatch = null;
        this.videoPath = null;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public boolean resume() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            try {
                this.mediaPlayer.start();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i);
        }
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public void setMute(boolean z) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                float f = this.volume;
                mediaPlayer.setVolume(f, f);
            }
            this.mute = z;
        }
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public void setSurface(Surface surface) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public void setVideo(String str) {
        this.videoPath = str;
        this.mediaPlayer.setDataSource(new XUIMediaSource(str));
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public void setVolume(float f) {
        this.volume = f;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || this.mute) {
            return;
        }
        mediaPlayer.setVolume(f, f);
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public boolean start() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            boolean z = true;
            if (this.videoRenderingStart) {
                mediaPlayer.seekTo(0);
                this.mediaPlayer.start();
                return true;
            }
            try {
                mediaPlayer.seekTo(0);
                this.videoRenderingStart = false;
                this.hasError = false;
                this.firstFrameLatch = new CountDownLatch(1);
                this.mediaPlayer.start();
                this.firstFrameLatch.await(1000L, TimeUnit.MILLISECONDS);
                this.firstFrameLatch = null;
                if (!this.videoRenderingStart || this.hasError || !this.mediaPlayer.isPlaying()) {
                    z = false;
                }
                if (!z && !this.hasError) {
                    this.errorMessage = "MediaPlayer start timeout";
                }
                return z;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.errorMessage = e.getMessage();
            }
        }
        return false;
    }

    @Override // com.momo.xeengine.widget.IVideoPlayer
    public boolean stop() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (!mediaPlayer.isPlaying()) {
                    return true;
                }
                this.mediaPlayer.seekTo(0);
                this.mediaPlayer.pause();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
