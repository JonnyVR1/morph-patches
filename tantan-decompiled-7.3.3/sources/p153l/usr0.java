package p153l;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class usr0 implements yrr0 {

    /* JADX INFO: renamed from: a */
    public final ktr0 f180846a;

    /* JADX INFO: renamed from: b */
    public String f180847b;

    /* JADX INFO: renamed from: c */
    public sgr0 f180848c;

    /* JADX INFO: renamed from: d */
    public tsr0 f180849d;

    /* JADX INFO: renamed from: e */
    public boolean f180850e;

    /* JADX INFO: renamed from: l */
    public long f180857l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f180851f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final ysr0 f180852g = new ysr0(32, 128);

    /* JADX INFO: renamed from: h */
    public final ysr0 f180853h = new ysr0(33, 128);

    /* JADX INFO: renamed from: i */
    public final ysr0 f180854i = new ysr0(34, 128);

    /* JADX INFO: renamed from: j */
    public final ysr0 f180855j = new ysr0(39, 128);

    /* JADX INFO: renamed from: k */
    public final ysr0 f180856k = new ysr0(40, 128);

    /* JADX INFO: renamed from: m */
    public long f180858m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final bgw0 f180859n = new bgw0();

    public usr0(ktr0 ktr0Var) {
        this.f180846a = ktr0Var;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: e */
    private final void m197954e(byte[] bArr, int i, int i2) {
        this.f180849d.m192640c(bArr, i, i2);
        if (!this.f180850e) {
            this.f180852g.m217273a(bArr, i, i2);
            this.f180853h.m217273a(bArr, i, i2);
            this.f180854i.m217273a(bArr, i, i2);
        }
        this.f180855j.m217273a(bArr, i, i2);
        this.f180856k.m217273a(bArr, i, i2);
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
        lev0.m153954b(this.f180848c);
        int i = mpw0.f137957a;
        if (z) {
            this.f180849d.m192638a(this.f180857l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x013a  */
    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        lev0.m153954b(this.f180848c);
        int i = mpw0.f137957a;
        while (bgw0Var.m104275q() > 0) {
            int iM104277s = bgw0Var.m104277s();
            int iM104278t = bgw0Var.m104278t();
            byte[] bArrM104271m = bgw0Var.m104271m();
            this.f180857l += (long) bgw0Var.m104275q();
            this.f180848c.mo99375f(bgw0Var, bgw0Var.m104275q());
            while (iM104277s < iM104278t) {
                int iM204791a = w3x0.m204791a(bArrM104271m, iM104277s, iM104278t, this.f180851f);
                if (iM204791a == iM104278t) {
                    m197954e(bArrM104271m, iM104277s, iM104278t);
                    return;
                }
                int i2 = iM204791a + 3;
                int i3 = bArrM104271m[i2] & 126;
                int i4 = iM204791a - iM104277s;
                if (i4 > 0) {
                    m197954e(bArrM104271m, iM104277s, iM204791a);
                }
                int i5 = iM104278t - iM204791a;
                long j = this.f180857l - ((long) i5);
                int i6 = i4 < 0 ? -i4 : 0;
                long j2 = this.f180858m;
                this.f180849d.m192639b(j, i5, this.f180850e);
                if (!this.f180850e) {
                    this.f180852g.m217276d(i6);
                    this.f180853h.m217276d(i6);
                    this.f180854i.m217276d(i6);
                    ysr0 ysr0Var = this.f180852g;
                    if (ysr0Var.m217277e()) {
                        ysr0 ysr0Var2 = this.f180853h;
                        if (ysr0Var2.m217277e()) {
                            ysr0 ysr0Var3 = this.f180854i;
                            if (ysr0Var3.m217277e()) {
                                sgr0 sgr0Var = this.f180848c;
                                String str = this.f180847b;
                                int i7 = ysr0Var.f201448e;
                                byte[] bArr = new byte[ysr0Var2.f201448e + i7 + ysr0Var3.f201448e];
                                System.arraycopy(ysr0Var.f201447d, 0, bArr, 0, i7);
                                System.arraycopy(ysr0Var2.f201447d, 0, bArr, ysr0Var.f201448e, ysr0Var2.f201448e);
                                System.arraycopy(ysr0Var3.f201447d, 0, bArr, ysr0Var.f201448e + ysr0Var2.f201448e, ysr0Var3.f201448e);
                                f0x0 f0x0VarM204793c = w3x0.m204793c(ysr0Var2.f201447d, 5, ysr0Var2.f201448e);
                                String strM181491b = rgv0.m181491b(f0x0VarM204793c.f96732a, f0x0VarM204793c.f96733b, f0x0VarM204793c.f96734c, f0x0VarM204793c.f96735d, f0x0VarM204793c.f96738g, f0x0VarM204793c.f96739h);
                                znr0 znr0Var = new znr0();
                                znr0Var.m220658k(str);
                                znr0Var.m220672w("video/hevc");
                                znr0Var.m220661l0(strM181491b);
                                znr0Var.m220644C(f0x0VarM204793c.f96740i);
                                znr0Var.m220654i(f0x0VarM204793c.f96741j);
                                dty0 dty0Var = new dty0();
                                dty0Var.m117903c(f0x0VarM204793c.f96743l);
                                dty0Var.m117902b(f0x0VarM204793c.f96744m);
                                dty0Var.m117904d(f0x0VarM204793c.f96745n);
                                dty0Var.m117906f(f0x0VarM204793c.f96736e + 8);
                                dty0Var.m117901a(f0x0VarM204793c.f96737f + 8);
                                znr0Var.m220646a(dty0Var.m117907g());
                                znr0Var.m220668s(f0x0VarM204793c.f96742k);
                                znr0Var.m220660l(Collections.singletonList(bArr));
                                sgr0Var.mo99373d(znr0Var.m220645D());
                                this.f180850e = true;
                            }
                        }
                    }
                }
                if (this.f180855j.m217276d(i6)) {
                    ysr0 ysr0Var4 = this.f180855j;
                    this.f180859n.m104267i(this.f180855j.f201447d, w3x0.m204792b(ysr0Var4.f201447d, ysr0Var4.f201448e));
                    this.f180859n.m104270l(5);
                    this.f180846a.m151396a(j2, this.f180859n);
                }
                if (this.f180856k.m217276d(i6)) {
                    ysr0 ysr0Var5 = this.f180856k;
                    this.f180859n.m104267i(this.f180856k.f201447d, w3x0.m204792b(ysr0Var5.f201447d, ysr0Var5.f201448e));
                    this.f180859n.m104270l(5);
                    this.f180846a.m151396a(j2, this.f180859n);
                }
                int i8 = i3 >> 1;
                this.f180849d.m192642e(j, i5, i8, this.f180858m, this.f180850e);
                if (!this.f180850e) {
                    this.f180852g.m217275c(i8);
                    this.f180853h.m217275c(i8);
                    this.f180854i.m217275c(i8);
                }
                this.f180855j.m217275c(i8);
                this.f180856k.m217275c(i8);
                iM104277s = i2;
            }
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f180858m = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f180847b = gur0Var.m132385b();
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 2);
        this.f180848c = sgr0VarMo101550i;
        this.f180849d = new tsr0(sgr0VarMo101550i);
        this.f180846a.m151397b(ser0Var, gur0Var);
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f180857l = 0L;
        this.f180858m = -9223372036854775807L;
        w3x0.m204796f(this.f180851f);
        this.f180852g.m217274b();
        this.f180853h.m217274b();
        this.f180854i.m217274b();
        this.f180855j.m217274b();
        this.f180856k.m217274b();
        tsr0 tsr0Var = this.f180849d;
        if (tsr0Var != null) {
            tsr0Var.m192641d();
        }
    }
}
