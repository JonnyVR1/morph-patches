package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class o03 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final int f141281a;

    /* JADX INFO: renamed from: b */
    public final int f141282b;

    /* JADX INFO: renamed from: c */
    public final int f141283c;

    /* JADX INFO: renamed from: d */
    public final int[] f141284d;

    public o03(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            ig3.m135964a("Both dimensions must be greater than 0");
            throw null;
        }
        this.f141281a = i;
        this.f141282b = i2;
        int i3 = (i + 31) / 32;
        this.f141283c = i3;
        this.f141284d = new int[i3 * i2];
    }

    /* JADX INFO: renamed from: a */
    public final String m162107a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f141282b * (this.f141281a + 1));
        for (int i = 0; i < this.f141282b; i++) {
            for (int i2 = 0; i2 < this.f141281a; i2++) {
                sb.append(m162110d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o03 clone() {
        return new o03(this.f141281a, this.f141282b, this.f141283c, (int[]) this.f141284d.clone());
    }

    /* JADX INFO: renamed from: c */
    public void m162109c(int i, int i2) {
        int i3 = (i2 * this.f141283c) + (i / 32);
        int[] iArr = this.f141284d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public void clear() {
        int length = this.f141284d.length;
        for (int i = 0; i < length; i++) {
            this.f141284d[i] = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m162110d(int i, int i2) {
        return ((this.f141284d[(i2 * this.f141283c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: e */
    public int[] m162111e() {
        int length = this.f141284d.length - 1;
        while (length >= 0 && this.f141284d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f141283c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = this.f141284d[length];
        int i5 = 31;
        while ((i4 >>> i5) == 0) {
            i5--;
        }
        return new int[]{i3 + i5, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o03)) {
            return false;
        }
        o03 o03Var = (o03) obj;
        return this.f141281a == o03Var.f141281a && this.f141282b == o03Var.f141282b && this.f141283c == o03Var.f141283c && Arrays.equals(this.f141284d, o03Var.f141284d);
    }

    /* JADX INFO: renamed from: f */
    public int[] m162112f() {
        int i = this.f141281a;
        int i2 = this.f141282b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f141282b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f141283c;
                if (i6 < i7) {
                    int i8 = this.f141284d[(i7 * i5) + i6];
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
        int i = this.f141281a;
        return (((((((i * 31) + i) * 31) + this.f141282b) * 31) + this.f141283c) * 31) + Arrays.hashCode(this.f141284d);
    }

    /* JADX INFO: renamed from: j */
    public int m162113j() {
        return this.f141282b;
    }

    /* JADX INFO: renamed from: k */
    public m03 m162114k(int i, m03 m03Var) {
        if (m03Var == null || m03Var.m152494m() < this.f141281a) {
            m03Var = new m03(this.f141281a);
        } else {
            m03Var.clear();
        }
        int i2 = i * this.f141283c;
        for (int i3 = 0; i3 < this.f141283c; i3++) {
            m03Var.m152499s(i3 << 5, this.f141284d[i2 + i3]);
        }
        return m03Var;
    }

    /* JADX INFO: renamed from: l */
    public int[] m162115l() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f141284d;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.f141283c;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) << 5;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    /* JADX INFO: renamed from: m */
    public int m162116m() {
        return this.f141281a;
    }

    /* JADX INFO: renamed from: n */
    public void m162117n() {
        int iM162116m = m162116m();
        int iM162113j = m162113j();
        m03 m03Var = new m03(iM162116m);
        m03 m03Var2 = new m03(iM162116m);
        for (int i = 0; i < (iM162113j + 1) / 2; i++) {
            m03Var = m162114k(i, m03Var);
            int i2 = (iM162113j - 1) - i;
            m03Var2 = m162114k(i2, m03Var2);
            m03Var.m152497q();
            m03Var2.m152497q();
            m162120q(i, m03Var2);
            m162120q(i2, m03Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m162118o(int i, int i2) {
        int i3 = (i2 * this.f141283c) + (i / 32);
        int[] iArr = this.f141284d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* JADX INFO: renamed from: p */
    public void m162119p(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            ig3.m135964a("Left and top must be nonnegative");
            return;
        }
        if (i4 <= 0 || i3 <= 0) {
            ig3.m135964a("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f141282b || i5 > this.f141281a) {
            ig3.m135964a("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.f141283c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f141284d;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m162120q(int i, m03 m03Var) {
        int[] iArrM152491j = m03Var.m152491j();
        int[] iArr = this.f141284d;
        int i2 = this.f141283c;
        System.arraycopy(iArrM152491j, 0, iArr, i * i2, i2);
    }

    /* JADX INFO: renamed from: r */
    public String m162121r(String str, String str2) {
        return m162107a(str, str2, SignParameters.NEW_LINE);
    }

    public String toString() {
        return m162121r("X ", "  ");
    }

    public o03(int i) {
        this(i, i);
    }

    public o03(int i, int i2, int i3, int[] iArr) {
        this.f141281a = i;
        this.f141282b = i2;
        this.f141283c = i3;
        this.f141284d = iArr;
    }
}
