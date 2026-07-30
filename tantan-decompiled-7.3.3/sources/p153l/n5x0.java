package p153l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n5x0 {

    /* JADX INFO: renamed from: a */
    public final Class f140403a;

    /* JADX INFO: renamed from: b */
    public final Class f140404b;

    public /* synthetic */ n5x0(Class cls, Class cls2, m5x0 m5x0Var) {
        this.f140403a = cls;
        this.f140404b = cls2;
    }

    /* JADX INFO: renamed from: b */
    public static n5x0 m161734b(l5x0 l5x0Var, Class cls, Class cls2) {
        return new k5x0(cls, cls2, l5x0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract l7x0 mo148506a(xww0 xww0Var, ayw0 ayw0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final Class m161735c() {
        return this.f140403a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m161736d() {
        return this.f140404b;
    }
}
