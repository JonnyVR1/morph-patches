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
public class DHDomainParameters extends ASN1Object {

    /* JADX INFO: renamed from: g */
    private ASN1Integer f206313g;

    /* JADX INFO: renamed from: j */
    private ASN1Integer f206314j;

    /* JADX INFO: renamed from: p */
    private ASN1Integer f206315p;

    /* JADX INFO: renamed from: q */
    private ASN1Integer f206316q;
    private DHValidationParms validationParms;

    private DHDomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            bub.m103905a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f206315p = ASN1Integer.getInstance(objects.nextElement());
        this.f206313g = ASN1Integer.getInstance(objects.nextElement());
        this.f206316q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next != null && (next instanceof ASN1Integer)) {
            this.f206314j = ASN1Integer.getInstance(next);
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
        ig3.m135964a("Invalid DHDomainParameters: ".concat(obj.getClass().getName()));
        return null;
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public ASN1Integer getG() {
        return this.f206313g;
    }

    public ASN1Integer getJ() {
        return this.f206314j;
    }

    public ASN1Integer getP() {
        return this.f206315p;
    }

    public ASN1Integer getQ() {
        return this.f206316q;
    }

    public DHValidationParms getValidationParms() {
        return this.validationParms;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f206315p);
        aSN1EncodableVector.add(this.f206313g);
        aSN1EncodableVector.add(this.f206316q);
        ASN1Integer aSN1Integer = this.f206314j;
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
            ig3.m135964a("'p' cannot be null");
            throw null;
        }
        if (aSN1Integer2 == null) {
            ig3.m135964a("'g' cannot be null");
            throw null;
        }
        if (aSN1Integer3 != null) {
            this.f206315p = aSN1Integer;
            this.f206313g = aSN1Integer2;
            this.f206316q = aSN1Integer3;
            this.f206314j = aSN1Integer4;
            this.validationParms = dHValidationParms;
            return;
        }
        ig3.m135964a("'q' cannot be null");
        throw null;
    }

    public DHDomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParms dHValidationParms) {
        if (bigInteger == null) {
            ig3.m135964a("'p' cannot be null");
            throw null;
        }
        if (bigInteger2 == null) {
            ig3.m135964a("'g' cannot be null");
            throw null;
        }
        if (bigInteger3 != null) {
            this.f206315p = new ASN1Integer(bigInteger);
            this.f206313g = new ASN1Integer(bigInteger2);
            this.f206316q = new ASN1Integer(bigInteger3);
            this.f206314j = new ASN1Integer(bigInteger4);
            this.validationParms = dHValidationParms;
            return;
        }
        ig3.m135964a("'q' cannot be null");
        throw null;
    }
}
