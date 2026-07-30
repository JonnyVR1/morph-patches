package com.p074ss.bytertc.engine;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.p074ss.bytertc.engine.data.VideoRotation;

/* JADX INFO: loaded from: classes11.dex */
public class VideoCanvas {
    public static final int RENDER_MODE_FILL = 3;
    public static final int RENDER_MODE_FIT = 2;
    public static final int RENDER_MODE_HIDDEN = 1;
    public int backgroundColor;
    public int renderMode;
    public VideoRotation renderRotation;
    public Surface renderSurface;
    public View renderView;

    public VideoCanvas() {
        this.renderView = null;
        this.renderSurface = null;
        this.renderMode = 1;
        this.backgroundColor = 0;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public String toString() {
        return "VideoCanvas{, textureView=" + this.renderView + ", surface=" + this.renderSurface + ", renderMode=" + this.renderMode + ", background_color=" + this.backgroundColor + ", renderRotation=" + this.renderRotation.value() + '}';
    }

    public VideoCanvas(SurfaceView surfaceView, int i) {
        this.renderView = surfaceView;
        this.renderSurface = null;
        this.renderMode = i;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public VideoCanvas(TextureView textureView, int i) {
        this.renderView = textureView;
        this.renderSurface = null;
        this.renderMode = i;
        this.backgroundColor = 0;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public VideoCanvas(SurfaceView surfaceView, int i, int i2) {
        this.renderView = surfaceView;
        this.renderSurface = null;
        this.renderMode = i;
        this.backgroundColor = i2;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public VideoCanvas(TextureView textureView, int i, int i2) {
        this.renderView = textureView;
        this.renderSurface = null;
        this.renderMode = i;
        this.backgroundColor = i2;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public VideoCanvas(Surface surface, int i) {
        this.renderSurface = surface;
        this.renderView = null;
        this.renderMode = i;
        this.backgroundColor = 0;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public VideoCanvas(Surface surface, int i, int i2) {
        this.renderSurface = surface;
        this.renderView = null;
        this.renderMode = i;
        this.backgroundColor = i2;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }
}
