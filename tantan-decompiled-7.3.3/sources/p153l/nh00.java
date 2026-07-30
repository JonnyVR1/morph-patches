package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class nh00 {

    /* JADX INFO: renamed from: g */
    public static volatile nh00 f141894g;

    /* JADX INFO: renamed from: a */
    public String f141895a = "";

    /* JADX INFO: renamed from: b */
    public String f141896b = "";

    /* JADX INFO: renamed from: c */
    public String f141897c = "";

    /* JADX INFO: renamed from: d */
    public boolean f141898d = false;

    /* JADX INFO: renamed from: e */
    public boolean f141899e = false;

    /* JADX INFO: renamed from: f */
    public boolean f141900f = false;

    /* JADX INFO: renamed from: a */
    public static void m163017a() {
        f141894g = null;
    }

    /* JADX INFO: renamed from: b */
    public static nh00 m163018b() {
        if (f141894g == null) {
            synchronized (nh00.class) {
                try {
                    if (f141894g == null) {
                        f141894g = new nh00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f141894g;
    }

    /* JADX INFO: renamed from: c */
    public String m163019c() {
        return this.f141895a;
    }

    /* JADX INFO: renamed from: d */
    public String m163020d() {
        return this.f141896b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m163021e() {
        return this.f141899e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m163022f() {
        return this.f141898d;
    }

    /* JADX INFO: renamed from: g */
    public boolean m163023g() {
        return this.f141900f;
    }
}
