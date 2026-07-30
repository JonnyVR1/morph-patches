package com.google.zxing.aztec.decoder;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import org.slf4j.Marker;
import p149l.b2s;
import p149l.ghd;
import p149l.gjj;
import p149l.j6f;
import p149l.o03;
import p149l.qkq0;
import p149l.rp1;
import p149l.ylc0;

/* JADX INFO: loaded from: classes7.dex */
public final class Decoder {

    /* JADX INFO: renamed from: b */
    public static final String[] f11648b = {"CTRL_PS", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "A", "B", b2s.C_ZONE, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", BloodType.f38728O, "P", "Q", "R", j6f.LATITUDE_SOUTH, j6f.GPS_DIRECTION_TRUE, "U", j6f.GPS_MEASUREMENT_INTERRUPTED, "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c */
    public static final String[] f11649c = {"CTRL_PS", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "a", "b", "c", Constants.INAPP_DATA_TAG, "e", "f", "g", "h", RXScreenCaptureService.KEY_INDEX, "j", "k", BLiveStormDanmakuGiftResourceType.f44444l, "m", "n", "o", "p", "q", "r", BLiveStormDanmakuGiftResourceType.f44446s, Constants.KEY_T, "u", ResourceDirection.f38808v, "w", BaseSei.f13930X, BaseSei.f13931Y, BaseSei.f13932Z, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d */
    public static final String[] f11650d = {"CTRL_PS", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", SignParameters.NEW_LINE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e */
    public static final String[] f11651e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", Marker.ANY_NON_NULL_MARKER, Constants.SEPARATOR_COMMA, "-", ".", "/", ":", com.meituan.robust.Constants.PACKNAME_END, "<", "=", ">", "?", "[", Constants.AES_SUFFIX, "{", "}", "CTRL_UL"};

    /* JADX INFO: renamed from: f */
    public static final String[] f11652f = {"CTRL_PS", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "0", "1", "2", "3", "4", "5", com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO, "7", com.tencent.connect.common.Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, com.tencent.connect.common.Constants.VIA_SHARE_TYPE_MINI_PROGRAM, Constants.SEPARATOR_COMMA, ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a */
    public rp1 f11653a;

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* JADX INFO: renamed from: com.google.zxing.aztec.decoder.Decoder$a */
    public static /* synthetic */ class C3423a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11654a;

        static {
            int[] iArr = new int[Table.values().length];
            f11654a = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11654a[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11654a[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11654a[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11654a[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m17314a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m17318h(zArr, i << 3);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public static String m17315e(Table table, int i) {
        int i2 = C3423a.f11654a[table.ordinal()];
        if (i2 == 1) {
            return f11648b[i];
        }
        if (i2 == 2) {
            return f11649c[i];
        }
        if (i2 == 3) {
            return f11650d[i];
        }
        if (i2 == 4) {
            return f11651e[i];
        }
        if (i2 == 5) {
            return f11652f[i];
        }
        qkq0.m175383a("Bad table");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m17316f(boolean[] zArr) {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table tableM17317g = table;
        int i = 0;
        while (i < length) {
            if (table != Table.BINARY) {
                int i2 = table == Table.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int iM17319i = m17319i(zArr, i, i2);
                i += i2;
                String strM17315e = m17315e(table, iM17319i);
                if (strM17315e.startsWith("CTRL_")) {
                    tableM17317g = m17317g(strM17315e.charAt(5));
                    if (strM17315e.charAt(6) != 'L') {
                        tableM17317g = table;
                        table = tableM17317g;
                    }
                } else {
                    sb.append(strM17315e);
                }
                table = tableM17317g;
            } else {
                if (length - i < 5) {
                    break;
                }
                int iM17319i2 = m17319i(zArr, i, 5);
                int i3 = i + 5;
                if (iM17319i2 == 0) {
                    if (length - i3 < 11) {
                        break;
                    }
                    iM17319i2 = m17319i(zArr, i3, 11) + 31;
                    i3 = i + 16;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= iM17319i2) {
                        i = i3;
                        break;
                    }
                    if (length - i3 < 8) {
                        i = length;
                        break;
                    }
                    sb.append((char) m17319i(zArr, i3, 8));
                    i3 += 8;
                    i4++;
                }
                table = tableM17317g;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static Table m17317g(char c) {
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
    public static byte m17318h(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return (byte) (length >= 8 ? m17319i(zArr, i, 8) : m17319i(zArr, i, length) << (8 - length));
    }

    /* JADX INFO: renamed from: i */
    public static int m17319i(boolean[] zArr, int i, int i2) {
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
    public static int m17320j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean[] m17321b(boolean[] zArr) throws FormatException {
        int i;
        gjj gjjVar;
        if (this.f11653a.m180287d() <= 2) {
            gjjVar = gjj.f103072j;
            i = 6;
        } else {
            i = 8;
            if (this.f11653a.m180287d() <= 8) {
                gjjVar = gjj.f103076n;
            } else if (this.f11653a.m180287d() <= 22) {
                gjjVar = gjj.f103071i;
                i = 10;
            } else {
                gjjVar = gjj.f103070h;
                i = 12;
            }
        }
        int iM180286c = this.f11653a.m180286c();
        int length = zArr.length / i;
        if (length < iM180286c) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i;
        int[] iArr = new int[length];
        int i2 = 0;
        while (i2 < length) {
            iArr[i2] = m17319i(zArr, length2, i);
            i2++;
            length2 += i;
        }
        try {
            new ylc0(gjjVar).m215261a(iArr, length - iM180286c);
            int i3 = 1 << i;
            int i4 = i3 - 1;
            int i5 = 0;
            for (int i6 = 0; i6 < iM180286c; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4) {
                    throw FormatException.getFormatInstance();
                }
                if (i7 == 1 || i7 == i3 - 2) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(iM180286c * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < iM180286c; i9++) {
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
    public ghd m17322c(rp1 rp1Var) throws FormatException {
        this.f11653a = rp1Var;
        boolean[] zArrM17321b = m17321b(m17323d(rp1Var.m171833a()));
        ghd ghdVar = new ghd(m17314a(zArrM17321b), m17316f(zArrM17321b), null, null);
        ghdVar.m126175l(zArrM17321b.length);
        return ghdVar;
    }

    /* JADX INFO: renamed from: d */
    public final boolean[] m17323d(o03 o03Var) {
        boolean zM180288e = this.f11653a.m180288e();
        int iM180287d = this.f11653a.m180287d();
        int i = (zM180288e ? 11 : 14) + (iM180287d << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m17320j(iM180287d, zM180288e)];
        int i2 = 2;
        if (zM180288e) {
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
        while (i8 < iM180287d) {
            int i10 = ((iM180287d - i8) << i2) + (zM180288e ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = o03Var.m162110d(iArr[i16], iArr[i17]);
                    int i18 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = o03Var.m162110d(iArr[i17], iArr[i18]);
                    int i19 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = o03Var.m162110d(iArr[i18], iArr[i19]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = o03Var.m162110d(iArr[i19], iArr[i16]);
                    i15++;
                    iM180287d = iM180287d;
                    i2 = 2;
                }
                i13++;
                i2 = 2;
            }
            i9 += i10 << 3;
            i8++;
            iM180287d = iM180287d;
            i2 = 2;
        }
        return zArr;
    }
}
