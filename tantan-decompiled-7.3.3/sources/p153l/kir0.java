package p153l;

import com.google.android.gms.internal.ads.zzaff;
import com.google.android.gms.internal.ads.zzcc;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;

/* JADX INFO: loaded from: classes6.dex */
public final class kir0 extends jir0 {

    /* JADX INFO: renamed from: b */
    public final bgw0 f127016b;

    /* JADX INFO: renamed from: c */
    public final bgw0 f127017c;

    /* JADX INFO: renamed from: d */
    public int f127018d;

    /* JADX INFO: renamed from: e */
    public boolean f127019e;

    /* JADX INFO: renamed from: f */
    public boolean f127020f;

    /* JADX INFO: renamed from: g */
    public int f127021g;

    public kir0(sgr0 sgr0Var) {
        super(sgr0Var);
        this.f127016b = new bgw0(w3x0.f187180a);
        this.f127017c = new bgw0(4);
    }

    @Override // p153l.jir0
    /* JADX INFO: renamed from: a */
    public final boolean mo125712a(bgw0 bgw0Var) throws zzaff {
        int iM104245B = bgw0Var.m104245B();
        int i = iM104245B >> 4;
        int i2 = iM104245B & 15;
        if (i2 == 7) {
            this.f127021g = i;
            return i != 5;
        }
        throw new zzaff("Video format not supported: " + i2);
    }

    @Override // p153l.jir0
    /* JADX INFO: renamed from: b */
    public final boolean mo125713b(bgw0 bgw0Var, long j) throws zzcc {
        int i;
        int iM104245B = bgw0Var.m104245B();
        long jM104281w = bgw0Var.m104281w();
        if (iM104245B == 0) {
            if (!this.f127019e) {
                bgw0 bgw0Var2 = new bgw0(new byte[bgw0Var.m104275q()]);
                bgw0Var.m104265g(bgw0Var2.m104271m(), 0, bgw0Var.m104275q());
                jdr0 jdr0VarM144500a = jdr0.m144500a(bgw0Var2);
                this.f127018d = jdr0VarM144500a.f120350b;
                znr0 znr0Var = new znr0();
                znr0Var.m220672w(YtVideoEncoder.MIME_TYPE);
                znr0Var.m220661l0(jdr0VarM144500a.f120359k);
                znr0Var.m220644C(jdr0VarM144500a.f120351c);
                znr0Var.m220654i(jdr0VarM144500a.f120352d);
                znr0Var.m220668s(jdr0VarM144500a.f120358j);
                znr0Var.m220660l(jdr0VarM144500a.f120349a);
                this.f121117a.mo99373d(znr0Var.m220645D());
                this.f127019e = true;
                return false;
            }
        } else if (iM104245B == 1 && this.f127019e) {
            int i2 = this.f127021g == 1 ? 1 : 0;
            if (this.f127020f) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] bArrM104271m = this.f127017c.m104271m();
            bArrM104271m[0] = 0;
            bArrM104271m[1] = 0;
            bArrM104271m[2] = 0;
            int i3 = 4 - this.f127018d;
            int i4 = 0;
            while (bgw0Var.m104275q() > 0) {
                bgw0Var.m104265g(this.f127017c.m104271m(), i3, this.f127018d);
                this.f127017c.m104269k(0);
                bgw0 bgw0Var3 = this.f127017c;
                bgw0 bgw0Var4 = this.f127016b;
                int iM104248E = bgw0Var3.m104248E();
                bgw0Var4.m104269k(0);
                this.f121117a.mo99375f(this.f127016b, 4);
                this.f121117a.mo99375f(bgw0Var, iM104248E);
                i4 = i4 + 4 + iM104248E;
            }
            this.f121117a.mo99372c(j + (jM104281w * 1000), i, i4, 0, null);
            this.f127020f = true;
            return true;
        }
        return false;
    }
}
