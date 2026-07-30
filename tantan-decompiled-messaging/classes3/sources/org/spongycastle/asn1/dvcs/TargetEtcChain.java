package org.spongycastle.asn1.dvcs;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TargetEtcChain extends ASN1Object {
    private ASN1Sequence chain;
    private PathProcInput pathProcInput;
    private CertEtcToken target;

    private TargetEtcChain(ASN1Sequence aSN1Sequence) {
        this.target = CertEtcToken.getInstance(aSN1Sequence.getObjectAt(0));
        try {
            try {
                this.chain = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                return;
            }
        } catch (IllegalArgumentException unused2) {
        }
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2));
        if (aSN1TaggedObject.getTagNo() != 0) {
            return;
        }
        this.pathProcInput = PathProcInput.getInstance(aSN1TaggedObject, false);
    }

    public static TargetEtcChain[] arrayFromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        TargetEtcChain[] targetEtcChainArr = new TargetEtcChain[size];
        for (int i = 0; i != size; i++) {
            targetEtcChainArr[i] = getInstance(aSN1Sequence.getObjectAt(i));
        }
        return targetEtcChainArr;
    }

    public static TargetEtcChain getInstance(Object obj) {
        if (obj instanceof TargetEtcChain) {
            return (TargetEtcChain) obj;
        }
        if (obj != null) {
            return new TargetEtcChain(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private void setChain(ASN1Sequence aSN1Sequence) {
        this.chain = aSN1Sequence;
    }

    private void setPathProcInput(PathProcInput pathProcInput) {
        this.pathProcInput = pathProcInput;
    }

    public CertEtcToken[] getChain() {
        ASN1Sequence aSN1Sequence = this.chain;
        if (aSN1Sequence != null) {
            return CertEtcToken.arrayFromSequence(aSN1Sequence);
        }
        return null;
    }

    public PathProcInput getPathProcInput() {
        return this.pathProcInput;
    }

    public CertEtcToken getTarget() {
        return this.target;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.target);
        ASN1Sequence aSN1Sequence = this.chain;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        if (this.pathProcInput != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.pathProcInput));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("TargetEtcChain {\n");
        stringBuffer.append("target: " + this.target + "\n");
        if (this.chain != null) {
            stringBuffer.append("chain: " + this.chain + "\n");
        }
        if (this.pathProcInput != null) {
            stringBuffer.append("pathProcInput: " + this.pathProcInput + "\n");
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    public static TargetEtcChain getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public TargetEtcChain(CertEtcToken certEtcToken, CertEtcToken[] certEtcTokenArr) {
        this(certEtcToken, certEtcTokenArr, null);
    }

    public TargetEtcChain(CertEtcToken certEtcToken, PathProcInput pathProcInput) {
        this(certEtcToken, null, pathProcInput);
    }

    public TargetEtcChain(CertEtcToken certEtcToken, CertEtcToken[] certEtcTokenArr, PathProcInput pathProcInput) {
        this.target = certEtcToken;
        if (certEtcTokenArr != null) {
            this.chain = new DERSequence(certEtcTokenArr);
        }
        this.pathProcInput = pathProcInput;
    }

    public TargetEtcChain(CertEtcToken certEtcToken) {
        this(certEtcToken, null, null);
    }
}
