package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class b13 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public int[] f74317a;

    /* JADX INFO: renamed from: b */
    public int f74318b;

    public b13() {
        this.f74318b = 0;
        this.f74317a = new int[1];
    }

    /* JADX INFO: renamed from: p */
    public static int[] m101392p(int i) {
        return new int[(i + 31) / 32];
    }

    /* JADX INFO: renamed from: a */
    public void m101393a(boolean z) {
        m101397e(this.f74318b + 1);
        if (z) {
            int[] iArr = this.f74317a;
            int i = this.f74318b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f74318b++;
    }

    /* JADX INFO: renamed from: b */
    public void m101394b(b13 b13Var) {
        int i = b13Var.f74318b;
        m101397e(this.f74318b + i);
        for (int i2 = 0; i2 < i; i2++) {
            m101393a(b13Var.m101398f(i2));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m101395c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            wg3.m206174a("Num bits must be between 0 and 32");
            return;
        }
        m101397e(this.f74318b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            m101393a(z);
            i2--;
        }
    }

    public void clear() {
        int length = this.f74317a.length;
        for (int i = 0; i < length; i++) {
            this.f74317a[i] = 0;
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b13 clone() {
        return new b13((int[]) this.f74317a.clone(), this.f74318b);
    }

    /* JADX INFO: renamed from: e */
    public final void m101397e(int i) {
        if (i > (this.f74317a.length << 5)) {
            int[] iArrM101392p = m101392p(i);
            int[] iArr = this.f74317a;
            System.arraycopy(iArr, 0, iArrM101392p, 0, iArr.length);
            this.f74317a = iArrM101392p;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b13)) {
            return false;
        }
        b13 b13Var = (b13) obj;
        return this.f74318b == b13Var.f74318b && Arrays.equals(this.f74317a, b13Var.f74317a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m101398f(int i) {
        return (this.f74317a[i / 32] & (1 << (i & 31))) != 0;
    }

    public int hashCode() {
        return (this.f74318b * 31) + Arrays.hashCode(this.f74317a);
    }

    /* JADX INFO: renamed from: j */
    public int[] m101399j() {
        return this.f74317a;
    }

    /* JADX INFO: renamed from: k */
    public int m101400k(int i) {
        int i2 = this.f74318b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f74317a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f74317a;
            if (i3 == iArr.length) {
                return this.f74318b;
            }
            i4 = iArr[i3];
        }
        int iNumberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f74318b;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: l */
    public int m101401l(int i) {
        int i2 = this.f74318b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f74317a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f74317a;
            if (i3 == iArr.length) {
                return this.f74318b;
            }
            i4 = ~iArr[i3];
        }
        int iNumberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f74318b;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: m */
    public int m101402m() {
        return this.f74318b;
    }

    /* JADX INFO: renamed from: n */
    public int m101403n() {
        return (this.f74318b + 7) / 8;
    }

    /* JADX INFO: renamed from: o */
    public boolean m101404o(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f74318b) {
            fig0.m125680a();
            return false;
        }
        if (i2 == i) {
            return true;
        }
        int i3 = i2 - 1;
        int i4 = i / 32;
        int i5 = i3 / 32;
        int i6 = i4;
        while (i6 <= i5) {
            int i7 = (2 << (i6 >= i5 ? 31 & i3 : 31)) - (1 << (i6 > i4 ? 0 : i & 31));
            int i8 = this.f74317a[i6] & i7;
            if (!z) {
                i7 = 0;
            }
            if (i8 != i7) {
                return false;
            }
            i6++;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m101405q() {
        int[] iArr = new int[this.f74317a.length];
        int i = (this.f74318b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f74317a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f74318b;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i] = i7;
        }
        this.f74317a = iArr;
    }

    /* JADX INFO: renamed from: r */
    public void m101406r(int i) {
        int[] iArr = this.f74317a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: s */
    public void m101407s(int i, int i2) {
        this.f74317a[i / 32] = i2;
    }

    /* JADX INFO: renamed from: t */
    public void m101408t(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (m101398f(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public String toString() {
        int i = this.f74318b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f74318b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m101398f(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m101409u(b13 b13Var) {
        if (this.f74318b != b13Var.f74318b) {
            wg3.m206174a("Sizes don't match");
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f74317a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ b13Var.f74317a[i];
            i++;
        }
    }

    public b13(int i) {
        this.f74318b = i;
        this.f74317a = m101392p(i);
    }

    public b13(int[] iArr, int i) {
        this.f74317a = iArr;
        this.f74318b = i;
    }
}
