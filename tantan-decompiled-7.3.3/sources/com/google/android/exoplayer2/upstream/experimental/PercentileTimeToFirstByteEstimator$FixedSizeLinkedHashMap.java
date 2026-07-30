package com.google.android.exoplayer2.upstream.experimental;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class PercentileTimeToFirstByteEstimator$FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    public PercentileTimeToFirstByteEstimator$FixedSizeLinkedHashMap(int i) {
        this.maxSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.maxSize;
    }
}
