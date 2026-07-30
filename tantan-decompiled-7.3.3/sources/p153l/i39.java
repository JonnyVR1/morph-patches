package p153l;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes12.dex */
public class i39 {
    /* JADX INFO: renamed from: a */
    public static int m138279a(long j) {
        return Integer.parseInt(String.valueOf((pzi0.m174454o() - j) / 3600000));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m138280b(long j, long j2) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }
}
