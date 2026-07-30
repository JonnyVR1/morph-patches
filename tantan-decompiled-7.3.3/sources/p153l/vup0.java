package p153l;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes.dex */
public class vup0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f185831a = m202870e();

    /* JADX INFO: renamed from: b */
    public static uup0 f185832b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f185833c = false;

    /* JADX INFO: renamed from: d */
    public static final byte[] f185834d = m202866a("RIFF");

    /* JADX INFO: renamed from: e */
    public static final byte[] f185835e = m202866a("WEBP");

    /* JADX INFO: renamed from: f */
    public static final byte[] f185836f = m202866a("VP8 ");

    /* JADX INFO: renamed from: g */
    public static final byte[] f185837g = m202866a("VP8L");

    /* JADX INFO: renamed from: h */
    public static final byte[] f185838h = m202866a("VP8X");

    /* JADX INFO: renamed from: a */
    public static byte[] m202866a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            vtq0.m202761a("ASCII not found!", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m202867b(byte[] bArr, int i) {
        return m202875j(bArr, i + 12, f185838h) && ((bArr[i + 20] & 2) == 2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m202868c(byte[] bArr, int i, int i2) {
        return i2 >= 21 && m202875j(bArr, i + 12, f185838h);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m202869d(byte[] bArr, int i) {
        return m202875j(bArr, i + 12, f185838h) && ((bArr[i + 20] & Tnaf.POW_2_WIDTH) == 16);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m202870e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m202871f(byte[] bArr, int i) {
        return m202875j(bArr, i + 12, f185837g);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m202872g(byte[] bArr, int i) {
        return m202875j(bArr, i + 12, f185836f);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m202873h(byte[] bArr, int i, int i2) {
        return i2 >= 20 && m202875j(bArr, i, f185834d) && m202875j(bArr, i + 8, f185835e);
    }

    /* JADX INFO: renamed from: i */
    public static uup0 m202874i() {
        uup0 uup0Var;
        if (f185833c) {
            return f185832b;
        }
        try {
            uup0Var = (uup0) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            uup0Var = null;
        }
        f185833c = true;
        return uup0Var;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m202875j(byte[] bArr, int i, byte[] bArr2) {
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
