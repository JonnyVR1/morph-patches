package com.imomo.momo.mediamuxer;

/* JADX INFO: loaded from: classes7.dex */
public class MediaMuxer {
    public static final int MEDIA_MUXER_FLV = 2;
    public static final int MEDIA_MUXER_MP4 = 1;
    public static final int MEDIA_MUXER_NONE = 0;
    private static final String TAG = "MediaMuxer";
    private long mHandler = 0;

    static {
        try {
            System.loadLibrary("mdlog");
            System.loadLibrary("mmcrypto");
            System.loadLibrary("mmssl");
            System.loadLibrary("cosmosffmpeg");
            System.loadLibrary("c++_shared");
            System.loadLibrary(TAG);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeAddAudioStream(long j, int i, int i2, int i3);

    private native int nativeAddVideoStream(long j, int i, int i2, byte[] bArr, int i3, int i4);

    private native long nativeInitMuxer(int i);

    private native void nativeRelease(long j);

    private native int nativeSetFileName(long j, String str);

    private native int nativeWriteAudioFrame(long j, byte[] bArr, int i, long j2);

    private native int nativeWriteHeader(long j);

    private native int nativeWriteTrailer(long j);

    private native int nativeWriteVideoFrame(long j, byte[] bArr, int i, long j2, long j3, int i2);

    public boolean addAudioStream(int i, int i2, int i3) {
        return nativeAddAudioStream(this.mHandler, i, i2, i3) == 0;
    }

    public boolean addVideoStream(int i, int i2, byte[] bArr, int i3, int i4) {
        return nativeAddVideoStream(this.mHandler, i, i2, bArr, i3, i4) == 0;
    }

    public boolean initMuxer(int i) {
        long jNativeInitMuxer = nativeInitMuxer(i);
        this.mHandler = jNativeInitMuxer;
        return jNativeInitMuxer > 0;
    }

    public void release() {
        nativeRelease(this.mHandler);
        this.mHandler = 0L;
    }

    public void setFileName(String str) {
        nativeSetFileName(this.mHandler, str);
    }

    public boolean writeAudioFrame(byte[] bArr, int i, long j) {
        return nativeWriteAudioFrame(this.mHandler, bArr, i, j) == 0;
    }

    public boolean writeHeader() {
        return nativeWriteHeader(this.mHandler) == 0;
    }

    public boolean writeTrailer() {
        return nativeWriteTrailer(this.mHandler) == 0;
    }

    public boolean writeVideoFrame(byte[] bArr, int i, long j, long j2, int i2) {
        return nativeWriteVideoFrame(this.mHandler, bArr, i, j, j2, i2) == 0;
    }
}
