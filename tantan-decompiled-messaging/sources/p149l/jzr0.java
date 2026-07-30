package p149l;

import androidx.annotation.VisibleForTesting;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class jzr0 {
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static long m143940a(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return ((i & 1) == 0 ? m143940a(j2, i2) : j * (m143940a(j2, i2) % 1073807359)) % 1073807359;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static String m143941b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            x2t0.m206866d("Unable to construct shingle");
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
    public static void m143942c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            m143943d(i, m143944e(strArr, 0, length), m143941b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jM143944e = m143944e(strArr, 0, 6);
        m143943d(i, jM143944e, m143941b(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            long jM123918a = fzr0.m123918a(strArr[i3 - 1]);
            long jM123918a2 = fzr0.m123918a(strArr[i3 + 5]);
            String strM143941b = m143941b(strArr, i3, 6);
            jM143944e = ((((((jM143944e + 1073807359) - ((m143940a(16785407L, 5) * ((jM123918a + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jM123918a2 + 2147483647L) % 1073807359)) % 1073807359;
            m143943d(i, jM143944e, strM143941b, length2, priorityQueue);
            i3++;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static void m143943d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        izr0 izr0Var = new izr0(j, str, i2);
        if ((priorityQueue.size() != i || (((izr0) priorityQueue.peek()).f115597c <= izr0Var.f115597c && ((izr0) priorityQueue.peek()).f115595a <= izr0Var.f115595a)) && !priorityQueue.contains(izr0Var)) {
            priorityQueue.add(izr0Var);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m143944e(String[] strArr, int i, int i2) {
        long jM123918a = (((long) fzr0.m123918a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jM123918a = (((jM123918a * 16785407) % 1073807359) + ((((long) fzr0.m123918a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jM123918a;
    }
}
