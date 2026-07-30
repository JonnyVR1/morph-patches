package com.google.android.gms.internal.ads;

import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import p153l.aqg0;
import p153l.cgx0;
import p153l.emx0;
import p153l.fmx0;
import p153l.mlk0;
import p153l.qlk0;
import p153l.xlx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2317y5 {

    /* JADX INFO: renamed from: a */
    public static final emx0 f10145a;

    static {
        if (xlx0.m211688a() && xlx0.m211689b()) {
            int i = cgx0.f81747a;
        }
        f10145a = new fmx0();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m13549c(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m13557k(b, bArr[i]);
        }
        if (i3 == 2) {
            return m13558l(b, bArr[i], bArr[i + 1]);
        }
        aqg0.m99478a();
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m13550d(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
                bArr[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 > i3 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                            throw new zzhdd(i6, length);
                        }
                        qlk0.m177004a(cCharAt2, i7);
                        return 0;
                    }
                    int i8 = i6 + 1;
                    if (i8 != str.length()) {
                        char cCharAt3 = str.charAt(i8);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i9 = i7 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i6 = i8;
                        } else {
                            i6 = i8;
                        }
                    }
                    throw new zzhdd(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    /* JADX INFO: renamed from: e */
    public static int m13551e(String str) {
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
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new zzhdd(i, length2);
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

    /* JADX INFO: renamed from: f */
    public static int m13552f(int i, byte[] bArr, int i2, int i3) {
        return f10145a.mo121387a(i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public static String m13553g(ByteBuffer byteBuffer, int i, int i2) throws zzhag {
        emx0 emx0Var = f10145a;
        if (byteBuffer.hasArray()) {
            return emx0Var.mo121388b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return byteBuffer.isDirect() ? emx0.m121386d(byteBuffer, i, i2) : emx0.m121386d(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static String m13554h(byte[] bArr, int i, int i2) throws zzhag {
        return f10145a.mo121388b(bArr, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m13555i(byte[] bArr) {
        return f10145a.m121389c(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m13556j(byte[] bArr, int i, int i2) {
        return f10145a.m121389c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k */
    public static int m13557k(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: l */
    public static int m13558l(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
