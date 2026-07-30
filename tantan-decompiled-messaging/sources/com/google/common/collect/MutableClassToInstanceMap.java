package com.google.common.collect;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p149l.e0j;
import p149l.rm80;
import p149l.s7j0;
import p149l.sf80;
import p149l.xzi;
import p149l.yzi;

/* JADX INFO: loaded from: classes7.dex */
public final class MutableClassToInstanceMap<B> extends xzi<Class<? extends B>, B> implements Map, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    public static final class SerializedForm<B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Map<Class<? extends B>, B> backingMap;

        public SerializedForm(Map<Class<? extends B>, B> map) {
            this.backingMap = map;
        }

        public Object readResolve() {
            return MutableClassToInstanceMap.create(this.backingMap);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MutableClassToInstanceMap$a */
    public class C2901a extends yzi<Class<? extends B>, B> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f11080a;

        public C2901a(Map.Entry entry) {
            this.f11080a = entry;
        }

        @Override // p149l.a0j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<Class<? extends B>, B> delegate() {
            return this.f11080a;
        }

        @Override // p149l.yzi, java.util.Map.Entry
        public B setValue(B b) {
            return (B) super.setValue(MutableClassToInstanceMap.cast(getKey(), b));
        }
    }

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        this.delegate = (Map) sf80.m183894p(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <B, T extends B> T cast(Class<T> cls, B b) {
        return (T) rm80.m179970d(cls).cast(b);
    }

    public static <B> Map.Entry<Class<? extends B>, B> checkedEntry(Map.Entry<Class<? extends B>, B> entry) {
        return new C2901a(entry);
    }

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    private Object writeReplace() {
        return new SerializedForm(delegate());
    }

    @Override // p149l.xzi, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new C2902b();
    }

    public <T extends B> T getInstance(Class<T> cls) {
        return (T) cast(cls, get(cls));
    }

    @Override // p149l.xzi, java.util.Map
    public B put(Class<? extends B> cls, B b) {
        return (B) super.put(cls, cast(cls, b));
    }

    @Override // p149l.xzi, java.util.Map
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cast((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends B> T putInstance(Class<T> cls, T t) {
        return (T) cast(cls, put((Class<? extends T>) cls, t));
    }

    /* JADX INFO: renamed from: com.google.common.collect.MutableClassToInstanceMap$b */
    public class C2902b extends e0j<Map.Entry<Class<? extends B>, B>> {

        /* JADX INFO: renamed from: com.google.common.collect.MutableClassToInstanceMap$b$a */
        public class a extends s7j0<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public a(C2902b c2902b, Iterator it) {
                super(it);
            }

            @Override // p149l.s7j0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> mo15897a(Map.Entry<Class<? extends B>, B> entry) {
                return MutableClassToInstanceMap.checkedEntry(entry);
            }
        }

        public C2902b() {
        }

        @Override // p149l.e0j, p149l.qzi, p149l.a0j
        public Set<Map.Entry<Class<? extends B>, B>> delegate() {
            return MutableClassToInstanceMap.this.delegate().entrySet();
        }

        @Override // p149l.qzi, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(this, delegate().iterator());
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    @Override // p149l.xzi, p149l.a0j
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    public static <B> MutableClassToInstanceMap<B> create(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }
}
