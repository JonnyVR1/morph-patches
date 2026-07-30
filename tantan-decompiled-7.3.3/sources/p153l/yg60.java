package p153l;

import com.google.android.exoplayer2.C1894k;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yg60 implements yee0 {

    /* JADX INFO: renamed from: a */
    public C1894k f199734a;

    /* JADX INFO: renamed from: b */
    public h0j0 f199735b;

    /* JADX INFO: renamed from: c */
    public qfj0 f199736c;

    public yg60(String str) {
        this.f199734a = new C1894k.b().m10400g0(str).m10374G();
    }

    @Override // p153l.yee0
    /* JADX INFO: renamed from: a */
    public void mo140377a(ig60 ig60Var) {
        m215838b();
        long jM133176d = this.f199735b.m133176d();
        long jM133177e = this.f199735b.m133177e();
        if (jM133176d == -9223372036854775807L || jM133177e == -9223372036854775807L) {
            return;
        }
        C1894k c1894k = this.f199734a;
        if (jM133177e != c1894k.f7789p) {
            C1894k c1894kM10374G = c1894k.m10336b().m10404k0(jM133177e).m10374G();
            this.f199734a = c1894kM10374G;
            this.f199736c.mo11164b(c1894kM10374G);
        }
        int iM139811a = ig60Var.m139811a();
        this.f199736c.m176370d(ig60Var, iM139811a);
        this.f199736c.mo11163a(jM133176d, 1, iM139811a, 0, null);
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    /* JADX INFO: renamed from: b */
    public final void m215838b() {
        w11.m204373i(this.f199735b);
        bmk0.m105144j(this.f199736c);
    }

    @Override // p153l.yee0
    /* JADX INFO: renamed from: c */
    public void mo140378c(h0j0 h0j0Var, bsf bsfVar, jkj0.C17969d c17969d) {
        this.f199735b = h0j0Var;
        c17969d.m145854a();
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 5);
        this.f199736c = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f199734a);
    }
}
