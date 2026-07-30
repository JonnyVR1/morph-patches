package p006l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class e900 {

    /* JADX INFO: renamed from: g */
    public static volatile e900 f10852g;

    /* JADX INFO: renamed from: a */
    public String f10853a = "";

    /* JADX INFO: renamed from: b */
    public String f10854b = "";

    /* JADX INFO: renamed from: c */
    public String f10855c = "";

    /* JADX INFO: renamed from: d */
    public boolean f10856d = false;

    /* JADX INFO: renamed from: e */
    public boolean f10857e = false;

    /* JADX INFO: renamed from: f */
    public boolean f10858f = false;

    /* JADX INFO: renamed from: a */
    public static void m14413a() {
        f10852g = null;
    }

    /* JADX INFO: renamed from: b */
    public static e900 m14414b() {
        if (f10852g == null) {
            synchronized (e900.class) {
                try {
                    if (f10852g == null) {
                        f10852g = new e900();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10852g;
    }

    /* JADX INFO: renamed from: c */
    public String m14415c() {
        return this.f10853a;
    }

    /* JADX INFO: renamed from: d */
    public String m14416d() {
        return this.f10854b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m14417e() {
        return this.f10857e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14418f() {
        return this.f10856d;
    }

    /* JADX INFO: renamed from: g */
    public boolean m14419g() {
        return this.f10858f;
    }
}
