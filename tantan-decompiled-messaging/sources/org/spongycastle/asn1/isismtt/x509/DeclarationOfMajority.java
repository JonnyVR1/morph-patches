package org.spongycastle.asn1.isismtt.x509;

import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import p149l.bub;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DeclarationOfMajority extends ASN1Object implements ASN1Choice {
    public static final int dateOfBirth = 2;
    public static final int fullAgeAtCountry = 1;
    public static final int notYoungerThan = 0;
    private ASN1TaggedObject declaration;

    public DeclarationOfMajority(boolean z, String str) {
        if (str.length() > 2) {
            ig3.m135964a("country can only be 2 characters");
            throw null;
        }
        if (z) {
            this.declaration = new DERTaggedObject(false, 1, new DERSequence(new DERPrintableString(str, true)));
            return;
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(ASN1Boolean.FALSE);
        aSN1EncodableVector.add(new DERPrintableString(str, true));
        this.declaration = new DERTaggedObject(false, 1, new DERSequence(aSN1EncodableVector));
    }

    public static DeclarationOfMajority getInstance(Object obj) {
        if (obj == null || (obj instanceof DeclarationOfMajority)) {
            return (DeclarationOfMajority) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new DeclarationOfMajority((ASN1TaggedObject) obj);
        }
        ig3.m135964a("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1Sequence fullAgeAtCountry() {
        if (this.declaration.getTagNo() != 1) {
            return null;
        }
        return ASN1Sequence.getInstance(this.declaration, false);
    }

    public ASN1GeneralizedTime getDateOfBirth() {
        if (this.declaration.getTagNo() != 2) {
            return null;
        }
        return ASN1GeneralizedTime.getInstance(this.declaration, false);
    }

    public int getType() {
        return this.declaration.getTagNo();
    }

    public int notYoungerThan() {
        if (this.declaration.getTagNo() != 0) {
            return -1;
        }
        return ASN1Integer.getInstance(this.declaration, false).getValue().intValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.declaration;
    }

    public DeclarationOfMajority(int i) {
        this.declaration = new DERTaggedObject(false, 0, new ASN1Integer(i));
    }

    public DeclarationOfMajority(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.declaration = new DERTaggedObject(false, 2, aSN1GeneralizedTime);
    }

    private DeclarationOfMajority(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() <= 2) {
            this.declaration = aSN1TaggedObject;
        } else {
            bub.m103905a("Bad tag number: ", aSN1TaggedObject.getTagNo());
            throw null;
        }
    }
}
