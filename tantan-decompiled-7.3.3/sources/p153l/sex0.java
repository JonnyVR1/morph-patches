package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class sex0 {
    /* JADX INFO: renamed from: a */
    public static final void m185576a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            wg3.m206174a("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m185577b(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i2 > Api.BaseClientBuilder.API_PRIORITY_OTHER - length2) {
                phw0.m172339a("exceeded size limit");
                return null;
            }
            i2 += length2;
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final byte[] m185578c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return m185579d(bArr, 0, bArr2, 0, length);
        }
        wg3.m206174a("The lengths of x and y should match.");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final byte[] m185579d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            wg3.m206174a("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }
}
