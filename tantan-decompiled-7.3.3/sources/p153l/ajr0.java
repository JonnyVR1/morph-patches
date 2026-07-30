package p153l;

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
public final class ajr0 extends yyx0 {

    /* JADX INFO: renamed from: b */
    public Boolean f71857b;

    /* JADX INFO: renamed from: c */
    public String f71858c;

    /* JADX INFO: renamed from: d */
    public jlr0 f71859d;

    /* JADX INFO: renamed from: e */
    public Boolean f71860e;

    public ajr0(atx0 atx0Var) {
        super(atx0Var);
        this.f71859d = new jlr0() { // from class: l.shr0
            @Override // p153l.jlr0
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    /* JADX INFO: renamed from: C */
    public static long m98416C() {
        return whs0.f189256e.m220931a(null).longValue();
    }

    /* JADX INFO: renamed from: E */
    public static long m98417E() {
        return whs0.f189277l.m220931a(null).intValue();
    }

    /* JADX INFO: renamed from: J */
    public static long m98418J() {
        return whs0.f189202F.m220931a(null).longValue();
    }

    /* JADX INFO: renamed from: K */
    public static long m98419K() {
        return whs0.f189192A.m220931a(null).longValue();
    }

    private final String zza(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            zzj().m114558A().m153301b("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            zzj().m114558A().m153301b("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            zzj().m114558A().m153301b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            zzj().m114558A().m153301b("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final String m98420A(String str) {
        return m98450x(str, whs0.f189220O);
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final boolean m98421B(String str, zpw0<Boolean> zpw0Var) {
        if (TextUtils.isEmpty(str)) {
            return zpw0Var.m220931a(null).booleanValue();
        }
        String strZza = this.f71859d.zza(str, zpw0Var.m220932b());
        return TextUtils.isEmpty(strZza) ? zpw0Var.m220931a(null).booleanValue() : zpw0Var.m220931a(Boolean.valueOf("1".equals(strZza))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: NotFoundException -> 0x0043, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0043, blocks: (B:12:0x002b, B:15:0x003e), top: B:20:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    /* JADX INFO: renamed from: D */
    public final List<String> m98422D(@Size(min = 1) String str) {
        Integer numValueOf;
        String[] stringArray;
        Preconditions.checkNotEmpty(str);
        Bundle bundleM98441o = m98441o();
        if (bundleM98441o != null) {
            if (bundleM98441o.containsKey(str)) {
                numValueOf = Integer.valueOf(bundleM98441o.getInt(str));
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
                zzj().m114558A().m153301b("Failed to load string array from metadata: resource not found", e);
                return null;
            }
        }
        zzj().m114558A().m153300a("Failed to load metadata: Metadata bundle is null");
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
    public final void m98423F(String str) {
        this.f71858c = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final boolean m98424G(String str) {
        return m98421B(str, whs0.f189218N);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m98425H(String str) {
        return "1".equals(this.f71859d.zza(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: I */
    public final boolean m98426I(String str) {
        return "1".equals(this.f71859d.zza(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: L */
    public final String m98427L() {
        return zza("debug.firebase.analytics.app", "");
    }

    /* JADX INFO: renamed from: M */
    public final String m98428M() {
        return zza("debug.deferred.deeplink", "");
    }

    /* JADX INFO: renamed from: N */
    public final String m98429N() {
        return this.f71858c;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m98430O() {
        Boolean boolM98451y = m98451y("google_analytics_adid_collection_enabled");
        return boolM98451y == null || boolM98451y.booleanValue();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m98431P() {
        Boolean boolM98451y = m98451y("google_analytics_automatic_screen_reporting_enabled");
        return boolM98451y == null || boolM98451y.booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m98432Q() {
        Boolean boolM98451y = m98451y("firebase_analytics_collection_deactivated");
        return boolM98451y != null && boolM98451y.booleanValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final boolean m98433R() {
        if (this.f71857b == null) {
            Boolean boolM98451y = m98451y("app_measurement_lite");
            this.f71857b = boolM98451y;
            if (boolM98451y == null) {
                this.f71857b = Boolean.FALSE;
            }
        }
        return this.f71857b.booleanValue() || !this.f202159a.m100302o();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* JADX INFO: renamed from: S */
    public final boolean m98434S() {
        if (this.f71860e == null) {
            synchronized (this) {
                try {
                    if (this.f71860e == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f71860e = Boolean.valueOf(str != null && str.equals(myProcessName));
                        }
                        if (this.f71860e == null) {
                            this.f71860e = Boolean.TRUE;
                            zzj().m114558A().m153300a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f71860e.booleanValue();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final double m98435i(String str, zpw0<Double> zpw0Var) {
        if (TextUtils.isEmpty(str)) {
            return zpw0Var.m220931a(null).doubleValue();
        }
        String strZza = this.f71859d.zza(str, zpw0Var.m220932b());
        if (TextUtils.isEmpty(strZza)) {
            return zpw0Var.m220931a(null).doubleValue();
        }
        try {
            return zpw0Var.m220931a(Double.valueOf(Double.parseDouble(strZza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zpw0Var.m220931a(null).doubleValue();
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m98436j(@Size(min = 1) String str) {
        return m98437k(str, whs0.f189212K, 500, 2000);
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public final int m98437k(String str, zpw0<Integer> zpw0Var, int i, int i2) {
        return Math.max(Math.min(m98443q(str, zpw0Var), i2), i);
    }

    /* JADX INFO: renamed from: l */
    public final int m98438l(String str, boolean z) {
        if (z) {
            return m98437k(str, whs0.f189232U, 100, 500);
        }
        return 500;
    }

    /* JADX INFO: renamed from: m */
    public final void m98439m(jlr0 jlr0Var) {
        this.f71859d = jlr0Var;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m98440n(zpw0<Boolean> zpw0Var) {
        return m98421B(null, zpw0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o */
    public final Bundle m98441o() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().m114558A().m153300a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(zza().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzj().m114558A().m153300a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zzj().m114558A().m153301b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m98442p(@Size(min = 1) String str) {
        return m98437k(str, whs0.f189214L, 25, 100);
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public final int m98443q(String str, zpw0<Integer> zpw0Var) {
        if (TextUtils.isEmpty(str)) {
            return zpw0Var.m220931a(null).intValue();
        }
        String strZza = this.f71859d.zza(str, zpw0Var.m220932b());
        if (TextUtils.isEmpty(strZza)) {
            return zpw0Var.m220931a(null).intValue();
        }
        try {
            return zpw0Var.m220931a(Integer.valueOf(Integer.parseInt(strZza))).intValue();
        } catch (NumberFormatException unused) {
            return zpw0Var.m220931a(null).intValue();
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m98444r(String str, boolean z) {
        return Math.max(m98438l(str, z), 256);
    }

    /* JADX INFO: renamed from: s */
    public final int m98445s() {
        return mo15143e().m136349W(201500000, true) ? 100 : 25;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final int m98446t(@Size(min = 1) String str) {
        return m98443q(str, whs0.f189287p);
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final long m98447u(String str, zpw0<Long> zpw0Var) {
        if (TextUtils.isEmpty(str)) {
            return zpw0Var.m220931a(null).longValue();
        }
        String strZza = this.f71859d.zza(str, zpw0Var.m220932b());
        if (TextUtils.isEmpty(strZza)) {
            return zpw0Var.m220931a(null).longValue();
        }
        try {
            return zpw0Var.m220931a(Long.valueOf(Long.parseLong(strZza))).longValue();
        } catch (NumberFormatException unused) {
            return zpw0Var.m220931a(null).longValue();
        }
    }

    /* JADX INFO: renamed from: v */
    public final zzjh m98448v(String str, boolean z) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle bundleM98441o = m98441o();
        if (bundleM98441o == null) {
            zzj().m114558A().m153300a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM98441o.get(str);
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
        zzj().m114563F().m153301b("Invalid manifest metadata for", str);
        return zzjh.UNINITIALIZED;
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final long m98449w(String str) {
        return m98447u(str, whs0.f189247b);
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final String m98450x(String str, zpw0<String> zpw0Var) {
        return TextUtils.isEmpty(str) ? zpw0Var.m220931a(null) : zpw0Var.m220931a(this.f71859d.zza(str, zpw0Var.m220932b()));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: y */
    public final Boolean m98451y(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleM98441o = m98441o();
        if (bundleM98441o == null) {
            zzj().m114558A().m153300a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM98441o.containsKey(str)) {
            return Boolean.valueOf(bundleM98441o.getBoolean(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m98452z(String str, zpw0<Boolean> zpw0Var) {
        return m98421B(str, zpw0Var);
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
