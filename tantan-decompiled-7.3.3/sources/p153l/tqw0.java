package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tqw0 {
    /* JADX INFO: renamed from: a */
    public static double m192367a(double d) {
        if (Double.isNaN(d)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (Double.isInfinite(d) || d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d == -0.0d) {
            return d;
        }
        return ((double) (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* JADX INFO: renamed from: b */
    public static int m192368b(gix0 gix0Var) {
        int iM192375i = m192375i(gix0Var.m130393a("runtime.counter").zze().doubleValue() + 1.0d);
        if (iM192375i <= 1000000) {
            gix0Var.m130400h("runtime.counter", new glr0(Double.valueOf(iM192375i)));
            return iM192375i;
        }
        wtq0.m207906a("Instructions allowed exceeded");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static zzbv m192369c(String str) {
        zzbv zzbvVarZza = (str == null || str.isEmpty()) ? null : zzbv.zza(Integer.parseInt(str));
        if (zzbvVarZza != null) {
            return zzbvVarZza;
        }
        gzi0.m133102a("Unsupported commandId %s", new Object[]{str});
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m192370d(ewr0 ewr0Var) {
        if (ewr0.f96188x0.equals(ewr0Var)) {
            return null;
        }
        if (ewr0.f96187w0.equals(ewr0Var)) {
            return "";
        }
        if (ewr0Var instanceof avr0) {
            return m192371e((avr0) ewr0Var);
        }
        if (!(ewr0Var instanceof bir0)) {
            return !ewr0Var.zze().isNaN() ? ewr0Var.zze() : ewr0Var.zzf();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ewr0> it = ((bir0) ewr0Var).iterator();
        while (it.hasNext()) {
            Object objM192370d = m192370d(it.next());
            if (objM192370d != null) {
                arrayList.add(objM192370d);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static Map<String, Object> m192371e(avr0 avr0Var) {
        HashMap map = new HashMap();
        for (String str : avr0Var.m100513b()) {
            Object objM192370d = m192370d(avr0Var.zza(str));
            if (objM192370d != null) {
                map.put(str, objM192370d);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static void m192372f(zzbv zzbvVar, int i, List<ewr0> list) {
        m192373g(zzbvVar.name(), i, list);
    }

    /* JADX INFO: renamed from: g */
    public static void m192373g(String str, int i, List<ewr0> list) {
        if (list.size() == i) {
            return;
        }
        gzi0.m133102a("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())});
    }

    /* JADX INFO: renamed from: h */
    public static boolean m192374h(ewr0 ewr0Var, ewr0 ewr0Var2) {
        if (!ewr0Var.getClass().equals(ewr0Var2.getClass())) {
            return false;
        }
        if ((ewr0Var instanceof w4s0) || (ewr0Var instanceof str0)) {
            return true;
        }
        if (ewr0Var instanceof glr0) {
            if (Double.isNaN(ewr0Var.zze().doubleValue()) || Double.isNaN(ewr0Var2.zze().doubleValue())) {
                return false;
            }
            return ewr0Var.zze().equals(ewr0Var2.zze());
        }
        if (ewr0Var instanceof vyr0) {
            return ewr0Var.zzf().equals(ewr0Var2.zzf());
        }
        if (ewr0Var instanceof hjr0) {
            return ewr0Var.zzd().equals(ewr0Var2.zzd());
        }
        return ewr0Var == ewr0Var2;
    }

    /* JADX INFO: renamed from: i */
    public static int m192375i(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0;
        }
        return (int) ((((double) (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* JADX INFO: renamed from: j */
    public static void m192376j(zzbv zzbvVar, int i, List<ewr0> list) {
        m192377k(zzbvVar.name(), i, list);
    }

    /* JADX INFO: renamed from: k */
    public static void m192377k(String str, int i, List<ewr0> list) {
        if (list.size() >= i) {
            return;
        }
        gzi0.m133102a("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())});
    }

    /* JADX INFO: renamed from: l */
    public static boolean m192378l(ewr0 ewr0Var) {
        if (ewr0Var == null) {
            return false;
        }
        Double dZze = ewr0Var.zze();
        return !dZze.isNaN() && dZze.doubleValue() >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dZze.equals(Double.valueOf(Math.floor(dZze.doubleValue())));
    }

    /* JADX INFO: renamed from: m */
    public static long m192379m(double d) {
        return ((long) m192375i(d)) & 4294967295L;
    }

    /* JADX INFO: renamed from: n */
    public static void m192380n(String str, int i, List<ewr0> list) {
        if (list.size() <= i) {
            return;
        }
        gzi0.m133102a("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())});
    }
}
