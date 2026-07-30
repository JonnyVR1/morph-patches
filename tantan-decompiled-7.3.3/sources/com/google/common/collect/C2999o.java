package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p153l.gig0;
import p153l.ju10;

/* JADX INFO: renamed from: com.google.common.collect.o */
/* JADX INFO: loaded from: classes7.dex */
public final class C2999o {

    /* JADX INFO: renamed from: com.google.common.collect.o$b */
    public static final class b<T> {

        /* JADX INFO: renamed from: a */
        public final Field f11256a;

        public b(Field field) {
            this.f11256a = field;
            field.setAccessible(true);
        }

        /* JADX INFO: renamed from: a */
        public void m16369a(T t, int i) {
            try {
                this.f11256a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                gig0.m130323a(e);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16370b(T t, Object obj) {
            try {
                this.f11256a.set(t, obj);
            } catch (IllegalAccessException e) {
                gig0.m130323a(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> b<T> m16358a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> void m16359b(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m16360c(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static <K, V> void m16360c(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> void m16361d(ju10<K, V> ju10Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m16362e(ju10Var, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static <K, V> void m16362e(ju10<K, V> ju10Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = ju10Var.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static <E> void m16363f(InterfaceC2995k<E> interfaceC2995k, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m16364g(interfaceC2995k, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static <E> void m16364g(InterfaceC2995k<E> interfaceC2995k, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2995k.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m16365h(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> void m16366i(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> void m16367j(ju10<K, V> ju10Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(ju10Var.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : ju10Var.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static <E> void m16368k(InterfaceC2995k<E> interfaceC2995k, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC2995k.entrySet().size());
        for (InterfaceC2995k.a<E> aVar : interfaceC2995k.entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}
