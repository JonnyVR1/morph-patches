package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class BitEncoding {

    /* JADX INFO: renamed from: a */
    public static final boolean f65443a;

    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        f65443a = "true".equals(property);
    }

    private BitEncoding() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m90999a(int i) {
        String str = (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? 2 : 3];
        if (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i == 1) {
            objArr[1] = "encodeBytes";
        } else if (i == 3) {
            objArr[1] = "encode8to7";
        } else if (i == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i == 8) {
            objArr[1] = "decodeBytes";
        } else if (i == 10) {
            objArr[1] = "dropMarker";
        } else if (i == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 6 && i != 8 && i != 10 && i != 12 && i != 14) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m91000b(@NotNull byte[] bArr, int i) {
        if (bArr == null) {
            m90999a(4);
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((bArr[i2] + i) & 127);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static byte[] m91001c(@NotNull String[] strArr) {
        if (strArr == null) {
            m90999a(11);
        }
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i2 = 0;
            while (i2 < length2) {
                bArr[i] = (byte) str2.charAt(i2);
                i2++;
                i++;
            }
        }
        return bArr;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static byte[] m91002d(@NotNull byte[] bArr) {
        if (bArr == null) {
            m90999a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i + 1;
            int i5 = i2 + 1;
            bArr2[i3] = (byte) (((bArr[i] & 255) >>> i2) + ((bArr[i4] & ((1 << i5) - 1)) << (7 - i2)));
            if (i2 == 6) {
                i += 2;
                i2 = 0;
            } else {
                i = i4;
                i2 = i5;
            }
        }
        return bArr2;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static byte[] m91003e(@NotNull String[] strArr) {
        if (strArr == null) {
            m90999a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                byte[] bArrM91031a = UtfEncodingKt.m91031a(m91004f(strArr));
                if (bArrM91031a == null) {
                    m90999a(8);
                }
                return bArrM91031a;
            }
            if (cCharAt == 65535) {
                strArr = m91004f(strArr);
            }
        }
        byte[] bArrM91001c = m91001c(strArr);
        m91000b(bArrM91001c, 127);
        return m91002d(bArrM91001c);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static String[] m91004f(@NotNull String[] strArr) {
        if (strArr == null) {
            m90999a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
