package p149l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lxw0 {

    /* JADX INFO: renamed from: a */
    public final Class f130449a;

    /* JADX INFO: renamed from: b */
    public final Class f130450b;

    public /* synthetic */ lxw0(Class cls, Class cls2, kxw0 kxw0Var) {
        this.f130449a = cls;
        this.f130450b = cls2;
    }

    /* JADX INFO: renamed from: b */
    public static lxw0 m152104b(jxw0 jxw0Var, Class cls, Class cls2) {
        return new ixw0(cls, cls2, jxw0Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract fyw0 mo138900a(fow0 fow0Var) throws GeneralSecurityException;

    /* JADX INFO: renamed from: c */
    public final Class m152105c() {
        return this.f130449a;
    }

    /* JADX INFO: renamed from: d */
    public final Class m152106d() {
        return this.f130450b;
    }
}
