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
import p149l.sd5;
import p149l.sf80;
import p149l.tyg0;
import p149l.ymr;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MultimapBuilder<K0, V0> {

    public static final class ArrayListSupplier<V> implements tyg0<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i) {
            this.expectedValuesPerKey = sd5.m183444b(i, "expectedValuesPerKey");
        }

        @Override // p149l.tyg0
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    public static final class EnumSetSupplier<V extends Enum<V>> implements tyg0<Set<V>>, Serializable {
        private final Class<V> clazz;

        public EnumSetSupplier(Class<V> cls) {
            this.clazz = (Class) sf80.m183894p(cls);
        }

        @Override // p149l.tyg0
        public Set<V> get() {
            return EnumSet.noneOf(this.clazz);
        }
    }

    public static final class HashSetSupplier<V> implements tyg0<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public HashSetSupplier(int i) {
            this.expectedValuesPerKey = sd5.m183444b(i, "expectedValuesPerKey");
        }

        @Override // p149l.tyg0
        public Set<V> get() {
            return C2974m.m16298d(this.expectedValuesPerKey);
        }
    }

    public static final class LinkedHashSetSupplier<V> implements tyg0<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public LinkedHashSetSupplier(int i) {
            this.expectedValuesPerKey = sd5.m183444b(i, "expectedValuesPerKey");
        }

        @Override // p149l.tyg0
        public Set<V> get() {
            return C2974m.m16300f(this.expectedValuesPerKey);
        }
    }

    public enum LinkedListSupplier implements tyg0<List<?>> {
        INSTANCE;

        public static <V> tyg0<List<V>> instance() {
            return INSTANCE;
        }

        @Override // p149l.tyg0
        public List<?> get() {
            return new LinkedList();
        }
    }

    public static final class TreeSetSupplier<V> implements tyg0<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        public TreeSetSupplier(Comparator<? super V> comparator) {
            this.comparator = (Comparator) sf80.m183894p(comparator);
        }

        @Override // p149l.tyg0
        public SortedSet<V> get() {
            return new TreeSet(this.comparator);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$a */
    public class C2887a extends AbstractC2890d<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f11061a;

        public C2887a(int i) {
            this.f11061a = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.AbstractC2890d
        /* JADX INFO: renamed from: c */
        public <K, V> Map<K, Collection<V>> mo16072c() {
            return C2974m.m16297c(this.f11061a);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$b */
    public class C2888b extends AbstractC2890d<K0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator f11062a;

        public C2888b(Comparator comparator) {
            this.f11062a = comparator;
        }

        @Override // com.google.common.collect.MultimapBuilder.AbstractC2890d
        /* JADX INFO: renamed from: c */
        public <K extends K0, V> Map<K, Collection<V>> mo16072c() {
            return new TreeMap(this.f11062a);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$c */
    public static abstract class AbstractC2889c<K0, V0> extends MultimapBuilder<K0, V0> {
        public AbstractC2889c() {
            super(null);
        }

        /* JADX INFO: renamed from: e */
        public abstract <K extends K0, V extends V0> ymr<K, V> mo16073e();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$d */
    public static abstract class AbstractC2890d<K0> {

        /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$d$a */
        public class a extends AbstractC2889c<K0, Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f11063a;

            public a(int i) {
                this.f11063a = i;
            }

            @Override // com.google.common.collect.MultimapBuilder.AbstractC2889c
            /* JADX INFO: renamed from: e */
            public <K extends K0, V> ymr<K, V> mo16073e() {
                return Multimaps.m16079d(AbstractC2890d.this.mo16072c(), new ArrayListSupplier(this.f11063a));
            }
        }

        /* JADX INFO: renamed from: a */
        public AbstractC2889c<K0, Object> m16074a() {
            return m16075b(2);
        }

        /* JADX INFO: renamed from: b */
        public AbstractC2889c<K0, Object> m16075b(int i) {
            sd5.m183444b(i, "expectedValuesPerKey");
            return new a(i);
        }

        /* JADX INFO: renamed from: c */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo16072c();
    }

    public /* synthetic */ MultimapBuilder(C2887a c2887a) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2890d<Object> m16068a() {
        return m16069b(8);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2890d<Object> m16069b(int i) {
        sd5.m183444b(i, "expectedKeys");
        return new C2887a(i);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2890d<Comparable> m16070c() {
        return m16071d(Ordering.natural());
    }

    /* JADX INFO: renamed from: d */
    public static <K0> AbstractC2890d<K0> m16071d(Comparator<K0> comparator) {
        sf80.m183894p(comparator);
        return new C2888b(comparator);
    }

    public MultimapBuilder() {
    }
}
