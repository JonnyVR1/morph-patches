package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.digests.LongDigest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class TlsMac {
    protected TlsContext context;
    protected int digestBlockSize;
    protected int digestOverhead;
    protected Mac mac;
    protected int macLength;
    protected byte[] secret;

    public TlsMac(TlsContext tlsContext, Digest digest, byte[] bArr, int i, int i2) {
        this.context = tlsContext;
        KeyParameter keyParameter = new KeyParameter(bArr, i, i2);
        this.secret = Arrays.clone(keyParameter.getKey());
        if (digest instanceof LongDigest) {
            this.digestBlockSize = 128;
            this.digestOverhead = 16;
        } else {
            this.digestBlockSize = 64;
            this.digestOverhead = 8;
        }
        if (TlsUtils.isSSL(tlsContext)) {
            this.mac = new SSL3Mac(digest);
            if (digest.getDigestSize() == 20) {
                this.digestOverhead = 4;
            }
        } else {
            this.mac = new HMac(digest);
        }
        this.mac.init(keyParameter);
        this.macLength = this.mac.getMacSize();
        if (tlsContext.getSecurityParameters().truncatedHMac) {
            this.macLength = Math.min(this.macLength, 10);
        }
    }

    public byte[] calculateMac(long j, short s, byte[] bArr, int i, int i2) {
        ProtocolVersion serverVersion = this.context.getServerVersion();
        boolean zIsSSL = serverVersion.isSSL();
        int i3 = zIsSSL ? 11 : 13;
        byte[] bArr2 = new byte[i3];
        TlsUtils.writeUint64(j, bArr2, 0);
        TlsUtils.writeUint8(s, bArr2, 8);
        if (!zIsSSL) {
            TlsUtils.writeVersion(serverVersion, bArr2, 9);
        }
        TlsUtils.writeUint16(i2, bArr2, i3 - 2);
        this.mac.update(bArr2, 0, i3);
        this.mac.update(bArr, i, i2);
        byte[] bArr3 = new byte[this.mac.getMacSize()];
        this.mac.doFinal(bArr3, 0);
        return truncate(bArr3);
    }

    public byte[] calculateMacConstantTime(long j, short s, byte[] bArr, int i, int i2, int i3, byte[] bArr2) {
        byte[] bArrCalculateMac = calculateMac(j, s, bArr, i, i2);
        int i4 = TlsUtils.isSSL(this.context) ? 11 : 13;
        int digestBlockCount = getDigestBlockCount(i3 + i4) - getDigestBlockCount(i4 + i2);
        while (true) {
            digestBlockCount--;
            Mac mac = this.mac;
            if (digestBlockCount < 0) {
                mac.update(bArr2[0]);
                this.mac.reset();
                return bArrCalculateMac;
            }
            mac.update(bArr2, 0, this.digestBlockSize);
        }
    }

    public int getDigestBlockCount(int i) {
        return (i + this.digestOverhead) / this.digestBlockSize;
    }

    public byte[] getMACSecret() {
        return this.secret;
    }

    public int getSize() {
        return this.macLength;
    }

    public byte[] truncate(byte[] bArr) {
        int length = bArr.length;
        int i = this.macLength;
        return length <= i ? bArr : Arrays.copyOf(bArr, i);
    }
}
