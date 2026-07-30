package p153l;

import com.clevertap.android.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class kdu extends pzi0 {

    /* JADX INFO: renamed from: s */
    public static final String[] f125278s = {"日", "一", "二", "三", "四", "五", "六"};

    /* JADX INFO: renamed from: t */
    public static SimpleDateFormat f125279t = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.getDefault());

    /* JADX INFO: renamed from: O */
    public static String m149270O(long j, long j2, boolean z) {
        long jMax = Math.max(0L, j2 - j);
        long j3 = (jMax / 1000) % 60;
        long j4 = (jMax / Constants.ONE_MIN_IN_MILLIS) % 60;
        long j5 = jMax / 3600000;
        if (jMax <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (j5 > 0 || z) {
            if (j5 < 10) {
                sb.append("0");
            }
            sb.append(j5);
            sb.append(":");
        }
        if (j4 < 10) {
            sb.append("0");
        }
        sb.append(j4);
        sb.append(":");
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: P */
    public static String m149271P(long j, boolean z) {
        return m149270O(uqb0.f180376H.guessedCurrentServerTime(), j, z);
    }

    /* JADX INFO: renamed from: Q */
    public static String m149272Q(long j) {
        long j2 = j / 1000;
        if (j2 <= 0) {
            return "00:00";
        }
        long j3 = j2 / 3600;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 % 60;
        if (j3 <= 0) {
            return tzi0.m193672j(j4) + ":" + tzi0.m193672j(j5);
        }
        return tzi0.m193672j(j3) + ":" + tzi0.m193672j(j4) + ":" + tzi0.m193672j(j5);
    }

    /* JADX INFO: renamed from: R */
    public static String m149273R(long j) {
        if (j >= 10) {
            return String.valueOf(j);
        }
        return "0" + j;
    }

    /* JADX INFO: renamed from: S */
    public static String m149274S(long j) {
        return f125279t.format(new Date(j));
    }

    /* JADX INFO: renamed from: T */
    public static String m149275T(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf((int) Math.ceil(j / 86400.0f)));
        sb.append(m149279X() ? "天" : Constants.INAPP_DATA_TAG);
        return sb.toString();
    }

    /* JADX INFO: renamed from: U */
    public static String m149276U(long j) {
        boolean z;
        long jGuessedCurrentServerTime = j - (uqb0.f180376H.guessedCurrentServerTime() / 1000);
        long j2 = (jGuessedCurrentServerTime / 60) % 60;
        long j3 = (jGuessedCurrentServerTime / 3600) % 24;
        long j4 = jGuessedCurrentServerTime / 86400;
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        if (j4 > 0) {
            sb.append(j4);
            sb.append(m149279X() ? "天" : Constants.INAPP_DATA_TAG);
            z = true;
        } else {
            z = false;
        }
        if (j3 > 0) {
            sb.append(j3);
            sb.append(m149279X() ? "小时" : "h");
        } else {
            z2 = false;
        }
        if (z && z2) {
            return sb.toString();
        }
        if (j2 >= 0) {
            sb.append(j2);
            sb.append(m149279X() ? "分钟" : "m");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: V */
    public static long[] m149277V(long j) {
        long j2 = j % 86400000;
        long j3 = j2 / 3600000;
        long j4 = j2 % 3600000;
        return new long[]{j3, j4 / Constants.ONE_MIN_IN_MILLIS, (j4 % Constants.ONE_MIN_IN_MILLIS) / 1000};
    }

    /* JADX INFO: renamed from: W */
    public static String m149278W(long j) {
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        if (j < 0) {
            return "";
        }
        long[] jArrM149277V = m149277V(j);
        long j2 = jArrM149277V[0];
        long j3 = jArrM149277V[1];
        long j4 = jArrM149277V[2];
        StringBuilder sb = new StringBuilder();
        if (j2 < 10) {
            objValueOf = "0" + j2;
        } else {
            objValueOf = Long.valueOf(j2);
        }
        sb.append(objValueOf);
        sb.append(":");
        if (j3 < 10) {
            objValueOf2 = "0" + j3;
        } else {
            objValueOf2 = Long.valueOf(j3);
        }
        sb.append(objValueOf2);
        sb.append(":");
        if (j4 < 10) {
            objValueOf3 = "0" + j4;
        } else {
            objValueOf3 = Long.valueOf(j4);
        }
        sb.append(objValueOf3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: X */
    public static boolean m149279X() {
        Locale locale = Locale.getDefault();
        return "zh".equals(locale.getLanguage()) && "CN".equals(locale.getCountry());
    }

    /* JADX INFO: renamed from: Y */
    public static long m149280Y() {
        long jM174454o = pzi0.m174454o();
        return 86400000 - (jM174454o - tzi0.m193665c(jM174454o));
    }

    /* JADX INFO: renamed from: Z */
    public static String m149281Z(long j) {
        int i = (int) (j / 60);
        int i2 = (int) (j % 60);
        String strValueOf = String.valueOf(i);
        String strValueOf2 = String.valueOf(i2);
        if (i < 10) {
            strValueOf = "0" + i;
        }
        if (i2 < 10) {
            strValueOf2 = "0" + i2;
        }
        return strValueOf + ":" + strValueOf2;
    }
}
