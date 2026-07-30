package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes6.dex */
public final class vuw0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f183135a = m200142d(new byte[]{101, 120, 112, 97, 110, 100, HttpTokens.SPACE, 51, 50, 45, 98, 121, 116, 101, HttpTokens.SPACE, 107});

    /* JADX INFO: renamed from: a */
    public static void m200139a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    /* JADX INFO: renamed from: b */
    public static void m200140b(int[] iArr, int[] iArr2) {
        int[] iArr3 = f183135a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: renamed from: c */
    public static void m200141c(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m200139a(iArr, 0, 4, 8, 12);
            m200139a(iArr, 1, 5, 9, 13);
            m200139a(iArr, 2, 6, 10, 14);
            m200139a(iArr, 3, 7, 11, 15);
            m200139a(iArr, 0, 5, 10, 15);
            m200139a(iArr, 1, 6, 11, 12);
            m200139a(iArr, 2, 7, 8, 13);
            m200139a(iArr, 3, 4, 9, 14);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int[] m200142d(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
