package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class m6r0 {

    /* JADX INFO: renamed from: a */
    public static final String f135024a;

    /* JADX INFO: renamed from: b */
    public static boolean f135025b;

    /* JADX INFO: renamed from: c */
    private static int f135026c;

    static {
        String str = jsq0.f122525a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f135024a = str;
        f135025b = false;
        f135026c = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            f135026c = 2;
        } else if (str.equalsIgnoreCase("ONEBOX")) {
            f135026c = 3;
        } else {
            f135026c = 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m157261a() {
        return f135026c;
    }

    /* JADX INFO: renamed from: b */
    public static void m157262b(int i) {
        f135026c = i;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m157263c() {
        return f135026c == 2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m157264d() {
        return f135026c == 3;
    }
}
