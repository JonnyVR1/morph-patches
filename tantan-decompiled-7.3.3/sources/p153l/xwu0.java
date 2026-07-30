package p153l;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xwu0 {

    /* JADX INFO: renamed from: a */
    public final cxu0 f196558a;

    /* JADX INFO: renamed from: b */
    public final Executor f196559b;

    /* JADX INFO: renamed from: c */
    public final Map f196560c;

    public xwu0(cxu0 cxu0Var, Executor executor) {
        this.f196558a = cxu0Var;
        this.f196560c = cxu0Var.m113068g();
        this.f196559b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final wwu0 m213443a() {
        wwu0 wwu0Var = new wwu0(this);
        wwu0.m208306a(wwu0Var);
        return wwu0Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m213444e() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168252bb)).booleanValue()) {
            wwu0 wwu0VarM213443a = m213443a();
            wwu0VarM213443a.m208307b("action", "pecr");
            wwu0VarM213443a.m208312g();
        }
    }
}
