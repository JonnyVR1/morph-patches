package p153l;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lor0 {

    /* JADX INFO: renamed from: b */
    public sgr0 f132933b;

    /* JADX INFO: renamed from: c */
    public ser0 f132934c;

    /* JADX INFO: renamed from: d */
    public unr0 f132935d;

    /* JADX INFO: renamed from: e */
    public long f132936e;

    /* JADX INFO: renamed from: f */
    public long f132937f;

    /* JADX INFO: renamed from: g */
    public long f132938g;

    /* JADX INFO: renamed from: h */
    public int f132939h;

    /* JADX INFO: renamed from: i */
    public int f132940i;

    /* JADX INFO: renamed from: k */
    public long f132942k;

    /* JADX INFO: renamed from: l */
    public boolean f132943l;

    /* JADX INFO: renamed from: m */
    public boolean f132944m;

    /* JADX INFO: renamed from: a */
    public final snr0 f132932a = new snr0();

    /* JADX INFO: renamed from: j */
    public ior0 f132941j = new ior0();

    /* JADX INFO: renamed from: a */
    public abstract long mo136457a(bgw0 bgw0Var);

    /* JADX INFO: renamed from: b */
    public void mo136458b(boolean z) {
        int i;
        if (z) {
            this.f132941j = new ior0();
            this.f132937f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f132939h = i;
        this.f132936e = -1L;
        this.f132938g = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public abstract boolean mo136459c(bgw0 bgw0Var, long j, ior0 ior0Var) throws IOException;

    /* JADX INFO: renamed from: d */
    public final int m155096d(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        lev0.m153954b(this.f132933b);
        int i = mpw0.f137957a;
        int i2 = this.f132939h;
        if (i2 == 0) {
            while (this.f132932a.m186998e(qer0Var)) {
                long jZzf = qer0Var.zzf();
                long j = this.f132937f;
                this.f132942k = jZzf - j;
                if (!mo136459c(this.f132932a.m186994a(), j, this.f132941j)) {
                    sqr0 sqr0Var = this.f132941j.f116196a;
                    this.f132940i = sqr0Var.f170265z;
                    if (!this.f132944m) {
                        this.f132933b.mo99373d(sqr0Var);
                        this.f132944m = true;
                    }
                    unr0 unr0Var = this.f132941j.f116197b;
                    if (unr0Var != null) {
                        this.f132935d = unr0Var;
                    } else if (qer0Var.zzd() == -1) {
                        this.f132935d = new kor0(null);
                    } else {
                        tnr0 tnr0VarM186995b = this.f132932a.m186995b();
                        this.f132935d = new nnr0(this, this.f132937f, qer0Var.zzd(), tnr0VarM186995b.f175312d + tnr0VarM186995b.f175313e, tnr0VarM186995b.f175310b, (tnr0VarM186995b.f175309a & 4) != 0);
                    }
                    this.f132939h = 2;
                    this.f132932a.m186997d();
                    return 0;
                }
                this.f132937f = qer0Var.zzf();
            }
            this.f132939h = 3;
            return -1;
        }
        if (i2 == 1) {
            ((fer0) qer0Var).m125319k((int) this.f132937f, false);
            this.f132939h = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long jMo150676b = this.f132935d.mo150676b(qer0Var);
        if (jMo150676b >= 0) {
            yfr0Var.f199649a = jMo150676b;
            return 1;
        }
        if (jMo150676b < -1) {
            mo155100h(-(jMo150676b + 2));
        }
        if (!this.f132943l) {
            bgr0 bgr0VarZze = this.f132935d.zze();
            lev0.m153954b(bgr0VarZze);
            this.f132934c.mo101551j(bgr0VarZze);
            this.f132943l = true;
        }
        if (this.f132942k <= 0 && !this.f132932a.m186998e(qer0Var)) {
            this.f132939h = 3;
            return -1;
        }
        this.f132942k = 0L;
        bgw0 bgw0VarM186994a = this.f132932a.m186994a();
        long jMo136457a = mo136457a(bgw0VarM186994a);
        if (jMo136457a >= 0) {
            long j2 = this.f132938g;
            if (j2 + jMo136457a >= this.f132936e) {
                long jM155097e = m155097e(j2);
                fgr0.m125515b(this.f132933b, bgw0VarM186994a, bgw0VarM186994a.m104278t());
                this.f132933b.mo99372c(jM155097e, 1, bgw0VarM186994a.m104278t(), 0, null);
                this.f132936e = -1L;
            }
        }
        this.f132938g += jMo136457a;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final long m155097e(long j) {
        return (j * 1000000) / ((long) this.f132940i);
    }

    /* JADX INFO: renamed from: f */
    public final long m155098f(long j) {
        return (((long) this.f132940i) * j) / 1000000;
    }

    /* JADX INFO: renamed from: g */
    public final void m155099g(ser0 ser0Var, sgr0 sgr0Var) {
        this.f132934c = ser0Var;
        this.f132933b = sgr0Var;
        mo136458b(true);
    }

    /* JADX INFO: renamed from: h */
    public void mo155100h(long j) {
        this.f132938g = j;
    }

    /* JADX INFO: renamed from: i */
    public final void m155101i(long j, long j2) {
        this.f132932a.m186996c();
        if (j == 0) {
            mo136458b(!this.f132943l);
            return;
        }
        if (this.f132939h != 0) {
            long jM155098f = m155098f(j2);
            this.f132936e = jM155098f;
            unr0 unr0Var = this.f132935d;
            int i = mpw0.f137957a;
            unr0Var.mo150675a(jM155098f);
            this.f132939h = 2;
        }
    }
}
