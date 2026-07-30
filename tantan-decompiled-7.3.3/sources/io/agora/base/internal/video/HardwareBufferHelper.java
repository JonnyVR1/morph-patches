package io.agora.base.internal.video;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareBufferHelper {
    private final long nativeHandle = nativeObjectInit();

    private native int nativeGetOesTextureId(long j);

    private native long nativeObjectInit();

    private native boolean nativePrepare(long j, int i, int i2, int i3, long j2, boolean z);

    private native boolean nativeReadFrame(long j, int i, int i2, int i3, int i4, ByteBuffer byteBuffer);

    private native void nativeRelease(long j);

    public int getOesTextureId() {
        return nativeGetOesTextureId(this.nativeHandle);
    }

    public boolean prepare(int i, int i2, int i3, long j, boolean z) {
        return nativePrepare(this.nativeHandle, i, i2, i3, j, z);
    }

    public boolean readFrame(int i, int i2, int i3, int i4, ByteBuffer byteBuffer) {
        return nativeReadFrame(this.nativeHandle, i, i2, i3, i4, byteBuffer);
    }

    public void release() {
        nativeRelease(this.nativeHandle);
    }
}
