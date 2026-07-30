package p149l;

import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
public class rqi0 {
    /* JADX INFO: renamed from: a */
    public static String m180458a() {
        Calendar calendar = Calendar.getInstance();
        return "" + calendar.get(1) + "-" + (calendar.get(2) + 1) + "-" + calendar.get(5);
    }

    /* JADX INFO: renamed from: b */
    public static String m180459b(long j) {
        return String.valueOf(j / 1000);
    }
}
