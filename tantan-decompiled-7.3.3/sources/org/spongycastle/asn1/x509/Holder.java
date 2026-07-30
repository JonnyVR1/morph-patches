package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import p153l.pvb;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class Holder extends ASN1Object {
    public static final int V1_CERTIFICATE_HOLDER = 0;
    public static final int V2_CERTIFICATE_HOLDER = 1;
    IssuerSerial baseCertificateID;
    GeneralNames entityName;
    ObjectDigestInfo objectDigestInfo;
    private int version;

    private Holder(ASN1Sequence aSN1Sequence) {
        this.version = 1;
        if (aSN1Sequence.size() > 3) {
            pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.baseCertificateID = IssuerSerial.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 1) {
                this.entityName = GeneralNames.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 2) {
                    wg3.m206174a("unknown tag in Holder");
                    throw null;
                }
                this.objectDigestInfo = ObjectDigestInfo.getInstance(aSN1TaggedObject, false);
            }
        }
        this.version = 1;
    }

    public static Holder getInstance(Object obj) {
        if (obj instanceof Holder) {
            return (Holder) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new Holder(ASN1TaggedObject.getInstance(obj));
        }
        if (obj != null) {
            return new Holder(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IssuerSerial getBaseCertificateID() {
        return this.baseCertificateID;
    }

    public GeneralNames getEntityName() {
        return this.entityName;
    }

    public ObjectDigestInfo getObjectDigestInfo() {
        return this.objectDigestInfo;
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        if (this.version != 1) {
            return this.entityName != null ? new DERTaggedObject(true, 1, this.entityName) : new DERTaggedObject(true, 0, this.baseCertificateID);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.baseCertificateID != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.baseCertificateID));
        }
        if (this.entityName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.entityName));
        }
        if (this.objectDigestInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, this.objectDigestInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private Holder(ASN1TaggedObject aSN1TaggedObject) {
        this.version = 1;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.baseCertificateID = IssuerSerial.getInstance(aSN1TaggedObject, true);
        } else if (tagNo == 1) {
            this.entityName = GeneralNames.getInstance(aSN1TaggedObject, true);
        } else {
            wg3.m206174a("unknown tag in Holder");
            throw null;
        }
        this.version = 0;
    }

    public Holder(IssuerSerial issuerSerial) {
        this(issuerSerial, 1);
    }

    public Holder(IssuerSerial issuerSerial, int i) {
        this.baseCertificateID = issuerSerial;
        this.version = i;
    }

    public Holder(GeneralNames generalNames) {
        this(generalNames, 1);
    }

    public Holder(GeneralNames generalNames, int i) {
        this.entityName = generalNames;
        this.version = i;
    }

    public Holder(ObjectDigestInfo objectDigestInfo) {
        this.version = 1;
        this.objectDigestInfo = objectDigestInfo;
    }
}
