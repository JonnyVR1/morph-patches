package org.spongycastle.pqc.crypto.rainbow;

/* JADX INFO: loaded from: classes3.dex */
public class RainbowPrivateKeyParameters extends RainbowKeyParameters {
    private short[][] A1inv;
    private short[][] A2inv;

    /* JADX INFO: renamed from: b1 */
    private short[] f206991b1;

    /* JADX INFO: renamed from: b2 */
    private short[] f206992b2;
    private Layer[] layers;

    /* JADX INFO: renamed from: vi */
    private int[] f206993vi;

    public RainbowPrivateKeyParameters(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        super(true, iArr[iArr.length - 1] - iArr[0]);
        this.A1inv = sArr;
        this.f206991b1 = sArr2;
        this.A2inv = sArr3;
        this.f206992b2 = sArr4;
        this.f206993vi = iArr;
        this.layers = layerArr;
    }

    public short[] getB1() {
        return this.f206991b1;
    }

    public short[] getB2() {
        return this.f206992b2;
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public Layer[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.f206993vi;
    }
}
