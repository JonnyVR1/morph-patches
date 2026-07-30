package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class loh0 {

    /* JADX INFO: renamed from: a */
    public boolean f132899a;

    /* JADX INFO: renamed from: b */
    final aje[] f132900b;

    /* JADX INFO: renamed from: c */
    private qe00 f132901c;

    public loh0(aje... ajeVarArr) {
        this.f132900b = ajeVarArr;
    }

    /* JADX INFO: renamed from: b */
    private void m155052b() {
        koh0.m150614j().m150619g(this);
    }

    /* JADX INFO: renamed from: g */
    private void m155053g() {
        cje.m110124l(this);
    }

    /* JADX INFO: renamed from: a */
    public void m155054a() {
        m155052b();
    }

    /* JADX INFO: renamed from: c */
    public void m155055c(int i, String str) {
        qe00 qe00Var = this.f132901c;
        if (qe00Var != null) {
            qe00Var.mo160639a(i, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m155056d(int i, double d) {
        qe00 qe00Var = this.f132901c;
        if (qe00Var != null) {
            qe00Var.onProcess(i, d);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m155057e() {
        qe00 qe00Var = this.f132901c;
        if (qe00Var != null) {
            qe00Var.onSuccess();
        }
        m155053g();
    }

    /* JADX INFO: renamed from: f */
    public void m155058f(qe00 qe00Var) {
        this.f132901c = qe00Var;
    }
}
