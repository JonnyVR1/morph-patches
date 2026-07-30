package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gvp0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f106669a = Pattern.compile("^NOTE([ \t].*)?$");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Matcher m132574a(ig60 ig60Var) {
        String strM139829s;
        while (true) {
            String strM139829s2 = ig60Var.m139829s();
            if (strM139829s2 == null) {
                return null;
            }
            if (f106669a.matcher(strM139829s2).matches()) {
                do {
                    strM139829s = ig60Var.m139829s();
                    if (strM139829s == null) {
                        break;
                    }
                } while (!strM139829s.isEmpty());
            } else {
                Matcher matcher = cvp0.f84023a.matcher(strM139829s2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m132575b(ig60 ig60Var) {
        String strM139829s = ig60Var.m139829s();
        return strM139829s != null && strM139829s.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: c */
    public static float m132576c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: d */
    public static long m132577d(String str) throws NumberFormatException {
        String[] strArrM105122b1 = bmk0.m105122b1(str, "\\.");
        long j = 0;
        for (String str2 : bmk0.m105119a1(strArrM105122b1[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrM105122b1.length == 2) {
            j2 += Long.parseLong(strArrM105122b1[1]);
        }
        return j2 * 1000;
    }

    /* JADX INFO: renamed from: e */
    public static void m132578e(ig60 ig60Var) throws ParserException {
        int iM139816f = ig60Var.m139816f();
        if (m132575b(ig60Var)) {
            return;
        }
        ig60Var.m139808U(iM139816f);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + ig60Var.m139829s(), null);
    }
}
