package p153l;

import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class axr0 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final long f73885a;

    /* JADX INFO: renamed from: b */
    public long f73886b;

    public axr0(InputStream inputStream, long j) {
        super(inputStream);
        this.f73885a = j;
    }

    /* JADX INFO: renamed from: k */
    public final long m100787k() {
        return this.f73885a - this.f73886b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.f73886b++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.f73886b += (long) i3;
        }
        return i3;
    }
}
