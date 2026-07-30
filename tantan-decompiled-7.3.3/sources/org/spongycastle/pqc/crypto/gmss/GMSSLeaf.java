package org.spongycastle.pqc.crypto.gmss;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* JADX INFO: renamed from: i */
    private int f207814i;

    /* JADX INFO: renamed from: j */
    private int f207815j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* JADX INFO: renamed from: w */
    private int f207816w;

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f207814i = iArr[0];
        this.f207815j = iArr[1];
        this.steps = iArr[2];
        this.f207816w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / ((double) this.f207816w));
        this.keysize = iCeil + ((int) Math.ceil(((double) getLog((iCeil << this.f207816w) + 1)) / ((double) this.f207816w)));
        this.two_power_w = 1 << this.f207816w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i = 0; i < this.steps + 10000; i++) {
            int i2 = this.f207814i;
            if (i2 == this.keysize && this.f207815j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i2 == 0 || this.f207815j == this.two_power_w - 1) {
                this.f207814i = i2 + 1;
                this.f207815j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i3 = this.f207815j + 1;
                this.f207815j = i3;
                if (i3 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i4 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f207814i - 1) * i4, i4);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f207814i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f207815j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        int i = this.mdsize;
        byte[][] bArr = {new byte[i], new byte[i], new byte[this.keysize * i], new byte[i]};
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.concHashs;
        bArr[3] = this.leaf;
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.f207814i, this.f207815j, this.steps, this.f207816w};
    }

    public void initLeafCalc(byte[] bArr) {
        this.f207814i = 0;
        this.f207815j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < 4; i++) {
            str = str + getStatInt()[i] + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        String strConcat = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.mdsize + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.keysize + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.two_power_w + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        byte[][] statByte = getStatByte();
        for (int i2 = 0; i2 < 4; i2++) {
            strConcat = statByte[i2] != null ? strConcat + new String(Hex.encode(statByte[i2])) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR : strConcat.concat("null ");
        }
        return strConcat;
    }

    public GMSSLeaf(Digest digest, int i, int i2) {
        this.f207816w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d = i;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d);
        int iCeil2 = iCeil + ((int) Math.ceil(((double) getLog((iCeil << i) + 1)) / d));
        this.keysize = iCeil2;
        int i3 = 1 << i;
        this.two_power_w = i3;
        this.steps = (int) Math.ceil(((double) ((((i3 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i2));
        int i4 = this.mdsize;
        this.seed = new byte[i4];
        this.leaf = new byte[i4];
        this.privateKeyOTS = new byte[i4];
        this.concHashs = new byte[i4 * this.keysize];
    }

    public GMSSLeaf(Digest digest, int i, int i2, byte[] bArr) {
        this.f207816w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d = i;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d);
        int iCeil2 = iCeil + ((int) Math.ceil(((double) getLog((iCeil << i) + 1)) / d));
        this.keysize = iCeil2;
        int i3 = 1 << i;
        this.two_power_w = i3;
        this.steps = (int) Math.ceil(((double) ((((i3 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i2));
        int i4 = this.mdsize;
        this.seed = new byte[i4];
        this.leaf = new byte[i4];
        this.privateKeyOTS = new byte[i4];
        this.concHashs = new byte[i4 * this.keysize];
        initLeafCalc(bArr);
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f207814i = gMSSLeaf.f207814i;
        this.f207815j = gMSSLeaf.f207815j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f207816w = gMSSLeaf.f207816w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}
