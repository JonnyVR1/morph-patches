package p009l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lbj extends kjj {
    public lbj(double d, double d2) {
        this.f15735b = d;
        this.f15734a = d2;
    }

    /* JADX INFO: renamed from: c */
    public zep0 m17786c() {
        double d = this.f15735b;
        double d2 = d - 0.01d;
        double d3 = this.f15734a;
        double d4 = d3 - 0.01d;
        double d5 = d + 0.01d;
        double d6 = d3 + 0.01d;
        zep0 zep0Var = null;
        for (int i = 0; i < 30; i++) {
            double d7 = (d2 + d5) / 2.0d;
            double d8 = (d4 + d6) / 2.0d;
            zep0Var = new zep0(d7, d8);
            lbj lbjVarM25763c = zep0Var.m25763c();
            double dM17544a = lbjVarM25763c.m17544a() - m17544a();
            double dM17545b = lbjVarM25763c.m17545b() - m17545b();
            if (Math.abs(dM17544a) < 1.0E-6d && Math.abs(dM17545b) < 1.0E-6d) {
                return zep0Var;
            }
            if (dM17544a > 0.0d) {
                d5 = d7;
            } else {
                d2 = d7;
            }
            if (dM17545b > 0.0d) {
                d6 = d8;
            } else {
                d4 = d8;
            }
        }
        return zep0Var;
    }

    public lbj() {
    }
}
