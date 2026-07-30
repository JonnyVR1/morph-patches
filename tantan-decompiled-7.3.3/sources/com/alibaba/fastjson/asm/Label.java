package com.alibaba.fastjson.asm;

/* JADX INFO: loaded from: classes.dex */
public class Label {
    int inputStackTop;
    Label next;
    int outputStackMax;
    int position;
    private int referenceCount;
    private int[] srcAndRefPositions;
    int status;
    Label successor;

    private void addReference(int i, int i2) {
        if (this.srcAndRefPositions == null) {
            this.srcAndRefPositions = new int[6];
        }
        int i3 = this.referenceCount;
        int[] iArr = this.srcAndRefPositions;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.srcAndRefPositions = iArr2;
        }
        int[] iArr3 = this.srcAndRefPositions;
        int i4 = this.referenceCount;
        int i5 = i4 + 1;
        this.referenceCount = i5;
        iArr3[i4] = i;
        this.referenceCount = i4 + 2;
        iArr3[i5] = i2;
    }

    public void put(MethodWriter methodWriter, ByteVector byteVector, int i) {
        if ((this.status & 2) != 0) {
            byteVector.putShort(this.position - i);
        } else {
            addReference(i, byteVector.length);
            byteVector.putShort(-1);
        }
    }

    public void resolve(MethodWriter methodWriter, int i, byte[] bArr) {
        this.status |= 2;
        this.position = i;
        int i2 = 0;
        while (i2 < this.referenceCount) {
            int[] iArr = this.srcAndRefPositions;
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            i2 += 2;
            int i5 = iArr[i3];
            int i6 = i - i4;
            bArr[i5] = (byte) (i6 >>> 8);
            bArr[i5 + 1] = (byte) i6;
        }
    }
}
