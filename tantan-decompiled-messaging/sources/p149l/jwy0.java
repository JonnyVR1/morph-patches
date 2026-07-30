package p149l;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class jwy0 {

    /* JADX INFO: renamed from: a */
    public final String[] f120150a;

    /* JADX INFO: renamed from: b */
    public final int[] f120151b;

    /* JADX INFO: renamed from: c */
    public final kty0[] f120152c;

    /* JADX INFO: renamed from: d */
    public final int[] f120153d;

    /* JADX INFO: renamed from: e */
    public final int[][][] f120154e;

    /* JADX INFO: renamed from: f */
    public final kty0 f120155f;

    @VisibleForTesting
    public jwy0(String[] strArr, int[] iArr, kty0[] kty0VarArr, int[] iArr2, int[][][] iArr3, kty0 kty0Var) {
        this.f120150a = strArr;
        this.f120151b = iArr;
        this.f120152c = kty0VarArr;
        this.f120154e = iArr3;
        this.f120153d = iArr2;
        this.f120155f = kty0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m143695a(int i, int i2, boolean z) {
        int i3 = this.f120152c[i].m147224b(i2).f140535a;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (char c = 0; c <= 0; c = 1) {
            if ((this.f120154e[i][i2][0] & 7) == 4) {
                iArr[i5] = 0;
                i5++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        int iMin = 16;
        boolean z2 = false;
        int i6 = 0;
        while (i4 < iArrCopyOf.length) {
            String str2 = this.f120152c[i].m147224b(i2).m161414b(iArrCopyOf[i4]).f133892l;
            int i7 = i6 + 1;
            if (i6 == 0) {
                str = str2;
            } else {
                z2 |= !ggw0.m126064f(str, str2);
            }
            iMin = Math.min(iMin, this.f120154e[i][i2][i4] & 24);
            i4++;
            i6 = i7;
        }
        return z2 ? Math.min(iMin, this.f120153d[i]) : iMin;
    }

    /* JADX INFO: renamed from: b */
    public final int m143696b(int i, int i2, int i3) {
        return this.f120154e[i][i2][i3];
    }

    /* JADX INFO: renamed from: c */
    public final int m143697c(int i) {
        return this.f120151b[i];
    }

    /* JADX INFO: renamed from: d */
    public final kty0 m143698d(int i) {
        return this.f120152c[i];
    }

    /* JADX INFO: renamed from: e */
    public final kty0 m143699e() {
        return this.f120155f;
    }
}
