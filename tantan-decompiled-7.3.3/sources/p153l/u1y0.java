package p153l;

import com.google.android.gms.internal.play_billing.zzhr;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class u1y0 {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m194114a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzhr {
        if (m194118e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m194118e(b3) || m194118e(b4)) {
            nrw0.m164535a("Protocol message had invalid UTF-8.");
            return;
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
    public static /* bridge */ /* synthetic */ void m194115b(byte b, byte b2, byte b3, char[] cArr, int i) throws zzhr {
        if (!m194118e(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!m194118e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!m194118e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!m194118e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!m194118e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
                }
            }
        }
        nrw0.m164535a("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m194116c(byte b, byte b2, char[] cArr, int i) throws zzhr {
        if (b < -62 || m194118e(b2)) {
            nrw0.m164535a("Protocol message had invalid UTF-8.");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m194117d(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m194118e(byte b) {
        return b > -65;
    }
}
