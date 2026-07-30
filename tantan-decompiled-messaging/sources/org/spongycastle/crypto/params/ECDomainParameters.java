package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECConstants;
import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ECDomainParameters implements ECConstants {

    /* JADX INFO: renamed from: G */
    private ECPoint f206708G;
    private ECCurve curve;

    /* JADX INFO: renamed from: h */
    private BigInteger f206709h;

    /* JADX INFO: renamed from: n */
    private BigInteger f206710n;
    private byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f206708G = eCPoint.normalize();
        this.f206710n = bigInteger;
        this.f206709h = bigInteger2;
        this.seed = bArr;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f206708G;
    }

    public BigInteger getH() {
        return this.f206709h;
    }

    public BigInteger getN() {
        return this.f206710n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }
}
