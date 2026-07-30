package org.spongycastle.asn1.x509;

import java.io.IOException;
import java.util.StringTokenizer;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.util.IPAddress;
import p153l.wg3;
import p153l.za50;

/* JADX INFO: loaded from: classes3.dex */
public class GeneralName extends ASN1Object implements ASN1Choice {
    public static final int dNSName = 2;
    public static final int directoryName = 4;
    public static final int ediPartyName = 5;
    public static final int iPAddress = 7;
    public static final int otherName = 0;
    public static final int registeredID = 8;
    public static final int rfc822Name = 1;
    public static final int uniformResourceIdentifier = 6;
    public static final int x400Address = 3;
    private ASN1Encodable obj;
    private int tag;

    public GeneralName(int i, String str) {
        this.tag = i;
        if (i == 1 || i == 2 || i == 6) {
            this.obj = new DERIA5String(str);
            return;
        }
        if (i == 8) {
            this.obj = new ASN1ObjectIdentifier(str);
            return;
        }
        if (i == 4) {
            this.obj = new X500Name(str);
            return;
        }
        if (i != 7) {
            za50.m219101a("can't process String for tag: ", i);
            throw null;
        }
        byte[] generalNameEncoding = toGeneralNameEncoding(str);
        if (generalNameEncoding != null) {
            this.obj = new DEROctetString(generalNameEncoding);
        } else {
            wg3.m206174a("IP Address is invalid");
            throw null;
        }
    }

    private void copyInts(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 != iArr.length; i2++) {
            int i3 = i2 * 2;
            int i4 = iArr[i2];
            bArr[i3 + i] = (byte) (i4 >> 8);
            bArr[i3 + 1 + i] = (byte) i4;
        }
    }

    public static GeneralName getInstance(Object obj) {
        if (obj == null || (obj instanceof GeneralName)) {
            return (GeneralName) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
            int tagNo = aSN1TaggedObject.getTagNo();
            switch (tagNo) {
                case 0:
                    return new GeneralName(tagNo, ASN1Sequence.getInstance(aSN1TaggedObject, false));
                case 1:
                    return new GeneralName(tagNo, DERIA5String.getInstance(aSN1TaggedObject, false));
                case 2:
                    return new GeneralName(tagNo, DERIA5String.getInstance(aSN1TaggedObject, false));
                case 3:
                    za50.m219101a("unknown tag: ", tagNo);
                    return null;
                case 4:
                    return new GeneralName(tagNo, X500Name.getInstance(aSN1TaggedObject, true));
                case 5:
                    return new GeneralName(tagNo, ASN1Sequence.getInstance(aSN1TaggedObject, false));
                case 6:
                    return new GeneralName(tagNo, DERIA5String.getInstance(aSN1TaggedObject, false));
                case 7:
                    return new GeneralName(tagNo, ASN1OctetString.getInstance(aSN1TaggedObject, false));
                case 8:
                    return new GeneralName(tagNo, ASN1ObjectIdentifier.getInstance(aSN1TaggedObject, false));
            }
        }
        if (!(obj instanceof byte[])) {
            wg3.m206174a("unknown object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException unused) {
            wg3.m206174a("unable to parse encoded general name");
            return null;
        }
    }

    private void parseIPv4(String str, byte[] bArr, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "./");
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i2 + i] = (byte) Integer.parseInt(stringTokenizer.nextToken());
            i2++;
        }
    }

    private void parseIPv4Mask(String str, byte[] bArr, int i) {
        int i2 = Integer.parseInt(str);
        for (int i3 = 0; i3 != i2; i3++) {
            int i4 = (i3 / 8) + i;
            bArr[i4] = (byte) (bArr[i4] | (1 << (7 - (i3 % 8))));
        }
    }

    private int[] parseIPv6(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":", true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i = -1;
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals(":")) {
                iArr[i2] = 0;
                int i3 = i2;
                i2++;
                i = i3;
            } else if (strNextToken.indexOf(46) < 0) {
                int i4 = i2 + 1;
                iArr[i2] = Integer.parseInt(strNextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i2 = i4;
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(strNextToken, ".");
                int i5 = i2 + 1;
                iArr[i2] = (Integer.parseInt(stringTokenizer2.nextToken()) << 8) | Integer.parseInt(stringTokenizer2.nextToken());
                i2 += 2;
                iArr[i5] = Integer.parseInt(stringTokenizer2.nextToken()) | (Integer.parseInt(stringTokenizer2.nextToken()) << 8);
            }
        }
        if (i2 != 8) {
            int i6 = i2 - i;
            int i7 = 8 - i6;
            System.arraycopy(iArr, i, iArr, i7, i6);
            while (i != i7) {
                iArr[i] = 0;
                i++;
            }
        }
        return iArr;
    }

    private int[] parseMask(String str) {
        int[] iArr = new int[8];
        int i = Integer.parseInt(str);
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 / 16;
            iArr[i3] = iArr[i3] | (1 << (15 - (i2 % 16)));
        }
        return iArr;
    }

    private byte[] toGeneralNameEncoding(String str) {
        if (IPAddress.isValidIPv6WithNetmask(str) || IPAddress.isValidIPv6(str)) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf < 0) {
                byte[] bArr = new byte[16];
                copyInts(parseIPv6(str), bArr, 0);
                return bArr;
            }
            byte[] bArr2 = new byte[32];
            copyInts(parseIPv6(str.substring(0, iIndexOf)), bArr2, 0);
            String strSubstring = str.substring(iIndexOf + 1);
            copyInts(strSubstring.indexOf(58) > 0 ? parseIPv6(strSubstring) : parseMask(strSubstring), bArr2, 16);
            return bArr2;
        }
        if (!IPAddress.isValidIPv4WithNetmask(str) && !IPAddress.isValidIPv4(str)) {
            return null;
        }
        int iIndexOf2 = str.indexOf(47);
        if (iIndexOf2 < 0) {
            byte[] bArr3 = new byte[4];
            parseIPv4(str, bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[8];
        parseIPv4(str.substring(0, iIndexOf2), bArr4, 0);
        String strSubstring2 = str.substring(iIndexOf2 + 1);
        if (strSubstring2.indexOf(46) > 0) {
            parseIPv4(strSubstring2, bArr4, 4);
            return bArr4;
        }
        parseIPv4Mask(strSubstring2, bArr4, 4);
        return bArr4;
    }

    public ASN1Encodable getName() {
        return this.obj;
    }

    public int getTagNo() {
        return this.tag;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.tag == 4 ? new DERTaggedObject(true, this.tag, this.obj) : new DERTaggedObject(false, this.tag, this.obj);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.tag);
        stringBuffer.append(": ");
        int i = this.tag;
        if (i == 1 || i == 2) {
            stringBuffer.append(DERIA5String.getInstance(this.obj).getString());
        } else if (i == 4) {
            stringBuffer.append(X500Name.getInstance(this.obj).toString());
        } else if (i != 6) {
            stringBuffer.append(this.obj.toString());
        } else {
            stringBuffer.append(DERIA5String.getInstance(this.obj).getString());
        }
        return stringBuffer.toString();
    }

    public GeneralName(X500Name x500Name) {
        this.obj = x500Name;
        this.tag = 4;
    }

    public GeneralName(int i, ASN1Encodable aSN1Encodable) {
        this.obj = aSN1Encodable;
        this.tag = i;
    }

    public GeneralName(X509Name x509Name) {
        this.obj = X500Name.getInstance(x509Name);
        this.tag = 4;
    }

    public static GeneralName getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1TaggedObject.getInstance(aSN1TaggedObject, true));
    }
}
