package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m88121d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "jvm"}, m88122k = 2, m88123mv = {1, 1, 11})
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 >= 128) {
                int length2 = str.length();
                int i3 = i2;
                while (i2 < length2) {
                    char cCharAt3 = str.charAt(i2);
                    if (cCharAt3 < 128) {
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) cCharAt3;
                        i2++;
                        while (i2 < length2 && str.charAt(i2) < 128) {
                            bArr[i4] = (byte) str.charAt(i2);
                            i2++;
                            i4++;
                        }
                        i3 = i4;
                    } else {
                        if (cCharAt3 < 2048) {
                            bArr[i3] = (byte) ((cCharAt3 >> 6) | 192);
                            i3 += 2;
                            bArr[i3 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || 57343 < cCharAt3) {
                            bArr[i3] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i3 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i3 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (cCharAt3 > 56319 || length2 <= (i = i2 + 1) || 56320 > (cCharAt = str.charAt(i)) || 57343 < cCharAt) {
                            bArr[i3] = Utf8.REPLACEMENT_BYTE;
                            i2++;
                            i3++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i)) - 56613888;
                            bArr[i3] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i3 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i3 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i3 += 4;
                            bArr[i3 + 3] = (byte) ((iCharAt & 63) | 128);
                            i2 += 2;
                        }
                        i2++;
                    }
                }
                return Arrays.copyOf(bArr, i3);
            }
            bArr[i2] = (byte) cCharAt2;
            i2++;
        }
        return Arrays.copyOf(bArr, str.length());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[PHI: r6
      0x003d: PHI (r6v32 int) = (r6v4 int), (r6v18 int), (r6v18 int), (r6v20 int), (r6v28 int), (r6v28 int), (r6v33 int), (r6v39 int) binds: [B:88:0x014a, B:57:0x00ca, B:59:0x00d0, B:51:0x00b7, B:33:0x0076, B:35:0x007c, B:25:0x0059, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[PHI: r6
      0x0057: PHI (r6v29 int) = (r6v5 int), (r6v18 int), (r6v18 int), (r6v21 int), (r6v28 int), (r6v37 int), (r6v38 int) binds: [B:87:0x0144, B:61:0x00d4, B:63:0x00da, B:50:0x00b2, B:35:0x007c, B:23:0x0051, B:22:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    public static final String commonToUtf8String(@NotNull byte[] bArr) {
        int i;
        int i2;
        int i3;
        bArr.getClass();
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b = bArr[i4];
            if (b >= 0) {
                int i6 = i5 + 1;
                cArr[i5] = (char) b;
                i4++;
                while (i4 < length) {
                    byte b2 = bArr[i4];
                    if (b2 < 0) {
                        break;
                    }
                    i4++;
                    cArr[i6] = (char) b2;
                    i6++;
                }
                i5 = i6;
            } else {
                if ((b >> 5) == -2) {
                    int i7 = i4 + 1;
                    if (length <= i7) {
                        i = i5 + 1;
                        cArr[i5] = 65533;
                    } else {
                        byte b3 = bArr[i7];
                        if ((b3 & 192) == 128) {
                            int i8 = (b << 6) ^ (b3 ^ 3968);
                            if (i8 < 128) {
                                i = i5 + 1;
                                cArr[i5] = 65533;
                            } else {
                                cArr[i5] = (char) i8;
                                i = i5 + 1;
                            }
                            i3 = 2;
                            i4 += i3;
                        } else {
                            i = i5 + 1;
                            cArr[i5] = 65533;
                        }
                    }
                    i3 = 1;
                    i4 += i3;
                } else if ((b >> 4) == -2) {
                    int i9 = i4 + 2;
                    if (length <= i9) {
                        i = i5 + 1;
                        cArr[i5] = 65533;
                        int i10 = i4 + 1;
                        if (length <= i10 || (bArr[i10] & 192) != 128) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    } else {
                        byte b4 = bArr[i4 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i9];
                            if ((b5 & 192) == 128) {
                                int i11 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i11 < 2048) {
                                    i = i5 + 1;
                                    cArr[i5] = 65533;
                                } else if (55296 <= i11 && 57343 >= i11) {
                                    i = i5 + 1;
                                    cArr[i5] = 65533;
                                } else {
                                    cArr[i5] = (char) i11;
                                    i = i5 + 1;
                                }
                                i3 = 3;
                            } else {
                                i = i5 + 1;
                                cArr[i5] = 65533;
                                i3 = 2;
                            }
                        } else {
                            i = i5 + 1;
                            cArr[i5] = 65533;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else if ((b >> 3) == -2) {
                    int i12 = i4 + 3;
                    if (length <= i12) {
                        i = i5 + 1;
                        cArr[i5] = 65533;
                        int i13 = i4 + 1;
                        if (length <= i13 || (bArr[i13] & 192) != 128) {
                            i3 = 1;
                        } else {
                            int i14 = i4 + 2;
                            if (length <= i14 || (bArr[i14] & 192) != 128) {
                                i3 = 2;
                            } else {
                                i3 = 3;
                            }
                        }
                    } else {
                        byte b6 = bArr[i4 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i4 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i12];
                                if ((b8 & 192) == 128) {
                                    int i15 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i15 > 1114111) {
                                        i = i5 + 1;
                                        cArr[i5] = 65533;
                                    } else if ((55296 <= i15 && 57343 >= i15) || i15 < 65536) {
                                        i = i5 + 1;
                                        cArr[i5] = 65533;
                                    } else {
                                        if (i15 != 65533) {
                                            cArr[i5] = (char) ((i15 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                            i2 = i5 + 2;
                                            cArr[i5 + 1] = (char) ((i15 & 1023) + 56320);
                                        } else {
                                            cArr[i5] = 65533;
                                            i2 = i5 + 1;
                                        }
                                        i = i2;
                                    }
                                    i3 = 4;
                                } else {
                                    i = i5 + 1;
                                    cArr[i5] = 65533;
                                    i3 = 3;
                                }
                            } else {
                                i = i5 + 1;
                                cArr[i5] = 65533;
                                i3 = 2;
                            }
                        } else {
                            i = i5 + 1;
                            cArr[i5] = 65533;
                            i3 = 1;
                        }
                    }
                    i4 += i3;
                } else {
                    i = i5 + 1;
                    cArr[i5] = 65533;
                    i4++;
                }
                i5 = i;
            }
        }
        return new String(cArr, 0, i5);
    }
}
