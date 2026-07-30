package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class sjx0 {

    /* JADX INFO: renamed from: a */
    public final boolean f164922a;

    public sjx0(pjx0 pjx0Var) {
        sf80.m183895q(pjx0Var, "BuildInfo must be non-null");
        this.f164922a = !pjx0Var.zza();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m184566a(String str) {
        sf80.m183895q(str, "flagName must not be null");
        if (this.f164922a) {
            return rkx0.f159912a.get().containsValue(str);
        }
        return true;
    }
}
