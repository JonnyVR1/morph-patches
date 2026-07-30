package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.DERUTF8String;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class IetfAttrSyntax extends ASN1Object {
    public static final int VALUE_OCTETS = 1;
    public static final int VALUE_OID = 2;
    public static final int VALUE_UTF8 = 3;
    GeneralNames policyAuthority;
    int valueChoice;
    Vector values = new Vector();

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[LOOP:0: B:12:0x004c->B:28:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[SYNTHETIC] */
    private IetfAttrSyntax(ASN1Sequence aSN1Sequence) {
        Enumeration objects;
        ASN1Primitive aSN1Primitive;
        int i;
        this.policyAuthority = null;
        this.valueChoice = -1;
        int i2 = 0;
        if (!(aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject)) {
            if (aSN1Sequence.size() == 2) {
                this.policyAuthority = GeneralNames.getInstance(aSN1Sequence.getObjectAt(0));
            }
            if (aSN1Sequence.getObjectAt(i2) instanceof ASN1Sequence) {
                ig3.m135964a("Non-IetfAttrSyntax encoding");
                throw null;
            }
            objects = ((ASN1Sequence) aSN1Sequence.getObjectAt(i2)).getObjects();
            while (objects.hasMoreElements()) {
                aSN1Primitive = (ASN1Primitive) objects.nextElement();
                if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                    i = 2;
                } else if (aSN1Primitive instanceof DERUTF8String) {
                    i = 3;
                } else {
                    if (aSN1Primitive instanceof DEROctetString) {
                        ig3.m135964a("Bad value type encoding IetfAttrSyntax");
                        throw null;
                    }
                    i = 1;
                }
                if (this.valueChoice < 0) {
                    this.valueChoice = i;
                }
                if (i == this.valueChoice) {
                    ig3.m135964a("Mix of value types in IetfAttrSyntax");
                    throw null;
                }
                this.values.addElement(aSN1Primitive);
            }
        }
        this.policyAuthority = GeneralNames.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), false);
        i2 = 1;
        if (aSN1Sequence.getObjectAt(i2) instanceof ASN1Sequence) {
            ig3.m135964a("Non-IetfAttrSyntax encoding");
            throw null;
        }
        objects = ((ASN1Sequence) aSN1Sequence.getObjectAt(i2)).getObjects();
        while (objects.hasMoreElements()) {
            aSN1Primitive = (ASN1Primitive) objects.nextElement();
            if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                i = 2;
            } else if (aSN1Primitive instanceof DERUTF8String) {
                i = 3;
            } else {
                if (aSN1Primitive instanceof DEROctetString) {
                    ig3.m135964a("Bad value type encoding IetfAttrSyntax");
                    throw null;
                }
                i = 1;
            }
            if (this.valueChoice < 0) {
                this.valueChoice = i;
            }
            if (i == this.valueChoice) {
                ig3.m135964a("Mix of value types in IetfAttrSyntax");
                throw null;
            }
            this.values.addElement(aSN1Primitive);
        }
    }

    public static IetfAttrSyntax getInstance(Object obj) {
        if (obj instanceof IetfAttrSyntax) {
            return (IetfAttrSyntax) obj;
        }
        if (obj != null) {
            return new IetfAttrSyntax(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralNames getPolicyAuthority() {
        return this.policyAuthority;
    }

    public int getValueType() {
        return this.valueChoice;
    }

    public Object[] getValues() {
        int i = 0;
        if (getValueType() == 1) {
            int size = this.values.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            while (i != size) {
                aSN1OctetStringArr[i] = (ASN1OctetString) this.values.elementAt(i);
                i++;
            }
            return aSN1OctetStringArr;
        }
        int valueType = getValueType();
        Vector vector = this.values;
        if (valueType == 2) {
            int size2 = vector.size();
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size2];
            while (i != size2) {
                aSN1ObjectIdentifierArr[i] = (ASN1ObjectIdentifier) this.values.elementAt(i);
                i++;
            }
            return aSN1ObjectIdentifierArr;
        }
        int size3 = vector.size();
        DERUTF8String[] dERUTF8StringArr = new DERUTF8String[size3];
        while (i != size3) {
            dERUTF8StringArr[i] = (DERUTF8String) this.values.elementAt(i);
            i++;
        }
        return dERUTF8StringArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.policyAuthority != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, this.policyAuthority));
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Enumeration enumerationElements = this.values.elements();
        while (enumerationElements.hasMoreElements()) {
            aSN1EncodableVector2.add((ASN1Encodable) enumerationElements.nextElement());
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        return new DERSequence(aSN1EncodableVector);
    }
}
