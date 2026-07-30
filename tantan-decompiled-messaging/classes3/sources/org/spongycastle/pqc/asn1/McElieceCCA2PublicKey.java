package org.spongycastle.pqc.asn1;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class McElieceCCA2PublicKey extends ASN1Object {
    private byte[] matrixG;

    /* JADX INFO: renamed from: n */
    private int f10503n;
    private ASN1ObjectIdentifier oid;

    /* JADX INFO: renamed from: t */
    private int f10504t;

    private McElieceCCA2PublicKey(ASN1Sequence aSN1Sequence) {
        this.oid = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.f10503n = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue().intValue();
        this.f10504t = ((ASN1Integer) aSN1Sequence.getObjectAt(2)).getValue().intValue();
        this.matrixG = ((ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets();
    }

    public static McElieceCCA2PublicKey getInstance(Object obj) {
        if (obj instanceof McElieceCCA2PublicKey) {
            return (McElieceCCA2PublicKey) obj;
        }
        if (obj != null) {
            return new McElieceCCA2PublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.matrixG);
    }

    public int getN() {
        return this.f10503n;
    }

    public ASN1ObjectIdentifier getOID() {
        return this.oid;
    }

    public int getT() {
        return this.f10504t;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.oid);
        aSN1EncodableVector.add(new ASN1Integer(this.f10503n));
        aSN1EncodableVector.add(new ASN1Integer(this.f10504t));
        aSN1EncodableVector.add(new DEROctetString(this.matrixG));
        return new DERSequence(aSN1EncodableVector);
    }

    public McElieceCCA2PublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, int i2, GF2Matrix gF2Matrix) {
        this.oid = aSN1ObjectIdentifier;
        this.f10503n = i;
        this.f10504t = i2;
        this.matrixG = gF2Matrix.getEncoded();
    }
}
