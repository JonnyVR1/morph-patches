package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zzje {

    /* JADX INFO: renamed from: c */
    public static final zzje f10555c = new zzje(null, null, 100);

    /* JADX INFO: renamed from: a */
    public final EnumMap<zza, zzjh> f10556a;

    /* JADX INFO: renamed from: b */
    public final int f10557b;

    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public zzje(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, zzjh> enumMap = new EnumMap<>(zza.class);
        this.f10556a = enumMap;
        enumMap.put(zza.AD_STORAGE, m15337h(null));
        enumMap.put(zza.ANALYTICS_STORAGE, m15337h(null));
        this.f10557b = i;
    }

    /* JADX INFO: renamed from: a */
    public static char m15332a(zzjh zzjhVar) {
        if (zzjhVar == null) {
            return '-';
        }
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: renamed from: c */
    public static zzje m15333c(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzje(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            enumMap.put(zzaVar, m15338i(bundle.getString(zzaVar.zze)));
        }
        return new zzje(enumMap, i);
    }

    /* JADX INFO: renamed from: e */
    public static zzje m15334e(zzjh zzjhVar, zzjh zzjhVar2, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put(zza.AD_STORAGE, zzjhVar);
        enumMap.put(zza.ANALYTICS_STORAGE, zzjhVar2);
        return new zzje(enumMap, -10);
    }

    /* JADX INFO: renamed from: f */
    public static zzje m15335f(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zzaVarArrZza = zzjg.STORAGE.zza();
        for (int i2 = 0; i2 < zzaVarArrZza.length; i2++) {
            zza zzaVar = zzaVarArrZza[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put(zzaVar, m15336g(str.charAt(i3)));
            } else {
                enumMap.put(zzaVar, zzjh.UNINITIALIZED);
            }
        }
        return new zzje(enumMap, i);
    }

    /* JADX INFO: renamed from: g */
    public static zzjh m15336g(char c) {
        if (c == '+') {
            return zzjh.POLICY;
        }
        if (c != '0') {
            return c != '1' ? zzjh.UNINITIALIZED : zzjh.GRANTED;
        }
        return zzjh.DENIED;
    }

    /* JADX INFO: renamed from: h */
    public static zzjh m15337h(Boolean bool) {
        if (bool == null) {
            return zzjh.UNINITIALIZED;
        }
        return bool.booleanValue() ? zzjh.GRANTED : zzjh.DENIED;
    }

    /* JADX INFO: renamed from: i */
    public static zzjh m15338i(String str) {
        if (str == null) {
            return zzjh.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzjh.GRANTED;
        }
        return str.equals("denied") ? zzjh.DENIED : zzjh.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: j */
    public static String m15339j(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    /* JADX INFO: renamed from: k */
    public static String m15340k(Bundle bundle) {
        String string;
        zza[] zzaVarArr = zzjg.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m15341l(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    /* JADX INFO: renamed from: q */
    public static zzje m15342q(String str) {
        return m15335f(str, 100);
    }

    /* JADX INFO: renamed from: r */
    public static String m15343r(zzjh zzjhVar) {
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    /* JADX INFO: renamed from: A */
    public final boolean m15344A() {
        Iterator<zzjh> it = this.f10556a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m15345b() {
        return this.f10557b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX INFO: renamed from: d */
    public final zzje m15346d(zzje zzjeVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            zzjh zzjhVar = this.f10556a.get(zzaVar);
            zzjh zzjhVar2 = zzjeVar.f10556a.get(zzaVar);
            if (zzjhVar == null) {
                zzjhVar = zzjhVar2;
            } else if (zzjhVar2 != null) {
                zzjh zzjhVar3 = zzjh.UNINITIALIZED;
                if (zzjhVar == zzjhVar3) {
                    zzjhVar = zzjhVar2;
                } else if (zzjhVar2 != zzjhVar3) {
                    zzjh zzjhVar4 = zzjh.POLICY;
                    if (zzjhVar == zzjhVar4) {
                        zzjhVar = zzjhVar2;
                    } else if (zzjhVar2 != zzjhVar4) {
                        zzjh zzjhVar5 = zzjh.DENIED;
                        zzjhVar = (zzjhVar == zzjhVar5 || zzjhVar2 == zzjhVar5) ? zzjhVar5 : zzjh.GRANTED;
                    }
                }
            }
            if (zzjhVar != null) {
                enumMap.put(zzaVar, zzjhVar);
            }
        }
        return new zzje(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzje)) {
            return false;
        }
        zzje zzjeVar = (zzje) obj;
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            if (this.f10556a.get(zzaVar) != zzjeVar.f10556a.get(zzaVar)) {
                return false;
            }
        }
        return this.f10557b == zzjeVar.f10557b;
    }

    public final int hashCode() {
        int iHashCode = this.f10557b * 17;
        Iterator<zzjh> it = this.f10556a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m15347m(zza zzaVar) {
        return this.f10556a.get(zzaVar) != zzjh.DENIED;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m15348n(zzje zzjeVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zzjeVar.m15347m(zzaVar) && m15347m(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final Bundle m15349o() {
        Bundle bundle = new Bundle();
        Iterator it = this.f10556a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strM15343r = m15343r((zzjh) entry.getValue());
            if (strM15343r != null) {
                bundle.putString(((zza) entry.getKey()).zze, strM15343r);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public final zzje m15350p(zzje zzjeVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            zzjh zzjhVar = this.f10556a.get(zzaVar);
            if (zzjhVar == zzjh.UNINITIALIZED) {
                zzjhVar = zzjeVar.f10556a.get(zzaVar);
            }
            if (zzjhVar != null) {
                enumMap.put(zzaVar, zzjhVar);
            }
        }
        return new zzje(enumMap, this.f10557b);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15351s(zzje zzjeVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzjh zzjhVar = this.f10556a.get(zzaVar);
            zzjh zzjhVar2 = zzjeVar.f10556a.get(zzaVar);
            zzjh zzjhVar3 = zzjh.DENIED;
            if (zzjhVar == zzjhVar3 && zzjhVar2 != zzjhVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final zzjh m15352t() {
        zzjh zzjhVar = this.f10556a.get(zza.AD_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m15339j(this.f10557b));
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(zzaVar.zze);
            sb.append("=");
            zzjh zzjhVar = this.f10556a.get(zzaVar);
            if (zzjhVar == null) {
                zzjhVar = zzjh.UNINITIALIZED;
            }
            sb.append(zzjhVar);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15353u(zzje zzjeVar) {
        return m15351s(zzjeVar, (zza[]) this.f10556a.keySet().toArray(new zza[0]));
    }

    /* JADX INFO: renamed from: v */
    public final zzjh m15354v() {
        zzjh zzjhVar = this.f10556a.get(zza.ANALYTICS_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX INFO: renamed from: w */
    public final String m15355w() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjg.STORAGE.zza()) {
            zzjh zzjhVar = this.f10556a.get(zzaVar);
            char c = '-';
            if (zzjhVar != null && (iOrdinal = zzjhVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal == 3) {
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public final String m15356x() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjg.STORAGE.zza()) {
            sb.append(m15332a(this.f10556a.get(zzaVar)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m15357y() {
        return m15347m(zza.AD_STORAGE);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m15358z() {
        return m15347m(zza.ANALYTICS_STORAGE);
    }

    public zzje(EnumMap<zza, zzjh> enumMap, int i) {
        EnumMap<zza, zzjh> enumMap2 = new EnumMap<>(zza.class);
        this.f10556a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f10557b = i;
    }
}
