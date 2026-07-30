package p153l;

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
import com.google.android.gms.measurement.internal.C2479e;
import com.google.android.gms.measurement.internal.C2484j;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class kjy0 extends njy0 {

    /* JADX INFO: renamed from: d */
    public final AlarmManager f127152d;

    /* JADX INFO: renamed from: e */
    public l2s0 f127153e;

    /* JADX INFO: renamed from: f */
    public Integer f127154f;

    public kjy0(C2484j c2484j) {
        super(c2484j);
        this.f127152d = (AlarmManager) zza().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: x */
    private final void m150077x() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m150080u());
        }
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

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ vmy0 mo15192i() {
        return super.mo15192i();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ pwy0 mo15193j() {
        return super.mo15193j();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ opr0 mo15194k() {
        return super.mo15194k();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2479e mo15195l() {
        return super.mo15195l();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ kgy0 mo15196m() {
        return super.mo15196m();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ vjy0 mo15197n() {
        return super.mo15197n();
    }

    @Override // p153l.njy0
    /* JADX INFO: renamed from: r */
    public final boolean mo15198r() {
        AlarmManager alarmManager = this.f127152d;
        if (alarmManager != null) {
            alarmManager.cancel(m150081v());
        }
        m150077x();
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m150078s(long j) {
        m163482o();
        Context contextZza = zza();
        if (!hny0.m136304X(contextZza)) {
            zzj().m114570z().m153300a("Receiver not registered/enabled");
        }
        if (!hny0.m136305Y(contextZza, false)) {
            zzj().m114570z().m153300a("Service not registered/enabled");
        }
        m150079t();
        zzj().m114562E().m153301b("Scheduling upload, millis", Long.valueOf(j));
        zzb().elapsedRealtime();
        if (j < Math.max(0L, whs0.f189307z.m220931a(null).longValue()) && !m150082w().m152634e()) {
            m150082w().m152633b(j);
        }
        Context contextZza2 = zza();
        ComponentName componentName = new ComponentName(contextZza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM150080u = m150080u();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        txt0.m193534c(contextZza2, new JobInfo.Builder(iM150080u, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* JADX INFO: renamed from: t */
    public final void m150079t() {
        m163482o();
        zzj().m114562E().m153300a("Unscheduling upload");
        AlarmManager alarmManager = this.f127152d;
        if (alarmManager != null) {
            alarmManager.cancel(m150081v());
        }
        m150082w().m152632a();
        m150077x();
    }

    /* JADX INFO: renamed from: u */
    public final int m150080u() {
        if (this.f127154f == null) {
            this.f127154f = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f127154f.intValue();
    }

    /* JADX INFO: renamed from: v */
    public final PendingIntent m150081v() {
        Context contextZza = zza();
        return zyt0.m222151a(contextZza, 0, new Intent().setClassName(contextZza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zyt0.f206633a);
    }

    /* JADX INFO: renamed from: w */
    public final l2s0 m150082w() {
        if (this.f127153e == null) {
            this.f127153e = new hjy0(this, this.f158066b.m15353o0());
        }
        return this.f127153e;
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
