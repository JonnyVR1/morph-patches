package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class gxq0 {

    /* JADX INFO: renamed from: a */
    public static final String f104915a;

    /* JADX INFO: renamed from: b */
    public static boolean f104916b;

    /* JADX INFO: renamed from: c */
    private static int f104917c;

    static {
        String str = ejq0.f91776a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f104915a = str;
        f104916b = false;
        f104917c = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            f104917c = 2;
        } else if (str.equalsIgnoreCase("ONEBOX")) {
            f104917c = 3;
        } else {
            f104917c = 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m128639a() {
        return f104917c;
    }

    /* JADX INFO: renamed from: b */
    public static void m128640b(int i) {
        f104917c = i;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m128641c() {
        return f104917c == 2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m128642d() {
        return f104917c == 3;
    }
}
