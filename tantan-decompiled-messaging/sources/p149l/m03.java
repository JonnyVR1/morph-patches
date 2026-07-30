package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class m03 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public int[] f130706a;

    /* JADX INFO: renamed from: b */
    public int f130707b;

    public m03() {
        this.f130707b = 0;
        this.f130706a = new int[1];
    }

    /* JADX INFO: renamed from: p */
    public static int[] m152484p(int i) {
        return new int[(i + 31) / 32];
    }

    /* JADX INFO: renamed from: a */
    public void m152485a(boolean z) {
        m152489e(this.f130707b + 1);
        if (z) {
            int[] iArr = this.f130706a;
            int i = this.f130707b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f130707b++;
    }

    /* JADX INFO: renamed from: b */
    public void m152486b(m03 m03Var) {
        int i = m03Var.f130707b;
        m152489e(this.f130707b + i);
        for (int i2 = 0; i2 < i; i2++) {
            m152485a(m03Var.m152490f(i2));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m152487c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            ig3.m135964a("Num bits must be between 0 and 32");
            return;
        }
        m152489e(this.f130707b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            m152485a(z);
            i2--;
        }
    }

    public void clear() {
        int length = this.f130706a.length;
        for (int i = 0; i < length; i++) {
            this.f130706a[i] = 0;
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public m03 clone() {
        return new m03((int[]) this.f130706a.clone(), this.f130707b);
    }

    /* JADX INFO: renamed from: e */
    public final void m152489e(int i) {
        if (i > (this.f130706a.length << 5)) {
            int[] iArrM152484p = m152484p(i);
            int[] iArr = this.f130706a;
            System.arraycopy(iArr, 0, iArrM152484p, 0, iArr.length);
            this.f130706a = iArrM152484p;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m03)) {
            return false;
        }
        m03 m03Var = (m03) obj;
        return this.f130707b == m03Var.f130707b && Arrays.equals(this.f130706a, m03Var.f130706a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m152490f(int i) {
        return (this.f130706a[i / 32] & (1 << (i & 31))) != 0;
    }

    public int hashCode() {
        return (this.f130707b * 31) + Arrays.hashCode(this.f130706a);
    }

    /* JADX INFO: renamed from: j */
    public int[] m152491j() {
        return this.f130706a;
    }

    /* JADX INFO: renamed from: k */
    public int m152492k(int i) {
        int i2 = this.f130707b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f130706a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f130706a;
            if (i3 == iArr.length) {
                return this.f130707b;
            }
            i4 = iArr[i3];
        }
        int iNumberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f130707b;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: l */
    public int m152493l(int i) {
        int i2 = this.f130707b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f130706a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f130706a;
            if (i3 == iArr.length) {
                return this.f130707b;
            }
            i4 = ~iArr[i3];
        }
        int iNumberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f130707b;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: m */
    public int m152494m() {
        return this.f130707b;
    }

    /* JADX INFO: renamed from: n */
    public int m152495n() {
        return (this.f130707b + 7) / 8;
    }

    /* JADX INFO: renamed from: o */
    public boolean m152496o(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f130707b) {
            x9g0.m207497a();
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
            int i8 = this.f130706a[i6] & i7;
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
    public void m152497q() {
        int[] iArr = new int[this.f130706a.length];
        int i = (this.f130707b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f130706a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f130707b;
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
        this.f130706a = iArr;
    }

    /* JADX INFO: renamed from: r */
    public void m152498r(int i) {
        int[] iArr = this.f130706a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: s */
    public void m152499s(int i, int i2) {
        this.f130706a[i / 32] = i2;
    }

    /* JADX INFO: renamed from: t */
    public void m152500t(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (m152490f(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public String toString() {
        int i = this.f130707b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f130707b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m152490f(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m152501u(m03 m03Var) {
        if (this.f130707b != m03Var.f130707b) {
            ig3.m135964a("Sizes don't match");
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f130706a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ m03Var.f130706a[i];
            i++;
        }
    }

    public m03(int i) {
        this.f130707b = i;
        this.f130706a = m152484p(i);
    }

    public m03(int[] iArr, int i) {
        this.f130706a = iArr;
        this.f130707b = i;
    }
}
