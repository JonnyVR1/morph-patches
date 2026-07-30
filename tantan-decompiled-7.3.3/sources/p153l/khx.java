package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class khx {

    /* JADX INFO: renamed from: j */
    public static final khx f126933j = new khx(1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: k */
    public static final khx f126934k = new khx(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: l */
    public static final khx f126935l = new khx(-1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: m */
    public static final khx f126936m = new khx(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: a */
    double f126937a;

    /* JADX INFO: renamed from: b */
    double f126938b;

    /* JADX INFO: renamed from: c */
    double f126939c;

    /* JADX INFO: renamed from: d */
    double f126940d;

    /* JADX INFO: renamed from: e */
    double f126941e;

    /* JADX INFO: renamed from: f */
    double f126942f;

    /* JADX INFO: renamed from: g */
    double f126943g;

    /* JADX INFO: renamed from: h */
    double f126944h;

    /* JADX INFO: renamed from: i */
    double f126945i;

    public khx(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f126937a = d5;
        this.f126938b = d6;
        this.f126939c = d7;
        this.f126940d = d;
        this.f126941e = d2;
        this.f126942f = d3;
        this.f126943g = d4;
        this.f126944h = d8;
        this.f126945i = d9;
    }

    /* JADX INFO: renamed from: a */
    public static khx m149830a(ByteBuffer byteBuffer) {
        return m149831b(y0q.m213888d(byteBuffer), y0q.m213888d(byteBuffer), y0q.m213887c(byteBuffer), y0q.m213888d(byteBuffer), y0q.m213888d(byteBuffer), y0q.m213887c(byteBuffer), y0q.m213888d(byteBuffer), y0q.m213888d(byteBuffer), y0q.m213887c(byteBuffer));
    }

    /* JADX INFO: renamed from: b */
    public static khx m149831b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return new khx(d, d2, d4, d5, d3, d6, d9, d7, d8);
    }

    /* JADX INFO: renamed from: c */
    public void m149832c(ByteBuffer byteBuffer) {
        b1q.m101490b(byteBuffer, this.f126940d);
        b1q.m101490b(byteBuffer, this.f126941e);
        b1q.m101489a(byteBuffer, this.f126937a);
        b1q.m101490b(byteBuffer, this.f126942f);
        b1q.m101490b(byteBuffer, this.f126943g);
        b1q.m101489a(byteBuffer, this.f126938b);
        b1q.m101490b(byteBuffer, this.f126944h);
        b1q.m101490b(byteBuffer, this.f126945i);
        b1q.m101489a(byteBuffer, this.f126939c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        khx khxVar = (khx) obj;
        return Double.compare(khxVar.f126940d, this.f126940d) == 0 && Double.compare(khxVar.f126941e, this.f126941e) == 0 && Double.compare(khxVar.f126942f, this.f126942f) == 0 && Double.compare(khxVar.f126943g, this.f126943g) == 0 && Double.compare(khxVar.f126944h, this.f126944h) == 0 && Double.compare(khxVar.f126945i, this.f126945i) == 0 && Double.compare(khxVar.f126937a, this.f126937a) == 0 && Double.compare(khxVar.f126938b, this.f126938b) == 0 && Double.compare(khxVar.f126939c, this.f126939c) == 0;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f126937a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f126938b);
        int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f126939c);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f126940d);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f126941e);
        int i4 = (i3 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f126942f);
        int i5 = (i4 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f126943g);
        int i6 = (i5 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f126944h);
        int i7 = (i6 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f126945i);
        return (i7 * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public String toString() {
        if (equals(f126933j)) {
            return "Rotate 0°";
        }
        if (equals(f126934k)) {
            return "Rotate 90°";
        }
        if (equals(f126935l)) {
            return "Rotate 180°";
        }
        if (equals(f126936m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f126937a + ", v=" + this.f126938b + ", w=" + this.f126939c + ", a=" + this.f126940d + ", b=" + this.f126941e + ", c=" + this.f126942f + ", d=" + this.f126943g + ", tx=" + this.f126944h + ", ty=" + this.f126945i + '}';
    }
}
