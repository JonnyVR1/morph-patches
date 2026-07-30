package com.momo.rtcbase;

import p149l.qkq0;

/* JADX INFO: loaded from: classes8.dex */
public class TurnCustomizer {
    private long nativeTurnCustomizer;

    public TurnCustomizer(long j) {
        this.nativeTurnCustomizer = j;
    }

    private void checkTurnCustomizerExists() {
        if (this.nativeTurnCustomizer != 0) {
            return;
        }
        qkq0.m175383a("TurnCustomizer has been disposed.");
    }

    private static native void nativeFreeTurnCustomizer(long j);

    public void dispose() {
        checkTurnCustomizerExists();
        nativeFreeTurnCustomizer(this.nativeTurnCustomizer);
        this.nativeTurnCustomizer = 0L;
    }

    @CalledByNative
    public long getNativeTurnCustomizer() {
        checkTurnCustomizerExists();
        return this.nativeTurnCustomizer;
    }
}
