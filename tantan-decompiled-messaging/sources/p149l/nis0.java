package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class nis0 {

    /* JADX INFO: renamed from: i */
    public static final nis0 f139143i = new for0().m122518c();

    /* JADX INFO: renamed from: j */
    public static final String f139144j = Integer.toString(0, 36);

    /* JADX INFO: renamed from: k */
    public static final String f139145k = Integer.toString(1, 36);

    /* JADX INFO: renamed from: l */
    public static final String f139146l = Integer.toString(2, 36);

    /* JADX INFO: renamed from: m */
    public static final String f139147m = Integer.toString(3, 36);

    /* JADX INFO: renamed from: n */
    public static final String f139148n = Integer.toString(4, 36);

    /* JADX INFO: renamed from: o */
    public static final String f139149o = Integer.toString(5, 36);

    /* JADX INFO: renamed from: p */
    @Deprecated
    public static final g8y0 f139150p = new g8y0() { // from class: l.ikr0
    };

    /* JADX INFO: renamed from: a */
    public final String f139151a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final t9s0 f139152b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @Deprecated
    public final t9s0 f139153c;

    /* JADX INFO: renamed from: d */
    public final d6s0 f139154d;

    /* JADX INFO: renamed from: e */
    public final lqs0 f139155e;

    /* JADX INFO: renamed from: f */
    public final ysr0 f139156f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final nvr0 f139157g;

    /* JADX INFO: renamed from: h */
    public final rds0 f139158h;

    public /* synthetic */ nis0(String str, nvr0 nvr0Var, t9s0 t9s0Var, d6s0 d6s0Var, lqs0 lqs0Var, rds0 rds0Var, qhs0 qhs0Var) {
        this.f139151a = str;
        this.f139152b = t9s0Var;
        this.f139153c = t9s0Var;
        this.f139154d = d6s0Var;
        this.f139155e = lqs0Var;
        this.f139156f = nvr0Var;
        this.f139157g = nvr0Var;
        this.f139158h = rds0Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nis0)) {
            return false;
        }
        nis0 nis0Var = (nis0) obj;
        return ggw0.m126064f(this.f139151a, nis0Var.f139151a) && this.f139156f.equals(nis0Var.f139156f) && ggw0.m126064f(this.f139152b, nis0Var.f139152b) && ggw0.m126064f(this.f139154d, nis0Var.f139154d) && ggw0.m126064f(this.f139155e, nis0Var.f139155e) && ggw0.m126064f(this.f139158h, nis0Var.f139158h);
    }

    public final int hashCode() {
        int iHashCode = this.f139151a.hashCode() * 31;
        t9s0 t9s0Var = this.f139152b;
        return (((((((iHashCode + (t9s0Var != null ? t9s0Var.hashCode() : 0)) * 31) + this.f139154d.hashCode()) * 31) + this.f139156f.hashCode()) * 31) + this.f139155e.hashCode()) * 31;
    }
}
