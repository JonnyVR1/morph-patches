package p153l;

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
public class x7s extends jyb {
    /* JADX INFO: renamed from: q0 */
    public static <T> List<T> m209644q0(Collection<? extends T> collection) {
        return jyb.m147479J(collection) ? new ArrayList() : new ArrayList(collection);
    }

    /* JADX INFO: renamed from: r0 */
    public static <T> boolean m209645r0(@NonNull List<T> list, @NonNull List<T> list2) {
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
    public static <T> void m209646s0(@Nullable List<? extends T> list, Collection<Integer> collection, y20<T> y20Var) {
        m209647t0(list, collection, y20Var, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public static <T> void m209647t0(@Nullable List<? extends T> list, Collection<Integer> collection, y20<T> y20Var, boolean z) {
        List listM209644q0 = m209644q0(list);
        Set treeSet = z ? new TreeSet(collection) : new HashSet(collection);
        if (jyb.m147479J(listM209644q0) || jyb.m147479J(treeSet)) {
            return;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue >= 0 && iIntValue < listM209644q0.size()) {
                y20Var.call(listM209644q0.get(iIntValue));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public static <T, C extends Comparable<C>> List<T> m209648u0(Collection<T> collection, qcj<T, C> qcjVar) {
        if (jyb.m147479J(collection)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection);
        ArrayList arrayList2 = new ArrayList();
        Comparable comparable = null;
        for (Object obj : arrayList) {
            Comparable comparable2 = (Comparable) qcjVar.call(obj);
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
    public static <T> void m209649v0(List<? extends T> list, Comparator<T> comparator) {
        if (list.size() <= 1) {
            return;
        }
        list.sort(comparator);
    }
}
