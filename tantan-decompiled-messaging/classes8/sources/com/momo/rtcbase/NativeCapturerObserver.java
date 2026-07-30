package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class NativeCapturerObserver implements CapturerObserver {
    private final long nativeSource;

    @CalledByNative
    public NativeCapturerObserver(long j) {
        this.nativeSource = j;
    }

    private static native void nativeCapturerStarted(long j, boolean z);

    private static native void nativeCapturerStopped(long j);

    private static native void nativeOnFrameCaptured(long j, int i, int i2, int i3, long j2, VideoFrame.Buffer buffer);

    @Override // com.momo.rtcbase.CapturerObserver
    public void onCapturerStarted(boolean z) {
        nativeCapturerStarted(this.nativeSource, z);
    }

    @Override // com.momo.rtcbase.CapturerObserver
    public void onCapturerStopped() {
        nativeCapturerStopped(this.nativeSource);
    }

    @Override // com.momo.rtcbase.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }
}
