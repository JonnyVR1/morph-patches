package org.spongycastle.asn1.esf;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import p149l.bub;

/* JADX INFO: loaded from: classes3.dex */
public class OcspListID extends ASN1Object {
    private ASN1Sequence ocspResponses;

    private OcspListID(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1) {
            bub.m103905a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        this.ocspResponses = aSN1Sequence2;
        Enumeration objects = aSN1Sequence2.getObjects();
        while (objects.hasMoreElements()) {
            OcspResponsesID.getInstance(objects.nextElement());
        }
    }

    public static OcspListID getInstance(Object obj) {
        if (obj instanceof OcspListID) {
            return (OcspListID) obj;
        }
        if (obj != null) {
            return new OcspListID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OcspResponsesID[] getOcspResponses() {
        int size = this.ocspResponses.size();
        OcspResponsesID[] ocspResponsesIDArr = new OcspResponsesID[size];
        for (int i = 0; i < size; i++) {
            ocspResponsesIDArr[i] = OcspResponsesID.getInstance(this.ocspResponses.getObjectAt(i));
        }
        return ocspResponsesIDArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.ocspResponses);
    }

    public OcspListID(OcspResponsesID[] ocspResponsesIDArr) {
        this.ocspResponses = new DERSequence(ocspResponsesIDArr);
    }
}
