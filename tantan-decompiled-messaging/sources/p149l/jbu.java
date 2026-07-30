package p149l;

import com.clevertap.android.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class jbu extends mqi0 {

    /* JADX INFO: renamed from: s */
    public static final String[] f117210s = {"日", "一", "二", "三", "四", "五", "六"};

    /* JADX INFO: renamed from: t */
    public static SimpleDateFormat f117211t = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.getDefault());

    /* JADX INFO: renamed from: O */
    public static String m140807O(long j, long j2, boolean z) {
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
    public static String m140808P(long j, boolean z) {
        return m140807O(qib0.f154693H.guessedCurrentServerTime(), j, z);
    }

    /* JADX INFO: renamed from: Q */
    public static String m140809Q(long j) {
        long j2 = j / 1000;
        if (j2 <= 0) {
            return "00:00";
        }
        long j3 = j2 / 3600;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 % 60;
        if (j3 <= 0) {
            return qqi0.m175942j(j4) + ":" + qqi0.m175942j(j5);
        }
        return qqi0.m175942j(j3) + ":" + qqi0.m175942j(j4) + ":" + qqi0.m175942j(j5);
    }

    /* JADX INFO: renamed from: R */
    public static String m140810R(long j) {
        if (j >= 10) {
            return String.valueOf(j);
        }
        return "0" + j;
    }

    /* JADX INFO: renamed from: S */
    public static String m140811S(long j) {
        return f117211t.format(new Date(j));
    }

    /* JADX INFO: renamed from: T */
    public static String m140812T(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf((int) Math.ceil(j / 86400.0f)));
        sb.append(m140816X() ? "天" : Constants.INAPP_DATA_TAG);
        return sb.toString();
    }

    /* JADX INFO: renamed from: U */
    public static String m140813U(long j) {
        boolean z;
        long jGuessedCurrentServerTime = j - (qib0.f154693H.guessedCurrentServerTime() / 1000);
        long j2 = (jGuessedCurrentServerTime / 60) % 60;
        long j3 = (jGuessedCurrentServerTime / 3600) % 24;
        long j4 = jGuessedCurrentServerTime / 86400;
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        if (j4 > 0) {
            sb.append(j4);
            sb.append(m140816X() ? "天" : Constants.INAPP_DATA_TAG);
            z = true;
        } else {
            z = false;
        }
        if (j3 > 0) {
            sb.append(j3);
            sb.append(m140816X() ? "小时" : "h");
        } else {
            z2 = false;
        }
        if (z && z2) {
            return sb.toString();
        }
        if (j2 >= 0) {
            sb.append(j2);
            sb.append(m140816X() ? "分钟" : "m");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: V */
    public static long[] m140814V(long j) {
        long j2 = j % 86400000;
        long j3 = j2 / 3600000;
        long j4 = j2 % 3600000;
        return new long[]{j3, j4 / Constants.ONE_MIN_IN_MILLIS, (j4 % Constants.ONE_MIN_IN_MILLIS) / 1000};
    }

    /* JADX INFO: renamed from: W */
    public static String m140815W(long j) {
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        if (j < 0) {
            return "";
        }
        long[] jArrM140814V = m140814V(j);
        long j2 = jArrM140814V[0];
        long j3 = jArrM140814V[1];
        long j4 = jArrM140814V[2];
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
    public static boolean m140816X() {
        Locale locale = Locale.getDefault();
        return "zh".equals(locale.getLanguage()) && "CN".equals(locale.getCountry());
    }

    /* JADX INFO: renamed from: Y */
    public static long m140817Y() {
        long jM155944o = mqi0.m155944o();
        return 86400000 - (jM155944o - qqi0.m175935c(jM155944o));
    }

    /* JADX INFO: renamed from: Z */
    public static String m140818Z(long j) {
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
