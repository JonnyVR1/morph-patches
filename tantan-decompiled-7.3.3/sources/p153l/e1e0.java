package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class e1e0 {

    /* JADX INFO: renamed from: a */
    public int[] f91600a;

    /* JADX INFO: renamed from: b */
    public boolean f91601b;

    /* JADX INFO: renamed from: a */
    public static e1e0 m118970a(as3 as3Var, int i) throws IOException {
        e1e0 e1e0Var = new e1e0();
        e1e0Var.f91600a = new int[i];
        int iM99859h = 8;
        int i2 = 8;
        int i3 = 0;
        while (i3 < i) {
            if (iM99859h != 0) {
                iM99859h = ((as3Var.m99859h("deltaScale") + i2) + 256) % 256;
                e1e0Var.f91601b = i3 == 0 && iM99859h == 0;
            }
            int[] iArr = e1e0Var.f91600a;
            if (iM99859h != 0) {
                i2 = iM99859h;
            }
            iArr[i3] = i2;
            i3++;
        }
        return e1e0Var;
    }

    public String toString() {
        return "ScalingList{scalingList=" + this.f91600a + ", useDefaultScalingMatrixFlag=" + this.f91601b + '}';
    }
}
