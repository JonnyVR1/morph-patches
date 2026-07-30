package com.cosmos.photon.baseim.p025im;

/* JADX INFO: loaded from: classes.dex */
public class NativePacket implements IPacket {
    private long nativePtr;

    private NativePacket() {
        this.nativePtr = 0L;
    }

    private native byte[] nativeGetBody(long j);

    private native byte[] nativeGetHeader(long j);

    @Override // com.cosmos.photon.baseim.p025im.IPacket
    public byte[] getBody() {
        long j = this.nativePtr;
        if (j != 0) {
            return nativeGetBody(j);
        }
        return null;
    }

    private NativePacket(long j) {
        this.nativePtr = j;
    }
}
