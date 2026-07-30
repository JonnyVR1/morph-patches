package p153l;

/* JADX INFO: loaded from: classes13.dex */
public interface v7i {
    /* JADX INFO: renamed from: b */
    boolean mo96457b(dj70 dj70Var);

    /* JADX INFO: renamed from: c */
    void mo96458c(dj70 dj70Var);

    /* JADX INFO: renamed from: d */
    void mo96459d(dj70 dj70Var);

    /* JADX INFO: renamed from: f */
    void mo96460f();

    /* JADX INFO: renamed from: g */
    void mo124337g(dj70 dj70Var);

    /* JADX INFO: renamed from: h */
    void mo96461h();

    /* JADX INFO: renamed from: i */
    default void m200211i(dj70 dj70Var) {
        mo124337g(dj70Var);
        if (!mo96457b(dj70Var)) {
            mo96459d(dj70Var);
            return;
        }
        mo96458c(dj70Var);
        mo189609k(dj70Var);
        mo96461h();
        mo96462j();
        mo96460f();
    }

    /* JADX INFO: renamed from: j */
    void mo96462j();

    /* JADX INFO: renamed from: k */
    default void mo189609k(dj70 dj70Var) {
        s6i s6iVar = dj70Var.f88803m;
        if (s6iVar != null && s6iVar.m184913c() && dj70Var.f88803m.m184915e()) {
            return;
        }
        mo153129e();
    }

    /* JADX INFO: renamed from: a */
    default void mo189599a() {
    }

    /* JADX INFO: renamed from: e */
    default void mo153129e() {
    }
}
