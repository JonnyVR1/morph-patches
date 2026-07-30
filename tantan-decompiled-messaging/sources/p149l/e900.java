package p149l;

/* JADX INFO: loaded from: classes9.dex */
public class e900 {

    /* JADX INFO: renamed from: g */
    public static volatile e900 f89908g;

    /* JADX INFO: renamed from: a */
    public String f89909a = "";

    /* JADX INFO: renamed from: b */
    public String f89910b = "";

    /* JADX INFO: renamed from: c */
    public String f89911c = "";

    /* JADX INFO: renamed from: d */
    public boolean f89912d = false;

    /* JADX INFO: renamed from: e */
    public boolean f89913e = false;

    /* JADX INFO: renamed from: f */
    public boolean f89914f = false;

    /* JADX INFO: renamed from: a */
    public static void m115329a() {
        f89908g = null;
    }

    /* JADX INFO: renamed from: b */
    public static e900 m115330b() {
        if (f89908g == null) {
            synchronized (e900.class) {
                try {
                    if (f89908g == null) {
                        f89908g = new e900();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f89908g;
    }

    /* JADX INFO: renamed from: c */
    public String m115331c() {
        return this.f89909a;
    }

    /* JADX INFO: renamed from: d */
    public String m115332d() {
        return this.f89910b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m115333e() {
        return this.f89913e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m115334f() {
        return this.f89912d;
    }

    /* JADX INFO: renamed from: g */
    public boolean m115335g() {
        return this.f89914f;
    }
}
