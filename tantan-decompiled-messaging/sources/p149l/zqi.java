package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class zqi {
    /* JADX INFO: renamed from: a */
    public static int[] m219853a(float f) {
        int[] iArr = new int[2];
        if (f < 1.0f) {
            int iM195921q5 = ypv.m215672k().m195921q5();
            iArr[0] = iM195921q5;
            iArr[1] = (int) (iM195921q5 * 1.7777778f);
            return iArr;
        }
        int i = jqi.f119283i;
        iArr[1] = i;
        iArr[0] = (int) (i * f);
        return iArr;
    }
}
