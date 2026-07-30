package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class InternalRectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x */
    public int f56453x;

    /* JADX INFO: renamed from: y */
    public int f56454y;

    public InternalRectangle(int i, int i2, int i3, int i4) {
        this.f56453x = i;
        this.f56454y = i2;
        this.width = i3;
        this.height = i4;
    }

    @CalledByNative
    public static InternalRectangle create(int i, int i2, int i3, int i4) {
        return new InternalRectangle(i, i2, i3, i4);
    }
}
