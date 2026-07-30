package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class jdq0 {

    /* JADX INFO: renamed from: l.jdq0$a */
    public static class C17755a {

        /* JADX INFO: renamed from: a */
        public int f117429a = -1;

        /* JADX INFO: renamed from: b */
        public int f117430b = -1;

        /* JADX INFO: renamed from: c */
        public int f117431c = -1;

        /* JADX INFO: renamed from: d */
        public int f117432d = -1;

        /* JADX INFO: renamed from: e */
        public int f117433e = -1;

        /* JADX INFO: renamed from: f */
        public int f117434f = -1;
    }

    /* JADX INFO: renamed from: a */
    public static C17755a m141055a(int i, int i2, int i3, int i4) {
        if (i3 > i || i4 > i2) {
            float f = i3;
            float f2 = i4;
            float f3 = i * 1.0f;
            float f4 = i2;
            if ((f * 1.0f) / f2 > f3 / f4) {
                i4 = (int) ((f3 / f) * f2);
                i3 = i;
            } else {
                i3 = (int) (((f4 * 1.0f) / f2) * f);
                i4 = i2;
            }
        }
        if (i4 % 2 != 0) {
            i4 = Math.max(0, i4 - 1);
        }
        if (i3 % 2 != 0) {
            i3 = Math.max(0, i3 - 1);
        }
        int iMax = (i2 - i4) / 2;
        if (iMax % 2 != 0) {
            iMax = Math.max(0, iMax - 1);
        }
        int iMax2 = (i - i3) / 2;
        if (iMax2 % 2 != 0) {
            iMax2 = Math.max(0, iMax2 - 1);
        }
        C17755a c17755a = new C17755a();
        c17755a.f117429a = iMax2;
        c17755a.f117430b = iMax;
        c17755a.f117431c = i3;
        c17755a.f117432d = i4;
        return c17755a;
    }
}
