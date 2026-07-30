package com.momo.pipline.meidautil;

import androidx.annotation.NonNull;
import java.util.concurrent.ConcurrentHashMap;
import p153l.oq70;

/* JADX INFO: loaded from: classes8.dex */
public class PipelineConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V put(@NonNull K k, @NonNull V v2) {
        oq70.m168791d().m168794b("Pipeline_Normal_pip->PIPLINE", "put MapSize" + size() + ",key:" + k + ",value:" + v2.toString());
        return (V) super.put(k, v2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        oq70.m168791d().m168794b("Pipeline_Normal_pip->PIPLINE", "remove MapSize" + size() + ",key:" + obj + ",value:" + obj2.toString());
        return super.remove(obj, obj2);
    }
}
