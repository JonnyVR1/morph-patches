package p153l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tog0 {

    /* JADX INFO: renamed from: a */
    public final olg0 f175404a;

    /* JADX INFO: renamed from: b */
    public String f175405b;

    /* JADX INFO: renamed from: c */
    public String f175406c;

    static {
        "SudGIP ".concat(tog0.class.getSimpleName());
    }

    public tog0(olg0 olg0Var) {
        new hlg0(this);
        this.f175404a = olg0Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract vgg0 mo140624a();

    /* JADX INFO: renamed from: b */
    public final void m192040b(int i, elg0 elg0Var) {
        String str;
        String str2;
        String str3;
        vyg0 vyg0VarMo140627e = mo140627e();
        if (vyg0VarMo140627e == null || (str = vyg0VarMo140627e.f186374c) == null || str.isEmpty() || (str2 = vyg0VarMo140627e.f186372a) == null || str2.isEmpty() || (str3 = vyg0VarMo140627e.f186373b) == null || str3.isEmpty()) {
            vyg0VarMo140627e = null;
        }
        if (vyg0VarMo140627e == null) {
            elg0Var.mo121147a("sdkCoreCfg url_arm64_v8a version key cannot be empty");
        } else {
            elg0Var.mo121148b(rsg0.m182968a());
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo140625c(long j, Object obj, isg0 isg0Var);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo140626d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract vyg0 mo140627e();
}
