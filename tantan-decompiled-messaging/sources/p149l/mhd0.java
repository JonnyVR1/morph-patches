package p149l;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import java.io.IOException;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mhd0 implements sqf {

    /* JADX INFO: renamed from: a */
    public final xhd0 f133798a;

    /* JADX INFO: renamed from: d */
    public final int f133801d;

    /* JADX INFO: renamed from: g */
    public uqf f133804g;

    /* JADX INFO: renamed from: h */
    public boolean f133805h;

    /* JADX INFO: renamed from: k */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f133808k;

    /* JADX INFO: renamed from: b */
    public final d860 f133799b = new d860(65507);

    /* JADX INFO: renamed from: c */
    public final d860 f133800c = new d860();

    /* JADX INFO: renamed from: e */
    public final Object f133802e = new Object();

    /* JADX INFO: renamed from: f */
    public final vhd0 f133803f = new vhd0();

    /* JADX INFO: renamed from: i */
    public volatile long f133806i = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public volatile int f133807j = -1;

    /* JADX INFO: renamed from: l */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long f133809l = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public long f133810m = -9223372036854775807L;

    public mhd0(whd0 whd0Var, int i) {
        this.f133801d = i;
        this.f133798a = (xhd0) p11.m167011e(new iqd().m137733a(whd0Var));
    }

    /* JADX INFO: renamed from: c */
    public static long m154615c(long j) {
        return j - 30;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        synchronized (this.f133802e) {
            try {
                if (!this.f133808k) {
                    this.f133808k = true;
                }
                this.f133809l = j;
                this.f133810m = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f133798a.mo102006d(uqfVar, this.f133801d);
        uqfVar.mo11371l();
        uqfVar.mo11370k(new hce0.C17275b(-9223372036854775807L));
        this.f133804g = uqfVar;
    }

    /* JADX INFO: renamed from: d */
    public boolean m154616d() {
        return this.f133805h;
    }

    /* JADX INFO: renamed from: e */
    public void m154617e() {
        synchronized (this.f133802e) {
            this.f133808k = true;
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX INFO: renamed from: g */
    public void m154618g(int i) {
        this.f133807j = i;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        p11.m167011e(this.f133804g);
        int i = tqfVar.read(this.f133799b.m110299e(), 0, 65507);
        if (i == -1) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        this.f133799b.m110292U(0);
        this.f133799b.m110291T(i);
        thd0 thd0VarM188883d = thd0.m188883d(this.f133799b);
        if (thd0VarM188883d == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jM154615c = m154615c(jElapsedRealtime);
        this.f133803f.m198439d(thd0VarM188883d, jElapsedRealtime);
        thd0 thd0VarM198440e = this.f133803f.m198440e(jM154615c);
        if (thd0VarM198440e == null) {
            return 0;
        }
        if (!this.f133805h) {
            if (this.f133806i == -9223372036854775807L) {
                this.f133806i = thd0VarM198440e.f170229h;
            }
            if (this.f133807j == -1) {
                this.f133807j = thd0VarM198440e.f170228g;
            }
            this.f133798a.mo102005c(this.f133806i, this.f133807j);
            this.f133805h = true;
        }
        synchronized (this.f133802e) {
            try {
                if (!this.f133808k) {
                    do {
                        this.f133800c.m110289R(thd0VarM198440e.f170232k);
                        this.f133798a.mo102004b(this.f133800c, thd0VarM198440e.f170229h, thd0VarM198440e.f170228g, thd0VarM198440e.f170226e);
                        thd0VarM198440e = this.f133803f.m198440e(jM154615c);
                    } while (thd0VarM198440e != null);
                } else if (this.f133809l != -9223372036854775807L && this.f133810m != -9223372036854775807L) {
                    this.f133803f.m198441f();
                    this.f133798a.mo102003a(this.f133809l, this.f133810m);
                    this.f133808k = false;
                    this.f133809l = -9223372036854775807L;
                    this.f133810m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m154619i(long j) {
        this.f133806i = j;
    }

    @Override // p149l.sqf
    public void release() {
    }
}
