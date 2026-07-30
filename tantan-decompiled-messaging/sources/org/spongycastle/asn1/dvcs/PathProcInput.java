package org.spongycastle.asn1.dvcs;

import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes3.dex */
public class PathProcInput extends ASN1Object {
    private PolicyInformation[] acceptablePolicySet;
    private boolean explicitPolicyReqd;
    private boolean inhibitAnyPolicy;
    private boolean inhibitPolicyMapping;

    public PathProcInput(PolicyInformation[] policyInformationArr) {
        this.inhibitPolicyMapping = false;
        this.explicitPolicyReqd = false;
        this.inhibitAnyPolicy = false;
        this.acceptablePolicySet = policyInformationArr;
    }

    private static PolicyInformation[] fromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        PolicyInformation[] policyInformationArr = new PolicyInformation[size];
        for (int i = 0; i != size; i++) {
            policyInformationArr[i] = PolicyInformation.getInstance(aSN1Sequence.getObjectAt(i));
        }
        return policyInformationArr;
    }

    public static PathProcInput getInstance(Object obj) {
        if (obj instanceof PathProcInput) {
            return (PathProcInput) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PathProcInput pathProcInput = new PathProcInput(fromSequence(ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0))));
        for (int i = 1; i < aSN1Sequence.size(); i++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i);
            if (objectAt instanceof ASN1Boolean) {
                pathProcInput.setInhibitPolicyMapping(ASN1Boolean.getInstance(objectAt).isTrue());
            } else if (objectAt instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    pathProcInput.setExplicitPolicyReqd(ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue());
                } else if (tagNo == 1) {
                    pathProcInput.setInhibitAnyPolicy(ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue());
                }
            }
        }
        return pathProcInput;
    }

    private void setExplicitPolicyReqd(boolean z) {
        this.explicitPolicyReqd = z;
    }

    private void setInhibitAnyPolicy(boolean z) {
        this.inhibitAnyPolicy = z;
    }

    private void setInhibitPolicyMapping(boolean z) {
        this.inhibitPolicyMapping = z;
    }

    public PolicyInformation[] getAcceptablePolicySet() {
        return this.acceptablePolicySet;
    }

    public boolean isExplicitPolicyReqd() {
        return this.explicitPolicyReqd;
    }

    public boolean isInhibitAnyPolicy() {
        return this.inhibitAnyPolicy;
    }

    public boolean isInhibitPolicyMapping() {
        return this.inhibitPolicyMapping;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i = 0;
        while (true) {
            PolicyInformation[] policyInformationArr = this.acceptablePolicySet;
            if (i == policyInformationArr.length) {
                break;
            }
            aSN1EncodableVector2.add(policyInformationArr[i]);
            i++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        if (this.inhibitPolicyMapping) {
            aSN1EncodableVector.add(new ASN1Boolean(this.inhibitPolicyMapping));
        }
        if (this.explicitPolicyReqd) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, new ASN1Boolean(this.explicitPolicyReqd)));
        }
        if (this.inhibitAnyPolicy) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, new ASN1Boolean(this.inhibitAnyPolicy)));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        return "PathProcInput: {\nacceptablePolicySet: " + this.acceptablePolicySet + "\ninhibitPolicyMapping: " + this.inhibitPolicyMapping + "\nexplicitPolicyReqd: " + this.explicitPolicyReqd + "\ninhibitAnyPolicy: " + this.inhibitAnyPolicy + "\n}\n";
    }

    public PathProcInput(PolicyInformation[] policyInformationArr, boolean z, boolean z2, boolean z3) {
        this.acceptablePolicySet = policyInformationArr;
        this.inhibitPolicyMapping = z;
        this.explicitPolicyReqd = z2;
        this.inhibitAnyPolicy = z3;
    }

    public static PathProcInput getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
