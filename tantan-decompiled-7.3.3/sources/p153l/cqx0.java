package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class cqx0 {
    /* JADX INFO: renamed from: a */
    public static Object m111998a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a(str);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Object m111999b(Object obj) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m112000c(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        wtq0.m207906a(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
