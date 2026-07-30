package p153l;

/* JADX INFO: loaded from: classes13.dex */
public class pm80 {

    /* JADX INFO: renamed from: c */
    public static volatile pm80 f153124c;

    /* JADX INFO: renamed from: a */
    public of20 f153125a = new of20();

    /* JADX INFO: renamed from: b */
    public u8c f153126b = new u8c();

    /* JADX INFO: renamed from: b */
    public static pm80 m172919b() {
        if (f153124c == null) {
            synchronized (pm80.class) {
                try {
                    if (f153124c == null) {
                        f153124c = new pm80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f153124c;
    }

    /* JADX INFO: renamed from: a */
    public void m172920a() {
        if (cmg.m111233s()) {
            this.f153126b.m171092j();
        } else {
            this.f153125a.m171092j();
        }
    }
}
