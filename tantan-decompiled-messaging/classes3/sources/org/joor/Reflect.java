package org.joor;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.joor.Reflect;
import p003l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Reflect {
    private final boolean isClass = true;
    private final Object object;

    public static class NULL {
        private NULL() {
        }
    }

    private Reflect(Class<?> cls) {
        this.object = cls;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    public static <T extends AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (!Modifier.isPublic(member.getModifiers()) || !Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                if (!t.isAccessible()) {
                    t.setAccessible(true);
                }
            }
        } else if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static x9j<Object, Object[], Reflect> callRepeatably(String str, String str2, Object... objArr) throws ReflectException {
        Class<?>[] clsArrTypes = types(objArr);
        Reflect reflectM9594on = m9594on(str);
        try {
            try {
                final Method methodExactMethod = reflectM9594on.exactMethod(str2, clsArrTypes);
                accessible(methodExactMethod);
                return new x9j() { // from class: l.gmc0
                    @Override // p003l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return Reflect.m9597on(false, methodExactMethod, obj, (Object[]) obj2);
                    }
                };
            } catch (NoSuchMethodException e) {
                throw new ReflectException(e);
            }
        } catch (NoSuchMethodException unused) {
            final Method methodSimilarMethod = reflectM9594on.similarMethod(str2, clsArrTypes);
            accessible(methodSimilarMethod);
            return new x9j() { // from class: l.hmc0
                @Override // p003l.x9j
                public final Object call(Object obj, Object obj2) {
                    return Reflect.m9597on(false, methodSimilarMethod, obj, (Object[]) obj2);
                }
            };
        }
    }

    private Method exactMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsType = type();
        try {
            return clsType.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsType.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsType = clsType.getSuperclass();
                }
            } while (clsType != null);
            throw new NoSuchMethodException();
        }
    }

    private static Class<?> forName(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && match(method.getParameterTypes(), clsArr);
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != NULL.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: on */
    public static Reflect m9597on(boolean z, Method method, Object obj, Object... objArr) throws ReflectException {
        if (z) {
            try {
                accessible(method);
            } catch (Exception e) {
                throw new ReflectException(e);
            }
        }
        if (method.getReturnType() != Void.TYPE) {
            return m9593on(method.invoke(obj, objArr));
        }
        method.invoke(obj, objArr);
        return m9593on(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    private Method similarMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsType = type();
        for (Method method : clsType.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : clsType.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            clsType = clsType.getSuperclass();
        } while (clsType != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + type() + ".");
    }

    private static Class<?>[] types(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? NULL.class : obj.getClass();
        }
        return clsArr;
    }

    private static Object unwrap(Object obj) {
        return obj instanceof Reflect ? ((Reflect) obj).get() : obj;
    }

    public static Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isPrimitive()) {
            return cls;
        }
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        return Void.TYPE == cls ? Void.class : cls;
    }

    /* JADX INFO: renamed from: as */
    public <P> P m9598as(Class<P> cls) {
        final boolean z = this.object instanceof Map;
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: org.joor.Reflect.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                String name = method.getName();
                try {
                    return Reflect.m9593on(Reflect.this.object).call(name, objArr).get();
                } catch (ReflectException e) {
                    if (z) {
                        Map map = (Map) Reflect.this.object;
                        int length = objArr == null ? 0 : objArr.length;
                        if (length == 0 && name.startsWith("get")) {
                            return map.get(Reflect.property(name.substring(3)));
                        }
                        if (length == 0 && name.startsWith("is")) {
                            return map.get(Reflect.property(name.substring(2)));
                        }
                        if (length == 1 && name.startsWith("set")) {
                            map.put(Reflect.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e;
                }
            }
        });
    }

    public Reflect call(String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrTypes = types(objArr);
        try {
            try {
                return m9596on(exactMethod(str, clsArrTypes), this.object, objArr);
            } catch (NoSuchMethodException e) {
                throw new ReflectException(e);
            }
        } catch (NoSuchMethodException unused) {
            return m9596on(similarMethod(str, clsArrTypes), this.object, objArr);
        }
    }

    public Reflect create(Object... objArr) throws ReflectException {
        Class<?>[] clsArrTypes = types(objArr);
        try {
            return m9595on(type().getDeclaredConstructor(clsArrTypes), objArr);
        } catch (NoSuchMethodException e) {
            for (Constructor<?> constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), clsArrTypes)) {
                    return m9595on(constructor, objArr);
                }
            }
            throw new ReflectException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.object.equals(((Reflect) obj).get());
        }
        return false;
    }

    public Reflect field(String str) throws ReflectException {
        try {
            return m9593on(field0(str).get(this.object));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public Field field0(String str) throws ReflectException {
        Class<?> clsType = type();
        try {
            return clsType.getField(str);
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) accessible(clsType.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsType = clsType.getSuperclass();
                }
            } while (clsType != null);
            throw new ReflectException(e);
        }
    }

    public Map<String, Reflect> fields() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> clsType = type();
        do {
            for (Field field : clsType.getDeclaredFields()) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name));
                    }
                }
            }
            clsType = clsType.getSuperclass();
        } while (clsType != null);
        return linkedHashMap;
    }

    public <T> T get(String str) throws ReflectException {
        return (T) field(str).get();
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public Reflect set(String str, Object obj) throws ReflectException {
        try {
            field0(str).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public String toString() {
        return this.object.toString();
    }

    public Class<?> type() {
        boolean z = this.isClass;
        Object obj = this.object;
        return z ? (Class) obj : obj.getClass();
    }

    private Reflect(Object obj) {
        this.object = obj;
    }

    public <T> T get() {
        return (T) this.object;
    }

    public Reflect call(String str) throws ReflectException {
        return call(str, new Object[0]);
    }

    /* JADX INFO: renamed from: on */
    public static Reflect m9592on(Class<?> cls) {
        return new Reflect(cls);
    }

    /* JADX INFO: renamed from: on */
    public static Reflect m9593on(Object obj) {
        return new Reflect(obj);
    }

    /* JADX INFO: renamed from: on */
    private static Reflect m9595on(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return m9593on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public static x9j<Object, Object[], Reflect> callRepeatably(Class cls, String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrTypes = types(objArr);
        Reflect reflectM9592on = m9592on((Class<?>) cls);
        try {
            try {
                final Method methodExactMethod = reflectM9592on.exactMethod(str, clsArrTypes);
                accessible(methodExactMethod);
                return new x9j() { // from class: l.imc0
                    @Override // p003l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return Reflect.m9597on(false, methodExactMethod, obj, (Object[]) obj2);
                    }
                };
            } catch (NoSuchMethodException e) {
                throw new ReflectException(e);
            }
        } catch (NoSuchMethodException unused) {
            final Method methodSimilarMethod = reflectM9592on.similarMethod(str, clsArrTypes);
            accessible(methodSimilarMethod);
            return new x9j() { // from class: l.jmc0
                @Override // p003l.x9j
                public final Object call(Object obj, Object obj2) {
                    return Reflect.m9597on(false, methodSimilarMethod, obj, (Object[]) obj2);
                }
            };
        }
    }

    /* JADX INFO: renamed from: on */
    private static Reflect m9596on(Method method, Object obj, Object... objArr) throws ReflectException {
        return m9597on(true, method, obj, objArr);
    }

    /* JADX INFO: renamed from: on */
    public static Reflect m9594on(String str) throws ReflectException {
        return m9592on(forName(str));
    }

    public static x9j<Object, Object[], Reflect> callRepeatably(Object obj, String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrTypes = types(objArr);
        Reflect reflectM9593on = m9593on(obj);
        try {
            try {
                final Method methodExactMethod = reflectM9593on.exactMethod(str, clsArrTypes);
                accessible(methodExactMethod);
                return new x9j() { // from class: l.emc0
                    @Override // p003l.x9j
                    public final Object call(Object obj2, Object obj3) {
                        return Reflect.m9597on(false, methodExactMethod, obj2, (Object[]) obj3);
                    }
                };
            } catch (NoSuchMethodException e) {
                throw new ReflectException(e);
            }
        } catch (NoSuchMethodException unused) {
            final Method methodSimilarMethod = reflectM9593on.similarMethod(str, clsArrTypes);
            accessible(methodSimilarMethod);
            return new x9j() { // from class: l.fmc0
                @Override // p003l.x9j
                public final Object call(Object obj2, Object obj3) {
                    return Reflect.m9597on(false, methodSimilarMethod, obj2, (Object[]) obj3);
                }
            };
        }
    }

    public Reflect create() throws ReflectException {
        return create(new Object[0]);
    }
}
