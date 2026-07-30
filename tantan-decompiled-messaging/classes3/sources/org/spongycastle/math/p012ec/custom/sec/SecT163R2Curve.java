package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecT163R2Curve extends ECCurve.AbstractF2m {
    private static final int SecT163R2_DEFAULT_COORDS = 6;
    protected SecT163R2Point infinity;

    public SecT163R2Curve() {
        super(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 3, 6, 7);
        this.infinity = new SecT163R2Point(this, null, null);
        this.f10395a = fromBigInteger(BigInteger.valueOf(1L));
        this.f10396b = fromBigInteger(new BigInteger(1, Hex.decode("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.order = new BigInteger(1, Hex.decode("040000000000000000000292FE77E70C12A4234C33"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT163R2Curve();
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT163R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT163FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public int getFieldSize() {
        return CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
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

    @Override // org.spongycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT163R2Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
