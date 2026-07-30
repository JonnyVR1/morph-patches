package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class vti {
    /* JADX INFO: renamed from: a */
    public static int[] m202673a(float f) {
        int[] iArr = new int[2];
        if (f < 1.0f) {
            int iM203708q5 = zrv.m221193k().m203708q5();
            iArr[0] = iM203708q5;
            iArr[1] = (int) (iM203708q5 * 1.7777778f);
            return iArr;
        }
        int i = fti.f100740i;
        iArr[1] = i;
        iArr[0] = (int) (i * f);
        return iArr;
    }
}
