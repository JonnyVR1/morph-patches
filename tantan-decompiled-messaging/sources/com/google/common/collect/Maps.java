package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import com.google.common.base.Converter;
import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p149l.AbstractC19437q7;
import p149l.dpj0;
import p149l.f0j;
import p149l.gaj;
import p149l.oh80;
import p149l.qzi;
import p149l.s7j0;
import p149l.sd5;
import p149l.sf80;
import p149l.tw2;
import p149l.v050;
import p149l.vu40;
import p149l.xzi;

/* JADX INFO: loaded from: classes7.dex */
public final class Maps {

    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final tw2<A, B> bimap;

        public BiMapConverter(tw2<A, B> tw2Var) {
            this.bimap = (tw2) sf80.m183894p(tw2Var);
        }

        private static <X, Y> Y convert(tw2<X, Y> tw2Var, X x) {
            Y y = tw2Var.get(x);
            sf80.m183889k(y != null, "No non-null mapping present for input: %s", x);
            return y;
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b) {
            return (A) convert(this.bimap.inverse(), b);
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a) {
            return (B) convert(this.bimap, a);
        }

        @Override // com.google.common.base.Converter, p149l.gaj
        public boolean equals(Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.bimap.equals(((BiMapConverter) obj).bimap);
            }
            return false;
        }

        public int hashCode() {
            return this.bimap.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.bimap);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
            sb.append("Maps.asConverter(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$a */
    public class C2866a<K, V2> extends AbstractC19437q7<K, V2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f11041a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC2876k f11042b;

        public C2866a(Map.Entry entry, InterfaceC2876k interfaceC2876k) {
            this.f11041a = entry;
            this.f11042b = interfaceC2876k;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public K getKey() {
            return (K) this.f11041a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V2 getValue() {
            return (V2) this.f11042b.mo16057a(this.f11041a.getKey(), this.f11041a.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$b */
    public class C2867b<K, V1, V2> implements gaj<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2876k f11043a;

        public C2867b(InterfaceC2876k interfaceC2876k) {
            this.f11043a = interfaceC2876k;
        }

        @Override // p149l.gaj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return Maps.m16014C(this.f11043a, entry);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$c */
    public class C2868c<K, V> extends s7j0<Map.Entry<K, V>, K> {
        public C2868c(Iterator it) {
            super(it);
        }

        @Override // p149l.s7j0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K mo15897a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$d */
    public class C2869d<K, V> extends s7j0<Map.Entry<K, V>, V> {
        public C2869d(Iterator it) {
            super(it);
        }

        @Override // p149l.s7j0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V mo15897a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$e */
    public class C2870e<K, V> extends s7j0<K, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gaj f11044b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2870e(Iterator it, gaj gajVar) {
            super(it);
            this.f11044b = gajVar;
        }

        @Override // p149l.s7j0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15897a(K k) {
            return Maps.m16035j(k, this.f11044b.apply(k));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$f */
    public class C2871f<K, V> extends AbstractC19437q7<K, V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f11045a;

        public C2871f(Map.Entry entry) {
            this.f11045a = entry;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public K getKey() {
            return (K) this.f11045a.getKey();
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V getValue() {
            return (V) this.f11045a.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$g */
    public class C2872g<K, V> extends dpj0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f11046a;

        public C2872g(Iterator it) {
            this.f11046a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return Maps.m16017F((Map.Entry) this.f11046a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11046a.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$h */
    public class C2873h<K, V1, V2> implements InterfaceC2876k<K, V1, V2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gaj f11047a;

        public C2873h(gaj gajVar) {
            this.f11047a = gajVar;
        }

        @Override // com.google.common.collect.Maps.InterfaceC2876k
        /* JADX INFO: renamed from: a */
        public V2 mo16057a(K k, V1 v1) {
            return (V2) this.f11047a.apply(v1);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$j */
    public static abstract class AbstractC2875j<K, V> extends Sets.AbstractC2918e<Map.Entry<K, V>> {
        /* JADX INFO: renamed from: a */
        public abstract Map<K, V> mo15574a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo15574a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object objM16049x = Maps.m16049x(mo15574a(), key);
                if (v050.m196470a(objM16049x, entry.getValue()) && (objM16049x != null || mo15574a().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo15574a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return mo15574a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.AbstractC2918e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) sf80.m183894p(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.m16126k(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.AbstractC2918e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) sf80.m183894p(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM16122g = Sets.m16122g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetM16122g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo15574a().keySet().retainAll(hashSetM16122g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo15574a().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$k */
    public interface InterfaceC2876k<K, V1, V2> {
        /* JADX INFO: renamed from: a */
        V2 mo16057a(K k, V1 v1);
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$l */
    public static abstract class AbstractC2877l<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.Maps$l$a */
        public class a extends AbstractC2875j<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.AbstractC2875j
            /* JADX INFO: renamed from: a */
            public Map<K, V> mo15574a() {
                return AbstractC2877l.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return AbstractC2877l.this.mo15610a();
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo15610a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.m15875e(mo15610a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$m */
    public static class C2878m<K, V> extends Sets.AbstractC2918e<K> {

        /* JADX INFO: renamed from: a */
        public final Map<K, V> f11053a;

        public C2878m(Map<K, V> map) {
            this.f11053a = (Map) sf80.m183894p(map);
        }

        /* JADX INFO: renamed from: a */
        public Map<K, V> mo16063c() {
            return this.f11053a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo16063c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo16063c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo16063c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.m16038m(mo16063c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo16063c().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo16063c().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$o */
    public static class C2880o<K, V> extends C2878m<K, V> implements SortedSet<K> {
        public C2880o(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // com.google.common.collect.Maps.C2878m
        /* JADX INFO: renamed from: c */
        public SortedMap<K, V> mo16063c() {
            return (SortedMap) super.mo16063c();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo16063c().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo16063c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C2880o(mo16063c().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo16063c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C2880o(mo16063c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C2880o(mo16063c().tailMap(k));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$p */
    public static class C2881p<K, V1, V2> extends AbstractC2877l<K, V2> {

        /* JADX INFO: renamed from: a */
        public final Map<K, V1> f11054a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2876k<? super K, ? super V1, V2> f11055b;

        public C2881p(Map<K, V1> map, InterfaceC2876k<? super K, ? super V1, V2> interfaceC2876k) {
            this.f11054a = (Map) sf80.m183894p(map);
            this.f11055b = (InterfaceC2876k) sf80.m183894p(interfaceC2876k);
        }

        @Override // com.google.common.collect.Maps.AbstractC2877l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, V2>> mo15610a() {
            return Iterators.m15869B(this.f11054a.entrySet().iterator(), Maps.m16027b(this.f11055b));
        }

        @Override // com.google.common.collect.Maps.AbstractC2877l, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f11054a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f11054a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.f11054a.get(obj);
            if (v1 != null || this.f11054a.containsKey(obj)) {
                return this.f11055b.mo16057a(obj, (Object) vu40.m200060a(v1));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f11054a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f11054a.containsKey(obj)) {
                return this.f11055b.mo16057a(obj, (Object) vu40.m200060a(this.f11054a.remove(obj)));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11054a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new C2885t(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$q */
    public static class C2882q<K, V1, V2> extends C2881p<K, V1, V2> implements SortedMap<K, V2> {
        public C2882q(SortedMap<K, V1> sortedMap, InterfaceC2876k<? super K, ? super V1, V2> interfaceC2876k) {
            super(sortedMap, interfaceC2876k);
        }

        /* JADX INFO: renamed from: b */
        public SortedMap<K, V1> m16065b() {
            return (SortedMap) this.f11054a;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return m16065b().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return m16065b().firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> headMap(K k) {
            return Maps.m16013B(m16065b().headMap(k), this.f11055b);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return m16065b().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> subMap(K k, K k2) {
            return Maps.m16013B(m16065b().subMap(k, k2), this.f11055b);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> tailMap(K k) {
            return Maps.m16013B(m16065b().tailMap(k), this.f11055b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$s */
    public static class C2884s<K, V> extends C2883r<K, V> implements Set<Map.Entry<K, V>> {
        public C2884s(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m16116a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m16119d(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$t */
    public static class C2885t<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, V> f11057a;

        public C2885t(Map<K, V> map) {
            this.f11057a = (Map) sf80.m183894p(map);
        }

        /* JADX INFO: renamed from: a */
        public final Map<K, V> m16066a() {
            return this.f11057a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m16066a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m16066a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m16066a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.m16023L(m16066a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m16066a().entrySet()) {
                    if (v050.m196470a(obj, entry.getValue())) {
                        m16066a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) sf80.m183894p(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM16121f = Sets.m16121f();
                for (Map.Entry<K, V> entry : m16066a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetM16121f.add(entry.getKey());
                    }
                }
                return m16066a().keySet().removeAll(hashSetM16121f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) sf80.m183894p(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM16121f = Sets.m16121f();
                for (Map.Entry<K, V> entry : m16066a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetM16121f.add(entry.getKey());
                    }
                }
                return m16066a().keySet().retainAll(hashSetM16121f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m16066a().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$u */
    public static abstract class AbstractC2886u<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a */
        public transient Set<Map.Entry<K, V>> f11058a;

        /* JADX INFO: renamed from: b */
        public transient Set<K> f11059b;

        /* JADX INFO: renamed from: c */
        public transient Collection<V> f11060c;

        /* JADX INFO: renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo15570a();

        /* JADX INFO: renamed from: b */
        public Set<K> mo15577g() {
            return new C2878m(this);
        }

        /* JADX INFO: renamed from: c */
        public Collection<V> mo16067c() {
            return new C2885t(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11058a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setMo15570a = mo15570a();
            this.f11058a = setMo15570a;
            return setMo15570a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15578h() {
            Set<K> set = this.f11059b;
            if (set != null) {
                return set;
            }
            Set<K> setMo15577g = mo15577g();
            this.f11059b = setMo15577g;
            return setMo15577g;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f11060c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionMo16067c = mo16067c();
            this.f11060c = collectionMo16067c;
            return collectionMo16067c;
        }
    }

    /* JADX INFO: renamed from: A */
    public static <K, V1, V2> Map<K, V2> m16012A(Map<K, V1> map, InterfaceC2876k<? super K, ? super V1, V2> interfaceC2876k) {
        return new C2881p(map, interfaceC2876k);
    }

    /* JADX INFO: renamed from: B */
    public static <K, V1, V2> SortedMap<K, V2> m16013B(SortedMap<K, V1> sortedMap, InterfaceC2876k<? super K, ? super V1, V2> interfaceC2876k) {
        return new C2882q(sortedMap, interfaceC2876k);
    }

    /* JADX INFO: renamed from: C */
    public static <V2, K, V1> Map.Entry<K, V2> m16014C(InterfaceC2876k<? super K, ? super V1, V2> interfaceC2876k, Map.Entry<K, V1> entry) {
        sf80.m183894p(interfaceC2876k);
        sf80.m183894p(entry);
        return new C2866a(entry, interfaceC2876k);
    }

    /* JADX INFO: renamed from: D */
    public static <K, V1, V2> Map<K, V2> m16015D(Map<K, V1> map, gaj<? super V1, V2> gajVar) {
        return m16012A(map, m16028c(gajVar));
    }

    /* JADX INFO: renamed from: E */
    public static <K, V1, V2> SortedMap<K, V2> m16016E(SortedMap<K, V1> sortedMap, gaj<? super V1, V2> gajVar) {
        return m16013B(sortedMap, m16028c(gajVar));
    }

    /* JADX INFO: renamed from: F */
    public static <K, V> Map.Entry<K, V> m16017F(Map.Entry<? extends K, ? extends V> entry) {
        sf80.m183894p(entry);
        return new C2871f(entry);
    }

    /* JADX INFO: renamed from: G */
    public static <K, V> dpj0<Map.Entry<K, V>> m16018G(Iterator<Map.Entry<K, V>> it) {
        return new C2872g(it);
    }

    /* JADX INFO: renamed from: H */
    public static <K, V> Set<Map.Entry<K, V>> m16019H(Set<Map.Entry<K, V>> set) {
        return new C2884s(Collections.unmodifiableSet(set));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static <K, V> NavigableMap<K, V> m16020I(NavigableMap<K, ? extends V> navigableMap) {
        sf80.m183894p(navigableMap);
        return navigableMap instanceof UnmodifiableNavigableMap ? navigableMap : new UnmodifiableNavigableMap(navigableMap);
    }

    /* JADX INFO: renamed from: J */
    public static <K, V> Map.Entry<K, V> m16021J(Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return m16017F(entry);
    }

    /* JADX INFO: renamed from: K */
    public static <V> gaj<Map.Entry<?, V>, V> m16022K() {
        return EntryFunction.VALUE;
    }

    /* JADX INFO: renamed from: L */
    public static <K, V> Iterator<V> m16023L(Iterator<Map.Entry<K, V>> it) {
        return new C2869d(it);
    }

    /* JADX INFO: renamed from: M */
    public static <V> V m16024M(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* JADX INFO: renamed from: N */
    public static <V> oh80<Map.Entry<?, V>> m16025N(oh80<? super V> oh80Var) {
        return Predicates.m15418e(oh80Var, m16022K());
    }

    /* JADX INFO: renamed from: b */
    public static <K, V1, V2> gaj<Map.Entry<K, V1>, Map.Entry<K, V2>> m16027b(InterfaceC2876k<? super K, ? super V1, V2> interfaceC2876k) {
        sf80.m183894p(interfaceC2876k);
        return new C2867b(interfaceC2876k);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V1, V2> InterfaceC2876k<K, V1, V2> m16028c(gaj<? super V1, V2> gajVar) {
        sf80.m183894p(gajVar);
        return new C2873h(gajVar);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> Iterator<Map.Entry<K, V>> m16029d(Set<K> set, gaj<? super K, V> gajVar) {
        return new C2870e(set.iterator(), gajVar);
    }

    /* JADX INFO: renamed from: e */
    public static int m16030e(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        sd5.m183444b(i, "expectedSize");
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    public static <K, V> boolean m16031f(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(m16017F((Map.Entry) obj));
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16032g(Map<?, ?> map, Object obj) {
        return Iterators.m15877g(m16038m(map.entrySet().iterator()), obj);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16033h(Map<?, ?> map, Object obj) {
        return Iterators.m15877g(m16023L(map.entrySet().iterator()), obj);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16034i(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> Map.Entry<K, V> m16035j(K k, V v2) {
        return new ImmutableEntry(k, v2);
    }

    /* JADX INFO: renamed from: k */
    public static <E> ImmutableMap<E, Integer> m16036k(Collection<E> collection) {
        ImmutableMap.C2786b c2786b = new ImmutableMap.C2786b(collection.size());
        Iterator<E> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            c2786b.mo15661g(it.next(), Integer.valueOf(i));
            i++;
        }
        return c2786b.mo15660d();
    }

    /* JADX INFO: renamed from: l */
    public static <K> gaj<Map.Entry<K, ?>, K> m16037l() {
        return EntryFunction.KEY;
    }

    /* JADX INFO: renamed from: m */
    public static <K, V> Iterator<K> m16038m(Iterator<Map.Entry<K, V>> it) {
        return new C2868c(it);
    }

    /* JADX INFO: renamed from: n */
    public static <K> K m16039n(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX INFO: renamed from: o */
    public static <K> oh80<Map.Entry<K, ?>> m16040o(oh80<? super K> oh80Var) {
        return Predicates.m15418e(oh80Var, m16037l());
    }

    /* JADX INFO: renamed from: p */
    public static <K, V> HashMap<K, V> m16041p() {
        return new HashMap<>();
    }

    /* JADX INFO: renamed from: q */
    public static <K, V> HashMap<K, V> m16042q(int i) {
        return new HashMap<>(m16030e(i));
    }

    /* JADX INFO: renamed from: r */
    public static <K, V> IdentityHashMap<K, V> m16043r() {
        return new IdentityHashMap<>();
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> LinkedHashMap<K, V> m16044s() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: renamed from: t */
    public static <K, V> LinkedHashMap<K, V> m16045t(int i) {
        return new LinkedHashMap<>(m16030e(i));
    }

    /* JADX INFO: renamed from: u */
    public static <K, V> void m16046u(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: v */
    public static <K, V> boolean m16047v(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(m16017F((Map.Entry) obj));
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m16048w(Map<?, ?> map, Object obj) {
        sf80.m183894p(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static <V> V m16049x(Map<?, V> map, Object obj) {
        sf80.m183894p(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static <V> V m16050y(Map<?, V> map, Object obj) {
        sf80.m183894p(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static String m16051z(Map<?, ?> map) {
        StringBuilder sbM16259b = C2968g.m16259b(map.size());
        sbM16259b.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbM16259b.append(", ");
            }
            sbM16259b.append(entry.getKey());
            sbM16259b.append('=');
            sbM16259b.append(entry.getValue());
            z = false;
        }
        sbM16259b.append('}');
        return sbM16259b.toString();
    }

    public enum EntryFunction implements gaj<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.collect.Maps.EntryFunction, p149l.gaj
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.collect.Maps.EntryFunction, p149l.gaj
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        @Override // p149l.gaj
        public abstract /* synthetic */ Object apply(Map.Entry<?, ?> entry);

        /* synthetic */ EntryFunction(C2868c c2868c) {
            this();
        }
    }

    public static class UnmodifiableBiMap<K, V> extends xzi<K, V> implements tw2<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final tw2<? extends K, ? extends V> delegate;
        tw2<V, K> inverse;
        final Map<K, V> unmodifiableMap;
        transient Set<V> values;

        public UnmodifiableBiMap(tw2<? extends K, ? extends V> tw2Var, tw2<V, K> tw2Var2) {
            this.unmodifiableMap = Collections.unmodifiableMap(tw2Var);
            this.delegate = tw2Var;
            this.inverse = tw2Var2;
        }

        @Override // p149l.tw2
        public V forcePut(K k, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.tw2
        public tw2<V, K> inverse() {
            tw2<V, K> tw2Var = this.inverse;
            if (tw2Var != null) {
                return tw2Var;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.delegate.inverse(), this);
            this.inverse = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // p149l.xzi, java.util.Map, p149l.tw2
        public Set<V> values() {
            Set<V> set = this.values;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.values());
            this.values = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // p149l.xzi, p149l.a0j
        public Map<K, V> delegate() {
            return this.unmodifiableMap;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$i */
    public static abstract class AbstractC2874i<K, V> extends xzi<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: a */
        public transient Comparator<? super K> f11048a;

        /* JADX INFO: renamed from: b */
        public transient Set<Map.Entry<K, V>> f11049b;

        /* JADX INFO: renamed from: c */
        public transient NavigableSet<K> f11050c;

        /* JADX INFO: renamed from: com.google.common.collect.Maps$i$a */
        public class a extends AbstractC2875j<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.AbstractC2875j
            /* JADX INFO: renamed from: a */
            public Map<K, V> mo15574a() {
                return AbstractC2874i.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return AbstractC2874i.this.mo16060c();
            }
        }

        /* JADX INFO: renamed from: g */
        public static <T> Ordering<T> m16058g(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<K, V>> m16059a() {
            return new a();
        }

        /* JADX INFO: renamed from: c */
        public abstract Iterator<Map.Entry<K, V>> mo16060c();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return mo16061f().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return mo16061f().floorKey(k);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f11048a;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = mo16061f().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering orderingM16058g = m16058g(comparator2);
            this.f11048a = orderingM16058g;
            return orderingM16058g;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return mo16061f().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return mo16061f();
        }

        @Override // p149l.xzi, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11049b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setM16059a = m16059a();
            this.f11049b = setM16059a;
            return setM16059a;
        }

        /* JADX INFO: renamed from: f */
        public abstract NavigableMap<K, V> mo16061f();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return mo16061f().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo16061f().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return mo16061f().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return mo16061f().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return mo16061f().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return mo16061f().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return mo16061f().lowerKey(k);
        }

        @Override // p149l.xzi, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return mo16061f().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo16061f().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return mo16061f().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return mo16061f().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f11050c;
            if (navigableSet != null) {
                return navigableSet;
            }
            C2879n c2879n = new C2879n(this);
            this.f11050c = c2879n;
            return c2879n;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return mo16061f().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return mo16061f().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return mo16061f().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return mo16061f().headMap(k, z).descendingMap();
        }

        @Override // p149l.a0j
        public String toString() {
            return standardToString();
        }

        @Override // p149l.xzi, java.util.Map, p149l.tw2
        public Collection<V> values() {
            return new C2885t(this);
        }

        @Override // p149l.xzi, p149l.a0j
        public final Map<K, V> delegate() {
            return mo16061f();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$r */
    public static class C2883r<K, V> extends qzi<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Collection<Map.Entry<K, V>> f11056a;

        public C2883r(Collection<Map.Entry<K, V>> collection) {
            this.f11056a = collection;
        }

        @Override // p149l.qzi, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps.m16018G(this.f11056a.iterator());
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // p149l.qzi, p149l.a0j
        public Collection<Map.Entry<K, V>> delegate() {
            return this.f11056a;
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    public static class UnmodifiableNavigableMap<K, V> extends f0j<K, V> implements NavigableMap<K, V>, Serializable {
        private final NavigableMap<K, ? extends V> delegate;
        private transient UnmodifiableNavigableMap<K, V> descendingMap;

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.delegate = navigableMap;
            this.descendingMap = unmodifiableNavigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return Maps.m16021J(this.delegate.ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return this.delegate.ceilingKey(k);
        }

        @Override // p149l.f0j, p149l.xzi, p149l.a0j
        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.delegate);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.m16128m(this.delegate.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.descendingMap;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new UnmodifiableNavigableMap<>(this.delegate.descendingMap(), this);
            this.descendingMap = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return Maps.m16021J(this.delegate.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return Maps.m16021J(this.delegate.floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return this.delegate.floorKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.m16020I(this.delegate.headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return Maps.m16021J(this.delegate.higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return this.delegate.higherKey(k);
        }

        @Override // p149l.xzi, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return Maps.m16021J(this.delegate.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return Maps.m16021J(this.delegate.lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return this.delegate.lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.m16128m(this.delegate.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.m16020I(this.delegate.subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.m16020I(this.delegate.tailMap(k, z));
        }

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.delegate = navigableMap;
        }

        @Override // p149l.f0j, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // p149l.f0j, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // p149l.f0j, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$n */
    public static class C2879n<K, V> extends C2880o<K, V> implements NavigableSet<K> {
        public C2879n(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return mo16062a().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return mo16062a().descendingKeySet();
        }

        @Override // com.google.common.collect.Maps.C2880o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> mo16063c() {
            return (NavigableMap) this.f11053a;
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return mo16062a().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return mo16062a().headMap(k, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return mo16062a().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return mo16062a().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.m16039n(mo16062a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.m16039n(mo16062a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return mo16062a().subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return mo16062a().tailMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.C2880o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // com.google.common.collect.Maps.C2880o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.google.common.collect.Maps.C2880o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }
    }
}
