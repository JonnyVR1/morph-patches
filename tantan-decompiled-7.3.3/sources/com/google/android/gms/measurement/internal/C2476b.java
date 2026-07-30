package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.ias0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2476b {

    /* JADX INFO: renamed from: f */
    public static final C2476b f10487f = new C2476b(null, 100);

    /* JADX INFO: renamed from: a */
    public final int f10488a;

    /* JADX INFO: renamed from: b */
    public final String f10489b;

    /* JADX INFO: renamed from: c */
    public final Boolean f10490c;

    /* JADX INFO: renamed from: d */
    public final String f10491d;

    /* JADX INFO: renamed from: e */
    public final EnumMap<zzje.zza, zzjh> f10492e;

    public C2476b(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzje.zza, zzjh> enumMap = new EnumMap<>(zzje.zza.class);
        this.f10492e = enumMap;
        enumMap.put(zzje.zza.AD_USER_DATA, zzje.m15391h(bool));
        this.f10488a = i;
        this.f10489b = m15133l();
        this.f10490c = bool2;
        this.f10491d = str;
    }

    /* JADX INFO: renamed from: b */
    public static C2476b m15122b(Bundle bundle, int i) {
        if (bundle == null) {
            return new C2476b(null, i);
        }
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            enumMap.put(zzaVar, zzje.m15392i(bundle.getString(zzaVar.zze)));
        }
        return new C2476b((EnumMap<zzje.zza, zzjh>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: renamed from: c */
    public static C2476b m15123c(zzjh zzjhVar, int i) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        enumMap.put(zzje.zza.AD_USER_DATA, zzjhVar);
        return new C2476b((EnumMap<zzje.zza, zzjh>) enumMap, -10, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: d */
    public static C2476b m15124d(String str) {
        if (str == null || str.length() <= 0) {
            return f10487f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        zzje.zza[] zzaVarArrZza = zzjg.DMA.zza();
        int length = zzaVarArrZza.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(zzaVarArrZza[i3], zzje.m15390g(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new C2476b((EnumMap<zzje.zza, zzjh>) enumMap, i, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m15125e(Bundle bundle) {
        zzjh zzjhVarM15392i;
        if (bundle == null || (zzjhVarM15392i = zzje.m15392i(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = ias0.f113616a[zzjhVarM15392i.ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a */
    public final int m15126a() {
        return this.f10488a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2476b)) {
            return false;
        }
        C2476b c2476b = (C2476b) obj;
        if (this.f10489b.equalsIgnoreCase(c2476b.f10489b) && Objects.equals(this.f10490c, c2476b.f10490c)) {
            return Objects.equals(this.f10491d, c2476b.f10491d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Bundle m15127f() {
        Bundle bundle = new Bundle();
        Iterator it = this.f10492e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strM15397r = zzje.m15397r((zzjh) entry.getValue());
            if (strM15397r != null) {
                bundle.putString(((zzje.zza) entry.getKey()).zze, strM15397r);
            }
        }
        Boolean bool = this.f10490c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f10491d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public final zzjh m15128g() {
        zzjh zzjhVar = this.f10492e.get(zzje.zza.AD_USER_DATA);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    /* JADX INFO: renamed from: h */
    public final Boolean m15129h() {
        return this.f10490c;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.f10490c;
        if (bool == null) {
            i = 3;
        } else {
            i = bool == Boolean.TRUE ? 7 : 13;
        }
        String str = this.f10491d;
        return this.f10489b.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA);
    }

    /* JADX INFO: renamed from: i */
    public final String m15130i() {
        return this.f10491d;
    }

    /* JADX INFO: renamed from: j */
    public final String m15131j() {
        return this.f10489b;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15132k() {
        Iterator<zzjh> it = this.f10492e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final String m15133l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10488a);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb.append(":");
            sb.append(zzje.m15386a(this.f10492e.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzje.m15393j(this.f10488a));
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(zzaVar.zze);
            sb.append("=");
            zzjh zzjhVar = this.f10492e.get(zzaVar);
            if (zzjhVar == null) {
                sb.append("uninitialized");
            } else {
                int i = ias0.f113616a[zzjhVar.ordinal()];
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
        if (this.f10490c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f10490c);
        }
        if (this.f10491d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f10491d);
        }
        return sb.toString();
    }

    public C2476b(Boolean bool, int i) {
        this((Boolean) null, i, (Boolean) null, (String) null);
    }

    public C2476b(EnumMap<zzje.zza, zzjh> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzje.zza, zzjh> enumMap2 = new EnumMap<>(zzje.zza.class);
        this.f10492e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f10488a = i;
        this.f10489b = m15133l();
        this.f10490c = bool;
        this.f10491d = str;
    }
}
