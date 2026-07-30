package p149l;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class j7c {

    /* JADX INFO: renamed from: a */
    public static SimpleDateFormat f116582a = new SimpleDateFormat("yyyyMMdd");

    /* JADX INFO: renamed from: b */
    public static SimpleDateFormat f116583b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);

    /* JADX INFO: renamed from: c */
    public static SimpleDateFormat f116584c = new SimpleDateFormat("MM-dd HH:mm", Locale.US);

    static {
        f116583b.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* JADX INFO: renamed from: a */
    public static String m140082a(Date date) {
        return f116582a.format(date);
    }

    /* JADX INFO: renamed from: b */
    public static Date m140083b(String str) {
        try {
            return f116582a.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m140084c() {
        try {
            return f116582a.format(new Date(System.currentTimeMillis()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m140085d() {
        try {
            return f116582a.parse(f116582a.format(new Date(System.currentTimeMillis()))).getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m140086e(long j) {
        try {
            return f116583b.format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m140087f(long j) {
        return j < 0 ? "" : new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m140088g(String str) {
        return str.equals(m140084c());
    }

    /* JADX INFO: renamed from: h */
    public static long m140089h(String str) {
        try {
            return f116582a.parse(str).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }
}
