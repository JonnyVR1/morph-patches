package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzb extends LinkedHashMap {
    final /* synthetic */ C2076a zza;

    public zzb(C2076a c2076a) {
        this.zza = c2076a;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.zza) {
            try {
                int size = size();
                C2076a c2076a = this.zza;
                if (size <= c2076a.f9741a) {
                    return false;
                }
                c2076a.f9746f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                return size() > this.zza.f9741a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
