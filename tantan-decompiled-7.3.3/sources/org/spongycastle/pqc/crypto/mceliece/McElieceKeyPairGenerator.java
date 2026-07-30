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
public class McElieceKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    private int fieldPoly;
    private boolean initialized = false;

    /* JADX INFO: renamed from: m */
    private int f207839m;
    private McElieceKeyGenerationParameters mcElieceParams;

    /* JADX INFO: renamed from: n */
    private int f207840n;
    private SecureRandom random;

    /* JADX INFO: renamed from: t */
    private int f207841t;

    private AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        GF2mField gF2mField = new GF2mField(this.f207839m, this.fieldPoly);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f207841t, 'I', this.random);
        PolynomialGF2mSmallM[] squareRootMatrix = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
        GF2Matrix gF2MatrixCreateCanonicalCheckMatrix = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        GoppaCode.MaMaPe maMaPeComputeSystematicForm = GoppaCode.computeSystematicForm(gF2MatrixCreateCanonicalCheckMatrix, this.random);
        GF2Matrix secondMatrix = maMaPeComputeSystematicForm.getSecondMatrix();
        Permutation permutation = maMaPeComputeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        GF2Matrix gF2MatrixExtendLeftCompactForm = gF2Matrix.extendLeftCompactForm();
        int numRows = gF2Matrix.getNumRows();
        GF2Matrix[] gF2MatrixArrCreateRandomRegularMatrixAndItsInverse = GF2Matrix.createRandomRegularMatrixAndItsInverse(numRows, this.random);
        Permutation permutation2 = new Permutation(this.f207840n, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McEliecePublicKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.1", this.f207840n, this.f207841t, (GF2Matrix) ((GF2Matrix) gF2MatrixArrCreateRandomRegularMatrixAndItsInverse[0].rightMultiply(gF2MatrixExtendLeftCompactForm)).rightMultiply(permutation2), this.mcElieceParams.getParameters()), (AsymmetricKeyParameter) new McEliecePrivateKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.1", this.f207840n, numRows, gF2mField, polynomialGF2mSmallM, gF2MatrixArrCreateRandomRegularMatrixAndItsInverse[1], permutation, permutation2, gF2MatrixCreateCanonicalCheckMatrix, squareRootMatrix, this.mcElieceParams.getParameters()));
    }

    private void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.mcElieceParams = (McElieceKeyGenerationParameters) keyGenerationParameters;
        this.random = new SecureRandom();
        this.f207839m = this.mcElieceParams.getParameters().getM();
        this.f207840n = this.mcElieceParams.getParameters().getN();
        this.f207841t = this.mcElieceParams.getParameters().getT();
        this.fieldPoly = this.mcElieceParams.getParameters().getFieldPoly();
        this.initialized = true;
    }

    private void initializeDefault() {
        initialize(new McElieceKeyGenerationParameters(new SecureRandom(), new McElieceParameters()));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }
}
