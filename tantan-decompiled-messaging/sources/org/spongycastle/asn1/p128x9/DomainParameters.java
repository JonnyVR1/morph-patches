package org.spongycastle.asn1.p128x9;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import p149l.bub;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DomainParameters extends ASN1Object {

    /* JADX INFO: renamed from: g */
    private final ASN1Integer f206318g;

    /* JADX INFO: renamed from: j */
    private final ASN1Integer f206319j;

    /* JADX INFO: renamed from: p */
    private final ASN1Integer f206320p;

    /* JADX INFO: renamed from: q */
    private final ASN1Integer f206321q;
    private final ValidationParams validationParams;

    private DomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            bub.m103905a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f206320p = ASN1Integer.getInstance(objects.nextElement());
        this.f206318g = ASN1Integer.getInstance(objects.nextElement());
        this.f206321q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next == null || !(next instanceof ASN1Integer)) {
            this.f206319j = null;
        } else {
            this.f206319j = ASN1Integer.getInstance(next);
            next = getNext(objects);
        }
        if (next != null) {
            this.validationParams = ValidationParams.getInstance(next.toASN1Primitive());
        } else {
            this.validationParams = null;
        }
    }

    public static DomainParameters getInstance(Object obj) {
        if (obj instanceof DomainParameters) {
            return (DomainParameters) obj;
        }
        if (obj != null) {
            return new DomainParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger getG() {
        return this.f206318g.getPositiveValue();
    }

    public BigInteger getJ() {
        ASN1Integer aSN1Integer = this.f206319j;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f206320p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f206321q.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.validationParams;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f206320p);
        aSN1EncodableVector.add(this.f206318g);
        aSN1EncodableVector.add(this.f206321q);
        ASN1Integer aSN1Integer = this.f206319j;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ValidationParams validationParams = this.validationParams;
        if (validationParams != null) {
            aSN1EncodableVector.add(validationParams);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static DomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public DomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ValidationParams validationParams) {
        if (bigInteger == null) {
            ig3.m135964a("'p' cannot be null");
            throw null;
        }
        if (bigInteger2 == null) {
            ig3.m135964a("'g' cannot be null");
            throw null;
        }
        if (bigInteger3 != null) {
            this.f206320p = new ASN1Integer(bigInteger);
            this.f206318g = new ASN1Integer(bigInteger2);
            this.f206321q = new ASN1Integer(bigInteger3);
            if (bigInteger4 != null) {
                this.f206319j = new ASN1Integer(bigInteger4);
            } else {
                this.f206319j = null;
            }
            this.validationParams = validationParams;
            return;
        }
        ig3.m135964a("'q' cannot be null");
        throw null;
    }
}
