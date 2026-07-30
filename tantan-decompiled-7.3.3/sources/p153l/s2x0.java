package p153l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class s2x0 {

    /* JADX INFO: renamed from: a */
    public String f165942a;

    /* JADX INFO: renamed from: b */
    public t2x0 f165943b;

    /* JADX INFO: renamed from: c */
    public gyw0 f165944c;

    public /* synthetic */ s2x0(r2x0 r2x0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final s2x0 m184153a(gyw0 gyw0Var) {
        this.f165944c = gyw0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final s2x0 m184154b(t2x0 t2x0Var) {
        this.f165943b = t2x0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final s2x0 m184155c(String str) {
        this.f165942a = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final v2x0 m184156d() throws GeneralSecurityException {
        if (this.f165942a == null) {
            phw0.m172339a("kekUri must be set");
            return null;
        }
        t2x0 t2x0Var = this.f165943b;
        if (t2x0Var == null) {
            phw0.m172339a("dekParsingStrategy must be set");
            return null;
        }
        gyw0 gyw0Var = this.f165944c;
        if (gyw0Var == null) {
            phw0.m172339a("dekParametersForNewKeys must be set");
            return null;
        }
        if (gyw0Var.mo101510a()) {
            phw0.m172339a("dekParametersForNewKeys must note have ID Requirements");
            return null;
        }
        if ((t2x0Var == t2x0.f171829b && (gyw0Var instanceof o0x0)) || ((t2x0Var == t2x0.f171831d && (gyw0Var instanceof r1x0)) || ((t2x0Var == t2x0.f171830c && (gyw0Var instanceof o3x0)) || ((t2x0Var == t2x0.f171832e && (gyw0Var instanceof xyw0)) || ((t2x0Var == t2x0.f171833f && (gyw0Var instanceof rzw0)) || (t2x0Var == t2x0.f171834g && (gyw0Var instanceof b1x0))))))) {
            return new v2x0(this.f165942a, this.f165943b, this.f165944c, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.f165943b.toString() + " when new keys are picked according to " + String.valueOf(this.f165944c) + ".");
    }
}
