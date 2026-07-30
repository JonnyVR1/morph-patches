package p149l;

/* JADX INFO: loaded from: classes.dex */
public final class wn0 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f187229a = m204552a("libcore.io.Memory");

    /* JADX INFO: renamed from: b */
    public static final boolean f187230b;

    static {
        f187230b = m204552a("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: renamed from: a */
    public static <T> Class<T> m204552a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Class<?> m204553b() {
        return f187229a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m204554c() {
        return (f187229a == null || f187230b) ? false : true;
    }
}
