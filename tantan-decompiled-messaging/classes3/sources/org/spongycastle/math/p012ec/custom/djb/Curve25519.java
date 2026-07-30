package org.spongycastle.math.p012ec.custom.djb;

import java.math.BigInteger;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Curve25519 extends ECCurve.AbstractFp {
    private static final int Curve25519_DEFAULT_COORDS = 4;

    /* JADX INFO: renamed from: q */
    public static final BigInteger f10415q = Nat256.toBigInteger(Curve25519Field.f10417P);
    protected Curve25519Point infinity;

    public Curve25519() {
        super(f10415q);
        this.infinity = new Curve25519Point(this, null, null);
        this.f10395a = fromBigInteger(new BigInteger(1, Hex.decode("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.f10396b = fromBigInteger(new BigInteger(1, Hex.decode("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.order = new BigInteger(1, Hex.decode("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.cofactor = BigInteger.valueOf(8L);
        this.coord = 4;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECCurve cloneCurve() {
        return new Curve25519();
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new Curve25519Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new Curve25519FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public int getFieldSize() {
        return f10415q.bitLength();
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f10415q;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 4;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new Curve25519Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
