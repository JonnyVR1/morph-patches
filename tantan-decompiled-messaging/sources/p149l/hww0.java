package p149l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hww0 {

    /* JADX INFO: renamed from: a */
    public final Class f109806a;

    /* JADX INFO: renamed from: b */
    public final Class f109807b;

    public /* synthetic */ hww0(Class cls, Class cls2, gww0 gww0Var) {
        this.f109806a = cls;
        this.f109807b = cls2;
    }

    /* JADX INFO: renamed from: b */
    public static hww0 m133276b(fww0 fww0Var, Class cls, Class cls2) {
        return new eww0(cls, cls2, fww0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract fyw0 mo118526a(rnw0 rnw0Var, uow0 uow0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final Class m133277c() {
        return this.f109806a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m133278d() {
        return this.f109807b;
    }
}
