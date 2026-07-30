package com.jiechic.library.android.snappy;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class SnappyNative {
    public native void arrayCopy(Object obj, int i, int i2, Object obj2, int i3) throws IOException;

    public native boolean isValidCompressedBuffer(long j, long j2, long j3) throws IOException;

    public native boolean isValidCompressedBuffer(Object obj, int i, int i2) throws IOException;

    public native boolean isValidCompressedBuffer(ByteBuffer byteBuffer, int i, int i2) throws IOException;

    public native int maxCompressedLength(int i);

    public native String nativeLibraryVersion();

    public native int rawCompress(Object obj, int i, int i2, Object obj2, int i3) throws IOException;

    public native int rawCompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3) throws IOException;

    public native long rawCompress(long j, long j2, long j3) throws IOException;

    public native int rawUncompress(Object obj, int i, int i2, Object obj2, int i3) throws IOException;

    public native int rawUncompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3) throws IOException;

    public native long rawUncompress(long j, long j2, long j3) throws IOException;

    public native int uncompressedLength(Object obj, int i, int i2) throws IOException;

    public native int uncompressedLength(ByteBuffer byteBuffer, int i, int i2) throws IOException;

    public native long uncompressedLength(long j, long j2) throws IOException;
}
