package com.core.glcore.util;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ImageFrame {
    public int format;
    public int height;
    public ByteBuffer imageByteBuffer;
    byte[] imageByteData;
    public int step;
    public int width;

    public class MMFormat {
        public static final int FMT_BGR = 24;
        public static final int FMT_BGRA = 5;
        public static final int FMT_NONE = 0;
        public static final int FMT_NV12 = 18;
        public static final int FMT_NV21 = 17;
        public static final int FMT_RGB = 25;
        public static final int FMT_RGBA = 4;

        public MMFormat() {
        }
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public ByteBuffer getImageByteBuffer() {
        return this.imageByteBuffer;
    }

    public byte[] getImageByteData() {
        return this.imageByteData;
    }

    public int getStep() {
        return this.step;
    }

    public int getWidth() {
        return this.width;
    }

    public void setFormat(int i) {
        this.format = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageByteBuffer(ByteBuffer byteBuffer) {
        this.imageByteBuffer = byteBuffer;
    }

    public void setStep(int i) {
        this.step = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
