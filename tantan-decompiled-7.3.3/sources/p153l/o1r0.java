package p153l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class o1r0 extends DataOutputStream {
    public o1r0(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: renamed from: k */
    public void m165668k() throws IOException {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
