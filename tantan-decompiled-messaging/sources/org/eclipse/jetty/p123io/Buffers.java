package org.eclipse.jetty.p123io;

/* JADX INFO: loaded from: classes3.dex */
public interface Buffers {

    public enum Type {
        BYTE_ARRAY,
        DIRECT,
        INDIRECT
    }

    Buffer getBuffer();

    Buffer getBuffer(int i);

    Buffer getHeader();

    void returnBuffer(Buffer buffer);
}
