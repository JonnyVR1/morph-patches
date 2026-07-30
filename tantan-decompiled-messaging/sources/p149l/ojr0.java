package p149l;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ojr0 implements sir0 {

    /* JADX INFO: renamed from: a */
    public final ekr0 f144334a;

    /* JADX INFO: renamed from: b */
    public String f144335b;

    /* JADX INFO: renamed from: c */
    public m7r0 f144336c;

    /* JADX INFO: renamed from: d */
    public njr0 f144337d;

    /* JADX INFO: renamed from: e */
    public boolean f144338e;

    /* JADX INFO: renamed from: l */
    public long f144345l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f144339f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final sjr0 f144340g = new sjr0(32, 128);

    /* JADX INFO: renamed from: h */
    public final sjr0 f144341h = new sjr0(33, 128);

    /* JADX INFO: renamed from: i */
    public final sjr0 f144342i = new sjr0(34, 128);

    /* JADX INFO: renamed from: j */
    public final sjr0 f144343j = new sjr0(39, 128);

    /* JADX INFO: renamed from: k */
    public final sjr0 f144344k = new sjr0(40, 128);

    /* JADX INFO: renamed from: m */
    public long f144346m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final v6w0 f144347n = new v6w0();

    public ojr0(ekr0 ekr0Var) {
        this.f144334a = ekr0Var;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: e */
    private final void m164752e(byte[] bArr, int i, int i2) {
        this.f144337d.m159787c(bArr, i, i2);
        if (!this.f144338e) {
            this.f144340g.m184548a(bArr, i, i2);
            this.f144341h.m184548a(bArr, i, i2);
            this.f144342i.m184548a(bArr, i, i2);
        }
        this.f144343j.m184548a(bArr, i, i2);
        this.f144344k.m184548a(bArr, i, i2);
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
        f5v0.m119531b(this.f144336c);
        int i = ggw0.f102568a;
        if (z) {
            this.f144337d.m159785a(this.f144345l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x013a  */
    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        f5v0.m119531b(this.f144336c);
        int i = ggw0.f102568a;
        while (v6w0Var.m197268q() > 0) {
            int iM197270s = v6w0Var.m197270s();
            int iM197271t = v6w0Var.m197271t();
            byte[] bArrM197264m = v6w0Var.m197264m();
            this.f144345l += (long) v6w0Var.m197268q();
            this.f144336c.mo134533f(v6w0Var, v6w0Var.m197268q());
            while (iM197270s < iM197271t) {
                int iM176658a = quw0.m176658a(bArrM197264m, iM197270s, iM197271t, this.f144339f);
                if (iM176658a == iM197271t) {
                    m164752e(bArrM197264m, iM197270s, iM197271t);
                    return;
                }
                int i2 = iM176658a + 3;
                int i3 = bArrM197264m[i2] & 126;
                int i4 = iM176658a - iM197270s;
                if (i4 > 0) {
                    m164752e(bArrM197264m, iM197270s, iM176658a);
                }
                int i5 = iM197271t - iM176658a;
                long j = this.f144345l - ((long) i5);
                int i6 = i4 < 0 ? -i4 : 0;
                long j2 = this.f144346m;
                this.f144337d.m159786b(j, i5, this.f144338e);
                if (!this.f144338e) {
                    this.f144340g.m184551d(i6);
                    this.f144341h.m184551d(i6);
                    this.f144342i.m184551d(i6);
                    sjr0 sjr0Var = this.f144340g;
                    if (sjr0Var.m184552e()) {
                        sjr0 sjr0Var2 = this.f144341h;
                        if (sjr0Var2.m184552e()) {
                            sjr0 sjr0Var3 = this.f144342i;
                            if (sjr0Var3.m184552e()) {
                                m7r0 m7r0Var = this.f144336c;
                                String str = this.f144335b;
                                int i7 = sjr0Var.f164903e;
                                byte[] bArr = new byte[sjr0Var2.f164903e + i7 + sjr0Var3.f164903e];
                                System.arraycopy(sjr0Var.f164902d, 0, bArr, 0, i7);
                                System.arraycopy(sjr0Var2.f164902d, 0, bArr, sjr0Var.f164903e, sjr0Var2.f164903e);
                                System.arraycopy(sjr0Var3.f164902d, 0, bArr, sjr0Var.f164903e + sjr0Var2.f164903e, sjr0Var3.f164903e);
                                zqw0 zqw0VarM176660c = quw0.m176660c(sjr0Var2.f164902d, 5, sjr0Var2.f164903e);
                                String strM148828b = l7v0.m148828b(zqw0VarM176660c.f204420a, zqw0VarM176660c.f204421b, zqw0VarM176660c.f204422c, zqw0VarM176660c.f204423d, zqw0VarM176660c.f204426g, zqw0VarM176660c.f204427h);
                                ter0 ter0Var = new ter0();
                                ter0Var.m188604k(str);
                                ter0Var.m188618w("video/hevc");
                                ter0Var.m188607l0(strM148828b);
                                ter0Var.m188590C(zqw0VarM176660c.f204428i);
                                ter0Var.m188600i(zqw0VarM176660c.f204429j);
                                xjy0 xjy0Var = new xjy0();
                                xjy0Var.m209757c(zqw0VarM176660c.f204431l);
                                xjy0Var.m209756b(zqw0VarM176660c.f204432m);
                                xjy0Var.m209758d(zqw0VarM176660c.f204433n);
                                xjy0Var.m209760f(zqw0VarM176660c.f204424e + 8);
                                xjy0Var.m209755a(zqw0VarM176660c.f204425f + 8);
                                ter0Var.m188592a(xjy0Var.m209761g());
                                ter0Var.m188614s(zqw0VarM176660c.f204430k);
                                ter0Var.m188606l(Collections.singletonList(bArr));
                                m7r0Var.mo134531d(ter0Var.m188591D());
                                this.f144338e = true;
                            }
                        }
                    }
                }
                if (this.f144343j.m184551d(i6)) {
                    sjr0 sjr0Var4 = this.f144343j;
                    this.f144347n.m197260i(this.f144343j.f164902d, quw0.m176659b(sjr0Var4.f164902d, sjr0Var4.f164903e));
                    this.f144347n.m197263l(5);
                    this.f144334a.m116992a(j2, this.f144347n);
                }
                if (this.f144344k.m184551d(i6)) {
                    sjr0 sjr0Var5 = this.f144344k;
                    this.f144347n.m197260i(this.f144344k.f164902d, quw0.m176659b(sjr0Var5.f164902d, sjr0Var5.f164903e));
                    this.f144347n.m197263l(5);
                    this.f144334a.m116992a(j2, this.f144347n);
                }
                int i8 = i3 >> 1;
                this.f144337d.m159789e(j, i5, i8, this.f144346m, this.f144338e);
                if (!this.f144338e) {
                    this.f144340g.m184550c(i8);
                    this.f144341h.m184550c(i8);
                    this.f144342i.m184550c(i8);
                }
                this.f144343j.m184550c(i8);
                this.f144344k.m184550c(i8);
                iM197270s = i2;
            }
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f144346m = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f144335b = alr0Var.m97443b();
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 2);
        this.f144336c = m7r0VarMo129454i;
        this.f144337d = new njr0(m7r0VarMo129454i);
        this.f144334a.m116993b(m5r0Var, alr0Var);
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f144345l = 0L;
        this.f144346m = -9223372036854775807L;
        quw0.m176663f(this.f144339f);
        this.f144340g.m184549b();
        this.f144341h.m184549b();
        this.f144342i.m184549b();
        this.f144343j.m184549b();
        this.f144344k.m184549b();
        njr0 njr0Var = this.f144337d;
        if (njr0Var != null) {
            njr0Var.m159788d();
        }
    }
}
