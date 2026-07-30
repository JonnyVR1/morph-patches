package com.cosmos.photon.baseim.p025im;

import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
class PacketWriterNative {
    private long nativePtr;

    public interface WriteListener {
        void onWriteError(int i);
    }

    public PacketWriterNative(int i) {
        this.nativePtr = nativeCreate(i);
    }

    private native long nativeCreate(int i);

    private native void nativeRelease(long j);

    private native void nativeSetPacketSecurity(long j, ISecurity iSecurity);

    private native void nativeSetPacketWrapper(long j, IPacketWrapper iPacketWrapper);

    private native void nativeSetWriteListener(long j, WriteListener writeListener);

    private native void nativeStart(long j);

    private native void nativeStop(long j);

    private native void nativeWriteIMJPacket(long j, int i, String str);

    private native void nativeWritePacket(long j, byte[] bArr, byte[] bArr2);

    public void setPacketWrapper(IPacketWrapper iPacketWrapper) {
        long j = this.nativePtr;
        if (j != 0) {
            nativeSetPacketWrapper(j, iPacketWrapper);
        } else {
            wtq0.m207906a("already released");
        }
    }

    public void setSecurity(ISecurity iSecurity) {
        nativeSetPacketSecurity(this.nativePtr, iSecurity);
    }

    public void setWriteListener(WriteListener writeListener) {
        long j = this.nativePtr;
        if (j != 0) {
            nativeSetWriteListener(j, writeListener);
        } else {
            wtq0.m207906a("already released");
        }
    }

    public void start() {
        long j = this.nativePtr;
        if (j != 0) {
            nativeStart(j);
        } else {
            wtq0.m207906a("already released");
        }
    }

    public void stop() {
        long j = this.nativePtr;
        if (j == 0) {
            wtq0.m207906a("already released");
            return;
        }
        nativeStop(j);
        nativeRelease(this.nativePtr);
        this.nativePtr = 0L;
    }

    public void writePacket(byte[] bArr, byte[] bArr2) {
        long j = this.nativePtr;
        if (j == 0) {
            wtq0.m207906a("already released");
            return;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        nativeWritePacket(j, bArr, bArr2);
    }

    public void writePacket(int i, String str) {
        long j = this.nativePtr;
        if (j != 0) {
            nativeWriteIMJPacket(j, i, str);
        } else {
            wtq0.m207906a("already released");
        }
    }
}
