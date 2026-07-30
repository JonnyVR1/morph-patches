package org.eclipse.jetty.p127io.nio;

import java.nio.ByteBuffer;
import org.eclipse.jetty.p127io.Buffer;

/* JADX INFO: loaded from: classes2.dex */
public interface NIOBuffer extends Buffer {
    ByteBuffer getByteBuffer();

    boolean isDirect();
}
