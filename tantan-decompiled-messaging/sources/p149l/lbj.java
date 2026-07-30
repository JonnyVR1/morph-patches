package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes11.dex */
public class lbj extends kjj {
    public lbj(double d, double d2) {
        this.f123454b = d;
        this.f123453a = d2;
    }

    /* JADX INFO: renamed from: c */
    public zep0 m149229c() {
        double d = this.f123454b;
        double d2 = d - 0.01d;
        double d3 = this.f123453a;
        double d4 = d3 - 0.01d;
        double d5 = d + 0.01d;
        double d6 = d3 + 0.01d;
        zep0 zep0Var = null;
        for (int i = 0; i < 30; i++) {
            double d7 = (d2 + d5) / 2.0d;
            double d8 = (d4 + d6) / 2.0d;
            zep0Var = new zep0(d7, d8);
            lbj lbjVarM218386c = zep0Var.m218386c();
            double dM146236a = lbjVarM218386c.m146236a() - m146236a();
            double dM146237b = lbjVarM218386c.m146237b() - m146237b();
            if (Math.abs(dM146236a) < 1.0E-6d && Math.abs(dM146237b) < 1.0E-6d) {
                return zep0Var;
            }
            if (dM146236a > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                d5 = d7;
            } else {
                d2 = d7;
            }
            if (dM146237b > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
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
