package p153l;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class rgv0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f163050a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f163051b = {"", "A", "B", c4s.C_ZONE};

    /* JADX INFO: renamed from: a */
    public static String m181490a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: b */
    public static String m181491b(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", f163051b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m181492c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(f163050a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
