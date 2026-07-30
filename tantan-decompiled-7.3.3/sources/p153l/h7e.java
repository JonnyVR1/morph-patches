package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public final class h7e {

    /* JADX INFO: renamed from: a */
    public static final double f108120a = Math.log(2.0d);

    /* JADX INFO: renamed from: b */
    public static final double[] f108121b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: l.h7e$a */
    public static /* synthetic */ class C17412a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f108122a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f108122a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f108122a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f108122a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f108122a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f108122a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f108122a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f108122a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f108122a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m133790a(double d) {
        if (i7e.m138931c(d)) {
            return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || 52 - Long.numberOfTrailingZeros(i7e.m138930b(d)) <= Math.getExponent(d);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static double m133791b(double d, RoundingMode roundingMode) {
        if (!i7e.m138931c(d)) {
            mym.m160801a("input is infinite or NaN");
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        switch (C17412a.f108122a[roundingMode.ordinal()]) {
            case 1:
                ghx.m130279e(m133790a(d));
                return d;
            case 2:
                return (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || m133790a(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || m133790a(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (m133790a(d)) {
                    return d;
                }
                return ((long) d) + ((long) (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1));
            case 6:
                return Math.rint(d);
            case 7:
                double dRint = Math.rint(d);
                return Math.abs(d - dRint) == 0.5d ? d + Math.copySign(0.5d, d) : dRint;
            case 8:
                double dRint2 = Math.rint(d);
                return Math.abs(d - dRint2) == 0.5d ? d : dRint2;
            default:
                aqg0.m99478a();
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m133792c(double d, RoundingMode roundingMode) {
        double dM133791b = m133791b(d, roundingMode);
        ghx.m130275a(((-9.223372036854776E18d) - dM133791b < 1.0d) & (dM133791b < 9.223372036854776E18d), d, roundingMode);
        return (long) dM133791b;
    }
}
