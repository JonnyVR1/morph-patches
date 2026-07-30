package p007l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class agw {

    /* JADX INFO: renamed from: a */
    private static final String f1851a = ijw.m9418a(new byte[]{101, 50, 119, 26, 89});

    /* JADX INFO: renamed from: b */
    private static char[] f1852b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: c */
    private static byte[] f1853c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a */
    public static String m8549a(byte[] bArr) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b = bArr[i];
            int i3 = b & 255;
            if (i2 == length) {
                stringBuffer.append(f1852b[i3 >>> 2]);
                stringBuffer.append(f1852b[(b & 3) << 4]);
                stringBuffer.append(ijw.m9418a(new byte[]{13, 91}));
                break;
            }
            int i4 = i + 2;
            byte b2 = bArr[i2];
            if (i4 == length) {
                stringBuffer.append(f1852b[i3 >>> 2]);
                stringBuffer.append(f1852b[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                stringBuffer.append(f1852b[(b2 & 15) << 2]);
                stringBuffer.append(ijw.m9418a(new byte[]{13}));
                break;
            }
            i += 3;
            byte b3 = bArr[i4];
            stringBuffer.append(f1852b[i3 >>> 2]);
            stringBuffer.append(f1852b[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
            stringBuffer.append(f1852b[((b2 & 15) << 2) | ((b3 & 192) >>> 6)]);
            stringBuffer.append(f1852b[b3 & 63]);
        }
        return stringBuffer.toString();
    }
}
