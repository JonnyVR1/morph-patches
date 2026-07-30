package p149l;

/* JADX INFO: loaded from: classes12.dex */
public interface g6i {
    /* JADX INFO: renamed from: b */
    boolean mo124591b(xa70 xa70Var);

    /* JADX INFO: renamed from: c */
    void mo124592c(xa70 xa70Var);

    /* JADX INFO: renamed from: d */
    void mo124593d(xa70 xa70Var);

    /* JADX INFO: renamed from: f */
    void mo115052f();

    /* JADX INFO: renamed from: g */
    void mo115054g(xa70 xa70Var);

    /* JADX INFO: renamed from: h */
    void mo115056h();

    /* JADX INFO: renamed from: i */
    default void m124594i(xa70 xa70Var) {
        mo115054g(xa70Var);
        if (!mo124591b(xa70Var)) {
            mo124593d(xa70Var);
            return;
        }
        mo124592c(xa70Var);
        mo115060k(xa70Var);
        mo115056h();
        mo115059j();
        mo115052f();
    }

    /* JADX INFO: renamed from: j */
    void mo115059j();

    /* JADX INFO: renamed from: k */
    default void mo115060k(xa70 xa70Var) {
        d5i d5iVar = xa70Var.f191701m;
        if (d5iVar != null && d5iVar.m110059c() && xa70Var.f191701m.m110061e()) {
            return;
        }
        mo115050e();
    }

    /* JADX INFO: renamed from: a */
    default void mo115045a() {
    }

    /* JADX INFO: renamed from: e */
    default void mo115050e() {
    }
}
