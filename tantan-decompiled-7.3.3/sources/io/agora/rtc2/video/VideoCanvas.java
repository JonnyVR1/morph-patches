package io.agora.rtc2.video;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.View;
import io.agora.rtc2.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class VideoCanvas {
    public static final int RENDER_MODE_ADAPTIVE = 3;
    public static final int RENDER_MODE_FIT = 2;
    public static final int RENDER_MODE_HIDDEN = 1;
    public static final int VIEW_SETUP_MODE_ADD = 1;
    public static final int VIEW_SETUP_MODE_REMOVE = 2;
    public static final int VIEW_SETUP_MODE_REPLACE = 0;
    public int backgroundColor;
    public boolean enableAlphaMask;
    public int mediaPlayerId;
    public int mirrorMode;
    public Constants.VideoModulePosition position;
    public Rect rect;
    public int renderMode;
    public int setupMode;
    public int sourceType;
    public int subviewUid;
    public SurfaceTexture surfaceTexture;
    public int uid;
    public View view;

    public VideoCanvas(View view, int i, int i2, int i3) {
        this.setupMode = 0;
        this.position = Constants.VideoModulePosition.VIDEO_MODULE_POSITION_POST_CAPTURER;
        this.uid = i2;
        this.subviewUid = i3;
        this.view = view;
        this.renderMode = i;
        this.backgroundColor = 0;
    }

    public VideoCanvas(View view, int i, int i2) {
        this.setupMode = 0;
        this.position = Constants.VideoModulePosition.VIDEO_MODULE_POSITION_POST_CAPTURER;
        this.uid = i2;
        this.view = view;
        this.renderMode = i;
        this.backgroundColor = 0;
    }

    public VideoCanvas(View view) {
        this.setupMode = 0;
        this.position = Constants.VideoModulePosition.VIDEO_MODULE_POSITION_POST_CAPTURER;
        this.uid = 0;
        this.view = view;
        this.renderMode = 1;
        this.backgroundColor = 0;
    }
}
