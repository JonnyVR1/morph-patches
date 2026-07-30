package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class BasicConstraints extends ASN1Object {

    /* JADX INFO: renamed from: cA */
    ASN1Boolean f207218cA;
    ASN1Integer pathLenConstraint;

    private BasicConstraints(ASN1Sequence aSN1Sequence) {
        this.f207218cA = ASN1Boolean.getInstance(false);
        this.pathLenConstraint = null;
        if (aSN1Sequence.size() == 0) {
            this.f207218cA = null;
            this.pathLenConstraint = null;
            return;
        }
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Boolean) {
            this.f207218cA = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.f207218cA = null;
            this.pathLenConstraint = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        }
        if (aSN1Sequence.size() > 1) {
            if (this.f207218cA != null) {
                this.pathLenConstraint = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
            } else {
                wg3.m206174a("wrong sequence in constructor");
                throw null;
            }
        }
    }

    public static BasicConstraints fromExtensions(Extensions extensions) {
        return getInstance(extensions.getExtensionParsedValue(Extension.basicConstraints));
    }

    public static BasicConstraints getInstance(Object obj) {
        if (obj instanceof BasicConstraints) {
            return (BasicConstraints) obj;
        }
        if (obj instanceof X509Extension) {
            return getInstance(X509Extension.convertValueToObject((X509Extension) obj));
        }
        if (obj != null) {
            return new BasicConstraints(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getPathLenConstraint() {
        ASN1Integer aSN1Integer = this.pathLenConstraint;
        if (aSN1Integer != null) {
            return aSN1Integer.getValue();
        }
        return null;
    }

    public boolean isCA() {
        ASN1Boolean aSN1Boolean = this.f207218cA;
        return aSN1Boolean != null && aSN1Boolean.isTrue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Boolean aSN1Boolean = this.f207218cA;
        if (aSN1Boolean != null) {
            aSN1EncodableVector.add(aSN1Boolean);
        }
        ASN1Integer aSN1Integer = this.pathLenConstraint;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        if (this.pathLenConstraint != null) {
            return "BasicConstraints: isCa(" + isCA() + "), pathLenConstraint = " + this.pathLenConstraint.getValue();
        }
        if (this.f207218cA == null) {
            return "BasicConstraints: isCa(false)";
        }
        return "BasicConstraints: isCa(" + isCA() + ")";
    }

    public static BasicConstraints getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public BasicConstraints(boolean z) {
        this.f207218cA = ASN1Boolean.getInstance(false);
        this.pathLenConstraint = null;
        if (z) {
            this.f207218cA = ASN1Boolean.getInstance(true);
        } else {
            this.f207218cA = null;
        }
        this.pathLenConstraint = null;
    }

    public BasicConstraints(int i) {
        this.f207218cA = ASN1Boolean.getInstance(false);
        this.pathLenConstraint = null;
        this.f207218cA = ASN1Boolean.getInstance(true);
        this.pathLenConstraint = new ASN1Integer(i);
    }
}
