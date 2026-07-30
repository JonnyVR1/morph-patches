package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class cmp0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f81598a = Pattern.compile("^NOTE([ \t].*)?$");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Matcher m107687a(d860 d860Var) {
        String strM110313s;
        while (true) {
            String strM110313s2 = d860Var.m110313s();
            if (strM110313s2 == null) {
                return null;
            }
            if (f81598a.matcher(strM110313s2).matches()) {
                do {
                    strM110313s = d860Var.m110313s();
                    if (strM110313s == null) {
                        break;
                    }
                } while (!strM110313s.isEmpty());
            } else {
                Matcher matcher = ylp0.f198908a.matcher(strM110313s2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m107688b(d860 d860Var) {
        String strM110313s = d860Var.m110313s();
        return strM110313s != null && strM110313s.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: c */
    public static float m107689c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: d */
    public static long m107690d(String str) throws NumberFormatException {
        String[] strArrM197844b1 = vck0.m197844b1(str, "\\.");
        long j = 0;
        for (String str2 : vck0.m197841a1(strArrM197844b1[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrM197844b1.length == 2) {
            j2 += Long.parseLong(strArrM197844b1[1]);
        }
        return j2 * 1000;
    }

    /* JADX INFO: renamed from: e */
    public static void m107691e(d860 d860Var) throws ParserException {
        int iM110300f = d860Var.m110300f();
        if (m107688b(d860Var)) {
            return;
        }
        d860Var.m110292U(iM110300f);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + d860Var.m110313s(), null);
    }
}
