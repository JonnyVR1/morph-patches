package p153l;

import android.annotation.SuppressLint;
import android.app.Application;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class pzi0 extends tzi0 {

    /* JADX INFO: renamed from: a */
    public static ArrayList<Integer> f154854a = jyb.m147507f0(1, 3, 5, 7, 8, 10, 12);

    /* JADX INFO: renamed from: b */
    public static final SimpleDateFormat f154855b = new m8c("yy/MM/dd", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: c */
    public static final SimpleDateFormat f154856c = new m8c("yyyy/MM/dd", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: d */
    public static final SimpleDateFormat f154857d = new m8c("yyyy-MM-dd", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: e */
    public static final SimpleDateFormat f154858e = new m8c("yyyy-MM-dd HH:mm", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: f */
    public static final SimpleDateFormat f154859f = new m8c("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: g */
    public static final SimpleDateFormat f154860g = new m8c("MM/dd", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: h */
    public static final SimpleDateFormat f154861h = new SimpleDateFormat("HH:mm", Locale.getDefault());

    /* JADX INFO: renamed from: i */
    public static final SimpleDateFormat f154862i = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

    /* JADX INFO: renamed from: j */
    public static final SimpleDateFormat f154863j = new SimpleDateFormat("MM月dd日", Locale.getDefault());

    /* JADX INFO: renamed from: k */
    public static final SimpleDateFormat f154864k = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: l */
    public static final SimpleDateFormat f154865l = new m8c("MM-dd HH:mm", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: m */
    public static final SimpleDateFormat f154866m = new m8c("MM-dd", Locale.getDefault()).m157356a();

    /* JADX INFO: renamed from: n */
    public static final SimpleDateFormat f154867n = new SimpleDateFormat("MMM", Locale.getDefault());

    /* JADX INFO: renamed from: o */
    public static final SimpleDateFormat f154868o = new SimpleDateFormat("dd", Locale.getDefault());

    /* JADX INFO: renamed from: p */
    public static final SimpleDateFormat f154869p = new SimpleDateFormat("HH:mm", Locale.getDefault());

    /* JADX INFO: renamed from: q */
    public static Calendar f154870q = Calendar.getInstance();

    /* JADX INFO: renamed from: r */
    public static Calendar f154871r = Calendar.getInstance();

    /* JADX INFO: renamed from: A */
    public static boolean m174436A(int i, int i2, int i3, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m174454o());
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        calendar.set(14, 0);
        return j - calendar.getTimeInMillis() > 0;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m174437B(int i, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m174454o());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        int i2 = calendar.get(1);
        int i3 = calendar.get(6);
        int i4 = calendar2.get(6);
        for (int i5 = calendar2.get(1); i5 < i2; i5++) {
            i3 += m174464y(i5) ? 366 : 365;
        }
        return i3 - i4 >= i;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m174438C(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m174439D(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date(m174454o())));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m174440E(long j, int i) {
        try {
            Date date = new Date(j);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String str = simpleDateFormat.format(date);
            long jM174454o = m174454o();
            String str2 = simpleDateFormat.format(new Date(jM174454o));
            long time = (jM174454o - simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(jM174454o))).getTime()) / 1000;
            if (!str.equals(str2)) {
                return time <= ((long) i) && jM174454o - j < ((long) (MMKV.ExpireInDay - i)) + time;
            }
            long j2 = i;
            return (j - simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime()) / 1000 > j2 || time < j2;
        } catch (ParseException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m174441F(long j, TimeZone timeZone) {
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        Date date2 = new Date(m174454o());
        calendar.add(5, 1);
        calendar.set(11, 3);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTime().compareTo(date2) > 0;
    }

    /* JADX INFO: renamed from: G */
    public static String m174442G(double d) {
        return m174444I(d, false);
    }

    /* JADX INFO: renamed from: H */
    public static String m174443H(double d, long j) {
        long j2;
        int i;
        Application application = App.f16088e;
        Calendar calendar = Calendar.getInstance();
        long j3 = (long) d;
        calendar.setTimeInMillis(j3);
        if (calendar.get(1) <= 1970) {
            return application.getString(R$string.f18251z2);
        }
        long j4 = (j - j3) / 1000;
        if (j4 > 31536000) {
            j2 = (int) (j4 / 31536000);
            i = j2 > 1 ? R$string.f18199p : R$string.f18194o;
        } else if (j4 > 2592000) {
            j2 = (int) (j4 / 2592000);
            i = j2 > 1 ? R$string.f18179l : R$string.f18174k;
        } else if (j4 > 604800) {
            j2 = (int) (j4 / 604800);
            i = j2 > 1 ? R$string.f18189n : R$string.f18184m;
        } else if (j4 > 86400) {
            j2 = (int) (j4 / 86400);
            i = j2 > 1 ? R$string.f18169j : R$string.f18164i;
        } else if (j4 > 3600) {
            j2 = (int) (j4 / 3600);
            i = j2 > 1 ? R$string.f18242x2 : R$string.f18237w2;
        } else {
            if (j4 <= 60) {
                return application.getString(R$string.f18251z2);
            }
            j2 = (int) (j4 / 60);
            i = j2 > 1 ? R$string.f18027B2 : R$string.f18023A2;
        }
        return application.getString(R$string.f18232v2, Long.valueOf(j2), application.getString(i));
    }

    /* JADX INFO: renamed from: I */
    public static String m174444I(double d, boolean z) {
        return m174443H(d, uqb0.f180376H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: J */
    public static String m174445J(double d, boolean z) {
        long jGuessedCurrentServerTime = (uqb0.f180376H.guessedCurrentServerTime() - ((long) d)) / 1000;
        Application application = App.f16088e;
        if (jGuessedCurrentServerTime < 300) {
            return application.getString(R$string.f18130b0);
        }
        if (jGuessedCurrentServerTime < 86400) {
            return jGuessedCurrentServerTime < 3600 ? application.getString(R$string.f18245y0, String.valueOf(jGuessedCurrentServerTime / 60)) : application.getString(R$string.f18240x0, String.valueOf(jGuessedCurrentServerTime / 3600));
        }
        if (jGuessedCurrentServerTime <= 432000) {
            return application.getString(R$string.f18122Z1);
        }
        return jGuessedCurrentServerTime <= 1296000 ? application.getString(R$string.f18051H2) : "";
    }

    /* JADX INFO: renamed from: K */
    public static boolean m174446K(double d) {
        return (uqb0.f180376H.guessedCurrentServerTime() - ((long) d)) / 1000 <= 600;
    }

    /* JADX INFO: renamed from: L */
    public static String m174447L(double d, long j, boolean z, boolean z2) {
        String string;
        Application application = App.f16088e;
        long j2 = (j - ((long) d)) / 1000;
        if (j2 > 604800) {
            if (z) {
                return "";
            }
            return z2 ? "近期活跃" : "近期活跃过";
        }
        if (j2 >= 86400) {
            long j3 = (int) (j2 / 86400);
            int i = j3 > 1 ? R$string.f18169j : R$string.f18164i;
            if (z) {
                return z2 ? "最近活跃" : "最近活跃过";
            }
            string = application.getString(R$string.f18232v2, Long.valueOf(j3), application.getString(i));
        } else if (j2 >= 3600) {
            long j4 = (int) (j2 / 3600);
            string = application.getString(R$string.f18232v2, Long.valueOf(j4), application.getString(j4 > 1 ? R$string.f18242x2 : R$string.f18237w2));
        } else {
            if (j2 <= 600) {
                if (j2 >= 60) {
                    return "刚刚活跃";
                }
                return z2 ? "在线" : "现在活跃";
            }
            long j5 = (int) (j2 / 60);
            string = application.getString(R$string.f18232v2, Long.valueOf(j5), application.getString(j5 > 1 ? R$string.f18027B2 : R$string.f18023A2));
        }
        return z2 ? string : String.format("%s活跃", string);
    }

    /* JADX INFO: renamed from: M */
    public static String m174448M(double d, boolean z, boolean z2) {
        return m174447L(d, uqb0.f180376H.guessedCurrentServerTime(), z, z2);
    }

    /* JADX INFO: renamed from: N */
    public static String m174449N(double d) {
        Application application = App.f16088e;
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        if (calendar.get(1) <= 1970) {
            return application.getString(R$string.f18251z2);
        }
        long jGuessedCurrentServerTime = (uqb0.f180376H.guessedCurrentServerTime() - j) / 1000;
        if (jGuessedCurrentServerTime < 60) {
            return application.getString(R$string.f18251z2);
        }
        if (jGuessedCurrentServerTime < 3600) {
            int i = R$string.f18031C2;
            StringBuilder sb = new StringBuilder();
            sb.append((int) (jGuessedCurrentServerTime / 60));
            sb.append(application.getString(i));
            return sb.toString();
        }
        if (jGuessedCurrentServerTime >= 86400) {
            return f154855b.format(Double.valueOf(d));
        }
        int i2 = R$string.f18247y2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) (jGuessedCurrentServerTime / 3600));
        sb2.append(application.getString(i2));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static List<String> m174450k(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return jyb.m147507f0("0");
        }
        int i = (int) (d / 8.64E7d);
        int i2 = (int) ((d % 8.64E7d) / 3600000.0d);
        int i3 = (int) ((d % 3600000.0d) / 60000.0d);
        int i4 = (int) ((d % 60000.0d) / 1000.0d);
        return i > 0 ? jyb.m147507f0(String.format(Locale.getDefault(), "%d", Integer.valueOf(i)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i2)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i3)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i4))) : jyb.m147507f0(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i2)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i3)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i4)));
    }

    /* JADX INFO: renamed from: l */
    public static String m174451l(double d) {
        return f154860g.format(new Date((long) d));
    }

    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    /* JADX INFO: renamed from: m */
    public static String m174452m(long j) {
        Date date = new Date(j);
        Date date2 = new Date(m174454o());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        int i = calendar2.get(1) - calendar.get(1);
        int i2 = calendar2.get(2) - calendar.get(2);
        int i3 = calendar2.get(5) - calendar.get(5);
        if (i2 < 0) {
            i--;
            i2 += 12;
        }
        if (i3 < 0) {
            if (i2 > 0) {
                i3 += 30;
            }
            int i4 = i2 - 1;
            if (i4 < 0) {
                i--;
                i2 += 11;
            } else {
                i2 = i4;
            }
        }
        if (i <= 0 && i2 < 1) {
            return i3 <= 1 ? App.f16088e.getString(R$string.f18086Q1) : App.f16088e.getString(R$string.f18078O1, Integer.valueOf(i3));
        }
        if (i < 1) {
            return i2 == 1 ? App.f16088e.getString(R$string.f18090R1) : App.f16088e.getString(R$string.f18082P1, Integer.valueOf(i2));
        }
        return i == 1 ? App.f16088e.getString(R$string.f18094S1) : App.f16088e.getString(R$string.f18098T1, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public static long m174453n() {
        return tzi0.m193665c(m174454o());
    }

    /* JADX INFO: renamed from: o */
    public static long m174454o() {
        return uqb0.f180376H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: p */
    public static String m174455p(double d) {
        return f154859f.format(new Date((long) d));
    }

    /* JADX INFO: renamed from: q */
    public static SimpleDateFormat m174456q() {
        return new m8c("EEEE yy/MM/dd HH:mm", Locale.getDefault()).m157356a();
    }

    /* JADX INFO: renamed from: r */
    public static int m174457r(int i, int i2) {
        if (i2 == 2) {
            return m174464y(i) ? 29 : 28;
        }
        return f154854a.contains(Integer.valueOf(i2)) ? 31 : 30;
    }

    /* JADX INFO: renamed from: s */
    public static long m174458s(int i, int i2, int i3) {
        long jM174454o;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m174454o());
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (m174454o() - timeInMillis > 0) {
            timeInMillis += 86400000;
            jM174454o = m174454o();
        } else {
            jM174454o = m174454o();
        }
        return timeInMillis - jM174454o;
    }

    /* JADX INFO: renamed from: t */
    public static String m174459t() {
        return DateFormat.getDateInstance().format(Long.valueOf(m174454o()));
    }

    /* JADX INFO: renamed from: u */
    public static SimpleDateFormat m174460u() {
        return new SimpleDateFormat("EEEE", Locale.getDefault());
    }

    /* JADX INFO: renamed from: v */
    public static boolean m174461v(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar2.setTime(new Date(m174454o()));
        return calendar.get(1) == calendar2.get(1) && calendar.get(3) == calendar2.get(3);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m174462w(long j, int i) {
        return new Date(m174454o()).getTime() - new Date(j).getTime() >= ((long) i) * 3600000;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m174463x(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m174454o());
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(11, i);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.set(11, i2);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        if (i <= i2) {
            return calendar.after(calendar2) && calendar.before(calendar3);
        }
        return calendar.after(calendar2) || calendar.before(calendar3);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m174464y(int i) {
        return (i % 100 != 0 || i % 400 == 0) && i % 4 == 0;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m174465z(int i, int i2, int i3) {
        return m174436A(i, i2, i3, m174454o());
    }
}
