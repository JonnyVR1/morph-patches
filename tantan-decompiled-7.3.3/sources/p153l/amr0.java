package p153l;

import com.google.android.gms.internal.ads.zzcc;

/* JADX INFO: loaded from: classes6.dex */
public final class amr0 {

    /* JADX INFO: renamed from: a */
    public final int f72249a;

    /* JADX INFO: renamed from: b */
    public int f72250b;

    /* JADX INFO: renamed from: c */
    public int f72251c;

    /* JADX INFO: renamed from: d */
    public long f72252d;

    /* JADX INFO: renamed from: e */
    public final boolean f72253e;

    /* JADX INFO: renamed from: f */
    public final bgw0 f72254f;

    /* JADX INFO: renamed from: g */
    public final bgw0 f72255g;

    /* JADX INFO: renamed from: h */
    public int f72256h;

    /* JADX INFO: renamed from: i */
    public int f72257i;

    public amr0(bgw0 bgw0Var, bgw0 bgw0Var2, boolean z) throws zzcc {
        this.f72255g = bgw0Var;
        this.f72254f = bgw0Var2;
        this.f72253e = z;
        bgw0Var2.m104269k(12);
        this.f72249a = bgw0Var2.m104248E();
        bgw0Var.m104269k(12);
        this.f72257i = bgw0Var.m104248E();
        ter0.m190892b(bgw0Var.m104280v() == 1, "first_chunk must be 1");
        this.f72250b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m98853a() {
        int i = this.f72250b + 1;
        this.f72250b = i;
        if (i == this.f72249a) {
            return false;
        }
        boolean z = this.f72253e;
        bgw0 bgw0Var = this.f72254f;
        this.f72252d = z ? bgw0Var.m104254K() : bgw0Var.m104253J();
        if (this.f72250b == this.f72256h) {
            this.f72251c = this.f72255g.m104248E();
            this.f72255g.m104270l(4);
            int i2 = this.f72257i - 1;
            this.f72257i = i2;
            this.f72256h = i2 > 0 ? (-1) + this.f72255g.m104248E() : -1;
        }
        return true;
    }
}
