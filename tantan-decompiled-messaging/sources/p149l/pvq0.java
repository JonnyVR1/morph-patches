package p149l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class pvq0 extends GZIPOutputStream {
    public pvq0(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: renamed from: k */
    public void m171691k() throws IOException {
        super.close();
    }

    /* JADX INFO: renamed from: m */
    public void m171692m() throws IOException {
        super.finish();
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public void finish() {
    }
}
