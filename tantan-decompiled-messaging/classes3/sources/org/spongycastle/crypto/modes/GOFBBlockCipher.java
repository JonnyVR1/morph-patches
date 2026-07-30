package org.spongycastle.crypto.modes;

import l.ig3;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.math.p012ec.Tnaf;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GOFBBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: C1 */
    static final int f10286C1 = 16843012;

    /* JADX INFO: renamed from: C2 */
    static final int f10287C2 = 16843009;

    /* JADX INFO: renamed from: IV */
    private byte[] f10288IV;

    /* JADX INFO: renamed from: N3 */
    int f10289N3;

    /* JADX INFO: renamed from: N4 */
    int f10290N4;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    boolean firstStep;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public GOFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.firstStep = true;
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize != 8) {
            ig3.a("GCTR only for 64 bit block ciphers");
            throw null;
        }
        this.f10288IV = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    private int bytesToint(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) + ((bArr[i + 2] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    private void intTobytes(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    @Override // org.spongycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        if (this.byteCount == 0) {
            if (this.firstStep) {
                this.firstStep = false;
                this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
                this.f10289N3 = bytesToint(this.ofbOutV, 0);
                this.f10290N4 = bytesToint(this.ofbOutV, 4);
            }
            int i = this.f10289N3 + 16843009;
            this.f10289N3 = i;
            this.f10290N4 += 16843012;
            intTobytes(i, this.ofbV, 0);
            intTobytes(this.f10290N4, this.ofbV, 4);
            this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i2 = this.byteCount;
        int i3 = i2 + 1;
        this.byteCount = i3;
        byte b2 = (byte) (b ^ bArr[i2]);
        int i4 = this.blockSize;
        if (i3 == i4) {
            this.byteCount = 0;
            byte[] bArr2 = this.ofbV;
            System.arraycopy(bArr2, i4, bArr2, 0, bArr2.length - i4);
            byte[] bArr3 = this.ofbOutV;
            byte[] bArr4 = this.ofbV;
            int length = bArr4.length;
            int i5 = this.blockSize;
            System.arraycopy(bArr3, 0, bArr4, length - i5, i5);
        }
        return b2;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCTR";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.firstStep = true;
        this.f10289N3 = 0;
        this.f10290N4 = 0;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            reset();
            if (cipherParameters != null) {
                this.cipher.init(true, cipherParameters);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        byte[] bArr = this.f10288IV;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            int i = 0;
            while (true) {
                byte[] bArr2 = this.f10288IV;
                if (i >= bArr2.length - iv.length) {
                    break;
                }
                bArr2[i] = 0;
                i++;
            }
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        if (parametersWithIV.getParameters() != null) {
            this.cipher.init(true, parametersWithIV.getParameters());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        this.firstStep = true;
        this.f10289N3 = 0;
        this.f10290N4 = 0;
        byte[] bArr = this.f10288IV;
        System.arraycopy(bArr, 0, this.ofbV, 0, bArr.length);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
