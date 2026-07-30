package p149l;

import com.google.android.gms.internal.ads.zzcc;

/* JADX INFO: loaded from: classes6.dex */
public final class ucr0 {

    /* JADX INFO: renamed from: a */
    public final int f175852a;

    /* JADX INFO: renamed from: b */
    public int f175853b;

    /* JADX INFO: renamed from: c */
    public int f175854c;

    /* JADX INFO: renamed from: d */
    public long f175855d;

    /* JADX INFO: renamed from: e */
    public final boolean f175856e;

    /* JADX INFO: renamed from: f */
    public final v6w0 f175857f;

    /* JADX INFO: renamed from: g */
    public final v6w0 f175858g;

    /* JADX INFO: renamed from: h */
    public int f175859h;

    /* JADX INFO: renamed from: i */
    public int f175860i;

    public ucr0(v6w0 v6w0Var, v6w0 v6w0Var2, boolean z) throws zzcc {
        this.f175858g = v6w0Var;
        this.f175857f = v6w0Var2;
        this.f175856e = z;
        v6w0Var2.m197262k(12);
        this.f175852a = v6w0Var2.m197241E();
        v6w0Var.m197262k(12);
        this.f175860i = v6w0Var.m197241E();
        n5r0.m157996b(v6w0Var.m197273v() == 1, "first_chunk must be 1");
        this.f175853b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m193103a() {
        int i = this.f175853b + 1;
        this.f175853b = i;
        if (i == this.f175852a) {
            return false;
        }
        boolean z = this.f175856e;
        v6w0 v6w0Var = this.f175857f;
        this.f175855d = z ? v6w0Var.m197247K() : v6w0Var.m197246J();
        if (this.f175853b == this.f175859h) {
            this.f175854c = this.f175858g.m197241E();
            this.f175858g.m197263l(4);
            int i2 = this.f175860i - 1;
            this.f175860i = i2;
            this.f175859h = i2 > 0 ? (-1) + this.f175858g.m197241E() : -1;
        }
        return true;
    }
}
