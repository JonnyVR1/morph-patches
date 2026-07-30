package p153l;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class hj80 extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e) {
            vyi0.m203997a(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract PooledByteBuffer mo8485k();

    public abstract int size();
}
