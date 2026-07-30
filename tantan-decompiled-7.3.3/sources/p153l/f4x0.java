package p153l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f4x0 {

    /* JADX INFO: renamed from: a */
    public int[] f97163a;

    /* JADX INFO: renamed from: b */
    public final int f97164b;

    public f4x0(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f97163a = b4x0.m102543d(bArr);
        this.f97164b = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo119485a();

    /* JADX INFO: renamed from: b */
    public abstract int[] mo119486b(int[] iArr, int i);

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m124089c(byte[] bArr, int i) {
        int[] iArrMo119486b = mo119486b(b4x0.m102543d(bArr), i);
        int[] iArr = (int[]) iArrMo119486b.clone();
        b4x0.m102542c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrMo119486b[i2] = iArrMo119486b[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo119486b, 0, 16);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m124090d(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != mo119485a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo119485a());
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer byteBufferM124089c = m124089c(bArr, this.f97164b + i2);
            if (i2 == i) {
                sex0.m185576a(byteBufferAllocate, byteBuffer, byteBufferM124089c, iRemaining % 64);
            } else {
                sex0.m185576a(byteBufferAllocate, byteBuffer, byteBufferM124089c, 64);
            }
        }
        return byteBufferAllocate.array();
    }
}
