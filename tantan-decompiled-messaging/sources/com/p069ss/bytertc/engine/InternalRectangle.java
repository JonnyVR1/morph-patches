package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class InternalRectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x */
    public int f55605x;

    /* JADX INFO: renamed from: y */
    public int f55606y;

    public InternalRectangle(int i, int i2, int i3, int i4) {
        this.f55605x = i;
        this.f55606y = i2;
        this.width = i3;
        this.height = i4;
    }

    @CalledByNative
    public static InternalRectangle create(int i, int i2, int i3, int i4) {
        return new InternalRectangle(i, i2, i3, i4);
    }
}
