package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Targets extends ASN1Object {
    private ASN1Sequence targets;

    public Targets(Target[] targetArr) {
        this.targets = new DERSequence(targetArr);
    }

    public static Targets getInstance(Object obj) {
        if (obj instanceof Targets) {
            return (Targets) obj;
        }
        if (obj != null) {
            return new Targets(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Target[] getTargets() {
        Target[] targetArr = new Target[this.targets.size()];
        Enumeration objects = this.targets.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            targetArr[i] = Target.getInstance(objects.nextElement());
            i++;
        }
        return targetArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.targets;
    }

    private Targets(ASN1Sequence aSN1Sequence) {
        this.targets = aSN1Sequence;
    }
}
