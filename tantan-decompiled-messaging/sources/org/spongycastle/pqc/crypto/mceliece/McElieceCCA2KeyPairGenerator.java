package org.spongycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.GoppaCode;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2m;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceCCA2KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2";
    private int fieldPoly;
    private boolean initialized = false;

    /* JADX INFO: renamed from: m */
    private int f206904m;
    private McElieceCCA2KeyGenerationParameters mcElieceCCA2Params;

    /* JADX INFO: renamed from: n */
    private int f206905n;
    private SecureRandom random;

    /* JADX INFO: renamed from: t */
    private int f206906t;

    private void initializeDefault() {
        init(new McElieceCCA2KeyGenerationParameters(new SecureRandom(), new McElieceCCA2Parameters()));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        GF2mField gF2mField = new GF2mField(this.f206904m, this.fieldPoly);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f206906t, 'I', this.random);
        PolynomialGF2mSmallM[] squareRootMatrix = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
        GF2Matrix gF2MatrixCreateCanonicalCheckMatrix = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        GoppaCode.MaMaPe maMaPeComputeSystematicForm = GoppaCode.computeSystematicForm(gF2MatrixCreateCanonicalCheckMatrix, this.random);
        GF2Matrix secondMatrix = maMaPeComputeSystematicForm.getSecondMatrix();
        Permutation permutation = maMaPeComputeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McElieceCCA2PublicKeyParameters(OID, this.f206905n, this.f206906t, gF2Matrix, this.mcElieceCCA2Params.getParameters()), (AsymmetricKeyParameter) new McElieceCCA2PrivateKeyParameters(OID, this.f206905n, gF2Matrix.getNumRows(), gF2mField, polynomialGF2mSmallM, permutation, gF2MatrixCreateCanonicalCheckMatrix, squareRootMatrix, this.mcElieceCCA2Params.getParameters()));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.mcElieceCCA2Params = (McElieceCCA2KeyGenerationParameters) keyGenerationParameters;
        this.random = new SecureRandom();
        this.f206904m = this.mcElieceCCA2Params.getParameters().getM();
        this.f206905n = this.mcElieceCCA2Params.getParameters().getN();
        this.f206906t = this.mcElieceCCA2Params.getParameters().getT();
        this.fieldPoly = this.mcElieceCCA2Params.getParameters().getFieldPoly();
        this.initialized = true;
    }
}
