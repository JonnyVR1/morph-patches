package p153l;

/* JADX INFO: loaded from: classes.dex */
public class g2l {

    /* JADX INFO: renamed from: a */
    private static final char[] f101855a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m128633a(byte[] bArr) {
        return m128634b(bArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public static String m128634b(byte[] bArr, int i) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i > 0 ? length / i : 0)];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i > 0 && i3 % i == 0 && i2 > 0) {
                cArr[i2] = '-';
                i2++;
            }
            int i4 = i2 + 1;
            char[] cArr2 = f101855a;
            byte b = bArr[i3];
            cArr[i2] = cArr2[(b & 240) >>> 4];
            i2 += 2;
            cArr[i4] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
