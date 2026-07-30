package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.math.p012ec.ECConstants;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECDomainParameters implements ECConstants {

    /* JADX INFO: renamed from: G */
    private ECPoint f10333G;
    private ECCurve curve;

    /* JADX INFO: renamed from: h */
    private BigInteger f10334h;

    /* JADX INFO: renamed from: n */
    private BigInteger f10335n;
    private byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f10333G = eCPoint.normalize();
        this.f10335n = bigInteger;
        this.f10334h = bigInteger2;
        this.seed = bArr;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f10333G;
    }

    public BigInteger getH() {
        return this.f10334h;
    }

    public BigInteger getN() {
        return this.f10335n;
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
