package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class bbu0 {
    /* JADX INFO: renamed from: a */
    public static Object m101031a(Object obj) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m101032b(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        qkq0.m175383a(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
