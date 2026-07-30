package p153l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class wrw0 {
    /* JADX INFO: renamed from: a */
    public static Object m207708a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* JADX INFO: renamed from: b */
    public static void m207709b(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m207710c(Collection collection, Iterator it) {
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }
}
