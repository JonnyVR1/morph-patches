package org.eclipse.jetty.p004io.nio;

import java.nio.ByteBuffer;
import org.eclipse.jetty.p004io.Buffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface NIOBuffer extends Buffer {
    ByteBuffer getByteBuffer();

    boolean isDirect();
}
