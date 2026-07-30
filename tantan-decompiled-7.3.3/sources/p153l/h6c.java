package p153l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes7.dex */
public interface h6c extends Closeable {
    /* JADX INFO: renamed from: K */
    ByteBuffer mo7441K(long j, long j2) throws IOException;

    /* JADX INFO: renamed from: L */
    long mo7442L(long j, long j2, WritableByteChannel writableByteChannel) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long position() throws IOException;

    void position(long j) throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;
}
