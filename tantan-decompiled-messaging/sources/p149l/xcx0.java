package p149l;

import com.google.android.gms.internal.ads.zzhag;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class xcx0 {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m208166a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzhag {
        if (m208172g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m208172g(b3) || m208172g(b4)) {
            throw zzhag.zzd();
        }
        int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
        cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m208167b(byte b, byte b2, byte b3, char[] cArr, int i) throws zzhag {
        if (!m208172g(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!m208172g(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!m208172g(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!m208172g(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!m208172g(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            }
        }
        throw zzhag.zzd();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m208168c(byte b, byte b2, char[] cArr, int i) throws zzhag {
        if (b < -62 || m208172g(b2)) {
            throw zzhag.zzd();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m208169d(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ boolean m208170e(byte b) {
        return b < -16;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ boolean m208171f(byte b) {
        return b < -32;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m208172g(byte b) {
        return b > -65;
    }
}
