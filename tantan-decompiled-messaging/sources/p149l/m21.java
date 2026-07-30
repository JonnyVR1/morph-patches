package p149l;

/* JADX INFO: loaded from: classes13.dex */
class m21<T> implements Runnable, wd80<T> {

    /* JADX INFO: renamed from: a */
    private final yi60<T> f130874a = new yi60<>();

    /* JADX INFO: renamed from: b */
    private final q2f.C19395b<T, ?> f130875b;

    public m21(q2f.C19395b<T, ?> c19395b) {
        this.f130875b = c19395b;
    }

    @Override // p149l.wd80
    /* JADX INFO: renamed from: a */
    public void mo95707a(b4g0<T> b4g0Var, T t) {
        this.f130874a.m214882a(new xi60<>(t, b4g0Var));
        this.f130875b.m172455b().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        xi60<T> xi60VarM214883b = this.f130874a.m214883b();
        if (xi60VarM214883b != null) {
            this.f130875b.m172458e(xi60VarM214883b);
        } else {
            qkq0.m175383a("No pending post available");
        }
    }
}
