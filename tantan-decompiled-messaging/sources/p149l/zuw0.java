package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zuw0 {

    /* JADX INFO: renamed from: a */
    public int[] f204912a;

    /* JADX INFO: renamed from: b */
    public final int f204913b;

    public zuw0(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f204912a = vuw0.m200142d(bArr);
        this.f204913b = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo108967a();

    /* JADX INFO: renamed from: b */
    public abstract int[] mo108968b(int[] iArr, int i);

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m220270c(byte[] bArr, int i) {
        int[] iArrMo108968b = mo108968b(vuw0.m200142d(bArr), i);
        int[] iArr = (int[]) iArrMo108968b.clone();
        vuw0.m200141c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrMo108968b[i2] = iArrMo108968b[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo108968b, 0, 16);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m220271d(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != mo108967a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo108967a());
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer byteBufferM220270c = m220270c(bArr, this.f204913b + i2);
            if (i2 == i) {
                m5x0.m153180a(byteBufferAllocate, byteBuffer, byteBufferM220270c, iRemaining % 64);
            } else {
                m5x0.m153180a(byteBufferAllocate, byteBuffer, byteBufferM220270c, 64);
            }
        }
        return byteBufferAllocate.array();
    }
}
