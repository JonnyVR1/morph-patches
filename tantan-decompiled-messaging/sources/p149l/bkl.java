package p149l;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class bkl {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<DateFormat> f76051a = new C15893a();

    /* JADX INFO: renamed from: b */
    public static final String[] f76052b;

    /* JADX INFO: renamed from: c */
    public static final DateFormat[] f76053c;

    /* JADX INFO: renamed from: l.bkl$a */
    public static class C15893a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(tck0.f169458i);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f76052b = strArr;
        f76053c = new DateFormat[strArr.length];
    }

    /* JADX INFO: renamed from: a */
    public static String m102412a(Date date) {
        return f76051a.get().format(date);
    }

    /* JADX INFO: renamed from: b */
    public static Date m102413b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f76051a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f76052b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    DateFormat[] dateFormatArr = f76053c;
                    DateFormat simpleDateFormat = dateFormatArr[i];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f76052b[i], Locale.US);
                        simpleDateFormat.setTimeZone(tck0.f169458i);
                        dateFormatArr[i] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
