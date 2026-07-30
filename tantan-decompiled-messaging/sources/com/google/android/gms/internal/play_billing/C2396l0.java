package com.google.android.gms.internal.play_billing;

import com.tencent.liteav.audio.TXEAudioDef;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.egw0;
import p149l.gck0;
import p149l.kck0;
import p149l.ksx0;
import p149l.shg0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2396l0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10352a = 0;

    static {
        if (ksx0.m147106C() && ksx0.m147107D()) {
            int i = egw0.f91264a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m14863a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b <= -12) {
                return b;
            }
            return -1;
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

    /* JADX INFO: renamed from: b */
    public static int m14864b(String str, byte[] bArr, int i, int i2) {
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
                            throw new zzjs(i6, length);
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
                    throw new zzjs(i6 - 1, length);
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

    /* JADX INFO: renamed from: c */
    public static int m14865c(String str) {
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
                                throw new zzjs(i, length2);
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

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static boolean m14866d(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            int iM14863a = bArr[i];
            if (iM14863a >= 0) {
                i = i3;
            } else if (iM14863a < -32) {
                if (i3 >= i2) {
                    if (iM14863a != 0) {
                        return false;
                    }
                    return true;
                }
                if (iM14863a < -62) {
                    return false;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return false;
                }
            } else if (iM14863a < -16) {
                if (i3 >= i2 - 1) {
                    iM14863a = m14863a(bArr, i3, i2);
                    if (iM14863a != 0) {
                        return false;
                    }
                    return true;
                }
                int i4 = i + 2;
                char c = bArr[i3];
                if (c > -65) {
                    return false;
                }
                if (iM14863a == -32 && c < -96) {
                    return false;
                }
                if (iM14863a == -19 && c >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return false;
                }
            } else {
                if (i3 >= i2 - 2) {
                    iM14863a = m14863a(bArr, i3, i2);
                    if (iM14863a != 0) {
                        return false;
                    }
                    return true;
                }
                int i5 = i + 2;
                int i6 = bArr[i3];
                if (i6 > -65 || (((iM14863a << 28) + (i6 + 112)) >> 30) != 0) {
                    return false;
                }
                int i7 = i + 3;
                if (bArr[i5] > -65) {
                    return false;
                }
                i += 4;
                if (bArr[i7] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
