package com.tencent.liteav.basic.structs;

import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXSVideoFrame {
    public ByteBuffer buffer;
    public byte[] data;
    public Object eglContext;
    public int frameType;
    public int height;
    public long pts;
    public int rotation;
    public int textureId;
    public int width;

    private native void nativeLoadArrayFromBuffer(byte[] bArr, int i);

    private native void nativeLoadArrayFromGL(byte[] bArr, int i, int i2);

    private native void nativeLoadBufferFromGL(int i, int i2);

    private native void nativeLoadNV21BufferFromI420Buffer(int i, int i2);

    public byte[] I420toNV21(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr2 == null) {
            bArr2 = new byte[bArr.length];
        }
        int i3 = i * i2;
        int i4 = (i3 / 4) + i3;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        int i5 = i4;
        int i6 = i3;
        while (i3 < i4) {
            bArr2[i6] = bArr[i5];
            bArr2[i6 + 1] = bArr[i3];
            i3++;
            i5++;
            i6 += 2;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TXSVideoFrame m225064clone() {
        TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
        tXSVideoFrame.width = this.width;
        tXSVideoFrame.height = this.height;
        tXSVideoFrame.frameType = this.frameType;
        tXSVideoFrame.rotation = this.rotation;
        tXSVideoFrame.pts = this.pts;
        tXSVideoFrame.data = this.data;
        tXSVideoFrame.textureId = this.textureId;
        tXSVideoFrame.eglContext = this.eglContext;
        tXSVideoFrame.nativeClone(this.buffer);
        return tXSVideoFrame;
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public void loadNV21BufferFromI420Buffer() {
        nativeLoadNV21BufferFromI420Buffer(this.width, this.height);
    }

    public void loadYUVArray(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i = this.width;
            int i2 = this.height;
            if (length < ((i * i2) * 3) / 2) {
                return;
            }
            if (this.buffer == null) {
                GLES20.glReadPixels(0, 0, i, (i2 * 3) / 8, 6408, 5121, ByteBuffer.wrap(bArr));
            } else {
                nativeLoadArrayFromBuffer(bArr, ((i * i2) * 3) / 2);
            }
        }
    }

    public void loadYUVBufferFromGL() {
        nativeLoadBufferFromGL(this.width, this.height);
    }

    public native void nativeClone(ByteBuffer byteBuffer);

    public native void release();
}
