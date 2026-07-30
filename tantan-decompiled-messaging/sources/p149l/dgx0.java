package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class dgx0 {

    /* JADX INFO: renamed from: j */
    public static final dgx0 f86209j = new dgx0(1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: k */
    public static final dgx0 f86210k = new dgx0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: l */
    public static final dgx0 f86211l = new dgx0(-1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: m */
    public static final dgx0 f86212m = new dgx0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: a */
    public final double f86213a;

    /* JADX INFO: renamed from: b */
    public final double f86214b;

    /* JADX INFO: renamed from: c */
    public final double f86215c;

    /* JADX INFO: renamed from: d */
    public final double f86216d;

    /* JADX INFO: renamed from: e */
    public final double f86217e;

    /* JADX INFO: renamed from: f */
    public final double f86218f;

    /* JADX INFO: renamed from: g */
    public final double f86219g;

    /* JADX INFO: renamed from: h */
    public final double f86220h;

    /* JADX INFO: renamed from: i */
    public final double f86221i;

    public dgx0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f86213a = d5;
        this.f86214b = d6;
        this.f86215c = d7;
        this.f86216d = d;
        this.f86217e = d2;
        this.f86218f = d3;
        this.f86219g = d4;
        this.f86220h = d8;
        this.f86221i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dgx0.class != obj.getClass()) {
            return false;
        }
        dgx0 dgx0Var = (dgx0) obj;
        return Double.compare(dgx0Var.f86216d, this.f86216d) == 0 && Double.compare(dgx0Var.f86217e, this.f86217e) == 0 && Double.compare(dgx0Var.f86218f, this.f86218f) == 0 && Double.compare(dgx0Var.f86219g, this.f86219g) == 0 && Double.compare(dgx0Var.f86220h, this.f86220h) == 0 && Double.compare(dgx0Var.f86221i, this.f86221i) == 0 && Double.compare(dgx0Var.f86213a, this.f86213a) == 0 && Double.compare(dgx0Var.f86214b, this.f86214b) == 0 && Double.compare(dgx0Var.f86215c, this.f86215c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f86213a);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f86214b);
        long j2 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f86215c);
        long j3 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f86216d);
        long j4 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f86217e);
        long j5 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f86218f);
        long j6 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f86219g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f86220h);
        long j7 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f86221i);
        return (((((((((((((((((int) j) * 31) + ((int) j2)) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j7)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f86209j)) {
            return "Rotate 0°";
        }
        if (equals(f86210k)) {
            return "Rotate 90°";
        }
        if (equals(f86211l)) {
            return "Rotate 180°";
        }
        if (equals(f86212m)) {
            return "Rotate 270°";
        }
        double d = this.f86213a;
        double d2 = this.f86214b;
        double d3 = this.f86215c;
        double d4 = this.f86216d;
        double d5 = this.f86217e;
        double d6 = this.f86218f;
        double d7 = this.f86219g;
        double d8 = this.f86220h;
        double d9 = this.f86221i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
