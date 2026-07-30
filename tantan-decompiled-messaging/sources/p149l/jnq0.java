package p149l;

/* JADX INFO: loaded from: classes.dex */
public class jnq0 {

    /* JADX INFO: renamed from: a */
    private static volatile jnq0 f118877a;

    private jnq0() {
    }

    /* JADX INFO: renamed from: a */
    public static jnq0 m142383a() {
        if (f118877a == null) {
            synchronized (jnq0.class) {
                try {
                    if (f118877a == null) {
                        f118877a = new jnq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f118877a;
    }

    /* JADX INFO: renamed from: b */
    public static void m142384b(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m142385c(Throwable th, String str) {
    }
}
