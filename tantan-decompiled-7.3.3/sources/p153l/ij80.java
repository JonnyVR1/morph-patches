package p153l;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ij80 {

    /* JADX INFO: renamed from: a */
    public final int f115197a;

    /* JADX INFO: renamed from: b */
    public final wq3 f115198b;

    @VisibleForTesting
    public ij80(wq3 wq3Var, int i) {
        wn80.m207177b(Boolean.valueOf(i > 0));
        this.f115197a = i;
        this.f115198b = wq3Var;
    }

    /* JADX INFO: renamed from: a */
    public long m140188a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f115198b.get(this.f115197a);
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, this.f115197a);
                if (i == -1) {
                    this.f115198b.release(bArr);
                    return j;
                }
                outputStream.write(bArr, 0, i);
                j += (long) i;
            } catch (Throwable th) {
                this.f115198b.release(bArr);
                throw th;
            }
        }
    }

    public ij80(wq3 wq3Var) {
        this(wq3Var, 16384);
    }
}
