package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p153l.b960;
import p153l.mid;

/* JADX INFO: loaded from: classes7.dex */
public final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: a */
    public static final char[] f11705a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f11706b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: c */
    public static final BigInteger[] f11707c;

    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$a */
    public static /* synthetic */ class C3450a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11708a;

        static {
            int[] iArr = new int[Mode.values().length];
            f11708a = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11708a[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11708a[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11708a[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11708a[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11708a[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f11707c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f11707c;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0089. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x008c. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:31:0x0075 for B:36:0x0089 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:31:0x0075 for B:37:0x008c already processed. Defaulting to fallback option. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: a */
    public static int m17411a(int r19, int[] r20, java.nio.charset.Charset r21, int r22, java.lang.StringBuilder r23) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.m17411a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX INFO: renamed from: b */
    public static mid m17412b(int[] iArr, String str) throws FormatException {
        int iM17417g;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i = iArr[1];
        b960 b960Var = new b960();
        int i2 = 2;
        while (i2 < iArr[0]) {
            if (i != 913) {
                switch (i) {
                    case 900:
                        iM17417g = m17417g(iArr, i2, sb);
                        break;
                    case 901:
                        iM17417g = m17411a(i, iArr, charsetForName, i2, sb);
                        break;
                    case 902:
                        iM17417g = m17416f(iArr, i2, sb);
                        break;
                    default:
                        switch (i) {
                            case 922:
                            case 923:
                                throw FormatException.getFormatInstance();
                            case 924:
                                iM17417g = m17411a(i, iArr, charsetForName, i2, sb);
                                break;
                            case 925:
                                iM17417g = i2 + 1;
                                break;
                            case 926:
                                iM17417g = i2 + 2;
                                break;
                            case 927:
                                iM17417g = i2 + 1;
                                charsetForName = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i2]).name());
                                break;
                            case 928:
                                iM17417g = m17414d(iArr, i2, b960Var);
                                break;
                            default:
                                iM17417g = m17417g(iArr, i2 - 1, sb);
                                break;
                        }
                        break;
                }
            } else {
                iM17417g = i2 + 1;
                sb.append((char) iArr[i2]);
            }
            if (iM17417g >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            i2 = iM17417g + 1;
            i = iArr[iM17417g];
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        mid midVar = new mid(null, sb.toString(), null, str);
        midVar.m158499m(b960Var);
        return midVar;
    }

    /* JADX INFO: renamed from: c */
    public static String m17413c(int[] iArr, int i) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(f11707c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: d */
    public static int m17414d(int[] iArr, int i, b960 b960Var) throws FormatException {
        if (i + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i2 = 0;
        while (i2 < 2) {
            iArr2[i2] = iArr[i];
            i2++;
            i++;
        }
        b960Var.m103063j(Integer.parseInt(m17413c(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int iM17417g = m17417g(iArr, i, sb);
        b960Var.m103057d(sb.toString());
        int i3 = iArr[iM17417g] == 923 ? iM17417g + 1 : -1;
        while (iM17417g < iArr[0]) {
            int i4 = iArr[iM17417g];
            if (i4 == 922) {
                iM17417g++;
                b960Var.m103060g(true);
            } else {
                if (i4 != 923) {
                    throw FormatException.getFormatInstance();
                }
                switch (iArr[iM17417g + 1]) {
                    case 0:
                        StringBuilder sb2 = new StringBuilder();
                        iM17417g = m17417g(iArr, iM17417g + 2, sb2);
                        b960Var.m103058e(sb2.toString());
                        break;
                    case 1:
                        StringBuilder sb3 = new StringBuilder();
                        iM17417g = m17416f(iArr, iM17417g + 2, sb3);
                        b960Var.m103062i(Integer.parseInt(sb3.toString()));
                        break;
                    case 2:
                        StringBuilder sb4 = new StringBuilder();
                        iM17417g = m17416f(iArr, iM17417g + 2, sb4);
                        b960Var.m103065l(Long.parseLong(sb4.toString()));
                        break;
                    case 3:
                        StringBuilder sb5 = new StringBuilder();
                        iM17417g = m17417g(iArr, iM17417g + 2, sb5);
                        b960Var.m103064k(sb5.toString());
                        break;
                    case 4:
                        StringBuilder sb6 = new StringBuilder();
                        iM17417g = m17417g(iArr, iM17417g + 2, sb6);
                        b960Var.m103055b(sb6.toString());
                        break;
                    case 5:
                        StringBuilder sb7 = new StringBuilder();
                        iM17417g = m17416f(iArr, iM17417g + 2, sb7);
                        b960Var.m103059f(Long.parseLong(sb7.toString()));
                        break;
                    case 6:
                        StringBuilder sb8 = new StringBuilder();
                        iM17417g = m17416f(iArr, iM17417g + 2, sb8);
                        b960Var.m103056c(Integer.parseInt(sb8.toString()));
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i3 != -1) {
            int i5 = iM17417g - i3;
            if (b960Var.m103054a()) {
                i5--;
            }
            b960Var.m103061h(Arrays.copyOfRange(iArr, i3, i5 + i3));
        }
        return iM17417g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m17415e(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        Mode mode;
        int i2;
        Mode mode2 = Mode.ALPHA;
        Mode mode3 = mode2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c = ' ';
            switch (C3450a.f11708a[mode2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c = (char) i2;
                    } else {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    Mode mode4 = mode;
                                    mode3 = mode2;
                                    mode2 = mode4;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                    }
                    break;
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c = (char) i2;
                    } else {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    mode = Mode.ALPHA_SHIFT;
                                    Mode mode5 = mode;
                                    mode3 = mode2;
                                    mode2 = mode5;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    Mode mode6 = mode;
                                    mode3 = mode2;
                                    mode2 = mode6;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                    }
                    break;
                case 3:
                    if (i4 < 25) {
                        c = f11706b[i4];
                    } else {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 25:
                                    mode2 = Mode.PUNCT;
                                    break;
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.ALPHA;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    Mode mode7 = mode;
                                    mode3 = mode2;
                                    mode2 = mode7;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                    }
                    break;
                case 4:
                    if (i4 < 29) {
                        c = f11705a[i4];
                    } else {
                        if (i4 == 29 || i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 == 913) {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                    }
                    break;
                case 5:
                    if (i4 < 26) {
                        c = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        mode2 = i4 != 900 ? mode3 : Mode.ALPHA;
                        c = 0;
                    }
                    mode2 = mode3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c = f11705a[i4];
                    } else if (i4 == 29 || i4 == 900) {
                        mode2 = Mode.ALPHA;
                        c = 0;
                    } else {
                        if (i4 == 913) {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                    }
                    mode2 = mode3;
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                sb.append(c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0007 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static int m17416f(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 != 900 && i5 != 901 && i5 != 928) {
                        switch (i5) {
                            case 922:
                            case 923:
                            case 924:
                                z = true;
                                break;
                        }
                    } else {
                        z = true;
                    }
                    if (i2 % 15 != 0 || i5 == 902 || z) {
                        if (i2 > 0) {
                            sb.append(m17413c(iArr2, i2));
                            i2 = 0;
                        }
                    }
                }
                i = i4;
                if (i2 % 15 != 0) {
                }
                if (i2 > 0) {
                    sb.append(m17413c(iArr2, i2));
                    i2 = 0;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0036. Please report as an issue. */
    /* JADX INFO: renamed from: g */
    public static int m17417g(int[] iArr, int i, StringBuilder sb) {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) << 1];
        int[] iArr3 = new int[(i2 - i) << 1];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z = true;
            } else {
                iArr2[i3] = 913;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        m17415e(iArr2, iArr3, i3, sb);
        return i;
    }
}
