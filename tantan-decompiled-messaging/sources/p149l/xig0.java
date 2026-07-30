package p149l;

import Sudchar.Sudfor;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class xig0 implements rlg0 {

    /* JADX INFO: renamed from: a */
    public final InputStream f193119a;

    /* JADX INFO: renamed from: b */
    public final byte[] f193120b;

    /* JADX INFO: renamed from: c */
    public final n7g0 f193121c;

    /* JADX INFO: renamed from: d */
    public final int f193122d;

    /* JADX INFO: renamed from: e */
    public final slg0 f193123e;

    /* JADX INFO: renamed from: f */
    public final vrg0 f193124f = bog0.m102944a().f76516b;

    public xig0(int i, InputStream inputStream, n7g0 n7g0Var, slg0 slg0Var) {
        this.f193122d = i;
        this.f193119a = inputStream;
        this.f193120b = new byte[slg0Var.f165196h];
        this.f193121c = n7g0Var;
        this.f193123e = slg0Var;
    }

    @Override // p149l.rlg0
    /* JADX INFO: renamed from: a */
    public final long mo97895a(b8g0 b8g0Var) throws IOException {
        if (b8g0Var.f74114d.m98119c()) {
            throw Sudfor.f210105Suddo;
        }
        bog0.m102944a().f76521g.m121040c(b8g0Var.f74112b);
        int i = this.f193119a.read(this.f193120b);
        if (i == -1) {
            return i;
        }
        n7g0 n7g0Var = this.f193121c;
        int i2 = this.f193122d;
        byte[] bArr = this.f193120b;
        synchronized (n7g0Var) {
            if (!n7g0Var.f137510e) {
                ((ifg0) n7g0Var.m158131e(i2)).f113017c.write(bArr, 0, i);
                long j = i;
                n7g0Var.f137508c.addAndGet(j);
                ((AtomicLong) n7g0Var.f137507b.get(i2)).addAndGet(j);
                n7g0Var.m158133g();
            }
        }
        long j2 = i;
        b8g0Var.f74121k += j2;
        vrg0 vrg0Var = this.f193124f;
        slg0 slg0Var = this.f193123e;
        vrg0Var.getClass();
        long j3 = slg0Var.f165203o;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (j3 <= 0 || jUptimeMillis - slg0Var.f165205q.get() >= j3) {
            long j4 = b8g0Var.f74121k;
            if (j4 != 0) {
                b8g0Var.f74123m.f182721a.m127587b(b8g0Var.f74112b, b8g0Var.f74111a, j4);
                b8g0Var.f74121k = 0L;
                return j2;
            }
        }
        return j2;
    }
}
