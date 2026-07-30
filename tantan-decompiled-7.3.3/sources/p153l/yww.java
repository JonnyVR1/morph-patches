package p153l;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class yww<K, V> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public yww<K, V>.C21697b f201875a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public yww<K, V>.C21698c f201876b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public yww<K, V>.C21700e f201877c;

    /* JADX INFO: renamed from: l.yww$a */
    public final class C21696a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final int f201878a;

        /* JADX INFO: renamed from: b */
        public int f201879b;

        /* JADX INFO: renamed from: c */
        public int f201880c;

        /* JADX INFO: renamed from: d */
        public boolean f201881d = false;

        public C21696a(int i) {
            this.f201878a = i;
            this.f201879b = yww.this.mo152247d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f201880c < this.f201879b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            T t = (T) yww.this.mo152245b(this.f201880c, this.f201878a);
            this.f201880c++;
            this.f201881d = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f201881d) {
                wpg0.m207458a();
                return;
            }
            int i = this.f201880c - 1;
            this.f201880c = i;
            this.f201879b--;
            this.f201881d = false;
            yww.this.mo152251h(i);
        }
    }

    /* JADX INFO: renamed from: l.yww$d */
    public final class C21699d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public int f201885a;

        /* JADX INFO: renamed from: c */
        public boolean f201887c = false;

        /* JADX INFO: renamed from: b */
        public int f201886b = -1;

        public C21699d() {
            this.f201885a = yww.this.mo152247d() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                mor.m159308a();
                return null;
            }
            this.f201886b++;
            this.f201887c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f201887c) {
                wtq0.m207906a("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return u16.m193898c(entry.getKey(), yww.this.mo152245b(this.f201886b, 0)) && u16.m193898c(entry.getValue(), yww.this.mo152245b(this.f201886b, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f201887c) {
                return (K) yww.this.mo152245b(this.f201886b, 0);
            }
            wtq0.m207906a("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f201887c) {
                return (V) yww.this.mo152245b(this.f201886b, 1);
            }
            wtq0.m207906a("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f201886b < this.f201885a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f201887c) {
                wtq0.m207906a("This container does not support retaining Map.Entry objects");
                return 0;
            }
            Object objMo152245b = yww.this.mo152245b(this.f201886b, 0);
            Object objMo152245b2 = yww.this.mo152245b(this.f201886b, 1);
            return (objMo152245b == null ? 0 : objMo152245b.hashCode()) ^ (objMo152245b2 != null ? objMo152245b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f201887c) {
                wpg0.m207458a();
                return;
            }
            yww.this.mo152251h(this.f201886b);
            this.f201886b--;
            this.f201885a--;
            this.f201887c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (this.f201887c) {
                return (V) yww.this.mo152252i(this.f201886b, v2);
            }
            wtq0.m207906a("This container does not support retaining Map.Entry objects");
            return null;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> boolean m217654j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static <T> boolean m217655k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static <K, V> boolean m217656o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: p */
    public static <K, V> boolean m217657p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo152244a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo152245b(int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract Map<K, V> mo152246c();

    /* JADX INFO: renamed from: d */
    public abstract int mo152247d();

    /* JADX INFO: renamed from: e */
    public abstract int mo152248e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo152249f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo152250g(K k, V v2);

    /* JADX INFO: renamed from: h */
    public abstract void mo152251h(int i);

    /* JADX INFO: renamed from: i */
    public abstract V mo152252i(int i, V v2);

    /* JADX INFO: renamed from: l */
    public Set<Map.Entry<K, V>> m217658l() {
        if (this.f201875a == null) {
            this.f201875a = new C21697b();
        }
        return this.f201875a;
    }

    /* JADX INFO: renamed from: m */
    public Set<K> m217659m() {
        if (this.f201876b == null) {
            this.f201876b = new C21698c();
        }
        return this.f201876b;
    }

    /* JADX INFO: renamed from: n */
    public Collection<V> m217660n() {
        if (this.f201877c == null) {
            this.f201877c = new C21700e();
        }
        return this.f201877c;
    }

    /* JADX INFO: renamed from: q */
    public Object[] m217661q(int i) {
        int iMo152247d = mo152247d();
        Object[] objArr = new Object[iMo152247d];
        for (int i2 = 0; i2 < iMo152247d; i2++) {
            objArr[i2] = mo152245b(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: r */
    public <T> T[] m217662r(T[] tArr, int i) {
        int iMo152247d = mo152247d();
        if (tArr.length < iMo152247d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo152247d));
        }
        for (int i2 = 0; i2 < iMo152247d; i2++) {
            tArr[i2] = mo152245b(i2, i);
        }
        if (tArr.length > iMo152247d) {
            tArr[iMo152247d] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: l.yww$b */
    public final class C21697b implements Set<Map.Entry<K, V>> {
        public C21697b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo152247d = yww.this.mo152247d();
            for (Map.Entry<K, V> entry : collection) {
                yww.this.mo152250g(entry.getKey(), entry.getValue());
            }
            return iMo152247d != yww.this.mo152247d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            yww.this.mo152244a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo152248e = yww.this.mo152248e(entry.getKey());
            if (iMo152248e < 0) {
                return false;
            }
            return u16.m193898c(yww.this.mo152245b(iMo152248e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return yww.m217655k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo152247d = yww.this.mo152247d() - 1; iMo152247d >= 0; iMo152247d--) {
                Object objMo152245b = yww.this.mo152245b(iMo152247d, 0);
                Object objMo152245b2 = yww.this.mo152245b(iMo152247d, 1);
                iHashCode += (objMo152245b == null ? 0 : objMo152245b.hashCode()) ^ (objMo152245b2 == null ? 0 : objMo152245b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return yww.this.mo152247d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C21699d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return yww.this.mo152247d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: l.yww$c */
    public final class C21698c implements Set<K> {
        public C21698c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            yww.this.mo152244a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return yww.this.mo152248e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return yww.m217654j(yww.this.mo152246c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return yww.m217655k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo152247d = yww.this.mo152247d() - 1; iMo152247d >= 0; iMo152247d--) {
                Object objMo152245b = yww.this.mo152245b(iMo152247d, 0);
                iHashCode += objMo152245b == null ? 0 : objMo152245b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return yww.this.mo152247d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C21696a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo152248e = yww.this.mo152248e(obj);
            if (iMo152248e < 0) {
                return false;
            }
            yww.this.mo152251h(iMo152248e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return yww.m217656o(yww.this.mo152246c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return yww.m217657p(yww.this.mo152246c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return yww.this.mo152247d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return yww.this.m217661q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) yww.this.m217662r(tArr, 0);
        }
    }

    /* JADX INFO: renamed from: l.yww$e */
    public final class C21700e implements Collection<V> {
        public C21700e() {
        }

        @Override // java.util.Collection
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            yww.this.mo152244a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return yww.this.mo152249f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return yww.this.mo152247d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C21696a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo152249f = yww.this.mo152249f(obj);
            if (iMo152249f < 0) {
                return false;
            }
            yww.this.mo152251h(iMo152249f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iMo152247d = yww.this.mo152247d();
            int i = 0;
            boolean z = false;
            while (i < iMo152247d) {
                if (collection.contains(yww.this.mo152245b(i, 1))) {
                    yww.this.mo152251h(i);
                    i--;
                    iMo152247d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iMo152247d = yww.this.mo152247d();
            int i = 0;
            boolean z = false;
            while (i < iMo152247d) {
                if (!collection.contains(yww.this.mo152245b(i, 1))) {
                    yww.this.mo152251h(i);
                    i--;
                    iMo152247d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return yww.this.mo152247d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return yww.this.m217661q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) yww.this.m217662r(tArr, 1);
        }
    }
}
