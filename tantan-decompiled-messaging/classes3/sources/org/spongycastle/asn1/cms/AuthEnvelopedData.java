package org.spongycastle.asn1.cms;

import l.ig3;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AuthEnvelopedData extends ASN1Object {
    private ASN1Set authAttrs;
    private EncryptedContentInfo authEncryptedContentInfo;
    private ASN1OctetString mac;
    private OriginatorInfo originatorInfo;
    private ASN1Set recipientInfos;
    private ASN1Set unauthAttrs;
    private ASN1Integer version;

    private AuthEnvelopedData(ASN1Sequence aSN1Sequence) {
        ASN1Set aSN1Set;
        ASN1Integer aSN1Integer = (ASN1Integer) aSN1Sequence.getObjectAt(0).toASN1Primitive();
        this.version = aSN1Integer;
        if (aSN1Integer.getValue().intValue() != 0) {
            ig3.a("AuthEnvelopedData version number must be 0");
            throw null;
        }
        ASN1Primitive aSN1Primitive = aSN1Sequence.getObjectAt(1).toASN1Primitive();
        int i = 2;
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            this.originatorInfo = OriginatorInfo.getInstance((ASN1TaggedObject) aSN1Primitive, false);
            aSN1Primitive = aSN1Sequence.getObjectAt(2).toASN1Primitive();
            i = 3;
        }
        ASN1Set aSN1Set2 = ASN1Set.getInstance(aSN1Primitive);
        this.recipientInfos = aSN1Set2;
        if (aSN1Set2.size() == 0) {
            ig3.a("AuthEnvelopedData requires at least 1 RecipientInfo");
            throw null;
        }
        this.authEncryptedContentInfo = EncryptedContentInfo.getInstance(aSN1Sequence.getObjectAt(i).toASN1Primitive());
        int i2 = i + 2;
        ASN1Primitive aSN1Primitive2 = aSN1Sequence.getObjectAt(i + 1).toASN1Primitive();
        if (aSN1Primitive2 instanceof ASN1TaggedObject) {
            this.authAttrs = ASN1Set.getInstance((ASN1TaggedObject) aSN1Primitive2, false);
            aSN1Primitive2 = aSN1Sequence.getObjectAt(i2).toASN1Primitive();
            i2 = i + 3;
        } else if (!this.authEncryptedContentInfo.getContentType().equals(CMSObjectIdentifiers.data) && ((aSN1Set = this.authAttrs) == null || aSN1Set.size() == 0)) {
            ig3.a("authAttrs must be present with non-data content");
            throw null;
        }
        this.mac = ASN1OctetString.getInstance(aSN1Primitive2);
        if (aSN1Sequence.size() > i2) {
            this.unauthAttrs = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i2).toASN1Primitive(), false);
        }
    }

    public static AuthEnvelopedData getInstance(Object obj) {
        if (obj == null || (obj instanceof AuthEnvelopedData)) {
            return (AuthEnvelopedData) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new AuthEnvelopedData((ASN1Sequence) obj);
        }
        ig3.a("Invalid AuthEnvelopedData: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1Set getAuthAttrs() {
        return this.authAttrs;
    }

    public EncryptedContentInfo getAuthEncryptedContentInfo() {
        return this.authEncryptedContentInfo;
    }

    public ASN1OctetString getMac() {
        return this.mac;
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
        aSN1EncodableVector.add(this.authEncryptedContentInfo);
        if (this.authAttrs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.authAttrs));
        }
        aSN1EncodableVector.add(this.mac);
        if (this.unauthAttrs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, this.unauthAttrs));
        }
        return new BERSequence(aSN1EncodableVector);
    }

    public static AuthEnvelopedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public AuthEnvelopedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, EncryptedContentInfo encryptedContentInfo, ASN1Set aSN1Set2, ASN1OctetString aSN1OctetString, ASN1Set aSN1Set3) {
        this.version = new ASN1Integer(0L);
        this.originatorInfo = originatorInfo;
        this.recipientInfos = aSN1Set;
        if (aSN1Set.size() != 0) {
            this.authEncryptedContentInfo = encryptedContentInfo;
            this.authAttrs = aSN1Set2;
            if (!encryptedContentInfo.getContentType().equals(CMSObjectIdentifiers.data) && (aSN1Set2 == null || aSN1Set2.size() == 0)) {
                ig3.a("authAttrs must be present with non-data content");
                throw null;
            }
            this.mac = aSN1OctetString;
            this.unauthAttrs = aSN1Set3;
            return;
        }
        ig3.a("AuthEnvelopedData requires at least 1 RecipientInfo");
        throw null;
    }
}
