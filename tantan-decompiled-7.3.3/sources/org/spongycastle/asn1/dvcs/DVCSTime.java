package org.spongycastle.asn1.dvcs;

import java.util.Date;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.cms.ContentInfo;

/* JADX INFO: loaded from: classes3.dex */
public class DVCSTime extends ASN1Object implements ASN1Choice {
    private ASN1GeneralizedTime genTime;
    private Date time;
    private ContentInfo timeStampToken;

    public DVCSTime(Date date) {
        this(new ASN1GeneralizedTime(date));
    }

    public static DVCSTime getInstance(Object obj) {
        if (obj instanceof DVCSTime) {
            return (DVCSTime) obj;
        }
        if (obj instanceof ASN1GeneralizedTime) {
            return new DVCSTime(ASN1GeneralizedTime.getInstance(obj));
        }
        if (obj != null) {
            return new DVCSTime(ContentInfo.getInstance(obj));
        }
        return null;
    }

    public ASN1GeneralizedTime getGenTime() {
        return this.genTime;
    }

    public ContentInfo getTimeStampToken() {
        return this.timeStampToken;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1GeneralizedTime aSN1GeneralizedTime = this.genTime;
        if (aSN1GeneralizedTime != null) {
            return aSN1GeneralizedTime;
        }
        ContentInfo contentInfo = this.timeStampToken;
        if (contentInfo != null) {
            return contentInfo.toASN1Primitive();
        }
        return null;
    }

    public String toString() {
        ASN1GeneralizedTime aSN1GeneralizedTime = this.genTime;
        if (aSN1GeneralizedTime != null) {
            return aSN1GeneralizedTime.toString();
        }
        ContentInfo contentInfo = this.timeStampToken;
        if (contentInfo != null) {
            return contentInfo.toString();
        }
        return null;
    }

    public DVCSTime(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.genTime = aSN1GeneralizedTime;
    }

    public DVCSTime(ContentInfo contentInfo) {
        this.timeStampToken = contentInfo;
    }

    public static DVCSTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
