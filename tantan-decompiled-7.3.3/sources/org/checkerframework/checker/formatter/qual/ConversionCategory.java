package org.checkerframework.checker.formatter.qual;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import org.checkerframework.dataflow.qual.Pure;
import p153l.olk0;
import p153l.tr3;

/* JADX INFO: loaded from: classes2.dex */
public enum ConversionCategory {
    GENERAL("bBhHsS", null),
    CHAR("cC", Character.class, Byte.class, Short.class, Integer.class),
    INT("doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", Long.class, Calendar.class, Date.class),
    CHAR_AND_INT(null, Byte.class, Short.class, Integer.class),
    INT_AND_TIME(null, Long.class),
    NULL(null, new Class[0]),
    UNUSED(null, null);

    public final String chars;
    public final Class<?>[] types;

    ConversionCategory(String str, Class... clsArr) {
        this.chars = str;
        if (clsArr == null) {
            this.types = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(cls);
            Class<? extends Object> clsUnwrapPrimitive = unwrapPrimitive(cls);
            if (clsUnwrapPrimitive != null) {
                arrayList.add(clsUnwrapPrimitive);
            }
        }
        this.types = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    private static <E> Set<E> arrayToSet(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static ConversionCategory fromConversionChar(char c) {
        ConversionCategory[] conversionCategoryArr = {GENERAL, CHAR, INT, FLOAT, TIME};
        for (int i = 0; i < 5; i++) {
            ConversionCategory conversionCategory = conversionCategoryArr[i];
            if (conversionCategory.chars.contains(String.valueOf(c))) {
                return conversionCategory;
            }
        }
        tr3.m192404a("Bad conversion character ", c);
        return null;
    }

    public static ConversionCategory intersect(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        ConversionCategory conversionCategory3 = UNUSED;
        if (conversionCategory != conversionCategory3) {
            if (conversionCategory2 != conversionCategory3) {
                ConversionCategory conversionCategory4 = GENERAL;
                if (conversionCategory != conversionCategory4) {
                    if (conversionCategory2 != conversionCategory4) {
                        Set setArrayToSet = arrayToSet(conversionCategory.types);
                        setArrayToSet.retainAll(arrayToSet(conversionCategory2.types));
                        ConversionCategory[] conversionCategoryArr = {CHAR, INT, FLOAT, TIME, CHAR_AND_INT, INT_AND_TIME, NULL};
                        for (int i = 0; i < 7; i++) {
                            ConversionCategory conversionCategory5 = conversionCategoryArr[i];
                            if (arrayToSet(conversionCategory5.types).equals(setArrayToSet)) {
                                return conversionCategory5;
                            }
                        }
                        olk0.m168132a();
                        return null;
                    }
                }
            }
            return conversionCategory;
        }
        return conversionCategory2;
    }

    public static boolean isSubsetOf(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        return intersect(conversionCategory, conversionCategory2) == conversionCategory;
    }

    public static ConversionCategory union(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        ConversionCategory conversionCategory3;
        ConversionCategory conversionCategory4 = UNUSED;
        if (conversionCategory == conversionCategory4 || conversionCategory2 == conversionCategory4 || conversionCategory == (conversionCategory4 = GENERAL) || conversionCategory2 == conversionCategory4) {
            return conversionCategory4;
        }
        ConversionCategory conversionCategory5 = CHAR_AND_INT;
        if ((conversionCategory == conversionCategory5 && conversionCategory2 == INT_AND_TIME) || (conversionCategory == (conversionCategory3 = INT_AND_TIME) && conversionCategory2 == conversionCategory5)) {
            return INT;
        }
        Set setArrayToSet = arrayToSet(conversionCategory.types);
        setArrayToSet.addAll(arrayToSet(conversionCategory2.types));
        ConversionCategory[] conversionCategoryArr = {NULL, conversionCategory5, conversionCategory3, CHAR, INT, FLOAT, TIME};
        for (int i = 0; i < 7; i++) {
            ConversionCategory conversionCategory6 = conversionCategoryArr[i];
            if (arrayToSet(conversionCategory6.types).equals(setArrayToSet)) {
                return conversionCategory6;
            }
        }
        return GENERAL;
    }

    private static Class<? extends Object> unwrapPrimitive(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return null;
    }

    public boolean isAssignableFrom(Class<?> cls) {
        Class<?>[] clsArr = this.types;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    @Pure
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class<?>[] clsArr = this.types;
        if (clsArr == null || clsArr.length == 0) {
            return sb.toString();
        }
        StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", ")");
        for (Class<?> cls : this.types) {
            stringJoiner.add(cls.getSimpleName());
        }
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(stringJoiner);
        return sb.toString();
    }
}
