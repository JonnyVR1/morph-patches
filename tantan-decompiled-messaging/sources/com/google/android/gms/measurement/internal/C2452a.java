package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2452a {

    /* JADX INFO: renamed from: a */
    public final EnumMap<zzje.zza, zzak> f10449a;

    public C2452a(EnumMap<zzje.zza, zzak> enumMap) {
        EnumMap<zzje.zza, zzak> enumMap2 = new EnumMap<>(zzje.zza.class);
        this.f10449a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* JADX INFO: renamed from: a */
    public static C2452a m15064a(String str) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        if (str.length() >= zzje.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zzje.zza[] zzaVarArrValues = zzje.zza.values();
                int length = zzaVarArrValues.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put(zzaVarArrValues[i], zzak.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new C2452a(enumMap);
            }
        }
        return new C2452a();
    }

    /* JADX INFO: renamed from: b */
    public final zzak m15065b(zzje.zza zzaVar) {
        zzak zzakVar = this.f10449a.get(zzaVar);
        return zzakVar == null ? zzak.UNSET : zzakVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX INFO: renamed from: c */
    public final void m15066c(zzje.zza zzaVar, int i) {
        zzak zzakVar = zzak.UNSET;
        if (i == -30) {
            zzakVar = zzak.TCF;
        } else if (i == -20) {
            zzakVar = zzak.API;
        } else if (i == -10) {
            zzakVar = zzak.MANIFEST;
        } else if (i == 0) {
            zzakVar = zzak.API;
        } else if (i == 30) {
            zzakVar = zzak.INITIALIZATION;
        }
        this.f10449a.put(zzaVar, zzakVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m15067d(zzje.zza zzaVar, zzak zzakVar) {
        this.f10449a.put(zzaVar, zzakVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzje.zza zzaVar : zzje.zza.values()) {
            zzak zzakVar = this.f10449a.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.UNSET;
            }
            sb.append(zzakVar.zzl);
        }
        return sb.toString();
    }

    public C2452a() {
        this.f10449a = new EnumMap<>(zzje.zza.class);
    }
}
