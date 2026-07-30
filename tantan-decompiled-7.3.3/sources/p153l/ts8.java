package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class ts8 {

    /* JADX INFO: renamed from: b */
    public static ts8 f175966b;

    /* JADX INFO: renamed from: a */
    public ft5 f175967a = new ft5();

    /* JADX INFO: renamed from: b */
    public static ts8 m192568b() {
        if (f175966b == null) {
            synchronized (ts8.class) {
                try {
                    if (f175966b == null) {
                        f175966b = new ts8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f175966b;
    }

    /* JADX INFO: renamed from: a */
    public void m192569a() {
        this.f175967a.m127299c();
    }

    /* JADX INFO: renamed from: c */
    public void m192570c() {
    }
}
