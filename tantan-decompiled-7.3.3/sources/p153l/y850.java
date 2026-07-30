package p153l;

import com.google.common.collect.C2997m;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class y850 {
    /* JADX INFO: renamed from: a */
    public static Object m214722a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m214723b(Object... objArr) {
        m214724c(objArr, objArr.length);
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public static Object[] m214724c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m214722a(objArr[i2], i2);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: d */
    public static Object[] m214725d(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: e */
    public static <T> T[] m214726e(T[] tArr, int i) {
        return (T[]) C2997m.m16350b(tArr, i);
    }

    /* JADX INFO: renamed from: f */
    public static Object[] m214727f(Collection<?> collection) {
        return m214725d(collection, new Object[collection.size()]);
    }

    /* JADX INFO: renamed from: g */
    public static <T> T[] m214728g(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) m214726e(tArr, size);
        }
        m214725d(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public static <T> T[] m214729h(Object[] objArr, int i, int i2, T[] tArr) {
        xn80.m212116u(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) m214726e(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }
}
