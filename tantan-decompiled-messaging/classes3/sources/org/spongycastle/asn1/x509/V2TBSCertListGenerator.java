package org.spongycastle.asn1.x509;

import java.io.IOException;
import l.qkq0;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1UTCTime;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.X500Name;
import p003l.k250;
import p003l.qhg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class V2TBSCertListGenerator {
    private static final ASN1Sequence[] reasons = {createReasonExtension(0), createReasonExtension(1), createReasonExtension(2), createReasonExtension(3), createReasonExtension(4), createReasonExtension(5), createReasonExtension(6), createReasonExtension(7), createReasonExtension(8), createReasonExtension(9), createReasonExtension(10)};
    private X500Name issuer;
    private AlgorithmIdentifier signature;
    private Time thisUpdate;
    private ASN1Integer version = new ASN1Integer(1);
    private Time nextUpdate = null;
    private Extensions extensions = null;
    private ASN1EncodableVector crlentries = new ASN1EncodableVector();

    private static ASN1Sequence createInvalidityDateExtension(ASN1GeneralizedTime aSN1GeneralizedTime) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        try {
            aSN1EncodableVector.add(Extension.invalidityDate);
            aSN1EncodableVector.add(new DEROctetString(aSN1GeneralizedTime.getEncoded()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e) {
            qhg0.m7021a("error encoding reason: ", e);
            return null;
        }
    }

    private static ASN1Sequence createReasonExtension(int i) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        CRLReason cRLReasonLookup = CRLReason.lookup(i);
        try {
            aSN1EncodableVector.add(Extension.reasonCode);
            aSN1EncodableVector.add(new DEROctetString(cRLReasonLookup.getEncoded()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e) {
            qhg0.m7021a("error encoding reason: ", e);
            return null;
        }
    }

    private void internalAddCRLEntry(ASN1Integer aSN1Integer, Time time, ASN1Sequence aSN1Sequence) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        addCRLEntry(new DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, int i, ASN1GeneralizedTime aSN1GeneralizedTime) {
        if (i == 0) {
            if (aSN1GeneralizedTime == null) {
                addCRLEntry(aSN1Integer, time, (Extensions) null);
                return;
            }
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(createInvalidityDateExtension(aSN1GeneralizedTime));
            internalAddCRLEntry(aSN1Integer, time, new DERSequence(aSN1EncodableVector));
            return;
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1Sequence[] aSN1SequenceArr = reasons;
        if (i >= aSN1SequenceArr.length) {
            aSN1EncodableVector2.add(createReasonExtension(i));
        } else {
            if (i < 0) {
                k250.m5546a("invalid reason value: ", i);
                return;
            }
            aSN1EncodableVector2.add(aSN1SequenceArr[i]);
        }
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector2.add(createInvalidityDateExtension(aSN1GeneralizedTime));
        }
        internalAddCRLEntry(aSN1Integer, time, new DERSequence(aSN1EncodableVector2));
    }

    public TBSCertList generateTBSCertList() {
        if (this.signature == null || this.issuer == null || this.thisUpdate == null) {
            qkq0.a("Not all mandatory fields set in V2 TBSCertList generator.");
            return null;
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(this.signature);
        aSN1EncodableVector.add(this.issuer);
        aSN1EncodableVector.add(this.thisUpdate);
        Time time = this.nextUpdate;
        if (time != null) {
            aSN1EncodableVector.add(time);
        }
        if (this.crlentries.size() != 0) {
            aSN1EncodableVector.add(new DERSequence(this.crlentries));
        }
        if (this.extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, this.extensions));
        }
        return new TBSCertList(new DERSequence(aSN1EncodableVector));
    }

    public void setExtensions(X509Extensions x509Extensions) {
        setExtensions(Extensions.getInstance(x509Extensions));
    }

    public void setIssuer(X509Name x509Name) {
        this.issuer = X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setNextUpdate(ASN1UTCTime aSN1UTCTime) {
        this.nextUpdate = new Time(aSN1UTCTime);
    }

    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
        this.signature = algorithmIdentifier;
    }

    public void setThisUpdate(ASN1UTCTime aSN1UTCTime) {
        this.thisUpdate = new Time(aSN1UTCTime);
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    public void setNextUpdate(Time time) {
        this.nextUpdate = time;
    }

    public void setThisUpdate(Time time) {
        this.thisUpdate = time;
    }

    public void setIssuer(X500Name x500Name) {
        this.issuer = x500Name;
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, ASN1UTCTime aSN1UTCTime, int i) {
        addCRLEntry(aSN1Integer, new Time(aSN1UTCTime), i);
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, int i) {
        addCRLEntry(aSN1Integer, time, i, null);
    }

    public void addCRLEntry(ASN1Sequence aSN1Sequence) {
        this.crlentries.add(aSN1Sequence);
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, Extensions extensions) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        addCRLEntry(new DERSequence(aSN1EncodableVector));
    }
}
