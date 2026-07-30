package p153l;

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
import com.google.android.gms.measurement.internal.C2477c;
import com.google.android.gms.measurement.internal.C2481g;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class say0 extends kix0 {

    /* JADX INFO: renamed from: c */
    public volatile way0 f167084c;

    /* JADX INFO: renamed from: d */
    public volatile way0 f167085d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public way0 f167086e;

    /* JADX INFO: renamed from: f */
    public final Map<Integer, way0> f167087f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("activityLock")
    public Activity f167088g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("activityLock")
    public volatile boolean f167089h;

    /* JADX INFO: renamed from: i */
    public volatile way0 f167090i;

    /* JADX INFO: renamed from: j */
    public way0 f167091j;

    /* JADX INFO: renamed from: k */
    @GuardedBy("activityLock")
    public boolean f167092k;

    /* JADX INFO: renamed from: l */
    public final Object f167093l;

    public say0(atx0 atx0Var) {
        super(atx0Var);
        this.f167093l = new Object();
        this.f167087f = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m185275D(say0 say0Var, Bundle bundle, way0 way0Var, way0 way0Var2, long j) {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
            bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        }
        say0Var.m185283H(way0Var, way0Var2, j, true, say0Var.mo15143e().m136371z(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    @Deprecated
    /* JADX INFO: renamed from: A */
    public final void m185280A(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        if (!mo15139a().m98431P()) {
            zzj().m114564G().m153300a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        way0 way0Var = this.f167084c;
        if (way0Var == null) {
            zzj().m114564G().m153300a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f167087f.get(Integer.valueOf(activity.hashCode())) == null) {
            zzj().m114564G().m153300a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m185290v(activity.getClass(), "Activity");
        }
        boolean zEquals = Objects.equals(way0Var.f188179b, str2);
        boolean zEquals2 = Objects.equals(way0Var.f188178a, str);
        if (zEquals && zEquals2) {
            zzj().m114564G().m153300a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > mo15139a().m98438l(null, false))) {
            zzj().m114564G().m153301b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > mo15139a().m98438l(null, false))) {
            zzj().m114564G().m153301b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().m114562E().m153302c("Setting current screen to name, class", str == null ? "null" : str, str2);
        way0 way0Var2 = new way0(str, str2, mo15143e().m136336L0());
        this.f167087f.put(Integer.valueOf(activity.hashCode()), way0Var2);
        m185281B(activity, way0Var2, true);
    }

    @MainThread
    /* JADX INFO: renamed from: B */
    public final void m185281B(Activity activity, way0 way0Var, boolean z) {
        way0 way0Var2;
        way0 way0Var3 = this.f167084c == null ? this.f167085d : this.f167084c;
        if (way0Var.f188179b == null) {
            way0Var2 = new way0(way0Var.f188178a, activity != null ? m185290v(activity.getClass(), "Activity") : null, way0Var.f188180c, way0Var.f188182e, way0Var.f188183f);
        } else {
            way0Var2 = way0Var;
        }
        this.f167085d = this.f167084c;
        this.f167084c = way0Var2;
        zzl().m177841w(new bby0(this, way0Var2, way0Var3, zzb().elapsedRealtime(), z));
    }

    /* JADX INFO: renamed from: C */
    public final void m185282C(Bundle bundle, long j) {
        String str;
        synchronized (this.f167093l) {
            try {
                if (!this.f167092k) {
                    zzj().m114564G().m153300a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String strM185290v = null;
                if (bundle != null) {
                    String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                    if (string != null && (string.length() <= 0 || string.length() > mo15139a().m98438l(null, false))) {
                        zzj().m114564G().m153301b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                    if (string2 != null && (string2.length() <= 0 || string2.length() > mo15139a().m98438l(null, false))) {
                        zzj().m114564G().m153301b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        strM185290v = string2;
                        str = string;
                    }
                } else {
                    str = null;
                }
                if (strM185290v == null) {
                    Activity activity = this.f167088g;
                    strM185290v = activity != null ? m185290v(activity.getClass(), "Activity") : "Activity";
                }
                String str2 = strM185290v;
                way0 way0Var = this.f167084c;
                if (this.f167089h && way0Var != null) {
                    this.f167089h = false;
                    boolean zEquals = Objects.equals(way0Var.f188179b, str2);
                    boolean zEquals2 = Objects.equals(way0Var.f188178a, str);
                    if (zEquals && zEquals2) {
                        zzj().m114564G().m153300a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzj().m114562E().m153302c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
                way0 way0Var2 = this.f167084c == null ? this.f167085d : this.f167084c;
                way0 way0Var3 = new way0(str, str2, mo15143e().m136336L0(), true, j);
                this.f167084c = way0Var3;
                this.f167085d = way0Var2;
                this.f167090i = way0Var3;
                zzl().m177841w(new gby0(this, bundle, way0Var3, way0Var2, zzb().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final void m185283H(way0 way0Var, way0 way0Var2, long j, boolean z, Bundle bundle) {
        long j2;
        mo15146h();
        boolean z2 = false;
        boolean z3 = (way0Var2 != null && way0Var2.f188180c == way0Var.f188180c && Objects.equals(way0Var2.f188179b, way0Var.f188179b) && Objects.equals(way0Var2.f188178a, way0Var.f188178a)) ? false : true;
        if (z && this.f167086e != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            hny0.m136300S(way0Var, bundle2, true);
            if (way0Var2 != null) {
                String str = way0Var2.f188178a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = way0Var2.f188179b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", way0Var2.f188180c);
            }
            if (z2) {
                long jM154432a = mo15153o().f174433f.m154432a(j);
                if (jM154432a > 0) {
                    mo15143e().m136327G(bundle2, jM154432a);
                }
            }
            if (!mo15139a().m98431P()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = way0Var.f188182e ? "app" : "auto";
            long jCurrentTimeMillis = zzb().currentTimeMillis();
            if (way0Var.f188182e) {
                long j3 = way0Var.f188183f;
                if (j3 != 0) {
                    j2 = j3;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            mo15150l().m15250V(str3, "_vs", j2, bundle2);
        }
        if (z2) {
            m185284I(this.f167086e, true, j);
        }
        this.f167086e = way0Var;
        if (way0Var.f188182e) {
            this.f167091j = way0Var;
        }
        mo15152n().m134543L(way0Var);
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final void m185284I(way0 way0Var, boolean z, long j) {
        mo15147i().m162039p(zzb().elapsedRealtime());
        if (!mo15153o().m191307y(way0Var != null && way0Var.f188181d, z, j) || way0Var == null) {
            return;
        }
        way0Var.f188181d = false;
    }

    /* JADX INFO: renamed from: J */
    public final way0 m185285J() {
        return this.f167084c;
    }

    @MainThread
    /* JADX INFO: renamed from: K */
    public final void m185286K(Activity activity) {
        synchronized (this.f167093l) {
            this.f167092k = false;
            this.f167089h = true;
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (!mo15139a().m98431P()) {
            this.f167084c = null;
            zzl().m177841w(new jby0(this, jElapsedRealtime));
        } else {
            way0 way0VarM185289N = m185289N(activity);
            this.f167085d = this.f167084c;
            this.f167084c = null;
            zzl().m177841w(new xby0(this, way0VarM185289N, jElapsedRealtime));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: L */
    public final void m185287L(Activity activity, Bundle bundle) {
        way0 way0Var;
        if (!mo15139a().m98431P() || bundle == null || (way0Var = this.f167087f.get(Integer.valueOf(activity.hashCode()))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", way0Var.f188180c);
        bundle2.putString(AuthenticationTokenClaims.JSON_KEY_NAME, way0Var.f188178a);
        bundle2.putString("referrer_name", way0Var.f188179b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @MainThread
    /* JADX INFO: renamed from: M */
    public final void m185288M(Activity activity) {
        synchronized (this.f167093l) {
            this.f167092k = true;
            if (activity != this.f167088g) {
                synchronized (this.f167093l) {
                    this.f167088g = activity;
                    this.f167089h = false;
                }
                if (mo15139a().m98431P()) {
                    this.f167090i = null;
                    zzl().m177841w(new tby0(this));
                }
            }
        }
        if (!mo15139a().m98431P()) {
            this.f167084c = this.f167090i;
            zzl().m177841w(new oby0(this));
        } else {
            m185281B(activity, m185289N(activity), false);
            n9s0 n9s0VarMo15147i = mo15147i();
            n9s0VarMo15147i.zzl().m177841w(new d6t0(n9s0VarMo15147i, n9s0VarMo15147i.zzb().elapsedRealtime()));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: N */
    public final way0 m185289N(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        way0 way0Var = this.f167087f.get(Integer.valueOf(activity.hashCode()));
        if (way0Var == null) {
            way0 way0Var2 = new way0(null, m185290v(activity.getClass(), "Activity"), mo15143e().m136336L0());
            this.f167087f.put(Integer.valueOf(activity.hashCode()), way0Var2);
            way0Var = way0Var2;
        }
        return this.f167090i != null ? this.f167090i : way0Var;
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

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ n9s0 mo15147i() {
        return super.mo15147i();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2477c mo15148j() {
        return super.mo15148j();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ zvw0 mo15149k() {
        return super.mo15149k();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2481g mo15150l() {
        return super.mo15150l();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ say0 mo15151m() {
        return super.mo15151m();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ hcy0 mo15152n() {
        return super.mo15152n();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ thy0 mo15153o() {
        return super.mo15153o();
    }

    @Override // p153l.kix0
    /* JADX INFO: renamed from: u */
    public final boolean mo15155u() {
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: v */
    public final String m185290v(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > mo15139a().m98438l(null, false) ? str2.substring(0, mo15139a().m98438l(null, false)) : str2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final way0 m185291x(boolean z) {
        m149988p();
        mo15146h();
        way0 way0Var = this.f167086e;
        return (z && way0Var == null) ? this.f167091j : way0Var;
    }

    @MainThread
    /* JADX INFO: renamed from: y */
    public final void m185292y(Activity activity) {
        synchronized (this.f167093l) {
            try {
                if (activity == this.f167088g) {
                    this.f167088g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mo15139a().m98431P()) {
            this.f167087f.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: z */
    public final void m185293z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!mo15139a().m98431P() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f167087f.put(Integer.valueOf(activity.hashCode()), new way0(bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
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
}
