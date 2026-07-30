package p153l;

/* JADX INFO: loaded from: classes11.dex */
class t21<T> implements Runnable, dm80<T> {

    /* JADX INFO: renamed from: a */
    private final dr60<T> f171704a = new dr60<>();

    /* JADX INFO: renamed from: b */
    private final v3f.C20734b<T, ?> f171705b;

    public t21(v3f.C20734b<T, ?> c20734b) {
        this.f171705b = c20734b;
    }

    @Override // p153l.dm80
    /* JADX INFO: renamed from: a */
    public void mo116941a(jcg0<T> jcg0Var, T t) {
        this.f171704a.m117684a(new cr60<>(t, jcg0Var));
        this.f171705b.m199265b().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        cr60<T> cr60VarM117685b = this.f171704a.m117685b();
        if (cr60VarM117685b != null) {
            this.f171705b.m199268e(cr60VarM117685b);
        } else {
            wtq0.m207906a("No pending post available");
        }
    }
}
