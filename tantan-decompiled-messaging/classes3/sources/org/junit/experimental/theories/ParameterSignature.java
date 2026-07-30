package org.junit.experimental.theories;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ParameterSignature {
    private static final Map<Class<?>, Class<?>> CONVERTABLE_TYPES_MAP = buildConvertableTypesMap();
    private final Annotation[] annotations;
    private final Class<?> type;

    private ParameterSignature(Class<?> cls, Annotation[] annotationArr) {
        this.type = cls;
        this.annotations = annotationArr;
    }

    private static Map<Class<?>, Class<?>> buildConvertableTypesMap() {
        HashMap map = new HashMap();
        putSymmetrically(map, Boolean.TYPE, Boolean.class);
        putSymmetrically(map, Byte.TYPE, Byte.class);
        putSymmetrically(map, Short.TYPE, Short.class);
        putSymmetrically(map, Character.TYPE, Character.class);
        putSymmetrically(map, Integer.TYPE, Integer.class);
        putSymmetrically(map, Long.TYPE, Long.class);
        putSymmetrically(map, Float.TYPE, Float.class);
        putSymmetrically(map, Double.TYPE, Double.class);
        return Collections.unmodifiableMap(map);
    }

    private <T extends Annotation> T findDeepAnnotation(Annotation[] annotationArr, Class<T> cls, int i) {
        if (i == 0) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
            Annotation annotationFindDeepAnnotation = findDeepAnnotation(annotation.annotationType().getAnnotations(), cls, i - 1);
            if (annotationFindDeepAnnotation != null) {
                return cls.cast(annotationFindDeepAnnotation);
            }
        }
        return null;
    }

    private boolean isAssignableViaTypeConversion(Class<?> cls, Class<?> cls2) {
        Map<Class<?>, Class<?>> map = CONVERTABLE_TYPES_MAP;
        if (map.containsKey(cls2)) {
            return cls.isAssignableFrom(map.get(cls2));
        }
        return false;
    }

    private static <T> void putSymmetrically(Map<T, T> map, T t, T t2) {
        map.put(t, t2);
        map.put(t2, t);
    }

    private static ArrayList<ParameterSignature> signatures(Class<?>[] clsArr, Annotation[][] annotationArr) {
        ArrayList<ParameterSignature> arrayList = new ArrayList<>();
        for (int i = 0; i < clsArr.length; i++) {
            arrayList.add(new ParameterSignature(clsArr[i], annotationArr[i]));
        }
        return arrayList;
    }

    public boolean canAcceptType(Class<?> cls) {
        return this.type.isAssignableFrom(cls) || isAssignableViaTypeConversion(this.type, cls);
    }

    public boolean canAcceptValue(Object obj) {
        if (obj == null) {
            return !this.type.isPrimitive();
        }
        return canAcceptType(obj.getClass());
    }

    public boolean canPotentiallyAcceptType(Class<?> cls) {
        return cls.isAssignableFrom(this.type) || isAssignableViaTypeConversion(cls, this.type) || canAcceptType(cls);
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        for (Annotation annotation : getAnnotations()) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public List<Annotation> getAnnotations() {
        return Arrays.asList(this.annotations);
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean hasAnnotation(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public static List<ParameterSignature> signatures(Constructor<?> constructor) {
        return signatures(constructor.getParameterTypes(), constructor.getParameterAnnotations());
    }

    public static ArrayList<ParameterSignature> signatures(Method method) {
        return signatures(method.getParameterTypes(), method.getParameterAnnotations());
    }

    public <T extends Annotation> T findDeepAnnotation(Class<T> cls) {
        return (T) findDeepAnnotation(this.annotations, cls, 3);
    }
}
