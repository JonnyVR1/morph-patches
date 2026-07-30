package p007l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface g6i {
    /* JADX INFO: renamed from: b */
    boolean mo10419b(xa70 xa70Var);

    /* JADX INFO: renamed from: c */
    void mo10420c(xa70 xa70Var);

    /* JADX INFO: renamed from: d */
    void mo10421d(xa70 xa70Var);

    /* JADX INFO: renamed from: f */
    void mo9669f();

    /* JADX INFO: renamed from: g */
    void mo9671g(xa70 xa70Var);

    /* JADX INFO: renamed from: h */
    void mo9673h();

    /* JADX INFO: renamed from: i */
    default void m10422i(xa70 xa70Var) {
        mo9671g(xa70Var);
        if (!mo10419b(xa70Var)) {
            mo10421d(xa70Var);
            return;
        }
        mo10420c(xa70Var);
        mo9677k(xa70Var);
        mo9673h();
        mo9676j();
        mo9669f();
    }

    /* JADX INFO: renamed from: j */
    void mo9676j();

    /* JADX INFO: renamed from: k */
    default void mo9677k(xa70 xa70Var) {
        d5i d5iVar = xa70Var.f14832m;
        if (d5iVar != null && d5iVar.m9308c() && xa70Var.f14832m.m9310e()) {
            return;
        }
        mo9667e();
    }

    /* JADX INFO: renamed from: a */
    default void mo9662a() {
    }

    /* JADX INFO: renamed from: e */
    default void mo9667e() {
    }
}
