package p149l;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class axw0 {

    /* JADX INFO: renamed from: b */
    public static final axw0 f72239b = new axw0();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f72240a = new AtomicReference(new vxw0(new rxw0(null), null));

    /* JADX INFO: renamed from: a */
    public static axw0 m99526a() {
        return f72239b;
    }

    /* JADX INFO: renamed from: b */
    public final Class m99527b(Class cls) throws GeneralSecurityException {
        return ((vxw0) this.f72240a.get()).m200601a(cls);
    }

    /* JADX INFO: renamed from: c */
    public final Object m99528c(rnw0 rnw0Var, Class cls) throws GeneralSecurityException {
        return ((vxw0) this.f72240a.get()).m200602b(rnw0Var, cls);
    }

    /* JADX INFO: renamed from: d */
    public final Object m99529d(mow0 mow0Var, Class cls) throws GeneralSecurityException {
        return ((vxw0) this.f72240a.get()).m200603c(mow0Var, cls);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m99530e(pxw0 pxw0Var) throws GeneralSecurityException {
        rxw0 rxw0Var = new rxw0((vxw0) this.f72240a.get(), null);
        rxw0Var.m181652a(pxw0Var);
        this.f72240a.set(new vxw0(rxw0Var, null));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m99531f(now0 now0Var) throws GeneralSecurityException {
        rxw0 rxw0Var = new rxw0((vxw0) this.f72240a.get(), null);
        rxw0Var.m181653b(now0Var);
        this.f72240a.set(new vxw0(rxw0Var, null));
    }
}
