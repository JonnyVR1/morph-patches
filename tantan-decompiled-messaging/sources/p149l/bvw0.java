package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bvw0 {

    /* JADX INFO: renamed from: a */
    public final zuw0 f77498a;

    /* JADX INFO: renamed from: b */
    public final zuw0 f77499b;

    public bvw0(byte[] bArr) throws GeneralSecurityException {
        if (!mvw0.m156606a(1)) {
            j8w0.m140474a("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.f77498a = mo99211a(bArr, 1);
        this.f77499b = mo99211a(bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public abstract zuw0 mo99211a(byte[] bArr, int i) throws InvalidKeyException;

    /* JADX INFO: renamed from: b */
    public final byte[] m104086b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            j8w0.m140474a("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f77499b.m220270c(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int iRemaining = byteBuffer.remaining();
            int i3 = iRemaining % 16;
            int i4 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + i2;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i2);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i4);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(evw0.m118334a(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.f77498a.m220271d(bArr, byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }
}
