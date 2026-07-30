package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import p153l.s2j;
import p153l.vu80;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class ImmutableClassToInstanceMap<B> extends s2j<Class<? extends B>, B> implements Map, Serializable {
    private static final ImmutableClassToInstanceMap<Object> EMPTY = new ImmutableClassToInstanceMap<>(ImmutableMap.m15769of());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableClassToInstanceMap$b */
    public static final class C2799b<B> {

        /* JADX INFO: renamed from: a */
        public final ImmutableMap.C2809b<Class<? extends B>, B> f10917a = ImmutableMap.builder();

        /* JADX INFO: renamed from: b */
        public static <B, T extends B> T m15728b(Class<T> cls, B b) {
            return (T) vu80.m202780d(cls).cast(b);
        }

        /* JADX INFO: renamed from: a */
        public ImmutableClassToInstanceMap<B> m15729a() {
            ImmutableMap<Class<? extends B>, B> immutableMapMo15714d = this.f10917a.mo15714d();
            return immutableMapMo15714d.isEmpty() ? ImmutableClassToInstanceMap.m15726of() : new ImmutableClassToInstanceMap<>(immutableMapMo15714d);
        }

        /* JADX INFO: renamed from: c */
        public <T extends B> C2799b<B> m15730c(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class key = entry.getKey();
                T value = entry.getValue();
                this.f10917a.mo15715g((Class<? extends B>) key, (B) m15728b(key, value));
            }
            return this;
        }
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    public static <B> C2799b<B> builder() {
        return new C2799b<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof ImmutableClassToInstanceMap ? (ImmutableClassToInstanceMap) map : new C2799b().m15730c(map).m15729a();
    }

    /* JADX INFO: renamed from: of */
    public static <B, T extends B> ImmutableClassToInstanceMap<B> m15727of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.m15770of(cls, t));
    }

    public <T extends B> T getInstance(Class<T> cls) {
        return this.delegate.get(xn80.m212111p(cls));
    }

    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    public Object readResolve() {
        return isEmpty() ? m15726of() : this;
    }

    @Override // p153l.s2j, p153l.v2j
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: of */
    public static <B> ImmutableClassToInstanceMap<B> m15726of() {
        return (ImmutableClassToInstanceMap<B>) EMPTY;
    }
}
