package com.momo.xengine.media.types;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class VideoFrame {
    private boolean filp;
    private int height;
    private int width;
    private byte[] data = null;
    private int lineSize = 0;
    private long timestamp = 0;
    private boolean flipY = false;
    private PixelFormat format = PixelFormat.VIDEO_FORMAT_NONE;
    private float speed = 1.0f;

    public byte[] getData() {
        return this.data;
    }

    @NotNull
    public PixelFormat getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLineSize() {
        return this.lineSize;
    }

    public float getSpeed() {
        return this.speed;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFilp() {
        return this.filp;
    }

    public boolean isFlipY() {
        return this.flipY;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setFilp(boolean z) {
        this.filp = z;
    }

    public void setFlipY(boolean z) {
        this.flipY = z;
    }

    public void setFormat(int i) {
        this.format = PixelFormat.valueOf(i);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLineSize(int i) {
        this.lineSize = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setFormat(@NotNull PixelFormat pixelFormat) {
        this.format = pixelFormat;
    }
}
