package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p153l.jx2;
import p153l.k350;
import p153l.k950;
import p153l.s2j;
import p153l.t2j;
import p153l.wtq0;
import p153l.xn80;
import p153l.z2j;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractBiMap<K, V> extends s2j<K, V> implements jx2<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient Map<K, V> delegate;
    private transient Set<Map.Entry<K, V>> entrySet;
    transient AbstractBiMap<V, K> inverse;
    private transient Set<K> keySet;
    private transient Set<V> valueSet;

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        public Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap, null);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            setInverse((AbstractBiMap) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        @Override // com.google.common.collect.AbstractBiMap
        public K checkKey(K k) {
            return this.inverse.checkValue(k);
        }

        @Override // com.google.common.collect.AbstractBiMap
        public V checkValue(V v2) {
            return this.inverse.checkKey(v2);
        }

        @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, p153l.v2j
        public /* bridge */ /* synthetic */ Object delegate() {
            return super.delegate();
        }

        public Object readResolve() {
            return inverse().inverse();
        }

        @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map, p153l.jx2
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$a */
    public class C2736a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, V> f10798a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator f10799b;

        public C2736a(Iterator it) {
            this.f10799b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f10799b.next();
            this.f10798a = entry;
            return new C2737b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10799b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.f10798a;
            if (entry == null) {
                wtq0.m207906a("no calls to next() since the last call to remove()");
                return;
            }
            V value = entry.getValue();
            this.f10799b.remove();
            AbstractBiMap.this.removeFromInverseMap(value);
            this.f10798a = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$b */
    public class C2737b extends t2j<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map.Entry<K, V> f10801a;

        public C2737b(Map.Entry<K, V> entry) {
            this.f10801a = entry;
        }

        @Override // p153l.v2j
        /* JADX INFO: renamed from: a */
        public Map.Entry<K, V> delegate() {
            return this.f10801a;
        }

        @Override // p153l.t2j, java.util.Map.Entry
        public V setValue(V v2) {
            AbstractBiMap.this.checkValue(v2);
            xn80.m212118w(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (k950.m148863a(v2, getValue())) {
                return v2;
            }
            xn80.m212106k(!AbstractBiMap.this.containsValue(v2), "value already present: %s", v2);
            V value = this.f10801a.setValue(v2);
            xn80.m212118w(k950.m148863a(v2, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.this.updateInverseMap(getKey(), true, value, v2);
            return value;
        }
    }

    private AbstractBiMap(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
        this.delegate = map;
        this.inverse = abstractBiMap;
    }

    private V putInBothMaps(K k, V v2, boolean z) {
        checkKey(k);
        checkValue(v2);
        boolean zContainsKey = containsKey(k);
        if (zContainsKey && k950.m148863a(v2, get(k))) {
            return v2;
        }
        if (z) {
            inverse().remove(v2);
        } else {
            xn80.m212106k(!containsValue(v2), "value already present: %s", v2);
        }
        V vPut = this.delegate.put(k, v2);
        updateInverseMap(k, zContainsKey, vPut, v2);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeFromBothMaps(Object obj) {
        V v2 = (V) k350.m147997a(this.delegate.remove(obj));
        removeFromInverseMap(v2);
        return v2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromInverseMap(V v2) {
        this.inverse.delegate.remove(v2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void updateInverseMap(K k, boolean z, V v2, V v3) {
        if (z) {
            removeFromInverseMap(k350.m147997a(v2));
        }
        this.inverse.delegate.put(v3, k);
    }

    public K checkKey(K k) {
        return k;
    }

    public V checkValue(V v2) {
        return v2;
    }

    @Override // p153l.s2j, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // p153l.s2j, java.util.Map
    public boolean containsValue(Object obj) {
        return this.inverse.containsKey(obj);
    }

    @Override // p153l.s2j, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C2738c c2738c = new C2738c(this, null);
        this.entrySet = c2738c;
        return c2738c;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new C2736a(this.delegate.entrySet().iterator());
    }

    @Override // p153l.jx2
    public V forcePut(K k, V v2) {
        return putInBothMaps(k, v2, true);
    }

    @Override // p153l.jx2
    public jx2<V, K> inverse() {
        return this.inverse;
    }

    @Override // p153l.s2j, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C2739d c2739d = new C2739d(this, null);
        this.keySet = c2739d;
        return c2739d;
    }

    public AbstractBiMap<V, K> makeInverse(Map<V, K> map) {
        return new Inverse(map, this);
    }

    @Override // p153l.s2j, java.util.Map
    public V put(K k, V v2) {
        return putInBothMaps(k, v2, false);
    }

    @Override // p153l.s2j, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p153l.s2j, java.util.Map
    public V remove(Object obj) {
        if (containsKey(obj)) {
            return removeFromBothMaps(obj);
        }
        return null;
    }

    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
        xn80.m212117v(this.delegate == null);
        xn80.m212117v(this.inverse == null);
        xn80.m212099d(map.isEmpty());
        xn80.m212099d(map2.isEmpty());
        xn80.m212099d(map != map2);
        this.delegate = map;
        this.inverse = makeInverse(map2);
    }

    public void setInverse(AbstractBiMap<V, K> abstractBiMap) {
        this.inverse = abstractBiMap;
    }

    @Override // p153l.s2j, java.util.Map, p153l.jx2
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        C2740e c2740e = new C2740e(this, null);
        this.valueSet = c2740e;
        return c2740e;
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$c */
    public class C2738c extends z2j<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Set<Map.Entry<K, V>> f10803a;

        public C2738c() {
            this.f10803a = AbstractBiMap.this.delegate.entrySet();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return Maps.m16085f(delegate(), obj);
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // p153l.l2j, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.entrySetIterator();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.f10803a.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((AbstractBiMap) AbstractBiMap.this.inverse).delegate.remove(entry.getValue());
            this.f10803a.remove(entry);
            return true;
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // p153l.z2j, p153l.l2j, p153l.v2j
        public Set<Map.Entry<K, V>> delegate() {
            return this.f10803a;
        }

        public /* synthetic */ C2738c(AbstractBiMap abstractBiMap, C2736a c2736a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$e */
    public class C2740e extends z2j<V> {

        /* JADX INFO: renamed from: a */
        public final Set<V> f10806a;

        public C2740e() {
            this.f10806a = AbstractBiMap.this.inverse.keySet();
        }

        @Override // p153l.l2j, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return Maps.m16077L(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // p153l.v2j
        public String toString() {
            return standardToString();
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // p153l.z2j, p153l.l2j, p153l.v2j
        public Set<V> delegate() {
            return this.f10806a;
        }

        public /* synthetic */ C2740e(AbstractBiMap abstractBiMap, C2736a c2736a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$d */
    public class C2739d extends z2j<K> {
        public C2739d() {
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // p153l.z2j, p153l.l2j, p153l.v2j
        public Set<K> delegate() {
            return AbstractBiMap.this.delegate.keySet();
        }

        @Override // p153l.l2j, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.m16092m(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap.this.removeFromBothMaps(obj);
            return true;
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public /* synthetic */ C2739d(AbstractBiMap abstractBiMap, C2736a c2736a) {
            this();
        }
    }

    @Override // p153l.s2j, p153l.v2j
    public Map<K, V> delegate() {
        return this.delegate;
    }

    public AbstractBiMap(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    public /* synthetic */ AbstractBiMap(Map map, AbstractBiMap abstractBiMap, C2736a c2736a) {
        this(map, abstractBiMap);
    }
}
