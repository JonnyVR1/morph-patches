package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
final class zzbsv {
    private static final Logger zza = Logger.getLogger(zzbsv.class.getName());

    private zzbsv() {
    }

    public static zzbcf zza(List list) {
        return zzbar.zzc(zzc(list));
    }

    public static zzbcf zzb(List list) {
        return zzbar.zzc(zzc(list));
    }

    private static byte[][] zzc(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zzbtt zzbttVar = (zzbtt) it.next();
            bArr[i] = zzbttVar.zzh.zzp();
            bArr[i + 1] = zzbttVar.zzi.zzp();
            i += 2;
        }
        return zzbqu.zzb(bArr);
    }
}
