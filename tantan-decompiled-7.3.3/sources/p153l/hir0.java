package p153l;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hir0 implements per0 {

    /* JADX INFO: renamed from: q */
    public static final ifr0 f110044q = new ifr0() { // from class: l.gir0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new hir0()};
        }
    };

    /* JADX INFO: renamed from: f */
    public ser0 f110050f;

    /* JADX INFO: renamed from: h */
    public boolean f110052h;

    /* JADX INFO: renamed from: i */
    public long f110053i;

    /* JADX INFO: renamed from: j */
    public int f110054j;

    /* JADX INFO: renamed from: k */
    public int f110055k;

    /* JADX INFO: renamed from: l */
    public int f110056l;

    /* JADX INFO: renamed from: m */
    public long f110057m;

    /* JADX INFO: renamed from: n */
    public boolean f110058n;

    /* JADX INFO: renamed from: o */
    public fir0 f110059o;

    /* JADX INFO: renamed from: p */
    public kir0 f110060p;

    /* JADX INFO: renamed from: a */
    public final bgw0 f110045a = new bgw0(4);

    /* JADX INFO: renamed from: b */
    public final bgw0 f110046b = new bgw0(9);

    /* JADX INFO: renamed from: c */
    public final bgw0 f110047c = new bgw0(11);

    /* JADX INFO: renamed from: d */
    public final bgw0 f110048d = new bgw0();

    /* JADX INFO: renamed from: e */
    public final iir0 f110049e = new iir0();

    /* JADX INFO: renamed from: g */
    public int f110051g = 1;

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: b */
    private final void m135133b() {
        if (this.f110058n) {
            return;
        }
        this.f110050f.mo101551j(new agr0(-9223372036854775807L, 0L));
        this.f110058n = true;
    }

    /* JADX INFO: renamed from: a */
    public final bgw0 m135134a(qer0 qer0Var) throws IOException {
        int i = this.f110056l;
        int iM104276r = this.f110048d.m104276r();
        bgw0 bgw0Var = this.f110048d;
        if (i > iM104276r) {
            int iM104276r2 = bgw0Var.m104276r();
            bgw0Var.m104267i(new byte[Math.max(iM104276r2 + iM104276r2, this.f110056l)], 0);
        } else {
            bgw0Var.m104269k(0);
        }
        this.f110048d.m104268j(this.f110056l);
        ((fer0) qer0Var).mo125312b(this.f110048d.m104271m(), 0, this.f110056l, false);
        return this.f110048d;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        if (j == 0) {
            this.f110051g = 1;
            this.f110052h = false;
        } else {
            this.f110051g = 3;
        }
        this.f110054j = 0;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        fer0 fer0Var = (fer0) qer0Var;
        fer0Var.mo125313c(this.f110045a.m104271m(), 0, 3, false);
        this.f110045a.m104269k(0);
        if (this.f110045a.m104247D() != 4607062) {
            return false;
        }
        fer0Var.mo125313c(this.f110045a.m104271m(), 0, 2, false);
        this.f110045a.m104269k(0);
        if ((this.f110045a.m104249F() & 250) != 0) {
            return false;
        }
        fer0Var.mo125313c(this.f110045a.m104271m(), 0, 4, false);
        this.f110045a.m104269k(0);
        int iM104280v = this.f110045a.m104280v();
        qer0Var.zzj();
        fer0 fer0Var2 = (fer0) qer0Var;
        fer0Var2.m125318j(iM104280v, false);
        fer0Var2.mo125313c(this.f110045a.m104271m(), 0, 4, false);
        this.f110045a.m104269k(0);
        return this.f110045a.m104280v() == 0;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f110050f = ser0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        long j;
        boolean zM144993c;
        boolean z;
        long j2;
        lev0.m153954b(this.f110050f);
        while (true) {
            int i = this.f110051g;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((fer0) qer0Var).m125319k(this.f110054j, false);
                    this.f110054j = 0;
                    this.f110051g = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        wpg0.m207458a();
                        return 0;
                    }
                    if (this.f110052h) {
                        j = this.f110053i + this.f110057m;
                    } else {
                        j = this.f110049e.m140077d() == -9223372036854775807L ? 0L : this.f110057m;
                    }
                    int i3 = this.f110055k;
                    if (i3 == 8) {
                        if (this.f110059o != null) {
                            m135133b();
                            zM144993c = this.f110059o.m144993c(m135134a(qer0Var), j);
                        }
                        z = true;
                        if (!this.f110052h && zM144993c) {
                            this.f110052h = true;
                            if (this.f110049e.m140077d() == -9223372036854775807L) {
                                j2 = -this.f110057m;
                            } else {
                                j2 = 0;
                            }
                            this.f110053i = j2;
                        }
                        this.f110054j = 4;
                        this.f110051g = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        i2 = i3;
                    }
                    if (i2 == 9) {
                        if (this.f110060p != null) {
                            m135133b();
                            zM144993c = this.f110060p.m144993c(m135134a(qer0Var), j);
                            z = true;
                        } else {
                            ((fer0) qer0Var).m125319k(this.f110056l, false);
                            zM144993c = false;
                            z = false;
                        }
                    } else if (i2 != 18 || this.f110058n) {
                        ((fer0) qer0Var).m125319k(this.f110056l, false);
                        zM144993c = false;
                        z = false;
                    } else {
                        zM144993c = this.f110049e.m144993c(m135134a(qer0Var), j);
                        iir0 iir0Var = this.f110049e;
                        long jM140077d = iir0Var.m140077d();
                        if (jM140077d != -9223372036854775807L) {
                            this.f110050f.mo101551j(new ufr0(iir0Var.m140078e(), iir0Var.m140079f(), jM140077d));
                            this.f110058n = true;
                        }
                        z = true;
                    }
                    if (!this.f110052h) {
                        this.f110052h = true;
                        if (this.f110049e.m140077d() == -9223372036854775807L) {
                            j2 = -this.f110057m;
                        } else {
                            j2 = 0;
                        }
                        this.f110053i = j2;
                    }
                    this.f110054j = 4;
                    this.f110051g = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    if (!qer0Var.mo125312b(this.f110047c.m104271m(), 0, 11, true)) {
                        return -1;
                    }
                    this.f110047c.m104269k(0);
                    this.f110055k = this.f110047c.m104245B();
                    this.f110056l = this.f110047c.m104247D();
                    this.f110057m = this.f110047c.m104247D();
                    this.f110057m = (((long) (this.f110047c.m104245B() << 24)) | this.f110057m) * 1000;
                    this.f110047c.m104270l(3);
                    this.f110051g = 4;
                }
            } else {
                if (!qer0Var.mo125312b(this.f110046b.m104271m(), 0, 9, true)) {
                    return -1;
                }
                this.f110046b.m104269k(0);
                this.f110046b.m104270l(4);
                int iM104245B = this.f110046b.m104245B();
                int i4 = iM104245B & 4;
                int i5 = iM104245B & 1;
                if (i4 != 0 && this.f110059o == null) {
                    this.f110059o = new fir0(this.f110050f.mo101550i(8, 1));
                }
                if (i5 != 0 && this.f110060p == null) {
                    this.f110060p = new kir0(this.f110050f.mo101550i(9, 2));
                }
                this.f110050f.mo101544c();
                this.f110054j = this.f110046b.m104280v() - 5;
                this.f110051g = 2;
            }
        }
    }
}
