package org.spongycastle.asn1.p132x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import p153l.pvb;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ValidationParams extends ASN1Object {
    private ASN1Integer pgenCounter;
    private DERBitString seed;

    private ValidationParams(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        this.seed = DERBitString.getInstance(aSN1Sequence.getObjectAt(0));
        this.pgenCounter = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static ValidationParams getInstance(Object obj) {
        if (obj instanceof ValidationParams) {
            return (ValidationParams) obj;
        }
        if (obj != null) {
            return new ValidationParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getPgenCounter() {
        return this.pgenCounter.getPositiveValue();
    }

    public byte[] getSeed() {
        return this.seed.getBytes();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.seed);
        aSN1EncodableVector.add(this.pgenCounter);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ValidationParams getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public ValidationParams(DERBitString dERBitString, ASN1Integer aSN1Integer) {
        if (dERBitString == null) {
            wg3.m206174a("'seed' cannot be null");
            throw null;
        }
        if (aSN1Integer != null) {
            this.seed = dERBitString;
            this.pgenCounter = aSN1Integer;
        } else {
            wg3.m206174a("'pgenCounter' cannot be null");
            throw null;
        }
    }

    public ValidationParams(byte[] bArr, int i) {
        if (bArr != null) {
            this.seed = new DERBitString(bArr);
            this.pgenCounter = new ASN1Integer(i);
        } else {
            wg3.m206174a("'seed' cannot be null");
            throw null;
        }
    }
}
