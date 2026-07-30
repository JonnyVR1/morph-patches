package org.eclipse.jetty.util;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l.zkl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LazyList implements Cloneable, Serializable {
    private static final String[] __EMTPY_STRING_ARRAY = new String[0];

    private LazyList() {
    }

    public static Object add(Object obj, int i, Object obj2) {
        if (obj == null) {
            if (i <= 0 && !(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(i, obj2);
            return arrayList;
        }
        if (obj instanceof List) {
            ((List) obj).add(i, obj2);
            return obj;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(obj);
        arrayList2.add(i, obj2);
        return arrayList2;
    }

    public static Object addArray(Object obj, Object[] objArr) {
        for (int i = 0; objArr != null && i < objArr.length; i++) {
            obj = add(obj, objArr[i]);
        }
        return obj;
    }

    public static Object addCollection(Object obj, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            obj = add(obj, it.next());
        }
        return obj;
    }

    public static <T> T[] addToArray(T[] tArr, T t, Class<?> cls) {
        if (tArr != null) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), Array.getLength(tArr) + 1));
            System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
            tArr2[tArr.length] = t;
            return tArr2;
        }
        if (cls == null && t != null) {
            cls = t.getClass();
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls, 1));
        tArr3[0] = t;
        return tArr3;
    }

    public static <E> List<E> array2List(E[] eArr) {
        return (eArr == null || eArr.length == 0) ? new ArrayList() : new ArrayList(Arrays.asList(eArr));
    }

    public static Object clone(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof List ? new ArrayList((List) obj) : obj;
    }

    public static boolean contains(Object obj, Object obj2) {
        if (obj == null) {
            return false;
        }
        return obj instanceof List ? ((List) obj).contains(obj2) : obj.equals(obj2);
    }

    public static Object ensureSize(Object obj, int i) {
        if (obj == null) {
            return new ArrayList(i);
        }
        if (!(obj instanceof ArrayList)) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.add(obj);
            return arrayList;
        }
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.size() > i) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(i);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> E get(Object obj, int i) {
        if (obj == 0) {
            zkl.a();
            return null;
        }
        if (obj instanceof List) {
            return (E) ((List) obj).get(i);
        }
        if (i == 0) {
            return obj;
        }
        zkl.a();
        return null;
    }

    public static <E> List<E> getList(Object obj, boolean z) {
        if (obj != null) {
            return obj instanceof List ? (List) obj : Collections.singletonList(obj);
        }
        if (z) {
            return null;
        }
        return Collections.EMPTY_LIST;
    }

    public static <E> Iterator<E> iterator(Object obj) {
        if (obj == null) {
            return Collections.EMPTY_LIST.iterator();
        }
        return obj instanceof List ? ((List) obj).iterator() : getList(obj).iterator();
    }

    public static <E> ListIterator<E> listIterator(Object obj) {
        if (obj == null) {
            return Collections.EMPTY_LIST.listIterator();
        }
        return obj instanceof List ? ((List) obj).listIterator() : getList(obj).listIterator();
    }

    public static Object remove(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            list.remove(obj2);
            if (list.size() == 0) {
                return null;
            }
        } else if (obj.equals(obj2)) {
            return null;
        }
        return obj;
    }

    public static <T> T[] removeFromArray(T[] tArr, Object obj) {
        if (obj != null && tArr != null) {
            int length = tArr.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                if (obj.equals(tArr[i])) {
                    T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), Array.getLength(tArr) - 1));
                    if (i > 0) {
                        System.arraycopy(tArr, 0, tArr2, 0, i);
                    }
                    if (length < tArr.length) {
                        System.arraycopy(tArr, length, tArr2, i, tArr.length - length);
                    }
                    return tArr2;
                }
                length = i;
            }
        }
        return tArr;
    }

    public static int size(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return 1;
    }

    public static Object toArray(Object obj, Class<?> cls) {
        if (obj == null) {
            return Array.newInstance(cls, 0);
        }
        if (!(obj instanceof List)) {
            Object objNewInstance = Array.newInstance(cls, 1);
            Array.set(objNewInstance, 0, obj);
            return objNewInstance;
        }
        List list = (List) obj;
        if (!cls.isPrimitive()) {
            return list.toArray((Object[]) Array.newInstance(cls, list.size()));
        }
        Object objNewInstance2 = Array.newInstance(cls, list.size());
        for (int i = 0; i < list.size(); i++) {
            Array.set(objNewInstance2, i, list.get(i));
        }
        return objNewInstance2;
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return "[]";
        }
        if (obj instanceof List) {
            return obj.toString();
        }
        return "[" + obj + "]";
    }

    public static String[] toStringArray(Object obj) {
        if (obj == null) {
            return __EMTPY_STRING_ARRAY;
        }
        if (!(obj instanceof List)) {
            return new String[]{obj.toString()};
        }
        List list = (List) obj;
        String[] strArr = new String[list.size()];
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return strArr;
            }
            Object obj2 = list.get(i);
            if (obj2 != null) {
                strArr[i] = obj2.toString();
            }
            size = i;
        }
    }

    public static <E> List<E> getList(Object obj) {
        return getList(obj, false);
    }

    public static Object remove(Object obj, int i) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            list.remove(i);
            if (list.size() == 0) {
                return null;
            }
        } else if (i == 0) {
            return null;
        }
        return obj;
    }

    public static Object add(Object obj, Object obj2) {
        if (obj == null) {
            if (!(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj2);
            return arrayList;
        }
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(obj);
        arrayList2.add(obj2);
        return arrayList2;
    }
}
