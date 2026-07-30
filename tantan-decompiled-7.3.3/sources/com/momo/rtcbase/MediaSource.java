package com.momo.rtcbase;

import p153l.wtq0;

/* JADX INFO: loaded from: classes8.dex */
public class MediaSource {
    private long nativeSource;

    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaSource(long j) {
        this.nativeSource = j;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource != 0) {
            return;
        }
        wtq0.m207906a("MediaSource has been disposed.");
    }

    private static native State nativeGetState(long j);

    public void dispose() {
        checkMediaSourceExists();
        JniCommon.nativeReleaseRef(this.nativeSource);
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
