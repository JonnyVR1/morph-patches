package io.agora.base.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class JniCommon {
    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
