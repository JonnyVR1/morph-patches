package com.cosmos.photon.baseim.p024im;

import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
class PacketReaderNative {
    private long nativePtr;

    public interface ReadListener {
        void onReadError(int i);

        void onReadPacket(String str);
    }

    public PacketReaderNative(int i) {
        this.nativePtr = nativeCreate(i);
    }

    private native long nativeCreate(int i);

    private native void nativeRelease(long j);

    private native void nativeSetPacketSecurity(long j, ISecurity iSecurity);

    private native void nativeSetReadListener(long j, ReadListener readListener);

    private native void nativeStart(long j);

    private native void nativeStop(long j);

    public void setReadListener(ReadListener readListener) {
        long j = this.nativePtr;
        if (j > 0) {
            nativeSetReadListener(j, readListener);
        } else {
            qkq0.m175383a("already released");
        }
    }

    public void setSecurity(ISecurity iSecurity) {
        nativeSetPacketSecurity(this.nativePtr, iSecurity);
    }

    public void start() {
        long j = this.nativePtr;
        if (j != 0) {
            nativeStart(j);
        } else {
            qkq0.m175383a("already released");
        }
    }

    public void stop() {
        long j = this.nativePtr;
        if (j == 0) {
            qkq0.m175383a("already released");
            return;
        }
        nativeStop(j);
        nativeRelease(this.nativePtr);
        this.nativePtr = 0L;
    }
}
