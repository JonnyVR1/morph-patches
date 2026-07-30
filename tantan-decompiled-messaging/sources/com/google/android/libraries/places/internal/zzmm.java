package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class zzmm {
    private final String zza;
    private final zzmk zzb;
    private zzmk zzc;
    private boolean zzd;

    public /* synthetic */ zzmm(String str, zzml zzmlVar) {
        zzmk zzmkVar = new zzmk();
        this.zzb = zzmkVar;
        this.zzc = zzmkVar;
        this.zzd = false;
        str.getClass();
        this.zza = str;
    }

    private final zzmk zzh() {
        zzmk zzmkVar = new zzmk();
        this.zzc.zzc = zzmkVar;
        this.zzc = zzmkVar;
        return zzmkVar;
    }

    private final zzmm zzi(String str, Object obj) {
        zzmj zzmjVar = new zzmj(null);
        this.zzc.zzc = zzmjVar;
        this.zzc = zzmjVar;
        zzmjVar.zzb = obj;
        zzmjVar.zza = str;
        return this;
    }

    public final String toString() {
        boolean z = this.zzd;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        String str = "";
        for (zzmk zzmkVar = this.zzb.zzc; zzmkVar != null; zzmkVar = zzmkVar.zzc) {
            boolean z2 = zzmkVar instanceof zzmj;
            Object obj = zzmkVar.zzb;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = zzmkVar.zza;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzmm zza(String str, double d) {
        zzi("backoffMultiplier", String.valueOf(d));
        return this;
    }

    public final zzmm zzb(String str, int i) {
        zzi(str, String.valueOf(i));
        return this;
    }

    public final zzmm zzc(String str, long j) {
        zzi(str, String.valueOf(j));
        return this;
    }

    public final zzmm zzd(String str, Object obj) {
        zzmk zzmkVarZzh = zzh();
        zzmkVarZzh.zzb = obj;
        zzmkVarZzh.zza = str;
        return this;
    }

    public final zzmm zze(String str, boolean z) {
        zzi(str, String.valueOf(z));
        return this;
    }

    public final zzmm zzf(Object obj) {
        zzh().zzb = obj;
        return this;
    }

    public final zzmm zzg() {
        this.zzd = true;
        return this;
    }
}
