package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p149l.e0j;
import p149l.qkq0;
import p149l.sf80;
import p149l.tw2;
import p149l.v050;
import p149l.vu40;
import p149l.xzi;
import p149l.yzi;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractBiMap<K, V> extends xzi<K, V> implements tw2<K, V>, Serializable {
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

        @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, p149l.a0j
        public /* bridge */ /* synthetic */ Object delegate() {
            return super.delegate();
        }

        public Object readResolve() {
            return inverse().inverse();
        }

        @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map, p149l.tw2
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$a */
    public class C2713a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, V> f10761a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator f10762b;

        public C2713a(Iterator it) {
            this.f10762b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f10762b.next();
            this.f10761a = entry;
            return new C2714b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10762b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.f10761a;
            if (entry == null) {
                qkq0.m175383a("no calls to next() since the last call to remove()");
                return;
            }
            V value = entry.getValue();
            this.f10762b.remove();
            AbstractBiMap.this.removeFromInverseMap(value);
            this.f10761a = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$b */
    public class C2714b extends yzi<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map.Entry<K, V> f10764a;

        public C2714b(Map.Entry<K, V> entry) {
            this.f10764a = entry;
        }

        @Override // p149l.a0j
        /* JADX INFO: renamed from: a */
        public Map.Entry<K, V> delegate() {
            return this.f10764a;
        }

        @Override // p149l.yzi, java.util.Map.Entry
        public V setValue(V v2) {
            AbstractBiMap.this.checkValue(v2);
            sf80.m183901w(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (v050.m196470a(v2, getValue())) {
                return v2;
            }
            sf80.m183889k(!AbstractBiMap.this.containsValue(v2), "value already present: %s", v2);
            V value = this.f10764a.setValue(v2);
            sf80.m183901w(v050.m196470a(v2, AbstractBiMap.this.get(getKey())), "entry no longer in map");
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
        if (zContainsKey && v050.m196470a(v2, get(k))) {
            return v2;
        }
        if (z) {
            inverse().remove(v2);
        } else {
            sf80.m183889k(!containsValue(v2), "value already present: %s", v2);
        }
        V vPut = this.delegate.put(k, v2);
        updateInverseMap(k, zContainsKey, vPut, v2);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeFromBothMaps(Object obj) {
        V v2 = (V) vu40.m200060a(this.delegate.remove(obj));
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
            removeFromInverseMap(vu40.m200060a(v2));
        }
        this.inverse.delegate.put(v3, k);
    }

    public K checkKey(K k) {
        return k;
    }

    public V checkValue(V v2) {
        return v2;
    }

    @Override // p149l.xzi, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // p149l.xzi, java.util.Map
    public boolean containsValue(Object obj) {
        return this.inverse.containsKey(obj);
    }

    @Override // p149l.xzi, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C2715c c2715c = new C2715c(this, null);
        this.entrySet = c2715c;
        return c2715c;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new C2713a(this.delegate.entrySet().iterator());
    }

    @Override // p149l.tw2
    public V forcePut(K k, V v2) {
        return putInBothMaps(k, v2, true);
    }

    @Override // p149l.tw2
    public tw2<V, K> inverse() {
        return this.inverse;
    }

    @Override // p149l.xzi, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C2716d c2716d = new C2716d(this, null);
        this.keySet = c2716d;
        return c2716d;
    }

    public AbstractBiMap<V, K> makeInverse(Map<V, K> map) {
        return new Inverse(map, this);
    }

    @Override // p149l.xzi, java.util.Map
    public V put(K k, V v2) {
        return putInBothMaps(k, v2, false);
    }

    @Override // p149l.xzi, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p149l.xzi, java.util.Map
    public V remove(Object obj) {
        if (containsKey(obj)) {
            return removeFromBothMaps(obj);
        }
        return null;
    }

    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
        sf80.m183900v(this.delegate == null);
        sf80.m183900v(this.inverse == null);
        sf80.m183882d(map.isEmpty());
        sf80.m183882d(map2.isEmpty());
        sf80.m183882d(map != map2);
        this.delegate = map;
        this.inverse = makeInverse(map2);
    }

    public void setInverse(AbstractBiMap<V, K> abstractBiMap) {
        this.inverse = abstractBiMap;
    }

    @Override // p149l.xzi, java.util.Map, p149l.tw2
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        C2717e c2717e = new C2717e(this, null);
        this.valueSet = c2717e;
        return c2717e;
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$c */
    public class C2715c extends e0j<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Set<Map.Entry<K, V>> f10766a;

        public C2715c() {
            this.f10766a = AbstractBiMap.this.delegate.entrySet();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return Maps.m16031f(delegate(), obj);
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // p149l.qzi, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.entrySetIterator();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.f10766a.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((AbstractBiMap) AbstractBiMap.this.inverse).delegate.remove(entry.getValue());
            this.f10766a.remove(entry);
            return true;
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // p149l.e0j, p149l.qzi, p149l.a0j
        public Set<Map.Entry<K, V>> delegate() {
            return this.f10766a;
        }

        public /* synthetic */ C2715c(AbstractBiMap abstractBiMap, C2713a c2713a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$e */
    public class C2717e extends e0j<V> {

        /* JADX INFO: renamed from: a */
        public final Set<V> f10769a;

        public C2717e() {
            this.f10769a = AbstractBiMap.this.inverse.keySet();
        }

        @Override // p149l.qzi, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return Maps.m16023L(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // p149l.a0j
        public String toString() {
            return standardToString();
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // p149l.e0j, p149l.qzi, p149l.a0j
        public Set<V> delegate() {
            return this.f10769a;
        }

        public /* synthetic */ C2717e(AbstractBiMap abstractBiMap, C2713a c2713a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractBiMap$d */
    public class C2716d extends e0j<K> {
        public C2716d() {
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // p149l.e0j, p149l.qzi, p149l.a0j
        public Set<K> delegate() {
            return AbstractBiMap.this.delegate.keySet();
        }

        @Override // p149l.qzi, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.m16038m(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap.this.removeFromBothMaps(obj);
            return true;
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public /* synthetic */ C2716d(AbstractBiMap abstractBiMap, C2713a c2713a) {
            this();
        }
    }

    @Override // p149l.xzi, p149l.a0j
    public Map<K, V> delegate() {
        return this.delegate;
    }

    public AbstractBiMap(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    public /* synthetic */ AbstractBiMap(Map map, AbstractBiMap abstractBiMap, C2713a c2713a) {
        this(map, abstractBiMap);
    }
}
