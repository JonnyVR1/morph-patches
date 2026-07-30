package p007l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class je80 {

    /* JADX INFO: renamed from: c */
    public static volatile je80 f9324c;

    /* JADX INFO: renamed from: a */
    public g720 f9325a = new g720();

    /* JADX INFO: renamed from: b */
    public o7c f9326b = new o7c();

    /* JADX INFO: renamed from: b */
    public static je80 m11129b() {
        if (f9324c == null) {
            synchronized (je80.class) {
                try {
                    if (f9324c == null) {
                        f9324c = new je80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9324c;
    }

    /* JADX INFO: renamed from: a */
    public void m11130a() {
        if (nkg.m12263s()) {
            this.f9326b.m14781j();
        } else {
            this.f9325a.m14781j();
        }
    }
}
