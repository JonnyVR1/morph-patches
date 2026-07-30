package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.c1s0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2453b {

    /* JADX INFO: renamed from: f */
    public static final C2453b f10450f = new C2453b(null, 100);

    /* JADX INFO: renamed from: a */
    public final int f10451a;

    /* JADX INFO: renamed from: b */
    public final String f10452b;

    /* JADX INFO: renamed from: c */
    public final Boolean f10453c;

    /* JADX INFO: renamed from: d */
    public final String f10454d;

    /* JADX INFO: renamed from: e */
    public final EnumMap<zzje.zza, zzjh> f10455e;

    public C2453b(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzje.zza, zzjh> enumMap = new EnumMap<>(zzje.zza.class);
        this.f10455e = enumMap;
        enumMap.put(zzje.zza.AD_USER_DATA, zzje.m15337h(bool));
        this.f10451a = i;
        this.f10452b = m15079l();
        this.f10453c = bool2;
        this.f10454d = str;
    }

    /* JADX INFO: renamed from: b */
    public static C2453b m15068b(Bundle bundle, int i) {
        if (bundle == null) {
            return new C2453b(null, i);
        }
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            enumMap.put(zzaVar, zzje.m15338i(bundle.getString(zzaVar.zze)));
        }
        return new C2453b((EnumMap<zzje.zza, zzjh>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: renamed from: c */
    public static C2453b m15069c(zzjh zzjhVar, int i) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        enumMap.put(zzje.zza.AD_USER_DATA, zzjhVar);
        return new C2453b((EnumMap<zzje.zza, zzjh>) enumMap, -10, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: d */
    public static C2453b m15070d(String str) {
        if (str == null || str.length() <= 0) {
            return f10450f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        zzje.zza[] zzaVarArrZza = zzjg.DMA.zza();
        int length = zzaVarArrZza.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(zzaVarArrZza[i3], zzje.m15336g(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new C2453b((EnumMap<zzje.zza, zzjh>) enumMap, i, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m15071e(Bundle bundle) {
        zzjh zzjhVarM15338i;
        if (bundle == null || (zzjhVarM15338i = zzje.m15338i(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = c1s0.f78300a[zzjhVarM15338i.ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a */
    public final int m15072a() {
        return this.f10451a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2453b)) {
            return false;
        }
        C2453b c2453b = (C2453b) obj;
        if (this.f10452b.equalsIgnoreCase(c2453b.f10452b) && Objects.equals(this.f10453c, c2453b.f10453c)) {
            return Objects.equals(this.f10454d, c2453b.f10454d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Bundle m15073f() {
        Bundle bundle = new Bundle();
        Iterator it = this.f10455e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strM15343r = zzje.m15343r((zzjh) entry.getValue());
            if (strM15343r != null) {
                bundle.putString(((zzje.zza) entry.getKey()).zze, strM15343r);
            }
        }
        Boolean bool = this.f10453c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f10454d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public final zzjh m15074g() {
        zzjh zzjhVar = this.f10455e.get(zzje.zza.AD_USER_DATA);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    /* JADX INFO: renamed from: h */
    public final Boolean m15075h() {
        return this.f10453c;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.f10453c;
        if (bool == null) {
            i = 3;
        } else {
            i = bool == Boolean.TRUE ? 7 : 13;
        }
        String str = this.f10454d;
        return this.f10452b.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA);
    }

    /* JADX INFO: renamed from: i */
    public final String m15076i() {
        return this.f10454d;
    }

    /* JADX INFO: renamed from: j */
    public final String m15077j() {
        return this.f10452b;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15078k() {
        Iterator<zzjh> it = this.f10455e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final String m15079l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10451a);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb.append(":");
            sb.append(zzje.m15332a(this.f10455e.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzje.m15339j(this.f10451a));
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(zzaVar.zze);
            sb.append("=");
            zzjh zzjhVar = this.f10455e.get(zzaVar);
            if (zzjhVar == null) {
                sb.append("uninitialized");
            } else {
                int i = c1s0.f78300a[zzjhVar.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("eu_consent_policy");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.f10453c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f10453c);
        }
        if (this.f10454d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f10454d);
        }
        return sb.toString();
    }

    public C2453b(Boolean bool, int i) {
        this((Boolean) null, i, (Boolean) null, (String) null);
    }

    public C2453b(EnumMap<zzje.zza, zzjh> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzje.zza, zzjh> enumMap2 = new EnumMap<>(zzje.zza.class);
        this.f10455e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f10451a = i;
        this.f10452b = m15079l();
        this.f10453c = bool;
        this.f10454d = str;
    }
}
