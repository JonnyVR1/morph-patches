package p149l;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class niw0 {
    /* JADX INFO: renamed from: a */
    public static Object m159575a(Iterable iterable, Object obj) {
        ljw0 ljw0Var = new ljw0((mjw0) iterable);
        return ljw0Var.hasNext() ? ljw0Var.next() : obj;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m159576b(Iterable iterable, ofw0 ofw0Var) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            ofw0Var.getClass();
            return m159578d((List) iterable, ofw0Var);
        }
        Iterator it = iterable.iterator();
        ofw0Var.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (ofw0Var.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public static void m159577c(List list, ofw0 ofw0Var, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (ofw0Var.zza(list.get(size))) {
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
    public static boolean m159578d(List list, ofw0 ofw0Var) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!ofw0Var.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        m159577c(list, ofw0Var, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m159577c(list, ofw0Var, i2, i);
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
