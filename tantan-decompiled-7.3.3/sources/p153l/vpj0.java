package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vpj0 extends sp50 {

    /* JADX INFO: renamed from: d */
    public static final int[] f185259d = {1, 1, 1};

    /* JADX INFO: renamed from: e */
    public static final int[] f185260e = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f */
    public static final int[] f185261f = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g */
    public static final int[][] f185262g;

    /* JADX INFO: renamed from: h */
    public static final int[][] f185263h;

    /* JADX INFO: renamed from: a */
    public final StringBuilder f185264a = new StringBuilder(20);

    /* JADX INFO: renamed from: b */
    public final upj0 f185265b = new upj0();

    /* JADX INFO: renamed from: c */
    public final tje f185266c = new tje();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f185262g = iArr;
        int[][] iArr2 = new int[20][];
        f185263h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f185262g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f185263h[i] = iArr4;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m202255h(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m202260q(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* JADX INFO: renamed from: i */
    public static int m202256i(b13 b13Var, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        sp50.m187325e(b13Var, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fM187324d = sp50.m187324d(iArr, iArr2[i3], 0.7f);
            if (fM187324d < f) {
                i2 = i3;
                f = fM187324d;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: m */
    public static int[] m202257m(b13 b13Var, int i, boolean z, int[] iArr) throws NotFoundException {
        return m202258n(b13Var, i, z, iArr, new int[iArr.length]);
    }

    /* JADX INFO: renamed from: n */
    public static int[] m202258n(b13 b13Var, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int iM101402m = b13Var.m101402m();
        int iM101401l = z ? b13Var.m101401l(i) : b13Var.m101400k(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = iM101401l;
        while (iM101401l < iM101402m) {
            if (b13Var.m101398f(iM101401l) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (sp50.m187324d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, iM101401l};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            iM101401l++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: o */
    public static int[] m202259o(b13 b13Var) throws NotFoundException {
        int[] iArr = new int[f185259d.length];
        int[] iArrM202258n = null;
        boolean zM101404o = false;
        int i = 0;
        while (!zM101404o) {
            int[] iArr2 = f185259d;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrM202258n = m202258n(b13Var, i, false, iArr2, iArr);
            int i2 = iArrM202258n[0];
            int i3 = iArrM202258n[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                zM101404o = b13Var.m101404o(i4, i2, false);
            }
            i = i3;
        }
        return iArrM202258n;
    }

    /* JADX INFO: renamed from: q */
    public static int m202260q(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }

    @Override // p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return mo177456l(i, b13Var, m202259o(b13Var), map);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo202261g(String str) throws FormatException {
        return m202255h(str);
    }

    /* JADX INFO: renamed from: j */
    public int[] mo202262j(b13 b13Var, int i) throws NotFoundException {
        return m202257m(b13Var, i, false, f185259d);
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo172489k(b13 b13Var, int[] iArr, StringBuilder sb) throws NotFoundException;

    /* JADX INFO: renamed from: l */
    public r5d0 mo177456l(int i, b13 b13Var, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strM191427c;
        t5d0 t5d0Var = map == null ? null : (t5d0) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        int i2 = 0;
        if (t5d0Var != null) {
            t5d0Var.mo189379a(new s5d0((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f185264a;
        sb.setLength(0);
        int iMo172489k = mo172489k(b13Var, iArr, sb);
        if (t5d0Var != null) {
            t5d0Var.mo189379a(new s5d0(iMo172489k, i));
        }
        int[] iArrMo202262j = mo202262j(b13Var, iMo172489k);
        if (t5d0Var != null) {
            t5d0Var.mo189379a(new s5d0((iArrMo202262j[0] + iArrMo202262j[1]) / 2.0f, i));
        }
        int i3 = iArrMo202262j[1];
        int i4 = (i3 - iArrMo202262j[0]) + i3;
        if (i4 >= b13Var.m101402m() || !b13Var.m101404o(i3, i4, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!mo202261g(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f = (iArr[1] + iArr[0]) / 2.0f;
        float f2 = (iArrMo202262j[1] + iArrMo202262j[0]) / 2.0f;
        BarcodeFormat barcodeFormatMo172490p = mo172490p();
        float f3 = i;
        r5d0 r5d0Var = new r5d0(string, null, new s5d0[]{new s5d0(f, f3), new s5d0(f2, f3)}, barcodeFormatMo172490p);
        try {
            r5d0 r5d0VarM197096a = this.f185265b.m197096a(i, b13Var, iArrMo202262j[1]);
            r5d0Var.m179859h(ResultMetadataType.UPC_EAN_EXTENSION, r5d0VarM197096a.m179857f());
            r5d0Var.m179858g(r5d0VarM197096a.m179855d());
            r5d0Var.m179852a(r5d0VarM197096a.m179856e());
            length = r5d0VarM197096a.m179857f().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            while (true) {
                if (i2 >= length2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (length == iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        if ((barcodeFormatMo172490p == BarcodeFormat.EAN_13 || barcodeFormatMo172490p == BarcodeFormat.UPC_A) && (strM191427c = this.f185266c.m191427c(string)) != null) {
            r5d0Var.m179859h(ResultMetadataType.POSSIBLE_COUNTRY, strM191427c);
        }
        return r5d0Var;
    }

    /* JADX INFO: renamed from: p */
    public abstract BarcodeFormat mo172490p();
}
