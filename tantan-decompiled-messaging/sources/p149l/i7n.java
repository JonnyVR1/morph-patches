package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class i7n {

    /* JADX INFO: renamed from: a */
    public static int f111930a = -1;

    /* JADX INFO: renamed from: a */
    public static int m134915a() {
        int i = f111930a;
        if (i != -1) {
            return i;
        }
        int iM172109a = pyd.INSTANCE.m172109a();
        f111930a = iM172109a;
        return iM172109a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m134916b() {
        return uvr.m196087d().m162671H0() && m134918d();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m134917c() {
        return m134918d();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m134918d() {
        return !vdt.m198092b(2) && m134915a() <= 0;
    }
}
