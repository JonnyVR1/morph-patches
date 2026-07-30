package org.eclipse.jetty.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p149l.bz00;

/* JADX INFO: loaded from: classes3.dex */
public class MultiMap<K> implements ConcurrentMap<K, Object>, Serializable {
    private static final long serialVersionUID = -6878723138353851005L;
    ConcurrentMap<K, Object> _cmap;
    Map<K, Object> _map;

    public MultiMap(MultiMap<K> multiMap) {
        if (multiMap._cmap == null) {
            this._map = new HashMap(multiMap._map);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(multiMap._cmap);
        this._cmap = concurrentHashMap;
        this._map = concurrentHashMap;
    }

    public void add(K k, Object obj) {
        Object obj2 = this._map.get(k);
        Object objAdd = LazyList.add(obj2, obj);
        if (obj2 != objAdd) {
            this._map.put(k, objAdd);
        }
    }

    public void addValues(K k, String[] strArr) {
        Object obj = this._map.get(k);
        Object objAddCollection = LazyList.addCollection(obj, Arrays.asList(strArr));
        if (obj != objAddCollection) {
            this._map.put(k, objAddCollection);
        }
    }

    @Override // java.util.Map
    public void clear() {
        this._map.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this._map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this._map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, Object>> entrySet() {
        return this._map.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this._map.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Object obj2 = this._map.get(obj);
        int size = LazyList.size(obj2);
        if (size != 0) {
            return size != 1 ? LazyList.getList(obj2, true) : LazyList.get(obj2, 0);
        }
        return null;
    }

    public String getString(Object obj) {
        Object obj2 = this._map.get(obj);
        int size = LazyList.size(obj2);
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            Object obj3 = LazyList.get(obj2, 0);
            if (obj3 == null) {
                return null;
            }
            return obj3.toString();
        }
        StringBuilder sb = new StringBuilder(128);
        for (int i = 0; i < LazyList.size(obj2); i++) {
            Object obj4 = LazyList.get(obj2, i);
            if (obj4 != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(obj4.toString());
            }
        }
        return sb.toString();
    }

    public Object getValue(Object obj, int i) {
        Object obj2 = this._map.get(obj);
        if (i == 0 && LazyList.size(obj2) == 0) {
            return null;
        }
        return LazyList.get(obj2, i);
    }

    public List getValues(Object obj) {
        return LazyList.getList(this._map.get(obj), true);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this._map.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this._map.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this._map.keySet();
    }

    @Override // java.util.Map
    public Object put(K k, Object obj) {
        return this._map.put(k, LazyList.add(null, obj));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends Object> map) {
        if (!(map instanceof MultiMap)) {
            this._map.putAll(map);
            return;
        }
        for (Map.Entry<? extends K, ? extends Object> entry : map.entrySet()) {
            this._map.put(entry.getKey(), LazyList.clone(entry.getValue()));
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object putIfAbsent(K k, Object obj) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.putIfAbsent(k, obj);
        }
        bz00.m104536a();
        return null;
    }

    public Object putValues(K k, String... strArr) {
        Object objAdd = null;
        for (String str : strArr) {
            objAdd = LazyList.add(objAdd, str);
        }
        return this._map.put(k, objAdd);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.remove(obj, obj2);
        }
        bz00.m104536a();
        return false;
    }

    public boolean removeValue(K k, Object obj) {
        Object objRemove = this._map.get(k);
        int size = LazyList.size(objRemove);
        if (size > 0) {
            objRemove = LazyList.remove(objRemove, obj);
            Map<K, Object> map = this._map;
            if (objRemove == null) {
                map.remove(k);
            } else {
                map.put(k, objRemove);
            }
        }
        return LazyList.size(objRemove) != size;
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(K k, Object obj, Object obj2) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.replace(k, obj, obj2);
        }
        bz00.m104536a();
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this._map.size();
    }

    public String toString() {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        return concurrentMap == null ? this._map.toString() : concurrentMap.toString();
    }

    public Map<K, String[]> toStringArrayMap() {
        HashMap<K, String[]> map = new HashMap<K, String[]>((this._map.size() * 3) / 2) { // from class: org.eclipse.jetty.util.MultiMap.1
            @Override // java.util.AbstractMap
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append('{');
                for (K k : keySet()) {
                    if (sb.length() > 1) {
                        sb.append(',');
                    }
                    sb.append(k);
                    sb.append('=');
                    sb.append(Arrays.asList(get(k)));
                }
                sb.append('}');
                return sb.toString();
            }
        };
        for (Map.Entry<K, Object> entry : this._map.entrySet()) {
            map.put(entry.getKey(), LazyList.toStringArray(entry.getValue()));
        }
        return map;
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this._map.values();
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this._map.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object replace(K k, Object obj) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.replace(k, obj);
        }
        bz00.m104536a();
        return null;
    }

    public Object putValues(K k, List<? extends Object> list) {
        return this._map.put(k, list);
    }

    public void addValues(K k, List<? extends Object> list) {
        Object obj = this._map.get(k);
        Object objAddCollection = LazyList.addCollection(obj, list);
        if (obj != objAddCollection) {
            this._map.put(k, objAddCollection);
        }
    }

    public MultiMap(Map<K, Object> map) {
        if (map instanceof ConcurrentMap) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
            this._cmap = concurrentHashMap;
            this._map = concurrentHashMap;
            return;
        }
        this._map = new HashMap(map);
    }

    public MultiMap() {
        this._map = new HashMap();
    }

    public MultiMap(int i) {
        this._map = new HashMap(i);
    }

    public MultiMap(boolean z) {
        if (z) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            this._cmap = concurrentHashMap;
            this._map = concurrentHashMap;
            return;
        }
        this._map = new HashMap();
    }
}
