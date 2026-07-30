package com.google.android.gms.internal.measurement;

import org.spongycastle.math.p135ec.Tnaf;
import p153l.aqg0;
import p153l.kfy0;
import p153l.mlk0;
import p153l.zfy0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2382z0 {

    /* JADX INFO: renamed from: a */
    public static final zfy0 f10331a;

    static {
        if (kfy0.m149660w()) {
            kfy0.m149663z();
        }
        f10331a = new C2332a1();
    }

    /* JADX INFO: renamed from: a */
    public static int m14603a(String str) {
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
        mlk0.m158922a("UTF-8 length does not fit in int: ", ((long) i2) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m14604b(String str, byte[] bArr, int i, int i2) {
        return f10331a.mo13863b(str, bArr, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m14605c(byte[] bArr, int i, int i2) {
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
            aqg0.m99478a();
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
    public static String m14606d(byte[] bArr, int i, int i2) throws zzkb {
        return f10331a.mo13864c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14607e(byte[] bArr, int i, int i2) {
        return f10331a.mo13862a(0, bArr, i, i2) == 0;
    }
}
