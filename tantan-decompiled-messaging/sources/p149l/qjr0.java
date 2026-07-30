package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class qjr0 implements sir0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f154966a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f154967b;

    /* JADX INFO: renamed from: c */
    public final x5w0 f154968c;

    /* JADX INFO: renamed from: d */
    public m7r0 f154969d;

    /* JADX INFO: renamed from: e */
    public String f154970e;

    /* JADX INFO: renamed from: f */
    public mhr0 f154971f;

    /* JADX INFO: renamed from: g */
    public int f154972g;

    /* JADX INFO: renamed from: h */
    public int f154973h;

    /* JADX INFO: renamed from: i */
    public int f154974i;

    /* JADX INFO: renamed from: j */
    public int f154975j;

    /* JADX INFO: renamed from: k */
    public long f154976k;

    /* JADX INFO: renamed from: l */
    public boolean f154977l;

    /* JADX INFO: renamed from: m */
    public int f154978m;

    /* JADX INFO: renamed from: n */
    public int f154979n;

    /* JADX INFO: renamed from: o */
    public int f154980o;

    /* JADX INFO: renamed from: p */
    public boolean f154981p;

    /* JADX INFO: renamed from: q */
    public long f154982q;

    /* JADX INFO: renamed from: r */
    public int f154983r;

    /* JADX INFO: renamed from: s */
    public long f154984s;

    /* JADX INFO: renamed from: t */
    public int f154985t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public String f154986u;

    public qjr0(@Nullable String str) {
        this.f154966a = str;
        v6w0 v6w0Var = new v6w0(1024);
        this.f154967b = v6w0Var;
        byte[] bArrM197264m = v6w0Var.m197264m();
        this.f154968c = new x5w0(bArrM197264m, bArrM197264m.length);
        this.f154976k = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public static long m175035f(x5w0 x5w0Var) {
        return x5w0Var.m207150d((x5w0Var.m207150d(2) + 1) * 8);
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) throws zzcc {
        int i;
        int i2;
        int iM207150d;
        boolean zM207161o;
        f5v0.m119531b(this.f154969d);
        while (v6w0Var.m197268q() > 0) {
            int i3 = this.f154972g;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iM197238B = v6w0Var.m197238B();
                    if ((iM197238B & 224) == 224) {
                        this.f154975j = iM197238B;
                        this.f154972g = 2;
                    } else if (iM197238B != 86) {
                        this.f154972g = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(v6w0Var.m197268q(), this.f154974i - this.f154973h);
                    v6w0Var.m197258g(this.f154968c.f191198a, this.f154973h, iMin);
                    int i4 = this.f154973h + iMin;
                    this.f154973h = i4;
                    if (i4 == this.f154974i) {
                        this.f154968c.m207157k(0);
                        x5w0 x5w0Var = this.f154968c;
                        if (x5w0Var.m207161o()) {
                            if (this.f154977l) {
                            }
                            this.f154972g = 0;
                        } else {
                            this.f154977l = true;
                            int iM207150d2 = x5w0Var.m207150d(1);
                            if (iM207150d2 == 1) {
                                iM207150d = x5w0Var.m207150d(1);
                                i2 = 1;
                            } else {
                                i2 = iM207150d2;
                                iM207150d = 0;
                            }
                            this.f154978m = iM207150d;
                            if (iM207150d != 0) {
                                throw zzcc.zza(null, null);
                            }
                            if (i2 == 1) {
                                m175035f(x5w0Var);
                                i2 = 1;
                            }
                            if (!x5w0Var.m207161o()) {
                                throw zzcc.zza(null, null);
                            }
                            this.f154979n = x5w0Var.m207150d(6);
                            int iM207150d3 = x5w0Var.m207150d(4);
                            int iM207150d4 = x5w0Var.m207150d(3);
                            if (iM207150d3 != 0 || iM207150d4 != 0) {
                                throw zzcc.zza(null, null);
                            }
                            if (i2 == 0) {
                                int iM207149c = x5w0Var.m207149c();
                                int iM175036e = m175036e(x5w0Var);
                                x5w0Var.m207157k(iM207149c);
                                byte[] bArr = new byte[(iM175036e + 7) / 8];
                                x5w0Var.m207153g(bArr, 0, iM175036e);
                                ter0 ter0Var = new ter0();
                                ter0Var.m188604k(this.f154970e);
                                ter0Var.m188618w("audio/mp4a-latm");
                                ter0Var.m188607l0(this.f154986u);
                                ter0Var.m188605k0(this.f154985t);
                                ter0Var.m188619x(this.f154983r);
                                ter0Var.m188606l(Collections.singletonList(bArr));
                                ter0Var.m188609n(this.f154966a);
                                mhr0 mhr0VarM188591D = ter0Var.m188591D();
                                if (!mhr0VarM188591D.equals(this.f154971f)) {
                                    this.f154971f = mhr0VarM188591D;
                                    this.f154984s = 1024000000 / ((long) mhr0VarM188591D.f133906z);
                                    this.f154969d.mo134531d(mhr0VarM188591D);
                                }
                            } else {
                                x5w0Var.m207159m(((int) m175035f(x5w0Var)) - m175036e(x5w0Var));
                            }
                            int iM207150d5 = x5w0Var.m207150d(3);
                            this.f154980o = iM207150d5;
                            if (iM207150d5 == 0) {
                                x5w0Var.m207159m(8);
                            } else if (iM207150d5 == 1) {
                                x5w0Var.m207159m(9);
                            } else if (iM207150d5 == 3 || iM207150d5 == 4 || iM207150d5 == 5) {
                                x5w0Var.m207159m(6);
                            } else {
                                if (iM207150d5 != 6 && iM207150d5 != 7) {
                                    ohg0.m164364a();
                                    return;
                                }
                                x5w0Var.m207159m(1);
                            }
                            boolean zM207161o2 = x5w0Var.m207161o();
                            this.f154981p = zM207161o2;
                            this.f154982q = 0L;
                            if (zM207161o2) {
                                if (i2 != 1) {
                                    do {
                                        zM207161o = x5w0Var.m207161o();
                                        this.f154982q = (this.f154982q << 8) + ((long) x5w0Var.m207150d(8));
                                    } while (zM207161o);
                                } else {
                                    this.f154982q = m175035f(x5w0Var);
                                }
                            }
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(8);
                            }
                        }
                        if (this.f154978m != 0) {
                            throw zzcc.zza(null, null);
                        }
                        if (this.f154979n != 0) {
                            throw zzcc.zza(null, null);
                        }
                        if (this.f154980o != 0) {
                            throw zzcc.zza(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iM207150d6 = x5w0Var.m207150d(8);
                            i = i5 + iM207150d6;
                            if (iM207150d6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iM207149c2 = x5w0Var.m207149c();
                        int i6 = iM207149c2 & 7;
                        v6w0 v6w0Var2 = this.f154967b;
                        if (i6 == 0) {
                            v6w0Var2.m197262k(iM207149c2 >> 3);
                        } else {
                            x5w0Var.m207153g(v6w0Var2.m197264m(), 0, i * 8);
                            this.f154967b.m197262k(0);
                        }
                        this.f154969d.mo134533f(this.f154967b, i);
                        f5v0.m119535f(this.f154976k != -9223372036854775807L);
                        this.f154969d.mo134530c(this.f154976k, 1, i, 0, null);
                        this.f154976k += this.f154984s;
                        if (this.f154981p) {
                            x5w0Var.m207159m((int) this.f154982q);
                        }
                        this.f154972g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iM197238B2 = ((this.f154975j & (-225)) << 8) | v6w0Var.m197238B();
                    this.f154974i = iM197238B2;
                    v6w0 v6w0Var3 = this.f154967b;
                    if (iM197238B2 > v6w0Var3.m197264m().length) {
                        v6w0Var3.m197259h(iM197238B2);
                        x5w0 x5w0Var2 = this.f154968c;
                        byte[] bArrM197264m = this.f154967b.m197264m();
                        x5w0Var2.m207156j(bArrM197264m, bArrM197264m.length);
                    }
                    this.f154973h = 0;
                    this.f154972g = 3;
                }
            } else if (v6w0Var.m197238B() == 86) {
                this.f154972g = 1;
            }
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f154976k = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f154969d = m5r0Var.mo129454i(alr0Var.m97442a(), 1);
        this.f154970e = alr0Var.m97443b();
    }

    /* JADX INFO: renamed from: e */
    public final int m175036e(x5w0 x5w0Var) throws zzcc {
        int iM207147a = x5w0Var.m207147a();
        v3r0 v3r0VarM201389b = w3r0.m201389b(x5w0Var, true);
        this.f154986u = v3r0VarM201389b.f179842c;
        this.f154983r = v3r0VarM201389b.f179840a;
        this.f154985t = v3r0VarM201389b.f179841b;
        return iM207147a - x5w0Var.m207147a();
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f154972g = 0;
        this.f154976k = -9223372036854775807L;
        this.f154977l = false;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
    }
}
