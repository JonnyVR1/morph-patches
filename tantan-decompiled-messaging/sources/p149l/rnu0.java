package p149l;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rnu0 {

    /* JADX INFO: renamed from: a */
    public final wnu0 f160329a;

    /* JADX INFO: renamed from: b */
    public final Executor f160330b;

    /* JADX INFO: renamed from: c */
    public final Map f160331c;

    public rnu0(wnu0 wnu0Var, Executor executor) {
        this.f160329a = wnu0Var;
        this.f160331c = wnu0Var.m204781g();
        this.f160330b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final qnu0 m180208a() {
        qnu0 qnu0Var = new qnu0(this);
        qnu0.m175692a(qnu0Var);
        return qnu0Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m180209e() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132181bb)).booleanValue()) {
            qnu0 qnu0VarM180208a = m180208a();
            qnu0VarM180208a.m175693b("action", "pecr");
            qnu0VarM180208a.m175698g();
        }
    }
}
