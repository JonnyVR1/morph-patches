package p149l;

import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public final class pgw0 {
    /* JADX INFO: renamed from: a */
    public static boolean m168924a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
