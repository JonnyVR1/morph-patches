package p149l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class qiw0 {
    /* JADX INFO: renamed from: a */
    public static Object m174920a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* JADX INFO: renamed from: b */
    public static void m174921b(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m174922c(Collection collection, Iterator it) {
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }
}
