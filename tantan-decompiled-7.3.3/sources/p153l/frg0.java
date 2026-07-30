package p153l;

import Sudchar.Sudfor;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class frg0 implements ztg0 {

    /* JADX INFO: renamed from: a */
    public final InputStream f100413a;

    /* JADX INFO: renamed from: b */
    public final byte[] f100414b;

    /* JADX INFO: renamed from: c */
    public final vfg0 f100415c;

    /* JADX INFO: renamed from: d */
    public final int f100416d;

    /* JADX INFO: renamed from: e */
    public final aug0 f100417e;

    /* JADX INFO: renamed from: f */
    public final d0h0 f100418f = jwg0.m147162a().f122920b;

    public frg0(int i, InputStream inputStream, vfg0 vfg0Var, aug0 aug0Var) {
        this.f100416d = i;
        this.f100413a = inputStream;
        this.f100414b = new byte[aug0Var.f73499h];
        this.f100415c = vfg0Var;
        this.f100417e = aug0Var;
    }

    @Override // p153l.ztg0
    /* JADX INFO: renamed from: a */
    public final long mo126924a(jgg0 jgg0Var) throws IOException {
        if (jgg0Var.f120716d.m142520c()) {
            throw Sudfor.f211027Suddo;
        }
        jwg0.m147162a().f122925g.m163818c(jgg0Var.f120714b);
        int i = this.f100413a.read(this.f100414b);
        if (i == -1) {
            return i;
        }
        vfg0 vfg0Var = this.f100415c;
        int i2 = this.f100416d;
        byte[] bArr = this.f100414b;
        synchronized (vfg0Var) {
            if (!vfg0Var.f183905e) {
                ((qng0) vfg0Var.m201121e(i2)).f158485c.write(bArr, 0, i);
                long j = i;
                vfg0Var.f183903c.addAndGet(j);
                ((AtomicLong) vfg0Var.f183902b.get(i2)).addAndGet(j);
                vfg0Var.m201123g();
            }
        }
        long j2 = i;
        jgg0Var.f120723k += j2;
        d0h0 d0h0Var = this.f100418f;
        aug0 aug0Var = this.f100417e;
        d0h0Var.getClass();
        long j3 = aug0Var.f73506o;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (j3 <= 0 || jUptimeMillis - aug0Var.f73508q.get() >= j3) {
            long j4 = jgg0Var.f120723k;
            if (j4 != 0) {
                jgg0Var.f120725m.f84561a.m169859b(jgg0Var.f120714b, jgg0Var.f120713a, j4);
                jgg0Var.f120723k = 0L;
                return j2;
            }
        }
        return j2;
    }
}
