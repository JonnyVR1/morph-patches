package p149l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class isq0 extends DataOutputStream {
    public isq0(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: renamed from: k */
    public void m138087k() throws IOException {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
