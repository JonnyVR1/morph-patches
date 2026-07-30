package p153l;

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
public abstract class qar0 {

    /* JADX INFO: renamed from: a */
    public String f156409a;

    /* JADX INFO: renamed from: b */
    public int f156410b;

    /* JADX INFO: renamed from: c */
    public Boolean f156411c;

    /* JADX INFO: renamed from: d */
    public Boolean f156412d;

    /* JADX INFO: renamed from: e */
    public Long f156413e;

    /* JADX INFO: renamed from: f */
    public Long f156414f;

    public qar0(String str, int i) {
        this.f156409a = str;
        this.f156410b = i;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m175988b(double d, zzfo$zzd zzfo_zzd) {
        try {
            return m175994h(new BigDecimal(d), zzfo_zzd, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m175989c(long j, zzfo$zzd zzfo_zzd) {
        try {
            return m175994h(new BigDecimal(j), zzfo_zzd, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static Boolean m175990d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m175991e(String str, zzfo$zzd zzfo_zzd) {
        if (!vmy0.m201870a0(str)) {
            return null;
        }
        try {
            return m175994h(new BigDecimal(str), zzfo_zzd, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m175992f(String str, zzfo$zzf.zzb zzbVar, boolean z, String str2, List<String> list, String str3, d6x0 d6x0Var) {
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
        switch (l1z0.f129731a[zzbVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (d6x0Var != null) {
                        d6x0Var.m114563F().m153301b("Invalid regular expression in REGEXP audience filter. expression", str3);
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
    public static Boolean m175993g(String str, zzfo$zzf zzfo_zzf, d6x0 d6x0Var) {
        List<String> list;
        Preconditions.checkNotNull(zzfo_zzf);
        if (str == null || !zzfo_zzf.m14628M() || zzfo_zzf.m14622B() == zzfo$zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzfo$zzf.zzb zzbVarM14622B = zzfo_zzf.m14622B();
        zzfo$zzf.zzb zzbVar = zzfo$zzf.zzb.IN_LIST;
        if (zzbVarM14622B == zzbVar) {
            if (zzfo_zzf.m14629h() == 0) {
                return null;
            }
        } else if (!zzfo_zzf.m14627L()) {
            return null;
        }
        zzfo$zzf.zzb zzbVarM14622B2 = zzfo_zzf.m14622B();
        boolean zM14625I = zzfo_zzf.m14625I();
        String strM14623E = (zM14625I || zzbVarM14622B2 == zzfo$zzf.zzb.REGEXP || zzbVarM14622B2 == zzbVar) ? zzfo_zzf.m14623E() : zzfo_zzf.m14623E().toUpperCase(Locale.ENGLISH);
        if (zzfo_zzf.m14629h() == 0) {
            list = null;
        } else {
            List<String> listM14624G = zzfo_zzf.m14624G();
            if (!zM14625I) {
                ArrayList arrayList = new ArrayList(listM14624G.size());
                Iterator<String> it = listM14624G.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listM14624G = Collections.unmodifiableList(arrayList);
            }
            list = listM14624G;
        }
        return m175992f(str, zzbVarM14622B2, zM14625I, strM14623E, list, zzbVarM14622B2 == zzfo$zzf.zzb.REGEXP ? strM14623E : null, d6x0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public static Boolean m175994h(BigDecimal bigDecimal, zzfo$zzd zzfo_zzd, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzfo_zzd);
        if (zzfo_zzd.m14615L() && zzfo_zzd.m14610B() != zzfo$zzd.zzb.UNKNOWN_COMPARISON_TYPE) {
            zzfo$zzd.zzb zzbVarM14610B = zzfo_zzd.m14610B();
            zzfo$zzd.zzb zzbVar = zzfo$zzd.zzb.BETWEEN;
            if (zzbVarM14610B == zzbVar) {
                if (!zzfo_zzd.m14619U() || !zzfo_zzd.m14618T()) {
                    return null;
                }
            } else if (!zzfo_zzd.m14616M()) {
                return null;
            }
            zzfo$zzd.zzb zzbVarM14610B2 = zzfo_zzd.m14610B();
            if (zzfo_zzd.m14610B() == zzbVar) {
                if (vmy0.m201870a0(zzfo_zzd.m14613I()) && vmy0.m201870a0(zzfo_zzd.m14612G())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzfo_zzd.m14613I());
                        bigDecimal4 = new BigDecimal(zzfo_zzd.m14612G());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!vmy0.m201870a0(zzfo_zzd.m14611E())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(zzfo_zzd.m14611E());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (zzbVarM14610B2 == zzbVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i = l1z0.f129732b[zzbVarM14610B2.ordinal()];
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
    public abstract int mo102380a();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo102381i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo102382j();
}
