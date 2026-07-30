package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class vg50 extends jr2 {

    /* JADX INFO: renamed from: c */
    private static vg50 f183999c = new vg50();

    /* JADX INFO: renamed from: b */
    private epf0 f184000b = new dqd();

    private vg50() {
    }

    /* JADX INFO: renamed from: g */
    public static vg50 m201217g() {
        return f183999c;
    }

    @Override // p153l.jr2
    /* JADX INFO: renamed from: a */
    public ry3 mo146674a(String str, h2d0 h2d0Var, x1d0 x1d0Var) throws IOException {
        rnl rnlVarM209026k = x1d0Var.m209026k();
        String strM182286m = rnlVarM209026k.m182286m();
        if (h2d0Var != null) {
            h2d0Var.m133385e(rnlVarM209026k.toString());
            h2d0Var.m133384d(strM182286m);
        }
        if (mo146675b().mo117514d(strM182286m) && h2d0Var != null) {
            String strMo117512b = mo146675b().mo117512b(strM182286m);
            h2d0Var.m133383c(strMo117512b);
            esx.m122399d("OkHttpRequestBuilder", "host: " + strM182286m + " -> " + strMo117512b);
        }
        return super.mo146674a(str, h2d0Var, x1d0Var);
    }

    @Override // p153l.jr2
    /* JADX INFO: renamed from: b */
    public epf0 mo146675b() {
        return this.f184000b;
    }

    /* JADX INFO: renamed from: f */
    public void m201218f(String str, String str2, int i) {
        mo146675b().mo117511a(str, str2, i);
    }
}
