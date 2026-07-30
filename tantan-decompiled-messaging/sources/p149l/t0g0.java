package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public class t0g0 {

    /* JADX INFO: renamed from: a */
    public static Pattern f167184a = Pattern.compile("[a-zA-Z ]+");

    /* JADX INFO: renamed from: a */
    public static String m186860a(long j, long j2) {
        if (j <= j2) {
            return j > 0 ? String.valueOf(j) : "0";
        }
        return j2 + Marker.ANY_NON_NULL_MARKER;
    }

    /* JADX INFO: renamed from: b */
    public static String m186861b(double d) {
        return new DecimalFormat("0.00").format(d);
    }

    /* JADX INFO: renamed from: c */
    public static String m186862c(double d) {
        return new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(new BigDecimal(d).setScale(1, 1).doubleValue());
    }

    /* JADX INFO: renamed from: d */
    public static String m186863d(double d) {
        return new DecimalFormat("#.#").format(d);
    }

    /* JADX INFO: renamed from: e */
    public static String m186864e(double d) {
        return new DecimalFormat("#.##").format(d);
    }

    /* JADX INFO: renamed from: f */
    public static String m186865f(int i) {
        return m186866g(i, 99);
    }

    /* JADX INFO: renamed from: g */
    public static String m186866g(int i, int i2) {
        if (i <= i2) {
            if (i > 0) {
                return String.valueOf(i);
            }
            return null;
        }
        return String.valueOf(i2) + Marker.ANY_NON_NULL_MARKER;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m186867h(char c) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c);
        return unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || unicodeBlockOf == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || unicodeBlockOf == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || unicodeBlockOf == Character.UnicodeBlock.GENERAL_PUNCTUATION;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m186868i(char c) {
        if (c == 0 || c == '\t' || c == '\n' || c == '\r') {
            return false;
        }
        if (c >= ' ' && c <= 55295) {
            return false;
        }
        if (c < 57344 || c > 65533) {
            return c < 0 || c > 65535;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m186869j(String str) {
        return f167184a.matcher(str).matches();
    }

    /* JADX INFO: renamed from: k */
    public static String m186870k(long j) {
        if (j <= 0) {
            return "0 B";
        }
        double d = j;
        int iLog10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(d / Math.pow(1024.0d, iLog10)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + new String[]{"B", "KB", "MB", "GB", "TB"}[iLog10];
    }

    /* JADX INFO: renamed from: l */
    public static boolean m186871l(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }
}
