package org.spongycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1ParsingException;
import org.spongycastle.asn1.DERUTF8String;
import org.spongycastle.asn1.x500.AttributeTypeAndValue;
import org.spongycastle.asn1.x500.RDN;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.X500NameStyle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractX500NameStyle implements X500NameStyle {
    private int calcHashCode(ASN1Encodable aSN1Encodable) {
        return IETFUtils.canonicalize(IETFUtils.valueToString(aSN1Encodable)).hashCode();
    }

    public static Hashtable copyHashTable(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    private boolean foundMatch(boolean z, RDN rdn, RDN[] rdnArr) {
        if (z) {
            for (int length = rdnArr.length - 1; length >= 0; length--) {
                RDN rdn2 = rdnArr[length];
                if (rdn2 != null && rdnAreEqual(rdn, rdn2)) {
                    rdnArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != rdnArr.length; i++) {
                RDN rdn3 = rdnArr[i];
                if (rdn3 != null && rdnAreEqual(rdn, rdn3)) {
                    rdnArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.spongycastle.asn1.x500.X500NameStyle
    public boolean areEqual(X500Name x500Name, X500Name x500Name2) {
        RDN[] rDNs = x500Name.getRDNs();
        RDN[] rDNs2 = x500Name2.getRDNs();
        if (rDNs.length != rDNs2.length) {
            return false;
        }
        boolean z = (rDNs[0].getFirst() == null || rDNs2[0].getFirst() == null) ? false : !rDNs[0].getFirst().getType().equals(rDNs2[0].getFirst().getType());
        for (int i = 0; i != rDNs.length; i++) {
            if (!foundMatch(z, rDNs[i], rDNs2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.x500.X500NameStyle
    public int calculateHashCode(X500Name x500Name) {
        RDN[] rDNs = x500Name.getRDNs();
        int iHashCode = 0;
        for (int i = 0; i != rDNs.length; i++) {
            if (rDNs[i].isMultiValued()) {
                AttributeTypeAndValue[] typesAndValues = rDNs[i].getTypesAndValues();
                for (int i2 = 0; i2 != typesAndValues.length; i2++) {
                    iHashCode = (iHashCode ^ typesAndValues[i2].getType().hashCode()) ^ calcHashCode(typesAndValues[i2].getValue());
                }
            } else {
                iHashCode = (iHashCode ^ rDNs[i].getFirst().getType().hashCode()) ^ calcHashCode(rDNs[i].getFirst().getValue());
            }
        }
        return iHashCode;
    }

    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return new DERUTF8String(str);
    }

    public boolean rdnAreEqual(RDN rdn, RDN rdn2) {
        return IETFUtils.rDNAreEqual(rdn, rdn2);
    }

    @Override // org.spongycastle.asn1.x500.X500NameStyle
    public ASN1Encodable stringToValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return encodeStringValue(aSN1ObjectIdentifier, str);
        }
        try {
            return IETFUtils.valueFromHexString(str, 1);
        } catch (IOException unused) {
            throw new ASN1ParsingException("can't recode value for oid " + aSN1ObjectIdentifier.getId());
        }
    }
}
