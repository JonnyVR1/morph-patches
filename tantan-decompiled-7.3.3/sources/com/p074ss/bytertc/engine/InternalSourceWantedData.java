package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalSourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public InternalSourceWantedData(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
    }

    @CalledByNative
    private static InternalSourceWantedData create(int i, int i2, int i3) {
        return new InternalSourceWantedData(i, i2, i3);
    }

    public String toString() {
        return "InternalSourceWantedData{width='" + this.width + "', height='" + this.height + "', frameRate='" + this.frameRate + "'}";
    }
}
