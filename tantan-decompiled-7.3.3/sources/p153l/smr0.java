package p153l;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class smr0 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public long f169609a = 0;

    /* JADX INFO: renamed from: k */
    public final long m186842k() {
        return this.f169609a;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            onl.m168333a();
        } else {
            this.f169609a += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f169609a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f169609a++;
    }
}
