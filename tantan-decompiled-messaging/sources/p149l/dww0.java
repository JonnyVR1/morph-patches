package p149l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dww0 {

    /* JADX INFO: renamed from: a */
    public final q6x0 f88220a;

    /* JADX INFO: renamed from: b */
    public final Class f88221b;

    public /* synthetic */ dww0(q6x0 q6x0Var, Class cls, cww0 cww0Var) {
        this.f88220a = q6x0Var;
        this.f88221b = cls;
    }

    /* JADX INFO: renamed from: b */
    public static dww0 m113961b(bww0 bww0Var, q6x0 q6x0Var, Class cls) {
        return new aww0(q6x0Var, cls, bww0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract rnw0 mo99329a(fyw0 fyw0Var, uow0 uow0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final q6x0 m113962c() {
        return this.f88220a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m113963d() {
        return this.f88221b;
    }
}
