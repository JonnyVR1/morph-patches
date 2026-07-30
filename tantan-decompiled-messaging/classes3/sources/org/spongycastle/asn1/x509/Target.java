package org.spongycastle.asn1.x509;

import l.kg3;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;
import p003l.bub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Target extends ASN1Object implements ASN1Choice {
    public static final int targetGroup = 1;
    public static final int targetName = 0;
    private GeneralName targGroup;
    private GeneralName targName;

    private Target(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.targName = GeneralName.getInstance(aSN1TaggedObject, true);
        } else if (tagNo == 1) {
            this.targGroup = GeneralName.getInstance(aSN1TaggedObject, true);
        } else {
            bub.m3170a("unknown tag: ", aSN1TaggedObject.getTagNo());
            throw null;
        }
    }

    public static Target getInstance(Object obj) {
        if (obj == null || (obj instanceof Target)) {
            return (Target) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new Target((ASN1TaggedObject) obj);
        }
        kg3.a("unknown object in factory: ", obj.getClass());
        return null;
    }

    public GeneralName getTargetGroup() {
        return this.targGroup;
    }

    public GeneralName getTargetName() {
        return this.targName;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.targName != null ? new DERTaggedObject(true, 0, this.targName) : new DERTaggedObject(true, 1, this.targGroup);
    }

    public Target(int i, GeneralName generalName) {
        this(new DERTaggedObject(i, generalName));
    }
}
