package com.p046p1.mobile.putong.dbcenter.p057db.bus;

import androidx.annotation.Nullable;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.HashMap;
import java.util.Map;
import p149l.zij0;

/* JADX INFO: loaded from: classes12.dex */
public class ModuleTransMap<T extends ValueObject, V extends ValueObject, K> extends HashMap<K, T> {
    JsonAdapter<T> jsonAdapter;
    Map<K, V> old;

    public ModuleTransMap(JsonAdapter<T> jsonAdapter) {
        this.jsonAdapter = jsonAdapter;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public T get(@Nullable Object obj) {
        V v2 = this.old.get(obj);
        if (v2 == null) {
            return null;
        }
        return (T) zij0.m219048c(v2, this.jsonAdapter);
    }

    public Map<K, V> getOriginMap() {
        return this.old;
    }

    public void setOldList(Map<K, V> map) {
        this.old = map;
    }
}
