package p149l;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb80 extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e) {
            spi0.m185369a(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract PooledByteBuffer mo8431k();

    public abstract int size();
}
