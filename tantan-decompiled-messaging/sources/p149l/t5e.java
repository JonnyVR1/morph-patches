package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class t5e {
    /* JADX INFO: renamed from: a */
    public static double m187293a(double d) {
        sf80.m183882d(!Double.isNaN(d));
        return Math.max(d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: b */
    public static long m187294b(double d) {
        sf80.m183883e(m187295c(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m187295c(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
