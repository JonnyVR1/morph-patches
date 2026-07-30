package org.spongycastle.asn1;

import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.slf4j.Marker;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import p149l.C21016x1;
import p149l.ig3;
import p149l.kg3;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1GeneralizedTime extends ASN1Primitive {
    private byte[] time;

    public ASN1GeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    private String calculateGMTOffset() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = Marker.ANY_NON_NULL_MARKER;
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / HuiYanResultSender.TIMEOUT_MS;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(getDate())) {
                i += str.equals(Marker.ANY_NON_NULL_MARKER) ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str + convert(i) + ":" + convert(i2);
    }

    private String convert(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return "0" + i;
    }

    public static ASN1GeneralizedTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        if (!(obj instanceof byte[])) {
            ig3.m135964a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (ASN1GeneralizedTime) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            C21016x1.m206655a("encoding error in getInstance: ", e);
            return null;
        }
    }

    private boolean hasFractionalSeconds() {
        int i = 0;
        while (true) {
            byte[] bArr = this.time;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            return Arrays.areEqual(this.time, ((ASN1GeneralizedTime) aSN1Primitive).time);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(24, this.time);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int length = this.time.length;
        return StreamUtil.calculateBodyLength(length) + 1 + length;
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        char cCharAt;
        String strFromByteArray = Strings.fromByteArray(this.time);
        if (strFromByteArray.endsWith("Z")) {
            simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strFromByteArray.indexOf(45) > 0 || strFromByteArray.indexOf(43) > 0) {
            strFromByteArray = getTime();
            simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (hasFractionalSeconds()) {
            String strSubstring = strFromByteArray.substring(14);
            int i = 1;
            while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
                i++;
            }
            int i2 = i - 1;
            if (i2 > 3) {
                strFromByteArray = strFromByteArray.substring(0, 14).concat(strSubstring.substring(0, 4).concat(strSubstring.substring(i)));
            } else if (i2 == 1) {
                strFromByteArray = strFromByteArray.substring(0, 14).concat(strSubstring.substring(0, i) + "00" + strSubstring.substring(i));
            } else if (i2 == 2) {
                strFromByteArray = strFromByteArray.substring(0, 14).concat(strSubstring.substring(0, i) + "0" + strSubstring.substring(i));
            }
        }
        return simpleDateFormat.parse(strFromByteArray);
    }

    public String getTime() {
        String strFromByteArray = Strings.fromByteArray(this.time);
        if (strFromByteArray.charAt(strFromByteArray.length() - 1) == 'Z') {
            return strFromByteArray.substring(0, strFromByteArray.length() - 1).concat("GMT+00:00");
        }
        int length = strFromByteArray.length();
        int i = length - 5;
        char cCharAt = strFromByteArray.charAt(i);
        if (cCharAt == '-' || cCharAt == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(strFromByteArray.substring(0, i));
            sb.append("GMT");
            int i2 = length - 2;
            sb.append(strFromByteArray.substring(i, i2));
            sb.append(":");
            sb.append(strFromByteArray.substring(i2));
            return sb.toString();
        }
        int length2 = strFromByteArray.length() - 3;
        char cCharAt2 = strFromByteArray.charAt(length2);
        if (cCharAt2 != '-' && cCharAt2 != '+') {
            return strFromByteArray + calculateGMTOffset();
        }
        return strFromByteArray.substring(0, length2) + "GMT" + strFromByteArray.substring(length2) + ":00";
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.time);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public ASN1GeneralizedTime(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            kg3.m145878a("invalid date string: ", e.getMessage());
            throw null;
        }
    }

    public ASN1GeneralizedTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(byte[] bArr) {
        this.time = bArr;
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof ASN1GeneralizedTime)) {
            return new ASN1GeneralizedTime(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}
