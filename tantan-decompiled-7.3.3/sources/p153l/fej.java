package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes10.dex */
public class fej extends dmj {
    public fej(double d, double d2) {
        this.f89634b = d;
        this.f89633a = d2;
    }

    /* JADX INFO: renamed from: c */
    public dop0 m125310c() {
        double d = this.f89634b;
        double d2 = d - 0.01d;
        double d3 = this.f89633a;
        double d4 = d3 - 0.01d;
        double d5 = d + 0.01d;
        double d6 = d3 + 0.01d;
        dop0 dop0Var = null;
        for (int i = 0; i < 30; i++) {
            double d7 = (d2 + d5) / 2.0d;
            double d8 = (d4 + d6) / 2.0d;
            dop0Var = new dop0(d7, d8);
            fej fejVarM117359c = dop0Var.m117359c();
            double dM116960a = fejVarM117359c.m116960a() - m116960a();
            double dM116961b = fejVarM117359c.m116961b() - m116961b();
            if (Math.abs(dM116960a) < 1.0E-6d && Math.abs(dM116961b) < 1.0E-6d) {
                return dop0Var;
            }
            if (dM116960a > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                d5 = d7;
            } else {
                d2 = d7;
            }
            if (dM116961b > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                d6 = d8;
            } else {
                d4 = d8;
            }
        }
        return dop0Var;
    }

    public fej() {
    }
}
