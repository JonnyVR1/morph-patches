package p153l;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class p5z0 {

    /* JADX INFO: renamed from: a */
    public final String[] f150709a;

    /* JADX INFO: renamed from: b */
    public final int[] f150710b;

    /* JADX INFO: renamed from: c */
    public final q2z0[] f150711c;

    /* JADX INFO: renamed from: d */
    public final int[] f150712d;

    /* JADX INFO: renamed from: e */
    public final int[][][] f150713e;

    /* JADX INFO: renamed from: f */
    public final q2z0 f150714f;

    @VisibleForTesting
    public p5z0(String[] strArr, int[] iArr, q2z0[] q2z0VarArr, int[] iArr2, int[][][] iArr3, q2z0 q2z0Var) {
        this.f150709a = strArr;
        this.f150710b = iArr;
        this.f150711c = q2z0VarArr;
        this.f150713e = iArr3;
        this.f150712d = iArr2;
        this.f150714f = q2z0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m170701a(int i, int i2, boolean z) {
        int i3 = this.f150711c[i].m175102b(i2).f171820a;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (char c = 0; c <= 0; c = 1) {
            if ((this.f150713e[i][i2][0] & 7) == 4) {
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
            String str2 = this.f150711c[i].m175102b(i2).m189003b(iArrCopyOf[i4]).f170251l;
            int i7 = i6 + 1;
            if (i6 == 0) {
                str = str2;
            } else {
                z2 |= !mpw0.m159408f(str, str2);
            }
            iMin = Math.min(iMin, this.f150713e[i][i2][i4] & 24);
            i4++;
            i6 = i7;
        }
        return z2 ? Math.min(iMin, this.f150712d[i]) : iMin;
    }

    /* JADX INFO: renamed from: b */
    public final int m170702b(int i, int i2, int i3) {
        return this.f150713e[i][i2][i3];
    }

    /* JADX INFO: renamed from: c */
    public final int m170703c(int i) {
        return this.f150710b[i];
    }

    /* JADX INFO: renamed from: d */
    public final q2z0 m170704d(int i) {
        return this.f150711c[i];
    }

    /* JADX INFO: renamed from: e */
    public final q2z0 m170705e() {
        return this.f150714f;
    }
}
