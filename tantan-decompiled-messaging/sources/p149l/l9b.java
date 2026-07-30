package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class l9b extends mqi0 {

    /* JADX INFO: renamed from: l.l9b$a */
    public static /* synthetic */ class C18175a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f126933a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f126933a = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126933a[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126933a[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126933a[TimeUnit.MILLISECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m149005C(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX INFO: renamed from: O */
    public static List<String> m149006O(long j) {
        ArrayList arrayList = new ArrayList();
        long j2 = j / 1000;
        if (j2 > 0) {
            arrayList.addAll(m149016Y(j2 / 3600));
            arrayList.addAll(m149016Y((j2 / 60) % 60));
            arrayList.addAll(m149016Y(j2 % 60));
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
    public static long m149007P() {
        return qqi0.m175935c(mqi0.m155944o() + 86400000);
    }

    /* JADX INFO: renamed from: Q */
    public static int m149008Q(long j) {
        return Integer.parseInt(String.valueOf((mqi0.m155944o() - j) / 3600000));
    }

    /* JADX INFO: renamed from: R */
    public static int m149009R(long j, long j2) {
        return Integer.parseInt(String.valueOf((j2 - j) / 3600000));
    }

    /* JADX INFO: renamed from: S */
    public static int m149010S(long j, long j2) {
        if (j >= j2) {
            return 0;
        }
        return (int) ((j2 - j) / 86400000);
    }

    /* JADX INFO: renamed from: T */
    public static int m149011T(Calendar calendar, Calendar calendar2) {
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
    public static String m149012U() {
        Date date = new Date();
        date.setTime(mqi0.m155944o());
        return mqi0.f135252d.format(date);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m149013V() {
        if (!qib0.f154714c0.signedIn_()) {
            return false;
        }
        return !qqi0.m175940h(mqi0.m155944o(), (long) qib0.f154714c0.me_().createdTime, 7);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m149014W(int i, TimeUnit timeUnit) {
        boolean zM175940h = false;
        if (!qib0.f154714c0.signedIn_()) {
            return false;
        }
        User userMe_ = qib0.f154714c0.me_();
        int i2 = C18175a.f126933a[timeUnit.ordinal()];
        if (i2 == 1) {
            zM175940h = qqi0.m175940h(mqi0.m155944o(), (long) userMe_.createdTime, i);
        } else if (i2 == 2 ? (mqi0.m155944o() - ((long) userMe_.createdTime)) / 3600000 > i : !(i2 == 3 ? (mqi0.m155944o() - ((long) userMe_.createdTime)) / Constants.ONE_MIN_IN_MILLIS <= i : i2 != 4 || mqi0.m155944o() - ((long) userMe_.createdTime) <= i)) {
            zM175940h = true;
        }
        return !zM175940h;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m149015X(long j) {
        if (j == 0) {
            return false;
        }
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(mqi0.m155944o()));
        return calendar.get(1) == calendar2.get(1) && calendar.get(3) == calendar2.get(3) && calendar.get(7) == calendar2.get(7);
    }

    /* JADX INFO: renamed from: Y */
    public static List<String> m149016Y(long j) {
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
