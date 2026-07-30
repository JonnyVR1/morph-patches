package p153l;

import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ssr0 implements yrr0 {

    /* JADX INFO: renamed from: a */
    public final ktr0 f170505a;

    /* JADX INFO: renamed from: e */
    public long f170509e;

    /* JADX INFO: renamed from: g */
    public String f170511g;

    /* JADX INFO: renamed from: h */
    public sgr0 f170512h;

    /* JADX INFO: renamed from: i */
    public rsr0 f170513i;

    /* JADX INFO: renamed from: j */
    public boolean f170514j;

    /* JADX INFO: renamed from: l */
    public boolean f170516l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f170510f = new boolean[3];

    /* JADX INFO: renamed from: b */
    public final ysr0 f170506b = new ysr0(7, 128);

    /* JADX INFO: renamed from: c */
    public final ysr0 f170507c = new ysr0(8, 128);

    /* JADX INFO: renamed from: d */
    public final ysr0 f170508d = new ysr0(6, 128);

    /* JADX INFO: renamed from: k */
    public long f170515k = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public final bgw0 f170517m = new bgw0();

    public ssr0(ktr0 ktr0Var, boolean z, boolean z2) {
        this.f170505a = ktr0Var;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
        lev0.m153954b(this.f170512h);
        int i = mpw0.f137957a;
        if (z) {
            this.f170513i.m183024a(this.f170509e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        int i;
        int i2;
        lev0.m153954b(this.f170512h);
        int i3 = mpw0.f137957a;
        int iM104277s = bgw0Var.m104277s();
        int iM104278t = bgw0Var.m104278t();
        byte[] bArrM104271m = bgw0Var.m104271m();
        this.f170509e += (long) bgw0Var.m104275q();
        this.f170512h.mo99375f(bgw0Var, bgw0Var.m104275q());
        while (true) {
            int iM204791a = w3x0.m204791a(bArrM104271m, iM104277s, iM104278t, this.f170510f);
            if (iM204791a == iM104278t) {
                m187796e(bArrM104271m, iM104277s, iM104278t);
                return;
            }
            int i4 = iM204791a + 3;
            int i5 = bArrM104271m[i4] & 31;
            int i6 = iM204791a - iM104277s;
            if (i6 > 0) {
                m187796e(bArrM104271m, iM104277s, iM204791a);
            }
            int i7 = iM104278t - iM204791a;
            long j = this.f170509e - ((long) i7);
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.f170515k;
            if (this.f170514j) {
                i = iM104278t;
                i2 = i4;
            } else {
                this.f170506b.m217276d(i8);
                this.f170507c.m217276d(i8);
                boolean z = this.f170514j;
                ysr0 ysr0Var = this.f170506b;
                if (z) {
                    i = iM104278t;
                    i2 = i4;
                    if (ysr0Var.m217277e()) {
                        this.f170513i.m183026c(w3x0.m204795e(ysr0Var.f201447d, 4, ysr0Var.f201448e));
                        this.f170506b.m217274b();
                    } else {
                        ysr0 ysr0Var2 = this.f170507c;
                        if (ysr0Var2.m217277e()) {
                            this.f170513i.m183025b(w3x0.m204794d(ysr0Var2.f201447d, 4, ysr0Var2.f201448e));
                            this.f170507c.m217274b();
                        }
                    }
                } else if (ysr0Var.m217277e() && this.f170507c.m217277e()) {
                    ArrayList arrayList = new ArrayList();
                    ysr0 ysr0Var3 = this.f170506b;
                    arrayList.add(Arrays.copyOf(ysr0Var3.f201447d, ysr0Var3.f201448e));
                    ysr0 ysr0Var4 = this.f170507c;
                    arrayList.add(Arrays.copyOf(ysr0Var4.f201447d, ysr0Var4.f201448e));
                    ysr0 ysr0Var5 = this.f170506b;
                    p2x0 p2x0VarM204795e = w3x0.m204795e(ysr0Var5.f201447d, 4, ysr0Var5.f201448e);
                    ysr0 ysr0Var6 = this.f170507c;
                    j1x0 j1x0VarM204794d = w3x0.m204794d(ysr0Var6.f201447d, 4, ysr0Var6.f201448e);
                    i2 = i4;
                    String strM181490a = rgv0.m181490a(p2x0VarM204795e.f150330a, p2x0VarM204795e.f150331b, p2x0VarM204795e.f150332c);
                    sgr0 sgr0Var = this.f170512h;
                    znr0 znr0Var = new znr0();
                    i = iM104278t;
                    znr0Var.m220658k(this.f170511g);
                    znr0Var.m220672w(YtVideoEncoder.MIME_TYPE);
                    znr0Var.m220661l0(strM181490a);
                    znr0Var.m220644C(p2x0VarM204795e.f150334e);
                    znr0Var.m220654i(p2x0VarM204795e.f150335f);
                    dty0 dty0Var = new dty0();
                    dty0Var.m117903c(p2x0VarM204795e.f150339j);
                    dty0Var.m117902b(p2x0VarM204795e.f150340k);
                    dty0Var.m117904d(p2x0VarM204795e.f150341l);
                    dty0Var.m117906f(p2x0VarM204795e.f150337h + 8);
                    dty0Var.m117901a(p2x0VarM204795e.f150338i + 8);
                    znr0Var.m220646a(dty0Var.m117907g());
                    znr0Var.m220668s(p2x0VarM204795e.f150336g);
                    znr0Var.m220660l(arrayList);
                    sgr0Var.mo99373d(znr0Var.m220645D());
                    this.f170514j = true;
                    this.f170513i.m183026c(p2x0VarM204795e);
                    this.f170513i.m183025b(j1x0VarM204794d);
                    this.f170506b.m217274b();
                    this.f170507c.m217274b();
                } else {
                    i = iM104278t;
                    i2 = i4;
                }
            }
            if (this.f170508d.m217276d(i8)) {
                ysr0 ysr0Var7 = this.f170508d;
                this.f170517m.m104267i(this.f170508d.f201447d, w3x0.m204792b(ysr0Var7.f201447d, ysr0Var7.f201448e));
                this.f170517m.m104269k(4);
                this.f170505a.m151396a(j2, this.f170517m);
            }
            if (this.f170513i.m183029f(j, i7, this.f170514j)) {
                this.f170516l = false;
            }
            long j3 = this.f170515k;
            if (!this.f170514j) {
                this.f170506b.m217275c(i5);
                this.f170507c.m217275c(i5);
            }
            this.f170508d.m217275c(i5);
            this.f170513i.m183028e(j, i5, j3, this.f170516l);
            iM104277s = i2;
            iM104278t = i;
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f170515k = j;
        int i2 = i & 2;
        this.f170516l = (i2 != 0) | this.f170516l;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f170511g = gur0Var.m132385b();
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 2);
        this.f170512h = sgr0VarMo101550i;
        this.f170513i = new rsr0(sgr0VarMo101550i, false, false);
        this.f170505a.m151397b(ser0Var, gur0Var);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: e */
    public final void m187796e(byte[] bArr, int i, int i2) {
        if (!this.f170514j) {
            this.f170506b.m217273a(bArr, i, i2);
            this.f170507c.m217273a(bArr, i, i2);
        }
        this.f170508d.m217273a(bArr, i, i2);
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f170509e = 0L;
        this.f170516l = false;
        this.f170515k = -9223372036854775807L;
        w3x0.m204796f(this.f170510f);
        this.f170506b.m217274b();
        this.f170507c.m217274b();
        this.f170508d.m217274b();
        rsr0 rsr0Var = this.f170513i;
        if (rsr0Var != null) {
            rsr0Var.m183027d();
        }
    }
}
