package p149l;

/* JADX INFO: loaded from: classes12.dex */
public class n6e0 {

    /* JADX INFO: renamed from: a */
    public int f137394a;

    /* JADX INFO: renamed from: b */
    public c4g0 f137395b;

    /* JADX INFO: renamed from: c */
    public String f137396c;

    public n6e0(String str, int i, c4g0 c4g0Var) {
        this.f137396c = str;
        this.f137394a = i;
        this.f137395b = c4g0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m158037a() {
        c4g0 c4g0Var = this.f137395b;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            return;
        }
        this.f137395b.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public void m158038b(int i) {
        this.f137394a = i;
    }
}
