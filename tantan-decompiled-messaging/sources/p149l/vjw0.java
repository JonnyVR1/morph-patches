package p149l;

import com.google.android.gms.internal.ads.C2282x1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes6.dex */
public final class vjw0 {
    /* JADX INFO: renamed from: a */
    public static int m198701a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: b */
    public static rjw0 m198702b(Set set, Set set2) {
        nfw0.m159281c(set, "set1");
        nfw0.m159281c(set2, "set2");
        return new mjw0(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    /* JADX INFO: renamed from: c */
    public static Set m198703c(Set set, ofw0 ofw0Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (!(sortedSet instanceof njw0)) {
                return new ojw0(sortedSet, ofw0Var);
            }
            njw0 njw0Var = (njw0) sortedSet;
            return new ojw0((SortedSet) njw0Var.f143926a, C2282x1.m13443a(njw0Var.f143927b, ofw0Var));
        }
        if (!(set instanceof njw0)) {
            set.getClass();
            return new njw0(set, ofw0Var);
        }
        njw0 njw0Var2 = (njw0) set;
        return new njw0(njw0Var2.f143926a, C2282x1.m13443a(njw0Var2.f143927b, ofw0Var));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m198704d(Set set, Object obj) {
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
    public static boolean m198705e(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof ijw0) {
            collection = ((ijw0) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m198706f(set, collection.iterator());
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
    public static boolean m198706f(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
