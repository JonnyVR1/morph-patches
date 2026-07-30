package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class VideoFrameInfo {
    public int height;
    public VideoRotation rotation;
    public int width;

    @CalledByNative
    public VideoFrameInfo(int i, int i2, int i3) {
        this.width = 0;
        this.height = 0;
        this.rotation = VideoRotation.VIDEO_ROTATION_0;
        this.width = i;
        this.height = i2;
        this.rotation = VideoRotation.fromId(i3);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "VideoFrameInfo{width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + '}';
    }
}
