package p153l;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class jrr0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f122406a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: a */
    public static float m146818a(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: b */
    public static long m146819b(String str) throws NumberFormatException {
        int i = mpw0.f137957a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }
}
