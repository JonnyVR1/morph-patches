package p149l;

import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class mjr0 implements sir0 {

    /* JADX INFO: renamed from: a */
    public final ekr0 f134234a;

    /* JADX INFO: renamed from: e */
    public long f134238e;

    /* JADX INFO: renamed from: g */
    public String f134240g;

    /* JADX INFO: renamed from: h */
    public m7r0 f134241h;

    /* JADX INFO: renamed from: i */
    public ljr0 f134242i;

    /* JADX INFO: renamed from: j */
    public boolean f134243j;

    /* JADX INFO: renamed from: l */
    public boolean f134245l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f134239f = new boolean[3];

    /* JADX INFO: renamed from: b */
    public final sjr0 f134235b = new sjr0(7, 128);

    /* JADX INFO: renamed from: c */
    public final sjr0 f134236c = new sjr0(8, 128);

    /* JADX INFO: renamed from: d */
    public final sjr0 f134237d = new sjr0(6, 128);

    /* JADX INFO: renamed from: k */
    public long f134244k = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public final v6w0 f134246m = new v6w0();

    public mjr0(ekr0 ekr0Var, boolean z, boolean z2) {
        this.f134234a = ekr0Var;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
        f5v0.m119531b(this.f134241h);
        int i = ggw0.f102568a;
        if (z) {
            this.f134242i.m150037a(this.f134238e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        int i;
        int i2;
        f5v0.m119531b(this.f134241h);
        int i3 = ggw0.f102568a;
        int iM197270s = v6w0Var.m197270s();
        int iM197271t = v6w0Var.m197271t();
        byte[] bArrM197264m = v6w0Var.m197264m();
        this.f134238e += (long) v6w0Var.m197268q();
        this.f134241h.mo134533f(v6w0Var, v6w0Var.m197268q());
        while (true) {
            int iM176658a = quw0.m176658a(bArrM197264m, iM197270s, iM197271t, this.f134239f);
            if (iM176658a == iM197271t) {
                m154910e(bArrM197264m, iM197270s, iM197271t);
                return;
            }
            int i4 = iM176658a + 3;
            int i5 = bArrM197264m[i4] & 31;
            int i6 = iM176658a - iM197270s;
            if (i6 > 0) {
                m154910e(bArrM197264m, iM197270s, iM176658a);
            }
            int i7 = iM197271t - iM176658a;
            long j = this.f134238e - ((long) i7);
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.f134244k;
            if (this.f134243j) {
                i = iM197271t;
                i2 = i4;
            } else {
                this.f134235b.m184551d(i8);
                this.f134236c.m184551d(i8);
                boolean z = this.f134243j;
                sjr0 sjr0Var = this.f134235b;
                if (z) {
                    i = iM197271t;
                    i2 = i4;
                    if (sjr0Var.m184552e()) {
                        this.f134242i.m150039c(quw0.m176662e(sjr0Var.f164902d, 4, sjr0Var.f164903e));
                        this.f134235b.m184549b();
                    } else {
                        sjr0 sjr0Var2 = this.f134236c;
                        if (sjr0Var2.m184552e()) {
                            this.f134242i.m150038b(quw0.m176661d(sjr0Var2.f164902d, 4, sjr0Var2.f164903e));
                            this.f134236c.m184549b();
                        }
                    }
                } else if (sjr0Var.m184552e() && this.f134236c.m184552e()) {
                    ArrayList arrayList = new ArrayList();
                    sjr0 sjr0Var3 = this.f134235b;
                    arrayList.add(Arrays.copyOf(sjr0Var3.f164902d, sjr0Var3.f164903e));
                    sjr0 sjr0Var4 = this.f134236c;
                    arrayList.add(Arrays.copyOf(sjr0Var4.f164902d, sjr0Var4.f164903e));
                    sjr0 sjr0Var5 = this.f134235b;
                    jtw0 jtw0VarM176662e = quw0.m176662e(sjr0Var5.f164902d, 4, sjr0Var5.f164903e);
                    sjr0 sjr0Var6 = this.f134236c;
                    dsw0 dsw0VarM176661d = quw0.m176661d(sjr0Var6.f164902d, 4, sjr0Var6.f164903e);
                    i2 = i4;
                    String strM148827a = l7v0.m148827a(jtw0VarM176662e.f119678a, jtw0VarM176662e.f119679b, jtw0VarM176662e.f119680c);
                    m7r0 m7r0Var = this.f134241h;
                    ter0 ter0Var = new ter0();
                    i = iM197271t;
                    ter0Var.m188604k(this.f134240g);
                    ter0Var.m188618w(YtVideoEncoder.MIME_TYPE);
                    ter0Var.m188607l0(strM148827a);
                    ter0Var.m188590C(jtw0VarM176662e.f119682e);
                    ter0Var.m188600i(jtw0VarM176662e.f119683f);
                    xjy0 xjy0Var = new xjy0();
                    xjy0Var.m209757c(jtw0VarM176662e.f119687j);
                    xjy0Var.m209756b(jtw0VarM176662e.f119688k);
                    xjy0Var.m209758d(jtw0VarM176662e.f119689l);
                    xjy0Var.m209760f(jtw0VarM176662e.f119685h + 8);
                    xjy0Var.m209755a(jtw0VarM176662e.f119686i + 8);
                    ter0Var.m188592a(xjy0Var.m209761g());
                    ter0Var.m188614s(jtw0VarM176662e.f119684g);
                    ter0Var.m188606l(arrayList);
                    m7r0Var.mo134531d(ter0Var.m188591D());
                    this.f134243j = true;
                    this.f134242i.m150039c(jtw0VarM176662e);
                    this.f134242i.m150038b(dsw0VarM176661d);
                    this.f134235b.m184549b();
                    this.f134236c.m184549b();
                } else {
                    i = iM197271t;
                    i2 = i4;
                }
            }
            if (this.f134237d.m184551d(i8)) {
                sjr0 sjr0Var7 = this.f134237d;
                this.f134246m.m197260i(this.f134237d.f164902d, quw0.m176659b(sjr0Var7.f164902d, sjr0Var7.f164903e));
                this.f134246m.m197262k(4);
                this.f134234a.m116992a(j2, this.f134246m);
            }
            if (this.f134242i.m150042f(j, i7, this.f134243j)) {
                this.f134245l = false;
            }
            long j3 = this.f134244k;
            if (!this.f134243j) {
                this.f134235b.m184550c(i5);
                this.f134236c.m184550c(i5);
            }
            this.f134237d.m184550c(i5);
            this.f134242i.m150041e(j, i5, j3, this.f134245l);
            iM197270s = i2;
            iM197271t = i;
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f134244k = j;
        int i2 = i & 2;
        this.f134245l = (i2 != 0) | this.f134245l;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f134240g = alr0Var.m97443b();
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 2);
        this.f134241h = m7r0VarMo129454i;
        this.f134242i = new ljr0(m7r0VarMo129454i, false, false);
        this.f134234a.m116993b(m5r0Var, alr0Var);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: e */
    public final void m154910e(byte[] bArr, int i, int i2) {
        if (!this.f134243j) {
            this.f134235b.m184548a(bArr, i, i2);
            this.f134236c.m184548a(bArr, i, i2);
        }
        this.f134237d.m184548a(bArr, i, i2);
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f134238e = 0L;
        this.f134245l = false;
        this.f134244k = -9223372036854775807L;
        quw0.m176663f(this.f134239f);
        this.f134235b.m184549b();
        this.f134236c.m184549b();
        this.f134237d.m184549b();
        ljr0 ljr0Var = this.f134242i;
        if (ljr0Var != null) {
            ljr0Var.m150040d();
        }
    }
}
