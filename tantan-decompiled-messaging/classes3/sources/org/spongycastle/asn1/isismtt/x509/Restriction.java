package org.spongycastle.asn1.isismtt.x509;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Restriction extends ASN1Object {
    private DirectoryString restriction;

    public Restriction(String str) {
        this.restriction = new DirectoryString(str);
    }

    public static Restriction getInstance(Object obj) {
        if (obj instanceof Restriction) {
            return (Restriction) obj;
        }
        if (obj != null) {
            return new Restriction(DirectoryString.getInstance(obj));
        }
        return null;
    }

    public DirectoryString getRestriction() {
        return this.restriction;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.restriction.toASN1Primitive();
    }

    private Restriction(DirectoryString directoryString) {
        this.restriction = directoryString;
    }
}
