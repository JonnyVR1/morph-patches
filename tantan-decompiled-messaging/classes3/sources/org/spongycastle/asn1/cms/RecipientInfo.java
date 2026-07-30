package org.spongycastle.asn1.cms;

import l.ig3;
import l.qkq0;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RecipientInfo extends ASN1Object implements ASN1Choice {
    ASN1Encodable info;

    public RecipientInfo(KeyAgreeRecipientInfo keyAgreeRecipientInfo) {
        this.info = new DERTaggedObject(false, 1, keyAgreeRecipientInfo);
    }

    public static RecipientInfo getInstance(Object obj) {
        if (obj == null || (obj instanceof RecipientInfo)) {
            return (RecipientInfo) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new RecipientInfo((ASN1Sequence) obj);
        }
        if (obj instanceof ASN1TaggedObject) {
            return new RecipientInfo((ASN1TaggedObject) obj);
        }
        ig3.a("unknown object in factory: ".concat(obj.getClass().getName()));
        return null;
    }

    private KEKRecipientInfo getKEKInfo(ASN1TaggedObject aSN1TaggedObject) {
        return aSN1TaggedObject.isExplicit() ? KEKRecipientInfo.getInstance(aSN1TaggedObject, true) : KEKRecipientInfo.getInstance(aSN1TaggedObject, false);
    }

    public ASN1Encodable getInfo() {
        ASN1Encodable aSN1Encodable = this.info;
        if (!(aSN1Encodable instanceof ASN1TaggedObject)) {
            return KeyTransRecipientInfo.getInstance(aSN1Encodable);
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 1) {
            return KeyAgreeRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 2) {
            return getKEKInfo(aSN1TaggedObject);
        }
        if (tagNo == 3) {
            return PasswordRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 4) {
            return OtherRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        qkq0.a("unknown tag");
        return null;
    }

    public ASN1Integer getVersion() {
        ASN1Encodable aSN1Encodable = this.info;
        if (!(aSN1Encodable instanceof ASN1TaggedObject)) {
            return KeyTransRecipientInfo.getInstance(aSN1Encodable).getVersion();
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 1) {
            return KeyAgreeRecipientInfo.getInstance(aSN1TaggedObject, false).getVersion();
        }
        if (tagNo == 2) {
            return getKEKInfo(aSN1TaggedObject).getVersion();
        }
        if (tagNo == 3) {
            return PasswordRecipientInfo.getInstance(aSN1TaggedObject, false).getVersion();
        }
        if (tagNo == 4) {
            return new ASN1Integer(0L);
        }
        qkq0.a("unknown tag");
        return null;
    }

    public boolean isTagged() {
        return this.info instanceof ASN1TaggedObject;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.info.toASN1Primitive();
    }

    public RecipientInfo(KeyTransRecipientInfo keyTransRecipientInfo) {
        this.info = keyTransRecipientInfo;
    }

    public RecipientInfo(KEKRecipientInfo kEKRecipientInfo) {
        this.info = new DERTaggedObject(false, 2, kEKRecipientInfo);
    }

    public RecipientInfo(PasswordRecipientInfo passwordRecipientInfo) {
        this.info = new DERTaggedObject(false, 3, passwordRecipientInfo);
    }

    public RecipientInfo(OtherRecipientInfo otherRecipientInfo) {
        this.info = new DERTaggedObject(false, 4, otherRecipientInfo);
    }

    public RecipientInfo(ASN1Primitive aSN1Primitive) {
        this.info = aSN1Primitive;
    }
}
