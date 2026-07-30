package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzdw;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p153l.atx0;
import p153l.buu0;
import p153l.chy0;
import p153l.cou0;
import p153l.h950;
import p153l.hny0;
import p153l.jku0;
import p153l.jyx0;
import p153l.ktx0;
import p153l.l01;
import p153l.m3y0;
import p153l.p1m;
import p153l.r8y0;
import p153l.t0y0;
import p153l.wmu0;
import p153l.wtq0;
import p153l.y0y0;

/* JADX INFO: loaded from: classes6.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends jku0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public atx0 f10480a = null;

    /* JADX INFO: renamed from: b */
    @GuardedBy("listenerMap")
    public final Map<Integer, t0y0> f10481b = new l01();

    /* JADX INFO: renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    public class C2473a implements y0y0 {

        /* JADX INFO: renamed from: a */
        public cou0 f10482a;

        public C2473a(cou0 cou0Var) {
            this.f10482a = cou0Var;
        }

        @Override // p153l.y0y0
        /* JADX INFO: renamed from: a */
        public final void mo15117a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f10482a.mo111709G3(str, str2, bundle, j);
            } catch (RemoteException e) {
                atx0 atx0Var = AppMeasurementDynamiteService.this.f10480a;
                if (atx0Var != null) {
                    atx0Var.zzj().m114563F().m153301b("Event interceptor threw exception", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    public class C2474b implements t0y0 {

        /* JADX INFO: renamed from: a */
        public cou0 f10484a;

        public C2474b(cou0 cou0Var) {
            this.f10484a = cou0Var;
        }

        @Override // p153l.t0y0
        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.f10484a.mo111709G3(str, str2, bundle, j);
            } catch (RemoteException e) {
                atx0 atx0Var = AppMeasurementDynamiteService.this.f10480a;
                if (atx0Var != null) {
                    atx0Var.zzj().m114563F().m153301b("Event listener threw exception", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m15116P2(wmu0 wmu0Var, String str) {
        zza();
        this.f10480a.m100286G().m136338N(wmu0Var, str);
    }

    @Override // p153l.pgu0
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zza();
        this.f10480a.m100307t().m162041r(str, j);
    }

    @Override // p153l.pgu0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15256Y(str, str2, bundle);
    }

    @Override // p153l.pgu0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15245S(null);
    }

    @Override // p153l.pgu0
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zza();
        this.f10480a.m100307t().m162043w(str, j);
    }

    @Override // p153l.pgu0
    public void generateEventId(wmu0 wmu0Var) throws RemoteException {
        zza();
        long jM136336L0 = this.f10480a.m100286G().m136336L0();
        zza();
        this.f10480a.m100286G().m136335L(wmu0Var, jM136336L0);
    }

    @Override // p153l.pgu0
    public void getAppInstanceId(wmu0 wmu0Var) throws RemoteException {
        zza();
        this.f10480a.zzl().m177841w(new ktx0(this, wmu0Var));
    }

    @Override // p153l.pgu0
    public void getCachedAppInstanceId(wmu0 wmu0Var) throws RemoteException {
        zza();
        m15116P2(wmu0Var, this.f10480a.m100282C().m15273p0());
    }

    @Override // p153l.pgu0
    public void getConditionalUserProperties(String str, String str2, wmu0 wmu0Var) throws RemoteException {
        zza();
        this.f10480a.zzl().m177841w(new r8y0(this, wmu0Var, str, str2));
    }

    @Override // p153l.pgu0
    public void getCurrentScreenClass(wmu0 wmu0Var) throws RemoteException {
        zza();
        m15116P2(wmu0Var, this.f10480a.m100282C().m15274q0());
    }

    @Override // p153l.pgu0
    public void getCurrentScreenName(wmu0 wmu0Var) throws RemoteException {
        zza();
        m15116P2(wmu0Var, this.f10480a.m100282C().m15275r0());
    }

    @Override // p153l.pgu0
    public void getGmpAppId(wmu0 wmu0Var) throws RemoteException {
        zza();
        m15116P2(wmu0Var, this.f10480a.m100282C().m15276s0());
    }

    @Override // p153l.pgu0
    public void getMaxUserProperties(String str, wmu0 wmu0Var) throws RemoteException {
        zza();
        this.f10480a.m100282C();
        C2481g.m15216y(str);
        zza();
        this.f10480a.m100286G().m136333K(wmu0Var, 25);
    }

    @Override // p153l.pgu0
    public void getSessionId(wmu0 wmu0Var) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15264g0(wmu0Var);
    }

    @Override // p153l.pgu0
    public void getTestFlag(wmu0 wmu0Var, int i) throws RemoteException {
        zza();
        if (i == 0) {
            this.f10480a.m100286G().m136338N(wmu0Var, this.f10480a.m100282C().m15277t0());
            return;
        }
        if (i == 1) {
            this.f10480a.m100286G().m136335L(wmu0Var, this.f10480a.m100282C().m15272o0().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f10480a.m100286G().m136333K(wmu0Var, this.f10480a.m100282C().m15271n0().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.f10480a.m100286G().m136342P(wmu0Var, this.f10480a.m100282C().m15269l0().booleanValue());
                return;
            }
        }
        hny0 hny0VarM100286G = this.f10480a.m100286G();
        double dDoubleValue = this.f10480a.m100282C().m15270m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            wmu0Var.zza(bundle);
        } catch (RemoteException e) {
            hny0VarM100286G.f202159a.zzj().m114563F().m153301b("Error returning double value to wrapper", e);
        }
    }

    @Override // p153l.pgu0
    public void getUserProperties(String str, String str2, boolean z, wmu0 wmu0Var) throws RemoteException {
        zza();
        this.f10480a.zzl().m177841w(new jyx0(this, wmu0Var, str, str2, z));
    }

    @Override // p153l.pgu0
    public void initForTests(@NonNull Map map) throws RemoteException {
        zza();
    }

    @Override // p153l.pgu0
    public void initialize(p1m p1mVar, zzdw zzdwVar, long j) throws RemoteException {
        atx0 atx0Var = this.f10480a;
        if (atx0Var == null) {
            this.f10480a = atx0.m100275a((Context) Preconditions.checkNotNull((Context) h950.m134037P2(p1mVar)), zzdwVar, Long.valueOf(j));
        } else {
            atx0Var.zzj().m114563F().m153300a("Attempting to initialize multiple times");
        }
    }

    @Override // p153l.pgu0
    public void isDataCollectionEnabled(wmu0 wmu0Var) throws RemoteException {
        zza();
        this.f10480a.zzl().m177841w(new chy0(this, wmu0Var));
    }

    @Override // p153l.pgu0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15258a0(str, str2, bundle, z, z2, j);
    }

    @Override // p153l.pgu0
    public void logEventAndBundle(String str, String str2, Bundle bundle, wmu0 wmu0Var, long j) throws RemoteException {
        zza();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f10480a.zzl().m177841w(new m3y0(this, wmu0Var, new zzbf(str2, new zzbe(bundle), "app", j), str));
    }

    @Override // p153l.pgu0
    public void logHealthData(int i, @NonNull String str, @NonNull p1m p1mVar, @NonNull p1m p1mVar2, @NonNull p1m p1mVar3) throws RemoteException {
        zza();
        this.f10480a.zzj().m114568t(i, true, false, str, p1mVar == null ? null : h950.m134037P2(p1mVar), p1mVar2 == null ? null : h950.m134037P2(p1mVar2), p1mVar3 != null ? h950.m134037P2(p1mVar3) : null);
    }

    @Override // p153l.pgu0
    public void onActivityCreated(@NonNull p1m p1mVar, @NonNull Bundle bundle, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15267j0 = this.f10480a.m100282C().m15267j0();
        if (activityLifecycleCallbacksM15267j0 != null) {
            this.f10480a.m100282C().m15281x0();
            activityLifecycleCallbacksM15267j0.onActivityCreated((Activity) h950.m134037P2(p1mVar), bundle);
        }
    }

    @Override // p153l.pgu0
    public void onActivityDestroyed(@NonNull p1m p1mVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15267j0 = this.f10480a.m100282C().m15267j0();
        if (activityLifecycleCallbacksM15267j0 != null) {
            this.f10480a.m100282C().m15281x0();
            activityLifecycleCallbacksM15267j0.onActivityDestroyed((Activity) h950.m134037P2(p1mVar));
        }
    }

    @Override // p153l.pgu0
    public void onActivityPaused(@NonNull p1m p1mVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15267j0 = this.f10480a.m100282C().m15267j0();
        if (activityLifecycleCallbacksM15267j0 != null) {
            this.f10480a.m100282C().m15281x0();
            activityLifecycleCallbacksM15267j0.onActivityPaused((Activity) h950.m134037P2(p1mVar));
        }
    }

    @Override // p153l.pgu0
    public void onActivityResumed(@NonNull p1m p1mVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15267j0 = this.f10480a.m100282C().m15267j0();
        if (activityLifecycleCallbacksM15267j0 != null) {
            this.f10480a.m100282C().m15281x0();
            activityLifecycleCallbacksM15267j0.onActivityResumed((Activity) h950.m134037P2(p1mVar));
        }
    }

    @Override // p153l.pgu0
    public void onActivitySaveInstanceState(p1m p1mVar, wmu0 wmu0Var, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15267j0 = this.f10480a.m100282C().m15267j0();
        Bundle bundle = new Bundle();
        if (activityLifecycleCallbacksM15267j0 != null) {
            this.f10480a.m100282C().m15281x0();
            activityLifecycleCallbacksM15267j0.onActivitySaveInstanceState((Activity) h950.m134037P2(p1mVar), bundle);
        }
        try {
            wmu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f10480a.zzj().m114563F().m153301b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // p153l.pgu0
    public void onActivityStarted(@NonNull p1m p1mVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15267j0 = this.f10480a.m100282C().m15267j0();
        if (activityLifecycleCallbacksM15267j0 != null) {
            this.f10480a.m100282C().m15281x0();
            activityLifecycleCallbacksM15267j0.onActivityStarted((Activity) h950.m134037P2(p1mVar));
        }
    }

    @Override // p153l.pgu0
    public void onActivityStopped(@NonNull p1m p1mVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15267j0 = this.f10480a.m100282C().m15267j0();
        if (activityLifecycleCallbacksM15267j0 != null) {
            this.f10480a.m100282C().m15281x0();
            activityLifecycleCallbacksM15267j0.onActivityStopped((Activity) h950.m134037P2(p1mVar));
        }
    }

    @Override // p153l.pgu0
    public void performAction(Bundle bundle, wmu0 wmu0Var, long j) throws RemoteException {
        zza();
        wmu0Var.zza(null);
    }

    @Override // p153l.pgu0
    public void registerOnMeasurementEventListener(cou0 cou0Var) throws RemoteException {
        t0y0 c2474b;
        zza();
        synchronized (this.f10481b) {
            try {
                c2474b = this.f10481b.get(Integer.valueOf(cou0Var.zza()));
                if (c2474b == null) {
                    c2474b = new C2474b(cou0Var);
                    this.f10481b.put(Integer.valueOf(cou0Var.zza()), c2474b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10480a.m100282C().m15265h0(c2474b);
    }

    @Override // p153l.pgu0
    public void resetAnalyticsData(long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15222C(j);
    }

    @Override // p153l.pgu0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        zza();
        atx0 atx0Var = this.f10480a;
        if (bundle == null) {
            atx0Var.zzj().m114558A().m153300a("Conditional user property must not be null");
        } else {
            atx0Var.m100282C().m15234I0(bundle, j);
        }
    }

    @Override // p153l.pgu0
    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15246S0(bundle, j);
    }

    @Override // p153l.pgu0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15255X0(bundle, j);
    }

    @Override // p153l.pgu0
    public void setCurrentScreen(@NonNull p1m p1mVar, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        zza();
        this.f10480a.m100283D().m185280A((Activity) h950.m134037P2(p1mVar), str, str2);
    }

    @Override // p153l.pgu0
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15253W0(z);
    }

    @Override // p153l.pgu0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zza();
        this.f10480a.m100282C().m15244R0(bundle);
    }

    @Override // p153l.pgu0
    public void setEventInterceptor(cou0 cou0Var) throws RemoteException {
        zza();
        C2473a c2473a = new C2473a(cou0Var);
        boolean zM177835D = this.f10480a.zzl().m177835D();
        atx0 atx0Var = this.f10480a;
        if (zM177835D) {
            atx0Var.m100282C().m15266i0(c2473a);
        } else {
            atx0Var.zzl().m177841w(new RunnableC2482h(this, c2473a));
        }
    }

    @Override // p153l.pgu0
    public void setInstanceIdProvider(buu0 buu0Var) throws RemoteException {
        zza();
    }

    @Override // p153l.pgu0
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15245S(Boolean.valueOf(z));
    }

    @Override // p153l.pgu0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zza();
    }

    @Override // p153l.pgu0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15243Q0(j);
    }

    @Override // p153l.pgu0
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15226E(intent);
    }

    @Override // p153l.pgu0
    public void setUserId(@NonNull String str, long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15248U(str, j);
    }

    @Override // p153l.pgu0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull p1m p1mVar, boolean z, long j) throws RemoteException {
        zza();
        this.f10480a.m100282C().m15261d0(str, str2, h950.m134037P2(p1mVar), z, j);
    }

    @Override // p153l.pgu0
    public void unregisterOnMeasurementEventListener(cou0 cou0Var) throws RemoteException {
        t0y0 t0y0VarRemove;
        zza();
        synchronized (this.f10481b) {
            t0y0VarRemove = this.f10481b.remove(Integer.valueOf(cou0Var.zza()));
        }
        if (t0y0VarRemove == null) {
            t0y0VarRemove = new C2474b(cou0Var);
        }
        this.f10480a.m100282C().m15241O0(t0y0VarRemove);
    }

    @EnsuresNonNull({"scion"})
    public final void zza() {
        if (this.f10480a != null) {
            return;
        }
        wtq0.m207906a("Attempting to perform action before initialize.");
    }
}
