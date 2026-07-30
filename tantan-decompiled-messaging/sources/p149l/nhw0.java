package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class nhw0 {
    /* JADX INFO: renamed from: a */
    public static double m159464a(double d) {
        if (Double.isNaN(d)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (Double.isInfinite(d) || d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d == -0.0d) {
            return d;
        }
        return ((double) (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* JADX INFO: renamed from: b */
    public static int m159465b(a9x0 a9x0Var) {
        int iM159472i = m159472i(a9x0Var.m95460a("runtime.counter").zze().doubleValue() + 1.0d);
        if (iM159472i <= 1000000) {
            a9x0Var.m95467h("runtime.counter", new acr0(Double.valueOf(iM159472i)));
            return iM159472i;
        }
        qkq0.m175383a("Instructions allowed exceeded");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static zzbv m159466c(String str) {
        zzbv zzbvVarZza = (str == null || str.isEmpty()) ? null : zzbv.zza(Integer.parseInt(str));
        if (zzbvVarZza != null) {
            return zzbvVarZza;
        }
        dqi0.m113073a("Unsupported commandId %s", new Object[]{str});
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m159467d(ymr0 ymr0Var) {
        if (ymr0.f199052x0.equals(ymr0Var)) {
            return null;
        }
        if (ymr0.f199051w0.equals(ymr0Var)) {
            return "";
        }
        if (ymr0Var instanceof ulr0) {
            return m159468e((ulr0) ymr0Var);
        }
        if (!(ymr0Var instanceof v8r0)) {
            return !ymr0Var.zze().isNaN() ? ymr0Var.zze() : ymr0Var.zzf();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ymr0> it = ((v8r0) ymr0Var).iterator();
        while (it.hasNext()) {
            Object objM159467d = m159467d(it.next());
            if (objM159467d != null) {
                arrayList.add(objM159467d);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static Map<String, Object> m159468e(ulr0 ulr0Var) {
        HashMap map = new HashMap();
        for (String str : ulr0Var.m194260b()) {
            Object objM159467d = m159467d(ulr0Var.zza(str));
            if (objM159467d != null) {
                map.put(str, objM159467d);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static void m159469f(zzbv zzbvVar, int i, List<ymr0> list) {
        m159470g(zzbvVar.name(), i, list);
    }

    /* JADX INFO: renamed from: g */
    public static void m159470g(String str, int i, List<ymr0> list) {
        if (list.size() == i) {
            return;
        }
        dqi0.m113073a("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())});
    }

    /* JADX INFO: renamed from: h */
    public static boolean m159471h(ymr0 ymr0Var, ymr0 ymr0Var2) {
        if (!ymr0Var.getClass().equals(ymr0Var2.getClass())) {
            return false;
        }
        if ((ymr0Var instanceof qvr0) || (ymr0Var instanceof mkr0)) {
            return true;
        }
        if (ymr0Var instanceof acr0) {
            if (Double.isNaN(ymr0Var.zze().doubleValue()) || Double.isNaN(ymr0Var2.zze().doubleValue())) {
                return false;
            }
            return ymr0Var.zze().equals(ymr0Var2.zze());
        }
        if (ymr0Var instanceof ppr0) {
            return ymr0Var.zzf().equals(ymr0Var2.zzf());
        }
        if (ymr0Var instanceof bar0) {
            return ymr0Var.zzd().equals(ymr0Var2.zzd());
        }
        return ymr0Var == ymr0Var2;
    }

    /* JADX INFO: renamed from: i */
    public static int m159472i(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0;
        }
        return (int) ((((double) (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* JADX INFO: renamed from: j */
    public static void m159473j(zzbv zzbvVar, int i, List<ymr0> list) {
        m159474k(zzbvVar.name(), i, list);
    }

    /* JADX INFO: renamed from: k */
    public static void m159474k(String str, int i, List<ymr0> list) {
        if (list.size() >= i) {
            return;
        }
        dqi0.m113073a("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())});
    }

    /* JADX INFO: renamed from: l */
    public static boolean m159475l(ymr0 ymr0Var) {
        if (ymr0Var == null) {
            return false;
        }
        Double dZze = ymr0Var.zze();
        return !dZze.isNaN() && dZze.doubleValue() >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dZze.equals(Double.valueOf(Math.floor(dZze.doubleValue())));
    }

    /* JADX INFO: renamed from: m */
    public static long m159476m(double d) {
        return ((long) m159472i(d)) & 4294967295L;
    }

    /* JADX INFO: renamed from: n */
    public static void m159477n(String str, int i, List<ymr0> list) {
        if (list.size() <= i) {
            return;
        }
        dqi0.m113073a("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())});
    }
}
