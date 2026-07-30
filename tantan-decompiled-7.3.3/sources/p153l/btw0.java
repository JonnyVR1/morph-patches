package p153l;

import com.google.android.gms.internal.ads.C2305x1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes6.dex */
public final class btw0 {
    /* JADX INFO: renamed from: a */
    public static int m106403a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: b */
    public static xsw0 m106404b(Set set, Set set2) {
        tow0.m192088c(set, "set1");
        tow0.m192088c(set2, "set2");
        return new ssw0(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    /* JADX INFO: renamed from: c */
    public static Set m106405c(Set set, uow0 uow0Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (!(sortedSet instanceof tsw0)) {
                return new usw0(sortedSet, uow0Var);
            }
            tsw0 tsw0Var = (tsw0) sortedSet;
            return new usw0((SortedSet) tsw0Var.f180331a, C2305x1.m13497a(tsw0Var.f180332b, uow0Var));
        }
        if (!(set instanceof tsw0)) {
            set.getClass();
            return new tsw0(set, uow0Var);
        }
        tsw0 tsw0Var2 = (tsw0) set;
        return new tsw0(tsw0Var2.f180331a, C2305x1.m13497a(tsw0Var2.f180332b, uow0Var));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m106406d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m106407e(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof osw0) {
            collection = ((osw0) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m106408f(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m106408f(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
