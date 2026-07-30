package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import p153l.mnd0;
import p153l.pvb;
import p153l.wg3;
import p153l.za50;

/* JADX INFO: loaded from: classes3.dex */
public class CMSAlgorithmProtection extends ASN1Object {
    public static final int MAC = 2;
    public static final int SIGNATURE = 1;
    private final AlgorithmIdentifier digestAlgorithm;
    private final AlgorithmIdentifier macAlgorithm;
    private final AlgorithmIdentifier signatureAlgorithm;

    private CMSAlgorithmProtection(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            wg3.m206174a("Sequence wrong size: One of signatureAlgorithm or macAlgorithm must be present");
            throw null;
        }
        this.digestAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1TaggedObject.getTagNo() == 1) {
            this.signatureAlgorithm = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            this.macAlgorithm = null;
        } else {
            if (aSN1TaggedObject.getTagNo() != 2) {
                pvb.m173939a("Unknown tag found: ", aSN1TaggedObject.getTagNo());
                throw null;
            }
            this.signatureAlgorithm = null;
            this.macAlgorithm = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
        }
    }

    public static CMSAlgorithmProtection getInstance(Object obj) {
        if (obj instanceof CMSAlgorithmProtection) {
            return (CMSAlgorithmProtection) obj;
        }
        if (obj != null) {
            return new CMSAlgorithmProtection(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.macAlgorithm;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.digestAlgorithm);
        if (this.signatureAlgorithm != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.signatureAlgorithm));
        }
        if (this.macAlgorithm != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, this.macAlgorithm));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CMSAlgorithmProtection(AlgorithmIdentifier algorithmIdentifier, int i, AlgorithmIdentifier algorithmIdentifier2) {
        if (algorithmIdentifier != null && algorithmIdentifier2 != null) {
            this.digestAlgorithm = algorithmIdentifier;
            if (i == 1) {
                this.signatureAlgorithm = algorithmIdentifier2;
                this.macAlgorithm = null;
                return;
            } else if (i == 2) {
                this.signatureAlgorithm = null;
                this.macAlgorithm = algorithmIdentifier2;
                return;
            } else {
                za50.m219101a("Unknown type: ", i);
                throw null;
            }
        }
        mnd0.m159157a("AlgorithmIdentifiers cannot be null");
        throw null;
    }
}
