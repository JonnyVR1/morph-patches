package p153l;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.eclipse.jetty.util.StringUtil;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public final class n8g0 {

    /* JADX INFO: renamed from: a */
    public static final String f140681a;

    /* JADX INFO: renamed from: b */
    public static final boolean f140682b;

    static {
        String strName = Charset.defaultCharset().name();
        f140681a = strName;
        f140682b = "SJIS".equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX INFO: renamed from: a */
    public static String m161922a(byte[] bArr, Map<DecodeHintType, ?> map) {
        boolean z;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return map.get(decodeHintType).toString();
            }
        }
        int length = bArr2.length;
        boolean z2 = true;
        int i = 0;
        boolean z3 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z4 = true;
        boolean z5 = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z2 || z4 || z5)) {
            byte b = bArr2[i3];
            int i13 = b & 255;
            if (z5) {
                if (i4 <= 0) {
                    z = z3;
                    if ((b & 128) != 0) {
                        if ((b & 64) != 0) {
                            int i14 = i4 + 1;
                            if ((b & HttpTokens.SPACE) == 0) {
                                i6++;
                            } else {
                                i14 = i4 + 2;
                                if ((b & Tnaf.POW_2_WIDTH) == 0) {
                                    i7++;
                                } else {
                                    i4 += 3;
                                    if ((b & 8) == 0) {
                                        i8++;
                                    }
                                }
                            }
                            i4 = i14;
                        }
                    }
                } else if ((b & 128) != 0) {
                    i4--;
                    z = z3;
                } else {
                    z = z3;
                }
                z5 = false;
            } else {
                z = z3;
            }
            if (z2) {
                if (i13 > 127 && i13 < 160) {
                    z2 = false;
                } else if (i13 > 159 && (i13 < 192 || i13 == 215 || i13 == 247)) {
                    i10++;
                }
            }
            if (z4) {
                if (i5 > 0) {
                    if (i13 < 64 || i13 == 127 || i13 > 252) {
                        z4 = false;
                    } else {
                        i5--;
                    }
                } else if (i13 == 128 || i13 == 160 || i13 > 239) {
                    z4 = false;
                } else if (i13 <= 160 || i13 >= 224) {
                    if (i13 > 127) {
                        i5++;
                        int i15 = i11 + 1;
                        if (i15 > i) {
                            i = i15;
                            i11 = i;
                        } else {
                            i11 = i15;
                        }
                    } else {
                        i11 = 0;
                    }
                    i12 = 0;
                } else {
                    i2++;
                    int i16 = i12 + 1;
                    if (i16 > i9) {
                        i9 = i16;
                        i12 = i9;
                    } else {
                        i12 = i16;
                    }
                    i11 = 0;
                }
            }
            i3++;
            bArr2 = bArr;
            z3 = z;
        }
        boolean z6 = z3;
        if (z5 && i4 > 0) {
            z5 = false;
        }
        if (z4 && i5 > 0) {
            z4 = false;
        }
        if (z5 && (z6 || i6 + i7 + i8 > 0)) {
            return StringUtil.__UTF8Alt;
        }
        if (z4 && (f140682b || i9 >= 3 || i >= 3)) {
            return "SJIS";
        }
        if (z2 && z4) {
            return (!(i9 == 2 && i2 == 2) && i10 * 10 < length) ? "ISO8859_1" : "SJIS";
        }
        if (z2) {
            return "ISO8859_1";
        }
        if (z4) {
            return "SJIS";
        }
        return z5 ? StringUtil.__UTF8Alt : f140681a;
    }
}
