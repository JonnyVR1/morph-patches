package org.spongycastle.asn1.p009x9;

import java.math.BigInteger;
import java.util.Enumeration;
import l.ig3;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import p003l.bub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DomainParameters extends ASN1Object {

    /* JADX INFO: renamed from: g */
    private final ASN1Integer f9943g;

    /* JADX INFO: renamed from: j */
    private final ASN1Integer f9944j;

    /* JADX INFO: renamed from: p */
    private final ASN1Integer f9945p;

    /* JADX INFO: renamed from: q */
    private final ASN1Integer f9946q;
    private final ValidationParams validationParams;

    private DomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            bub.m3170a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f9945p = ASN1Integer.getInstance(objects.nextElement());
        this.f9943g = ASN1Integer.getInstance(objects.nextElement());
        this.f9946q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next == null || !(next instanceof ASN1Integer)) {
            this.f9944j = null;
        } else {
            this.f9944j = ASN1Integer.getInstance(next);
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
        return this.f9943g.getPositiveValue();
    }

    public BigInteger getJ() {
        ASN1Integer aSN1Integer = this.f9944j;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f9945p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f9946q.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.validationParams;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f9945p);
        aSN1EncodableVector.add(this.f9943g);
        aSN1EncodableVector.add(this.f9946q);
        ASN1Integer aSN1Integer = this.f9944j;
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
            ig3.a("'p' cannot be null");
            throw null;
        }
        if (bigInteger2 == null) {
            ig3.a("'g' cannot be null");
            throw null;
        }
        if (bigInteger3 != null) {
            this.f9945p = new ASN1Integer(bigInteger);
            this.f9943g = new ASN1Integer(bigInteger2);
            this.f9946q = new ASN1Integer(bigInteger3);
            if (bigInteger4 != null) {
                this.f9944j = new ASN1Integer(bigInteger4);
            } else {
                this.f9944j = null;
            }
            this.validationParams = validationParams;
            return;
        }
        ig3.a("'q' cannot be null");
        throw null;
    }
}
