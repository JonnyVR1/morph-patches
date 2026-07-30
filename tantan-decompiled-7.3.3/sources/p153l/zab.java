package p153l;

import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class zab extends pzi0 {
    /* JADX INFO: renamed from: O */
    public static int m219111O(Calendar calendar, Calendar calendar2) {
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
}
