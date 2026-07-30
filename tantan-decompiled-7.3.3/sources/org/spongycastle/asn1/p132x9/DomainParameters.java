package org.spongycastle.asn1.p132x9;

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
import p153l.pvb;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DomainParameters extends ASN1Object {

    /* JADX INFO: renamed from: g */
    private final ASN1Integer f207240g;

    /* JADX INFO: renamed from: j */
    private final ASN1Integer f207241j;

    /* JADX INFO: renamed from: p */
    private final ASN1Integer f207242p;

    /* JADX INFO: renamed from: q */
    private final ASN1Integer f207243q;
    private final ValidationParams validationParams;

    private DomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f207242p = ASN1Integer.getInstance(objects.nextElement());
        this.f207240g = ASN1Integer.getInstance(objects.nextElement());
        this.f207243q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next == null || !(next instanceof ASN1Integer)) {
            this.f207241j = null;
        } else {
            this.f207241j = ASN1Integer.getInstance(next);
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
        return this.f207240g.getPositiveValue();
    }

    public BigInteger getJ() {
        ASN1Integer aSN1Integer = this.f207241j;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f207242p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f207243q.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.validationParams;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f207242p);
        aSN1EncodableVector.add(this.f207240g);
        aSN1EncodableVector.add(this.f207243q);
        ASN1Integer aSN1Integer = this.f207241j;
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
            wg3.m206174a("'p' cannot be null");
            throw null;
        }
        if (bigInteger2 == null) {
            wg3.m206174a("'g' cannot be null");
            throw null;
        }
        if (bigInteger3 != null) {
            this.f207242p = new ASN1Integer(bigInteger);
            this.f207240g = new ASN1Integer(bigInteger2);
            this.f207243q = new ASN1Integer(bigInteger3);
            if (bigInteger4 != null) {
                this.f207241j = new ASN1Integer(bigInteger4);
            } else {
                this.f207241j = null;
            }
            this.validationParams = validationParams;
            return;
        }
        wg3.m206174a("'q' cannot be null");
        throw null;
    }
}
