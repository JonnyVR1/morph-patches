package com.momo.xeengine.widget;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.momo.xeengine.XELogger;
import com.momo.xeengine.egl.GLFrameBuffer;
import com.momo.xeengine.egl.OESTextureRender;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class XUIVideoPlayer implements IXUIVideoPlayer {
    private static final String SUCCESS_FLAG = "success";
    private IVideoPlayer mediaPlayer;
    private final VideoSize renderSize;
    private OESTextureRender textureRender;
    private final VideoSize videoSize;
    private boolean enableTimeout = false;
    private float videoDuration = 0.0f;
    private final float[] textureMatrix = new float[16];
    private GLFrameBuffer frameBuffer = new GLFrameBuffer(false);
    private int videoOriginTexture = createTextureOES();
    private SurfaceTexture surfaceTexture = new SurfaceTexture(this.videoOriginTexture);
    private Surface surface = new Surface(this.surfaceTexture);

    public static class VideoSize {
        int height;
        int width;

        private VideoSize() {
        }

        public void set(int i) {
            this.width = i;
            this.height = i;
        }

        @NonNull
        public String toString() {
            return this.width + "x" + this.height;
        }
    }

    public XUIVideoPlayer() {
        this.videoSize = new VideoSize();
        this.renderSize = new VideoSize();
    }

    private int createTextureOES() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    private void fixMatrix(float[] fArr) {
        float[] fArr2 = new float[16];
        System.arraycopy(fArr, 0, fArr2, 0, 16);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f}, 0);
    }

    private static int videoWidthOfType(int i, int i2) {
        if (i2 == 1 || i2 == 2) {
            return i / 2;
        }
        return i2 != 3 ? i : (i / 3) * 2;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public int getCurrentTexture() {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer == null || !iVideoPlayer.isPlaying()) {
            return 0;
        }
        try {
            VideoSize videoSize = this.renderSize;
            if (videoSize.width > 0 && videoSize.height > 0) {
                this.surfaceTexture.updateTexImage();
                this.surfaceTexture.getTransformMatrix(this.textureMatrix);
                fixMatrix(this.textureMatrix);
                GLFrameBuffer gLFrameBuffer = this.frameBuffer;
                VideoSize videoSize2 = this.renderSize;
                gLFrameBuffer.resize(videoSize2.width, videoSize2.height);
                this.frameBuffer.bind();
                GLES20.glViewport(0, 0, this.frameBuffer.getWidth(), this.frameBuffer.getHeight());
                try {
                    this.textureRender.draw(this.videoOriginTexture, this.textureMatrix);
                } catch (Exception unused) {
                }
                this.frameBuffer.unbind();
                return this.frameBuffer.getColorTexture();
            }
        } catch (Exception unused2) {
        }
        return 0;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public float getCurrentTime() {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer != null) {
            return iVideoPlayer.getCurrentPosition() / 1000.0f;
        }
        return 0.0f;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public float getTotalDuration() {
        return this.videoDuration;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public int getVideoHeight() {
        return this.renderSize.height;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public int getVideoWidth() {
        return this.renderSize.width;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public boolean isPlaying() {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer != null) {
            return iVideoPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public String loadVideoAsset(String str, int i) {
        MediaPlayerImpl mediaPlayerImpl = new MediaPlayerImpl();
        this.mediaPlayer = mediaPlayerImpl;
        try {
            mediaPlayerImpl.setVideo(str);
            this.mediaPlayer.setSurface(this.surface);
            this.mediaPlayer.prepare();
            float duration = this.mediaPlayer.getDuration() / 1000.0f;
            this.videoDuration = duration;
            if (duration < 0.1d) {
                return "Invalid video duration: " + this.videoDuration;
            }
            this.videoSize.width = this.mediaPlayer.getVideoWidth();
            this.videoSize.height = this.mediaPlayer.getVideoHeight();
            VideoSize videoSize = this.videoSize;
            int i2 = videoSize.width;
            if (i2 >= 64 && videoSize.height >= 64) {
                this.renderSize.width = videoWidthOfType(i2, i);
                this.renderSize.height = this.videoSize.height;
                this.textureRender = new OESTextureRender(i);
                return SUCCESS_FLAG;
            }
            return "Invalid video dimensions: " + this.videoSize;
        } catch (Exception e) {
            this.mediaPlayer.release();
            this.mediaPlayer = null;
            return "Failed to load video: " + e;
        }
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public boolean pause() {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer == null || !iVideoPlayer.isPlaying()) {
            return false;
        }
        this.mediaPlayer.pause();
        return true;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public String play() {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer == null) {
            return "MediaPlayer is null";
        }
        if (!this.enableTimeout) {
            XELogger.debug("开始播放视频 不监听首帧回调");
            this.mediaPlayer.quickStart();
            return SUCCESS_FLAG;
        }
        if (!iVideoPlayer.start()) {
            return this.mediaPlayer.getErrorMessage();
        }
        XELogger.debug("开始播放视频 监听首帧回调");
        return SUCCESS_FLAG;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public void release() {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer != null) {
            iVideoPlayer.release();
            this.mediaPlayer = null;
        }
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.surfaceTexture = null;
            GLES20.glDeleteTextures(1, new int[]{this.videoOriginTexture}, 0);
            this.videoOriginTexture = 0;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        OESTextureRender oESTextureRender = this.textureRender;
        if (oESTextureRender != null) {
            oESTextureRender.release();
            this.textureRender = null;
        }
        GLFrameBuffer gLFrameBuffer = this.frameBuffer;
        if (gLFrameBuffer != null) {
            gLFrameBuffer.release();
            this.frameBuffer = null;
        }
        this.videoSize.set(0);
        this.renderSize.set(0);
        this.videoDuration = 0.0f;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public boolean resume() {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer == null || iVideoPlayer.isPlaying()) {
            return false;
        }
        this.mediaPlayer.start();
        return true;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public void setEnableTimeout(boolean z) {
        this.enableTimeout = z;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public boolean setMute(boolean z) {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer == null) {
            return false;
        }
        iVideoPlayer.setMute(z);
        return true;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public boolean setVolume(float f) {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer == null) {
            return false;
        }
        iVideoPlayer.setVolume(f);
        return true;
    }

    @Override // com.momo.xeengine.widget.IXUIVideoPlayer
    public boolean stop() {
        IVideoPlayer iVideoPlayer = this.mediaPlayer;
        if (iVideoPlayer == null) {
            return false;
        }
        if (!iVideoPlayer.isPlaying()) {
            return true;
        }
        this.mediaPlayer.seekTo(0);
        this.mediaPlayer.pause();
        return true;
    }
}
