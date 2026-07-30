package com.tencent.youtu.ytagreflectlivecheck.data;

/* JADX INFO: loaded from: classes2.dex */
public class YTActReflectImage {
    public String checksum;
    public byte[] image;
    public float[] xys;

    public YTActReflectImage(byte[] bArr, float[] fArr, String str) {
        this.image = bArr;
        this.xys = fArr;
        this.checksum = str;
    }
}
