package com.google.common.collect;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p153l.s2j;
import p153l.t2j;
import p153l.vu80;
import p153l.wgj0;
import p153l.xn80;
import p153l.z2j;

/* JADX INFO: loaded from: classes7.dex */
public final class MutableClassToInstanceMap<B> extends s2j<Class<? extends B>, B> implements Map, Serializable {
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
    public class C2924a extends t2j<Class<? extends B>, B> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f11117a;

        public C2924a(Map.Entry entry) {
            this.f11117a = entry;
        }

        @Override // p153l.v2j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<Class<? extends B>, B> delegate() {
            return this.f11117a;
        }

        @Override // p153l.t2j, java.util.Map.Entry
        public B setValue(B b) {
            return (B) super.setValue(MutableClassToInstanceMap.cast(getKey(), b));
        }
    }

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        this.delegate = (Map) xn80.m212111p(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <B, T extends B> T cast(Class<T> cls, B b) {
        return (T) vu80.m202780d(cls).cast(b);
    }

    public static <B> Map.Entry<Class<? extends B>, B> checkedEntry(Map.Entry<Class<? extends B>, B> entry) {
        return new C2924a(entry);
    }

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    private Object writeReplace() {
        return new SerializedForm(delegate());
    }

    @Override // p153l.s2j, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new C2925b();
    }

    public <T extends B> T getInstance(Class<T> cls) {
        return (T) cast(cls, get(cls));
    }

    @Override // p153l.s2j, java.util.Map
    public B put(Class<? extends B> cls, B b) {
        return (B) super.put(cls, cast(cls, b));
    }

    @Override // p153l.s2j, java.util.Map
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
    public class C2925b extends z2j<Map.Entry<Class<? extends B>, B>> {

        /* JADX INFO: renamed from: com.google.common.collect.MutableClassToInstanceMap$b$a */
        public class a extends wgj0<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public a(C2925b c2925b, Iterator it) {
                super(it);
            }

            @Override // p153l.wgj0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> mo15951a(Map.Entry<Class<? extends B>, B> entry) {
                return MutableClassToInstanceMap.checkedEntry(entry);
            }
        }

        public C2925b() {
        }

        @Override // p153l.z2j, p153l.l2j, p153l.v2j
        public Set<Map.Entry<Class<? extends B>, B>> delegate() {
            return MutableClassToInstanceMap.this.delegate().entrySet();
        }

        @Override // p153l.l2j, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(this, delegate().iterator());
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    @Override // p153l.s2j, p153l.v2j
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    public static <B> MutableClassToInstanceMap<B> create(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }
}
