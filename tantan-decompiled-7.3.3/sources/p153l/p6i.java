package p153l;

import android.app.Application;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes13.dex */
public class p6i {
    /* JADX INFO: renamed from: a */
    public static String m170892a(int i) {
        String strValueOf = String.valueOf(i);
        return strValueOf.length() == 1 ? "0".concat(strValueOf) : strValueOf;
    }

    /* JADX INFO: renamed from: b */
    public static long m170893b(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        gregorianCalendar2.setTime(date2);
        return (gregorianCalendar.getTimeInMillis() - gregorianCalendar2.getTimeInMillis()) / 86400000;
    }

    /* JADX INFO: renamed from: c */
    public static String m170894c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        String strValueOf = String.valueOf(calendar.get(5));
        return strValueOf.length() == 1 ? "0".concat(strValueOf) : strValueOf;
    }

    /* JADX INFO: renamed from: d */
    public static int m170895d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        return calendar.get(2);
    }

    /* JADX INFO: renamed from: e */
    public static int m170896e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        return calendar.get(1);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m170897f(long j, long j2) {
        return (j2 - j) / 1000 < 28800;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m170898g(long j) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(pzi0.m174454o()));
        int i2 = calendar.get(1);
        int i3 = calendar2.get(1);
        int i4 = calendar.get(6);
        int i5 = calendar2.get(6);
        if (i3 == i2) {
            i = i5 - i4;
        } else {
            int i6 = 0;
            while (i2 < i3) {
                i6 = m170902k(i2) ? i6 + 366 : i6 + 365;
                i2++;
            }
            i = (i6 + i5) - i4;
        }
        return i <= 6;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m170899h(double d) {
        return (pzi0.m174454o() - ((long) d)) / 1000 < 86400;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m170900i(double d) {
        return (pzi0.m174454o() - ((long) d)) / 1000 < 604800;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m170901j(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m170902k(int i) {
        return (i % 100 != 0 || i % 400 == 0) && i % 4 == 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m170903l(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m170904m(long j) {
        long jM174454o = pzi0.m174454o();
        if (jM174454o - j > 2678400000L) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM174454o);
        return i == calendar2.get(1) && i2 == calendar2.get(2);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m170905n(long j) {
        long jM174454o = pzi0.m174454o();
        if (jM174454o - j > 86400000) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM174454o);
        return i == calendar2.get(5);
    }

    /* JADX INFO: renamed from: o */
    public static String m170906o(double d) {
        return m170907p(pzi0.m174454o(), d);
    }

    /* JADX INFO: renamed from: p */
    public static String m170907p(long j, double d) {
        int i;
        long j2;
        Application application = App.f16088e;
        Calendar calendar = Calendar.getInstance();
        long j3 = (long) d;
        calendar.setTimeInMillis(j3);
        if (calendar.get(1) <= 1970) {
            return application.getString(R$string.f18251z2);
        }
        long j4 = (j3 - j) / 1000;
        long j5 = 1;
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
        } else {
            if (j4 <= 3600) {
                if (j4 > 60) {
                    j2 = (int) (j4 / 60);
                    i = j2 > 1 ? R$string.f18027B2 : R$string.f18023A2;
                } else {
                    i = R$string.f18027B2;
                }
                return j5 + application.getString(i);
            }
            j2 = (int) (j4 / 3600);
            i = j2 > 1 ? R$string.f18242x2 : R$string.f18237w2;
        }
        j5 = j2;
        return j5 + application.getString(i);
    }

    /* JADX INFO: renamed from: q */
    public static String m170908q(double d) {
        return m170909r(pzi0.m174454o(), d);
    }

    /* JADX INFO: renamed from: r */
    public static String m170909r(long j, double d) {
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
                return j4 > 0 ? application.getString(com.p051p1.mobile.putong.feed.R$string.f39972p1, Long.valueOf(j4)) : application.getString(com.p051p1.mobile.putong.feed.R$string.f39972p1, 1);
            }
            j2 = (int) (j4 / 60);
            i = j2 > 1 ? R$string.f18027B2 : R$string.f18023A2;
        }
        return application.getString(R$string.f18232v2, Long.valueOf(j2), application.getString(i));
    }
}
