package p149l;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo$zzd;
import com.google.android.gms.internal.measurement.zzfo$zzf;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k1r0 {

    /* JADX INFO: renamed from: a */
    public String f120642a;

    /* JADX INFO: renamed from: b */
    public int f120643b;

    /* JADX INFO: renamed from: c */
    public Boolean f120644c;

    /* JADX INFO: renamed from: d */
    public Boolean f120645d;

    /* JADX INFO: renamed from: e */
    public Long f120646e;

    /* JADX INFO: renamed from: f */
    public Long f120647f;

    public k1r0(String str, int i) {
        this.f120642a = str;
        this.f120643b = i;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m144221b(double d, zzfo$zzd zzfo_zzd) {
        try {
            return m144227h(new BigDecimal(d), zzfo_zzd, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m144222c(long j, zzfo$zzd zzfo_zzd) {
        try {
            return m144227h(new BigDecimal(j), zzfo_zzd, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static Boolean m144223d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m144224e(String str, zzfo$zzd zzfo_zzd) {
        if (!pdy0.m168465a0(str)) {
            return null;
        }
        try {
            return m144227h(new BigDecimal(str), zzfo_zzd, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m144225f(String str, zzfo$zzf.zzb zzbVar, boolean z, String str2, List<String> list, String str3, xww0 xww0Var) {
        if (str == null) {
            return null;
        }
        if (zzbVar == zzfo$zzf.zzb.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzbVar != zzfo$zzf.zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (fsy0.f99121a[zzbVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (xww0Var != null) {
                        xww0Var.m211417F().m123937b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public static Boolean m144226g(String str, zzfo$zzf zzfo_zzf, xww0 xww0Var) {
        List<String> list;
        Preconditions.checkNotNull(zzfo_zzf);
        if (str == null || !zzfo_zzf.m14574M() || zzfo_zzf.m14568B() == zzfo$zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzfo$zzf.zzb zzbVarM14568B = zzfo_zzf.m14568B();
        zzfo$zzf.zzb zzbVar = zzfo$zzf.zzb.IN_LIST;
        if (zzbVarM14568B == zzbVar) {
            if (zzfo_zzf.m14575h() == 0) {
                return null;
            }
        } else if (!zzfo_zzf.m14573L()) {
            return null;
        }
        zzfo$zzf.zzb zzbVarM14568B2 = zzfo_zzf.m14568B();
        boolean zM14571I = zzfo_zzf.m14571I();
        String strM14569E = (zM14571I || zzbVarM14568B2 == zzfo$zzf.zzb.REGEXP || zzbVarM14568B2 == zzbVar) ? zzfo_zzf.m14569E() : zzfo_zzf.m14569E().toUpperCase(Locale.ENGLISH);
        if (zzfo_zzf.m14575h() == 0) {
            list = null;
        } else {
            List<String> listM14570G = zzfo_zzf.m14570G();
            if (!zM14571I) {
                ArrayList arrayList = new ArrayList(listM14570G.size());
                Iterator<String> it = listM14570G.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listM14570G = Collections.unmodifiableList(arrayList);
            }
            list = listM14570G;
        }
        return m144225f(str, zzbVarM14568B2, zM14571I, strM14569E, list, zzbVarM14568B2 == zzfo$zzf.zzb.REGEXP ? strM14569E : null, xww0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public static Boolean m144227h(BigDecimal bigDecimal, zzfo$zzd zzfo_zzd, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzfo_zzd);
        if (zzfo_zzd.m14561L() && zzfo_zzd.m14556B() != zzfo$zzd.zzb.UNKNOWN_COMPARISON_TYPE) {
            zzfo$zzd.zzb zzbVarM14556B = zzfo_zzd.m14556B();
            zzfo$zzd.zzb zzbVar = zzfo$zzd.zzb.BETWEEN;
            if (zzbVarM14556B == zzbVar) {
                if (!zzfo_zzd.m14565U() || !zzfo_zzd.m14564T()) {
                    return null;
                }
            } else if (!zzfo_zzd.m14562M()) {
                return null;
            }
            zzfo$zzd.zzb zzbVarM14556B2 = zzfo_zzd.m14556B();
            if (zzfo_zzd.m14556B() == zzbVar) {
                if (pdy0.m168465a0(zzfo_zzd.m14559I()) && pdy0.m168465a0(zzfo_zzd.m14558G())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzfo_zzd.m14559I());
                        bigDecimal4 = new BigDecimal(zzfo_zzd.m14558G());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!pdy0.m168465a0(zzfo_zzd.m14557E())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(zzfo_zzd.m14557E());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (zzbVarM14556B2 == zzbVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i = fsy0.f99122b[zzbVarM14556B2.ordinal()];
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal2 != null) {
                        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo144228a();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo144229i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo144230j();
}
