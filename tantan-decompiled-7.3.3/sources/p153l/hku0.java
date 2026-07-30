package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class hku0 {
    /* JADX INFO: renamed from: a */
    public static Object m135644a(Object obj) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m135645b(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        wtq0.m207906a(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
