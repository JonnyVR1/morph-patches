package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import p149l.rm80;
import p149l.sf80;
import p149l.xzi;

/* JADX INFO: loaded from: classes7.dex */
public final class ImmutableClassToInstanceMap<B> extends xzi<Class<? extends B>, B> implements Map, Serializable {
    private static final ImmutableClassToInstanceMap<Object> EMPTY = new ImmutableClassToInstanceMap<>(ImmutableMap.m15715of());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableClassToInstanceMap$b */
    public static final class C2776b<B> {

        /* JADX INFO: renamed from: a */
        public final ImmutableMap.C2786b<Class<? extends B>, B> f10880a = ImmutableMap.builder();

        /* JADX INFO: renamed from: b */
        public static <B, T extends B> T m15674b(Class<T> cls, B b) {
            return (T) rm80.m179970d(cls).cast(b);
        }

        /* JADX INFO: renamed from: a */
        public ImmutableClassToInstanceMap<B> m15675a() {
            ImmutableMap<Class<? extends B>, B> immutableMapMo15660d = this.f10880a.mo15660d();
            return immutableMapMo15660d.isEmpty() ? ImmutableClassToInstanceMap.m15672of() : new ImmutableClassToInstanceMap<>(immutableMapMo15660d);
        }

        /* JADX INFO: renamed from: c */
        public <T extends B> C2776b<B> m15676c(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class key = entry.getKey();
                T value = entry.getValue();
                this.f10880a.mo15661g((Class<? extends B>) key, (B) m15674b(key, value));
            }
            return this;
        }
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    public static <B> C2776b<B> builder() {
        return new C2776b<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof ImmutableClassToInstanceMap ? (ImmutableClassToInstanceMap) map : new C2776b().m15676c(map).m15675a();
    }

    /* JADX INFO: renamed from: of */
    public static <B, T extends B> ImmutableClassToInstanceMap<B> m15673of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.m15716of(cls, t));
    }

    public <T extends B> T getInstance(Class<T> cls) {
        return this.delegate.get(sf80.m183894p(cls));
    }

    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    public Object readResolve() {
        return isEmpty() ? m15672of() : this;
    }

    @Override // p149l.xzi, p149l.a0j
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: of */
    public static <B> ImmutableClassToInstanceMap<B> m15672of() {
        return (ImmutableClassToInstanceMap<B>) EMPTY;
    }
}
