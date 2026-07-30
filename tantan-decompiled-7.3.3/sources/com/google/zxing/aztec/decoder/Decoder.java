package com.google.zxing.aztec.decoder;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import org.slf4j.Marker;
import p153l.c4s;
import p153l.d13;
import p153l.fuc0;
import p153l.mid;
import p153l.p7f;
import p153l.wtq0;
import p153l.yp1;
import p153l.zlj;

/* JADX INFO: loaded from: classes7.dex */
public final class Decoder {

    /* JADX INFO: renamed from: b */
    public static final String[] f11685b = {"CTRL_PS", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "A", "B", c4s.C_ZONE, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", BloodType.f39576O, "P", "Q", "R", p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, "U", p7f.GPS_MEASUREMENT_INTERRUPTED, "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c */
    public static final String[] f11686c = {"CTRL_PS", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "a", "b", "c", Constants.INAPP_DATA_TAG, "e", "f", "g", "h", RXScreenCaptureService.KEY_INDEX, "j", "k", BLiveStormDanmakuGiftResourceType.f45292l, "m", "n", "o", "p", "q", "r", BLiveStormDanmakuGiftResourceType.f45294s, Constants.KEY_T, "u", ResourceDirection.f39656v, "w", BaseSei.f14624X, BaseSei.f14625Y, BaseSei.f14626Z, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d */
    public static final String[] f11687d = {"CTRL_PS", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", SignParameters.NEW_LINE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e */
    public static final String[] f11688e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", Marker.ANY_NON_NULL_MARKER, Constants.SEPARATOR_COMMA, "-", ".", "/", ":", com.meituan.robust.Constants.PACKNAME_END, "<", "=", ">", "?", "[", Constants.AES_SUFFIX, "{", "}", "CTRL_UL"};

    /* JADX INFO: renamed from: f */
    public static final String[] f11689f = {"CTRL_PS", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "0", "1", "2", "3", "4", "5", com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO, "7", com.tencent.connect.common.Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, com.tencent.connect.common.Constants.VIA_SHARE_TYPE_MINI_PROGRAM, Constants.SEPARATOR_COMMA, ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a */
    public yp1 f11690a;

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* JADX INFO: renamed from: com.google.zxing.aztec.decoder.Decoder$a */
    public static /* synthetic */ class C3446a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11691a;

        static {
            int[] iArr = new int[Table.values().length];
            f11691a = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11691a[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11691a[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11691a[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11691a[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m17369a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m17373h(zArr, i << 3);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public static String m17370e(Table table, int i) {
        int i2 = C3446a.f11691a[table.ordinal()];
        if (i2 == 1) {
            return f11685b[i];
        }
        if (i2 == 2) {
            return f11686c[i];
        }
        if (i2 == 3) {
            return f11687d[i];
        }
        if (i2 == 4) {
            return f11688e[i];
        }
        if (i2 == 5) {
            return f11689f[i];
        }
        wtq0.m207906a("Bad table");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m17371f(boolean[] zArr) {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table tableM17372g = table;
        int i = 0;
        while (i < length) {
            if (table != Table.BINARY) {
                int i2 = table == Table.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int iM17374i = m17374i(zArr, i, i2);
                i += i2;
                String strM17370e = m17370e(table, iM17374i);
                if (strM17370e.startsWith("CTRL_")) {
                    tableM17372g = m17372g(strM17370e.charAt(5));
                    if (strM17370e.charAt(6) != 'L') {
                        tableM17372g = table;
                        table = tableM17372g;
                    }
                } else {
                    sb.append(strM17370e);
                }
                table = tableM17372g;
            } else {
                if (length - i < 5) {
                    break;
                }
                int iM17374i2 = m17374i(zArr, i, 5);
                int i3 = i + 5;
                if (iM17374i2 == 0) {
                    if (length - i3 < 11) {
                        break;
                    }
                    iM17374i2 = m17374i(zArr, i3, 11) + 31;
                    i3 = i + 16;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= iM17374i2) {
                        i = i3;
                        break;
                    }
                    if (length - i3 < 8) {
                        i = length;
                        break;
                    }
                    sb.append((char) m17374i(zArr, i3, 8));
                    i3 += 8;
                    i4++;
                }
                table = tableM17372g;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static Table m17372g(char c) {
        if (c == 'B') {
            return Table.BINARY;
        }
        if (c == 'D') {
            return Table.DIGIT;
        }
        if (c == 'P') {
            return Table.PUNCT;
        }
        if (c != 'L') {
            return c != 'M' ? Table.UPPER : Table.MIXED;
        }
        return Table.LOWER;
    }

    /* JADX INFO: renamed from: h */
    public static byte m17373h(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return (byte) (length >= 8 ? m17374i(zArr, i, 8) : m17374i(zArr, i, length) << (8 - length));
    }

    /* JADX INFO: renamed from: i */
    public static int m17374i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: j */
    public static int m17375j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean[] m17376b(boolean[] zArr) throws FormatException {
        int i;
        zlj zljVar;
        if (this.f11690a.m216994d() <= 2) {
            zljVar = zlj.f204931j;
            i = 6;
        } else {
            i = 8;
            if (this.f11690a.m216994d() <= 8) {
                zljVar = zlj.f204935n;
            } else if (this.f11690a.m216994d() <= 22) {
                zljVar = zlj.f204930i;
                i = 10;
            } else {
                zljVar = zlj.f204929h;
                i = 12;
            }
        }
        int iM216993c = this.f11690a.m216993c();
        int length = zArr.length / i;
        if (length < iM216993c) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i;
        int[] iArr = new int[length];
        int i2 = 0;
        while (i2 < length) {
            iArr[i2] = m17374i(zArr, length2, i);
            i2++;
            length2 += i;
        }
        try {
            new fuc0(zljVar).m127454a(iArr, length - iM216993c);
            int i3 = 1 << i;
            int i4 = i3 - 1;
            int i5 = 0;
            for (int i6 = 0; i6 < iM216993c; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4) {
                    throw FormatException.getFormatInstance();
                }
                if (i7 == 1 || i7 == i3 - 2) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(iM216993c * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < iM216993c; i9++) {
                int i10 = iArr[i9];
                if (i10 == 1 || i10 == i3 - 2) {
                    Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                    i8 += i - 1;
                } else {
                    int i11 = i - 1;
                    while (i11 >= 0) {
                        int i12 = i8 + 1;
                        zArr2[i8] = ((1 << i11) & i10) != 0;
                        i11--;
                        i8 = i12;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e) {
            throw FormatException.getFormatInstance(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public mid m17377c(yp1 yp1Var) throws FormatException {
        this.f11690a = yp1Var;
        boolean[] zArrM17376b = m17376b(m17378d(yp1Var.m118738a()));
        mid midVar = new mid(m17369a(zArrM17376b), m17371f(zArrM17376b), null, null);
        midVar.m158498l(zArrM17376b.length);
        return midVar;
    }

    /* JADX INFO: renamed from: d */
    public final boolean[] m17378d(d13 d13Var) {
        boolean zM216995e = this.f11690a.m216995e();
        int iM216994d = this.f11690a.m216994d();
        int i = (zM216995e ? 11 : 14) + (iM216994d << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m17375j(iM216994d, zM216995e)];
        int i2 = 2;
        if (zM216995e) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < iM216994d) {
            int i10 = ((iM216994d - i8) << i2) + (zM216995e ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = d13Var.m113480d(iArr[i16], iArr[i17]);
                    int i18 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = d13Var.m113480d(iArr[i17], iArr[i18]);
                    int i19 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = d13Var.m113480d(iArr[i18], iArr[i19]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = d13Var.m113480d(iArr[i19], iArr[i16]);
                    i15++;
                    iM216994d = iM216994d;
                    i2 = 2;
                }
                i13++;
                i2 = 2;
            }
            i9 += i10 << 3;
            i8++;
            iM216994d = iM216994d;
            i2 = 2;
        }
        return zArr;
    }
}
