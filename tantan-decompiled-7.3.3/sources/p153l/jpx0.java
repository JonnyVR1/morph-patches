package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class jpx0 {

    /* JADX INFO: renamed from: j */
    public static final jpx0 f122157j = new jpx0(1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: k */
    public static final jpx0 f122158k = new jpx0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: l */
    public static final jpx0 f122159l = new jpx0(-1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: m */
    public static final jpx0 f122160m = new jpx0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: a */
    public final double f122161a;

    /* JADX INFO: renamed from: b */
    public final double f122162b;

    /* JADX INFO: renamed from: c */
    public final double f122163c;

    /* JADX INFO: renamed from: d */
    public final double f122164d;

    /* JADX INFO: renamed from: e */
    public final double f122165e;

    /* JADX INFO: renamed from: f */
    public final double f122166f;

    /* JADX INFO: renamed from: g */
    public final double f122167g;

    /* JADX INFO: renamed from: h */
    public final double f122168h;

    /* JADX INFO: renamed from: i */
    public final double f122169i;

    public jpx0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f122161a = d5;
        this.f122162b = d6;
        this.f122163c = d7;
        this.f122164d = d;
        this.f122165e = d2;
        this.f122166f = d3;
        this.f122167g = d4;
        this.f122168h = d8;
        this.f122169i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jpx0.class != obj.getClass()) {
            return false;
        }
        jpx0 jpx0Var = (jpx0) obj;
        return Double.compare(jpx0Var.f122164d, this.f122164d) == 0 && Double.compare(jpx0Var.f122165e, this.f122165e) == 0 && Double.compare(jpx0Var.f122166f, this.f122166f) == 0 && Double.compare(jpx0Var.f122167g, this.f122167g) == 0 && Double.compare(jpx0Var.f122168h, this.f122168h) == 0 && Double.compare(jpx0Var.f122169i, this.f122169i) == 0 && Double.compare(jpx0Var.f122161a, this.f122161a) == 0 && Double.compare(jpx0Var.f122162b, this.f122162b) == 0 && Double.compare(jpx0Var.f122163c, this.f122163c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f122161a);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f122162b);
        long j2 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f122163c);
        long j3 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f122164d);
        long j4 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f122165e);
        long j5 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f122166f);
        long j6 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f122167g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f122168h);
        long j7 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f122169i);
        return (((((((((((((((((int) j) * 31) + ((int) j2)) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j7)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f122157j)) {
            return "Rotate 0°";
        }
        if (equals(f122158k)) {
            return "Rotate 90°";
        }
        if (equals(f122159l)) {
            return "Rotate 180°";
        }
        if (equals(f122160m)) {
            return "Rotate 270°";
        }
        double d = this.f122161a;
        double d2 = this.f122162b;
        double d3 = this.f122163c;
        double d4 = this.f122164d;
        double d5 = this.f122165e;
        double d6 = this.f122166f;
        double d7 = this.f122167g;
        double d8 = this.f122168h;
        double d9 = this.f122169i;
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
