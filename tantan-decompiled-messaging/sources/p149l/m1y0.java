package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2454c;
import com.google.android.gms.measurement.internal.C2458g;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class m1y0 extends e9x0 {

    /* JADX INFO: renamed from: c */
    public volatile q1y0 f130863c;

    /* JADX INFO: renamed from: d */
    public volatile q1y0 f130864d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public q1y0 f130865e;

    /* JADX INFO: renamed from: f */
    public final Map<Integer, q1y0> f130866f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("activityLock")
    public Activity f130867g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("activityLock")
    public volatile boolean f130868h;

    /* JADX INFO: renamed from: i */
    public volatile q1y0 f130869i;

    /* JADX INFO: renamed from: j */
    public q1y0 f130870j;

    /* JADX INFO: renamed from: k */
    @GuardedBy("activityLock")
    public boolean f130871k;

    /* JADX INFO: renamed from: l */
    public final Object f130872l;

    public m1y0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f130872l = new Object();
        this.f130866f = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m152626D(m1y0 m1y0Var, Bundle bundle, q1y0 q1y0Var, q1y0 q1y0Var2, long j) {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
            bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        }
        m1y0Var.m152634H(q1y0Var, q1y0Var2, j, true, m1y0Var.mo15089e().m101506z(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    @Deprecated
    /* JADX INFO: renamed from: A */
    public final void m152631A(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        if (!mo15085a().m192639P()) {
            zzj().m211418G().m123936a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        q1y0 q1y0Var = this.f130863c;
        if (q1y0Var == null) {
            zzj().m211418G().m123936a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f130866f.get(Integer.valueOf(activity.hashCode())) == null) {
            zzj().m211418G().m123936a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m152641v(activity.getClass(), "Activity");
        }
        boolean zEquals = Objects.equals(q1y0Var.f152179b, str2);
        boolean zEquals2 = Objects.equals(q1y0Var.f152178a, str);
        if (zEquals && zEquals2) {
            zzj().m211418G().m123936a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > mo15085a().m192646l(null, false))) {
            zzj().m211418G().m123937b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > mo15085a().m192646l(null, false))) {
            zzj().m211418G().m123937b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().m211416E().m123938c("Setting current screen to name, class", str == null ? "null" : str, str2);
        q1y0 q1y0Var2 = new q1y0(str, str2, mo15089e().m101469L0());
        this.f130866f.put(Integer.valueOf(activity.hashCode()), q1y0Var2);
        m152632B(activity, q1y0Var2, true);
    }

    @MainThread
    /* JADX INFO: renamed from: B */
    public final void m152632B(Activity activity, q1y0 q1y0Var, boolean z) {
        q1y0 q1y0Var2;
        q1y0 q1y0Var3 = this.f130863c == null ? this.f130864d : this.f130863c;
        if (q1y0Var.f152179b == null) {
            q1y0Var2 = new q1y0(q1y0Var.f152178a, activity != null ? m152641v(activity.getClass(), "Activity") : null, q1y0Var.f152180c, q1y0Var.f152182e, q1y0Var.f152183f);
        } else {
            q1y0Var2 = q1y0Var;
        }
        this.f130864d = this.f130863c;
        this.f130863c = q1y0Var2;
        zzl().m146305w(new v1y0(this, q1y0Var2, q1y0Var3, zzb().elapsedRealtime(), z));
    }

    /* JADX INFO: renamed from: C */
    public final void m152633C(Bundle bundle, long j) {
        String str;
        synchronized (this.f130872l) {
            try {
                if (!this.f130871k) {
                    zzj().m211418G().m123936a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String strM152641v = null;
                if (bundle != null) {
                    String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                    if (string != null && (string.length() <= 0 || string.length() > mo15085a().m192646l(null, false))) {
                        zzj().m211418G().m123937b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                    if (string2 != null && (string2.length() <= 0 || string2.length() > mo15085a().m192646l(null, false))) {
                        zzj().m211418G().m123937b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        strM152641v = string2;
                        str = string;
                    }
                } else {
                    str = null;
                }
                if (strM152641v == null) {
                    Activity activity = this.f130867g;
                    strM152641v = activity != null ? m152641v(activity.getClass(), "Activity") : "Activity";
                }
                String str2 = strM152641v;
                q1y0 q1y0Var = this.f130863c;
                if (this.f130868h && q1y0Var != null) {
                    this.f130868h = false;
                    boolean zEquals = Objects.equals(q1y0Var.f152179b, str2);
                    boolean zEquals2 = Objects.equals(q1y0Var.f152178a, str);
                    if (zEquals && zEquals2) {
                        zzj().m211418G().m123936a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzj().m211416E().m123938c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
                q1y0 q1y0Var2 = this.f130863c == null ? this.f130864d : this.f130863c;
                q1y0 q1y0Var3 = new q1y0(str, str2, mo15089e().m101469L0(), true, j);
                this.f130863c = q1y0Var3;
                this.f130864d = q1y0Var2;
                this.f130869i = q1y0Var3;
                zzl().m146305w(new a2y0(this, bundle, q1y0Var3, q1y0Var2, zzb().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final void m152634H(q1y0 q1y0Var, q1y0 q1y0Var2, long j, boolean z, Bundle bundle) {
        long j2;
        mo15092h();
        boolean z2 = false;
        boolean z3 = (q1y0Var2 != null && q1y0Var2.f152180c == q1y0Var.f152180c && Objects.equals(q1y0Var2.f152179b, q1y0Var.f152179b) && Objects.equals(q1y0Var2.f152178a, q1y0Var.f152178a)) ? false : true;
        if (z && this.f130865e != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bey0.m101433S(q1y0Var, bundle2, true);
            if (q1y0Var2 != null) {
                String str = q1y0Var2.f152178a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = q1y0Var2.f152179b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", q1y0Var2.f152180c);
            }
            if (z2) {
                long jM120133a = mo15099o().f137709f.m120133a(j);
                if (jM120133a > 0) {
                    mo15089e().m101460G(bundle2, jM120133a);
                }
            }
            if (!mo15085a().m192639P()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = q1y0Var.f152182e ? "app" : "auto";
            long jCurrentTimeMillis = zzb().currentTimeMillis();
            if (q1y0Var.f152182e) {
                long j3 = q1y0Var.f152183f;
                if (j3 != 0) {
                    j2 = j3;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            mo15096l().m15196V(str3, "_vs", j2, bundle2);
        }
        if (z2) {
            m152635I(this.f130865e, true, j);
        }
        this.f130865e = q1y0Var;
        if (q1y0Var.f152182e) {
            this.f130870j = q1y0Var;
        }
        mo15098n().m100143L(q1y0Var);
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final void m152635I(q1y0 q1y0Var, boolean z, long j) {
        mo15093i().m128970p(zzb().elapsedRealtime());
        if (!mo15099o().m158514y(q1y0Var != null && q1y0Var.f152181d, z, j) || q1y0Var == null) {
            return;
        }
        q1y0Var.f152181d = false;
    }

    /* JADX INFO: renamed from: J */
    public final q1y0 m152636J() {
        return this.f130863c;
    }

    @MainThread
    /* JADX INFO: renamed from: K */
    public final void m152637K(Activity activity) {
        synchronized (this.f130872l) {
            this.f130871k = false;
            this.f130868h = true;
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (!mo15085a().m192639P()) {
            this.f130863c = null;
            zzl().m146305w(new d2y0(this, jElapsedRealtime));
        } else {
            q1y0 q1y0VarM152640N = m152640N(activity);
            this.f130864d = this.f130863c;
            this.f130863c = null;
            zzl().m146305w(new r2y0(this, q1y0VarM152640N, jElapsedRealtime));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: L */
    public final void m152638L(Activity activity, Bundle bundle) {
        q1y0 q1y0Var;
        if (!mo15085a().m192639P() || bundle == null || (q1y0Var = this.f130866f.get(Integer.valueOf(activity.hashCode()))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", q1y0Var.f152180c);
        bundle2.putString(AuthenticationTokenClaims.JSON_KEY_NAME, q1y0Var.f152178a);
        bundle2.putString("referrer_name", q1y0Var.f152179b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @MainThread
    /* JADX INFO: renamed from: M */
    public final void m152639M(Activity activity) {
        synchronized (this.f130872l) {
            this.f130871k = true;
            if (activity != this.f130867g) {
                synchronized (this.f130872l) {
                    this.f130867g = activity;
                    this.f130868h = false;
                }
                if (mo15085a().m192639P()) {
                    this.f130869i = null;
                    zzl().m146305w(new n2y0(this));
                }
            }
        }
        if (!mo15085a().m192639P()) {
            this.f130863c = this.f130869i;
            zzl().m146305w(new i2y0(this));
        } else {
            m152632B(activity, m152640N(activity), false);
            h0s0 h0s0VarMo15093i = mo15093i();
            h0s0VarMo15093i.zzl().m146305w(new xws0(h0s0VarMo15093i, h0s0VarMo15093i.zzb().elapsedRealtime()));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: N */
    public final q1y0 m152640N(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        q1y0 q1y0Var = this.f130866f.get(Integer.valueOf(activity.hashCode()));
        if (q1y0Var == null) {
            q1y0 q1y0Var2 = new q1y0(null, m152641v(activity.getClass(), "Activity"), mo15089e().m101469L0());
            this.f130866f.put(Integer.valueOf(activity.hashCode()), q1y0Var2);
            q1y0Var = q1y0Var2;
        }
        return this.f130869i != null ? this.f130869i : q1y0Var;
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

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ h0s0 mo15093i() {
        return super.mo15093i();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2454c mo15094j() {
        return super.mo15094j();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ tmw0 mo15095k() {
        return super.mo15095k();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2458g mo15096l() {
        return super.mo15096l();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ m1y0 mo15097m() {
        return super.mo15097m();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ b3y0 mo15098n() {
        return super.mo15098n();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ n8y0 mo15099o() {
        return super.mo15099o();
    }

    @Override // p149l.e9x0
    /* JADX INFO: renamed from: u */
    public final boolean mo15101u() {
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: v */
    public final String m152641v(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > mo15085a().m192646l(null, false) ? str2.substring(0, mo15085a().m192646l(null, false)) : str2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final q1y0 m152642x(boolean z) {
        m115400p();
        mo15092h();
        q1y0 q1y0Var = this.f130865e;
        return (z && q1y0Var == null) ? this.f130870j : q1y0Var;
    }

    @MainThread
    /* JADX INFO: renamed from: y */
    public final void m152643y(Activity activity) {
        synchronized (this.f130872l) {
            try {
                if (activity == this.f130867g) {
                    this.f130867g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mo15085a().m192639P()) {
            this.f130866f.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: z */
    public final void m152644z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!mo15085a().m192639P() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f130866f.put(Integer.valueOf(activity.hashCode()), new q1y0(bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
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
}
