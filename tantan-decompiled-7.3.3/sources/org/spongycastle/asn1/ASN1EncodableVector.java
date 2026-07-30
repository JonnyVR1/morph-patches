package org.spongycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1EncodableVector {

    /* JADX INFO: renamed from: v */
    private final Vector f207153v = new Vector();

    public void add(ASN1Encodable aSN1Encodable) {
        this.f207153v.addElement(aSN1Encodable);
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        Enumeration enumerationElements = aSN1EncodableVector.f207153v.elements();
        while (enumerationElements.hasMoreElements()) {
            this.f207153v.addElement(enumerationElements.nextElement());
        }
    }

    public ASN1Encodable get(int i) {
        return (ASN1Encodable) this.f207153v.elementAt(i);
    }

    public int size() {
        return this.f207153v.size();
    }
}
