package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class b1t0 {
    /* JADX INFO: renamed from: a */
    public static int m101503a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: renamed from: b */
    public static void m101504b(Object obj, Object obj2) {
        if (obj == null) {
            mnd0.m159157a("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            spw0.m187485a(obj);
        }
    }
}
