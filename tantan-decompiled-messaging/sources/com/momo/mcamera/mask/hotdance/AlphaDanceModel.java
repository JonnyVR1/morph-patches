package com.momo.mcamera.mask.hotdance;

/* JADX INFO: loaded from: classes7.dex */
public class AlphaDanceModel extends DanceModel {
    public float endAlpha;
    public boolean flash;
    public int repeatCount;
    public float startAlpha;

    public AlphaDanceModel(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, int i, long j) {
        super(f, f2, f3, f4, f5, f6, j);
        this.startAlpha = f7;
        this.endAlpha = f8;
        this.flash = z;
        this.repeatCount = i;
    }
}
