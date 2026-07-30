package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class yab extends pzi0 {

    /* JADX INFO: renamed from: l.yab$a */
    public static /* synthetic */ class C21550a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f198163a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f198163a = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f198163a[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f198163a[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f198163a[TimeUnit.MILLISECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m214857C(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: O */
    public static List<String> m214858O(long j) {
        ArrayList arrayList = new ArrayList();
        long j2 = j / 1000;
        if (j2 > 0) {
            arrayList.addAll(m214868Y(j2 / 3600));
            arrayList.addAll(m214868Y((j2 / 60) % 60));
            arrayList.addAll(m214868Y(j2 % 60));
            return arrayList;
        }
        arrayList.add("0");
        arrayList.add("0");
        arrayList.add("0");
        arrayList.add("0");
        arrayList.add("0");
        arrayList.add("0");
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static long m214859P() {
        return tzi0.m193665c(pzi0.m174454o() + 86400000);
    }

    /* JADX INFO: renamed from: Q */
    public static int m214860Q(long j) {
        return Integer.parseInt(String.valueOf((pzi0.m174454o() - j) / 3600000));
    }

    /* JADX INFO: renamed from: R */
    public static int m214861R(long j, long j2) {
        return Integer.parseInt(String.valueOf((j2 - j) / 3600000));
    }

    /* JADX INFO: renamed from: S */
    public static int m214862S(long j, long j2) {
        if (j >= j2) {
            return 0;
        }
        return (int) ((j2 - j) / 86400000);
    }

    /* JADX INFO: renamed from: T */
    public static int m214863T(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            return 0;
        }
        if (calendar.getTimeInMillis() > calendar2.getTimeInMillis()) {
            calendar2 = calendar;
            calendar = calendar2;
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        int i4 = calendar2.get(1);
        int i5 = calendar2.get(2) + 1;
        int i6 = calendar2.get(5);
        int i7 = i4 - i;
        if (i == i4) {
            return i7;
        }
        if (i2 != i5) {
            return i2 > i5 ? i7 - 1 : i7;
        }
        return (i3 == i6 || i3 <= i6) ? i7 : i7 - 1;
    }

    /* JADX INFO: renamed from: U */
    public static String m214864U() {
        Date date = new Date();
        date.setTime(pzi0.m174454o());
        return pzi0.f154857d.format(date);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m214865V() {
        if (!uqb0.f180397c0.signedIn_()) {
            return false;
        }
        return !tzi0.m193670h(pzi0.m174454o(), (long) uqb0.f180397c0.me_().createdTime, 7);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m214866W(int i, TimeUnit timeUnit) {
        boolean zM193670h = false;
        if (!uqb0.f180397c0.signedIn_()) {
            return false;
        }
        User userMe_ = uqb0.f180397c0.me_();
        int i2 = C21550a.f198163a[timeUnit.ordinal()];
        if (i2 == 1) {
            zM193670h = tzi0.m193670h(pzi0.m174454o(), (long) userMe_.createdTime, i);
        } else if (i2 == 2 ? (pzi0.m174454o() - ((long) userMe_.createdTime)) / 3600000 > i : !(i2 == 3 ? (pzi0.m174454o() - ((long) userMe_.createdTime)) / Constants.ONE_MIN_IN_MILLIS <= i : i2 != 4 || pzi0.m174454o() - ((long) userMe_.createdTime) <= i)) {
            zM193670h = true;
        }
        return !zM193670h;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m214867X(long j) {
        if (j == 0) {
            return false;
        }
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(pzi0.m174454o()));
        return calendar.get(1) == calendar2.get(1) && calendar.get(3) == calendar2.get(3) && calendar.get(7) == calendar2.get(7);
    }

    /* JADX INFO: renamed from: Y */
    public static List<String> m214868Y(long j) {
        ArrayList arrayList = new ArrayList();
        if (j < 0 || j >= 10) {
            arrayList.add(Long.toString(j / 10));
            arrayList.add(Long.toString(j % 10));
            return arrayList;
        }
        arrayList.add("0");
        arrayList.add(Long.toString(j));
        return arrayList;
    }
}
