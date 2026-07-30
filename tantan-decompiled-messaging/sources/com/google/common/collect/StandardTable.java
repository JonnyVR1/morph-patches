package com.google.common.collect;

import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p149l.AbstractC19437q7;
import p149l.gaj;
import p149l.oh80;
import p149l.sf80;
import p149l.tyg0;
import p149l.vu40;
import p149l.yzi;

/* JADX INFO: loaded from: classes7.dex */
class StandardTable<R, C, V> extends AbstractC2966e<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final Map<R, Map<C, V>> backingMap;
    private transient Set<C> columnKeySet;
    private transient StandardTable<R, C, V>.C2936f columnMap;
    final tyg0<? extends Map<C, V>> factory;
    private transient Map<R, Map<C, V>> rowMap;

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$b */
    public class C2932b implements Iterator<InterfaceC2979r.a<R, C, V>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<R, Map<C, V>>> f11100a;

        /* JADX INFO: renamed from: b */
        public Map.Entry<R, Map<C, V>> f11101b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<C, V>> f11102c;

        public C2932b() {
            this.f11100a = StandardTable.this.backingMap.entrySet().iterator();
            this.f11102c = Iterators.m15881k();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC2979r.a<R, C, V> next() {
            if (!this.f11102c.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f11100a.next();
                this.f11101b = next;
                this.f11102c = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f11101b);
            Map.Entry<C, V> next2 = this.f11102c.next();
            return Tables.m16174c(this.f11101b.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11100a.hasNext() || this.f11102c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11102c.remove();
            Map.Entry<R, Map<C, V>> entry = this.f11101b;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f11100a.remove();
                this.f11101b = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c */
    public class C2933c extends Maps.AbstractC2886u<R, V> {

        /* JADX INFO: renamed from: d */
        public final C f11104d;

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$a */
        public class a extends Sets.AbstractC2918e<Map.Entry<R, V>> {
            public a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                C2933c.this.m16136d(Predicates.m15415b());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.containsMapping(entry.getKey(), C2933c.this.f11104d, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                C2933c c2933c = C2933c.this;
                return !StandardTable.this.containsColumn(c2933c.f11104d);
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
                return StandardTable.this.removeMapping(entry.getKey(), C2933c.this.f11104d, entry.getValue());
            }

            @Override // com.google.common.collect.Sets.AbstractC2918e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C2933c.this.m16136d(Predicates.m15422i(Predicates.m15420g(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(C2933c.this.f11104d)) {
                        i++;
                    }
                }
                return i;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$b */
        public class b extends AbstractIterator<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: c */
            public final Iterator<Map.Entry<R, Map<C, V>>> f11107c;

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$b$a */
            public class a extends AbstractC19437q7<R, V> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f11109a;

                public a(Map.Entry entry) {
                    this.f11109a = entry;
                }

                @Override // p149l.AbstractC19437q7, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f11109a.getKey();
                }

                @Override // p149l.AbstractC19437q7, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f11109a.getValue()).get(C2933c.this.f11104d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.AbstractC19437q7, java.util.Map.Entry
                public V setValue(V v2) {
                    return (V) vu40.m200060a(((Map) this.f11109a.getValue()).put(C2933c.this.f11104d, sf80.m183894p(v2)));
                }
            }

            public b() {
                this.f11107c = StandardTable.this.backingMap.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> mo15565a() {
                while (this.f11107c.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f11107c.next();
                    if (next.getValue().containsKey(C2933c.this.f11104d)) {
                        return new a(next);
                    }
                }
                return m15566b();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$c */
        public class c extends Maps.C2878m<R, V> {
            public c() {
                super(C2933c.this);
            }

            @Override // com.google.common.collect.Maps.C2878m, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                C2933c c2933c = C2933c.this;
                return StandardTable.this.contains(obj, c2933c.f11104d);
            }

            @Override // com.google.common.collect.Maps.C2878m, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                C2933c c2933c = C2933c.this;
                return StandardTable.this.remove(obj, c2933c.f11104d) != null;
            }

            @Override // com.google.common.collect.Sets.AbstractC2918e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C2933c.this.m16136d(Maps.m16040o(Predicates.m15422i(Predicates.m15420g(collection))));
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$d */
        public class d extends Maps.C2885t<R, V> {
            public d() {
                super(C2933c.this);
            }

            @Override // com.google.common.collect.Maps.C2885t, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                return obj != null && C2933c.this.m16136d(Maps.m16025N(Predicates.m15419f(obj)));
            }

            @Override // com.google.common.collect.Maps.C2885t, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return C2933c.this.m16136d(Maps.m16025N(Predicates.m15420g(collection)));
            }

            @Override // com.google.common.collect.Maps.C2885t, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return C2933c.this.m16136d(Maps.m16025N(Predicates.m15422i(Predicates.m15420g(collection))));
            }
        }

        public C2933c(C c2) {
            this.f11104d = (C) sf80.m183894p(c2);
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<R, V>> mo15570a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: b */
        public Set<R> mo15577g() {
            return new c();
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: c */
        public Collection<V> mo16067c() {
            return new d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.contains(obj, this.f11104d);
        }

        /* JADX INFO: renamed from: d */
        public boolean m16136d(oh80<? super Map.Entry<R, V>> oh80Var) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v2 = value.get(this.f11104d);
                if (v2 != null && oh80Var.apply(Maps.m16035j(next.getKey(), v2))) {
                    value.remove(this.f11104d);
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
            return (V) StandardTable.this.get(obj, this.f11104d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r, V v2) {
            return (V) StandardTable.this.put(r, this.f11104d, v2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return (V) StandardTable.this.remove(obj, this.f11104d);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$d */
    public class C2934d extends AbstractIterator<C> {

        /* JADX INFO: renamed from: c */
        public final Map<C, V> f11113c;

        /* JADX INFO: renamed from: d */
        public final Iterator<Map<C, V>> f11114d;

        /* JADX INFO: renamed from: e */
        public Iterator<Map.Entry<C, V>> f11115e;

        public C2934d() {
            this.f11113c = StandardTable.this.factory.get();
            this.f11114d = StandardTable.this.backingMap.values().iterator();
            this.f11115e = Iterators.m15879i();
        }

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: a */
        public C mo15565a() {
            while (true) {
                if (this.f11115e.hasNext()) {
                    Map.Entry<C, V> next = this.f11115e.next();
                    if (!this.f11113c.containsKey(next.getKey())) {
                        this.f11113c.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f11114d.hasNext()) {
                        return m15566b();
                    }
                    this.f11115e = this.f11114d.next().entrySet().iterator();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$e */
    public class C2935e extends StandardTable<R, C, V>.AbstractC2939i<C> {
        public C2935e() {
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

        @Override // com.google.common.collect.Sets.AbstractC2918e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            sf80.m183894p(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (Iterators.m15892v(next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.AbstractC2918e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            sf80.m183894p(collection);
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
            return Iterators.m15896z(iterator());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$f */
    public class C2936f extends Maps.AbstractC2886u<C, Map<R, V>> {

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$f$a */
        public class a extends StandardTable<R, C, V>.AbstractC2939i<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$f$a$a, reason: collision with other inner class name */
            public class C22679a implements gaj<C, Map<R, V>> {
                public C22679a() {
                }

                @Override // p149l.gaj
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
                Map<R, V> map = C2936f.this.get(entry.getKey());
                Objects.requireNonNull(map);
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return Maps.m16029d(StandardTable.this.columnKeySet(), new C22679a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                StandardTable.this.removeColumn(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.AbstractC2918e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                sf80.m183894p(collection);
                return Sets.m16126k(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.AbstractC2918e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                sf80.m183894p(collection);
                boolean z = false;
                for (Object obj : Lists.m15925l(StandardTable.this.columnKeySet().iterator())) {
                    if (!collection.contains(Maps.m16035j(obj, StandardTable.this.column(obj)))) {
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
        public class b extends Maps.C2885t<C, Map<R, V>> {
            public b() {
                super(C2936f.this);
            }

            @Override // com.google.common.collect.Maps.C2885t, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : C2936f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        StandardTable.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.C2885t, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                sf80.m183894p(collection);
                boolean z = false;
                for (Object obj : Lists.m15925l(StandardTable.this.columnKeySet().iterator())) {
                    if (collection.contains(StandardTable.this.column(obj))) {
                        StandardTable.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.C2885t, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                sf80.m183894p(collection);
                boolean z = false;
                for (Object obj : Lists.m15925l(StandardTable.this.columnKeySet().iterator())) {
                    if (!collection.contains(StandardTable.this.column(obj))) {
                        StandardTable.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }
        }

        public C2936f() {
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<C, Map<R, V>>> mo15570a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: c */
        public Collection<Map<R, V>> mo16067c() {
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

        @Override // com.google.common.collect.Maps.AbstractC2886u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<C> mo15578h() {
            return StandardTable.this.columnKeySet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$g */
    public class C2937g extends Maps.AbstractC2877l<C, V> {

        /* JADX INFO: renamed from: a */
        public final R f11122a;

        /* JADX INFO: renamed from: b */
        public Map<C, V> f11123b;

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$g$a */
        public class a implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator f11125a;

            public a(Iterator it) {
                this.f11125a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return C2937g.this.m16144e((Map.Entry) this.f11125a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11125a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f11125a.remove();
                C2937g.this.mo16142c();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$g$b */
        public class b extends yzi<C, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Map.Entry f11127a;

            public b(C2937g c2937g, Map.Entry entry) {
                this.f11127a = entry;
            }

            @Override // p149l.a0j
            /* JADX INFO: renamed from: a */
            public Map.Entry<C, V> delegate() {
                return this.f11127a;
            }

            @Override // p149l.yzi, java.util.Map.Entry
            public boolean equals(Object obj) {
                return standardEquals(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p149l.yzi, java.util.Map.Entry
            public V setValue(V v2) {
                return (V) super.setValue(sf80.m183894p(v2));
            }
        }

        public C2937g(R r) {
            this.f11122a = (R) sf80.m183894p(r);
        }

        @Override // com.google.common.collect.Maps.AbstractC2877l
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<C, V>> mo15610a() {
            m16143d();
            Map<C, V> map = this.f11123b;
            return map == null ? Iterators.m15881k() : new a(map.entrySet().iterator());
        }

        /* JADX INFO: renamed from: b */
        public Map<C, V> mo16141b() {
            return StandardTable.this.backingMap.get(this.f11122a);
        }

        /* JADX INFO: renamed from: c */
        public void mo16142c() {
            m16143d();
            Map<C, V> map = this.f11123b;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable.this.backingMap.remove(this.f11122a);
            this.f11123b = null;
        }

        @Override // com.google.common.collect.Maps.AbstractC2877l, java.util.AbstractMap, java.util.Map
        public void clear() {
            m16143d();
            Map<C, V> map = this.f11123b;
            if (map != null) {
                map.clear();
            }
            mo16142c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<C, V> map;
            m16143d();
            return (obj == null || (map = this.f11123b) == null || !Maps.m16048w(map, obj)) ? false : true;
        }

        /* JADX INFO: renamed from: d */
        public final void m16143d() {
            Map<C, V> map = this.f11123b;
            if (map == null || (map.isEmpty() && StandardTable.this.backingMap.containsKey(this.f11122a))) {
                this.f11123b = mo16141b();
            }
        }

        /* JADX INFO: renamed from: e */
        public Map.Entry<C, V> m16144e(Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Map<C, V> map;
            m16143d();
            if (obj == null || (map = this.f11123b) == null) {
                return null;
            }
            return (V) Maps.m16049x(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c, V v2) {
            sf80.m183894p(c);
            sf80.m183894p(v2);
            Map<C, V> map = this.f11123b;
            return (map == null || map.isEmpty()) ? (V) StandardTable.this.put(this.f11122a, c, v2) : this.f11123b.put(c, v2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            m16143d();
            Map<C, V> map = this.f11123b;
            if (map == null) {
                return null;
            }
            V v2 = (V) Maps.m16050y(map, obj);
            mo16142c();
            return v2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            m16143d();
            Map<C, V> map = this.f11123b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.StandardTable$h */
    public class C2938h extends Maps.AbstractC2886u<R, Map<C, V>> {

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$h$a */
        public class a extends StandardTable<R, C, V>.AbstractC2939i<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$h$a$a, reason: collision with other inner class name */
            public class C22680a implements gaj<R, Map<C, V>> {
                public C22680a() {
                }

                @Override // p149l.gaj
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
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && C2968g.m16260c(StandardTable.this.backingMap.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.m16029d(StandardTable.this.backingMap.keySet(), new C22680a());
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

        public C2938h() {
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<R, Map<C, V>>> mo15570a() {
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
    public abstract class AbstractC2939i<T> extends Sets.AbstractC2918e<T> {
        public AbstractC2939i() {
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

    public StandardTable(Map<R, Map<C, V>> map, tyg0<? extends Map<C, V>> tyg0Var) {
        this.backingMap = map;
        this.factory = tyg0Var;
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

    @Override // com.google.common.collect.AbstractC2966e
    public Iterator<InterfaceC2979r.a<R, C, V>> cellIterator() {
        return new C2932b();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public Set<InterfaceC2979r.a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public void clear() {
        this.backingMap.clear();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Map<R, V> column(C c) {
        return new C2933c(c);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        C2935e c2935e = new C2935e();
        this.columnKeySet = c2935e;
        return c2935e;
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Map<C, Map<R, V>> columnMap() {
        StandardTable<R, C, V>.C2936f c2936f = this.columnMap;
        if (c2936f != null) {
            return c2936f;
        }
        StandardTable<R, C, V>.C2936f c2936f2 = new C2936f();
        this.columnMap = c2936f2;
        return c2936f2;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean contains(Object obj, Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        while (it.hasNext()) {
            if (Maps.m16048w(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean containsRow(Object obj) {
        return obj != null && Maps.m16048w(this.backingMap, obj);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Iterator<C> createColumnKeyIterator() {
        return new C2934d();
    }

    public Map<R, Map<C, V>> createRowMap() {
        return new C2938h();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public V get(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public V put(R r, C c, V v2) {
        sf80.m183894p(r);
        sf80.m183894p(c);
        sf80.m183894p(v2);
        return getOrCreate(r).put(c, v2);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public V remove(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.m16049x(this.backingMap, obj)) == null) {
            return null;
        }
        V v2 = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return v2;
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Map<C, V> row(R r) {
        return new C2937g(r);
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.rowMap;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapCreateRowMap = createRowMap();
        this.rowMap = mapCreateRowMap;
        return mapCreateRowMap;
    }

    @Override // com.google.common.collect.InterfaceC2979r
    public int size() {
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.AbstractC2966e, com.google.common.collect.InterfaceC2979r
    public Collection<V> values() {
        return super.values();
    }
}
