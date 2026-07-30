package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ysx0 {

    /* JADX INFO: renamed from: a */
    public final boolean f201470a;

    public ysx0(vsx0 vsx0Var) {
        xn80.m212112q(vsx0Var, "BuildInfo must be non-null");
        this.f201470a = !vsx0Var.zza();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m217279a(String str) {
        xn80.m212112q(str, "flagName must not be null");
        if (this.f201470a) {
            return xtx0.f196254a.get().containsValue(str);
        }
        return true;
    }
}
