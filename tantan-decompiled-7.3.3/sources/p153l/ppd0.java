package p153l;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import java.io.IOException;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ppd0 implements zrf {

    /* JADX INFO: renamed from: a */
    public final aqd0 f153516a;

    /* JADX INFO: renamed from: d */
    public final int f153519d;

    /* JADX INFO: renamed from: g */
    public bsf f153522g;

    /* JADX INFO: renamed from: h */
    public boolean f153523h;

    /* JADX INFO: renamed from: k */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f153526k;

    /* JADX INFO: renamed from: b */
    public final ig60 f153517b = new ig60(65507);

    /* JADX INFO: renamed from: c */
    public final ig60 f153518c = new ig60();

    /* JADX INFO: renamed from: e */
    public final Object f153520e = new Object();

    /* JADX INFO: renamed from: f */
    public final ypd0 f153521f = new ypd0();

    /* JADX INFO: renamed from: i */
    public volatile long f153524i = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public volatile int f153525j = -1;

    /* JADX INFO: renamed from: l */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long f153527l = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long f153528m = -9223372036854775807L;

    public ppd0(zpd0 zpd0Var, int i) {
        this.f153519d = i;
        this.f153516a = (aqd0) w11.m204369e(new yrd().m217166a(zpd0Var));
    }

    /* JADX INFO: renamed from: c */
    public static long m173190c(long j) {
        return j - 30;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        synchronized (this.f153520e) {
            try {
                if (!this.f153526k) {
                    this.f153526k = true;
                }
                this.f153527l = j;
                this.f153528m = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f153516a.mo99457d(bsfVar, this.f153519d);
        bsfVar.mo11425l();
        bsfVar.mo11424k(new mke0.C18641b(-9223372036854775807L));
        this.f153522g = bsfVar;
    }

    /* JADX INFO: renamed from: d */
    public boolean m173191d() {
        return this.f153523h;
    }

    /* JADX INFO: renamed from: e */
    public void m173192e() {
        synchronized (this.f153520e) {
            this.f153526k = true;
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX INFO: renamed from: g */
    public void m173193g(int i) {
        this.f153525j = i;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        w11.m204369e(this.f153522g);
        int i = asfVar.read(this.f153517b.m139815e(), 0, 65507);
        if (i == -1) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        this.f153517b.m139808U(0);
        this.f153517b.m139807T(i);
        wpd0 wpd0VarM207436d = wpd0.m207436d(this.f153517b);
        if (wpd0VarM207436d == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jM173190c = m173190c(jElapsedRealtime);
        this.f153521f.m217014d(wpd0VarM207436d, jElapsedRealtime);
        wpd0 wpd0VarM217015e = this.f153521f.m217015e(jM173190c);
        if (wpd0VarM217015e == null) {
            return 0;
        }
        if (!this.f153523h) {
            if (this.f153524i == -9223372036854775807L) {
                this.f153524i = wpd0VarM217015e.f190290h;
            }
            if (this.f153525j == -1) {
                this.f153525j = wpd0VarM217015e.f190289g;
            }
            this.f153516a.mo99456c(this.f153524i, this.f153525j);
            this.f153523h = true;
        }
        synchronized (this.f153520e) {
            try {
                if (!this.f153526k) {
                    do {
                        this.f153518c.m139805R(wpd0VarM217015e.f190293k);
                        this.f153516a.mo99455b(this.f153518c, wpd0VarM217015e.f190290h, wpd0VarM217015e.f190289g, wpd0VarM217015e.f190287e);
                        wpd0VarM217015e = this.f153521f.m217015e(jM173190c);
                    } while (wpd0VarM217015e != null);
                } else if (this.f153527l != -9223372036854775807L && this.f153528m != -9223372036854775807L) {
                    this.f153521f.m217016f();
                    this.f153516a.mo99454a(this.f153527l, this.f153528m);
                    this.f153526k = false;
                    this.f153527l = -9223372036854775807L;
                    this.f153528m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m173194i(long j) {
        this.f153524i = j;
    }

    @Override // p153l.zrf
    public void release() {
    }
}
