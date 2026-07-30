package org.spongycastle.asn1.x509;

import java.io.IOException;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class X509NameEntryConverter {
    public boolean canBePrintable(String str) {
        return DERPrintableString.isPrintableString(str);
    }

    public ASN1Primitive convertHexEncoded(String str, int i) throws IOException {
        String lowerCase = Strings.toLowerCase(str);
        int length = (lowerCase.length() - i) / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = (i2 * 2) + i;
            char cCharAt = lowerCase.charAt(i3);
            char cCharAt2 = lowerCase.charAt(i3 + 1);
            if (cCharAt < 'a') {
                bArr[i2] = (byte) ((cCharAt - '0') << 4);
            } else {
                bArr[i2] = (byte) ((cCharAt - 'W') << 4);
            }
            if (cCharAt2 < 'a') {
                bArr[i2] = (byte) (((byte) (cCharAt2 - '0')) | bArr[i2]);
            } else {
                bArr[i2] = (byte) (((byte) (cCharAt2 - 'W')) | bArr[i2]);
            }
        }
        return new ASN1InputStream(bArr).readObject();
    }

    public abstract ASN1Primitive getConvertedValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str);
}
