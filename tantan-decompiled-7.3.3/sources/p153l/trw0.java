package p153l;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class trw0 {
    /* JADX INFO: renamed from: a */
    public static Object m192527a(Iterable iterable, Object obj) {
        rsw0 rsw0Var = new rsw0((ssw0) iterable);
        return rsw0Var.hasNext() ? rsw0Var.next() : obj;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m192528b(Iterable iterable, uow0 uow0Var) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            uow0Var.getClass();
            return m192530d((List) iterable, uow0Var);
        }
        Iterator it = iterable.iterator();
        uow0Var.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (uow0Var.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public static void m192529c(List list, uow0 uow0Var, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (uow0Var.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m192530d(List list, uow0 uow0Var) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!uow0Var.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        m192529c(list, uow0Var, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m192529c(list, uow0Var, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
