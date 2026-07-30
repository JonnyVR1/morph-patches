package com.immomo.mediabase;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class AudioResampleUtils {
    private ByteBuffer mTempBuffer;
    private long mPointer = 0;
    private long mScalePointrer = 0;
    private ByteBuffer mResultBufer = null;
    int mDstSamplerate = 0;
    int mDstSampleBits = 0;
    int mDstSampleChannels = 0;
    Object mSync = new Object();

    static {
        try {
            System.loadLibrary("mmcrypto");
            System.loadLibrary("mmssl");
            System.loadLibrary("cosmosffmpeg");
            System.loadLibrary("mediabase");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private native long nativeCreateNewSampler(int i, int i2, int i3, int i4, int i5, int i6);

    private native long nativeCreateNewScaler(int i, int i2, int i3);

    private native void nativeRelease(long j);

    private native void nativeReleaseScale(long j);

    private native int nativeResamplePcmData(long j, byte[] bArr, int i, byte[] bArr2);

    private native int nativeScalePcmData(long j, byte[] bArr, int i, float f, byte[] bArr2);

    public int initResampleInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (this.mSync) {
            try {
                this.mDstSamplerate = i4;
                this.mDstSampleBits = i6;
                this.mDstSampleChannels = i5;
                long jNativeCreateNewSampler = nativeCreateNewSampler(i, i2, i3, i4, i5, i6);
                this.mPointer = jNativeCreateNewSampler;
                return jNativeCreateNewSampler == 0 ? -1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int initScaleInfo(int i, int i2, int i3) {
        long jNativeCreateNewScaler = nativeCreateNewScaler(i, i2, i3);
        this.mScalePointrer = jNativeCreateNewScaler;
        return jNativeCreateNewScaler == 0 ? -1 : 0;
    }

    public void release() {
        synchronized (this.mSync) {
            try {
                long j = this.mPointer;
                if (j != 0) {
                    nativeRelease(j);
                    this.mPointer = 0L;
                }
                long j2 = this.mScalePointrer;
                if (j2 != 0) {
                    nativeReleaseScale(j2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ByteBuffer resamplePcmData(byte[] bArr, int i) {
        synchronized (this.mSync) {
            try {
                if (this.mPointer == 0) {
                    return null;
                }
                int i2 = (((i * 8) * this.mDstSampleChannels) * this.mDstSampleBits) / 8;
                ByteBuffer byteBuffer = this.mResultBufer;
                if (byteBuffer == null || byteBuffer.capacity() != i2) {
                    this.mResultBufer = ByteBuffer.allocate(i2);
                }
                this.mResultBufer.position(0);
                int iNativeResamplePcmData = nativeResamplePcmData(this.mPointer, bArr, i, this.mResultBufer.array());
                if (iNativeResamplePcmData <= 0) {
                    return null;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((iNativeResamplePcmData * this.mDstSampleBits) * this.mDstSampleChannels) / 8);
                this.mResultBufer.position(0);
                this.mResultBufer.get(byteBufferAllocate.array());
                byteBufferAllocate.position(0);
                return byteBufferAllocate;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int scalePcmData(ByteBuffer byteBuffer, int i, float f, ByteBuffer byteBuffer2) {
        if (this.mScalePointrer == 0) {
            return -1;
        }
        ByteBuffer byteBuffer3 = this.mTempBuffer;
        if (byteBuffer3 == null || byteBuffer3.capacity() < i) {
            this.mTempBuffer = ByteBuffer.allocate(i);
        }
        ByteBuffer byteBuffer4 = this.mTempBuffer;
        byteBuffer.position(0);
        byteBuffer4.position(0);
        byteBuffer.get(byteBuffer4.array(), 0, i);
        byteBuffer4.position(0);
        byteBuffer.position(0);
        int iNativeScalePcmData = nativeScalePcmData(this.mScalePointrer, byteBuffer4.array(), i, f, byteBuffer2.array());
        Log4Cam.m18379e("AudioResamplesUtils", "ret value is " + iNativeScalePcmData);
        return iNativeScalePcmData;
    }

    public int resamplePcmData(byte[] bArr, int i, byte[] bArr2) {
        synchronized (this.mSync) {
            try {
                long j = this.mPointer;
                if (j == 0) {
                    return -1;
                }
                return nativeResamplePcmData(j, bArr, i, bArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
