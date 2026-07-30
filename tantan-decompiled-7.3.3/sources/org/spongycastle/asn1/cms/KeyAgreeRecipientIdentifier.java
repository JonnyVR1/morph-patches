package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class KeyAgreeRecipientIdentifier extends ASN1Object implements ASN1Choice {
    private IssuerAndSerialNumber issuerSerial;
    private RecipientKeyIdentifier rKeyID;

    public KeyAgreeRecipientIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.issuerSerial = issuerAndSerialNumber;
        this.rKeyID = null;
    }

    public static KeyAgreeRecipientIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof KeyAgreeRecipientIdentifier)) {
            return (KeyAgreeRecipientIdentifier) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new KeyAgreeRecipientIdentifier(IssuerAndSerialNumber.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
            if (aSN1TaggedObject.getTagNo() == 0) {
                return new KeyAgreeRecipientIdentifier(RecipientKeyIdentifier.getInstance(aSN1TaggedObject, false));
            }
        }
        wg3.m206174a("Invalid KeyAgreeRecipientIdentifier: ".concat(obj.getClass().getName()));
        return null;
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        return this.issuerSerial;
    }

    public RecipientKeyIdentifier getRKeyID() {
        return this.rKeyID;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        IssuerAndSerialNumber issuerAndSerialNumber = this.issuerSerial;
        return issuerAndSerialNumber != null ? issuerAndSerialNumber.toASN1Primitive() : new DERTaggedObject(false, 0, this.rKeyID);
    }

    public KeyAgreeRecipientIdentifier(RecipientKeyIdentifier recipientKeyIdentifier) {
        this.issuerSerial = null;
        this.rKeyID = recipientKeyIdentifier;
    }

    public static KeyAgreeRecipientIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
