package p149l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lgg0 {

    /* JADX INFO: renamed from: a */
    public final gdg0 f127983a;

    /* JADX INFO: renamed from: b */
    public String f127984b;

    /* JADX INFO: renamed from: c */
    public String f127985c;

    static {
        "SudGIP ".concat(lgg0.class.getSimpleName());
    }

    public lgg0(gdg0 gdg0Var) {
        new zcg0(this);
        this.f127983a = gdg0Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract n8g0 mo95866a();

    /* JADX INFO: renamed from: b */
    public final void m149778b(int i, wcg0 wcg0Var) {
        String str;
        String str2;
        String str3;
        nqg0 nqg0VarMo95869e = mo95869e();
        if (nqg0VarMo95869e == null || (str = nqg0VarMo95869e.f140065c) == null || str.isEmpty() || (str2 = nqg0VarMo95869e.f140063a) == null || str2.isEmpty() || (str3 = nqg0VarMo95869e.f140064b) == null || str3.isEmpty()) {
            nqg0VarMo95869e = null;
        }
        if (nqg0VarMo95869e == null) {
            wcg0Var.mo146944a("sdkCoreCfg url_arm64_v8a version key cannot be empty");
        } else {
            wcg0Var.mo146945b(jkg0.m141869a());
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo95867c(long j, Object obj, akg0 akg0Var);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo95868d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract nqg0 mo95869e();
}
