package org.checkerframework.checker.i18nformatter.qual;

import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import p149l.ick0;
import p149l.qhg0;

/* JADX INFO: loaded from: classes2.dex */
public enum I18nConversionCategory {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{"date", "time"}),
    NUMBER(new Class[]{Number.class}, new String[]{"number", LovePlanetStage.choice});

    public final String[] strings;
    public final Class<?>[] types;
    static I18nConversionCategory[] namedCategories = {DATE, NUMBER};

    I18nConversionCategory(Class[] clsArr, String[] strArr) {
        this.types = clsArr;
        this.strings = strArr;
    }

    private static <E> Set<E> arrayToSet(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static I18nConversionCategory intersect(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        I18nConversionCategory i18nConversionCategory3 = UNUSED;
        if (i18nConversionCategory != i18nConversionCategory3) {
            if (i18nConversionCategory2 != i18nConversionCategory3) {
                I18nConversionCategory i18nConversionCategory4 = GENERAL;
                if (i18nConversionCategory != i18nConversionCategory4) {
                    if (i18nConversionCategory2 != i18nConversionCategory4) {
                        Set setArrayToSet = arrayToSet(i18nConversionCategory.types);
                        setArrayToSet.retainAll(arrayToSet(i18nConversionCategory2.types));
                        I18nConversionCategory[] i18nConversionCategoryArr = {DATE, NUMBER};
                        for (int i = 0; i < 2; i++) {
                            I18nConversionCategory i18nConversionCategory5 = i18nConversionCategoryArr[i];
                            if (arrayToSet(i18nConversionCategory5.types).equals(setArrayToSet)) {
                                return i18nConversionCategory5;
                            }
                        }
                        ick0.m135358a();
                        return null;
                    }
                }
            }
            return i18nConversionCategory;
        }
        return i18nConversionCategory2;
    }

    public static boolean isSubsetOf(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        return intersect(i18nConversionCategory, i18nConversionCategory2) == i18nConversionCategory;
    }

    public static I18nConversionCategory stringToI18nConversionCategory(String str) {
        String lowerCase = str.toLowerCase();
        for (I18nConversionCategory i18nConversionCategory : namedCategories) {
            for (String str2 : i18nConversionCategory.strings) {
                if (str2.equals(lowerCase)) {
                    return i18nConversionCategory;
                }
            }
        }
        qhg0.m174539a("Invalid format type ", lowerCase);
        return null;
    }

    public static I18nConversionCategory union(I18nConversionCategory i18nConversionCategory, I18nConversionCategory i18nConversionCategory2) {
        I18nConversionCategory i18nConversionCategory3 = UNUSED;
        return (i18nConversionCategory == i18nConversionCategory3 || i18nConversionCategory2 == i18nConversionCategory3 || i18nConversionCategory == (i18nConversionCategory3 = GENERAL) || i18nConversionCategory2 == i18nConversionCategory3 || i18nConversionCategory == (i18nConversionCategory3 = DATE) || i18nConversionCategory2 == i18nConversionCategory3) ? i18nConversionCategory3 : NUMBER;
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
    public String toString() {
        StringBuilder sb = new StringBuilder(name());
        if (this.types == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", ")");
            for (Class<?> cls : this.types) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb.append(stringJoiner);
        }
        return sb.toString();
    }
}
