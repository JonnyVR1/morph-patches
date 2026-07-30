package p153l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v6x0 {

    /* JADX INFO: renamed from: a */
    public final Class f182702a;

    /* JADX INFO: renamed from: b */
    public final Class f182703b;

    public /* synthetic */ v6x0(Class cls, Class cls2, u6x0 u6x0Var) {
        this.f182702a = cls;
        this.f182703b = cls2;
    }

    /* JADX INFO: renamed from: b */
    public static v6x0 m200155b(t6x0 t6x0Var, Class cls, Class cls2) {
        return new s6x0(cls, cls2, t6x0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo184928a(xww0 xww0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final Class m200156c() {
        return this.f182702a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m200157d() {
        return this.f182703b;
    }
}
