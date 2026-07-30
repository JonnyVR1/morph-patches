package org.eclipse.jetty.p004io;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
