package org.spongycastle.crypto.modes;

import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.macs.CMac;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import p003l.C0303g;
import p003l.dql;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EAXBlockCipher implements AEADBlockCipher {
    private static final byte cTAG = 2;
    private static final byte hTAG = 1;
    private static final byte nTAG = 0;
    private byte[] associatedTextMac;
    private int blockSize;
    private byte[] bufBlock;
    private int bufOff;
    private SICBlockCipher cipher;
    private boolean cipherInitialized;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private Mac mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonceMac;

    public EAXBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        CMac cMac = new CMac(blockCipher);
        this.mac = cMac;
        this.macBlock = new byte[this.blockSize];
        this.associatedTextMac = new byte[cMac.getMacSize()];
        this.nonceMac = new byte[this.mac.getMacSize()];
        this.cipher = new SICBlockCipher(blockCipher);
    }

    private void calculateMac() {
        byte[] bArr = new byte[this.blockSize];
        int i = 0;
        this.mac.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.macBlock;
            if (i >= bArr2.length) {
                return;
            }
            bArr2[i] = (byte) ((this.nonceMac[i] ^ this.associatedTextMac[i]) ^ bArr[i]);
            i++;
        }
    }

    private void initCipher() {
        if (this.cipherInitialized) {
            return;
        }
        this.cipherInitialized = true;
        this.mac.doFinal(this.associatedTextMac, 0);
        int i = this.blockSize;
        byte[] bArr = new byte[i];
        bArr[i - 1] = cTAG;
        this.mac.update(bArr, 0, i);
    }

    private int process(byte b, byte[] bArr, int i) {
        int iProcessBlock;
        byte[] bArr2 = this.bufBlock;
        int i2 = this.bufOff;
        int i3 = i2 + 1;
        this.bufOff = i3;
        bArr2[i2] = b;
        if (i3 == bArr2.length) {
            int length = bArr.length;
            int i4 = this.blockSize;
            if (length >= i + i4) {
                if (this.forEncryption) {
                    iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i);
                    this.mac.update(bArr, i, this.blockSize);
                } else {
                    this.mac.update(bArr2, 0, i4);
                    iProcessBlock = this.cipher.processBlock(this.bufBlock, 0, bArr, i);
                }
                this.bufOff = 0;
                if (!this.forEncryption) {
                    byte[] bArr3 = this.bufBlock;
                    System.arraycopy(bArr3, this.blockSize, bArr3, 0, this.macSize);
                    this.bufOff = this.macSize;
                }
                return iProcessBlock;
            }
            C0303g.m4499a("Output buffer is too short");
        }
        return 0;
    }

    private void reset(boolean z) {
        this.cipher.reset();
        this.mac.reset();
        this.bufOff = 0;
        Arrays.fill(this.bufBlock, (byte) 0);
        if (z) {
            Arrays.fill(this.macBlock, (byte) 0);
        }
        int i = this.blockSize;
        byte[] bArr = new byte[i];
        bArr[i - 1] = hTAG;
        this.mac.update(bArr, 0, i);
        this.cipherInitialized = false;
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    private boolean verifyMac(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.macSize; i3++) {
            i2 |= this.macBlock[i3] ^ bArr[i + i3];
        }
        return i2 == 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        initCipher();
        int i2 = this.bufOff;
        byte[] bArr2 = this.bufBlock;
        byte[] bArr3 = new byte[bArr2.length];
        this.bufOff = 0;
        if (this.forEncryption) {
            int i3 = i + i2;
            if (bArr.length < this.macSize + i3) {
                C0303g.m4499a("Output buffer too short");
                return 0;
            }
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i, i2);
            this.mac.update(bArr3, 0, i2);
            calculateMac();
            System.arraycopy(this.macBlock, 0, bArr, i3, this.macSize);
            reset(false);
            return i2 + this.macSize;
        }
        int i4 = this.macSize;
        if (i2 < i4) {
            dql.m3633a("data too short");
            return 0;
        }
        if (bArr.length < (i + i2) - i4) {
            C0303g.m4499a("Output buffer too short");
            return 0;
        }
        if (i2 > i4) {
            this.mac.update(bArr2, 0, i2 - i4);
            this.cipher.processBlock(this.bufBlock, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i, i2 - this.macSize);
        }
        calculateMac();
        if (verifyMac(this.bufBlock, i2 - this.macSize)) {
            reset(false);
            return i2 - this.macSize;
        }
        dql.m3633a("mac check in EAX failed");
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + "/EAX";
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        int i = this.macSize;
        byte[] bArr = new byte[i];
        System.arraycopy(this.macBlock, 0, bArr, 0, i);
        return bArr;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + this.bufOff;
        boolean z = this.forEncryption;
        int i3 = this.macSize;
        if (z) {
            return i2 + i3;
        }
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher.getUnderlyingCipher();
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        if (!this.forEncryption) {
            int i3 = this.macSize;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % this.blockSize);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        CipherParameters parameters;
        this.forEncryption = z;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                ig3.a("invalid parameters passed to EAX");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.mac.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        }
        int i = this.blockSize;
        if (!z) {
            i += this.macSize;
        }
        this.bufBlock = new byte[i];
        byte[] bArr = new byte[this.blockSize];
        this.mac.init(parameters);
        int i2 = this.blockSize;
        bArr[i2 - 1] = 0;
        this.mac.update(bArr, 0, i2);
        this.mac.update(iv, 0, iv.length);
        this.mac.doFinal(this.nonceMac, 0);
        this.cipher.init(true, new ParametersWithIV(null, this.nonceMac));
        reset();
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b) {
        if (this.cipherInitialized) {
            qkq0.a("AAD data cannot be added after encryption/decryption processing has begun.");
        } else {
            this.mac.update(b);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (this.cipherInitialized) {
            qkq0.a("AAD data cannot be added after encryption/decryption processing has begun.");
        } else {
            this.mac.update(bArr, i, i2);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        initCipher();
        return process(b, bArr, i);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        initCipher();
        if (bArr.length < i + i2) {
            npk0.m6558a("Input buffer too short");
            return 0;
        }
        int iProcess = 0;
        for (int i4 = 0; i4 != i2; i4++) {
            iProcess += process(bArr[i + i4], bArr2, i3 + iProcess);
        }
        return iProcess;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }
}
