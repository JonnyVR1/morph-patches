package org.spongycastle.asn1.dvcs;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.cmp.PKIStatusInfo;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes3.dex */
public class DVCSCertInfo extends ASN1Object {
    private static final int DEFAULT_VERSION = 1;
    private static final int TAG_CERTS = 3;
    private static final int TAG_DV_STATUS = 0;
    private static final int TAG_POLICY = 1;
    private static final int TAG_REQ_SIGNATURE = 2;
    private ASN1Sequence certs;
    private DVCSRequestInformation dvReqInfo;
    private PKIStatusInfo dvStatus;
    private Extensions extensions;
    private DigestInfo messageImprint;
    private PolicyInformation policy;
    private ASN1Set reqSignature;
    private DVCSTime responseTime;
    private ASN1Integer serialNumber;
    private int version;

    private DVCSCertInfo(ASN1Sequence aSN1Sequence) {
        int i;
        this.version = 1;
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        if (objectAt instanceof ASN1Integer) {
            this.version = ASN1Integer.getInstance(objectAt).getValue().intValue();
            objectAt = aSN1Sequence.getObjectAt(1);
            i = 2;
        } else {
            i = 1;
        }
        this.dvReqInfo = DVCSRequestInformation.getInstance(objectAt);
        this.messageImprint = DigestInfo.getInstance(aSN1Sequence.getObjectAt(i));
        int i2 = i + 2;
        this.serialNumber = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        int i3 = i + 3;
        this.responseTime = DVCSTime.getInstance(aSN1Sequence.getObjectAt(i2));
        while (i3 < aSN1Sequence.size()) {
            int i4 = i3 + 1;
            ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i3);
            try {
                try {
                    ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt2);
                    int tagNo = aSN1TaggedObject.getTagNo();
                    if (tagNo == 0) {
                        this.dvStatus = PKIStatusInfo.getInstance(aSN1TaggedObject, false);
                    } else if (tagNo == 1) {
                        this.policy = PolicyInformation.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, false));
                    } else if (tagNo == 2) {
                        this.reqSignature = ASN1Set.getInstance(aSN1TaggedObject, false);
                    } else if (tagNo == 3) {
                        this.certs = ASN1Sequence.getInstance(aSN1TaggedObject, false);
                    }
                } catch (IllegalArgumentException unused) {
                }
            } catch (IllegalArgumentException unused2) {
                this.extensions = Extensions.getInstance(objectAt2);
            }
            i3 = i4;
        }
    }

    public static DVCSCertInfo getInstance(Object obj) {
        if (obj instanceof DVCSCertInfo) {
            return (DVCSCertInfo) obj;
        }
        if (obj != null) {
            return new DVCSCertInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private void setDvReqInfo(DVCSRequestInformation dVCSRequestInformation) {
        this.dvReqInfo = dVCSRequestInformation;
    }

    private void setMessageImprint(DigestInfo digestInfo) {
        this.messageImprint = digestInfo;
    }

    private void setVersion(int i) {
        this.version = i;
    }

    public TargetEtcChain[] getCerts() {
        ASN1Sequence aSN1Sequence = this.certs;
        if (aSN1Sequence != null) {
            return TargetEtcChain.arrayFromSequence(aSN1Sequence);
        }
        return null;
    }

    public DVCSRequestInformation getDvReqInfo() {
        return this.dvReqInfo;
    }

    public PKIStatusInfo getDvStatus() {
        return this.dvStatus;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public DigestInfo getMessageImprint() {
        return this.messageImprint;
    }

    public PolicyInformation getPolicy() {
        return this.policy;
    }

    public ASN1Set getReqSignature() {
        return this.reqSignature;
    }

    public DVCSTime getResponseTime() {
        return this.responseTime;
    }

    public ASN1Integer getSerialNumber() {
        return this.serialNumber;
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        int i = this.version;
        if (i != 1) {
            aSN1EncodableVector.add(new ASN1Integer(i));
        }
        aSN1EncodableVector.add(this.dvReqInfo);
        aSN1EncodableVector.add(this.messageImprint);
        aSN1EncodableVector.add(this.serialNumber);
        aSN1EncodableVector.add(this.responseTime);
        if (this.dvStatus != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.dvStatus));
        }
        if (this.policy != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.policy));
        }
        if (this.reqSignature != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, this.reqSignature));
        }
        if (this.certs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, this.certs));
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DVCSCertInfo {\n");
        if (this.version != 1) {
            stringBuffer.append("version: " + this.version + SignParameters.NEW_LINE);
        }
        stringBuffer.append("dvReqInfo: " + this.dvReqInfo + SignParameters.NEW_LINE);
        stringBuffer.append("messageImprint: " + this.messageImprint + SignParameters.NEW_LINE);
        stringBuffer.append("serialNumber: " + this.serialNumber + SignParameters.NEW_LINE);
        stringBuffer.append("responseTime: " + this.responseTime + SignParameters.NEW_LINE);
        if (this.dvStatus != null) {
            stringBuffer.append("dvStatus: " + this.dvStatus + SignParameters.NEW_LINE);
        }
        if (this.policy != null) {
            stringBuffer.append("policy: " + this.policy + SignParameters.NEW_LINE);
        }
        if (this.reqSignature != null) {
            stringBuffer.append("reqSignature: " + this.reqSignature + SignParameters.NEW_LINE);
        }
        if (this.certs != null) {
            stringBuffer.append("certs: " + this.certs + SignParameters.NEW_LINE);
        }
        if (this.extensions != null) {
            stringBuffer.append("extensions: " + this.extensions + SignParameters.NEW_LINE);
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    public static DVCSCertInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public DVCSCertInfo(DVCSRequestInformation dVCSRequestInformation, DigestInfo digestInfo, ASN1Integer aSN1Integer, DVCSTime dVCSTime) {
        this.version = 1;
        this.dvReqInfo = dVCSRequestInformation;
        this.messageImprint = digestInfo;
        this.serialNumber = aSN1Integer;
        this.responseTime = dVCSTime;
    }
}
