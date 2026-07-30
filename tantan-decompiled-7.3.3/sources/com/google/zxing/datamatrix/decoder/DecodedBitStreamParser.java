package com.google.zxing.datamatrix.decoder;

import com.clevertap.android.sdk.Constants;
import com.google.zxing.FormatException;
import com.momo.momortc.MMConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import p153l.h13;
import p153l.mid;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: b */
    public static final char[] f11693b;

    /* JADX INFO: renamed from: d */
    public static final char[] f11695d;

    /* JADX INFO: renamed from: a */
    public static final char[] f11692a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};

    /* JADX INFO: renamed from: c */
    public static final char[] f11694c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z'};

    /* JADX INFO: renamed from: e */
    public static final char[] f11696e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, '{', '|', '}', '~', 127};

    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$a */
    public static /* synthetic */ class C3447a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11697a;

        static {
            int[] iArr = new int[Mode.values().length];
            f11697a = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11697a[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11697a[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11697a[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11697a[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f11693b = cArr;
        f11695d = cArr;
    }

    /* JADX INFO: renamed from: a */
    public static mid m17379a(byte[] bArr) throws FormatException {
        h13 h13Var = new h13(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        Mode modeM17381c = Mode.ASCII_ENCODE;
        do {
            Mode mode = Mode.ASCII_ENCODE;
            if (modeM17381c == mode) {
                modeM17381c = m17381c(h13Var, sb, sb2);
            } else {
                int i = C3447a.f11697a[modeM17381c.ordinal()];
                if (i == 1) {
                    m17383e(h13Var, sb);
                } else if (i == 2) {
                    m17385g(h13Var, sb);
                } else if (i == 3) {
                    m17380b(h13Var, sb);
                } else if (i == 4) {
                    m17384f(h13Var, sb);
                } else {
                    if (i != 5) {
                        throw FormatException.getFormatInstance();
                    }
                    m17382d(h13Var, sb, arrayList);
                }
                modeM17381c = mode;
            }
            if (modeM17381c == Mode.PAD_ENCODE) {
                break;
            }
        } while (h13Var.m133269a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String string = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new mid(bArr, string, arrayList, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m17380b(h13 h13Var, StringBuilder sb) throws FormatException {
        int iM133272d;
        int[] iArr = new int[3];
        while (h13Var.m133269a() != 8 && (iM133272d = h13Var.m133272d(8)) != 254) {
            m17386h(iM133272d, h13Var.m133272d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append('\r');
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append('>');
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else {
                    if (i2 >= 40) {
                        throw FormatException.getFormatInstance();
                    }
                    sb.append((char) (i2 + 51));
                }
            }
            if (h13Var.m133269a() <= 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Mode m17381c(h13 h13Var, StringBuilder sb, StringBuilder sb2) throws FormatException {
        boolean z = false;
        do {
            int iM133272d = h13Var.m133272d(8);
            if (iM133272d == 0) {
                throw FormatException.getFormatInstance();
            }
            if (iM133272d > 128) {
                if (iM133272d != 129) {
                    if (iM133272d > 229) {
                        switch (iM133272d) {
                            case 230:
                                return Mode.C40_ENCODE;
                            case 231:
                                return Mode.BASE256_ENCODE;
                            case 232:
                                sb.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z = true;
                                break;
                            case 236:
                                sb.append("[)>\u001e05\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb.append("[)>\u001e06\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return Mode.ANSIX12_ENCODE;
                            case 239:
                                return Mode.TEXT_ENCODE;
                            case 240:
                                return Mode.EDIFACT_ENCODE;
                            default:
                                if (iM133272d != 254 || h13Var.m133269a() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    } else {
                        int i = iM133272d - 130;
                        if (i < 10) {
                            sb.append('0');
                        }
                        sb.append(i);
                    }
                } else {
                    return Mode.PAD_ENCODE;
                }
            } else {
                if (z) {
                    iM133272d += 128;
                }
                sb.append((char) (iM133272d - 1));
                return Mode.ASCII_ENCODE;
            }
        } while (h13Var.m133269a() > 0);
        return Mode.ASCII_ENCODE;
    }

    /* JADX INFO: renamed from: d */
    public static void m17382d(h13 h13Var, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int iM133271c = h13Var.m133271c();
        int i = iM133271c + 2;
        int iM17387i = m17387i(h13Var.m133272d(8), iM133271c + 1);
        if (iM17387i == 0) {
            iM17387i = h13Var.m133269a() / 8;
        } else if (iM17387i >= 250) {
            iM17387i = ((iM17387i - 249) * 250) + m17387i(h13Var.m133272d(8), i);
            i = iM133271c + 3;
        }
        if (iM17387i < 0) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[iM17387i];
        int i2 = 0;
        while (i2 < iM17387i) {
            if (h13Var.m133269a() < 8) {
                throw FormatException.getFormatInstance();
            }
            bArr[i2] = (byte) m17387i(h13Var.m133272d(8), i);
            i2++;
            i++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e) {
            wtq0.m207906a("Platform does not support required encoding: ".concat(String.valueOf(e)));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17383e(h13 h13Var, StringBuilder sb) throws FormatException {
        int iM133272d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (h13Var.m133269a() != 8 && (iM133272d = h13Var.m133272d(8)) != 254) {
            m17386h(iM133272d, h13Var.m133272d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f11693b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append((char) 29);
                            } else {
                                if (i3 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z = true;
                            }
                        } else {
                            if (i != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            if (z) {
                                sb.append((char) (i3 + 224));
                                z = false;
                            } else {
                                sb.append((char) (i3 + 96));
                            }
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                    } else {
                        sb.append((char) i3);
                    }
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f11692a;
                    if (i3 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c2 = cArr2[i3];
                    if (z) {
                        sb.append((char) (c2 + 128));
                        z = false;
                    } else {
                        sb.append(c2);
                    }
                }
            }
            if (h13Var.m133269a() <= 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m17384f(h13 h13Var, StringBuilder sb) {
        while (h13Var.m133269a() > 16) {
            for (int i = 0; i < 4; i++) {
                int iM133272d = h13Var.m133272d(6);
                if (iM133272d == 31) {
                    int iM133270b = 8 - h13Var.m133270b();
                    if (iM133270b != 8) {
                        h13Var.m133272d(iM133270b);
                        return;
                    }
                    return;
                }
                if ((iM133272d & 32) == 0) {
                    iM133272d |= 64;
                }
                sb.append((char) iM133272d);
            }
            if (h13Var.m133269a() <= 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m17385g(h13 h13Var, StringBuilder sb) throws FormatException {
        int iM133272d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (h13Var.m133269a() != 8 && (iM133272d = h13Var.m133272d(8)) != 254) {
            m17386h(iM133272d, h13Var.m133272d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f11695d;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append((char) 29);
                            } else {
                                if (i3 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z = true;
                            }
                        } else {
                            if (i != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            char[] cArr2 = f11696e;
                            if (i3 >= cArr2.length) {
                                throw FormatException.getFormatInstance();
                            }
                            char c2 = cArr2[i3];
                            if (z) {
                                sb.append((char) (c2 + 128));
                                z = false;
                            } else {
                                sb.append(c2);
                            }
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                    } else {
                        sb.append((char) i3);
                    }
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f11694c;
                    if (i3 >= cArr3.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c3 = cArr3[i3];
                    if (z) {
                        sb.append((char) (c3 + 128));
                        z = false;
                    } else {
                        sb.append(c3);
                    }
                }
            }
            if (h13Var.m133269a() <= 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m17386h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / MMConstants.ERR_VCM_UNKNOWN_ERROR;
        iArr[0] = i4;
        int i5 = i3 - (i4 * MMConstants.ERR_VCM_UNKNOWN_ERROR);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* JADX INFO: renamed from: i */
    public static int m17387i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
