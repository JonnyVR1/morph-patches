package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p153l.pr3;

/* JADX INFO: loaded from: classes7.dex */
public abstract class UnsafeAllocator {
    public static void assertInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            pr3.m173429a("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        } else if (Modifier.isAbstract(modifiers)) {
            pr3.m173429a("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public static UnsafeAllocator create() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls.getMethod("allocateInstance", Class.class);
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) throws Exception {
                            UnsafeAllocator.assertInstantiable(cls2);
                            return (T) method.invoke(obj, cls2);
                        }
                    };
                } catch (Exception unused) {
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.4
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate " + cls2);
                        }
                    };
                }
            } catch (Exception unused2) {
                final Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3
                    @Override // com.google.gson.internal.UnsafeAllocator
                    public <T> T newInstance(Class<T> cls2) throws Exception {
                        UnsafeAllocator.assertInstantiable(cls2);
                        return (T) declaredMethod.invoke(null, cls2, Object.class);
                    }
                };
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            final int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            final Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2
                @Override // com.google.gson.internal.UnsafeAllocator
                public <T> T newInstance(Class<T> cls2) throws Exception {
                    UnsafeAllocator.assertInstantiable(cls2);
                    return (T) declaredMethod3.invoke(null, cls2, Integer.valueOf(iIntValue));
                }
            };
        }
    }

    public abstract <T> T newInstance(Class<T> cls) throws Exception;
}
