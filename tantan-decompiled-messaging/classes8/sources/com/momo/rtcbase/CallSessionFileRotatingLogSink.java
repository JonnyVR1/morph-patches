package com.momo.rtcbase;

import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i, Logging.Severity severity) {
        if (str != null) {
            this.nativeSink = nativeAddSink(str, i, severity.ordinal());
        } else {
            ig3.a("dirPath may not be null.");
            throw null;
        }
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        ig3.a("dirPath may not be null.");
        return null;
    }

    private static native long nativeAddSink(String str, int i, int i2);

    private static native void nativeDeleteSink(long j);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j = this.nativeSink;
        if (j != 0) {
            nativeDeleteSink(j);
            this.nativeSink = 0L;
        }
    }
}
