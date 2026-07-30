package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Nat192;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecT163FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected long[] f10483x;

    public SecT163FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            ig3.a("x value invalid for SecT163FieldElement");
            throw null;
        }
        this.f10483x = SecT163Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.add(this.f10483x, ((SecT163FieldElement) eCFieldElement).f10483x, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.addOne(this.f10483x, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT163FieldElement) {
            return Nat192.eq64(this.f10483x, ((SecT163FieldElement) obj).f10483x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecT163Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }

    public int getM() {
        return CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    }

    public int getRepresentation() {
        return 3;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10483x, 0, 3) ^ 163763;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.invert(this.f10483x, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne64(this.f10483x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero64(this.f10483x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.multiply(this.f10483x, ((SecT163FieldElement) eCFieldElement).f10483x, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f10483x;
        long[] jArr2 = ((SecT163FieldElement) eCFieldElement).f10483x;
        long[] jArr3 = ((SecT163FieldElement) eCFieldElement2).f10483x;
        long[] jArr4 = ((SecT163FieldElement) eCFieldElement3).f10483x;
        long[] jArrCreateExt64 = Nat192.createExt64();
        SecT163Field.multiplyAddToExt(jArr, jArr2, jArrCreateExt64);
        SecT163Field.multiplyAddToExt(jArr3, jArr4, jArrCreateExt64);
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.sqrt(this.f10483x, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.square(this.f10483x, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f10483x;
        long[] jArr2 = ((SecT163FieldElement) eCFieldElement).f10483x;
        long[] jArr3 = ((SecT163FieldElement) eCFieldElement2).f10483x;
        long[] jArrCreateExt64 = Nat192.createExt64();
        SecT163Field.squareAddToExt(jArr, jArrCreateExt64);
        SecT163Field.multiplyAddToExt(jArr2, jArr3, jArrCreateExt64);
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squarePow(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat192.create64();
        SecT163Field.squareN(this.f10483x, i, jArrCreate64);
        return new SecT163FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f10483x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger64(this.f10483x);
    }

    public SecT163FieldElement() {
        this.f10483x = Nat192.create64();
    }

    public SecT163FieldElement(long[] jArr) {
        this.f10483x = jArr;
    }
}
