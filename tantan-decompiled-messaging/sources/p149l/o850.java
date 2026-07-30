package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class o850 extends tq2 {

    /* JADX INFO: renamed from: c */
    private static o850 f142599c = new o850();

    /* JADX INFO: renamed from: b */
    private wgf0 f142600b = new yod();

    private o850() {
    }

    /* JADX INFO: renamed from: g */
    public static o850 m163105g() {
        return f142599c;
    }

    @Override // p149l.tq2
    /* JADX INFO: renamed from: a */
    public sx3 mo163106a(String str, euc0 euc0Var, stc0 stc0Var) throws IOException {
        cll cllVarM185881k = stc0Var.m185881k();
        String strM107522m = cllVarM185881k.m107522m();
        if (euc0Var != null) {
            euc0Var.m118162e(cllVarM185881k.toString());
            euc0Var.m118161d(strM107522m);
        }
        if (mo163107b().mo203052d(strM107522m) && euc0Var != null) {
            String strMo203050b = mo163107b().mo203050b(strM107522m);
            euc0Var.m118160c(strMo203050b);
            hjx.m131421d("OkHttpRequestBuilder", "host: " + strM107522m + " -> " + strMo203050b);
        }
        return super.mo163106a(str, euc0Var, stc0Var);
    }

    @Override // p149l.tq2
    /* JADX INFO: renamed from: b */
    public wgf0 mo163107b() {
        return this.f142600b;
    }

    /* JADX INFO: renamed from: f */
    public void m163108f(String str, String str2, int i) {
        mo163107b().mo203049a(str, str2, i);
    }
}
