package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class PKCS5S2ParametersGenerator extends PBEParametersGenerator {
    private Mac hMac;
    private byte[] state;

    public PKCS5S2ParametersGenerator(Digest digest) {
        HMac hMac = new HMac(digest);
        this.hMac = hMac;
        this.state = new byte[hMac.getMacSize()];
    }

    /* JADX INFO: renamed from: F */
    private void m222468F(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2) {
        if (i == 0) {
            wg3.m206174a("iteration count must be at least 1.");
            return;
        }
        if (bArr != null) {
            this.hMac.update(bArr, 0, bArr.length);
        }
        this.hMac.update(bArr2, 0, bArr2.length);
        this.hMac.doFinal(this.state, 0);
        byte[] bArr4 = this.state;
        System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
        for (int i3 = 1; i3 < i; i3++) {
            Mac mac = this.hMac;
            byte[] bArr5 = this.state;
            mac.update(bArr5, 0, bArr5.length);
            this.hMac.doFinal(this.state, 0);
            int i4 = 0;
            while (true) {
                byte[] bArr6 = this.state;
                if (i4 != bArr6.length) {
                    int i5 = i2 + i4;
                    bArr3[i5] = (byte) (bArr6[i4] ^ bArr3[i5]);
                    i4++;
                }
            }
        }
    }

    private byte[] generateDerivedKey(int i) {
        int i2;
        int macSize = this.hMac.getMacSize();
        int i3 = ((i + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i3 * macSize];
        this.hMac.init(new KeyParameter(this.password));
        int i4 = 0;
        for (int i5 = 1; i5 <= i3; i5++) {
            while (true) {
                byte b = (byte) (bArr[i2] + 1);
                bArr[i2] = b;
                i2 = b == 0 ? i2 - 1 : 3;
            }
            m222468F(this.salt, this.iterationCount, bArr, bArr2, i4);
            i4 += macSize;
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] bArrGenerateDerivedKey = generateDerivedKey(i3 + i4);
        return new ParametersWithIV(new KeyParameter(bArrGenerateDerivedKey, 0, i3), bArrGenerateDerivedKey, i3, i4);
    }

    public PKCS5S2ParametersGenerator() {
        this(new SHA1Digest());
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(Arrays.copyOfRange(generateDerivedKey(i2), 0, i2), 0, i2);
    }
}
