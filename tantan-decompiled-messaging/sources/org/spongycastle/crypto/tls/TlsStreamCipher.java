package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import p149l.csi0;

/* JADX INFO: loaded from: classes3.dex */
public class TlsStreamCipher implements TlsCipher {
    protected TlsContext context;
    protected StreamCipher decryptCipher;
    protected StreamCipher encryptCipher;
    protected TlsMac readMac;
    protected boolean usesNonce;
    protected TlsMac writeMac;

    public TlsStreamCipher(TlsContext tlsContext, StreamCipher streamCipher, StreamCipher streamCipher2, Digest digest, Digest digest2, int i, boolean z) throws IOException {
        boolean zIsServer = tlsContext.isServer();
        this.context = tlsContext;
        this.usesNonce = z;
        this.encryptCipher = streamCipher;
        this.decryptCipher = streamCipher2;
        int digestSize = (i * 2) + digest.getDigestSize() + digest2.getDigestSize();
        byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
        TlsMac tlsMac = new TlsMac(tlsContext, digest, bArrCalculateKeyBlock, 0, digest.getDigestSize());
        int digestSize2 = digest.getDigestSize();
        TlsMac tlsMac2 = new TlsMac(tlsContext, digest2, bArrCalculateKeyBlock, digestSize2, digest2.getDigestSize());
        int digestSize3 = digestSize2 + digest2.getDigestSize();
        CipherParameters keyParameter = new KeyParameter(bArrCalculateKeyBlock, digestSize3, i);
        int i2 = digestSize3 + i;
        CipherParameters keyParameter2 = new KeyParameter(bArrCalculateKeyBlock, i2, i);
        if (i2 + i != digestSize) {
            csi0.m108512a(80);
            throw null;
        }
        if (zIsServer) {
            this.writeMac = tlsMac2;
            this.readMac = tlsMac;
            this.encryptCipher = streamCipher2;
            this.decryptCipher = streamCipher;
            keyParameter2 = keyParameter;
            keyParameter = keyParameter2;
        } else {
            this.writeMac = tlsMac;
            this.readMac = tlsMac2;
            this.encryptCipher = streamCipher;
            this.decryptCipher = streamCipher2;
        }
        if (z) {
            byte[] bArr = new byte[8];
            ParametersWithIV parametersWithIV = new ParametersWithIV(keyParameter, bArr);
            keyParameter2 = new ParametersWithIV(keyParameter2, bArr);
            keyParameter = parametersWithIV;
        }
        this.encryptCipher.init(true, keyParameter);
        this.decryptCipher.init(false, keyParameter2);
    }

    public void checkMAC(long j, short s, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) throws IOException {
        if (Arrays.constantTimeAreEqual(Arrays.copyOfRange(bArr, i, i2), this.readMac.calculateMac(j, s, bArr2, i3, i4))) {
            return;
        }
        csi0.m108512a(20);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        if (this.usesNonce) {
            updateIV(this.decryptCipher, false, j);
        }
        int size = this.readMac.getSize();
        if (i2 < size) {
            csi0.m108512a(50);
            return null;
        }
        int i3 = i2 - size;
        byte[] bArr2 = new byte[i2];
        this.decryptCipher.processBytes(bArr, i, i2, bArr2, 0);
        checkMAC(j, s, bArr2, i3, i2, bArr2, 0, i3);
        return Arrays.copyOfRange(bArr2, 0, i3);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j, short s, byte[] bArr, int i, int i2) {
        if (this.usesNonce) {
            updateIV(this.encryptCipher, true, j);
        }
        byte[] bArr2 = new byte[i2 + this.writeMac.getSize()];
        this.encryptCipher.processBytes(bArr, i, i2, bArr2, 0);
        byte[] bArrCalculateMac = this.writeMac.calculateMac(j, s, bArr, i, i2);
        this.encryptCipher.processBytes(bArrCalculateMac, 0, bArrCalculateMac.length, bArr2, i2);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i) {
        return i - this.writeMac.getSize();
    }

    public void updateIV(StreamCipher streamCipher, boolean z, long j) {
        byte[] bArr = new byte[8];
        TlsUtils.writeUint64(j, bArr, 0);
        streamCipher.init(z, new ParametersWithIV(null, bArr));
    }
}
