package org.spongycastle.asn1.x509.qualified;

import androidx.room.RoomDatabase;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERPrintableString;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class Iso4217CurrencyCode extends ASN1Object implements ASN1Choice {
    int numeric;
    ASN1Encodable obj;
    final int ALPHABETIC_MAXSIZE = 3;
    final int NUMERIC_MINSIZE = 1;
    final int NUMERIC_MAXSIZE = RoomDatabase.MAX_BIND_PARAMETER_CNT;

    public Iso4217CurrencyCode(String str) {
        if (str.length() <= 3) {
            this.obj = new DERPrintableString(str);
        } else {
            wg3.m206174a("wrong size in alphabetic code : max size is 3");
            throw null;
        }
    }

    public static Iso4217CurrencyCode getInstance(Object obj) {
        if (obj == null || (obj instanceof Iso4217CurrencyCode)) {
            return (Iso4217CurrencyCode) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new Iso4217CurrencyCode(ASN1Integer.getInstance(obj).getValue().intValue());
        }
        if (obj instanceof DERPrintableString) {
            return new Iso4217CurrencyCode(DERPrintableString.getInstance(obj).getString());
        }
        wg3.m206174a("unknown object in getInstance");
        return null;
    }

    public String getAlphabetic() {
        return ((DERPrintableString) this.obj).getString();
    }

    public int getNumeric() {
        return ((ASN1Integer) this.obj).getValue().intValue();
    }

    public boolean isAlphabetic() {
        return this.obj instanceof DERPrintableString;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.obj.toASN1Primitive();
    }

    public Iso4217CurrencyCode(int i) {
        if (i <= 999 && i >= 1) {
            this.obj = new ASN1Integer(i);
        } else {
            wg3.m206174a("wrong size in numeric code : not in (1..999)");
            throw null;
        }
    }
}
