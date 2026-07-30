package p149l;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2461j;
import p149l.q8y0;

/* JADX INFO: loaded from: classes6.dex */
public final class j7y0<T extends Context & q8y0> {

    /* JADX INFO: renamed from: a */
    public final T f116663a;

    public j7y0(T t) {
        Preconditions.checkNotNull(t);
        this.f116663a = t;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public final int m140123a(final Intent intent, int i, final int i2) {
        final xww0 xww0VarZzj = ujx0.m194095a(this.f116663a, null, null).zzj();
        if (intent == null) {
            xww0VarZzj.m211417F().m123936a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        xww0VarZzj.m211416E().m123938c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m140127e(new Runnable() { // from class: l.k8y0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f121884a.m140126d(i2, xww0VarZzj, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final IBinder m140124b(Intent intent) {
        if (intent == null) {
            m140132j().m211412A().m123936a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new clx0(C2461j.m15245e(this.f116663a));
        }
        m140132j().m211417F().m123937b("onBind received unknown action", action);
        return null;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m140125c() {
        ujx0.m194095a(this.f116663a, null, null).zzj().m211416E().m123936a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m140126d(int i, xww0 xww0Var, Intent intent) {
        if (this.f116663a.zza(i)) {
            xww0Var.m211416E().m123937b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m140132j().m211416E().m123936a("Completed wakeful intent.");
            this.f116663a.zza(intent);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m140127e(Runnable runnable) {
        C2461j c2461jM15245e = C2461j.m15245e(this.f116663a);
        c2461jM15245e.zzl().m146305w(new l7y0(this, c2461jM15245e, runnable));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m140128f(xww0 xww0Var, JobParameters jobParameters) {
        xww0Var.m211416E().m123936a("AppMeasurementJobService processed last upload request.");
        this.f116663a.zza(jobParameters, false);
    }

    @TargetApi(24)
    @MainThread
    /* JADX INFO: renamed from: g */
    public final boolean m140129g(final JobParameters jobParameters) {
        final xww0 xww0VarZzj = ujx0.m194095a(this.f116663a, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        xww0VarZzj.m211416E().m123937b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m140127e(new Runnable() { // from class: l.g7y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101460a.m140128f(xww0VarZzj, jobParameters);
            }
        });
        return true;
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public final void m140130h() {
        ujx0.m194095a(this.f116663a, null, null).zzj().m211416E().m123936a("Local AppMeasurementService is shutting down");
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public final void m140131i(Intent intent) {
        if (intent == null) {
            m140132j().m211412A().m123936a("onRebind called with null intent");
        } else {
            m140132j().m211416E().m123937b("onRebind called. action", intent.getAction());
        }
    }

    /* JADX INFO: renamed from: j */
    public final xww0 m140132j() {
        return ujx0.m194095a(this.f116663a, null, null).zzj();
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public final boolean m140133k(Intent intent) {
        if (intent == null) {
            m140132j().m211412A().m123936a("onUnbind called with null intent");
            return true;
        }
        m140132j().m211416E().m123937b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
