package org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Iterable;
import p153l.wg3;
import p153l.yg3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1Set extends ASN1Primitive implements Iterable<ASN1Encodable> {
    private boolean isSorted;
    private Vector set;

    public ASN1Set(ASN1EncodableVector aSN1EncodableVector, boolean z) {
        this.set = new Vector();
        this.isSorted = false;
        for (int i = 0; i != aSN1EncodableVector.size(); i++) {
            this.set.addElement(aSN1EncodableVector.get(i));
        }
        if (z) {
            sort();
        }
    }

    private byte[] getDEREncoded(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            wg3.m206174a("cannot encode object added to SET");
            return null;
        }
    }

    public static ASN1Set getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            if (aSN1TaggedObject.isExplicit()) {
                return (ASN1Set) aSN1TaggedObject.getObject();
            }
            wg3.m206174a("object implicit - explicit expected.");
            return null;
        }
        if (aSN1TaggedObject.isExplicit()) {
            return aSN1TaggedObject instanceof BERTaggedObject ? new BERSet(aSN1TaggedObject.getObject()) : new DLSet(aSN1TaggedObject.getObject());
        }
        if (aSN1TaggedObject.getObject() instanceof ASN1Set) {
            return (ASN1Set) aSN1TaggedObject.getObject();
        }
        if (aSN1TaggedObject.getObject() instanceof ASN1Sequence) {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1TaggedObject.getObject();
            return aSN1TaggedObject instanceof BERTaggedObject ? new BERSet(aSN1Sequence.toArray()) : new DLSet(aSN1Sequence.toArray());
        }
        wg3.m206174a("unknown object in getInstance: ".concat(aSN1TaggedObject.getClass().getName()));
        return null;
    }

    private ASN1Encodable getNext(Enumeration enumeration) {
        ASN1Encodable aSN1Encodable = (ASN1Encodable) enumeration.nextElement();
        return aSN1Encodable == null ? DERNull.INSTANCE : aSN1Encodable;
    }

    private boolean lessThanOrEqual(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != iMin; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return iMin == bArr.length;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Set)) {
            return false;
        }
        ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
        if (size() != aSN1Set.size()) {
            return false;
        }
        Enumeration objects = getObjects();
        Enumeration objects2 = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Encodable next = getNext(objects);
            ASN1Encodable next2 = getNext(objects2);
            ASN1Primitive aSN1Primitive2 = next.toASN1Primitive();
            ASN1Primitive aSN1Primitive3 = next2.toASN1Primitive();
            if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.equals(aSN1Primitive3)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public abstract void encode(ASN1OutputStream aSN1OutputStream) throws IOException;

    public ASN1Encodable getObjectAt(int i) {
        return (ASN1Encodable) this.set.elementAt(i);
    }

    public Enumeration getObjects() {
        return this.set.elements();
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        Enumeration objects = getObjects();
        int size = size();
        while (objects.hasMoreElements()) {
            size = (size * 17) ^ getNext(objects).hashCode();
        }
        return size;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return true;
    }

    @Override // org.spongycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new Arrays.Iterator(toArray());
    }

    public ASN1SetParser parser() {
        return new ASN1SetParser() { // from class: org.spongycastle.asn1.ASN1Set.1
            private int index;
            private final int max;

            {
                this.max = ASN1Set.this.size();
            }

            @Override // org.spongycastle.asn1.InMemoryRepresentable
            public ASN1Primitive getLoadedObject() {
                return this;
            }

            @Override // org.spongycastle.asn1.ASN1SetParser
            public ASN1Encodable readObject() throws IOException {
                int i = this.index;
                if (i == this.max) {
                    return null;
                }
                ASN1Set aSN1Set = ASN1Set.this;
                this.index = i + 1;
                ASN1Encodable objectAt = aSN1Set.getObjectAt(i);
                if (objectAt instanceof ASN1Sequence) {
                    return ((ASN1Sequence) objectAt).parser();
                }
                return objectAt instanceof ASN1Set ? ((ASN1Set) objectAt).parser() : objectAt;
            }

            @Override // org.spongycastle.asn1.ASN1Encodable
            public ASN1Primitive toASN1Primitive() {
                return this;
            }
        };
    }

    public int size() {
        return this.set.size();
    }

    public void sort() {
        if (this.isSorted) {
            return;
        }
        this.isSorted = true;
        if (this.set.size() > 1) {
            int size = this.set.size() - 1;
            boolean z = true;
            while (z) {
                int i = 0;
                byte[] dEREncoded = getDEREncoded((ASN1Encodable) this.set.elementAt(0));
                z = false;
                int i2 = 0;
                while (i2 != size) {
                    int i3 = i2 + 1;
                    byte[] dEREncoded2 = getDEREncoded((ASN1Encodable) this.set.elementAt(i3));
                    if (lessThanOrEqual(dEREncoded, dEREncoded2)) {
                        dEREncoded = dEREncoded2;
                    } else {
                        Object objElementAt = this.set.elementAt(i2);
                        Vector vector = this.set;
                        vector.setElementAt(vector.elementAt(i3), i2);
                        this.set.setElementAt(objElementAt, i3);
                        z = true;
                        i = i2;
                    }
                    i2 = i3;
                }
                size = i;
            }
        }
    }

    public ASN1Encodable[] toArray() {
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[size()];
        for (int i = 0; i != size(); i++) {
            aSN1EncodableArr[i] = getObjectAt(i);
        }
        return aSN1EncodableArr;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        if (this.isSorted) {
            DERSet dERSet = new DERSet();
            dERSet.set = this.set;
            return dERSet;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.set.size(); i++) {
            vector.addElement(this.set.elementAt(i));
        }
        DERSet dERSet2 = new DERSet();
        dERSet2.set = vector;
        dERSet2.sort();
        return dERSet2;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        DLSet dLSet = new DLSet();
        dLSet.set = this.set;
        return dLSet;
    }

    public String toString() {
        return this.set.toString();
    }

    public ASN1Set(ASN1Encodable aSN1Encodable) {
        Vector vector = new Vector();
        this.set = vector;
        this.isSorted = false;
        vector.addElement(aSN1Encodable);
    }

    public ASN1Set() {
        this.set = new Vector();
        this.isSorted = false;
    }

    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, boolean z) {
        this.set = new Vector();
        this.isSorted = false;
        for (int i = 0; i != aSN1EncodableArr.length; i++) {
            this.set.addElement(aSN1EncodableArr[i]);
        }
        if (z) {
            sort();
        }
    }

    public static ASN1Set getInstance(Object obj) {
        if (obj != null && !(obj instanceof ASN1Set)) {
            if (obj instanceof ASN1SetParser) {
                return getInstance(((ASN1SetParser) obj).toASN1Primitive());
            }
            if (obj instanceof byte[]) {
                try {
                    return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
                } catch (IOException e) {
                    yg3.m215829a("failed to construct set from byte[]: ", e.getMessage());
                    return null;
                }
            }
            if (obj instanceof ASN1Encodable) {
                ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
                if (aSN1Primitive instanceof ASN1Set) {
                    return (ASN1Set) aSN1Primitive;
                }
            }
            wg3.m206174a("unknown object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        return (ASN1Set) obj;
    }
}
