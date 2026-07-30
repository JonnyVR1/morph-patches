package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import p153l.b7h0;
import p153l.se5;
import p153l.xn80;
import p153l.zor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MultimapBuilder<K0, V0> {

    public static final class ArrayListSupplier<V> implements b7h0<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i) {
            this.expectedValuesPerKey = se5.m185516b(i, "expectedValuesPerKey");
        }

        @Override // p153l.b7h0
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    public static final class EnumSetSupplier<V extends Enum<V>> implements b7h0<Set<V>>, Serializable {
        private final Class<V> clazz;

        public EnumSetSupplier(Class<V> cls) {
            this.clazz = (Class) xn80.m212111p(cls);
        }

        @Override // p153l.b7h0
        public Set<V> get() {
            return EnumSet.noneOf(this.clazz);
        }
    }

    public static final class HashSetSupplier<V> implements b7h0<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public HashSetSupplier(int i) {
            this.expectedValuesPerKey = se5.m185516b(i, "expectedValuesPerKey");
        }

        @Override // p153l.b7h0
        public Set<V> get() {
            return C2997m.m16352d(this.expectedValuesPerKey);
        }
    }

    public static final class LinkedHashSetSupplier<V> implements b7h0<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public LinkedHashSetSupplier(int i) {
            this.expectedValuesPerKey = se5.m185516b(i, "expectedValuesPerKey");
        }

        @Override // p153l.b7h0
        public Set<V> get() {
            return C2997m.m16354f(this.expectedValuesPerKey);
        }
    }

    public enum LinkedListSupplier implements b7h0<List<?>> {
        INSTANCE;

        public static <V> b7h0<List<V>> instance() {
            return INSTANCE;
        }

        @Override // p153l.b7h0
        public List<?> get() {
            return new LinkedList();
        }
    }

    public static final class TreeSetSupplier<V> implements b7h0<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        public TreeSetSupplier(Comparator<? super V> comparator) {
            this.comparator = (Comparator) xn80.m212111p(comparator);
        }

        @Override // p153l.b7h0
        public SortedSet<V> get() {
            return new TreeSet(this.comparator);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$a */
    public class C2910a extends AbstractC2913d<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f11098a;

        public C2910a(int i) {
            this.f11098a = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.AbstractC2913d
        /* JADX INFO: renamed from: c */
        public <K, V> Map<K, Collection<V>> mo16126c() {
            return C2997m.m16351c(this.f11098a);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$b */
    public class C2911b extends AbstractC2913d<K0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator f11099a;

        public C2911b(Comparator comparator) {
            this.f11099a = comparator;
        }

        @Override // com.google.common.collect.MultimapBuilder.AbstractC2913d
        /* JADX INFO: renamed from: c */
        public <K extends K0, V> Map<K, Collection<V>> mo16126c() {
            return new TreeMap(this.f11099a);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$c */
    public static abstract class AbstractC2912c<K0, V0> extends MultimapBuilder<K0, V0> {
        public AbstractC2912c() {
            super(null);
        }

        /* JADX INFO: renamed from: e */
        public abstract <K extends K0, V extends V0> zor<K, V> mo16127e();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$d */
    public static abstract class AbstractC2913d<K0> {

        /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$d$a */
        public class a extends AbstractC2912c<K0, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f11100a;

            public a(int i) {
                this.f11100a = i;
            }

            @Override // com.google.common.collect.MultimapBuilder.AbstractC2912c
            /* JADX INFO: renamed from: e */
            public <K extends K0, V> zor<K, V> mo16127e() {
                return Multimaps.m16133d(AbstractC2913d.this.mo16126c(), new ArrayListSupplier(this.f11100a));
            }
        }

        /* JADX INFO: renamed from: a */
        public AbstractC2912c<K0, Object> m16128a() {
            return m16129b(2);
        }

        /* JADX INFO: renamed from: b */
        public AbstractC2912c<K0, Object> m16129b(int i) {
            se5.m185516b(i, "expectedValuesPerKey");
            return new a(i);
        }

        /* JADX INFO: renamed from: c */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo16126c();
    }

    public /* synthetic */ MultimapBuilder(C2910a c2910a) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2913d<Object> m16122a() {
        return m16123b(8);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2913d<Object> m16123b(int i) {
        se5.m185516b(i, "expectedKeys");
        return new C2910a(i);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2913d<Comparable> m16124c() {
        return m16125d(Ordering.natural());
    }

    /* JADX INFO: renamed from: d */
    public static <K0> AbstractC2913d<K0> m16125d(Comparator<K0> comparator) {
        xn80.m212111p(comparator);
        return new C2911b(comparator);
    }

    public MultimapBuilder() {
    }
}
