package org.spongycastle.asn1.cms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.ASN1UTCTime;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERUTCTime;
import p153l.qg50;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class Time extends ASN1Object implements ASN1Choice {
    ASN1Primitive time;

    public Time(Date date) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i < 1950 || i > 2049) {
            this.time = new DERGeneralizedTime(str);
        } else {
            this.time = new DERUTCTime(str.substring(2));
        }
    }

    public static Time getInstance(Object obj) {
        if (obj == null || (obj instanceof Time)) {
            return (Time) obj;
        }
        if (obj instanceof ASN1UTCTime) {
            return new Time((ASN1UTCTime) obj);
        }
        if (obj instanceof ASN1GeneralizedTime) {
            return new Time((ASN1GeneralizedTime) obj);
        }
        wg3.m206174a("unknown object in factory: ".concat(obj.getClass().getName()));
        return null;
    }

    public Date getDate() {
        try {
            ASN1Primitive aSN1Primitive = this.time;
            return aSN1Primitive instanceof ASN1UTCTime ? ((ASN1UTCTime) aSN1Primitive).getAdjustedDate() : ((ASN1GeneralizedTime) aSN1Primitive).getDate();
        } catch (ParseException e) {
            qg50.m176437a("invalid date string: ", e.getMessage());
            return null;
        }
    }

    public String getTime() {
        ASN1Primitive aSN1Primitive = this.time;
        return aSN1Primitive instanceof ASN1UTCTime ? ((ASN1UTCTime) aSN1Primitive).getAdjustedTime() : ((ASN1GeneralizedTime) aSN1Primitive).getTime();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.time;
    }

    public static Time getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public Time(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UTCTime) && !(aSN1Primitive instanceof ASN1GeneralizedTime)) {
            wg3.m206174a("unknown object passed to Time");
            throw null;
        }
        this.time = aSN1Primitive;
    }

    public Time(Date date, Locale locale) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i >= 1950 && i <= 2049) {
            this.time = new DERUTCTime(str.substring(2));
        } else {
            this.time = new DERGeneralizedTime(str);
        }
    }
}
