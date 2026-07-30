package p153l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class qxr0 {
    /* JADX INFO: renamed from: a */
    public static int m178616a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
