package p149l;

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
public abstract class sgj0 extends mh50 {

    /* JADX INFO: renamed from: d */
    public static final int[] f164437d = {1, 1, 1};

    /* JADX INFO: renamed from: e */
    public static final int[] f164438e = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f */
    public static final int[] f164439f = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g */
    public static final int[][] f164440g;

    /* JADX INFO: renamed from: h */
    public static final int[][] f164441h;

    /* JADX INFO: renamed from: a */
    public final StringBuilder f164442a = new StringBuilder(20);

    /* JADX INFO: renamed from: b */
    public final rgj0 f164443b = new rgj0();

    /* JADX INFO: renamed from: c */
    public final pie f164444c = new pie();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f164440g = iArr;
        int[][] iArr2 = new int[20][];
        f164441h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f164440g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f164441h[i] = iArr4;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m184102h(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m184107q(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* JADX INFO: renamed from: i */
    public static int m184103i(m03 m03Var, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        mh50.m154610e(m03Var, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fM154609d = mh50.m154609d(iArr, iArr2[i3], 0.7f);
            if (fM154609d < f) {
                i2 = i3;
                f = fM154609d;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: m */
    public static int[] m184104m(m03 m03Var, int i, boolean z, int[] iArr) throws NotFoundException {
        return m184105n(m03Var, i, z, iArr, new int[iArr.length]);
    }

    /* JADX INFO: renamed from: n */
    public static int[] m184105n(m03 m03Var, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int iM152494m = m03Var.m152494m();
        int iM152493l = z ? m03Var.m152493l(i) : m03Var.m152492k(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = iM152493l;
        while (iM152493l < iM152494m) {
            if (m03Var.m152490f(iM152493l) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (mh50.m154609d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, iM152493l};
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
            iM152493l++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: o */
    public static int[] m184106o(m03 m03Var) throws NotFoundException {
        int[] iArr = new int[f164437d.length];
        int[] iArrM184105n = null;
        boolean zM152496o = false;
        int i = 0;
        while (!zM152496o) {
            int[] iArr2 = f164437d;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrM184105n = m184105n(m03Var, i, false, iArr2, iArr);
            int i2 = iArrM184105n[0];
            int i3 = iArrM184105n[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                zM152496o = m03Var.m152496o(i4, i2, false);
            }
            i = i3;
        }
        return iArrM184105n;
    }

    /* JADX INFO: renamed from: q */
    public static int m184107q(CharSequence charSequence) throws FormatException {
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

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return mo159336l(i, m03Var, m184106o(m03Var), map);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo184108g(String str) throws FormatException {
        return m184102h(str);
    }

    /* JADX INFO: renamed from: j */
    public int[] mo184109j(m03 m03Var, int i) throws NotFoundException {
        return m184104m(m03Var, i, false, f164437d);
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo149888k(m03 m03Var, int[] iArr, StringBuilder sb) throws NotFoundException;

    /* JADX INFO: renamed from: l */
    public oxc0 mo159336l(int i, m03 m03Var, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strM169598c;
        qxc0 qxc0Var = map == null ? null : (qxc0) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        int i2 = 0;
        if (qxc0Var != null) {
            qxc0Var.mo176992a(new pxc0((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f164442a;
        sb.setLength(0);
        int iMo149888k = mo149888k(m03Var, iArr, sb);
        if (qxc0Var != null) {
            qxc0Var.mo176992a(new pxc0(iMo149888k, i));
        }
        int[] iArrMo184109j = mo184109j(m03Var, iMo149888k);
        if (qxc0Var != null) {
            qxc0Var.mo176992a(new pxc0((iArrMo184109j[0] + iArrMo184109j[1]) / 2.0f, i));
        }
        int i3 = iArrMo184109j[1];
        int i4 = (i3 - iArrMo184109j[0]) + i3;
        if (i4 >= m03Var.m152494m() || !m03Var.m152496o(i3, i4, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!mo184108g(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f = (iArr[1] + iArr[0]) / 2.0f;
        float f2 = (iArrMo184109j[1] + iArrMo184109j[0]) / 2.0f;
        BarcodeFormat barcodeFormatMo149889p = mo149889p();
        float f3 = i;
        oxc0 oxc0Var = new oxc0(string, null, new pxc0[]{new pxc0(f, f3), new pxc0(f2, f3)}, barcodeFormatMo149889p);
        try {
            oxc0 oxc0VarM179169a = this.f164443b.m179169a(i, m03Var, iArrMo184109j[1]);
            oxc0Var.m166534h(ResultMetadataType.UPC_EAN_EXTENSION, oxc0VarM179169a.m166532f());
            oxc0Var.m166533g(oxc0VarM179169a.m166530d());
            oxc0Var.m166527a(oxc0VarM179169a.m166531e());
            length = oxc0VarM179169a.m166532f().length();
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
        if ((barcodeFormatMo149889p == BarcodeFormat.EAN_13 || barcodeFormatMo149889p == BarcodeFormat.UPC_A) && (strM169598c = this.f164444c.m169598c(string)) != null) {
            oxc0Var.m166534h(ResultMetadataType.POSSIBLE_COUNTRY, strM169598c);
        }
        return oxc0Var;
    }

    /* JADX INFO: renamed from: p */
    public abstract BarcodeFormat mo149889p();
}
