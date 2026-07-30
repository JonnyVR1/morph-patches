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
import p149l.bey0;
import p149l.dbu0;
import p149l.dpx0;
import p149l.e01;
import p149l.ekx0;
import p149l.gux0;
import p149l.lzx0;
import p149l.nrx0;
import p149l.qdu0;
import p149l.qkq0;
import p149l.s050;
import p149l.srx0;
import p149l.ujx0;
import p149l.uyl;
import p149l.vku0;
import p149l.w7y0;
import p149l.weu0;

/* JADX INFO: loaded from: classes6.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends dbu0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public ujx0 f10443a = null;

    /* JADX INFO: renamed from: b */
    @GuardedBy("listenerMap")
    public final Map<Integer, nrx0> f10444b = new e01();

    /* JADX INFO: renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    public class C2450a implements srx0 {

        /* JADX INFO: renamed from: a */
        public weu0 f10445a;

        public C2450a(weu0 weu0Var) {
            this.f10445a = weu0Var;
        }

        @Override // p149l.srx0
        /* JADX INFO: renamed from: a */
        public final void mo15063a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f10445a.mo131149G3(str, str2, bundle, j);
            } catch (RemoteException e) {
                ujx0 ujx0Var = AppMeasurementDynamiteService.this.f10443a;
                if (ujx0Var != null) {
                    ujx0Var.zzj().m211417F().m123937b("Event interceptor threw exception", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    public class C2451b implements nrx0 {

        /* JADX INFO: renamed from: a */
        public weu0 f10447a;

        public C2451b(weu0 weu0Var) {
            this.f10447a = weu0Var;
        }

        @Override // p149l.nrx0
        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.f10447a.mo131149G3(str, str2, bundle, j);
            } catch (RemoteException e) {
                ujx0 ujx0Var = AppMeasurementDynamiteService.this.f10443a;
                if (ujx0Var != null) {
                    ujx0Var.zzj().m211417F().m123937b("Event listener threw exception", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m15062P2(qdu0 qdu0Var, String str) {
        zza();
        this.f10443a.m194106G().m101471N(qdu0Var, str);
    }

    @Override // p149l.j7u0
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zza();
        this.f10443a.m194127t().m128972r(str, j);
    }

    @Override // p149l.j7u0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15202Y(str, str2, bundle);
    }

    @Override // p149l.j7u0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15191S(null);
    }

    @Override // p149l.j7u0
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zza();
        this.f10443a.m194127t().m128974w(str, j);
    }

    @Override // p149l.j7u0
    public void generateEventId(qdu0 qdu0Var) throws RemoteException {
        zza();
        long jM101469L0 = this.f10443a.m194106G().m101469L0();
        zza();
        this.f10443a.m194106G().m101468L(qdu0Var, jM101469L0);
    }

    @Override // p149l.j7u0
    public void getAppInstanceId(qdu0 qdu0Var) throws RemoteException {
        zza();
        this.f10443a.zzl().m146305w(new ekx0(this, qdu0Var));
    }

    @Override // p149l.j7u0
    public void getCachedAppInstanceId(qdu0 qdu0Var) throws RemoteException {
        zza();
        m15062P2(qdu0Var, this.f10443a.m194102C().m15219p0());
    }

    @Override // p149l.j7u0
    public void getConditionalUserProperties(String str, String str2, qdu0 qdu0Var) throws RemoteException {
        zza();
        this.f10443a.zzl().m146305w(new lzx0(this, qdu0Var, str, str2));
    }

    @Override // p149l.j7u0
    public void getCurrentScreenClass(qdu0 qdu0Var) throws RemoteException {
        zza();
        m15062P2(qdu0Var, this.f10443a.m194102C().m15220q0());
    }

    @Override // p149l.j7u0
    public void getCurrentScreenName(qdu0 qdu0Var) throws RemoteException {
        zza();
        m15062P2(qdu0Var, this.f10443a.m194102C().m15221r0());
    }

    @Override // p149l.j7u0
    public void getGmpAppId(qdu0 qdu0Var) throws RemoteException {
        zza();
        m15062P2(qdu0Var, this.f10443a.m194102C().m15222s0());
    }

    @Override // p149l.j7u0
    public void getMaxUserProperties(String str, qdu0 qdu0Var) throws RemoteException {
        zza();
        this.f10443a.m194102C();
        C2458g.m15162y(str);
        zza();
        this.f10443a.m194106G().m101466K(qdu0Var, 25);
    }

    @Override // p149l.j7u0
    public void getSessionId(qdu0 qdu0Var) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15210g0(qdu0Var);
    }

    @Override // p149l.j7u0
    public void getTestFlag(qdu0 qdu0Var, int i) throws RemoteException {
        zza();
        if (i == 0) {
            this.f10443a.m194106G().m101471N(qdu0Var, this.f10443a.m194102C().m15223t0());
            return;
        }
        if (i == 1) {
            this.f10443a.m194106G().m101468L(qdu0Var, this.f10443a.m194102C().m15218o0().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f10443a.m194106G().m101466K(qdu0Var, this.f10443a.m194102C().m15217n0().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.f10443a.m194106G().m101475P(qdu0Var, this.f10443a.m194102C().m15215l0().booleanValue());
                return;
            }
        }
        bey0 bey0VarM194106G = this.f10443a.m194106G();
        double dDoubleValue = this.f10443a.m194102C().m15216m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            bey0VarM194106G.f165891a.zzj().m211417F().m123937b("Error returning double value to wrapper", e);
        }
    }

    @Override // p149l.j7u0
    public void getUserProperties(String str, String str2, boolean z, qdu0 qdu0Var) throws RemoteException {
        zza();
        this.f10443a.zzl().m146305w(new dpx0(this, qdu0Var, str, str2, z));
    }

    @Override // p149l.j7u0
    public void initForTests(@NonNull Map map) throws RemoteException {
        zza();
    }

    @Override // p149l.j7u0
    public void initialize(uyl uylVar, zzdw zzdwVar, long j) throws RemoteException {
        ujx0 ujx0Var = this.f10443a;
        if (ujx0Var == null) {
            this.f10443a = ujx0.m194095a((Context) Preconditions.checkNotNull((Context) s050.m181847P2(uylVar)), zzdwVar, Long.valueOf(j));
        } else {
            ujx0Var.zzj().m211417F().m123936a("Attempting to initialize multiple times");
        }
    }

    @Override // p149l.j7u0
    public void isDataCollectionEnabled(qdu0 qdu0Var) throws RemoteException {
        zza();
        this.f10443a.zzl().m146305w(new w7y0(this, qdu0Var));
    }

    @Override // p149l.j7u0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15204a0(str, str2, bundle, z, z2, j);
    }

    @Override // p149l.j7u0
    public void logEventAndBundle(String str, String str2, Bundle bundle, qdu0 qdu0Var, long j) throws RemoteException {
        zza();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f10443a.zzl().m146305w(new gux0(this, qdu0Var, new zzbf(str2, new zzbe(bundle), "app", j), str));
    }

    @Override // p149l.j7u0
    public void logHealthData(int i, @NonNull String str, @NonNull uyl uylVar, @NonNull uyl uylVar2, @NonNull uyl uylVar3) throws RemoteException {
        zza();
        this.f10443a.zzj().m211422t(i, true, false, str, uylVar == null ? null : s050.m181847P2(uylVar), uylVar2 == null ? null : s050.m181847P2(uylVar2), uylVar3 != null ? s050.m181847P2(uylVar3) : null);
    }

    @Override // p149l.j7u0
    public void onActivityCreated(@NonNull uyl uylVar, @NonNull Bundle bundle, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15213j0 = this.f10443a.m194102C().m15213j0();
        if (activityLifecycleCallbacksM15213j0 != null) {
            this.f10443a.m194102C().m15227x0();
            activityLifecycleCallbacksM15213j0.onActivityCreated((Activity) s050.m181847P2(uylVar), bundle);
        }
    }

    @Override // p149l.j7u0
    public void onActivityDestroyed(@NonNull uyl uylVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15213j0 = this.f10443a.m194102C().m15213j0();
        if (activityLifecycleCallbacksM15213j0 != null) {
            this.f10443a.m194102C().m15227x0();
            activityLifecycleCallbacksM15213j0.onActivityDestroyed((Activity) s050.m181847P2(uylVar));
        }
    }

    @Override // p149l.j7u0
    public void onActivityPaused(@NonNull uyl uylVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15213j0 = this.f10443a.m194102C().m15213j0();
        if (activityLifecycleCallbacksM15213j0 != null) {
            this.f10443a.m194102C().m15227x0();
            activityLifecycleCallbacksM15213j0.onActivityPaused((Activity) s050.m181847P2(uylVar));
        }
    }

    @Override // p149l.j7u0
    public void onActivityResumed(@NonNull uyl uylVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15213j0 = this.f10443a.m194102C().m15213j0();
        if (activityLifecycleCallbacksM15213j0 != null) {
            this.f10443a.m194102C().m15227x0();
            activityLifecycleCallbacksM15213j0.onActivityResumed((Activity) s050.m181847P2(uylVar));
        }
    }

    @Override // p149l.j7u0
    public void onActivitySaveInstanceState(uyl uylVar, qdu0 qdu0Var, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15213j0 = this.f10443a.m194102C().m15213j0();
        Bundle bundle = new Bundle();
        if (activityLifecycleCallbacksM15213j0 != null) {
            this.f10443a.m194102C().m15227x0();
            activityLifecycleCallbacksM15213j0.onActivitySaveInstanceState((Activity) s050.m181847P2(uylVar), bundle);
        }
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f10443a.zzj().m211417F().m123937b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // p149l.j7u0
    public void onActivityStarted(@NonNull uyl uylVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15213j0 = this.f10443a.m194102C().m15213j0();
        if (activityLifecycleCallbacksM15213j0 != null) {
            this.f10443a.m194102C().m15227x0();
            activityLifecycleCallbacksM15213j0.onActivityStarted((Activity) s050.m181847P2(uylVar));
        }
    }

    @Override // p149l.j7u0
    public void onActivityStopped(@NonNull uyl uylVar, long j) throws RemoteException {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksM15213j0 = this.f10443a.m194102C().m15213j0();
        if (activityLifecycleCallbacksM15213j0 != null) {
            this.f10443a.m194102C().m15227x0();
            activityLifecycleCallbacksM15213j0.onActivityStopped((Activity) s050.m181847P2(uylVar));
        }
    }

    @Override // p149l.j7u0
    public void performAction(Bundle bundle, qdu0 qdu0Var, long j) throws RemoteException {
        zza();
        qdu0Var.zza(null);
    }

    @Override // p149l.j7u0
    public void registerOnMeasurementEventListener(weu0 weu0Var) throws RemoteException {
        nrx0 c2451b;
        zza();
        synchronized (this.f10444b) {
            try {
                c2451b = this.f10444b.get(Integer.valueOf(weu0Var.zza()));
                if (c2451b == null) {
                    c2451b = new C2451b(weu0Var);
                    this.f10444b.put(Integer.valueOf(weu0Var.zza()), c2451b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10443a.m194102C().m15211h0(c2451b);
    }

    @Override // p149l.j7u0
    public void resetAnalyticsData(long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15168C(j);
    }

    @Override // p149l.j7u0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        zza();
        ujx0 ujx0Var = this.f10443a;
        if (bundle == null) {
            ujx0Var.zzj().m211412A().m123936a("Conditional user property must not be null");
        } else {
            ujx0Var.m194102C().m15180I0(bundle, j);
        }
    }

    @Override // p149l.j7u0
    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15192S0(bundle, j);
    }

    @Override // p149l.j7u0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15201X0(bundle, j);
    }

    @Override // p149l.j7u0
    public void setCurrentScreen(@NonNull uyl uylVar, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        zza();
        this.f10443a.m194103D().m152631A((Activity) s050.m181847P2(uylVar), str, str2);
    }

    @Override // p149l.j7u0
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15199W0(z);
    }

    @Override // p149l.j7u0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zza();
        this.f10443a.m194102C().m15190R0(bundle);
    }

    @Override // p149l.j7u0
    public void setEventInterceptor(weu0 weu0Var) throws RemoteException {
        zza();
        C2450a c2450a = new C2450a(weu0Var);
        boolean zM146299D = this.f10443a.zzl().m146299D();
        ujx0 ujx0Var = this.f10443a;
        if (zM146299D) {
            ujx0Var.m194102C().m15212i0(c2450a);
        } else {
            ujx0Var.zzl().m146305w(new RunnableC2459h(this, c2450a));
        }
    }

    @Override // p149l.j7u0
    public void setInstanceIdProvider(vku0 vku0Var) throws RemoteException {
        zza();
    }

    @Override // p149l.j7u0
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15191S(Boolean.valueOf(z));
    }

    @Override // p149l.j7u0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zza();
    }

    @Override // p149l.j7u0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15189Q0(j);
    }

    @Override // p149l.j7u0
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15172E(intent);
    }

    @Override // p149l.j7u0
    public void setUserId(@NonNull String str, long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15194U(str, j);
    }

    @Override // p149l.j7u0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull uyl uylVar, boolean z, long j) throws RemoteException {
        zza();
        this.f10443a.m194102C().m15207d0(str, str2, s050.m181847P2(uylVar), z, j);
    }

    @Override // p149l.j7u0
    public void unregisterOnMeasurementEventListener(weu0 weu0Var) throws RemoteException {
        nrx0 nrx0VarRemove;
        zza();
        synchronized (this.f10444b) {
            nrx0VarRemove = this.f10444b.remove(Integer.valueOf(weu0Var.zza()));
        }
        if (nrx0VarRemove == null) {
            nrx0VarRemove = new C2451b(weu0Var);
        }
        this.f10443a.m194102C().m15187O0(nrx0VarRemove);
    }

    @EnsuresNonNull({"scion"})
    public final void zza() {
        if (this.f10443a != null) {
            return;
        }
        qkq0.m175383a("Attempting to perform action before initialize.");
    }
}
