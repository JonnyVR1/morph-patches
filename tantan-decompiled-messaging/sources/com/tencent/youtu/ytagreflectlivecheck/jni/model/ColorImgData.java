package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* JADX INFO: loaded from: classes2.dex */
public class ColorImgData {
    public long capture_time;
    public String checksum;
    public String image;

    /* JADX INFO: renamed from: x */
    public int f60838x;

    /* JADX INFO: renamed from: y */
    public int f60839y;

    public long getCapture_time() {
        return this.capture_time;
    }

    public String getImage() {
        return this.image;
    }

    public int getX() {
        return this.f60838x;
    }

    public int getY() {
        return this.f60839y;
    }

    public void setCapture_time(long j) {
        this.capture_time = j;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setX(int i) {
        this.f60838x = i;
    }

    public void setY(int i) {
        this.f60839y = i;
    }
}
