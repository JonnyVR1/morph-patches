package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Arrays;
import p149l.csi0;

/* JADX INFO: loaded from: classes3.dex */
public class TlsNullCipher implements TlsCipher {
    protected TlsContext context;
    protected TlsMac readMac;
    protected TlsMac writeMac;

    public TlsNullCipher(TlsContext tlsContext, Digest digest, Digest digest2) throws IOException {
        TlsContext tlsContext2;
        TlsMac tlsMac;
        TlsMac tlsMac2 = null;
        if ((digest == null) != (digest2 == null)) {
            csi0.m108512a(80);
            throw null;
        }
        this.context = tlsContext;
        if (digest != null) {
            int digestSize = digest.getDigestSize() + digest2.getDigestSize();
            byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
            tlsContext2 = tlsContext;
            TlsMac tlsMac3 = new TlsMac(tlsContext2, digest, bArrCalculateKeyBlock, 0, digest.getDigestSize());
            int digestSize2 = digest.getDigestSize();
            tlsMac = new TlsMac(tlsContext2, digest2, bArrCalculateKeyBlock, digestSize2, digest2.getDigestSize());
            if (digestSize2 + digest2.getDigestSize() != digestSize) {
                csi0.m108512a(80);
                throw null;
            }
            tlsMac2 = tlsMac3;
        } else {
            tlsContext2 = tlsContext;
            tlsMac = null;
        }
        if (tlsContext2.isServer()) {
            this.writeMac = tlsMac;
            this.readMac = tlsMac2;
        } else {
            this.writeMac = tlsMac2;
            this.readMac = tlsMac;
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        TlsMac tlsMac = this.readMac;
        if (tlsMac == null) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
        int size = tlsMac.getSize();
        if (i2 < size) {
            csi0.m108512a(50);
            return null;
        }
        int i3 = i2 - size;
        int i4 = i + i3;
        if (Arrays.constantTimeAreEqual(Arrays.copyOfRange(bArr, i4, i2 + i), this.readMac.calculateMac(j, s, bArr, i, i3))) {
            return Arrays.copyOfRange(bArr, i, i4);
        }
        csi0.m108512a(20);
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        TlsMac tlsMac = this.writeMac;
        if (tlsMac == null) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
        byte[] bArrCalculateMac = tlsMac.calculateMac(j, s, bArr, i, i2);
        byte[] bArr2 = new byte[bArrCalculateMac.length + i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        System.arraycopy(bArrCalculateMac, 0, bArr2, i2, bArrCalculateMac.length);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i) {
        TlsMac tlsMac = this.writeMac;
        return tlsMac != null ? i - tlsMac.getSize() : i;
    }

    public TlsNullCipher(TlsContext tlsContext) {
        this.context = tlsContext;
        this.writeMac = null;
        this.readMac = null;
    }
}
