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
import p153l.AbstractC18359l7;
import p153l.a3j;
import p153l.adj;
import p153l.gyj0;
import p153l.jx2;
import p153l.k350;
import p153l.k950;
import p153l.l2j;
import p153l.s2j;
import p153l.se5;
import p153l.tp80;
import p153l.wgj0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Maps {

    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final jx2<A, B> bimap;

        public BiMapConverter(jx2<A, B> jx2Var) {
            this.bimap = (jx2) xn80.m212111p(jx2Var);
        }

        private static <X, Y> Y convert(jx2<X, Y> jx2Var, X x) {
            Y y = jx2Var.get(x);
            xn80.m212106k(y != null, "No non-null mapping present for input: %s", x);
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

        @Override // com.google.common.base.Converter, p153l.adj
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
    public class C2889a<K, V2> extends AbstractC18359l7<K, V2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f11078a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC2899k f11079b;

        public C2889a(Map.Entry entry, InterfaceC2899k interfaceC2899k) {
            this.f11078a = entry;
            this.f11079b = interfaceC2899k;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public K getKey() {
            return (K) this.f11078a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V2 getValue() {
            return (V2) this.f11079b.mo16111a(this.f11078a.getKey(), this.f11078a.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$b */
    public class C2890b<K, V1, V2> implements adj<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2899k f11080a;

        public C2890b(InterfaceC2899k interfaceC2899k) {
            this.f11080a = interfaceC2899k;
        }

        @Override // p153l.adj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return Maps.m16068C(this.f11080a, entry);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$c */
    public class C2891c<K, V> extends wgj0<Map.Entry<K, V>, K> {
        public C2891c(Iterator it) {
            super(it);
        }

        @Override // p153l.wgj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K mo15951a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$d */
    public class C2892d<K, V> extends wgj0<Map.Entry<K, V>, V> {
        public C2892d(Iterator it) {
            super(it);
        }

        @Override // p153l.wgj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V mo15951a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$e */
    public class C2893e<K, V> extends wgj0<K, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ adj f11081b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2893e(Iterator it, adj adjVar) {
            super(it);
            this.f11081b = adjVar;
        }

        @Override // p153l.wgj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15951a(K k) {
            return Maps.m16089j(k, this.f11081b.apply(k));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$f */
    public class C2894f<K, V> extends AbstractC18359l7<K, V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f11082a;

        public C2894f(Map.Entry entry) {
            this.f11082a = entry;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public K getKey() {
            return (K) this.f11082a.getKey();
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V getValue() {
            return (V) this.f11082a.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$g */
    public class C2895g<K, V> extends gyj0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f11083a;

        public C2895g(Iterator it) {
            this.f11083a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return Maps.m16071F((Map.Entry) this.f11083a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11083a.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* JADX INFO: renamed from: com.google.common.collect.Maps$h */
    public class C2896h<K, V1, V2> implements InterfaceC2899k<K, V1, V2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ adj f11084a;

        public C2896h(adj adjVar) {
            this.f11084a = adjVar;
        }

        @Override // com.google.common.collect.Maps.InterfaceC2899k
        /* JADX INFO: renamed from: a */
        public V2 mo16111a(K k, V1 v1) {
            return (V2) this.f11084a.apply(v1);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$j */
    public static abstract class AbstractC2898j<K, V> extends Sets.AbstractC2941e<Map.Entry<K, V>> {
        /* JADX INFO: renamed from: a */
        public abstract Map<K, V> mo15628a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo15628a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object objM16103x = Maps.m16103x(mo15628a(), key);
                if (k950.m148863a(objM16103x, entry.getValue()) && (objM16103x != null || mo15628a().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo15628a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return mo15628a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.AbstractC2941e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) xn80.m212111p(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.m16180k(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.AbstractC2941e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) xn80.m212111p(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM16176g = Sets.m16176g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetM16176g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo15628a().keySet().retainAll(hashSetM16176g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo15628a().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$k */
    public interface InterfaceC2899k<K, V1, V2> {
        /* JADX INFO: renamed from: a */
        V2 mo16111a(K k, V1 v1);
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$l */
    public static abstract class AbstractC2900l<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.Maps$l$a */
        public class a extends AbstractC2898j<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.AbstractC2898j
            /* JADX INFO: renamed from: a */
            public Map<K, V> mo15628a() {
                return AbstractC2900l.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return AbstractC2900l.this.mo15664a();
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo15664a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.m15929e(mo15664a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$m */
    public static class C2901m<K, V> extends Sets.AbstractC2941e<K> {

        /* JADX INFO: renamed from: a */
        public final Map<K, V> f11090a;

        public C2901m(Map<K, V> map) {
            this.f11090a = (Map) xn80.m212111p(map);
        }

        /* JADX INFO: renamed from: a */
        public Map<K, V> mo16117c() {
            return this.f11090a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo16117c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo16117c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo16117c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.m16092m(mo16117c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo16117c().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo16117c().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$o */
    public static class C2903o<K, V> extends C2901m<K, V> implements SortedSet<K> {
        public C2903o(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // com.google.common.collect.Maps.C2901m
        /* JADX INFO: renamed from: c */
        public SortedMap<K, V> mo16117c() {
            return (SortedMap) super.mo16117c();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo16117c().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo16117c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C2903o(mo16117c().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo16117c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C2903o(mo16117c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C2903o(mo16117c().tailMap(k));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$p */
    public static class C2904p<K, V1, V2> extends AbstractC2900l<K, V2> {

        /* JADX INFO: renamed from: a */
        public final Map<K, V1> f11091a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2899k<? super K, ? super V1, V2> f11092b;

        public C2904p(Map<K, V1> map, InterfaceC2899k<? super K, ? super V1, V2> interfaceC2899k) {
            this.f11091a = (Map) xn80.m212111p(map);
            this.f11092b = (InterfaceC2899k) xn80.m212111p(interfaceC2899k);
        }

        @Override // com.google.common.collect.Maps.AbstractC2900l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, V2>> mo15664a() {
            return Iterators.m15923B(this.f11091a.entrySet().iterator(), Maps.m16081b(this.f11092b));
        }

        @Override // com.google.common.collect.Maps.AbstractC2900l, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f11091a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f11091a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.f11091a.get(obj);
            if (v1 != null || this.f11091a.containsKey(obj)) {
                return this.f11092b.mo16111a(obj, (Object) k350.m147997a(v1));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f11091a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f11091a.containsKey(obj)) {
                return this.f11092b.mo16111a(obj, (Object) k350.m147997a(this.f11091a.remove(obj)));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11091a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new C2908t(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$q */
    public static class C2905q<K, V1, V2> extends C2904p<K, V1, V2> implements SortedMap<K, V2> {
        public C2905q(SortedMap<K, V1> sortedMap, InterfaceC2899k<? super K, ? super V1, V2> interfaceC2899k) {
            super(sortedMap, interfaceC2899k);
        }

        /* JADX INFO: renamed from: b */
        public SortedMap<K, V1> m16119b() {
            return (SortedMap) this.f11091a;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return m16119b().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return m16119b().firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> headMap(K k) {
            return Maps.m16067B(m16119b().headMap(k), this.f11092b);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return m16119b().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> subMap(K k, K k2) {
            return Maps.m16067B(m16119b().subMap(k, k2), this.f11092b);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V2> tailMap(K k) {
            return Maps.m16067B(m16119b().tailMap(k), this.f11092b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$s */
    public static class C2907s<K, V> extends C2906r<K, V> implements Set<Map.Entry<K, V>> {
        public C2907s(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m16170a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m16173d(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$t */
    public static class C2908t<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, V> f11094a;

        public C2908t(Map<K, V> map) {
            this.f11094a = (Map) xn80.m212111p(map);
        }

        /* JADX INFO: renamed from: a */
        public final Map<K, V> m16120a() {
            return this.f11094a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m16120a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m16120a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m16120a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.m16077L(m16120a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m16120a().entrySet()) {
                    if (k950.m148863a(obj, entry.getValue())) {
                        m16120a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) xn80.m212111p(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM16175f = Sets.m16175f();
                for (Map.Entry<K, V> entry : m16120a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetM16175f.add(entry.getKey());
                    }
                }
                return m16120a().keySet().removeAll(hashSetM16175f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) xn80.m212111p(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM16175f = Sets.m16175f();
                for (Map.Entry<K, V> entry : m16120a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetM16175f.add(entry.getKey());
                    }
                }
                return m16120a().keySet().retainAll(hashSetM16175f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m16120a().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$u */
    public static abstract class AbstractC2909u<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a */
        public transient Set<Map.Entry<K, V>> f11095a;

        /* JADX INFO: renamed from: b */
        public transient Set<K> f11096b;

        /* JADX INFO: renamed from: c */
        public transient Collection<V> f11097c;

        /* JADX INFO: renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo15624a();

        /* JADX INFO: renamed from: b */
        public Set<K> mo15631g() {
            return new C2901m(this);
        }

        /* JADX INFO: renamed from: c */
        public Collection<V> mo16121c() {
            return new C2908t(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11095a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setMo15624a = mo15624a();
            this.f11095a = setMo15624a;
            return setMo15624a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15632h() {
            Set<K> set = this.f11096b;
            if (set != null) {
                return set;
            }
            Set<K> setMo15631g = mo15631g();
            this.f11096b = setMo15631g;
            return setMo15631g;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f11097c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionMo16121c = mo16121c();
            this.f11097c = collectionMo16121c;
            return collectionMo16121c;
        }
    }

    /* JADX INFO: renamed from: A */
    public static <K, V1, V2> Map<K, V2> m16066A(Map<K, V1> map, InterfaceC2899k<? super K, ? super V1, V2> interfaceC2899k) {
        return new C2904p(map, interfaceC2899k);
    }

    /* JADX INFO: renamed from: B */
    public static <K, V1, V2> SortedMap<K, V2> m16067B(SortedMap<K, V1> sortedMap, InterfaceC2899k<? super K, ? super V1, V2> interfaceC2899k) {
        return new C2905q(sortedMap, interfaceC2899k);
    }

    /* JADX INFO: renamed from: C */
    public static <V2, K, V1> Map.Entry<K, V2> m16068C(InterfaceC2899k<? super K, ? super V1, V2> interfaceC2899k, Map.Entry<K, V1> entry) {
        xn80.m212111p(interfaceC2899k);
        xn80.m212111p(entry);
        return new C2889a(entry, interfaceC2899k);
    }

    /* JADX INFO: renamed from: D */
    public static <K, V1, V2> Map<K, V2> m16069D(Map<K, V1> map, adj<? super V1, V2> adjVar) {
        return m16066A(map, m16082c(adjVar));
    }

    /* JADX INFO: renamed from: E */
    public static <K, V1, V2> SortedMap<K, V2> m16070E(SortedMap<K, V1> sortedMap, adj<? super V1, V2> adjVar) {
        return m16067B(sortedMap, m16082c(adjVar));
    }

    /* JADX INFO: renamed from: F */
    public static <K, V> Map.Entry<K, V> m16071F(Map.Entry<? extends K, ? extends V> entry) {
        xn80.m212111p(entry);
        return new C2894f(entry);
    }

    /* JADX INFO: renamed from: G */
    public static <K, V> gyj0<Map.Entry<K, V>> m16072G(Iterator<Map.Entry<K, V>> it) {
        return new C2895g(it);
    }

    /* JADX INFO: renamed from: H */
    public static <K, V> Set<Map.Entry<K, V>> m16073H(Set<Map.Entry<K, V>> set) {
        return new C2907s(Collections.unmodifiableSet(set));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static <K, V> NavigableMap<K, V> m16074I(NavigableMap<K, ? extends V> navigableMap) {
        xn80.m212111p(navigableMap);
        return navigableMap instanceof UnmodifiableNavigableMap ? navigableMap : new UnmodifiableNavigableMap(navigableMap);
    }

    /* JADX INFO: renamed from: J */
    public static <K, V> Map.Entry<K, V> m16075J(Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return m16071F(entry);
    }

    /* JADX INFO: renamed from: K */
    public static <V> adj<Map.Entry<?, V>, V> m16076K() {
        return EntryFunction.VALUE;
    }

    /* JADX INFO: renamed from: L */
    public static <K, V> Iterator<V> m16077L(Iterator<Map.Entry<K, V>> it) {
        return new C2892d(it);
    }

    /* JADX INFO: renamed from: M */
    public static <V> V m16078M(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* JADX INFO: renamed from: N */
    public static <V> tp80<Map.Entry<?, V>> m16079N(tp80<? super V> tp80Var) {
        return Predicates.m15472e(tp80Var, m16076K());
    }

    /* JADX INFO: renamed from: b */
    public static <K, V1, V2> adj<Map.Entry<K, V1>, Map.Entry<K, V2>> m16081b(InterfaceC2899k<? super K, ? super V1, V2> interfaceC2899k) {
        xn80.m212111p(interfaceC2899k);
        return new C2890b(interfaceC2899k);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V1, V2> InterfaceC2899k<K, V1, V2> m16082c(adj<? super V1, V2> adjVar) {
        xn80.m212111p(adjVar);
        return new C2896h(adjVar);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> Iterator<Map.Entry<K, V>> m16083d(Set<K> set, adj<? super K, V> adjVar) {
        return new C2893e(set.iterator(), adjVar);
    }

    /* JADX INFO: renamed from: e */
    public static int m16084e(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        se5.m185516b(i, "expectedSize");
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    public static <K, V> boolean m16085f(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(m16071F((Map.Entry) obj));
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16086g(Map<?, ?> map, Object obj) {
        return Iterators.m15931g(m16092m(map.entrySet().iterator()), obj);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16087h(Map<?, ?> map, Object obj) {
        return Iterators.m15931g(m16077L(map.entrySet().iterator()), obj);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16088i(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> Map.Entry<K, V> m16089j(K k, V v2) {
        return new ImmutableEntry(k, v2);
    }

    /* JADX INFO: renamed from: k */
    public static <E> ImmutableMap<E, Integer> m16090k(Collection<E> collection) {
        ImmutableMap.C2809b c2809b = new ImmutableMap.C2809b(collection.size());
        Iterator<E> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            c2809b.mo15715g(it.next(), Integer.valueOf(i));
            i++;
        }
        return c2809b.mo15714d();
    }

    /* JADX INFO: renamed from: l */
    public static <K> adj<Map.Entry<K, ?>, K> m16091l() {
        return EntryFunction.KEY;
    }

    /* JADX INFO: renamed from: m */
    public static <K, V> Iterator<K> m16092m(Iterator<Map.Entry<K, V>> it) {
        return new C2891c(it);
    }

    /* JADX INFO: renamed from: n */
    public static <K> K m16093n(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX INFO: renamed from: o */
    public static <K> tp80<Map.Entry<K, ?>> m16094o(tp80<? super K> tp80Var) {
        return Predicates.m15472e(tp80Var, m16091l());
    }

    /* JADX INFO: renamed from: p */
    public static <K, V> HashMap<K, V> m16095p() {
        return new HashMap<>();
    }

    /* JADX INFO: renamed from: q */
    public static <K, V> HashMap<K, V> m16096q(int i) {
        return new HashMap<>(m16084e(i));
    }

    /* JADX INFO: renamed from: r */
    public static <K, V> IdentityHashMap<K, V> m16097r() {
        return new IdentityHashMap<>();
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> LinkedHashMap<K, V> m16098s() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: renamed from: t */
    public static <K, V> LinkedHashMap<K, V> m16099t(int i) {
        return new LinkedHashMap<>(m16084e(i));
    }

    /* JADX INFO: renamed from: u */
    public static <K, V> void m16100u(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: v */
    public static <K, V> boolean m16101v(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(m16071F((Map.Entry) obj));
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m16102w(Map<?, ?> map, Object obj) {
        xn80.m212111p(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static <V> V m16103x(Map<?, V> map, Object obj) {
        xn80.m212111p(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static <V> V m16104y(Map<?, V> map, Object obj) {
        xn80.m212111p(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static String m16105z(Map<?, ?> map) {
        StringBuilder sbM16313b = C2991g.m16313b(map.size());
        sbM16313b.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbM16313b.append(", ");
            }
            sbM16313b.append(entry.getKey());
            sbM16313b.append('=');
            sbM16313b.append(entry.getValue());
            z = false;
        }
        sbM16313b.append('}');
        return sbM16313b.toString();
    }

    public enum EntryFunction implements adj<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.collect.Maps.EntryFunction, p153l.adj
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.collect.Maps.EntryFunction, p153l.adj
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        @Override // p153l.adj
        public abstract /* synthetic */ Object apply(Map.Entry<?, ?> entry);

        /* synthetic */ EntryFunction(C2891c c2891c) {
            this();
        }
    }

    public static class UnmodifiableBiMap<K, V> extends s2j<K, V> implements jx2<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final jx2<? extends K, ? extends V> delegate;
        jx2<V, K> inverse;
        final Map<K, V> unmodifiableMap;
        transient Set<V> values;

        public UnmodifiableBiMap(jx2<? extends K, ? extends V> jx2Var, jx2<V, K> jx2Var2) {
            this.unmodifiableMap = Collections.unmodifiableMap(jx2Var);
            this.delegate = jx2Var;
            this.inverse = jx2Var2;
        }

        @Override // p153l.jx2
        public V forcePut(K k, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.jx2
        public jx2<V, K> inverse() {
            jx2<V, K> jx2Var = this.inverse;
            if (jx2Var != null) {
                return jx2Var;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.delegate.inverse(), this);
            this.inverse = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // p153l.s2j, java.util.Map, p153l.jx2
        public Set<V> values() {
            Set<V> set = this.values;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.values());
            this.values = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // p153l.s2j, p153l.v2j
        public Map<K, V> delegate() {
            return this.unmodifiableMap;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$i */
    public static abstract class AbstractC2897i<K, V> extends s2j<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: a */
        public transient Comparator<? super K> f11085a;

        /* JADX INFO: renamed from: b */
        public transient Set<Map.Entry<K, V>> f11086b;

        /* JADX INFO: renamed from: c */
        public transient NavigableSet<K> f11087c;

        /* JADX INFO: renamed from: com.google.common.collect.Maps$i$a */
        public class a extends AbstractC2898j<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.AbstractC2898j
            /* JADX INFO: renamed from: a */
            public Map<K, V> mo15628a() {
                return AbstractC2897i.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return AbstractC2897i.this.mo16114c();
            }
        }

        /* JADX INFO: renamed from: g */
        public static <T> Ordering<T> m16112g(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<K, V>> m16113a() {
            return new a();
        }

        /* JADX INFO: renamed from: c */
        public abstract Iterator<Map.Entry<K, V>> mo16114c();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return mo16115f().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return mo16115f().floorKey(k);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f11085a;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = mo16115f().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering orderingM16112g = m16112g(comparator2);
            this.f11085a = orderingM16112g;
            return orderingM16112g;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return mo16115f().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return mo16115f();
        }

        @Override // p153l.s2j, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11086b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setM16113a = m16113a();
            this.f11086b = setM16113a;
            return setM16113a;
        }

        /* JADX INFO: renamed from: f */
        public abstract NavigableMap<K, V> mo16115f();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return mo16115f().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo16115f().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return mo16115f().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return mo16115f().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return mo16115f().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return mo16115f().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return mo16115f().lowerKey(k);
        }

        @Override // p153l.s2j, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return mo16115f().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo16115f().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return mo16115f().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return mo16115f().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f11087c;
            if (navigableSet != null) {
                return navigableSet;
            }
            C2902n c2902n = new C2902n(this);
            this.f11087c = c2902n;
            return c2902n;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return mo16115f().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return mo16115f().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return mo16115f().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return mo16115f().headMap(k, z).descendingMap();
        }

        @Override // p153l.v2j
        public String toString() {
            return standardToString();
        }

        @Override // p153l.s2j, java.util.Map, p153l.jx2
        public Collection<V> values() {
            return new C2908t(this);
        }

        @Override // p153l.s2j, p153l.v2j
        public final Map<K, V> delegate() {
            return mo16115f();
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
    public static class C2906r<K, V> extends l2j<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Collection<Map.Entry<K, V>> f11093a;

        public C2906r(Collection<Map.Entry<K, V>> collection) {
            this.f11093a = collection;
        }

        @Override // p153l.l2j, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps.m16072G(this.f11093a.iterator());
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // p153l.l2j, p153l.v2j
        public Collection<Map.Entry<K, V>> delegate() {
            return this.f11093a;
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    public static class UnmodifiableNavigableMap<K, V> extends a3j<K, V> implements NavigableMap<K, V>, Serializable {
        private final NavigableMap<K, ? extends V> delegate;
        private transient UnmodifiableNavigableMap<K, V> descendingMap;

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.delegate = navigableMap;
            this.descendingMap = unmodifiableNavigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return Maps.m16075J(this.delegate.ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return this.delegate.ceilingKey(k);
        }

        @Override // p153l.a3j, p153l.s2j, p153l.v2j
        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.delegate);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.m16182m(this.delegate.descendingKeySet());
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
            return Maps.m16075J(this.delegate.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return Maps.m16075J(this.delegate.floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return this.delegate.floorKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.m16074I(this.delegate.headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return Maps.m16075J(this.delegate.higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return this.delegate.higherKey(k);
        }

        @Override // p153l.s2j, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return Maps.m16075J(this.delegate.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return Maps.m16075J(this.delegate.lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return this.delegate.lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.m16182m(this.delegate.navigableKeySet());
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
            return Maps.m16074I(this.delegate.subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.m16074I(this.delegate.tailMap(k, z));
        }

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.delegate = navigableMap;
        }

        @Override // p153l.a3j, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // p153l.a3j, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // p153l.a3j, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$n */
    public static class C2902n<K, V> extends C2903o<K, V> implements NavigableSet<K> {
        public C2902n(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return mo16116a().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return mo16116a().descendingKeySet();
        }

        @Override // com.google.common.collect.Maps.C2903o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> mo16117c() {
            return (NavigableMap) this.f11090a;
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return mo16116a().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return mo16116a().headMap(k, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return mo16116a().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return mo16116a().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.m16093n(mo16116a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.m16093n(mo16116a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return mo16116a().subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return mo16116a().tailMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.C2903o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // com.google.common.collect.Maps.C2903o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.google.common.collect.Maps.C2903o, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }
    }
}
