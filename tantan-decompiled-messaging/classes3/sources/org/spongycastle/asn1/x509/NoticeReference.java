package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Vector;
import l.x9g0;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import p003l.bub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NoticeReference extends ASN1Object {
    private ASN1Sequence noticeNumbers;
    private DisplayText organization;

    private NoticeReference(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            bub.m3170a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        this.organization = DisplayText.getInstance(aSN1Sequence.getObjectAt(0));
        this.noticeNumbers = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
    }

    private static ASN1EncodableVector convertVector(Vector vector) {
        ASN1Integer aSN1Integer;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            Object objNextElement = enumerationElements.nextElement();
            if (objNextElement instanceof BigInteger) {
                aSN1Integer = new ASN1Integer((BigInteger) objNextElement);
            } else {
                if (!(objNextElement instanceof Integer)) {
                    x9g0.a();
                    return null;
                }
                aSN1Integer = new ASN1Integer(((Integer) objNextElement).intValue());
            }
            aSN1EncodableVector.add(aSN1Integer);
        }
        return aSN1EncodableVector;
    }

    public static NoticeReference getInstance(Object obj) {
        if (obj instanceof NoticeReference) {
            return (NoticeReference) obj;
        }
        if (obj != null) {
            return new NoticeReference(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Integer[] getNoticeNumbers() {
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[this.noticeNumbers.size()];
        for (int i = 0; i != this.noticeNumbers.size(); i++) {
            aSN1IntegerArr[i] = ASN1Integer.getInstance(this.noticeNumbers.getObjectAt(i));
        }
        return aSN1IntegerArr;
    }

    public DisplayText getOrganization() {
        return this.organization;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.organization);
        aSN1EncodableVector.add(this.noticeNumbers);
        return new DERSequence(aSN1EncodableVector);
    }

    public NoticeReference(String str, ASN1EncodableVector aSN1EncodableVector) {
        this(new DisplayText(str), aSN1EncodableVector);
    }

    public NoticeReference(DisplayText displayText, ASN1EncodableVector aSN1EncodableVector) {
        this.organization = displayText;
        this.noticeNumbers = new DERSequence(aSN1EncodableVector);
    }

    public NoticeReference(String str, Vector vector) {
        this(str, convertVector(vector));
    }
}
