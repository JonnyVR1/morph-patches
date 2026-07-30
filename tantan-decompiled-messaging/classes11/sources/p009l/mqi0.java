package p009l;

import android.annotation.SuppressLint;
import android.app.Application;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import l.qib0;
import l.qqi0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mqi0 extends qqi0 {

    /* JADX INFO: renamed from: a */
    public static ArrayList<Integer> f17025a = vwb.f0(new Integer[]{1, 3, 5, 7, 8, 10, 12});

    /* JADX INFO: renamed from: b */
    public static final SimpleDateFormat f17026b = new g7c("yy/MM/dd", Locale.getDefault()).m14796a();

    /* JADX INFO: renamed from: c */
    public static final SimpleDateFormat f17027c = new g7c("yyyy/MM/dd", Locale.getDefault()).m14796a();

    /* JADX INFO: renamed from: d */
    public static final SimpleDateFormat f17028d = new g7c("yyyy-MM-dd", Locale.getDefault()).m14796a();

    /* JADX INFO: renamed from: e */
    public static final SimpleDateFormat f17029e = new g7c("yyyy-MM-dd HH:mm", Locale.getDefault()).m14796a();

    /* JADX INFO: renamed from: f */
    public static final SimpleDateFormat f17030f = new g7c("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).m14796a();

    /* JADX INFO: renamed from: g */
    public static final SimpleDateFormat f17031g = new g7c("MM/dd", Locale.getDefault()).m14796a();

    /* JADX INFO: renamed from: h */
    public static final SimpleDateFormat f17032h = new SimpleDateFormat("HH:mm", Locale.getDefault());

    /* JADX INFO: renamed from: i */
    public static final SimpleDateFormat f17033i = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

    /* JADX INFO: renamed from: j */
    public static final SimpleDateFormat f17034j = new SimpleDateFormat("MM月dd日", Locale.getDefault());

    /* JADX INFO: renamed from: k */
    public static final SimpleDateFormat f17035k = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: l */
    public static final SimpleDateFormat f17036l = new g7c("MM-dd HH:mm", Locale.getDefault()).m14796a();

    /* JADX INFO: renamed from: m */
    public static final SimpleDateFormat f17037m = new g7c("MM-dd", Locale.getDefault()).m14796a();

    /* JADX INFO: renamed from: n */
    public static final SimpleDateFormat f17038n = new SimpleDateFormat("MMM", Locale.getDefault());

    /* JADX INFO: renamed from: o */
    public static final SimpleDateFormat f17039o = new SimpleDateFormat("dd", Locale.getDefault());

    /* JADX INFO: renamed from: p */
    public static final SimpleDateFormat f17040p = new SimpleDateFormat("HH:mm", Locale.getDefault());

    /* JADX INFO: renamed from: q */
    public static Calendar f17041q = Calendar.getInstance();

    /* JADX INFO: renamed from: r */
    public static Calendar f17042r = Calendar.getInstance();

    /* JADX INFO: renamed from: A */
    public static boolean m18532A(int i, int i2, int i3, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m18550o());
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        calendar.set(14, 0);
        return j - calendar.getTimeInMillis() > 0;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m18533B(int i, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m18550o());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        int i2 = calendar.get(1);
        int i3 = calendar.get(6);
        int i4 = calendar2.get(6);
        for (int i5 = calendar2.get(1); i5 < i2; i5++) {
            i3 += m18560y(i5) ? 366 : 365;
        }
        return i3 - i4 >= i;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m18534C(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m18535D(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date(m18550o())));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m18536E(long j, int i) {
        try {
            Date date = new Date(j);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String str = simpleDateFormat.format(date);
            long jM18550o = m18550o();
            String str2 = simpleDateFormat.format(new Date(jM18550o));
            long time = (jM18550o - simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(jM18550o))).getTime()) / 1000;
            if (!str.equals(str2)) {
                return time <= ((long) i) && jM18550o - j < ((long) (86400 - i)) + time;
            }
            long j2 = i;
            return (j - simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime()) / 1000 > j2 || time < j2;
        } catch (ParseException e) {
            CrashHelper.c(e);
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m18537F(long j, TimeZone timeZone) {
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        Date date2 = new Date(m18550o());
        calendar.add(5, 1);
        calendar.set(11, 3);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTime().compareTo(date2) > 0;
    }

    /* JADX INFO: renamed from: G */
    public static String m18538G(double d) {
        return m18540I(d, false);
    }

    /* JADX INFO: renamed from: H */
    public static String m18539H(double d, long j) {
        long j2;
        int i;
        Application application = App.e;
        Calendar calendar = Calendar.getInstance();
        long j3 = (long) d;
        calendar.setTimeInMillis(j3);
        if (calendar.get(1) <= 1970) {
            return application.getString(R.string.z2);
        }
        long j4 = (j - j3) / 1000;
        if (j4 > 31536000) {
            j2 = (int) (j4 / 31536000);
            i = j2 > 1 ? R.string.p : R.string.o;
        } else if (j4 > 2592000) {
            j2 = (int) (j4 / 2592000);
            i = j2 > 1 ? R.string.l : R.string.k;
        } else if (j4 > 604800) {
            j2 = (int) (j4 / 604800);
            i = j2 > 1 ? R.string.n : R.string.m;
        } else if (j4 > 86400) {
            j2 = (int) (j4 / 86400);
            i = j2 > 1 ? R.string.j : R.string.i;
        } else if (j4 > 3600) {
            j2 = (int) (j4 / 3600);
            i = j2 > 1 ? R.string.x2 : R.string.w2;
        } else {
            if (j4 <= 60) {
                return application.getString(R.string.z2);
            }
            j2 = (int) (j4 / 60);
            i = j2 > 1 ? R.string.B2 : R.string.A2;
        }
        return application.getString(R.string.v2, Long.valueOf(j2), application.getString(i));
    }

    /* JADX INFO: renamed from: I */
    public static String m18540I(double d, boolean z) {
        return m18539H(d, qib0.H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: J */
    public static String m18541J(double d, boolean z) {
        long jGuessedCurrentServerTime = (qib0.H.guessedCurrentServerTime() - ((long) d)) / 1000;
        Application application = App.e;
        if (jGuessedCurrentServerTime < 300) {
            return application.getString(R.string.b0);
        }
        if (jGuessedCurrentServerTime < 86400) {
            return jGuessedCurrentServerTime < 3600 ? application.getString(R.string.y0, String.valueOf(jGuessedCurrentServerTime / 60)) : application.getString(R.string.x0, String.valueOf(jGuessedCurrentServerTime / 3600));
        }
        if (jGuessedCurrentServerTime <= 432000) {
            return application.getString(R.string.Z1);
        }
        return jGuessedCurrentServerTime <= 1296000 ? application.getString(R.string.H2) : "";
    }

    /* JADX INFO: renamed from: K */
    public static boolean m18542K(double d) {
        return (qib0.H.guessedCurrentServerTime() - ((long) d)) / 1000 <= 600;
    }

    /* JADX INFO: renamed from: L */
    public static String m18543L(double d, long j, boolean z, boolean z2) {
        String string;
        Application application = App.e;
        long j2 = (j - ((long) d)) / 1000;
        if (j2 > 604800) {
            if (z) {
                return "";
            }
            return z2 ? "近期活跃" : "近期活跃过";
        }
        if (j2 >= 86400) {
            long j3 = (int) (j2 / 86400);
            int i = j3 > 1 ? R.string.j : R.string.i;
            if (z) {
                return z2 ? "最近活跃" : "最近活跃过";
            }
            string = application.getString(R.string.v2, Long.valueOf(j3), application.getString(i));
        } else if (j2 >= 3600) {
            long j4 = (int) (j2 / 3600);
            string = application.getString(R.string.v2, Long.valueOf(j4), application.getString(j4 > 1 ? R.string.x2 : R.string.w2));
        } else {
            if (j2 <= 600) {
                if (j2 >= 60) {
                    return "刚刚活跃";
                }
                return z2 ? "在线" : "现在活跃";
            }
            long j5 = (int) (j2 / 60);
            string = application.getString(R.string.v2, Long.valueOf(j5), application.getString(j5 > 1 ? R.string.B2 : R.string.A2));
        }
        return z2 ? string : String.format("%s活跃", string);
    }

    /* JADX INFO: renamed from: M */
    public static String m18544M(double d, boolean z, boolean z2) {
        return m18543L(d, qib0.H.guessedCurrentServerTime(), z, z2);
    }

    /* JADX INFO: renamed from: N */
    public static String m18545N(double d) {
        Application application = App.e;
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        if (calendar.get(1) <= 1970) {
            return application.getString(R.string.z2);
        }
        long jGuessedCurrentServerTime = (qib0.H.guessedCurrentServerTime() - j) / 1000;
        if (jGuessedCurrentServerTime < 60) {
            return application.getString(R.string.z2);
        }
        if (jGuessedCurrentServerTime < 3600) {
            int i = R.string.C2;
            StringBuilder sb = new StringBuilder();
            sb.append((int) (jGuessedCurrentServerTime / 60));
            sb.append(application.getString(i));
            return sb.toString();
        }
        if (jGuessedCurrentServerTime >= 86400) {
            return f17026b.format(Double.valueOf(d));
        }
        int i2 = R.string.y2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) (jGuessedCurrentServerTime / 3600));
        sb2.append(application.getString(i2));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static List<String> m18546k(double d) {
        if (d <= 0.0d) {
            return vwb.f0(new String[]{"0"});
        }
        int i = (int) (d / 8.64E7d);
        int i2 = (int) ((d % 8.64E7d) / 3600000.0d);
        int i3 = (int) ((d % 3600000.0d) / 60000.0d);
        int i4 = (int) ((d % 60000.0d) / 1000.0d);
        return i > 0 ? vwb.f0(new String[]{String.format(Locale.getDefault(), "%d", Integer.valueOf(i)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i2)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i3)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i4))}) : vwb.f0(new String[]{String.format(Locale.getDefault(), "%02d", Integer.valueOf(i2)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i3)), String.format(Locale.getDefault(), "%02d", Integer.valueOf(i4))});
    }

    /* JADX INFO: renamed from: l */
    public static String m18547l(double d) {
        return f17031g.format(new Date((long) d));
    }

    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    /* JADX INFO: renamed from: m */
    public static String m18548m(long j) {
        Date date = new Date(j);
        Date date2 = new Date(m18550o());
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
            return i3 <= 1 ? App.e.getString(R.string.Q1) : App.e.getString(R.string.O1, Integer.valueOf(i3));
        }
        if (i < 1) {
            return i2 == 1 ? App.e.getString(R.string.R1) : App.e.getString(R.string.P1, Integer.valueOf(i2));
        }
        return i == 1 ? App.e.getString(R.string.S1) : App.e.getString(R.string.T1, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public static long m18549n() {
        return qqi0.c(m18550o());
    }

    /* JADX INFO: renamed from: o */
    public static long m18550o() {
        return qib0.H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: p */
    public static String m18551p(double d) {
        return f17030f.format(new Date((long) d));
    }

    /* JADX INFO: renamed from: q */
    public static SimpleDateFormat m18552q() {
        return new g7c("EEEE yy/MM/dd HH:mm", Locale.getDefault()).m14796a();
    }

    /* JADX INFO: renamed from: r */
    public static int m18553r(int i, int i2) {
        if (i2 == 2) {
            return m18560y(i) ? 29 : 28;
        }
        return f17025a.contains(Integer.valueOf(i2)) ? 31 : 30;
    }

    /* JADX INFO: renamed from: s */
    public static long m18554s(int i, int i2, int i3) {
        long jM18550o;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m18550o());
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (m18550o() - timeInMillis > 0) {
            timeInMillis += 86400000;
            jM18550o = m18550o();
        } else {
            jM18550o = m18550o();
        }
        return timeInMillis - jM18550o;
    }

    /* JADX INFO: renamed from: t */
    public static String m18555t() {
        return DateFormat.getDateInstance().format(Long.valueOf(m18550o()));
    }

    /* JADX INFO: renamed from: u */
    public static SimpleDateFormat m18556u() {
        return new SimpleDateFormat("EEEE", Locale.getDefault());
    }

    /* JADX INFO: renamed from: v */
    public static boolean m18557v(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar2.setTime(new Date(m18550o()));
        return calendar.get(1) == calendar2.get(1) && calendar.get(3) == calendar2.get(3);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m18558w(long j, int i) {
        return new Date(m18550o()).getTime() - new Date(j).getTime() >= ((long) i) * 3600000;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m18559x(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m18550o());
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
    public static boolean m18560y(int i) {
        return (i % 100 != 0 || i % 400 == 0) && i % 4 == 0;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m18561z(int i, int i2, int i3) {
        return m18532A(i, i2, i3, m18550o());
    }
}
