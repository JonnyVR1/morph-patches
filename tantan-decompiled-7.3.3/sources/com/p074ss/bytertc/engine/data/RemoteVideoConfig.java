package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class RemoteVideoConfig {
    public int framerate;
    public int height;
    public int width;

    @CalledByNative
    public RemoteVideoConfig(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.framerate = i3;
    }

    public int getFrameRate() {
        return this.framerate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "RemoteVideoConfig{width=" + this.width + ", height=" + this.height + ", framerate=" + this.framerate + '}';
    }
}
