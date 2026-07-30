package com.idv.identity.base.algorithm;

/* JADX INFO: loaded from: classes7.dex */
public class IDFrame {
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_DEPTH = 7;
    public static final int MODE_GRAY_16 = 6;
    public static final int MODE_GRAY_8 = 5;
    public static final int MODE_IRIS = 6;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;
    public static final int TYPE_BLINK = 7;
    public static final int TYPE_FAR = 2;
    public static final int TYPE_LEFT = 5;
    public static final int TYPE_LIGHT = 0;
    public static final int TYPE_MOUTH = 4;
    public static final int TYPE_NEAR = 3;
    public static final int TYPE_QUALITY_FACE = 1;
    public static final int TYPE_RIGHT = 6;
    public byte[] data;
    public int frameMode;
    public int frameType;
    public int height;
    public int rHeight;
    public int rWidth;
    public byte[] rgba;
    public byte[] rotateData;
    public int rotation;
    public int width;

    public IDFrame(IDFrame iDFrame) {
        if (iDFrame != null) {
            byte[] bArr = iDFrame.rgba;
            if (bArr != null) {
                this.rgba = (byte[]) bArr.clone();
            }
            this.width = iDFrame.width;
            this.height = iDFrame.height;
            this.rotation = iDFrame.rotation;
            this.frameMode = iDFrame.frameMode;
            this.frameType = iDFrame.frameType;
        }
    }

    public void recycle() {
        this.rgba = null;
    }

    public String toString() {
        return "TGFrame{data=***, width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + ", frameMode=" + this.frameMode + ", frameType=" + this.frameType + '}';
    }

    public IDFrame(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.frameMode = i4;
        this.frameType = i5;
    }

    public IDFrame() {
    }
}
