package com.imomo.momo.mediaencoder;

/* JADX INFO: loaded from: classes7.dex */
public class MediaEncoder extends FFMediaUtils {
    public static final int MEDIA_ENCODER_NONE = 0;
    public static final int MEDIA_ENCODER_X264 = 1;
    public static final int MEDIA_ENCODER_X265 = 2;
    private static final String TAG = "MediaEncoder";
    private long mHandler = 0;

    private native int nativeDequeueOutputBuffer(long j, byte[] bArr, long j2, EncodedDataInfo encodedDataInfo);

    private native void nativeFlush(long j);

    private native long nativeInitEncoder(int i);

    private native int nativeQueueInBuffer(long j, byte[] bArr, long j2, long j3);

    private native void nativeRelease(long j);

    private native int nativeSetParam(long j, EncodeParam encodeParam);

    private native void nativeStartEncoding(long j);

    private native void nativeStopEncoding(long j);

    public boolean dequeueOutputBuffer(byte[] bArr, long j, EncodedDataInfo encodedDataInfo) {
        return nativeDequeueOutputBuffer(this.mHandler, bArr, j, encodedDataInfo) == 0;
    }

    public void flush() {
        nativeFlush(this.mHandler);
    }

    public int initEncoder(int i) {
        long jNativeInitEncoder = nativeInitEncoder(i);
        this.mHandler = jNativeInitEncoder;
        return jNativeInitEncoder > 0 ? 0 : -1;
    }

    public boolean queueInBuffer(byte[] bArr, long j, long j2) {
        return nativeQueueInBuffer(this.mHandler, bArr, j, j2) == 0;
    }

    public void release() {
        nativeRelease(this.mHandler);
        this.mHandler = 0L;
    }

    public boolean setParam(EncodeParam encodeParam) {
        return nativeSetParam(this.mHandler, encodeParam) == 0;
    }

    public void startEncoding() {
        nativeStartEncoding(this.mHandler);
    }

    public void stopEncoding() {
        nativeStopEncoding(this.mHandler);
    }
}
