package p153l;

import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public final class vpw0 {
    /* JADX INFO: renamed from: a */
    public static boolean m202346a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
