package org.spongycastle.pqc.crypto.gmss;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Vector;
import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class GMSSRootCalc {
    private byte[][] AuthPath;

    /* JADX INFO: renamed from: K */
    private int f206897K;
    private GMSSDigestProvider digestProvider;
    private int heightOfNextSeed;
    private Vector heightOfNodes;
    private int heightOfTree;
    private int[] index;
    private int indexForNextSeed;
    private boolean isFinished;
    private boolean isInitialized;
    private int mdLength;
    private Digest messDigestTree;
    private Vector[] retain;
    private byte[] root;
    private Vector tailStack;
    private Treehash[] treehash;

    public GMSSRootCalc(Digest digest, byte[][] bArr, int[] iArr, Treehash[] treehashArr, Vector[] vectorArr) {
        this.messDigestTree = this.digestProvider.get();
        this.digestProvider = this.digestProvider;
        int i = iArr[0];
        this.heightOfTree = i;
        this.mdLength = iArr[1];
        this.f206897K = iArr[2];
        this.indexForNextSeed = iArr[3];
        this.heightOfNextSeed = iArr[4];
        if (iArr[5] == 1) {
            this.isFinished = true;
        } else {
            this.isFinished = false;
        }
        if (iArr[6] == 1) {
            this.isInitialized = true;
        } else {
            this.isInitialized = false;
        }
        int i2 = iArr[7];
        this.index = new int[i];
        for (int i3 = 0; i3 < this.heightOfTree; i3++) {
            this.index[i3] = iArr[i3 + 8];
        }
        this.heightOfNodes = new Vector();
        for (int i4 = 0; i4 < i2; i4++) {
            this.heightOfNodes.addElement(Integers.valueOf(iArr[this.heightOfTree + 8 + i4]));
        }
        this.root = bArr[0];
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.heightOfTree, this.mdLength);
        int i5 = 0;
        while (i5 < this.heightOfTree) {
            int i6 = i5 + 1;
            this.AuthPath[i5] = bArr[i6];
            i5 = i6;
        }
        this.tailStack = new Vector();
        for (int i7 = 0; i7 < i2; i7++) {
            this.tailStack.addElement(bArr[this.heightOfTree + 1 + i7]);
        }
        this.treehash = GMSSUtils.clone(treehashArr);
        this.retain = GMSSUtils.clone(vectorArr);
    }

    public byte[][] getAuthPath() {
        return GMSSUtils.clone(this.AuthPath);
    }

    public Vector[] getRetain() {
        return GMSSUtils.clone(this.retain);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.root);
    }

    public Vector getStack() {
        Vector vector = new Vector();
        Enumeration enumerationElements = this.tailStack.elements();
        while (enumerationElements.hasMoreElements()) {
            vector.addElement(enumerationElements.nextElement());
        }
        return vector;
    }

    public byte[][] getStatByte() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.heightOfTree + 1 + size, 64);
        bArr[0] = this.root;
        int i = 0;
        while (i < this.heightOfTree) {
            int i2 = i + 1;
            bArr[i2] = this.AuthPath[i];
            i = i2;
        }
        for (int i3 = 0; i3 < size; i3++) {
            bArr[this.heightOfTree + 1 + i3] = (byte[]) this.tailStack.elementAt(i3);
        }
        return bArr;
    }

    public int[] getStatInt() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        int i = this.heightOfTree;
        int[] iArr = new int[i + 8 + size];
        iArr[0] = i;
        iArr[1] = this.mdLength;
        iArr[2] = this.f206897K;
        iArr[3] = this.indexForNextSeed;
        iArr[4] = this.heightOfNextSeed;
        if (this.isFinished) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        if (this.isInitialized) {
            iArr[6] = 1;
        } else {
            iArr[6] = 0;
        }
        iArr[7] = size;
        for (int i2 = 0; i2 < this.heightOfTree; i2++) {
            iArr[i2 + 8] = this.index[i2];
        }
        for (int i3 = 0; i3 < size; i3++) {
            iArr[this.heightOfTree + 8 + i3] = ((Integer) this.heightOfNodes.elementAt(i3)).intValue();
        }
        return iArr;
    }

    public Treehash[] getTreehash() {
        return GMSSUtils.clone(this.treehash);
    }

    public void initialize(Vector vector) {
        int i;
        this.treehash = new Treehash[this.heightOfTree - this.f206897K];
        int i2 = 0;
        while (true) {
            i = this.heightOfTree;
            if (i2 >= i - this.f206897K) {
                break;
            }
            this.treehash[i2] = new Treehash(vector, i2, this.digestProvider.get());
            i2++;
        }
        this.index = new int[i];
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, this.mdLength);
        this.root = new byte[this.mdLength];
        this.tailStack = new Vector();
        this.heightOfNodes = new Vector();
        this.isInitialized = true;
        this.isFinished = false;
        for (int i3 = 0; i3 < this.heightOfTree; i3++) {
            this.index[i3] = -1;
        }
        this.retain = new Vector[this.f206897K - 1];
        for (int i4 = 0; i4 < this.f206897K - 1; i4++) {
            this.retain[i4] = new Vector();
        }
        this.indexForNextSeed = 3;
        this.heightOfNextSeed = 0;
    }

    public void initializeTreehashSeed(byte[] bArr, int i) {
        this.treehash[i].initializeSeed(bArr);
    }

    public String toString() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        String str = "";
        for (int i = 0; i < this.heightOfTree + 8 + size; i++) {
            str = str + getStatInt()[i] + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        for (int i2 = 0; i2 < this.heightOfTree + 1 + size; i2++) {
            str = str + new String(Hex.encode(getStatByte()[i2])) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        return str + "  " + this.digestProvider.get().getDigestSize();
    }

    public void update(byte[] bArr) {
        if (this.isFinished) {
            System.out.print("Too much updates for Tree!!");
            return;
        }
        if (!this.isInitialized) {
            System.err.println("GMSSRootCalc not initialized!");
            return;
        }
        int[] iArr = this.index;
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i == 1) {
            System.arraycopy(bArr, 0, this.AuthPath[0], 0, this.mdLength);
        } else if (i == 3 && this.heightOfTree > this.f206897K) {
            this.treehash[0].setFirstNode(bArr);
        }
        int i2 = this.index[0];
        if ((i2 - 3) % 2 == 0 && i2 >= 3 && this.heightOfTree == this.f206897K) {
            this.retain[0].insertElementAt(bArr, 0);
        }
        if (this.index[0] == 0) {
            this.tailStack.addElement(bArr);
            this.heightOfNodes.addElement(Integers.valueOf(0));
            return;
        }
        int i3 = this.mdLength;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 << 1;
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        int i5 = 0;
        while (this.tailStack.size() > 0 && i5 == ((Integer) this.heightOfNodes.lastElement()).intValue()) {
            System.arraycopy(this.tailStack.lastElement(), 0, bArr3, 0, this.mdLength);
            Vector vector = this.tailStack;
            vector.removeElementAt(vector.size() - 1);
            Vector vector2 = this.heightOfNodes;
            vector2.removeElementAt(vector2.size() - 1);
            int i6 = this.mdLength;
            System.arraycopy(bArr2, 0, bArr3, i6, i6);
            this.messDigestTree.update(bArr3, 0, i4);
            bArr2 = new byte[this.messDigestTree.getDigestSize()];
            this.messDigestTree.doFinal(bArr2, 0);
            i5++;
            if (i5 < this.heightOfTree) {
                int[] iArr2 = this.index;
                int i7 = iArr2[i5] + 1;
                iArr2[i5] = i7;
                if (i7 == 1) {
                    System.arraycopy(bArr2, 0, this.AuthPath[i5], 0, this.mdLength);
                }
                if (i5 >= this.heightOfTree - this.f206897K) {
                    if (i5 == 0) {
                        System.out.println("M���P");
                    }
                    int i8 = this.index[i5];
                    if ((i8 - 3) % 2 == 0 && i8 >= 3) {
                        this.retain[i5 - (this.heightOfTree - this.f206897K)].insertElementAt(bArr2, 0);
                    }
                } else if (this.index[i5] == 3) {
                    this.treehash[i5].setFirstNode(bArr2);
                }
            }
        }
        this.tailStack.addElement(bArr2);
        this.heightOfNodes.addElement(Integers.valueOf(i5));
        if (i5 == this.heightOfTree) {
            this.isFinished = true;
            this.isInitialized = false;
            this.root = (byte[]) this.tailStack.lastElement();
        }
    }

    public boolean wasFinished() {
        return this.isFinished;
    }

    public boolean wasInitialized() {
        return this.isInitialized;
    }

    public GMSSRootCalc(int i, int i2, GMSSDigestProvider gMSSDigestProvider) {
        this.heightOfTree = i;
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        int digestSize = digest.getDigestSize();
        this.mdLength = digestSize;
        this.f206897K = i2;
        this.index = new int[i];
        int[] iArr = {i, digestSize};
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr);
        this.root = new byte[this.mdLength];
        this.retain = new Vector[this.f206897K - 1];
        for (int i3 = 0; i3 < i2 - 1; i3++) {
            this.retain[i3] = new Vector();
        }
    }

    public void update(byte[] bArr, byte[] bArr2) {
        int i = this.heightOfNextSeed;
        if (i < this.heightOfTree - this.f206897K && this.indexForNextSeed - 2 == this.index[0]) {
            initializeTreehashSeed(bArr, i);
            this.heightOfNextSeed++;
            this.indexForNextSeed *= 2;
        }
        update(bArr2);
    }
}
