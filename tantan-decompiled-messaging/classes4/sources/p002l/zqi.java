package p002l;

import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zqi {
    /* JADX INFO: renamed from: a */
    public static int[] m27502a(float f) {
        int[] iArr = new int[2];
        if (f < 1.0f) {
            int iQ5 = ypv.k().q5();
            iArr[0] = iQ5;
            iArr[1] = (int) (iQ5 * 1.7777778f);
            return iArr;
        }
        int i = jqi.f13982i;
        iArr[1] = i;
        iArr[0] = (int) (i * f);
        return iArr;
    }
}
