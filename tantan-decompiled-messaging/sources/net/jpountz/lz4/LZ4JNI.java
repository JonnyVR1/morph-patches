package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.Native;

/* JADX INFO: loaded from: classes2.dex */
enum LZ4JNI {
    ;

    static {
        Native.load();
        init();
    }

    public static native int LZ4_compressBound(int i);

    public static native int LZ4_compressHC(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4, int i5);

    public static native int LZ4_compress_limitedOutput(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native int LZ4_decompress_fast(byte[] bArr, ByteBuffer byteBuffer, int i, byte[] bArr2, ByteBuffer byteBuffer2, int i2, int i3);

    public static native int LZ4_decompress_safe(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native void init();
}
