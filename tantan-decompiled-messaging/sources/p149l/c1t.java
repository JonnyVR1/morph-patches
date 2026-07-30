package p149l;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
public class c1t {
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static <K, V> V m104876a(Map<K, V> map, K k, V v2) {
        return map.getOrDefault(k, v2);
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> void m104877b(Map<K, V> map, K k, V v2, x9j<V, V, V> x9jVar) {
        if (map.containsKey(k)) {
            map.put(k, x9jVar.call(map.get(k), v2));
        } else {
            map.put(k, v2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static <K extends Comparable<K>, V> TreeMap<K, V> m104878c(TreeMap<K, V> treeMap, K k, K k2) {
        if (k.compareTo(k2) > 0) {
            return m104878c(treeMap, k2, k);
        }
        TreeMap<K, V> treeMap2 = new TreeMap<>();
        for (Map.Entry<K, V> entry : treeMap.entrySet()) {
            if (entry.getKey().compareTo(k) >= 0 && entry.getKey().compareTo(k2) <= 0) {
                treeMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return treeMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static <K, V> void m104879d(Map<K, V> map, int i, boolean z) {
        if (map.size() <= i) {
            return;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        if (!z) {
            Collections.reverse(arrayList);
        }
        map.clear();
        for (int i2 = 0; i2 < i; i2++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i2);
            map.put(entry.getKey(), entry.getValue());
        }
    }
}
