package org.spongycastle.asn1.x509;

import com.clevertap.android.sdk.Constants;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.util.Strings;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DistributionPoint extends ASN1Object {
    GeneralNames cRLIssuer;
    DistributionPointName distributionPoint;
    ReasonFlags reasons;

    public DistributionPoint(ASN1Sequence aSN1Sequence) {
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.distributionPoint = DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.reasons = new ReasonFlags(DERBitString.getInstance(aSN1TaggedObject, false));
            } else if (tagNo == 2) {
                this.cRLIssuer = GeneralNames.getInstance(aSN1TaggedObject, false);
            }
        }
    }

    private void appendObject(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static DistributionPoint getInstance(Object obj) {
        if (obj == null || (obj instanceof DistributionPoint)) {
            return (DistributionPoint) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new DistributionPoint((ASN1Sequence) obj);
        }
        wg3.m206174a("Invalid DistributionPoint: ".concat(obj.getClass().getName()));
        return null;
    }

    public GeneralNames getCRLIssuer() {
        return this.cRLIssuer;
    }

    public DistributionPointName getDistributionPoint() {
        return this.distributionPoint;
    }

    public ReasonFlags getReasons() {
        return this.reasons;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.distributionPoint != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, this.distributionPoint));
        }
        if (this.reasons != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.reasons));
        }
        if (this.cRLIssuer != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, this.cRLIssuer));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(strLineSeparator);
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            appendObject(stringBuffer, strLineSeparator, "distributionPoint", distributionPointName.toString());
        }
        ReasonFlags reasonFlags = this.reasons;
        if (reasonFlags != null) {
            appendObject(stringBuffer, strLineSeparator, "reasons", reasonFlags.toString());
        }
        GeneralNames generalNames = this.cRLIssuer;
        if (generalNames != null) {
            appendObject(stringBuffer, strLineSeparator, "cRLIssuer", generalNames.toString());
        }
        stringBuffer.append(Constants.AES_SUFFIX);
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public static DistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public DistributionPoint(DistributionPointName distributionPointName, ReasonFlags reasonFlags, GeneralNames generalNames) {
        this.distributionPoint = distributionPointName;
        this.reasons = reasonFlags;
        this.cRLIssuer = generalNames;
    }
}
