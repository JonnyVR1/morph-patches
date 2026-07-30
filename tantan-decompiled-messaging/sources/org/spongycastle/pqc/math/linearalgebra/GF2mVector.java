package org.spongycastle.pqc.math.linearalgebra;

import p149l.ig3;
import p149l.lwm;

/* JADX INFO: loaded from: classes3.dex */
public class GF2mVector extends Vector {
    private GF2mField field;
    private int[] vector;

    public GF2mVector(GF2mField gF2mField, byte[] bArr) {
        int[] iArr;
        this.field = new GF2mField(gF2mField);
        int i = 8;
        int i2 = 1;
        while (gF2mField.getDegree() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            ig3.m135964a("Byte array is not an encoded vector over the given finite field.");
            throw null;
        }
        int length = bArr.length / i2;
        this.length = length;
        this.vector = new int[length];
        int i3 = 0;
        for (int i4 = 0; i4 < this.vector.length; i4++) {
            int i5 = 0;
            while (true) {
                iArr = this.vector;
                if (i5 >= i) {
                    break;
                }
                iArr[i4] = ((bArr[i3] & 255) << i5) | iArr[i4];
                i5 += 8;
                i3++;
            }
            if (!gF2mField.isElementOfThisField(iArr[i4])) {
                ig3.m135964a("Byte array is not an encoded vector over the given finite field.");
                throw null;
            }
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        throw new RuntimeException("not implemented");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2mVector)) {
            return false;
        }
        GF2mVector gF2mVector = (GF2mVector) obj;
        if (this.field.equals(gF2mVector.field)) {
            return IntUtils.equals(this.vector, gF2mVector.vector);
        }
        return false;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        int i = 8;
        int i2 = 1;
        while (this.field.getDegree() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.vector.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.vector.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.vector[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public GF2mField getField() {
        return this.field;
    }

    public int[] getIntArrayForm() {
        return IntUtils.clone(this.vector);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public int hashCode() {
        return (this.field.hashCode() * 31) + this.vector.hashCode();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.vector.length - 1; length >= 0; length--) {
            if (this.vector[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public Vector multiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int i = this.length;
        if (i != vector.length) {
            lwm.m151979a("permutation size and vector size mismatch");
            return null;
        }
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < vector.length; i2++) {
            iArr[i2] = this.vector[vector[i2]];
        }
        return new GF2mVector(this.field, iArr);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.vector.length; i++) {
            for (int i2 = 0; i2 < this.field.getDegree(); i2++) {
                if (((1 << (i2 & 31)) & this.vector[i]) != 0) {
                    stringBuffer.append('1');
                } else {
                    stringBuffer.append('0');
                }
            }
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    public GF2mVector(GF2mField gF2mField, int[] iArr) {
        this.field = gF2mField;
        this.length = iArr.length;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (!gF2mField.isElementOfThisField(iArr[length])) {
                lwm.m151979a("Element array is not specified over the given finite field.");
                throw null;
            }
        }
        this.vector = IntUtils.clone(iArr);
    }

    public GF2mVector(GF2mVector gF2mVector) {
        this.field = new GF2mField(gF2mVector.field);
        this.length = gF2mVector.length;
        this.vector = IntUtils.clone(gF2mVector.vector);
    }
}
