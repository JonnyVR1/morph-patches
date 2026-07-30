package com.momo.mcamera.mask.videomix;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import java.io.IOException;
import p149l.mcj;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(15)
public class VideoResourceInput extends MMTextureResourceInput1 implements SurfaceTexture.OnFrameAvailableListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final String LOG_TAG = "MediaPlayerInput";
    private boolean available;
    private boolean drawFirstFrame;

    /* JADX INFO: renamed from: fd */
    private AssetFileDescriptor f14258fd;
    private long firstFrameTime;
    int inputHeight;
    int inputWidth;
    protected boolean isFistFrame;
    boolean isPrepared;
    private Context mContext;
    int mFps;
    protected MediaPlayer mMediaPlayer;
    private Surface mSurface;
    IVideoResourceInputListener.OnCompletionListener onCompletionListener;
    IVideoResourceInputListener.OnPreparedListener onPreparedListener;
    IVideoResourceInputListener.OnVideoSizeChangedListener onVideoSizeChangedListener;
    IVideoResourceInputListener.RenderTimestampListener renderTimestampListener;
    String rtmpPath;
    long start_time;
    private long timestamp;

    public VideoResourceInput(Context context, AssetFileDescriptor assetFileDescriptor) {
        this.inputWidth = 720;
        this.inputHeight = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.isPrepared = false;
        this.mFps = 15;
        this.isFistFrame = false;
        this.timestamp = 0L;
        this.available = false;
        this.firstFrameTime = 0L;
        this.drawFirstFrame = false;
        this.mContext = context;
        this.f14258fd = assetFileDescriptor;
        start();
    }

    private void stopAndReleasePlayer() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        synchronized (mediaPlayer) {
            this.mMediaPlayer.setOnErrorListener(null);
            this.mMediaPlayer.setOnCompletionListener(null);
            this.mMediaPlayer.setOnPreparedListener(null);
            this.mMediaPlayer.setOnVideoSizeChangedListener(null);
            this.mMediaPlayer.setSurface(null);
            this.mMediaPlayer = null;
        }
    }

    public void catchErrorLog0() {
    }

    public void catchErrorLog1() {
    }

    @Override // com.momo.mcamera.mask.videomix.MMTextureResourceInput1, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        SurfaceTexture surfaceTexture = this.mText;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mText = null;
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
    }

    public int getInputHeight() {
        return this.inputHeight;
    }

    public int getInputWidth() {
        return this.inputWidth;
    }

    public SurfaceTexture getScreenTexture() {
        if (this.mText == null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.texture_in = iArr[0];
            this.mText = new SurfaceTexture(this.texture_in);
        }
        return this.mText;
    }

    @Override // com.momo.mcamera.mask.videomix.MMTextureResourceInput1, p149l.ccj
    @RequiresApi(api = 15)
    public void initWithGLContext() {
        super.initWithGLContext();
        if (this.mMediaPlayer != null) {
            getScreenTexture();
            this.mSurface = new Surface(this.mText);
            this.mText.setDefaultBufferSize(this.inputWidth, this.inputHeight);
            this.mText.setOnFrameAvailableListener(this);
            this.mMediaPlayer.setSurface(this.mSurface);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        IVideoResourceInputListener.OnCompletionListener onCompletionListener = this.onCompletionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(null);
        }
    }

    @Override // p149l.ccj
    public synchronized void onDrawFrame() {
        try {
            if (!this.drawFirstFrame) {
                this.firstFrameTime = this.mMediaPlayer.getCurrentPosition();
            }
            if (this.available) {
                if (!this.drawFirstFrame) {
                    this.drawFirstFrame = true;
                }
                loadTexture(this.texture_in, this.mText);
                super.onDrawFrame();
                IVideoResourceInputListener.RenderTimestampListener renderTimestampListener = this.renderTimestampListener;
                if (renderTimestampListener != null) {
                    float f = this.firstFrameTime;
                    int i = this.mFps;
                    float f2 = 1000.0f / i;
                    long j = this.timestamp;
                    if (f >= f2) {
                        j = (long) (j - (1000.0f / i));
                    }
                    if (j < 0) {
                        j = 0;
                    }
                    renderTimestampListener.onRenderTimestampChanged(j);
                }
                this.mText.updateTexImage();
                this.timestamp = this.mMediaPlayer.getCurrentPosition();
                this.available = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.available = true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.isPrepared = true;
        this.inputWidth = mediaPlayer.getVideoWidth();
        this.inputHeight = mediaPlayer.getVideoHeight();
        getScreenTexture();
        this.mText.setDefaultBufferSize(this.inputWidth, this.inputHeight);
        this.mText.setOnFrameAvailableListener(this);
        mediaPlayer.start();
        IVideoResourceInputListener.OnPreparedListener onPreparedListener = this.onPreparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mediaPlayer);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        int videoWidth = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.inputWidth = videoWidth;
        this.inputHeight = videoHeight;
        SurfaceTexture surfaceTexture = this.mText;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(videoWidth, videoHeight);
        }
        setRenderSize(videoWidth, videoHeight);
        this.isFistFrame = true;
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.isPrepared) {
            return;
        }
        mediaPlayer.pause();
    }

    public void resume() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.isPrepared) {
            return;
        }
        mediaPlayer.start();
    }

    public void seek(long j) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.isPrepared) {
            return;
        }
        mediaPlayer.seekTo((int) j);
    }

    public void setFps(int i) {
        this.mFps = i;
    }

    public void setOnCompletionListener(IVideoResourceInputListener.OnCompletionListener onCompletionListener) {
        this.onCompletionListener = onCompletionListener;
    }

    public void setOnPreparedListener(IVideoResourceInputListener.OnPreparedListener onPreparedListener) {
        this.onPreparedListener = onPreparedListener;
    }

    public void setOnVideoSizeChangedListener(IVideoResourceInputListener.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.onVideoSizeChangedListener = onVideoSizeChangedListener;
    }

    public void setRenderTimestampListener(IVideoResourceInputListener.RenderTimestampListener renderTimestampListener) {
        this.renderTimestampListener = renderTimestampListener;
    }

    public void start() {
        this.start_time = System.currentTimeMillis();
        if (this.mMediaPlayer != null) {
            stopAndReleasePlayer();
        }
        try {
            if (this.mText == null) {
                this.mText = getScreenTexture();
                this.mSurface = new Surface(this.mText);
            }
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.mMediaPlayer = mediaPlayer;
            mediaPlayer.setOnPreparedListener(this);
            this.mMediaPlayer.setOnCompletionListener(this);
            this.mMediaPlayer.setOnVideoSizeChangedListener(this);
            this.mMediaPlayer.setOnErrorListener(this);
            this.mMediaPlayer.setOnInfoListener(this);
            this.mMediaPlayer.setOnVideoSizeChangedListener(this);
            this.mMediaPlayer.setSurface(this.mSurface);
            AssetFileDescriptor assetFileDescriptor = this.f14258fd;
            MediaPlayer mediaPlayer2 = this.mMediaPlayer;
            if (assetFileDescriptor != null) {
                mediaPlayer2.setDataSource(assetFileDescriptor.getFileDescriptor(), this.f14258fd.getStartOffset(), this.f14258fd.getLength());
            } else {
                mediaPlayer2.setDataSource(this.rtmpPath.toString());
            }
            this.mMediaPlayer.prepareAsync();
            this.mMediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IOException unused) {
            stopAndReleasePlayer();
            catchErrorLog0();
        } catch (IllegalArgumentException unused2) {
            stopAndReleasePlayer();
            catchErrorLog1();
        }
    }

    public void stop() {
        this.isPrepared = false;
        stopAndReleasePlayer();
    }

    public mcj getInput() {
        return this;
    }

    public VideoResourceInput(Context context, String str, int i) {
        this.inputWidth = 720;
        this.inputHeight = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.isPrepared = false;
        this.isFistFrame = false;
        this.timestamp = 0L;
        this.available = false;
        this.firstFrameTime = 0L;
        this.drawFirstFrame = false;
        this.mContext = context;
        this.rtmpPath = str;
        this.mFps = i;
        start();
    }
}
