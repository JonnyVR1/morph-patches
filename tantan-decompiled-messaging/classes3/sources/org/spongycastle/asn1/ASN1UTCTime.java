package org.spongycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import l.ig3;
import l.kg3;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import p003l.C0637x1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ASN1UTCTime extends ASN1Primitive {
    private byte[] time;

    public ASN1UTCTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public static ASN1UTCTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) obj;
        }
        if (!(obj instanceof byte[])) {
            ig3.a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (ASN1UTCTime) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            C0637x1.m8688a("encoding error in getInstance: ", e);
            return null;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UTCTime) {
            return Arrays.areEqual(this.time, ((ASN1UTCTime) aSN1Primitive).time);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.write(23);
        int length = this.time.length;
        aSN1OutputStream.writeLength(length);
        for (int i = 0; i != length; i++) {
            aSN1OutputStream.write(this.time[i]);
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int length = this.time.length;
        return StreamUtil.calculateBodyLength(length) + 1 + length;
    }

    public Date getAdjustedDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat.parse(getAdjustedTime());
    }

    public String getAdjustedTime() {
        String time = getTime();
        return time.charAt(0) < '5' ? "20".concat(time) : "19".concat(time);
    }

    public Date getDate() throws ParseException {
        return new SimpleDateFormat("yyMMddHHmmssz").parse(getTime());
    }

    public String getTime() {
        String strFromByteArray = Strings.fromByteArray(this.time);
        if (strFromByteArray.indexOf(45) < 0 && strFromByteArray.indexOf(43) < 0) {
            return strFromByteArray.length() == 11 ? strFromByteArray.substring(0, 10).concat("00GMT+00:00") : strFromByteArray.substring(0, 12).concat("GMT+00:00");
        }
        int iIndexOf = strFromByteArray.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strFromByteArray.indexOf(43);
        }
        if (iIndexOf == strFromByteArray.length() - 3) {
            strFromByteArray = strFromByteArray.concat("00");
        }
        if (iIndexOf == 10) {
            return strFromByteArray.substring(0, 10) + "00GMT" + strFromByteArray.substring(10, 13) + ":" + strFromByteArray.substring(13, 15);
        }
        return strFromByteArray.substring(0, 12) + "GMT" + strFromByteArray.substring(12, 15) + ":" + strFromByteArray.substring(15, 17);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return Strings.fromByteArray(this.time);
    }

    public ASN1UTCTime(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            kg3.a("invalid date string: ", e.getMessage());
            throw null;
        }
    }

    public ASN1UTCTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(byte[] bArr) {
        this.time = bArr;
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof ASN1UTCTime)) {
            return new ASN1UTCTime(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}
