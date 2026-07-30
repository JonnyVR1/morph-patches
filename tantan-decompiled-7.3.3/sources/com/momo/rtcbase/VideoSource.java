package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
public class VideoSource extends MediaSource {
    private final NativeCapturerObserver capturerObserver;

    public VideoSource(long j) {
        super(j);
        this.capturerObserver = new NativeCapturerObserver(nativeGetInternalSource(j));
    }

    private static native void nativeAdaptOutputFormat(long j, int i, int i2, int i3, int i4, int i5);

    private static native long nativeGetInternalSource(long j);

    public void adaptOutputFormat(int i, int i2, int i3) {
        int iMax = Math.max(i, i2);
        int iMin = Math.min(i, i2);
        adaptOutputFormat(iMax, iMin, iMin, iMax, i3);
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void adaptOutputFormat(int i, int i2, int i3, int i4, int i5) {
        nativeAdaptOutputFormat(getNativeVideoTrackSource(), i, i2, i3, i4, i5);
    }
}
