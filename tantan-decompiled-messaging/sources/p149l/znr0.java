package p149l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes6.dex */
public final class znr0 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f204006a;

    /* JADX WARN: Illegal instructions before constructor call */
    public znr0(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.f204006a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f204006a.disconnect();
    }
}
