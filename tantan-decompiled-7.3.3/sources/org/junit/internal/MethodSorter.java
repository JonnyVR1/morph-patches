package org.junit.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.FixMethodOrder;

/* JADX INFO: loaded from: classes3.dex */
public class MethodSorter {
    public static final Comparator<Method> DEFAULT = new Comparator<Method>() { // from class: org.junit.internal.MethodSorter.1
        @Override // java.util.Comparator
        public int compare(Method method, Method method2) {
            int iHashCode = method.getName().hashCode();
            int iHashCode2 = method2.getName().hashCode();
            if (iHashCode != iHashCode2) {
                return iHashCode < iHashCode2 ? -1 : 1;
            }
            return MethodSorter.NAME_ASCENDING.compare(method, method2);
        }
    };
    public static final Comparator<Method> NAME_ASCENDING = new Comparator<Method>() { // from class: org.junit.internal.MethodSorter.2
        @Override // java.util.Comparator
        public int compare(Method method, Method method2) {
            int iCompareTo = method.getName().compareTo(method2.getName());
            return iCompareTo != 0 ? iCompareTo : method.toString().compareTo(method2.toString());
        }
    };

    private MethodSorter() {
    }

    public static Method[] getDeclaredMethods(Class<?> cls) {
        Comparator<Method> sorter = getSorter((FixMethodOrder) cls.getAnnotation(FixMethodOrder.class));
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (sorter != null) {
            Arrays.sort(declaredMethods, sorter);
        }
        return declaredMethods;
    }

    private static Comparator<Method> getSorter(FixMethodOrder fixMethodOrder) {
        return fixMethodOrder == null ? DEFAULT : fixMethodOrder.value().getComparator();
    }
}
