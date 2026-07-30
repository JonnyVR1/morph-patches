package p149l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class bb5 extends mh50 {

    /* JADX INFO: renamed from: d */
    public static final char[] f74779d = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: e */
    public static final int[] f74780e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: f */
    public static final char[] f74781f = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a */
    public final StringBuilder f74782a = new StringBuilder(20);

    /* JADX INFO: renamed from: b */
    public int[] f74783b = new int[80];

    /* JADX INFO: renamed from: c */
    public int f74784c = 0;

    /* JADX INFO: renamed from: g */
    public static boolean m100947g(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i2;
        StringBuilder sb;
        Arrays.fill(this.f74783b, 0);
        m100950j(m03Var);
        int iM100949i = m100949i();
        this.f74782a.setLength(0);
        int i3 = iM100949i;
        while (true) {
            int iM100951k = m100951k(i3);
            if (iM100951k == -1) {
                throw NotFoundException.getNotFoundInstance();
            }
            this.f74782a.append((char) iM100951k);
            i2 = i3 + 8;
            if ((this.f74782a.length() > 1 && m100947g(f74781f, f74779d[iM100951k])) || i2 >= this.f74784c) {
                break;
            }
            i3 = i2;
        }
        int i4 = i3 + 7;
        int i5 = this.f74783b[i4];
        int i6 = 0;
        for (int i7 = -8; i7 < -1; i7++) {
            i6 += this.f74783b[i2 + i7];
        }
        if (i2 < this.f74784c && i5 < i6 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        m100952l(iM100949i);
        int i8 = 0;
        while (true) {
            int length = this.f74782a.length();
            sb = this.f74782a;
            if (i8 >= length) {
                break;
            }
            sb.setCharAt(i8, f74779d[sb.charAt(i8)]);
            i8++;
        }
        char cCharAt = sb.charAt(0);
        char[] cArr = f74781f;
        if (!m100947g(cArr, cCharAt)) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = this.f74782a;
        if (!m100947g(cArr, sb2.charAt(sb2.length() - 1))) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (this.f74782a.length() <= 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
            StringBuilder sb3 = this.f74782a;
            sb3.deleteCharAt(sb3.length() - 1);
            this.f74782a.deleteCharAt(0);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < iM100949i; i10++) {
            i9 += this.f74783b[i10];
        }
        float f = i9;
        while (iM100949i < i4) {
            i9 += this.f74783b[iM100949i];
            iM100949i++;
        }
        float f2 = i;
        return new oxc0(this.f74782a.toString(), null, new pxc0[]{new pxc0(f, f2), new pxc0(i9, f2)}, BarcodeFormat.CODABAR);
    }

    /* JADX INFO: renamed from: h */
    public final void m100948h(int i) {
        int[] iArr = this.f74783b;
        int i2 = this.f74784c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f74784c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f74783b = iArr2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m100949i() throws NotFoundException {
        for (int i = 1; i < this.f74784c; i += 2) {
            int iM100951k = m100951k(i);
            if (iM100951k != -1 && m100947g(f74781f, f74779d[iM100951k])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f74783b[i3];
                }
                if (i == 1 || this.f74783b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: j */
    public final void m100950j(m03 m03Var) throws NotFoundException {
        int i = 0;
        this.f74784c = 0;
        int iM152493l = m03Var.m152493l(0);
        int iM152494m = m03Var.m152494m();
        if (iM152493l >= iM152494m) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = true;
        while (iM152493l < iM152494m) {
            if (m03Var.m152490f(iM152493l) != z) {
                i++;
            } else {
                m100948h(i);
                z = !z;
                i = 1;
            }
            iM152493l++;
        }
        m100948h(i);
    }

    /* JADX INFO: renamed from: k */
    public final int m100951k(int i) {
        int i2 = i + 7;
        if (i2 >= this.f74784c) {
            return -1;
        }
        int[] iArr = this.f74783b;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f74780e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m100952l(int i) throws NotFoundException {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.f74782a.length() - 1;
        int i2 = i;
        int i3 = 0;
        while (true) {
            int i4 = f74780e[this.f74782a.charAt(i3)];
            for (int i5 = 6; i5 >= 0; i5--) {
                int i6 = (i5 & 1) + ((i4 & 1) << 1);
                iArr[i6] = iArr[i6] + this.f74783b[i2 + i5];
                iArr2[i6] = iArr2[i6] + 1;
                i4 >>= 1;
            }
            if (i3 >= length) {
                break;
            }
            i2 += 8;
            i3++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i7 = 0; i7 < 2; i7++) {
            fArr2[i7] = 0.0f;
            int i8 = i7 + 2;
            float f = iArr[i7] / iArr2[i7];
            int i9 = iArr[i8];
            int i10 = iArr2[i8];
            float f2 = (f + (i9 / i10)) / 2.0f;
            fArr2[i8] = f2;
            fArr[i7] = f2;
            fArr[i8] = ((i9 * 2.0f) + 1.5f) / i10;
        }
        int i11 = i;
        int i12 = 0;
        loop3: while (true) {
            int i13 = f74780e[this.f74782a.charAt(i12)];
            for (int i14 = 6; i14 >= 0; i14--) {
                int i15 = (i14 & 1) + ((i13 & 1) << 1);
                float f3 = this.f74783b[i11 + i14];
                if (f3 < fArr2[i15] || f3 > fArr[i15]) {
                    break loop3;
                }
                i13 >>= 1;
            }
            if (i12 >= length) {
                return;
            }
            i11 += 8;
            i12++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
