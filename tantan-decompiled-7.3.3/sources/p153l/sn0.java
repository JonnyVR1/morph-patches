package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class sn0 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f169634a = m186855a("libcore.io.Memory");

    /* JADX INFO: renamed from: b */
    public static final boolean f169635b;

    static {
        f169635b = m186855a("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: renamed from: a */
    public static <T> Class<T> m186855a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Class<?> m186856b() {
        return f169634a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m186857c() {
        return (f169634a == null || f169635b) ? false : true;
    }
}
