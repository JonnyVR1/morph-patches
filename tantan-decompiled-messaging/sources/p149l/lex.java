package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class lex {

    /* JADX INFO: renamed from: j */
    public static final lex f127769j = new lex(1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: k */
    public static final lex f127770k = new lex(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: l */
    public static final lex f127771l = new lex(-1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: m */
    public static final lex f127772m = new lex(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, -1.0d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: renamed from: a */
    double f127773a;

    /* JADX INFO: renamed from: b */
    double f127774b;

    /* JADX INFO: renamed from: c */
    double f127775c;

    /* JADX INFO: renamed from: d */
    double f127776d;

    /* JADX INFO: renamed from: e */
    double f127777e;

    /* JADX INFO: renamed from: f */
    double f127778f;

    /* JADX INFO: renamed from: g */
    double f127779g;

    /* JADX INFO: renamed from: h */
    double f127780h;

    /* JADX INFO: renamed from: i */
    double f127781i;

    public lex(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f127773a = d5;
        this.f127774b = d6;
        this.f127775c = d7;
        this.f127776d = d;
        this.f127777e = d2;
        this.f127778f = d3;
        this.f127779g = d4;
        this.f127780h = d8;
        this.f127781i = d9;
    }

    /* JADX INFO: renamed from: a */
    public static lex m149615a(ByteBuffer byteBuffer) {
        return m149616b(yyp.m216551d(byteBuffer), yyp.m216551d(byteBuffer), yyp.m216550c(byteBuffer), yyp.m216551d(byteBuffer), yyp.m216551d(byteBuffer), yyp.m216550c(byteBuffer), yyp.m216551d(byteBuffer), yyp.m216551d(byteBuffer), yyp.m216550c(byteBuffer));
    }

    /* JADX INFO: renamed from: b */
    public static lex m149616b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return new lex(d, d2, d4, d5, d3, d6, d9, d7, d8);
    }

    /* JADX INFO: renamed from: c */
    public void m149617c(ByteBuffer byteBuffer) {
        bzp.m104630b(byteBuffer, this.f127776d);
        bzp.m104630b(byteBuffer, this.f127777e);
        bzp.m104629a(byteBuffer, this.f127773a);
        bzp.m104630b(byteBuffer, this.f127778f);
        bzp.m104630b(byteBuffer, this.f127779g);
        bzp.m104629a(byteBuffer, this.f127774b);
        bzp.m104630b(byteBuffer, this.f127780h);
        bzp.m104630b(byteBuffer, this.f127781i);
        bzp.m104629a(byteBuffer, this.f127775c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lex lexVar = (lex) obj;
        return Double.compare(lexVar.f127776d, this.f127776d) == 0 && Double.compare(lexVar.f127777e, this.f127777e) == 0 && Double.compare(lexVar.f127778f, this.f127778f) == 0 && Double.compare(lexVar.f127779g, this.f127779g) == 0 && Double.compare(lexVar.f127780h, this.f127780h) == 0 && Double.compare(lexVar.f127781i, this.f127781i) == 0 && Double.compare(lexVar.f127773a, this.f127773a) == 0 && Double.compare(lexVar.f127774b, this.f127774b) == 0 && Double.compare(lexVar.f127775c, this.f127775c) == 0;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f127773a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f127774b);
        int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f127775c);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f127776d);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f127777e);
        int i4 = (i3 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f127778f);
        int i5 = (i4 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f127779g);
        int i6 = (i5 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f127780h);
        int i7 = (i6 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f127781i);
        return (i7 * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public String toString() {
        if (equals(f127769j)) {
            return "Rotate 0°";
        }
        if (equals(f127770k)) {
            return "Rotate 90°";
        }
        if (equals(f127771l)) {
            return "Rotate 180°";
        }
        if (equals(f127772m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f127773a + ", v=" + this.f127774b + ", w=" + this.f127775c + ", a=" + this.f127776d + ", b=" + this.f127777e + ", c=" + this.f127778f + ", d=" + this.f127779g + ", tx=" + this.f127780h + ", ty=" + this.f127781i + '}';
    }
}
