package org.spongycastle.asn1.dvcs;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.cmp.PKIStatusInfo;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DVCSCertInfoBuilder {
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
    private int version = 1;

    public DVCSCertInfoBuilder(DVCSRequestInformation dVCSRequestInformation, DigestInfo digestInfo, ASN1Integer aSN1Integer, DVCSTime dVCSTime) {
        this.dvReqInfo = dVCSRequestInformation;
        this.messageImprint = digestInfo;
        this.serialNumber = aSN1Integer;
        this.responseTime = dVCSTime;
    }

    public DVCSCertInfo build() {
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
        return DVCSCertInfo.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public void setCerts(TargetEtcChain[] targetEtcChainArr) {
        this.certs = new DERSequence(targetEtcChainArr);
    }

    public void setDvReqInfo(DVCSRequestInformation dVCSRequestInformation) {
        this.dvReqInfo = dVCSRequestInformation;
    }

    public void setDvStatus(PKIStatusInfo pKIStatusInfo) {
        this.dvStatus = pKIStatusInfo;
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    public void setMessageImprint(DigestInfo digestInfo) {
        this.messageImprint = digestInfo;
    }

    public void setPolicy(PolicyInformation policyInformation) {
        this.policy = policyInformation;
    }

    public void setReqSignature(ASN1Set aSN1Set) {
        this.reqSignature = aSN1Set;
    }

    public void setResponseTime(DVCSTime dVCSTime) {
        this.responseTime = dVCSTime;
    }

    public void setSerialNumber(ASN1Integer aSN1Integer) {
        this.serialNumber = aSN1Integer;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
