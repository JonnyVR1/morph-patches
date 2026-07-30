package org.spongycastle.crypto.engines;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.EphemeralKeyPair;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.KeyParser;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.IESParameters;
import org.spongycastle.crypto.params.IESWithCipherParameters;
import org.spongycastle.crypto.params.KDFParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Pack;
import p003l.dql;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IESEngine {

    /* JADX INFO: renamed from: IV */
    private byte[] f10180IV;

    /* JADX INFO: renamed from: V */
    byte[] f10181V;
    BasicAgreement agree;
    BufferedBlockCipher cipher;
    boolean forEncryption;
    DerivationFunction kdf;
    private EphemeralKeyPairGenerator keyPairGenerator;
    private KeyParser keyParser;
    Mac mac;
    byte[] macBuf;
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.cipher = null;
    }

    private byte[] decryptBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        int iDoFinal;
        byte[] bArr4;
        if (i2 < this.f10181V.length + this.mac.getMacSize()) {
            dql.m3633a("Length of input must be greater than the MAC and V combined");
            return null;
        }
        if (this.cipher == null) {
            iDoFinal = (i2 - this.f10181V.length) - this.mac.getMacSize();
            byte[] bArr5 = new byte[iDoFinal];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i3 = iDoFinal + macKeySize;
            byte[] bArr6 = new byte[i3];
            this.kdf.generateBytes(bArr6, 0, i3);
            if (this.f10181V.length != 0) {
                System.arraycopy(bArr6, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr6, macKeySize, bArr5, 0, iDoFinal);
            } else {
                System.arraycopy(bArr6, 0, bArr5, 0, iDoFinal);
                System.arraycopy(bArr6, iDoFinal, bArr2, 0, macKeySize);
            }
            bArr4 = new byte[iDoFinal];
            for (int i4 = 0; i4 != iDoFinal; i4++) {
                bArr4[i4] = (byte) (bArr[(this.f10181V.length + i) + i4] ^ bArr5[i4]);
            }
            bArr3 = bArr;
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize2];
            int i5 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i5];
            this.kdf.generateBytes(bArr8, 0, i5);
            System.arraycopy(bArr8, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr2, 0, macKeySize2);
            byte[] bArr9 = this.f10180IV;
            BufferedBlockCipher bufferedBlockCipher = this.cipher;
            if (bArr9 != null) {
                bufferedBlockCipher.init(false, new ParametersWithIV(new KeyParameter(bArr7), this.f10180IV));
            } else {
                bufferedBlockCipher.init(false, new KeyParameter(bArr7));
            }
            byte[] bArr10 = new byte[this.cipher.getOutputSize((i2 - this.f10181V.length) - this.mac.getMacSize())];
            BufferedBlockCipher bufferedBlockCipher2 = this.cipher;
            byte[] bArr11 = this.f10181V;
            bArr3 = bArr;
            int iProcessBytes = bufferedBlockCipher2.processBytes(bArr3, i + bArr11.length, (i2 - bArr11.length) - this.mac.getMacSize(), bArr10, 0);
            iDoFinal = this.cipher.doFinal(bArr10, iProcessBytes) + iProcessBytes;
            bArr4 = bArr10;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] lengthTag = this.f10181V.length != 0 ? getLengthTag(encodingV) : null;
        int i6 = i + i2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, i6 - this.mac.getMacSize(), i6);
        int length = bArrCopyOfRange.length;
        byte[] bArr12 = new byte[length];
        this.mac.init(new KeyParameter(bArr2));
        Mac mac = this.mac;
        byte[] bArr13 = this.f10181V;
        mac.update(bArr3, i + bArr13.length, (i2 - bArr13.length) - length);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f10181V.length != 0) {
            this.mac.update(lengthTag, 0, lengthTag.length);
        }
        this.mac.doFinal(bArr12, 0);
        if (Arrays.constantTimeAreEqual(bArrCopyOfRange, bArr12)) {
            return Arrays.copyOfRange(bArr4, 0, iDoFinal);
        }
        dql.m3633a("Invalid MAC.");
        return null;
    }

    private byte[] encryptBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        if (this.cipher == null) {
            byte[] bArr4 = new byte[i2];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i3 = i2 + macKeySize;
            byte[] bArr5 = new byte[i3];
            this.kdf.generateBytes(bArr5, 0, i3);
            if (this.f10181V.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, i2);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i2);
                System.arraycopy(bArr5, i2, bArr2, 0, macKeySize);
            }
            bArr3 = new byte[i2];
            for (int i4 = 0; i4 != i2; i4++) {
                bArr3[i4] = (byte) (bArr[i + i4] ^ bArr4[i4]);
            }
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr6 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            byte[] bArr7 = new byte[macKeySize2];
            int i5 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i5];
            this.kdf.generateBytes(bArr8, 0, i5);
            System.arraycopy(bArr8, 0, bArr6, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr7, 0, macKeySize2);
            byte[] bArr9 = this.f10180IV;
            BufferedBlockCipher bufferedBlockCipher = this.cipher;
            if (bArr9 != null) {
                bufferedBlockCipher.init(true, new ParametersWithIV(new KeyParameter(bArr6), this.f10180IV));
            } else {
                bufferedBlockCipher.init(true, new KeyParameter(bArr6));
            }
            byte[] bArr10 = new byte[this.cipher.getOutputSize(i2)];
            int iProcessBytes = this.cipher.processBytes(bArr, i, i2, bArr10, 0);
            i2 = iProcessBytes + this.cipher.doFinal(bArr10, iProcessBytes);
            bArr2 = bArr7;
            bArr3 = bArr10;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] lengthTag = this.f10181V.length != 0 ? getLengthTag(encodingV) : null;
        int macSize = this.mac.getMacSize();
        byte[] bArr11 = new byte[macSize];
        this.mac.init(new KeyParameter(bArr2));
        this.mac.update(bArr3, 0, bArr3.length);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f10181V.length != 0) {
            this.mac.update(lengthTag, 0, lengthTag.length);
        }
        this.mac.doFinal(bArr11, 0);
        byte[] bArr12 = this.f10181V;
        byte[] bArr13 = new byte[bArr12.length + i2 + macSize];
        System.arraycopy(bArr12, 0, bArr13, 0, bArr12.length);
        System.arraycopy(bArr3, 0, bArr13, this.f10181V.length, i2);
        System.arraycopy(bArr11, 0, bArr13, this.f10181V.length + i2, macSize);
        return bArr13;
    }

    private void extractParams(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            this.f10180IV = null;
            this.param = (IESParameters) cipherParameters;
        } else {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f10180IV = parametersWithIV.getIV();
            this.param = (IESParameters) parametersWithIV.getParameters();
        }
    }

    public BufferedBlockCipher getCipher() {
        return this.cipher;
    }

    public byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            Pack.longToBigEndian(((long) bArr.length) * 8, bArr2, 0);
        }
        return bArr2;
    }

    public Mac getMac() {
        return this.mac;
    }

    public void init(boolean z, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
        this.forEncryption = z;
        this.privParam = cipherParameters;
        this.pubParam = cipherParameters2;
        this.f10181V = new byte[0];
        extractParams(cipherParameters3);
    }

    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.forEncryption) {
            EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.keyPairGenerator;
            if (ephemeralKeyPairGenerator != null) {
                EphemeralKeyPair ephemeralKeyPairGenerate = ephemeralKeyPairGenerator.generate();
                this.privParam = ephemeralKeyPairGenerate.getKeyPair().getPrivate();
                this.f10181V = ephemeralKeyPairGenerate.getEncodedPublicKey();
            }
        } else if (this.keyParser != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
            try {
                this.pubParam = this.keyParser.readKey(byteArrayInputStream);
                this.f10181V = Arrays.copyOfRange(bArr, i, (i2 - byteArrayInputStream.available()) + i);
            } catch (IOException e) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e.getMessage(), e);
            }
        }
        this.agree.init(this.privParam);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.agree.getFieldSize(), this.agree.calculateAgreement(this.pubParam));
        byte[] bArr2 = this.f10181V;
        if (bArr2.length != 0) {
            byte[] bArrConcatenate = Arrays.concatenate(bArr2, bArrAsUnsignedByteArray);
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            bArrAsUnsignedByteArray = bArrConcatenate;
        }
        try {
            this.kdf.init(new KDFParameters(bArrAsUnsignedByteArray, this.param.getDerivationV()));
            return this.forEncryption ? encryptBlock(bArr, i, i2) : decryptBlock(bArr, i, i2);
        } finally {
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
        }
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.forEncryption = true;
        this.pubParam = asymmetricKeyParameter;
        this.keyPairGenerator = ephemeralKeyPairGenerator;
        extractParams(cipherParameters);
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, KeyParser keyParser) {
        this.forEncryption = false;
        this.privParam = asymmetricKeyParameter;
        this.keyParser = keyParser;
        extractParams(cipherParameters);
    }

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, BufferedBlockCipher bufferedBlockCipher) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.cipher = bufferedBlockCipher;
    }
}
