package p149l;

import java.util.concurrent.ThreadLocalRandom;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class d0g0 {

    /* JADX INFO: renamed from: a */
    private static final String f83182a = sgw.m184137a(new byte[]{113, 36, 114, 115, 36, HttpTokens.SPACE, 119, 46, 120, 125, 42, 42, 125, 40, 126, 103, 48, 52, 99, 50, 100, 97, 54, 62, 105, 60, 80, 85, 2, 2, 85, 0, 86, 95, 8, 12, 91, 10, 92, 89, 14, 22, 65, 20, 66, 67, 20, Tnaf.POW_2_WIDTH, 71, 30, 72, 77, 81, 87, 2, 85, 5, 2, 87, 81, 8, 95});

    /* JADX INFO: renamed from: a */
    public static String m109496a() {
        return m109497b(16);
    }

    /* JADX INFO: renamed from: b */
    public static String m109497b(int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            String str = f83182a;
            sb.append(str.charAt(threadLocalRandomCurrent.nextInt(str.length())));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m109498c(String str) {
        return str == null || str.isEmpty();
    }
}
