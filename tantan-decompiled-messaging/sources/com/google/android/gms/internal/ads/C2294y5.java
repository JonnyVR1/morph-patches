package com.google.android.gms.internal.ads;

import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import p149l.gck0;
import p149l.kck0;
import p149l.rcx0;
import p149l.shg0;
import p149l.w6x0;
import p149l.ycx0;
import p149l.zcx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2294y5 {

    /* JADX INFO: renamed from: a */
    public static final ycx0 f10108a;

    static {
        if (rcx0.m178823a() && rcx0.m178824b()) {
            int i = w6x0.f185008a;
        }
        f10108a = new zcx0();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m13495c(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m13503k(b, bArr[i]);
        }
        if (i3 == 2) {
            return m13504l(b, bArr[i], bArr[i + 1]);
        }
        shg0.m184191a();
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m13496d(String str, byte[] bArr, int i, int i2) {
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
                        kck0.m145443a(cCharAt2, i7);
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
    public static int m13497e(String str) {
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
        gck0.m125517a("UTF-8 length does not fit in int: ", ((long) i2) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m13498f(int i, byte[] bArr, int i2, int i3) {
        return f10108a.mo214210a(i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public static String m13499g(ByteBuffer byteBuffer, int i, int i2) throws zzhag {
        ycx0 ycx0Var = f10108a;
        if (byteBuffer.hasArray()) {
            return ycx0Var.mo214211b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return byteBuffer.isDirect() ? ycx0.m214209d(byteBuffer, i, i2) : ycx0.m214209d(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static String m13500h(byte[] bArr, int i, int i2) throws zzhag {
        return f10108a.mo214211b(bArr, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m13501i(byte[] bArr) {
        return f10108a.m214212c(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m13502j(byte[] bArr, int i, int i2) {
        return f10108a.m214212c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k */
    public static int m13503k(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: l */
    public static int m13504l(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
