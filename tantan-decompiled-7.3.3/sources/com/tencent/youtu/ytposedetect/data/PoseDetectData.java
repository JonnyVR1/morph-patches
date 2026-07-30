package com.tencent.youtu.ytposedetect.data;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class PoseDetectData {
    public int faceDetectStatus;
    public int faceQualityStatus;
    public Rect faceRect;
    public float[] faceShape;
    public float[] faceVisible;
    public int frameH;
    public int frameW;
    public byte[] imgData;
    public boolean isFaceShaking;
    public float pitch;
    public int postType;
    public float roll;
    public float yaw;

    public PoseDetectData(float[] fArr, float[] fArr2, int i, byte[] bArr, float f, float f2, float f3, int i2, int i3, Rect rect, int i4, int i5, boolean z) {
        this.faceShape = fArr;
        this.faceVisible = fArr2;
        this.postType = i;
        this.imgData = bArr;
        this.pitch = f;
        this.yaw = f2;
        this.roll = f3;
        this.faceDetectStatus = i2;
        this.faceQualityStatus = i3;
        this.faceRect = rect;
        this.frameW = i4;
        this.frameH = i5;
        this.isFaceShaking = z;
    }
}
