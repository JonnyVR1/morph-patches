package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.zzjh;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class u9r0 extends spx0 {

    /* JADX INFO: renamed from: b */
    public Boolean f175497b;

    /* JADX INFO: renamed from: c */
    public String f175498c;

    /* JADX INFO: renamed from: d */
    public dcr0 f175499d;

    /* JADX INFO: renamed from: e */
    public Boolean f175500e;

    public u9r0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f175499d = new dcr0() { // from class: l.m8r0
            @Override // p149l.dcr0
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    /* JADX INFO: renamed from: C */
    public static long m192624C() {
        return q8s0.f153280e.m188827a(null).longValue();
    }

    /* JADX INFO: renamed from: E */
    public static long m192625E() {
        return q8s0.f153301l.m188827a(null).intValue();
    }

    /* JADX INFO: renamed from: J */
    public static long m192626J() {
        return q8s0.f153226F.m188827a(null).longValue();
    }

    /* JADX INFO: renamed from: K */
    public static long m192627K() {
        return q8s0.f153216A.m188827a(null).longValue();
    }

    private final String zza(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            zzj().m211412A().m123937b("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            zzj().m211412A().m123937b("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            zzj().m211412A().m123937b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            zzj().m211412A().m123937b("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final String m192628A(String str) {
        return m192658x(str, q8s0.f153244O);
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final boolean m192629B(String str, tgw0<Boolean> tgw0Var) {
        if (TextUtils.isEmpty(str)) {
            return tgw0Var.m188827a(null).booleanValue();
        }
        String strZza = this.f175499d.zza(str, tgw0Var.m188828b());
        return TextUtils.isEmpty(strZza) ? tgw0Var.m188827a(null).booleanValue() : tgw0Var.m188827a(Boolean.valueOf("1".equals(strZza))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: NotFoundException -> 0x0043, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0043, blocks: (B:12:0x002b, B:15:0x003e), top: B:20:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    /* JADX INFO: renamed from: D */
    public final List<String> m192630D(@Size(min = 1) String str) {
        Integer numValueOf;
        String[] stringArray;
        Preconditions.checkNotEmpty(str);
        Bundle bundleM192649o = m192649o();
        if (bundleM192649o != null) {
            if (bundleM192649o.containsKey(str)) {
                numValueOf = Integer.valueOf(bundleM192649o.getInt(str));
            }
            if (numValueOf == null) {
                return null;
            }
            try {
                stringArray = zza().getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    return null;
                }
                return Arrays.asList(stringArray);
            } catch (Resources.NotFoundException e) {
                zzj().m211412A().m123937b("Failed to load string array from metadata: resource not found", e);
                return null;
            }
        }
        zzj().m211412A().m123936a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf == null) {
            return null;
        }
        stringArray = zza().getResources().getStringArray(numValueOf.intValue());
        if (stringArray == null) {
            return null;
        }
        return Arrays.asList(stringArray);
    }

    /* JADX INFO: renamed from: F */
    public final void m192631F(String str) {
        this.f175498c = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final boolean m192632G(String str) {
        return m192629B(str, q8s0.f153242N);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m192633H(String str) {
        return "1".equals(this.f175499d.zza(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: I */
    public final boolean m192634I(String str) {
        return "1".equals(this.f175499d.zza(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: L */
    public final String m192635L() {
        return zza("debug.firebase.analytics.app", "");
    }

    /* JADX INFO: renamed from: M */
    public final String m192636M() {
        return zza("debug.deferred.deeplink", "");
    }

    /* JADX INFO: renamed from: N */
    public final String m192637N() {
        return this.f175498c;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m192638O() {
        Boolean boolM192659y = m192659y("google_analytics_adid_collection_enabled");
        return boolM192659y == null || boolM192659y.booleanValue();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m192639P() {
        Boolean boolM192659y = m192659y("google_analytics_automatic_screen_reporting_enabled");
        return boolM192659y == null || boolM192659y.booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m192640Q() {
        Boolean boolM192659y = m192659y("firebase_analytics_collection_deactivated");
        return boolM192659y != null && boolM192659y.booleanValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final boolean m192641R() {
        if (this.f175497b == null) {
            Boolean boolM192659y = m192659y("app_measurement_lite");
            this.f175497b = boolM192659y;
            if (boolM192659y == null) {
                this.f175497b = Boolean.FALSE;
            }
        }
        return this.f175497b.booleanValue() || !this.f165891a.m194122o();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* JADX INFO: renamed from: S */
    public final boolean m192642S() {
        if (this.f175500e == null) {
            synchronized (this) {
                try {
                    if (this.f175500e == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f175500e = Boolean.valueOf(str != null && str.equals(myProcessName));
                        }
                        if (this.f175500e == null) {
                            this.f175500e = Boolean.TRUE;
                            zzj().m211412A().m123936a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f175500e.booleanValue();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final double m192643i(String str, tgw0<Double> tgw0Var) {
        if (TextUtils.isEmpty(str)) {
            return tgw0Var.m188827a(null).doubleValue();
        }
        String strZza = this.f175499d.zza(str, tgw0Var.m188828b());
        if (TextUtils.isEmpty(strZza)) {
            return tgw0Var.m188827a(null).doubleValue();
        }
        try {
            return tgw0Var.m188827a(Double.valueOf(Double.parseDouble(strZza))).doubleValue();
        } catch (NumberFormatException unused) {
            return tgw0Var.m188827a(null).doubleValue();
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m192644j(@Size(min = 1) String str) {
        return m192645k(str, q8s0.f153236K, 500, 2000);
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public final int m192645k(String str, tgw0<Integer> tgw0Var, int i, int i2) {
        return Math.max(Math.min(m192651q(str, tgw0Var), i2), i);
    }

    /* JADX INFO: renamed from: l */
    public final int m192646l(String str, boolean z) {
        if (z) {
            return m192645k(str, q8s0.f153256U, 100, 500);
        }
        return 500;
    }

    /* JADX INFO: renamed from: m */
    public final void m192647m(dcr0 dcr0Var) {
        this.f175499d = dcr0Var;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m192648n(tgw0<Boolean> tgw0Var) {
        return m192629B(null, tgw0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o */
    public final Bundle m192649o() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().m211412A().m123936a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(zza().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzj().m211412A().m123936a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zzj().m211412A().m123937b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m192650p(@Size(min = 1) String str) {
        return m192645k(str, q8s0.f153238L, 25, 100);
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public final int m192651q(String str, tgw0<Integer> tgw0Var) {
        if (TextUtils.isEmpty(str)) {
            return tgw0Var.m188827a(null).intValue();
        }
        String strZza = this.f175499d.zza(str, tgw0Var.m188828b());
        if (TextUtils.isEmpty(strZza)) {
            return tgw0Var.m188827a(null).intValue();
        }
        try {
            return tgw0Var.m188827a(Integer.valueOf(Integer.parseInt(strZza))).intValue();
        } catch (NumberFormatException unused) {
            return tgw0Var.m188827a(null).intValue();
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m192652r(String str, boolean z) {
        return Math.max(m192646l(str, z), 256);
    }

    /* JADX INFO: renamed from: s */
    public final int m192653s() {
        return mo15089e().m101482W(201500000, true) ? 100 : 25;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final int m192654t(@Size(min = 1) String str) {
        return m192651q(str, q8s0.f153311p);
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final long m192655u(String str, tgw0<Long> tgw0Var) {
        if (TextUtils.isEmpty(str)) {
            return tgw0Var.m188827a(null).longValue();
        }
        String strZza = this.f175499d.zza(str, tgw0Var.m188828b());
        if (TextUtils.isEmpty(strZza)) {
            return tgw0Var.m188827a(null).longValue();
        }
        try {
            return tgw0Var.m188827a(Long.valueOf(Long.parseLong(strZza))).longValue();
        } catch (NumberFormatException unused) {
            return tgw0Var.m188827a(null).longValue();
        }
    }

    /* JADX INFO: renamed from: v */
    public final zzjh m192656v(String str, boolean z) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle bundleM192649o = m192649o();
        if (bundleM192649o == null) {
            zzj().m211412A().m123936a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM192649o.get(str);
        }
        if (obj == null) {
            return zzjh.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzjh.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzjh.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return zzjh.POLICY;
        }
        zzj().m211417F().m123937b("Invalid manifest metadata for", str);
        return zzjh.UNINITIALIZED;
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final long m192657w(String str) {
        return m192655u(str, q8s0.f153271b);
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final String m192658x(String str, tgw0<String> tgw0Var) {
        return TextUtils.isEmpty(str) ? tgw0Var.m188827a(null) : tgw0Var.m188827a(this.f175499d.zza(str, tgw0Var.m188828b()));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: y */
    public final Boolean m192659y(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleM192649o = m192649o();
        if (bundleM192649o == null) {
            zzj().m211412A().m123936a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM192649o.containsKey(str)) {
            return Boolean.valueOf(bundleM192649o.getBoolean(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m192660z(String str, tgw0<Boolean> tgw0Var) {
        return m192629B(str, tgw0Var);
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
