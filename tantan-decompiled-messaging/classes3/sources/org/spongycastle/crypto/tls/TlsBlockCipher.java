package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TlsBlockCipher implements TlsCipher {
    protected TlsContext context;
    protected BlockCipher decryptCipher;
    protected BlockCipher encryptCipher;
    protected boolean encryptThenMAC;
    protected byte[] randomData = new byte[256];
    protected TlsMac readMac;
    protected boolean useExplicitIV;
    protected TlsMac writeMac;

    public TlsBlockCipher(TlsContext tlsContext, BlockCipher blockCipher, BlockCipher blockCipher2, Digest digest, Digest digest2, int i) throws IOException {
        byte[] bArrCopyOfRange;
        byte[] bArrCopyOfRange2;
        ParametersWithIV parametersWithIV;
        ParametersWithIV parametersWithIV2;
        this.context = tlsContext;
        tlsContext.getNonceRandomGenerator().nextBytes(this.randomData);
        this.useExplicitIV = TlsUtils.isTLSv11(tlsContext);
        this.encryptThenMAC = tlsContext.getSecurityParameters().encryptThenMAC;
        int digestSize = (i * 2) + digest.getDigestSize() + digest2.getDigestSize();
        digestSize = this.useExplicitIV ? digestSize : digestSize + blockCipher.getBlockSize() + blockCipher2.getBlockSize();
        byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
        TlsMac tlsMac = new TlsMac(tlsContext, digest, bArrCalculateKeyBlock, 0, digest.getDigestSize());
        int digestSize2 = digest.getDigestSize();
        TlsMac tlsMac2 = new TlsMac(tlsContext, digest2, bArrCalculateKeyBlock, digestSize2, digest2.getDigestSize());
        int digestSize3 = digestSize2 + digest2.getDigestSize();
        KeyParameter keyParameter = new KeyParameter(bArrCalculateKeyBlock, digestSize3, i);
        int i2 = digestSize3 + i;
        KeyParameter keyParameter2 = new KeyParameter(bArrCalculateKeyBlock, i2, i);
        int blockSize = i2 + i;
        if (this.useExplicitIV) {
            bArrCopyOfRange = new byte[blockCipher.getBlockSize()];
            bArrCopyOfRange2 = new byte[blockCipher2.getBlockSize()];
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArrCalculateKeyBlock, blockSize, blockCipher.getBlockSize() + blockSize);
            int blockSize2 = blockSize + blockCipher.getBlockSize();
            bArrCopyOfRange2 = Arrays.copyOfRange(bArrCalculateKeyBlock, blockSize2, blockCipher2.getBlockSize() + blockSize2);
            blockSize = blockSize2 + blockCipher2.getBlockSize();
        }
        if (blockSize != digestSize) {
            csi0.m3424a(80);
            throw null;
        }
        if (tlsContext.isServer()) {
            this.writeMac = tlsMac2;
            this.readMac = tlsMac;
            this.encryptCipher = blockCipher2;
            this.decryptCipher = blockCipher;
            parametersWithIV = new ParametersWithIV(keyParameter2, bArrCopyOfRange2);
            parametersWithIV2 = new ParametersWithIV(keyParameter, bArrCopyOfRange);
        } else {
            this.writeMac = tlsMac;
            this.readMac = tlsMac2;
            this.encryptCipher = blockCipher;
            this.decryptCipher = blockCipher2;
            parametersWithIV = new ParametersWithIV(keyParameter, bArrCopyOfRange);
            parametersWithIV2 = new ParametersWithIV(keyParameter2, bArrCopyOfRange2);
        }
        this.encryptCipher.init(true, parametersWithIV);
        this.decryptCipher.init(false, parametersWithIV2);
    }

    public int checkPaddingConstantTime(byte[] bArr, int i, int i2, int i3, int i4) {
        byte b;
        int i5;
        int i6 = i + i2;
        byte b2 = bArr[i6 - 1];
        int i7 = (b2 & 255) + 1;
        if ((!TlsUtils.isSSL(this.context) || i7 <= i3) && i4 + i7 <= i2) {
            int i8 = i6 - i7;
            b = 0;
            while (true) {
                int i9 = i8 + 1;
                b = (byte) ((bArr[i8] ^ b2) | b);
                if (i9 >= i6) {
                    break;
                }
                i8 = i9;
            }
            i5 = i7;
            if (b != 0) {
                i7 = 0;
            }
        } else {
            i5 = 0;
            b = 0;
            i7 = 0;
        }
        byte[] bArr2 = this.randomData;
        while (i5 < 256) {
            b = (byte) ((bArr2[i5] ^ b2) | b);
            i5++;
        }
        bArr2[0] = (byte) (bArr2[0] ^ b);
        return i7;
    }

    public int chooseExtraPadBlocks(SecureRandom secureRandom, int i) {
        return Math.min(lowestBitSet(secureRandom.nextInt()), i);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int blockSize = this.decryptCipher.getBlockSize();
        int size = this.readMac.getSize();
        int iMax = this.encryptThenMAC ? blockSize + size : Math.max(blockSize, size + 1);
        if (this.useExplicitIV) {
            iMax += blockSize;
        }
        if (i2 < iMax) {
            csi0.m3424a(50);
            return null;
        }
        boolean z = this.encryptThenMAC;
        int i5 = z ? i2 - size : i2;
        if (i5 % blockSize != 0) {
            csi0.m3424a(21);
            return null;
        }
        if (z) {
            int i6 = i + i2;
            i3 = i;
            if (!Arrays.constantTimeAreEqual(this.readMac.calculateMac(j, s, bArr, i3, i2 - size), Arrays.copyOfRange(bArr, i6 - size, i6))) {
                csi0.m3424a(20);
                return null;
            }
        } else {
            i3 = i;
        }
        if (this.useExplicitIV) {
            this.decryptCipher.init(false, new ParametersWithIV(null, bArr, i3, blockSize));
            i5 -= blockSize;
            i4 = i3 + blockSize;
        } else {
            i4 = i3;
        }
        int i7 = i5;
        for (int i8 = 0; i8 < i7; i8 += blockSize) {
            int i9 = i4 + i8;
            this.decryptCipher.processBlock(bArr, i9, bArr, i9);
        }
        byte[] bArr2 = bArr;
        int iCheckPaddingConstantTime = checkPaddingConstantTime(bArr2, i4, i7, blockSize, this.encryptThenMAC ? 0 : size);
        boolean z2 = iCheckPaddingConstantTime == 0;
        int i10 = i7 - iCheckPaddingConstantTime;
        if (!this.encryptThenMAC) {
            int i11 = i10 - size;
            int i12 = i4 + i11;
            int i13 = i4;
            i4 = i13;
            z2 |= !Arrays.constantTimeAreEqual(this.readMac.calculateMacConstantTime(j, s, bArr2, i13, i11, i7 - size, this.randomData), Arrays.copyOfRange(bArr2, i12, i12 + size));
            i10 = i11;
        }
        if (!z2) {
            bArr2 = bArr2;
            return Arrays.copyOfRange(bArr2, i4, i4 + i10);
        }
        bArr2 = bArr2;
        csi0.m3424a(20);
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j, short s, byte[] bArr, int i, int i2) {
        int i3;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        ProtocolVersion serverVersion = this.context.getServerVersion();
        int iChooseExtraPadBlocks = (blockSize - 1) - ((!this.encryptThenMAC ? i2 + size : i2) % blockSize);
        if (!serverVersion.isDTLS() && !serverVersion.isSSL()) {
            iChooseExtraPadBlocks += chooseExtraPadBlocks(this.context.getSecureRandom(), (255 - iChooseExtraPadBlocks) / blockSize) * blockSize;
        }
        int i4 = iChooseExtraPadBlocks;
        int i5 = size + i2 + i4 + 1;
        boolean z = this.useExplicitIV;
        if (z) {
            i5 += blockSize;
        }
        byte[] bArr2 = new byte[i5];
        if (z) {
            byte[] bArr3 = new byte[blockSize];
            this.context.getNonceRandomGenerator().nextBytes(bArr3);
            this.encryptCipher.init(true, new ParametersWithIV(null, bArr3));
            System.arraycopy(bArr3, 0, bArr2, 0, blockSize);
            i3 = blockSize;
        } else {
            i3 = 0;
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        int length = i3 + i2;
        if (!this.encryptThenMAC) {
            byte[] bArrCalculateMac = this.writeMac.calculateMac(j, s, bArr, i, i2);
            System.arraycopy(bArrCalculateMac, 0, bArr2, length, bArrCalculateMac.length);
            length += bArrCalculateMac.length;
        }
        int i6 = 0;
        while (i6 <= i4) {
            bArr2[length] = (byte) i4;
            i6++;
            length++;
        }
        while (i3 < length) {
            this.encryptCipher.processBlock(bArr2, i3, bArr2, i3);
            i3 += blockSize;
        }
        if (this.encryptThenMAC) {
            int i7 = length;
            byte[] bArrCalculateMac2 = this.writeMac.calculateMac(j, s, bArr2, 0, i7);
            System.arraycopy(bArrCalculateMac2, 0, bArr2, i7, bArrCalculateMac2.length);
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i) {
        int i2;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        if (this.useExplicitIV) {
            i -= blockSize;
        }
        if (this.encryptThenMAC) {
            int i3 = i - size;
            i2 = i3 - (i3 % blockSize);
        } else {
            i2 = (i - (i % blockSize)) - size;
        }
        return i2 - 1;
    }

    public TlsMac getReadMac() {
        return this.readMac;
    }

    public TlsMac getWriteMac() {
        return this.writeMac;
    }

    public int lowestBitSet(int i) {
        if (i == 0) {
            return 32;
        }
        int i2 = 0;
        while ((i & 1) == 0) {
            i2++;
            i >>= 1;
        }
        return i2;
    }
}
