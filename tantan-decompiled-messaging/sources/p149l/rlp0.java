package p149l;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes.dex */
public class rlp0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f159987a = m179871e();

    /* JADX INFO: renamed from: b */
    public static qlp0 f159988b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f159989c = false;

    /* JADX INFO: renamed from: d */
    public static final byte[] f159990d = m179867a("RIFF");

    /* JADX INFO: renamed from: e */
    public static final byte[] f159991e = m179867a("WEBP");

    /* JADX INFO: renamed from: f */
    public static final byte[] f159992f = m179867a("VP8 ");

    /* JADX INFO: renamed from: g */
    public static final byte[] f159993g = m179867a("VP8L");

    /* JADX INFO: renamed from: h */
    public static final byte[] f159994h = m179867a("VP8X");

    /* JADX INFO: renamed from: a */
    public static byte[] m179867a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("ASCII not found!", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m179868b(byte[] bArr, int i) {
        return m179876j(bArr, i + 12, f159994h) && ((bArr[i + 20] & 2) == 2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m179869c(byte[] bArr, int i, int i2) {
        return i2 >= 21 && m179876j(bArr, i + 12, f159994h);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m179870d(byte[] bArr, int i) {
        return m179876j(bArr, i + 12, f159994h) && ((bArr[i + 20] & Tnaf.POW_2_WIDTH) == 16);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m179871e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m179872f(byte[] bArr, int i) {
        return m179876j(bArr, i + 12, f159993g);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m179873g(byte[] bArr, int i) {
        return m179876j(bArr, i + 12, f159992f);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m179874h(byte[] bArr, int i, int i2) {
        return i2 >= 20 && m179876j(bArr, i, f159990d) && m179876j(bArr, i + 8, f159991e);
    }

    /* JADX INFO: renamed from: i */
    public static qlp0 m179875i() {
        qlp0 qlp0Var;
        if (f159989c) {
            return f159988b;
        }
        try {
            qlp0Var = (qlp0) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            qlp0Var = null;
        }
        f159989c = true;
        return qlp0Var;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m179876j(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
