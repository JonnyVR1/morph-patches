package p149l;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ztw<K, V> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public ztw<K, V>.C21764b f204760a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public ztw<K, V>.C21765c f204761b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ztw<K, V>.C21767e f204762c;

    /* JADX INFO: renamed from: l.ztw$a */
    public final class C21763a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final int f204763a;

        /* JADX INFO: renamed from: b */
        public int f204764b;

        /* JADX INFO: renamed from: c */
        public int f204765c;

        /* JADX INFO: renamed from: d */
        public boolean f204766d = false;

        public C21763a(int i) {
            this.f204763a = i;
            this.f204764b = ztw.this.mo114147d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f204765c < this.f204764b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            T t = (T) ztw.this.mo114145b(this.f204765c, this.f204763a);
            this.f204765c++;
            this.f204766d = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f204766d) {
                ohg0.m164364a();
                return;
            }
            int i = this.f204765c - 1;
            this.f204765c = i;
            this.f204764b--;
            this.f204766d = false;
            ztw.this.mo114151h(i);
        }
    }

    /* JADX INFO: renamed from: l.ztw$d */
    public final class C21766d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public int f204770a;

        /* JADX INFO: renamed from: c */
        public boolean f204772c = false;

        /* JADX INFO: renamed from: b */
        public int f204771b = -1;

        public C21766d() {
            this.f204770a = ztw.this.mo114147d() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                lmr.m150601a();
                return null;
            }
            this.f204771b++;
            this.f204772c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f204772c) {
                qkq0.m175383a("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return p06.m166913c(entry.getKey(), ztw.this.mo114145b(this.f204771b, 0)) && p06.m166913c(entry.getValue(), ztw.this.mo114145b(this.f204771b, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f204772c) {
                return (K) ztw.this.mo114145b(this.f204771b, 0);
            }
            qkq0.m175383a("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f204772c) {
                return (V) ztw.this.mo114145b(this.f204771b, 1);
            }
            qkq0.m175383a("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f204771b < this.f204770a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f204772c) {
                qkq0.m175383a("This container does not support retaining Map.Entry objects");
                return 0;
            }
            Object objMo114145b = ztw.this.mo114145b(this.f204771b, 0);
            Object objMo114145b2 = ztw.this.mo114145b(this.f204771b, 1);
            return (objMo114145b == null ? 0 : objMo114145b.hashCode()) ^ (objMo114145b2 != null ? objMo114145b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f204772c) {
                ohg0.m164364a();
                return;
            }
            ztw.this.mo114151h(this.f204771b);
            this.f204771b--;
            this.f204770a--;
            this.f204772c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (this.f204772c) {
                return (V) ztw.this.mo114152i(this.f204771b, v2);
            }
            qkq0.m175383a("This container does not support retaining Map.Entry objects");
            return null;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> boolean m220143j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static <T> boolean m220144k(Set<T> set, Object obj) {
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
    public static <K, V> boolean m220145o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: p */
    public static <K, V> boolean m220146p(Map<K, V> map, Collection<?> collection) {
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
    public abstract void mo114144a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo114145b(int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract Map<K, V> mo114146c();

    /* JADX INFO: renamed from: d */
    public abstract int mo114147d();

    /* JADX INFO: renamed from: e */
    public abstract int mo114148e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo114149f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo114150g(K k, V v2);

    /* JADX INFO: renamed from: h */
    public abstract void mo114151h(int i);

    /* JADX INFO: renamed from: i */
    public abstract V mo114152i(int i, V v2);

    /* JADX INFO: renamed from: l */
    public Set<Map.Entry<K, V>> m220147l() {
        if (this.f204760a == null) {
            this.f204760a = new C21764b();
        }
        return this.f204760a;
    }

    /* JADX INFO: renamed from: m */
    public Set<K> m220148m() {
        if (this.f204761b == null) {
            this.f204761b = new C21765c();
        }
        return this.f204761b;
    }

    /* JADX INFO: renamed from: n */
    public Collection<V> m220149n() {
        if (this.f204762c == null) {
            this.f204762c = new C21767e();
        }
        return this.f204762c;
    }

    /* JADX INFO: renamed from: q */
    public Object[] m220150q(int i) {
        int iMo114147d = mo114147d();
        Object[] objArr = new Object[iMo114147d];
        for (int i2 = 0; i2 < iMo114147d; i2++) {
            objArr[i2] = mo114145b(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: r */
    public <T> T[] m220151r(T[] tArr, int i) {
        int iMo114147d = mo114147d();
        if (tArr.length < iMo114147d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo114147d));
        }
        for (int i2 = 0; i2 < iMo114147d; i2++) {
            tArr[i2] = mo114145b(i2, i);
        }
        if (tArr.length > iMo114147d) {
            tArr[iMo114147d] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: l.ztw$b */
    public final class C21764b implements Set<Map.Entry<K, V>> {
        public C21764b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo114147d = ztw.this.mo114147d();
            for (Map.Entry<K, V> entry : collection) {
                ztw.this.mo114150g(entry.getKey(), entry.getValue());
            }
            return iMo114147d != ztw.this.mo114147d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ztw.this.mo114144a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo114148e = ztw.this.mo114148e(entry.getKey());
            if (iMo114148e < 0) {
                return false;
            }
            return p06.m166913c(ztw.this.mo114145b(iMo114148e, 1), entry.getValue());
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
            return ztw.m220144k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo114147d = ztw.this.mo114147d() - 1; iMo114147d >= 0; iMo114147d--) {
                Object objMo114145b = ztw.this.mo114145b(iMo114147d, 0);
                Object objMo114145b2 = ztw.this.mo114145b(iMo114147d, 1);
                iHashCode += (objMo114145b == null ? 0 : objMo114145b.hashCode()) ^ (objMo114145b2 == null ? 0 : objMo114145b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ztw.this.mo114147d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C21766d();
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
            return ztw.this.mo114147d();
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

    /* JADX INFO: renamed from: l.ztw$c */
    public final class C21765c implements Set<K> {
        public C21765c() {
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
            ztw.this.mo114144a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ztw.this.mo114148e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return ztw.m220143j(ztw.this.mo114146c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return ztw.m220144k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo114147d = ztw.this.mo114147d() - 1; iMo114147d >= 0; iMo114147d--) {
                Object objMo114145b = ztw.this.mo114145b(iMo114147d, 0);
                iHashCode += objMo114145b == null ? 0 : objMo114145b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ztw.this.mo114147d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C21763a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo114148e = ztw.this.mo114148e(obj);
            if (iMo114148e < 0) {
                return false;
            }
            ztw.this.mo114151h(iMo114148e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return ztw.m220145o(ztw.this.mo114146c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return ztw.m220146p(ztw.this.mo114146c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return ztw.this.mo114147d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return ztw.this.m220150q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ztw.this.m220151r(tArr, 0);
        }
    }

    /* JADX INFO: renamed from: l.ztw$e */
    public final class C21767e implements Collection<V> {
        public C21767e() {
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
            ztw.this.mo114144a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return ztw.this.mo114149f(obj) >= 0;
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
            return ztw.this.mo114147d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C21763a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo114149f = ztw.this.mo114149f(obj);
            if (iMo114149f < 0) {
                return false;
            }
            ztw.this.mo114151h(iMo114149f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iMo114147d = ztw.this.mo114147d();
            int i = 0;
            boolean z = false;
            while (i < iMo114147d) {
                if (collection.contains(ztw.this.mo114145b(i, 1))) {
                    ztw.this.mo114151h(i);
                    i--;
                    iMo114147d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iMo114147d = ztw.this.mo114147d();
            int i = 0;
            boolean z = false;
            while (i < iMo114147d) {
                if (!collection.contains(ztw.this.mo114145b(i, 1))) {
                    ztw.this.mo114151h(i);
                    i--;
                    iMo114147d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return ztw.this.mo114147d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return ztw.this.m220150q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ztw.this.m220151r(tArr, 1);
        }
    }
}
