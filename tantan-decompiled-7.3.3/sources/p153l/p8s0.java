package p153l;

import androidx.annotation.VisibleForTesting;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class p8s0 {
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static long m171270a(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return ((i & 1) == 0 ? m171270a(j2, i2) : j * (m171270a(j2, i2) % 1073807359)) % 1073807359;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static String m171271b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            dct0.m115295d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m171272c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            m171273d(i, m171274e(strArr, 0, length), m171271b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jM171274e = m171274e(strArr, 0, 6);
        m171273d(i, jM171274e, m171271b(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            long jM153298a = l8s0.m153298a(strArr[i3 - 1]);
            long jM153298a2 = l8s0.m153298a(strArr[i3 + 5]);
            String strM171271b = m171271b(strArr, i3, 6);
            jM171274e = ((((((jM171274e + 1073807359) - ((m171270a(16785407L, 5) * ((jM153298a + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jM153298a2 + 2147483647L) % 1073807359)) % 1073807359;
            m171273d(i, jM171274e, strM171271b, length2, priorityQueue);
            i3++;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static void m171273d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        o8s0 o8s0Var = new o8s0(j, str, i2);
        if ((priorityQueue.size() != i || (((o8s0) priorityQueue.peek()).f145465c <= o8s0Var.f145465c && ((o8s0) priorityQueue.peek()).f145463a <= o8s0Var.f145463a)) && !priorityQueue.contains(o8s0Var)) {
            priorityQueue.add(o8s0Var);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m171274e(String[] strArr, int i, int i2) {
        long jM153298a = (((long) l8s0.m153298a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jM153298a = (((jM153298a * 16785407) % 1073807359) + ((((long) l8s0.m153298a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jM153298a;
    }
}
