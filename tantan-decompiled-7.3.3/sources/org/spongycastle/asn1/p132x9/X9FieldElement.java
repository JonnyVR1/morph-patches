package org.spongycastle.asn1.p132x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.math.p135ec.ECFieldElement;

/* JADX INFO: loaded from: classes3.dex */
public class X9FieldElement extends ASN1Object {
    private static X9IntegerConverter converter = new X9IntegerConverter();

    /* JADX INFO: renamed from: f */
    protected ECFieldElement f207249f;

    public X9FieldElement(int i, int i2, int i3, int i4, ASN1OctetString aSN1OctetString) {
        this(new ECFieldElement.F2m(i, i2, i3, i4, new BigInteger(1, aSN1OctetString.getOctets())));
    }

    public ECFieldElement getValue() {
        return this.f207249f;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(converter.integerToBytes(this.f207249f.toBigInteger(), converter.getByteLength(this.f207249f)));
    }

    public X9FieldElement(BigInteger bigInteger, ASN1OctetString aSN1OctetString) {
        this(new ECFieldElement.C22396Fp(bigInteger, new BigInteger(1, aSN1OctetString.getOctets())));
    }

    public X9FieldElement(ECFieldElement eCFieldElement) {
        this.f207249f = eCFieldElement;
    }
}
