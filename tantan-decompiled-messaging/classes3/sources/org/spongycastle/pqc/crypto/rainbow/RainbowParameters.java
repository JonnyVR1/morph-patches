package org.spongycastle.pqc.crypto.rainbow;

import l.whq0;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RainbowParameters implements CipherParameters {
    private final int[] DEFAULT_VI;

    /* JADX INFO: renamed from: vi */
    private int[] f10615vi;

    public RainbowParameters(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.f10615vi = iArr;
        try {
            checkParams();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkParams() throws Exception {
        int[] iArr;
        int i;
        int[] iArr2 = this.f10615vi;
        if (iArr2 == null) {
            whq0.a("no layers defined.");
            return;
        }
        if (iArr2.length <= 1) {
            whq0.a("Rainbow needs at least 1 layer, such that v1 < v2.");
            return;
        }
        int i2 = 0;
        do {
            iArr = this.f10615vi;
            if (i2 >= iArr.length - 1) {
                return;
            }
            i = iArr[i2];
            i2++;
        } while (i < iArr[i2]);
        whq0.a("v[i] has to be smaller than v[i+1]");
    }

    public int getDocLength() {
        int[] iArr = this.f10615vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f10615vi.length - 1;
    }

    public int[] getVi() {
        return this.f10615vi;
    }

    public RainbowParameters() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.DEFAULT_VI = iArr;
        this.f10615vi = iArr;
    }
}
