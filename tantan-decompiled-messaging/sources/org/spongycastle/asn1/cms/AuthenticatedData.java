package org.spongycastle.asn1.cms;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class AuthenticatedData extends ASN1Object {
    private ASN1Set authAttrs;
    private AlgorithmIdentifier digestAlgorithm;
    private ContentInfo encapsulatedContentInfo;
    private ASN1OctetString mac;
    private AlgorithmIdentifier macAlgorithm;
    private OriginatorInfo originatorInfo;
    private ASN1Set recipientInfos;
    private ASN1Set unauthAttrs;
    private ASN1Integer version;

    private AuthenticatedData(ASN1Sequence aSN1Sequence) {
        int i;
        this.version = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
        if (objectAt instanceof ASN1TaggedObject) {
            this.originatorInfo = OriginatorInfo.getInstance((ASN1TaggedObject) objectAt, false);
            objectAt = aSN1Sequence.getObjectAt(2);
            i = 3;
        } else {
            i = 2;
        }
        this.recipientInfos = ASN1Set.getInstance(objectAt);
        this.macAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
        int i2 = i + 2;
        ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i + 1);
        if (objectAt2 instanceof ASN1TaggedObject) {
            this.digestAlgorithm = AlgorithmIdentifier.getInstance((ASN1TaggedObject) objectAt2, false);
            objectAt2 = aSN1Sequence.getObjectAt(i2);
            i2 = i + 3;
        }
        this.encapsulatedContentInfo = ContentInfo.getInstance(objectAt2);
        int i3 = i2 + 1;
        ASN1Encodable objectAt3 = aSN1Sequence.getObjectAt(i2);
        if (objectAt3 instanceof ASN1TaggedObject) {
            this.authAttrs = ASN1Set.getInstance((ASN1TaggedObject) objectAt3, false);
            objectAt3 = aSN1Sequence.getObjectAt(i3);
            i3 = i2 + 2;
        }
        this.mac = ASN1OctetString.getInstance(objectAt3);
        if (aSN1Sequence.size() > i3) {
            this.unauthAttrs = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i3), false);
        }
    }

    public static int calculateVersion(OriginatorInfo originatorInfo) {
        int i = 0;
        if (originatorInfo == null) {
            return 0;
        }
        Enumeration objects = originatorInfo.getCertificates().getObjects();
        while (objects.hasMoreElements()) {
            Object objNextElement = objects.nextElement();
            if (objNextElement instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objNextElement;
                if (aSN1TaggedObject.getTagNo() == 2) {
                    i = 1;
                } else if (aSN1TaggedObject.getTagNo() == 3) {
                    i = 3;
                    break;
                }
            }
        }
        if (originatorInfo.getCRLs() != null) {
            Enumeration objects2 = originatorInfo.getCRLs().getObjects();
            while (objects2.hasMoreElements()) {
                Object objNextElement2 = objects2.nextElement();
                if ((objNextElement2 instanceof ASN1TaggedObject) && ((ASN1TaggedObject) objNextElement2).getTagNo() == 1) {
                    return 3;
                }
            }
        }
        return i;
    }

    public static AuthenticatedData getInstance(Object obj) {
        if (obj instanceof AuthenticatedData) {
            return (AuthenticatedData) obj;
        }
        if (obj != null) {
            return new AuthenticatedData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Set getAuthAttrs() {
        return this.authAttrs;
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public ContentInfo getEncapsulatedContentInfo() {
        return this.encapsulatedContentInfo;
    }

    public ASN1OctetString getMac() {
        return this.mac;
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.macAlgorithm;
    }

    public OriginatorInfo getOriginatorInfo() {
        return this.originatorInfo;
    }

    public ASN1Set getRecipientInfos() {
        return this.recipientInfos;
    }

    public ASN1Set getUnauthAttrs() {
        return this.unauthAttrs;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.version);
        if (this.originatorInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.originatorInfo));
        }
        aSN1EncodableVector.add(this.recipientInfos);
        aSN1EncodableVector.add(this.macAlgorithm);
        if (this.digestAlgorithm != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.digestAlgorithm));
        }
        aSN1EncodableVector.add(this.encapsulatedContentInfo);
        if (this.authAttrs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, this.authAttrs));
        }
        aSN1EncodableVector.add(this.mac);
        if (this.unauthAttrs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, this.unauthAttrs));
        }
        return new BERSequence(aSN1EncodableVector);
    }

    public static AuthenticatedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public AuthenticatedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, ContentInfo contentInfo, ASN1Set aSN1Set2, ASN1OctetString aSN1OctetString, ASN1Set aSN1Set3) {
        if ((algorithmIdentifier2 == null && aSN1Set2 == null) || (algorithmIdentifier2 != null && aSN1Set2 != null)) {
            this.version = new ASN1Integer(calculateVersion(originatorInfo));
            this.originatorInfo = originatorInfo;
            this.macAlgorithm = algorithmIdentifier;
            this.digestAlgorithm = algorithmIdentifier2;
            this.recipientInfos = aSN1Set;
            this.encapsulatedContentInfo = contentInfo;
            this.authAttrs = aSN1Set2;
            this.mac = aSN1OctetString;
            this.unauthAttrs = aSN1Set3;
            return;
        }
        ig3.m135964a("digestAlgorithm and authAttrs must be set together");
        throw null;
    }
}
