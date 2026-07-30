package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECConstants;
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.math.p135ec.ECPoint;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ECDomainParameters implements ECConstants {

    /* JADX INFO: renamed from: G */
    private ECPoint f207630G;
    private ECCurve curve;

    /* JADX INFO: renamed from: h */
    private BigInteger f207631h;

    /* JADX INFO: renamed from: n */
    private BigInteger f207632n;
    private byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f207630G = eCPoint.normalize();
        this.f207632n = bigInteger;
        this.f207631h = bigInteger2;
        this.seed = bArr;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f207630G;
    }

    public BigInteger getH() {
        return this.f207631h;
    }

    public BigInteger getN() {
        return this.f207632n;
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
