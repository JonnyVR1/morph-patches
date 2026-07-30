package p149l;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ffr0 {

    /* JADX INFO: renamed from: b */
    public m7r0 f97291b;

    /* JADX INFO: renamed from: c */
    public m5r0 f97292c;

    /* JADX INFO: renamed from: d */
    public oer0 f97293d;

    /* JADX INFO: renamed from: e */
    public long f97294e;

    /* JADX INFO: renamed from: f */
    public long f97295f;

    /* JADX INFO: renamed from: g */
    public long f97296g;

    /* JADX INFO: renamed from: h */
    public int f97297h;

    /* JADX INFO: renamed from: i */
    public int f97298i;

    /* JADX INFO: renamed from: k */
    public long f97300k;

    /* JADX INFO: renamed from: l */
    public boolean f97301l;

    /* JADX INFO: renamed from: m */
    public boolean f97302m;

    /* JADX INFO: renamed from: a */
    public final mer0 f97290a = new mer0();

    /* JADX INFO: renamed from: j */
    public cfr0 f97299j = new cfr0();

    /* JADX INFO: renamed from: a */
    public abstract long mo101562a(v6w0 v6w0Var);

    /* JADX INFO: renamed from: b */
    public void mo101563b(boolean z) {
        int i;
        if (z) {
            this.f97299j = new cfr0();
            this.f97295f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f97297h = i;
        this.f97294e = -1L;
        this.f97296g = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public abstract boolean mo101564c(v6w0 v6w0Var, long j, cfr0 cfr0Var) throws IOException;

    /* JADX INFO: renamed from: d */
    public final int m121183d(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        f5v0.m119531b(this.f97291b);
        int i = ggw0.f102568a;
        int i2 = this.f97297h;
        if (i2 == 0) {
            while (this.f97290a.m154310e(k5r0Var)) {
                long jZzf = k5r0Var.zzf();
                long j = this.f97295f;
                this.f97300k = jZzf - j;
                if (!mo101564c(this.f97290a.m154306a(), j, this.f97299j)) {
                    mhr0 mhr0Var = this.f97299j.f80650a;
                    this.f97298i = mhr0Var.f133906z;
                    if (!this.f97302m) {
                        this.f97291b.mo134531d(mhr0Var);
                        this.f97302m = true;
                    }
                    oer0 oer0Var = this.f97299j.f80651b;
                    if (oer0Var != null) {
                        this.f97293d = oer0Var;
                    } else if (k5r0Var.zzd() == -1) {
                        this.f97293d = new efr0(null);
                    } else {
                        ner0 ner0VarM154307b = this.f97290a.m154307b();
                        this.f97293d = new her0(this, this.f97295f, k5r0Var.zzd(), ner0VarM154307b.f138648d + ner0VarM154307b.f138649e, ner0VarM154307b.f138646b, (ner0VarM154307b.f138645a & 4) != 0);
                    }
                    this.f97297h = 2;
                    this.f97290a.m154309d();
                    return 0;
                }
                this.f97295f = k5r0Var.zzf();
            }
            this.f97297h = 3;
            return -1;
        }
        if (i2 == 1) {
            ((z4r0) k5r0Var).m217119k((int) this.f97295f, false);
            this.f97297h = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long jMo116091b = this.f97293d.mo116091b(k5r0Var);
        if (jMo116091b >= 0) {
            s6r0Var.f162847a = jMo116091b;
            return 1;
        }
        if (jMo116091b < -1) {
            mo121187h(-(jMo116091b + 2));
        }
        if (!this.f97301l) {
            v6r0 v6r0VarZze = this.f97293d.zze();
            f5v0.m119531b(v6r0VarZze);
            this.f97292c.mo129455j(v6r0VarZze);
            this.f97301l = true;
        }
        if (this.f97300k <= 0 && !this.f97290a.m154310e(k5r0Var)) {
            this.f97297h = 3;
            return -1;
        }
        this.f97300k = 0L;
        v6w0 v6w0VarM154306a = this.f97290a.m154306a();
        long jMo101562a = mo101562a(v6w0VarM154306a);
        if (jMo101562a >= 0) {
            long j2 = this.f97296g;
            if (j2 + jMo101562a >= this.f97294e) {
                long jM121184e = m121184e(j2);
                z6r0.m217416b(this.f97291b, v6w0VarM154306a, v6w0VarM154306a.m197271t());
                this.f97291b.mo134530c(jM121184e, 1, v6w0VarM154306a.m197271t(), 0, null);
                this.f97294e = -1L;
            }
        }
        this.f97296g += jMo101562a;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final long m121184e(long j) {
        return (j * 1000000) / ((long) this.f97298i);
    }

    /* JADX INFO: renamed from: f */
    public final long m121185f(long j) {
        return (((long) this.f97298i) * j) / 1000000;
    }

    /* JADX INFO: renamed from: g */
    public final void m121186g(m5r0 m5r0Var, m7r0 m7r0Var) {
        this.f97292c = m5r0Var;
        this.f97291b = m7r0Var;
        mo101563b(true);
    }

    /* JADX INFO: renamed from: h */
    public void mo121187h(long j) {
        this.f97296g = j;
    }

    /* JADX INFO: renamed from: i */
    public final void m121188i(long j, long j2) {
        this.f97290a.m154308c();
        if (j == 0) {
            mo101563b(!this.f97301l);
            return;
        }
        if (this.f97297h != 0) {
            long jM121185f = m121185f(j2);
            this.f97294e = jM121185f;
            oer0 oer0Var = this.f97293d;
            int i = ggw0.f102568a;
            oer0Var.mo116090a(jM121185f);
            this.f97297h = 2;
        }
    }
}
