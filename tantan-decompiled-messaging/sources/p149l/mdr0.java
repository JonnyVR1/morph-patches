package p149l;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class mdr0 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public long f133307a = 0;

    /* JADX INFO: renamed from: k */
    public final long m154106k() {
        return this.f133307a;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            zkl.m219192a();
        } else {
            this.f133307a += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f133307a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f133307a++;
    }
}
