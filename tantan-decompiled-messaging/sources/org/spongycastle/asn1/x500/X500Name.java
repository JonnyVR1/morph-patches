package org.spongycastle.asn1.x500;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.style.BCStyle;
import p149l.jfd0;

/* JADX INFO: loaded from: classes3.dex */
public class X500Name extends ASN1Object implements ASN1Choice {
    private static X500NameStyle defaultStyle = BCStyle.INSTANCE;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private RDN[] rdns;
    private X500NameStyle style;

    private X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
        this.style = x500NameStyle;
        this.rdns = new RDN[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            this.rdns[i] = RDN.getInstance(objects.nextElement());
            i++;
        }
    }

    public static X500NameStyle getDefaultStyle() {
        return defaultStyle;
    }

    public static X500Name getInstance(X500NameStyle x500NameStyle, Object obj) {
        if (obj instanceof X500Name) {
            return new X500Name(x500NameStyle, (X500Name) obj);
        }
        if (obj != null) {
            return new X500Name(x500NameStyle, ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static void setDefaultStyle(X500NameStyle x500NameStyle) {
        if (x500NameStyle != null) {
            defaultStyle = x500NameStyle;
        } else {
            jfd0.m141176a("cannot set style to null");
        }
    }

    @Override // org.spongycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X500Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable) obj).toASN1Primitive())));
        } catch (Exception unused) {
            return false;
        }
    }

    public ASN1ObjectIdentifier[] getAttributeTypes() {
        int i = 0;
        int size = 0;
        while (true) {
            RDN[] rdnArr = this.rdns;
            if (i == rdnArr.length) {
                break;
            }
            size += rdnArr[i].size();
            i++;
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            RDN[] rdnArr2 = this.rdns;
            if (i2 == rdnArr2.length) {
                return aSN1ObjectIdentifierArr;
            }
            RDN rdn = rdnArr2[i2];
            if (rdn.isMultiValued()) {
                AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
                int i4 = 0;
                while (i4 != typesAndValues.length) {
                    aSN1ObjectIdentifierArr[i3] = typesAndValues[i4].getType();
                    i4++;
                    i3++;
                }
            } else if (rdn.size() != 0) {
                aSN1ObjectIdentifierArr[i3] = rdn.getFirst().getType();
                i3++;
            }
            i2++;
        }
    }

    public RDN[] getRDNs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i;
        RDN[] rdnArr = new RDN[this.rdns.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            RDN[] rdnArr2 = this.rdns;
            if (i2 == rdnArr2.length) {
                RDN[] rdnArr3 = new RDN[i3];
                System.arraycopy(rdnArr, 0, rdnArr3, 0, i3);
                return rdnArr3;
            }
            RDN rdn = rdnArr2[i2];
            if (!rdn.isMultiValued()) {
                if (rdn.getFirst().getType().equals(aSN1ObjectIdentifier)) {
                    i = i3 + 1;
                    rdnArr[i3] = rdn;
                    i3 = i;
                    break;
                    break;
                }
            } else {
                AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
                for (int i4 = 0; i4 != typesAndValues.length; i4++) {
                    if (typesAndValues[i4].getType().equals(aSN1ObjectIdentifier)) {
                        i = i3 + 1;
                        rdnArr[i3] = rdn;
                        i3 = i;
                        break;
                    }
                }
            }
            i2++;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        }
        this.isHashCodeCalculated = true;
        int iCalculateHashCode = this.style.calculateHashCode(this);
        this.hashCodeValue = iCalculateHashCode;
        return iCalculateHashCode;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.rdns);
    }

    public String toString() {
        return this.style.toString(this);
    }

    public static X500Name getInstance(Object obj) {
        if (obj instanceof X500Name) {
            return (X500Name) obj;
        }
        if (obj != null) {
            return new X500Name(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static X500Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
    }

    private X500Name(ASN1Sequence aSN1Sequence) {
        this(defaultStyle, aSN1Sequence);
    }

    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
        this.rdns = x500Name.rdns;
        this.style = x500NameStyle;
    }

    public X500Name(RDN[] rdnArr) {
        this(defaultStyle, rdnArr);
    }

    public X500Name(X500NameStyle x500NameStyle, RDN[] rdnArr) {
        this.rdns = rdnArr;
        this.style = x500NameStyle;
    }

    public X500Name(String str) {
        this(defaultStyle, str);
    }

    public X500Name(X500NameStyle x500NameStyle, String str) {
        this(x500NameStyle.fromString(str));
        this.style = x500NameStyle;
    }

    public RDN[] getRDNs() {
        RDN[] rdnArr = this.rdns;
        int length = rdnArr.length;
        RDN[] rdnArr2 = new RDN[length];
        System.arraycopy(rdnArr, 0, rdnArr2, 0, length);
        return rdnArr2;
    }
}
