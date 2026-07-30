package p149l;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2456e;
import com.google.android.gms.measurement.internal.C2461j;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class eay0 extends hay0 {

    /* JADX INFO: renamed from: d */
    public final AlarmManager f90277d;

    /* JADX INFO: renamed from: e */
    public ftr0 f90278e;

    /* JADX INFO: renamed from: f */
    public Integer f90279f;

    public eay0(C2461j c2461j) {
        super(c2461j);
        this.f90277d = (AlarmManager) zza().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: x */
    private final void m115440x() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m115443u());
        }
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

    @Override // p149l.kay0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ pdy0 mo15138i() {
        return super.mo15138i();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ jny0 mo15139j() {
        return super.mo15139j();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ igr0 mo15140k() {
        return super.mo15140k();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2456e mo15141l() {
        return super.mo15141l();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ e7y0 mo15142m() {
        return super.mo15142m();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ pay0 mo15143n() {
        return super.mo15143n();
    }

    @Override // p149l.hay0
    /* JADX INFO: renamed from: r */
    public final boolean mo15144r() {
        AlarmManager alarmManager = this.f90277d;
        if (alarmManager != null) {
            alarmManager.cancel(m115444v());
        }
        m115440x();
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m115441s(long j) {
        m130251o();
        Context contextZza = zza();
        if (!bey0.m101437X(contextZza)) {
            zzj().m211424z().m123936a("Receiver not registered/enabled");
        }
        if (!bey0.m101438Y(contextZza, false)) {
            zzj().m211424z().m123936a("Service not registered/enabled");
        }
        m115442t();
        zzj().m211416E().m123937b("Scheduling upload, millis", Long.valueOf(j));
        zzb().elapsedRealtime();
        if (j < Math.max(0L, q8s0.f153331z.m188827a(null).longValue()) && !m115445w().m123086e()) {
            m115445w().m123085b(j);
        }
        Context contextZza2 = zza();
        ComponentName componentName = new ComponentName(contextZza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM115443u = m115443u();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        not0.m160423c(contextZza2, new JobInfo.Builder(iM115443u, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* JADX INFO: renamed from: t */
    public final void m115442t() {
        m130251o();
        zzj().m211416E().m123936a("Unscheduling upload");
        AlarmManager alarmManager = this.f90277d;
        if (alarmManager != null) {
            alarmManager.cancel(m115444v());
        }
        m115445w().m123084a();
        m115440x();
    }

    /* JADX INFO: renamed from: u */
    public final int m115443u() {
        if (this.f90279f == null) {
            this.f90279f = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f90279f.intValue();
    }

    /* JADX INFO: renamed from: v */
    public final PendingIntent m115444v() {
        Context contextZza = zza();
        return tpt0.m190008a(contextZza, 0, new Intent().setClassName(contextZza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), tpt0.f171507a);
    }

    /* JADX INFO: renamed from: w */
    public final ftr0 m115445w() {
        if (this.f90278e == null) {
            this.f90278e = new bay0(this, this.f122162b.m15299o0());
        }
        return this.f90278e;
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
