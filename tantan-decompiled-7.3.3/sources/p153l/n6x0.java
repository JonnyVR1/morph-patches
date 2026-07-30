package p153l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n6x0 {

    /* JADX INFO: renamed from: a */
    public final wfx0 f140499a;

    /* JADX INFO: renamed from: b */
    public final Class f140500b;

    public /* synthetic */ n6x0(wfx0 wfx0Var, Class cls, m6x0 m6x0Var) {
        this.f140499a = wfx0Var;
        this.f140500b = cls;
    }

    /* JADX INFO: renamed from: b */
    public static n6x0 m161810b(l6x0 l6x0Var, wfx0 wfx0Var, Class cls) {
        return new k6x0(wfx0Var, cls, l6x0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract lxw0 mo148587a(l7x0 l7x0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final wfx0 m161811c() {
        return this.f140499a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m161812d() {
        return this.f140500b;
    }
}
