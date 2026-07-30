package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ngw0 {
    /* JADX INFO: renamed from: a */
    public static int m159361a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: renamed from: b */
    public static void m159362b(Object obj, Object obj2) {
        if (obj == null) {
            jfd0.m141176a("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            mgw0.m154583a(obj);
        }
    }
}
