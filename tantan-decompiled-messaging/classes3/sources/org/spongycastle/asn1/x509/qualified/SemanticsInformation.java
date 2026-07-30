package org.spongycastle.asn1.x509.qualified;

import java.util.Enumeration;
import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SemanticsInformation extends ASN1Object {
    private GeneralName[] nameRegistrationAuthorities;
    private ASN1ObjectIdentifier semanticsIdentifier;

    private SemanticsInformation(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        Object objNextElement = null;
        if (aSN1Sequence.size() < 1) {
            ig3.a("no objects in SemanticsInformation");
            throw null;
        }
        Object objNextElement2 = objects.nextElement();
        if (objNextElement2 instanceof ASN1ObjectIdentifier) {
            this.semanticsIdentifier = ASN1ObjectIdentifier.getInstance(objNextElement2);
            if (objects.hasMoreElements()) {
                objNextElement = objects.nextElement();
            }
        } else {
            objNextElement = objNextElement2;
        }
        if (objNextElement != null) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(objNextElement);
            this.nameRegistrationAuthorities = new GeneralName[aSN1Sequence2.size()];
            for (int i = 0; i < aSN1Sequence2.size(); i++) {
                this.nameRegistrationAuthorities[i] = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i));
            }
        }
    }

    public static SemanticsInformation getInstance(Object obj) {
        if (obj instanceof SemanticsInformation) {
            return (SemanticsInformation) obj;
        }
        if (obj != null) {
            return new SemanticsInformation(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralName[] getNameRegistrationAuthorities() {
        return this.nameRegistrationAuthorities;
    }

    public ASN1ObjectIdentifier getSemanticsIdentifier() {
        return this.semanticsIdentifier;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.semanticsIdentifier;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        if (this.nameRegistrationAuthorities != null) {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            int i = 0;
            while (true) {
                GeneralName[] generalNameArr = this.nameRegistrationAuthorities;
                if (i >= generalNameArr.length) {
                    break;
                }
                aSN1EncodableVector2.add(generalNameArr[i]);
                i++;
            }
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SemanticsInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier, GeneralName[] generalNameArr) {
        this.semanticsIdentifier = aSN1ObjectIdentifier;
        this.nameRegistrationAuthorities = generalNameArr;
    }

    public SemanticsInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.semanticsIdentifier = aSN1ObjectIdentifier;
        this.nameRegistrationAuthorities = null;
    }

    public SemanticsInformation(GeneralName[] generalNameArr) {
        this.semanticsIdentifier = null;
        this.nameRegistrationAuthorities = generalNameArr;
    }
}
