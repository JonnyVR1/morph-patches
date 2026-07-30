package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class d13 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final int f84633a;

    /* JADX INFO: renamed from: b */
    public final int f84634b;

    /* JADX INFO: renamed from: c */
    public final int f84635c;

    /* JADX INFO: renamed from: d */
    public final int[] f84636d;

    public d13(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            wg3.m206174a("Both dimensions must be greater than 0");
            throw null;
        }
        this.f84633a = i;
        this.f84634b = i2;
        int i3 = (i + 31) / 32;
        this.f84635c = i3;
        this.f84636d = new int[i3 * i2];
    }

    /* JADX INFO: renamed from: a */
    public final String m113477a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f84634b * (this.f84633a + 1));
        for (int i = 0; i < this.f84634b; i++) {
            for (int i2 = 0; i2 < this.f84633a; i2++) {
                sb.append(m113480d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d13 clone() {
        return new d13(this.f84633a, this.f84634b, this.f84635c, (int[]) this.f84636d.clone());
    }

    /* JADX INFO: renamed from: c */
    public void m113479c(int i, int i2) {
        int i3 = (i2 * this.f84635c) + (i / 32);
        int[] iArr = this.f84636d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public void clear() {
        int length = this.f84636d.length;
        for (int i = 0; i < length; i++) {
            this.f84636d[i] = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m113480d(int i, int i2) {
        return ((this.f84636d[(i2 * this.f84635c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: e */
    public int[] m113481e() {
        int length = this.f84636d.length - 1;
        while (length >= 0 && this.f84636d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f84635c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = this.f84636d[length];
        int i5 = 31;
        while ((i4 >>> i5) == 0) {
            i5--;
        }
        return new int[]{i3 + i5, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d13)) {
            return false;
        }
        d13 d13Var = (d13) obj;
        return this.f84633a == d13Var.f84633a && this.f84634b == d13Var.f84634b && this.f84635c == d13Var.f84635c && Arrays.equals(this.f84636d, d13Var.f84636d);
    }

    /* JADX INFO: renamed from: f */
    public int[] m113482f() {
        int i = this.f84633a;
        int i2 = this.f84634b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f84634b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f84635c;
                if (i6 < i7) {
                    int i8 = this.f84636d[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int hashCode() {
        int i = this.f84633a;
        return (((((((i * 31) + i) * 31) + this.f84634b) * 31) + this.f84635c) * 31) + Arrays.hashCode(this.f84636d);
    }

    /* JADX INFO: renamed from: j */
    public int m113483j() {
        return this.f84634b;
    }

    /* JADX INFO: renamed from: k */
    public b13 m113484k(int i, b13 b13Var) {
        if (b13Var == null || b13Var.m101402m() < this.f84633a) {
            b13Var = new b13(this.f84633a);
        } else {
            b13Var.clear();
        }
        int i2 = i * this.f84635c;
        for (int i3 = 0; i3 < this.f84635c; i3++) {
            b13Var.m101407s(i3 << 5, this.f84636d[i2 + i3]);
        }
        return b13Var;
    }

    /* JADX INFO: renamed from: l */
    public int[] m113485l() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f84636d;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.f84635c;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) << 5;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    /* JADX INFO: renamed from: m */
    public int m113486m() {
        return this.f84633a;
    }

    /* JADX INFO: renamed from: n */
    public void m113487n() {
        int iM113486m = m113486m();
        int iM113483j = m113483j();
        b13 b13Var = new b13(iM113486m);
        b13 b13Var2 = new b13(iM113486m);
        for (int i = 0; i < (iM113483j + 1) / 2; i++) {
            b13Var = m113484k(i, b13Var);
            int i2 = (iM113483j - 1) - i;
            b13Var2 = m113484k(i2, b13Var2);
            b13Var.m101405q();
            b13Var2.m101405q();
            m113490q(i, b13Var2);
            m113490q(i2, b13Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m113488o(int i, int i2) {
        int i3 = (i2 * this.f84635c) + (i / 32);
        int[] iArr = this.f84636d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* JADX INFO: renamed from: p */
    public void m113489p(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            wg3.m206174a("Left and top must be nonnegative");
            return;
        }
        if (i4 <= 0 || i3 <= 0) {
            wg3.m206174a("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f84634b || i5 > this.f84633a) {
            wg3.m206174a("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.f84635c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f84636d;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m113490q(int i, b13 b13Var) {
        int[] iArrM101399j = b13Var.m101399j();
        int[] iArr = this.f84636d;
        int i2 = this.f84635c;
        System.arraycopy(iArrM101399j, 0, iArr, i * i2, i2);
    }

    /* JADX INFO: renamed from: r */
    public String m113491r(String str, String str2) {
        return m113477a(str, str2, SignParameters.NEW_LINE);
    }

    public String toString() {
        return m113491r("X ", "  ");
    }

    public d13(int i) {
        this(i, i);
    }

    public d13(int i, int i2, int i3, int[] iArr) {
        this.f84633a = i;
        this.f84634b = i2;
        this.f84635c = i3;
        this.f84636d = iArr;
    }
}
