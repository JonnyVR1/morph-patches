package org.apache.commons.sudcompress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import p149l.dkq;
import p149l.hg3;
import p149l.ig3;
import p149l.p6g0;
import p149l.rhg0;
import p149l.vdg0;

/* JADX INFO: loaded from: classes2.dex */
class BinaryTree {
    private static final int NODE = -2;
    private static final int UNDEFINED = -1;
    private final int[] tree;

    public BinaryTree(int i) {
        if (i < 0 || i > 30) {
            ig3.m135964a(vdg0.m197997a(i, "depth must be bigger than 0 and not bigger than 30 but is "));
            throw null;
        }
        int[] iArr = new int[(int) ((1 << (i + 1)) - 1)];
        this.tree = iArr;
        Arrays.fill(iArr, -1);
    }

    public static BinaryTree decode(InputStream inputStream, int i) throws IOException {
        if (i < 0) {
            ig3.m135964a(vdg0.m197997a(i, "totalNumberOfValues must be bigger than 0, is "));
            return null;
        }
        int i2 = inputStream.read() + 1;
        if (i2 == 0) {
            rhg0.m179353a("Cannot read the size of the encoded tree, unexpected end of stream");
            return null;
        }
        byte[] bArr = new byte[i2];
        if (p6g0.m167663a(inputStream, bArr, 0, i2) != i2) {
            hg3.m130807a();
            return null;
        }
        int[] iArr = new int[i];
        int i3 = 0;
        int iMax = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            byte b = bArr[i4];
            int i5 = ((b & 240) >> 4) + 1;
            if (i3 + i5 > i) {
                rhg0.m179353a("Number of values exceeds given total number of values");
                return null;
            }
            int i6 = (b & 15) + 1;
            int i7 = 0;
            while (i7 < i5) {
                iArr[i3] = i6;
                i7++;
                i3++;
            }
            iMax = Math.max(iMax, i6);
        }
        int[] iArr2 = new int[i];
        for (int i8 = 0; i8 < i; i8++) {
            iArr2[i8] = i8;
        }
        int[] iArr3 = new int[i];
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            for (int i11 = 0; i11 < i; i11++) {
                if (iArr[i11] == i10) {
                    iArr3[i9] = i10;
                    iArr2[i9] = i11;
                    i9++;
                }
            }
        }
        int[] iArr4 = new int[i];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = i - 1; i15 >= 0; i15--) {
            i12 += i13;
            int i16 = iArr3[i15];
            if (i16 != i14) {
                i13 = 1 << (16 - i16);
                i14 = i16;
            }
            iArr4[iArr2[i15]] = i12;
        }
        BinaryTree binaryTree = new BinaryTree(iMax);
        for (int i17 = 0; i17 < i; i17++) {
            int i18 = iArr[i17];
            if (i18 > 0) {
                binaryTree.addLeaf(0, Integer.reverse(iArr4[i17] << 16), i18, i17);
            }
        }
        return binaryTree;
    }

    public void addLeaf(int i, int i2, int i3, int i4) {
        int[] iArr = this.tree;
        if (i3 != 0) {
            iArr[i] = -2;
            addLeaf((i * 2) + 1 + (i2 & 1), i2 >>> 1, i3 - 1, i4);
        } else if (iArr[i] == -1) {
            iArr[i] = i4;
        } else {
            dkq.m112270a("Tree value at index ", i, " has already been assigned (", this.tree[i], ")");
        }
    }

    public int read(BitStream bitStream) throws IOException {
        int i = 0;
        while (true) {
            int iNextBit = bitStream.nextBit();
            if (iNextBit == -1) {
                return -1;
            }
            int i2 = (i * 2) + 1 + iNextBit;
            int i3 = this.tree[i2];
            if (i3 != -2) {
                if (i3 != -1) {
                    return i3;
                }
                throw new IOException("The child " + iNextBit + " of node at index " + i + " is not defined");
            }
            i = i2;
        }
    }
}
