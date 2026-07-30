package p149l;

/* JADX INFO: loaded from: classes12.dex */
public class je80 {

    /* JADX INFO: renamed from: c */
    public static volatile je80 f117481c;

    /* JADX INFO: renamed from: a */
    public g720 f117482a = new g720();

    /* JADX INFO: renamed from: b */
    public o7c f117483b = new o7c();

    /* JADX INFO: renamed from: b */
    public static je80 m141102b() {
        if (f117481c == null) {
            synchronized (je80.class) {
                try {
                    if (f117481c == null) {
                        f117481c = new je80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f117481c;
    }

    /* JADX INFO: renamed from: a */
    public void m141103a() {
        if (nkg.m159904s()) {
            this.f117483b.m192037j();
        } else {
            this.f117482a.m192037j();
        }
    }
}
