package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zzph {
    private final Map zza = new HashMap();

    private zzph() {
    }

    public final zzpd zza() {
        return new zzpf(this, this.zza, (char) 0, (char) 65535);
    }

    public final zzph zzb(char c, String str) {
        this.zza.put(Character.valueOf(c), str);
        return this;
    }

    public /* synthetic */ zzph(zzpg zzpgVar) {
    }
}
