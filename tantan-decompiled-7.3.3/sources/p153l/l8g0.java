package p153l;

import java.util.concurrent.ThreadLocalRandom;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class l8g0 {

    /* JADX INFO: renamed from: a */
    private static final String f130461a = riw.m181611a(new byte[]{113, 36, 114, 115, 36, HttpTokens.SPACE, 119, 46, 120, 125, 42, 42, 125, 40, 126, 103, 48, 52, 99, 50, 100, 97, 54, 62, 105, 60, 80, 85, 2, 2, 85, 0, 86, 95, 8, 12, 91, 10, 92, 89, 14, 22, 65, 20, 66, 67, 20, Tnaf.POW_2_WIDTH, 71, 30, 72, 77, 81, 87, 2, 85, 5, 2, 87, 81, 8, 95});

    /* JADX INFO: renamed from: a */
    public static String m153223a() {
        return m153224b(16);
    }

    /* JADX INFO: renamed from: b */
    public static String m153224b(int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            String str = f130461a;
            sb.append(str.charAt(threadLocalRandomCurrent.nextInt(str.length())));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m153225c(String str) {
        return str == null || str.isEmpty();
    }
}
