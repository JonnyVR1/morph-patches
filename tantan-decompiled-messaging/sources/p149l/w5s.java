package p149l;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes13.dex */
public class w5s extends vwb {
    /* JADX INFO: renamed from: q0 */
    public static <T> List<T> m201680q0(Collection<? extends T> collection) {
        return vwb.m200296J(collection) ? new ArrayList() : new ArrayList(collection);
    }

    /* JADX INFO: renamed from: r0 */
    public static <T> boolean m201681r0(@NonNull List<T> list, @NonNull List<T> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public static <T> void m201682s0(@Nullable List<? extends T> list, Collection<Integer> collection, e30<T> e30Var) {
        m201683t0(list, collection, e30Var, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public static <T> void m201683t0(@Nullable List<? extends T> list, Collection<Integer> collection, e30<T> e30Var, boolean z) {
        List listM201680q0 = m201680q0(list);
        Set treeSet = z ? new TreeSet(collection) : new HashSet(collection);
        if (vwb.m200296J(listM201680q0) || vwb.m200296J(treeSet)) {
            return;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue >= 0 && iIntValue < listM201680q0.size()) {
                e30Var.call(listM201680q0.get(iIntValue));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public static <T, C extends Comparable<C>> List<T> m201684u0(Collection<T> collection, w9j<T, C> w9jVar) {
        if (vwb.m200296J(collection)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection);
        ArrayList arrayList2 = new ArrayList();
        Comparable comparable = null;
        for (Object obj : arrayList) {
            Comparable comparable2 = (Comparable) w9jVar.call(obj);
            if (comparable == null || comparable2.compareTo(comparable) > 0) {
                arrayList2.clear();
                arrayList2.add(obj);
                comparable = comparable2;
            } else if (comparable2.compareTo(comparable) == 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: v0 */
    public static <T> void m201685v0(List<? extends T> list, Comparator<T> comparator) {
        if (list.size() <= 1) {
            return;
        }
        list.sort(comparator);
    }
}
