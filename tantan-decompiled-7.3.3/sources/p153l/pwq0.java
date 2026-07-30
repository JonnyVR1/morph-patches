package p153l;

/* JADX INFO: loaded from: classes.dex */
public class pwq0 {

    /* JADX INFO: renamed from: a */
    private static volatile pwq0 f154432a;

    private pwq0() {
    }

    /* JADX INFO: renamed from: a */
    public static pwq0 m174074a() {
        if (f154432a == null) {
            synchronized (pwq0.class) {
                try {
                    if (f154432a == null) {
                        f154432a = new pwq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f154432a;
    }

    /* JADX INFO: renamed from: b */
    public static void m174075b(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m174076c(Throwable th, String str) {
    }
}
