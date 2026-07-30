package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p149l.bm10;
import p149l.y9g0;

/* JADX INFO: renamed from: com.google.common.collect.o */
/* JADX INFO: loaded from: classes7.dex */
public final class C2976o {

    /* JADX INFO: renamed from: com.google.common.collect.o$b */
    public static final class b<T> {

        /* JADX INFO: renamed from: a */
        public final Field f11219a;

        public b(Field field) {
            this.f11219a = field;
            field.setAccessible(true);
        }

        /* JADX INFO: renamed from: a */
        public void m16315a(T t, int i) {
            try {
                this.f11219a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                y9g0.m213537a(e);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16316b(T t, Object obj) {
            try {
                this.f11219a.set(t, obj);
            } catch (IllegalAccessException e) {
                y9g0.m213537a(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> b<T> m16304a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> void m16305b(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m16306c(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static <K, V> void m16306c(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> void m16307d(bm10<K, V> bm10Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m16308e(bm10Var, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static <K, V> void m16308e(bm10<K, V> bm10Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = bm10Var.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static <E> void m16309f(InterfaceC2972k<E> interfaceC2972k, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m16310g(interfaceC2972k, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static <E> void m16310g(InterfaceC2972k<E> interfaceC2972k, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2972k.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m16311h(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> void m16312i(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> void m16313j(bm10<K, V> bm10Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(bm10Var.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : bm10Var.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static <E> void m16314k(InterfaceC2972k<E> interfaceC2972k, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC2972k.entrySet().size());
        for (InterfaceC2972k.a<E> aVar : interfaceC2972k.entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}
