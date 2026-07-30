package org.spongycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: A1 */
    private short[][] f10609A1;
    private short[][] A1inv;

    /* JADX INFO: renamed from: A2 */
    private short[][] f10610A2;
    private short[][] A2inv;

    /* JADX INFO: renamed from: b1 */
    private short[] f10611b1;

    /* JADX INFO: renamed from: b2 */
    private short[] f10612b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;

    /* JADX INFO: renamed from: sr */
    private SecureRandom f10613sr;

    /* JADX INFO: renamed from: vi */
    private int[] f10614vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length, ((length2 + 1) * length2) / 2);
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < length2; i3++) {
                for (int i4 = i3; i4 < length2; i4++) {
                    short[][] sArr2 = this.pub_quadratic;
                    if (i4 == i3) {
                        sArr2[i][i2] = sArr[i][i3][i4];
                    } else {
                        short[] sArr3 = sArr2[i];
                        short[][] sArr4 = sArr[i];
                        sArr3[i2] = GF2Field.addElem(sArr4[i3][i4], sArr4[i4][i3]);
                    }
                    i2++;
                }
            }
        }
    }

    private void computePublicKey() {
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.f10614vi;
        boolean z = true;
        int i = 0;
        int i2 = iArr[iArr.length - 1] - iArr[0];
        int i3 = iArr[iArr.length - 1];
        int i4 = 3;
        int i5 = 2;
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i3);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) cls, i2, i3);
        this.pub_scalar = new short[i2];
        short[] sArr2 = new short[i3];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i6 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i6].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i6].getCoeffBeta();
            short[][] coeffGamma = this.layers[i6].getCoeffGamma();
            short[] coeffEta = this.layers[i6].getCoeffEta();
            boolean z2 = z;
            int length = coeffAlpha[i].length;
            int i8 = i;
            int length2 = coeffBeta[i8].length;
            int i9 = i5;
            int i10 = i8;
            while (i10 < length) {
                int i11 = i8;
                while (i11 < length) {
                    int i12 = i3;
                    int i13 = i8;
                    while (i13 < length2) {
                        int i14 = i13;
                        int i15 = length;
                        int i16 = i11 + length2;
                        short[] sArrMultVect = computeInField.multVect(coeffAlpha[i10][i11][i14], this.f10610A2[i16]);
                        int i17 = i7 + i10;
                        int i18 = i11;
                        sArr[i17] = computeInField.addSquareMatrix(sArr[i17], computeInField.multVects(sArrMultVect, this.f10610A2[i14]));
                        short[] sArrMultVect2 = computeInField.multVect(this.f10612b2[i14], sArrMultVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i17] = computeInField.addVect(sArrMultVect2, sArr3[i17]);
                        short[] sArrMultVect3 = computeInField.multVect(this.f10612b2[i16], computeInField.multVect(coeffAlpha[i10][i18][i14], this.f10610A2[i14]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i17] = computeInField.addVect(sArrMultVect3, sArr4[i17]);
                        short sMultElem = GF2Field.multElem(coeffAlpha[i10][i18][i14], this.f10612b2[i16]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i17] = GF2Field.addElem(sArr5[i17], GF2Field.multElem(sMultElem, this.f10612b2[i14]));
                        i13 = i14 + 1;
                        length = i15;
                        i11 = i18;
                    }
                    i11++;
                    i3 = i12;
                }
                int i19 = i3;
                int i20 = length;
                int i21 = i8;
                while (i21 < length2) {
                    int i22 = i8;
                    while (i22 < length2) {
                        int i23 = i21;
                        short[] sArrMultVect4 = computeInField.multVect(coeffBeta[i10][i21][i22], this.f10610A2[i23]);
                        int i24 = i7 + i10;
                        int i25 = i22;
                        sArr[i24] = computeInField.addSquareMatrix(sArr[i24], computeInField.multVects(sArrMultVect4, this.f10610A2[i25]));
                        short[] sArrMultVect5 = computeInField.multVect(this.f10612b2[i25], sArrMultVect4);
                        short[][] sArr6 = this.pub_singular;
                        sArr6[i24] = computeInField.addVect(sArrMultVect5, sArr6[i24]);
                        short[] sArrMultVect6 = computeInField.multVect(this.f10612b2[i23], computeInField.multVect(coeffBeta[i10][i23][i25], this.f10610A2[i25]));
                        short[][] sArr7 = this.pub_singular;
                        sArr7[i24] = computeInField.addVect(sArrMultVect6, sArr7[i24]);
                        short sMultElem2 = GF2Field.multElem(coeffBeta[i10][i23][i25], this.f10612b2[i23]);
                        short[] sArr8 = this.pub_scalar;
                        sArr8[i24] = GF2Field.addElem(sArr8[i24], GF2Field.multElem(sMultElem2, this.f10612b2[i25]));
                        i22 = i25 + 1;
                        i21 = i23;
                        length2 = length2;
                    }
                    i21++;
                }
                int i26 = length2;
                int i27 = i8;
                while (i27 < i26 + i20) {
                    short[] sArrMultVect7 = computeInField.multVect(coeffGamma[i10][i27], this.f10610A2[i27]);
                    short[][] sArr9 = this.pub_singular;
                    int i28 = i7 + i10;
                    int i29 = i27;
                    sArr9[i28] = computeInField.addVect(sArrMultVect7, sArr9[i28]);
                    short[] sArr10 = this.pub_scalar;
                    sArr10[i28] = GF2Field.addElem(sArr10[i28], GF2Field.multElem(coeffGamma[i10][i29], this.f10612b2[i29]));
                    i27 = i29 + 1;
                }
                short[] sArr11 = this.pub_scalar;
                int i30 = i7 + i10;
                sArr11[i30] = GF2Field.addElem(sArr11[i30], coeffEta[i10]);
                i10++;
                i3 = i19;
                length = i20;
                length2 = i26;
            }
            i7 += length;
            i6++;
            z = z2;
            i = i8;
            i5 = i9;
            i4 = 3;
        }
        int i31 = i3;
        boolean z3 = z;
        int i32 = i;
        int i33 = i5;
        int[] iArr2 = new int[i4];
        iArr2[i33] = i31;
        iArr2[z3 ? 1 : 0] = i31;
        iArr2[i32] = i2;
        short[][][] sArr12 = (short[][][]) Array.newInstance((Class<?>) cls, iArr2);
        int[] iArr3 = new int[i33];
        iArr3[z3 ? 1 : 0] = i31;
        iArr3[i32] = i2;
        short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) cls, iArr3);
        short[] sArr14 = new short[i2];
        for (int i34 = i32; i34 < i2; i34++) {
            int i35 = i32;
            while (true) {
                short[][] sArr15 = this.f10609A1;
                if (i35 < sArr15.length) {
                    sArr12[i34] = computeInField.addSquareMatrix(sArr12[i34], computeInField.multMatrix(sArr15[i34][i35], sArr[i35]));
                    sArr13[i34] = computeInField.addVect(sArr13[i34], computeInField.multVect(this.f10609A1[i34][i35], this.pub_singular[i35]));
                    sArr14[i34] = GF2Field.addElem(sArr14[i34], GF2Field.multElem(this.f10609A1[i34][i35], this.pub_scalar[i35]));
                    i35++;
                }
            }
            sArr14[i34] = GF2Field.addElem(sArr14[i34], this.f10611b1[i34]);
        }
        this.pub_singular = sArr13;
        this.pub_scalar = sArr14;
        compactPublicKey(sArr12);
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i = 0;
        while (i < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.f10614vi;
            int i2 = i + 1;
            layerArr[i] = new Layer(iArr[i], iArr[i2], this.f10613sr);
            i = i2;
        }
    }

    private void generateL1() {
        int[] iArr = this.f10614vi;
        int i = iArr[iArr.length - 1] - iArr[0];
        this.f10609A1 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.f10609A1[i2][i3] = (short) (this.f10613sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.f10609A1);
        }
        this.f10611b1 = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.f10611b1[i4] = (short) (this.f10613sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.f10614vi;
        int i = iArr[iArr.length - 1];
        this.f10610A2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.f10610A2[i2][i3] = (short) (this.f10613sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.f10610A2);
        }
        this.f10612b2 = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.f10612b2[i4] = (short) (this.f10613sr.nextInt() & 255);
        }
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(new SecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f10611b1, this.A2inv, this.f10612b2, this.f10614vi, this.layers);
        int[] iArr = this.f10614vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.rainbowParams = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.f10613sr = new SecureRandom();
        this.f10614vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }
}
