package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zzkc extends LinkedHashMap {
    public zzkc(int i, float f, boolean z) {
        super(16, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
