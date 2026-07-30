package p149l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hxw0 {

    /* JADX INFO: renamed from: a */
    public final q6x0 f109936a;

    /* JADX INFO: renamed from: b */
    public final Class f109937b;

    public /* synthetic */ hxw0(q6x0 q6x0Var, Class cls, gxw0 gxw0Var) {
        this.f109936a = q6x0Var;
        this.f109937b = cls;
    }

    /* JADX INFO: renamed from: b */
    public static hxw0 m133430b(fxw0 fxw0Var, q6x0 q6x0Var, Class cls) {
        return new exw0(q6x0Var, cls, fxw0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract fow0 mo118708a(fyw0 fyw0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final q6x0 m133431c() {
        return this.f109936a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m133432d() {
        return this.f109937b;
    }
}
