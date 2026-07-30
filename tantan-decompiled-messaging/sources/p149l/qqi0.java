package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.common.utils.R$string;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class qqi0 {
    /* JADX INFO: renamed from: a */
    public static List<String> m175933a(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return vwb.m200324f0("00", "00", "00");
        }
        int i = (int) (d / 3600000.0d);
        double d2 = d - (((long) i) * 3600000);
        int i2 = (int) (d2 / 60000.0d);
        return vwb.m200324f0(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i2)), String.format(Locale.getDefault(), "%02d", Integer.valueOf((int) ((d2 - (((long) i2) * Constants.ONE_MIN_IN_MILLIS)) / 1000.0d))));
    }

    /* JADX INFO: renamed from: b */
    public static String m175934b(long j) {
        long j2 = j / 1000;
        if (j2 <= 0) {
            return "00:00:00";
        }
        return m175942j(j2 / 3600) + ":" + m175942j((j2 / 60) % 60) + ":" + m175942j(j2 % 60);
    }

    /* JADX INFO: renamed from: c */
    public static long m175935c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    public static long m175936d(long j, int i) {
        return j + ((long) (i * 3600000));
    }

    /* JADX INFO: renamed from: e */
    public static String m175937e(Context context, long j) {
        if (j < 0) {
            return "";
        }
        long[] jArrM175941i = m175941i(j);
        long j2 = jArrM175941i[0];
        long j3 = jArrM175941i[1];
        long j4 = jArrM175941i[2];
        StringBuilder sb = new StringBuilder();
        if (j2 <= 0) {
            if (j3 <= 0) {
                sb.append(j4);
                sb.append(context.getString(R$string.f56079c));
            }
            return sb.toString();
        }
        sb.append(j2);
        sb.append(context.getString(R$string.f56077a));
        sb.append(j3);
        sb.append(context.getString(R$string.f56078b));
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m175938f(String str, double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "00:00:00";
        }
        int i = (int) (d / 3600000.0d);
        double d2 = d - (((long) i) * 3600000);
        int i2 = (int) (d2 / 60000.0d);
        return String.format(Locale.getDefault(), "%s%02d:%02d:%02d ", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) ((d2 - (((long) i2) * Constants.ONE_MIN_IN_MILLIS)) / 1000.0d)));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m175939g(long j, long j2, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        int i2 = (((calendar2.get(1) - calendar.get(1)) * 365) + calendar2.get(6)) - calendar.get(6);
        return i2 >= 0 && i2 < i;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m175940h(long j, long j2, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return j - calendar.getTimeInMillis() >= ((long) i) * 86400000;
    }

    /* JADX INFO: renamed from: i */
    public static long[] m175941i(long j) {
        long j2 = j % 86400000;
        long j3 = j2 / 3600000;
        long j4 = j2 % 3600000;
        return new long[]{j3, j4 / Constants.ONE_MIN_IN_MILLIS, (j4 % Constants.ONE_MIN_IN_MILLIS) / 1000};
    }

    /* JADX INFO: renamed from: j */
    public static String m175942j(long j) {
        if (j < 0 || j >= 10) {
            return "" + j;
        }
        return "0" + Long.toString(j);
    }
}
