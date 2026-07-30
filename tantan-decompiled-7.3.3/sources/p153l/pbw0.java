package p153l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class pbw0 {

    /* JADX INFO: renamed from: a */
    public final Object f151438a;

    /* JADX INFO: renamed from: b */
    public final List f151439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ecw0 f151440c;

    public /* synthetic */ pbw0(ecw0 ecw0Var, Object obj, List list, obw0 obw0Var) {
        this.f151440c = ecw0Var;
        this.f151438a = obj;
        this.f151439b = list;
    }

    /* JADX INFO: renamed from: a */
    public final dcw0 m171533a(Callable callable) {
        ovw0 ovw0VarM173975b = pvw0.m173975b(this.f151439b);
        hpr hprVarM169489a = ovw0VarM173975b.m169489a(new Callable() { // from class: l.nbw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, oct0.f146738f);
        hpr hprVarM169489a2 = ovw0VarM173975b.m169489a(callable, this.f151440c.f93112a);
        return new dcw0(this.f151440c, this.f151438a, hprVarM169489a, this.f151439b, hprVarM169489a2);
    }
}
