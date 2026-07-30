package p003l;

import java.util.Calendar;
import java.util.Date;
import l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z19 {
    /* JADX INFO: renamed from: a */
    public static int m11321a(long j) {
        return Integer.parseInt(String.valueOf((mqi0.o() - j) / 3600000));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11322b(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }
}
