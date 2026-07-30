package p153l;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class g6x0 {

    /* JADX INFO: renamed from: b */
    public static final g6x0 f102490b = new g6x0();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f102491a = new AtomicReference(new b7x0(new x6x0(null), null));

    /* JADX INFO: renamed from: a */
    public static g6x0 m129300a() {
        return f102490b;
    }

    /* JADX INFO: renamed from: b */
    public final Class m129301b(Class cls) throws GeneralSecurityException {
        return ((b7x0) this.f102491a.get()).m102879a(cls);
    }

    /* JADX INFO: renamed from: c */
    public final Object m129302c(xww0 xww0Var, Class cls) throws GeneralSecurityException {
        return ((b7x0) this.f102491a.get()).m102880b(xww0Var, cls);
    }

    /* JADX INFO: renamed from: d */
    public final Object m129303d(sxw0 sxw0Var, Class cls) throws GeneralSecurityException {
        return ((b7x0) this.f102491a.get()).m102881c(sxw0Var, cls);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m129304e(v6x0 v6x0Var) throws GeneralSecurityException {
        x6x0 x6x0Var = new x6x0((b7x0) this.f102491a.get(), null);
        x6x0Var.m209561a(v6x0Var);
        this.f102491a.set(new b7x0(x6x0Var, null));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m129305f(txw0 txw0Var) throws GeneralSecurityException {
        x6x0 x6x0Var = new x6x0((b7x0) this.f102491a.get(), null);
        x6x0Var.m209562b(txw0Var);
        this.f102491a.set(new b7x0(x6x0Var, null));
    }
}
