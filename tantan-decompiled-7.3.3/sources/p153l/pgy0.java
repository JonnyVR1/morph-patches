package p153l;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2484j;
import p153l.why0;

/* JADX INFO: loaded from: classes6.dex */
public final class pgy0<T extends Context & why0> {

    /* JADX INFO: renamed from: a */
    public final T f152369a;

    public pgy0(T t) {
        Preconditions.checkNotNull(t);
        this.f152369a = t;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public final int m172304a(final Intent intent, int i, final int i2) {
        final d6x0 d6x0VarZzj = atx0.m100275a(this.f152369a, null, null).zzj();
        if (intent == null) {
            d6x0VarZzj.m114563F().m153300a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        d6x0VarZzj.m114562E().m153302c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m172308e(new Runnable() { // from class: l.qhy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157782a.m172307d(i2, d6x0VarZzj, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final IBinder m172305b(Intent intent) {
        if (intent == null) {
            m172313j().m114558A().m153300a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new iux0(C2484j.m15299e(this.f152369a));
        }
        m172313j().m114563F().m153301b("onBind received unknown action", action);
        return null;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m172306c() {
        atx0.m100275a(this.f152369a, null, null).zzj().m114562E().m153300a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m172307d(int i, d6x0 d6x0Var, Intent intent) {
        if (this.f152369a.zza(i)) {
            d6x0Var.m114562E().m153301b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m172313j().m114562E().m153300a("Completed wakeful intent.");
            this.f152369a.zza(intent);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m172308e(Runnable runnable) {
        C2484j c2484jM15299e = C2484j.m15299e(this.f152369a);
        c2484jM15299e.zzl().m177841w(new rgy0(this, c2484jM15299e, runnable));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m172309f(d6x0 d6x0Var, JobParameters jobParameters) {
        d6x0Var.m114562E().m153300a("AppMeasurementJobService processed last upload request.");
        this.f152369a.zza(jobParameters, false);
    }

    @TargetApi(24)
    @MainThread
    /* JADX INFO: renamed from: g */
    public final boolean m172310g(final JobParameters jobParameters) {
        final d6x0 d6x0VarZzj = atx0.m100275a(this.f152369a, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        d6x0VarZzj.m114562E().m153301b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m172308e(new Runnable() { // from class: l.mgy0
            @Override // java.lang.Runnable
            public final void run() {
                this.f136809a.m172309f(d6x0VarZzj, jobParameters);
            }
        });
        return true;
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public final void m172311h() {
        atx0.m100275a(this.f152369a, null, null).zzj().m114562E().m153300a("Local AppMeasurementService is shutting down");
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public final void m172312i(Intent intent) {
        if (intent == null) {
            m172313j().m114558A().m153300a("onRebind called with null intent");
        } else {
            m172313j().m114562E().m153301b("onRebind called. action", intent.getAction());
        }
    }

    /* JADX INFO: renamed from: j */
    public final d6x0 m172313j() {
        return atx0.m100275a(this.f152369a, null, null).zzj();
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public final boolean m172314k(Intent intent) {
        if (intent == null) {
            m172313j().m114558A().m153300a("onUnbind called with null intent");
            return true;
        }
        m172313j().m114562E().m153301b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
