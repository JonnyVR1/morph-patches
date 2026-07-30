package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzb extends LinkedHashMap {
    final /* synthetic */ C2099a zza;

    public zzb(C2099a c2099a) {
        this.zza = c2099a;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.zza) {
            try {
                int size = size();
                C2099a c2099a = this.zza;
                if (size <= c2099a.f9778a) {
                    return false;
                }
                c2099a.f9783f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                return size() > this.zza.f9778a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
