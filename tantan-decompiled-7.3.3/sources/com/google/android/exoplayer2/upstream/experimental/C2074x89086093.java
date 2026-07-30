package com.google.android.exoplayer2.upstream.experimental;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.experimental.ExponentialWeightedAverageTimeToFirstByteEstimator$FixedSizeLinkedHashMap */
/* JADX INFO: loaded from: classes6.dex */
class C2074x89086093<K, V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    public C2074x89086093(int i) {
        this.maxSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.maxSize;
    }
}
