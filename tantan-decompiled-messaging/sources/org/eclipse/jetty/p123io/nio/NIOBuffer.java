package org.eclipse.jetty.p123io.nio;

import java.nio.ByteBuffer;
import org.eclipse.jetty.p123io.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public interface NIOBuffer extends Buffer {
    ByteBuffer getByteBuffer();

    boolean isDirect();
}
