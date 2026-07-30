package com.google.common.collect;

import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p153l.AbstractC18359l7;
import p153l.adj;
import p153l.b7h0;
import p153l.k350;
import p153l.t2j;
import p153l.tp80;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class StandardTable<R, C, V> extends AbstractC2989e<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final Map<R, Map<C, V>> backingMap;
    private transient Set<C> columnKeySet;
    private transient StandardTable<R, C, V>.C2959f columnMap;
    final b7h0<? extends Map<C, V>> factory;
    private transient Map<R, Map<C, V>> rowMap;

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$b */
    public class C2955b implements Iterator<InterfaceC3002r.a<R, C, V>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<R, Map<C, V>>> f11137a;

        /* JADX INFO: renamed from: b */
        public Map.Entry<R, Map<C, V>> f11138b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<C, V>> f11139c;

        public C2955b() {
            this.f11137a = StandardTable.this.backingMap.entrySet().iterator();
            this.f11139c = Iterators.m15935k();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC3002r.a<R, C, V> next() {
            if (!this.f11139c.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f11137a.next();
                this.f11138b = next;
                this.f11139c = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f11138b);
            Map.Entry<C, V> next2 = this.f11139c.next();
            return Tables.m16228c(this.f11138b.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11137a.hasNext() || this.f11139c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11139c.remove();
            Map.Entry<R, Map<C, V>> entry = this.f11138b;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f11137a.remove();
                this.f11138b = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c */
    public class C2956c extends Maps.AbstractC2909u<R, V> {

        /* JADX INFO: renamed from: d */
        public final C f11141d;

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$a */
        public class a extends Sets.AbstractC2941e<Map.Entry<R, V>> {
            public a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                C2956c.this.m16190d(Predicates.m15469b());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.containsMapping(entry.getKey(), C2956c.this.f11141d, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                C2956c c2956c = C2956c.this;
                return !StandardTable.this.containsColumn(c2956c.f11141d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.removeMapping(entry.getKey(), C2956c.this.f11141d, entry.getValue());
            }

            @Override // com.google.common.collect.Sets.AbstractC2941e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C2956c.this.m16190d(Predicates.m15476i(Predicates.m15474g(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(C2956c.this.f11141d)) {
                        i++;
                    }
                }
                return i;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$b */
        public class b extends AbstractIterator<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: c */
            public final Iterator<Map.Entry<R, Map<C, V>>> f11144c;

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$b$a */
            public class a extends AbstractC18359l7<R, V> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f11146a;

                public a(Map.Entry entry) {
                    this.f11146a = entry;
                }

                @Override // p153l.AbstractC18359l7, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f11146a.getKey();
                }

                @Override // p153l.AbstractC18359l7, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f11146a.getValue()).get(C2956c.this.f11141d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.AbstractC18359l7, java.util.Map.Entry
                public V setValue(V v2) {
                    return (V) k350.m147997a(((Map) this.f11146a.getValue()).put(C2956c.this.f11141d, xn80.m212111p(v2)));
                }
            }

            public b() {
                this.f11144c = StandardTable.this.backingMap.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> mo15619a() {
                while (this.f11144c.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f11144c.next();
                    if (next.getValue().containsKey(C2956c.this.f11141d)) {
                        return new a(next);
                    }
                }
                return m15620b();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$c */
        public class c extends Maps.C2901m<R, V> {
            public c() {
                super(C2956c.this);
            }

            @Override // com.google.common.collect.Maps.C2901m, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                C2956c c2956c = C2956c.this;
                return StandardTable.this.contains(obj, c2956c.f11141d);
            }

            @Override // com.google.common.collect.Maps.C2901m, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                C2956c c2956c = C2956c.this;
                return StandardTable.this.remove(obj, c2956c.f11141d) != null;
            }

            @Override // com.google.common.collect.Sets.AbstractC2941e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C2956c.this.m16190d(Maps.m16094o(Predicates.m15476i(Predicates.m15474g(collection))));
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$d */
        public class d extends Maps.C2908t<R, V> {
            public d() {
                super(C2956c.this);
            }

            @Override // com.google.common.collect.Maps.C2908t, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                return obj != null && C2956c.this.m16190d(Maps.m16079N(Predicates.m15473f(obj)));
            }

            @Override // com.google.common.collect.Maps.C2908t, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return C2956c.this.m16190d(Maps.m16079N(Predicates.m15474g(collection)));
            }

            @Override // com.google.common.collect.Maps.C2908t, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return C2956c.this.m16190d(Maps.m16079N(Predicates.m15476i(Predicates.m15474g(collection))));
            }
        }

        public C2956c(C c2) {
            this.f11141d = (C) xn80.m212111p(c2);
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<R, V>> mo15624a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: b */
        public Set<R> mo15631g() {
            return new c();
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: c */
        public Collection<V> mo16121c() {
            return new d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.contains(obj, this.f11141d);
        }

        /* JADX INFO: renamed from: d */
        public boolean m16190d(tp80<? super Map.Entry<R, V>> tp80Var) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v2 = value.get(this.f11141d);
                if (v2 != null && tp80Var.apply(Maps.m16089j(next.getKey(), v2))) {
                    value.remove(this.f11141d);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return (V) StandardTable.this.get(obj, this.f11141d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r, V v2) {
            return (V) StandardTable.this.put(r, this.f11141d, v2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return (V) StandardTable.this.remove(obj, this.f11141d);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$d */
    public class C2957d extends AbstractIterator<C> {

        /* JADX INFO: renamed from: c */
        public final Map<C, V> f11150c;

        /* JADX INFO: renamed from: d */
        public final Iterator<Map<C, V>> f11151d;

        /* JADX INFO: renamed from: e */
        public Iterator<Map.Entry<C, V>> f11152e;

        public C2957d() {
            this.f11150c = StandardTable.this.factory.get();
            this.f11151d = StandardTable.this.backingMap.values().iterator();
            this.f11152e = Iterators.m15933i();
        }

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: a */
        public C mo15619a() {
            while (true) {
                if (this.f11152e.hasNext()) {
                    Map.Entry<C, V> next = this.f11152e.next();
                    if (!this.f11150c.containsKey(next.getKey())) {
                        this.f11150c.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f11151d.hasNext()) {
                        return m15620b();
                    }
                    this.f11152e = this.f11151d.next().entrySet().iterator();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$e */
    public class C2958e extends StandardTable<R, C, V>.AbstractC2962i<C> {
        public C2958e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return StandardTable.this.createColumnKeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.AbstractC2941e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            xn80.m212111p(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (Iterators.m15946v(next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.AbstractC2941e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            xn80.m212111p(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Iterators.m15950z(iterator());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$f */
    public class C2959f extends Maps.AbstractC2909u<C, Map<R, V>> {

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$f$a */
        public class a extends StandardTable<R, C, V>.AbstractC2962i<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$f$a$a, reason: collision with other inner class name */
            public class C22795a implements adj<C, Map<R, V>> {
                public C22795a() {
                }

                @Override // p153l.adj
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<R, V> apply(C c) {
                    return StandardTable.this.column(c);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!StandardTable.this.containsColumn(entry.getKey())) {
                    return false;
                }
                Map<R, V> map = C2959f.this.get(entry.getKey());
                Objects.requireNonNull(map);
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return Maps.m16083d(StandardTable.this.columnKeySet(), new C22795a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                StandardTable.this.removeColumn(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.AbstractC2941e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                xn80.m212111p(collection);
                return Sets.m16180k(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.AbstractC2941e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                xn80.m212111p(collection);
                boolean z = false;
                for (Object obj : Lists.m15979l(StandardTable.this.columnKeySet().iterator())) {
                    if (!collection.contains(Maps.m16089j(obj, StandardTable.this.column(obj)))) {
                        StandardTable.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.columnKeySet().size();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$f$b */
        public class b extends Maps.C2908t<C, Map<R, V>> {
            public b() {
                super(C2959f.this);
            }

            @Override // com.google.common.collect.Maps.C2908t, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : C2959f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        StandardTable.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.C2908t, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                xn80.m212111p(collection);
                boolean z = false;
                for (Object obj : Lists.m15979l(StandardTable.this.columnKeySet().iterator())) {
                    if (collection.contains(StandardTable.this.column(obj))) {
                        StandardTable.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.C2908t, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                xn80.m212111p(collection);
                boolean z = false;
                for (Object obj : Lists.m15979l(StandardTable.this.columnKeySet().iterator())) {
                    if (!collection.contains(StandardTable.this.column(obj))) {
                        StandardTable.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }
        }

        public C2959f() {
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<C, Map<R, V>>> mo15624a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: c */
        public Collection<Map<R, V>> mo16121c() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(Object obj) {
            if (!StandardTable.this.containsColumn(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.column(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.this.removeColumn(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<C> mo15632h() {
            return StandardTable.this.columnKeySet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$g */
    public class C2960g extends Maps.AbstractC2900l<C, V> {

        /* JADX INFO: renamed from: a */
        public final R f11159a;

        /* JADX INFO: renamed from: b */
        public Map<C, V> f11160b;

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$g$a */
        public class a implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator f11162a;

            public a(Iterator it) {
                this.f11162a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return C2960g.this.m16198e((Map.Entry) this.f11162a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11162a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f11162a.remove();
                C2960g.this.mo16196c();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$g$b */
        public class b extends t2j<C, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Map.Entry f11164a;

            public b(C2960g c2960g, Map.Entry entry) {
                this.f11164a = entry;
            }

            @Override // p153l.v2j
            /* JADX INFO: renamed from: a */
            public Map.Entry<C, V> delegate() {
                return this.f11164a;
            }

            @Override // p153l.t2j, java.util.Map.Entry
            public boolean equals(Object obj) {
                return standardEquals(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p153l.t2j, java.util.Map.Entry
            public V setValue(V v2) {
                return (V) super.setValue(xn80.m212111p(v2));
            }
        }

        public C2960g(R r) {
            this.f11159a = (R) xn80.m212111p(r);
        }

        @Override // com.google.common.collect.Maps.AbstractC2900l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<C, V>> mo15664a() {
            m16197d();
            Map<C, V> map = this.f11160b;
            return map == null ? Iterators.m15935k() : new a(map.entrySet().iterator());
        }

        /* JADX INFO: renamed from: b */
        public Map<C, V> mo16195b() {
            return StandardTable.this.backingMap.get(this.f11159a);
        }

        /* JADX INFO: renamed from: c */
        public void mo16196c() {
            m16197d();
            Map<C, V> map = this.f11160b;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable.this.backingMap.remove(this.f11159a);
            this.f11160b = null;
        }

        @Override // com.google.common.collect.Maps.AbstractC2900l, java.util.AbstractMap, java.util.Map
        public void clear() {
            m16197d();
            Map<C, V> map = this.f11160b;
            if (map != null) {
                map.clear();
            }
            mo16196c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<C, V> map;
            m16197d();
            return (obj == null || (map = this.f11160b) == null || !Maps.m16102w(map, obj)) ? false : true;
        }

        /* JADX INFO: renamed from: d */
        public final void m16197d() {
            Map<C, V> map = this.f11160b;
            if (map == null || (map.isEmpty() && StandardTable.this.backingMap.containsKey(this.f11159a))) {
                this.f11160b = mo16195b();
            }
        }

        /* JADX INFO: renamed from: e */
        public Map.Entry<C, V> m16198e(Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Map<C, V> map;
            m16197d();
            if (obj == null || (map = this.f11160b) == null) {
                return null;
            }
            return (V) Maps.m16103x(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c, V v2) {
            xn80.m212111p(c);
            xn80.m212111p(v2);
            Map<C, V> map = this.f11160b;
            return (map == null || map.isEmpty()) ? (V) StandardTable.this.put(this.f11159a, c, v2) : this.f11160b.put(c, v2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            m16197d();
            Map<C, V> map = this.f11160b;
            if (map == null) {
                return null;
            }
            V v2 = (V) Maps.m16104y(map, obj);
            mo16196c();
            return v2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            m16197d();
            Map<C, V> map = this.f11160b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$h */
    public class C2961h extends Maps.AbstractC2909u<R, Map<C, V>> {

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$h$a */
        public class a extends StandardTable<R, C, V>.AbstractC2962i<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$h$a$a, reason: collision with other inner class name */
            public class C22796a implements adj<R, Map<C, V>> {
                public C22796a() {
                }

                @Override // p153l.adj
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<C, V> apply(R r) {
                    return StandardTable.this.row(r);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && C2991g.m16314c(StandardTable.this.backingMap.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.m16083d(StandardTable.this.backingMap.keySet(), new C22796a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.backingMap.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.backingMap.size();
            }
        }

        public C2961h() {
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<R, Map<C, V>>> mo15624a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.containsRow(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(Object obj) {
            if (!StandardTable.this.containsRow(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.row(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.backingMap.remove(obj);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$i */
    public abstract class AbstractC2962i<T> extends Sets.AbstractC2941e<T> {
        public AbstractC2962i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            StandardTable.this.backingMap.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }
    }

    public StandardTable(Map<R, Map<C, V>> map, b7h0<? extends Map<C, V>> b7h0Var) {
        this.backingMap = map;
        this.factory = b7h0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean containsMapping(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    private Map<C, V> getOrCreate(R r) {
        Map<C, V> map = this.backingMap.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.factory.get();
        this.backingMap.put(r, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<R, V> removeColumn(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeMapping(Object obj, Object obj2, Object obj3) {
        if (!containsMapping(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    @Override // com.google.common.collect.AbstractC2989e
    public Iterator<InterfaceC3002r.a<R, C, V>> cellIterator() {
        return new C2955b();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public Set<InterfaceC3002r.a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public void clear() {
        this.backingMap.clear();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Map<R, V> column(C c) {
        return new C2956c(c);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        C2958e c2958e = new C2958e();
        this.columnKeySet = c2958e;
        return c2958e;
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Map<C, Map<R, V>> columnMap() {
        StandardTable<R, C, V>.C2959f c2959f = this.columnMap;
        if (c2959f != null) {
            return c2959f;
        }
        StandardTable<R, C, V>.C2959f c2959f2 = new C2959f();
        this.columnMap = c2959f2;
        return c2959f2;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean contains(Object obj, Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        while (it.hasNext()) {
            if (Maps.m16102w(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean containsRow(Object obj) {
        return obj != null && Maps.m16102w(this.backingMap, obj);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Iterator<C> createColumnKeyIterator() {
        return new C2957d();
    }

    public Map<R, Map<C, V>> createRowMap() {
        return new C2961h();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public V get(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public V put(R r, C c, V v2) {
        xn80.m212111p(r);
        xn80.m212111p(c);
        xn80.m212111p(v2);
        return getOrCreate(r).put(c, v2);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public V remove(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.m16103x(this.backingMap, obj)) == null) {
            return null;
        }
        V v2 = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return v2;
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Map<C, V> row(R r) {
        return new C2960g(r);
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.rowMap;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapCreateRowMap = createRowMap();
        this.rowMap = mapCreateRowMap;
        return mapCreateRowMap;
    }

    @Override // com.google.common.collect.InterfaceC3002r
    public int size() {
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.AbstractC2989e, com.google.common.collect.InterfaceC3002r
    public Collection<V> values() {
        return super.values();
    }
}
