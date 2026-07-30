package p149l;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class cb80 {

    /* JADX INFO: renamed from: a */
    public final int f80115a;

    /* JADX INFO: renamed from: b */
    public final wp3 f80116b;

    @VisibleForTesting
    public cb80(wp3 wp3Var, int i) {
        rf80.m179111b(Boolean.valueOf(i > 0));
        this.f80115a = i;
        this.f80116b = wp3Var;
    }

    /* JADX INFO: renamed from: a */
    public long m105972a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f80116b.get(this.f80115a);
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, this.f80115a);
                if (i == -1) {
                    this.f80116b.release(bArr);
                    return j;
                }
                outputStream.write(bArr, 0, i);
                j += (long) i;
            } catch (Throwable th) {
                this.f80116b.release(bArr);
                throw th;
            }
        }
    }

    public cb80(wp3 wp3Var) {
        this(wp3Var, 16384);
    }
}
