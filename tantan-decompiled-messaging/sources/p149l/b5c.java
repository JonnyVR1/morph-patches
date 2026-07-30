package p149l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes7.dex */
public interface b5c extends Closeable {
    /* JADX INFO: renamed from: K */
    ByteBuffer mo7387K(long j, long j2) throws IOException;

    /* JADX INFO: renamed from: L */
    long mo7388L(long j, long j2, WritableByteChannel writableByteChannel) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long position() throws IOException;

    void position(long j) throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;
}
