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
public class DHDomainParameters extends ASN1Object {

    /* JADX INFO: renamed from: g */
    private ASN1Integer f207235g;

    /* JADX INFO: renamed from: j */
    private ASN1Integer f207236j;

    /* JADX INFO: renamed from: p */
    private ASN1Integer f207237p;

    /* JADX INFO: renamed from: q */
    private ASN1Integer f207238q;
    private DHValidationParms validationParms;

    private DHDomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f207237p = ASN1Integer.getInstance(objects.nextElement());
        this.f207235g = ASN1Integer.getInstance(objects.nextElement());
        this.f207238q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next != null && (next instanceof ASN1Integer)) {
            this.f207236j = ASN1Integer.getInstance(next);
            next = getNext(objects);
        }
        if (next != null) {
            this.validationParms = DHValidationParms.getInstance(next.toASN1Primitive());
        }
    }

    public static DHDomainParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof DHDomainParameters)) {
            return (DHDomainParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new DHDomainParameters((ASN1Sequence) obj);
        }
        wg3.m206174a("Invalid DHDomainParameters: ".concat(obj.getClass().getName()));
        return null;
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public ASN1Integer getG() {
        return this.f207235g;
    }

    public ASN1Integer getJ() {
        return this.f207236j;
    }

    public ASN1Integer getP() {
        return this.f207237p;
    }

    public ASN1Integer getQ() {
        return this.f207238q;
    }

    public DHValidationParms getValidationParms() {
        return this.validationParms;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f207237p);
        aSN1EncodableVector.add(this.f207235g);
        aSN1EncodableVector.add(this.f207238q);
        ASN1Integer aSN1Integer = this.f207236j;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        DHValidationParms dHValidationParms = this.validationParms;
        if (dHValidationParms != null) {
            aSN1EncodableVector.add(dHValidationParms);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static DHDomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public DHDomainParameters(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, ASN1Integer aSN1Integer3, ASN1Integer aSN1Integer4, DHValidationParms dHValidationParms) {
        if (aSN1Integer == null) {
            wg3.m206174a("'p' cannot be null");
            throw null;
        }
        if (aSN1Integer2 == null) {
            wg3.m206174a("'g' cannot be null");
            throw null;
        }
        if (aSN1Integer3 != null) {
            this.f207237p = aSN1Integer;
            this.f207235g = aSN1Integer2;
            this.f207238q = aSN1Integer3;
            this.f207236j = aSN1Integer4;
            this.validationParms = dHValidationParms;
            return;
        }
        wg3.m206174a("'q' cannot be null");
        throw null;
    }

    public DHDomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParms dHValidationParms) {
        if (bigInteger == null) {
            wg3.m206174a("'p' cannot be null");
            throw null;
        }
        if (bigInteger2 == null) {
            wg3.m206174a("'g' cannot be null");
            throw null;
        }
        if (bigInteger3 != null) {
            this.f207237p = new ASN1Integer(bigInteger);
            this.f207235g = new ASN1Integer(bigInteger2);
            this.f207238q = new ASN1Integer(bigInteger3);
            this.f207236j = new ASN1Integer(bigInteger4);
            this.validationParms = dHValidationParms;
            return;
        }
        wg3.m206174a("'q' cannot be null");
        throw null;
    }
}
