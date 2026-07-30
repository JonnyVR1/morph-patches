package com.momo.mcamera.mask.hotdance;

/* JADX INFO: loaded from: classes8.dex */
public class DanceModel {
    public long duration;
    public float endScale;
    public float endTranslateX;
    public float endTranslateY;
    public float startScale;
    public float startTranslateX;
    public float startTranslateY;

    public DanceModel(float f, float f2, float f3, float f4, float f5, float f6, long j) {
        this.startScale = f;
        this.endScale = f2;
        this.startTranslateX = f3;
        this.endTranslateX = f4;
        this.startTranslateY = f5;
        this.endTranslateY = f6;
        this.duration = j;
    }
}
