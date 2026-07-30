package org.spongycastle.asn1.p009x9;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class X9ECPoint extends ASN1Object {

    /* JADX INFO: renamed from: c */
    private ECCurve f9950c;
    private final ASN1OctetString encoding;

    /* JADX INFO: renamed from: p */
    private ECPoint f9951p;

    public X9ECPoint(ECPoint eCPoint, boolean z) {
        this.f9951p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z));
    }

    public ECPoint getPoint() {
        if (this.f9951p == null) {
            this.f9951p = this.f9950c.decodePoint(this.encoding.getOctets()).normalize();
        }
        return this.f9951p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b;
        byte[] octets = this.encoding.getOctets();
        return octets != null && octets.length > 0 && ((b = octets[0]) == 2 || b == 3);
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }

    public X9ECPoint(ECPoint eCPoint) {
        this(eCPoint, false);
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f9950c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }
}
