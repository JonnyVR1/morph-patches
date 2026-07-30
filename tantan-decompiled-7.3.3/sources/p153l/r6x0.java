package p153l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r6x0 {

    /* JADX INFO: renamed from: a */
    public final Class f161511a;

    /* JADX INFO: renamed from: b */
    public final Class f161512b;

    public /* synthetic */ r6x0(Class cls, Class cls2, q6x0 q6x0Var) {
        this.f161511a = cls;
        this.f161512b = cls2;
    }

    /* JADX INFO: renamed from: b */
    public static r6x0 m180056b(p6x0 p6x0Var, Class cls, Class cls2) {
        return new o6x0(cls, cls2, p6x0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract l7x0 mo166300a(lxw0 lxw0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final Class m180057c() {
        return this.f161511a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m180058d() {
        return this.f161512b;
    }
}
