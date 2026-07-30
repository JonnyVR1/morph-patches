package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class wgx0 {
    /* JADX INFO: renamed from: a */
    public static Object m203088a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a(str);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Object m203089b(Object obj) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m203090c(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        qkq0.m175383a(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
