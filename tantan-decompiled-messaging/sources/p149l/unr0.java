package p149l;

import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class unr0 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final long f177429a;

    /* JADX INFO: renamed from: b */
    public long f177430b;

    public unr0(InputStream inputStream, long j) {
        super(inputStream);
        this.f177429a = j;
    }

    /* JADX INFO: renamed from: k */
    public final long m194480k() {
        return this.f177429a - this.f177430b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.f177430b++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.f177430b += (long) i3;
        }
        return i3;
    }
}
