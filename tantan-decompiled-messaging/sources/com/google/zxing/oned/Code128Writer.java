package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p149l.db5;
import p149l.ig3;
import p149l.nh50;
import p149l.o03;

/* JADX INFO: loaded from: classes7.dex */
public final class Code128Writer extends nh50 {

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* JADX INFO: renamed from: f */
    public static int m17344f(CharSequence charSequence, int i, int i2) {
        CType cTypeM17345g;
        CType cTypeM17345g2;
        char cCharAt;
        CType cTypeM17345g3 = m17345g(charSequence, i);
        CType cType = CType.ONE_DIGIT;
        if (cTypeM17345g3 == cType) {
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (cTypeM17345g3 == cType2) {
            return (i >= charSequence.length() || ((cCharAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || cCharAt >= '`'))) ? 100 : 101;
        }
        if (i2 == 99) {
            return 99;
        }
        if (i2 != 100) {
            if (cTypeM17345g3 == CType.FNC_1) {
                cTypeM17345g3 = m17345g(charSequence, i + 1);
            }
            return cTypeM17345g3 == CType.TWO_DIGITS ? 99 : 100;
        }
        CType cType3 = CType.FNC_1;
        if (cTypeM17345g3 == cType3 || (cTypeM17345g = m17345g(charSequence, i + 2)) == cType2 || cTypeM17345g == cType) {
            return 100;
        }
        if (cTypeM17345g == cType3) {
            return m17345g(charSequence, i + 3) == CType.TWO_DIGITS ? 99 : 100;
        }
        int i3 = i + 4;
        while (true) {
            cTypeM17345g2 = m17345g(charSequence, i3);
            if (cTypeM17345g2 != CType.TWO_DIGITS) {
                break;
            }
            i3 += 2;
        }
        return cTypeM17345g2 == CType.ONE_DIGIT ? 100 : 99;
    }

    /* JADX INFO: renamed from: g */
    public static CType m17345g(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == 241) {
            return CType.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i2);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    @Override // p149l.nh50, p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.mo17346a(str, barcodeFormat, i, i2, map);
        }
        ig3.m135964a("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p149l.nh50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17347c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            ig3.m135964a("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
            return null;
        }
        int iM159381b = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                    break;
                default:
                    if (cCharAt > 127) {
                        ig3.m135964a("Bad character in input: ".concat(String.valueOf(cCharAt)));
                        return null;
                    }
                    break;
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            int i6 = 103;
            if (i2 >= length) {
                int[][] iArr = db5.f85294a;
                arrayList.add(iArr[i3 % 103]);
                arrayList.add(iArr[106]);
                int i7 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i8 : iArr2) {
                        i7 += i8;
                    }
                }
                boolean[] zArr = new boolean[i7];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iM159381b += nh50.m159381b(zArr, iM159381b, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iM17344f = m17344f(str, i2, i4);
            int iCharAt = 100;
            if (iM17344f == i4) {
                switch (str.charAt(i2)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                        if (i4 == 101) {
                            iCharAt = 101;
                        }
                        break;
                    default:
                        if (i4 == 100) {
                            iCharAt = str.charAt(i2) - ' ';
                        } else if (i4 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i2, i2 + 2));
                            i2++;
                        } else {
                            char cCharAt2 = str.charAt(i2);
                            iCharAt = cCharAt2 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt2 + '@';
                            }
                        }
                        break;
                }
                i2++;
            } else {
                if (i4 != 0) {
                    i6 = iM17344f;
                } else if (iM17344f == 100) {
                    i6 = 104;
                } else if (iM17344f != 101) {
                    i6 = 105;
                }
                iCharAt = i6;
                i4 = iM17344f;
            }
            arrayList.add(db5.f85294a[iCharAt]);
            i3 += iCharAt * i5;
            if (i2 != 0) {
                i5++;
            }
        }
    }
}
