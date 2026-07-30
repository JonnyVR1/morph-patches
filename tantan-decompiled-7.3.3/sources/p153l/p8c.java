package p153l;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class p8c {

    /* JADX INFO: renamed from: a */
    public static SimpleDateFormat f151005a = new SimpleDateFormat("yyyyMMdd");

    /* JADX INFO: renamed from: b */
    public static SimpleDateFormat f151006b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);

    /* JADX INFO: renamed from: c */
    public static SimpleDateFormat f151007c = new SimpleDateFormat("MM-dd HH:mm", Locale.US);

    static {
        f151006b.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* JADX INFO: renamed from: a */
    public static String m171230a(Date date) {
        return f151005a.format(date);
    }

    /* JADX INFO: renamed from: b */
    public static Date m171231b(String str) {
        try {
            return f151005a.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m171232c() {
        try {
            return f151005a.format(new Date(System.currentTimeMillis()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m171233d() {
        try {
            return f151005a.parse(f151005a.format(new Date(System.currentTimeMillis()))).getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m171234e(long j) {
        try {
            return f151006b.format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m171235f(long j) {
        return j < 0 ? "" : new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m171236g(String str) {
        return str.equals(m171232c());
    }

    /* JADX INFO: renamed from: h */
    public static long m171237h(String str) {
        try {
            return f151005a.parse(str).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }
}
