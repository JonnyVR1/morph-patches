package org.spongycastle.asn1.dvcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Enumerated;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServiceType extends ASN1Object {
    private ASN1Enumerated value;
    public static final ServiceType CPD = new ServiceType(1);
    public static final ServiceType VSD = new ServiceType(2);
    public static final ServiceType VPKC = new ServiceType(3);
    public static final ServiceType CCPD = new ServiceType(4);

    public ServiceType(int i) {
        this.value = new ASN1Enumerated(i);
    }

    public static ServiceType getInstance(Object obj) {
        if (obj instanceof ServiceType) {
            return (ServiceType) obj;
        }
        if (obj != null) {
            return new ServiceType(ASN1Enumerated.getInstance(obj));
        }
        return null;
    }

    public BigInteger getValue() {
        return this.value.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.value;
    }

    public String toString() {
        String str;
        int iIntValue = this.value.getValue().intValue();
        StringBuilder sb = new StringBuilder("");
        sb.append(iIntValue);
        if (iIntValue == CPD.getValue().intValue()) {
            str = "(CPD)";
        } else if (iIntValue == VSD.getValue().intValue()) {
            str = "(VSD)";
        } else if (iIntValue == VPKC.getValue().intValue()) {
            str = "(VPKC)";
        } else {
            str = iIntValue == CCPD.getValue().intValue() ? "(CCPD)" : "?";
        }
        sb.append(str);
        return sb.toString();
    }

    private ServiceType(ASN1Enumerated aSN1Enumerated) {
        this.value = aSN1Enumerated;
    }

    public static ServiceType getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Enumerated.getInstance(aSN1TaggedObject, z));
    }
}
