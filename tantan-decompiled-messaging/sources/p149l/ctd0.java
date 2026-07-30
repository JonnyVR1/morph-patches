package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class ctd0 {

    /* JADX INFO: renamed from: a */
    public int[] f82469a;

    /* JADX INFO: renamed from: b */
    public boolean f82470b;

    /* JADX INFO: renamed from: a */
    public static ctd0 m108668a(br3 br3Var, int i) throws IOException {
        ctd0 ctd0Var = new ctd0();
        ctd0Var.f82469a = new int[i];
        int iM103447h = 8;
        int i2 = 8;
        int i3 = 0;
        while (i3 < i) {
            if (iM103447h != 0) {
                iM103447h = ((br3Var.m103447h("deltaScale") + i2) + 256) % 256;
                ctd0Var.f82470b = i3 == 0 && iM103447h == 0;
            }
            int[] iArr = ctd0Var.f82469a;
            if (iM103447h != 0) {
                i2 = iM103447h;
            }
            iArr[i3] = i2;
            i3++;
        }
        return ctd0Var;
    }

    public String toString() {
        return "ScalingList{scalingList=" + this.f82469a + ", useDefaultScalingMatrixFlag=" + this.f82470b + '}';
    }
}
