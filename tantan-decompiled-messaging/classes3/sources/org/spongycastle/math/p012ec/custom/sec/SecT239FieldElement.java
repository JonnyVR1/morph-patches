package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecT239FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected long[] f10486x;

    public SecT239FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            ig3.a("x value invalid for SecT239FieldElement");
            throw null;
        }
        this.f10486x = SecT239Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.add(this.f10486x, ((SecT239FieldElement) eCFieldElement).f10486x, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.addOne(this.f10486x, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT239FieldElement) {
            return Nat256.eq64(this.f10486x, ((SecT239FieldElement) obj).f10486x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecT239Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return 239;
    }

    public int getK1() {
        return CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10486x, 0, 4) ^ 23900158;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.invert(this.f10486x, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne64(this.f10486x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero64(this.f10486x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.multiply(this.f10486x, ((SecT239FieldElement) eCFieldElement).f10486x, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f10486x;
        long[] jArr2 = ((SecT239FieldElement) eCFieldElement).f10486x;
        long[] jArr3 = ((SecT239FieldElement) eCFieldElement2).f10486x;
        long[] jArr4 = ((SecT239FieldElement) eCFieldElement3).f10486x;
        long[] jArrCreateExt64 = Nat256.createExt64();
        SecT239Field.multiplyAddToExt(jArr, jArr2, jArrCreateExt64);
        SecT239Field.multiplyAddToExt(jArr3, jArr4, jArrCreateExt64);
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.sqrt(this.f10486x, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.square(this.f10486x, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f10486x;
        long[] jArr2 = ((SecT239FieldElement) eCFieldElement).f10486x;
        long[] jArr3 = ((SecT239FieldElement) eCFieldElement2).f10486x;
        long[] jArrCreateExt64 = Nat256.createExt64();
        SecT239Field.squareAddToExt(jArr, jArrCreateExt64);
        SecT239Field.multiplyAddToExt(jArr2, jArr3, jArrCreateExt64);
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squarePow(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat256.create64();
        SecT239Field.squareN(this.f10486x, i, jArrCreate64);
        return new SecT239FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f10486x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger64(this.f10486x);
    }

    public SecT239FieldElement() {
        this.f10486x = Nat256.create64();
    }

    public SecT239FieldElement(long[] jArr) {
        this.f10486x = jArr;
    }
}
