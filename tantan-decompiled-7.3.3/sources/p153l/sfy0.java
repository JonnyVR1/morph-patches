package p153l;

import com.google.android.gms.internal.measurement.zzkb;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class sfy0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m185679a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkb {
        if (m185683e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m185683e(b3) || m185683e(b4)) {
            throw zzkb.zzd();
        }
        int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
        cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m185680b(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkb {
        if (m185683e(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m185683e(b3)))) {
            throw zzkb.zzd();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m185681c(byte b, byte b2, char[] cArr, int i) throws zzkb {
        if (b < -62 || m185683e(b2)) {
            throw zzkb.zzd();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m185682d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m185683e(byte b) {
        return b > -65;
    }
}
