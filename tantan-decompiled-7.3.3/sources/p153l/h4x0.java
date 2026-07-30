package p153l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h4x0 {

    /* JADX INFO: renamed from: a */
    public final f4x0 f107835a;

    /* JADX INFO: renamed from: b */
    public final f4x0 f107836b;

    public h4x0(byte[] bArr) throws GeneralSecurityException {
        if (!s4x0.m184598a(1)) {
            phw0.m172339a("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.f107835a = mo128914a(bArr, 1);
        this.f107836b = mo128914a(bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public abstract f4x0 mo128914a(byte[] bArr, int i) throws InvalidKeyException;

    /* JADX INFO: renamed from: b */
    public final byte[] m133597b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            phw0.m172339a("ciphertext too short");
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
            this.f107836b.m124089c(bArr, 0).get(bArr4);
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
            if (!MessageDigest.isEqual(k4x0.m148307a(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.f107835a.m124090d(bArr, byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }
}
