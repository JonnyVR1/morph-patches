package p153l;

import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class uzi0 {
    /* JADX INFO: renamed from: a */
    public static String m198838a() {
        Calendar calendar = Calendar.getInstance();
        return "" + calendar.get(1) + "-" + (calendar.get(2) + 1) + "-" + calendar.get(5);
    }

    /* JADX INFO: renamed from: b */
    public static String m198839b(long j) {
        return String.valueOf(j / 1000);
    }
}
