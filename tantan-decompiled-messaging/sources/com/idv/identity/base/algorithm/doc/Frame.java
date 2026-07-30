package com.idv.identity.base.algorithm.doc;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class Frame {
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_DEPTH = 7;
    public static final int MODE_GRAY_16 = 6;
    public static final int MODE_GRAY_8 = 5;
    public static final int MODE_IRIS = 6;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;
    public static final int TYPE_DARK = 1;
    public static final int TYPE_DEPTH = 2;
    public static final int TYPE_GRAY_NANO = 5;
    public static final int TYPE_IR = 3;
    public static final int TYPE_LIGHT = 0;
    public static final int TYPE_NANO = 4;
    public ByteBuffer byteBuffer;
    public byte[] data;
    public int frameMode;
    public int frameType;
    public int height;
    public int rotation;
    public int width;

    public Frame(Frame frame) {
        if (frame != null) {
            byte[] bArr = frame.data;
            if (bArr != null) {
                this.data = (byte[]) bArr.clone();
            }
            this.width = frame.width;
            this.height = frame.height;
            this.rotation = frame.rotation;
            this.frameMode = frame.frameMode;
            this.frameType = frame.frameType;
            this.byteBuffer = frame.byteBuffer;
        }
    }

    public Frame deepCopy() {
        Frame frame = new Frame((byte[]) null, this.width, this.height, this.rotation, this.frameMode, this.frameType);
        frame.width = this.width;
        frame.height = this.height;
        frame.rotation = this.rotation;
        frame.frameMode = this.frameMode;
        frame.frameType = this.frameType;
        byte[] bArr = this.data;
        if (bArr != null && bArr.length != 0) {
            frame.data = Arrays.copyOf(bArr, bArr.length);
            return frame;
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        if (byteBuffer != null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
            this.byteBuffer.rewind();
            byteBufferAllocate.put(this.byteBuffer);
            this.byteBuffer.rewind();
            byteBufferAllocate.rewind();
            frame.data = byteBufferAllocate.array();
        }
        return frame;
    }

    public void recycle() {
        this.data = null;
        this.byteBuffer = null;
    }

    public String toString() {
        return "TGFrame{data=***, width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + ", frameMode=" + this.frameMode + ", frameType=" + this.frameType + '}';
    }

    public Frame(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.frameMode = i4;
        this.frameType = i5;
    }

    public Frame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        this.byteBuffer = byteBuffer;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.frameMode = i4;
        this.frameType = i5;
    }

    public Frame() {
    }
}
