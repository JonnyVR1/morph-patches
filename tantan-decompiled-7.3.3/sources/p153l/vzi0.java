package p153l;

import androidx.annotation.RestrictTo;
import com.tencent.mmkv.MMKV;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class vzi0 {

    /* JADX INFO: renamed from: a */
    public static final Object f186487a = new Object();

    /* JADX INFO: renamed from: b */
    public static char[] f186488b = new char[24];

    /* JADX INFO: renamed from: a */
    public static int m204102a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: b */
    public static void m204103b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m204105d(j - j2, printWriter, 0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: c */
    public static void m204104c(long j, PrintWriter printWriter) {
        m204105d(j, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: d */
    public static void m204105d(long j, PrintWriter printWriter, int i) {
        synchronized (f186487a) {
            printWriter.print(new String(f186488b, 0, m204106e(j, i)));
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m204106e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        if (f186488b.length < i) {
            f186488b = new char[i];
        }
        char[] cArr = f186488b;
        if (j2 == 0) {
            int i6 = i - 1;
            while (i6 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int i7 = (int) (j2 % 1000);
        int iFloor = (int) Math.floor(j2 / 1000);
        if (iFloor > 86400) {
            i2 = iFloor / MMKV.ExpireInDay;
            iFloor -= MMKV.ExpireInDay * i2;
        } else {
            i2 = 0;
        }
        if (iFloor > 3600) {
            i3 = iFloor / MMKV.ExpireInHour;
            iFloor -= i3 * MMKV.ExpireInHour;
        } else {
            i3 = 0;
        }
        if (iFloor > 60) {
            int i8 = iFloor / 60;
            iFloor -= i8 * 60;
            i4 = i8;
        } else {
            i4 = 0;
        }
        if (i != 0) {
            int iM204102a = m204102a(i2, 1, false, 0);
            int iM204102a2 = iM204102a + m204102a(i3, 1, iM204102a > 0, 2);
            int iM204102a3 = iM204102a2 + m204102a(i4, 1, iM204102a2 > 0, 2);
            int iM204102a4 = iM204102a3 + m204102a(iFloor, 1, iM204102a3 > 0, 2);
            i5 = 0;
            for (int iM204102a5 = iM204102a4 + m204102a(i7, 2, true, iM204102a4 > 0 ? 3 : 0) + 1; iM204102a5 < i; iM204102a5++) {
                cArr[i5] = ' ';
                i5++;
            }
        } else {
            i5 = 0;
        }
        cArr[i5] = c;
        int i9 = i5 + 1;
        boolean z = i != 0;
        int iM204107f = m204107f(cArr, i2, 'd', i9, false, 0);
        int iM204107f2 = m204107f(cArr, i3, 'h', iM204107f, iM204107f != i9, z ? 2 : 0);
        int iM204107f3 = m204107f(cArr, i4, 'm', iM204107f2, iM204107f2 != i9, z ? 2 : 0);
        int iM204107f4 = m204107f(cArr, iFloor, 's', iM204107f3, iM204107f3 != i9, z ? 2 : 0);
        int iM204107f5 = m204107f(cArr, i7, 'm', iM204107f4, true, (!z || iM204107f4 == i9) ? 0 : 3);
        cArr[iM204107f5] = 's';
        return iM204107f5 + 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m204107f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[i4 + 1] = c;
        return i4 + 2;
    }
}
