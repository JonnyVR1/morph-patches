package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbqh {
    private zzbqh() {
    }

    public static Set zza(Map map) {
        Set setZzc = zzc(map, "nonFatalStatusCodes");
        if (setZzc == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(zzbdj.class));
        }
        zzng.zza(!setZzc.contains(zzbdj.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setZzc;
    }

    public static Set zzb(Map map) {
        Set setZzc = zzc(map, "retryableStatusCodes");
        zzng.zza(setZzc != null, "%s is required in retry policy", "retryableStatusCodes");
        zzng.zza(true ^ setZzc.contains(zzbdj.OK), "%s must not contain OK", "retryableStatusCodes");
        return setZzc;
    }

    private static Set zzc(Map map, String str) {
        zzbdj zzbdjVarZza;
        List listZzg = zzbkg.zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(zzbdj.class);
        for (Object obj : listZzg) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                zzng.zza(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                zzbdjVarZza = zzbdo.zzd(iIntValue).zza();
                zzng.zza(zzbdjVarZza.zza() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new zznh("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    zzbdjVarZza = (zzbdj) Enum.valueOf(zzbdj.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new zznh("Status code " + String.valueOf(obj) + " is not valid", e);
                }
            }
            enumSetNoneOf.add(zzbdjVarZza);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }
}
