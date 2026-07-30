package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    ByteBuffer getByteBuffer();

    boolean isClosed();

    /* JADX INFO: renamed from: o */
    long mo8155o();

    /* JADX INFO: renamed from: p */
    int mo8156p(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: r */
    byte mo8157r(int i);

    int size();
}
