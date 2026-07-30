package io.agora.base.internal.video;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
class GPUPBOUtil {
    private long nativeHandle = nativeObjectInit();

    private native long nativeObjectInit();

    private native boolean nativeReadFrame(long j, int i, int i2, int i3, int i4, boolean z, int i5, int i6, ByteBuffer byteBuffer, boolean z2);

    private native void nativeRelease(long j);

    public boolean readFrame(int i, int i2, int i3, int i4, boolean z, int i5, int i6, ByteBuffer byteBuffer, boolean z2) {
        long j = this.nativeHandle;
        if (j == 0) {
            return false;
        }
        return nativeReadFrame(j, i, i2, i3, i4, z, i5, i6, byteBuffer, z2);
    }

    public void release() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeRelease(j);
            this.nativeHandle = 0L;
        }
    }
}
