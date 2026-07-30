package com.google.android.gms.internal.measurement;

import org.spongycastle.math.p131ec.Tnaf;
import p149l.e6y0;
import p149l.gck0;
import p149l.shg0;
import p149l.t6y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2359z0 {

    /* JADX INFO: renamed from: a */
    public static final t6y0 f10294a;

    static {
        if (e6y0.m115150w()) {
            e6y0.m115153z();
        }
        f10294a = new C2309a1();
    }

    /* JADX INFO: renamed from: a */
    public static int m14549a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new zzmt(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        gck0.m125517a("UTF-8 length does not fit in int: ", ((long) i2) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m14550b(String str, byte[] bArr, int i, int i2) {
        return f10294a.mo13809b(str, bArr, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m14551c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            shg0.m184191a();
            return 0;
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << Tnaf.POW_2_WIDTH) ^ ((b3 << 8) ^ b);
    }

    /* JADX INFO: renamed from: d */
    public static String m14552d(byte[] bArr, int i, int i2) throws zzkb {
        return f10294a.mo13810c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14553e(byte[] bArr, int i, int i2) {
        return f10294a.mo13808a(0, bArr, i, i2) == 0;
    }
}
