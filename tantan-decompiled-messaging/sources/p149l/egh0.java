package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class egh0 {

    /* JADX INFO: renamed from: a */
    public boolean f90945a;

    /* JADX INFO: renamed from: b */
    final whe[] f90946b;

    /* JADX INFO: renamed from: c */
    private h600 f90947c;

    public egh0(whe... wheVarArr) {
        this.f90946b = wheVarArr;
    }

    /* JADX INFO: renamed from: b */
    private void m116282b() {
        dgh0.m111635j().m111640g(this);
    }

    /* JADX INFO: renamed from: g */
    private void m116283g() {
        yhe.m214809l(this);
    }

    /* JADX INFO: renamed from: a */
    public void m116284a() {
        m116282b();
    }

    /* JADX INFO: renamed from: c */
    public void m116285c(int i, String str) {
        h600 h600Var = this.f90947c;
        if (h600Var != null) {
            h600Var.mo129467a(i, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m116286d(int i, double d) {
        h600 h600Var = this.f90947c;
        if (h600Var != null) {
            h600Var.onProcess(i, d);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m116287e() {
        h600 h600Var = this.f90947c;
        if (h600Var != null) {
            h600Var.onSuccess();
        }
        m116283g();
    }

    /* JADX INFO: renamed from: f */
    public void m116288f(h600 h600Var) {
        this.f90947c = h600Var;
    }
}
