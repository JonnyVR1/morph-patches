package p153l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j5x0 {

    /* JADX INFO: renamed from: a */
    public final wfx0 f118506a;

    /* JADX INFO: renamed from: b */
    public final Class f118507b;

    public /* synthetic */ j5x0(wfx0 wfx0Var, Class cls, i5x0 i5x0Var) {
        this.f118506a = wfx0Var;
        this.f118507b = cls;
    }

    /* JADX INFO: renamed from: b */
    public static j5x0 m143596b(h5x0 h5x0Var, wfx0 wfx0Var, Class cls) {
        return new g5x0(wfx0Var, cls, h5x0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract xww0 mo129076a(l7x0 l7x0Var, ayw0 ayw0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final wfx0 m143597c() {
        return this.f118506a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m143598d() {
        return this.f118507b;
    }
}
