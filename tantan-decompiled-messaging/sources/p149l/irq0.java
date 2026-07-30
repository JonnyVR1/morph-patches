package p149l;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.xiaomi.push.service.AbstractC14843an;
import com.xiaomi.push.service.C14871m;

/* JADX INFO: loaded from: classes2.dex */
class irq0 implements uqq0.InterfaceC20487a {

    /* JADX INFO: renamed from: b */
    protected Context f114675b;

    /* JADX INFO: renamed from: a */
    private PendingIntent f114674a = null;

    /* JADX INFO: renamed from: c */
    private volatile long f114676c = 0;

    public irq0(Context context) {
        this.f114675b = null;
        this.f114675b = context;
    }

    @Override // p149l.uqq0.InterfaceC20487a
    /* JADX INFO: renamed from: a */
    public void mo137912a(boolean z) {
        long jM86700a = C14871m.m86681a(this.f114675b).m86700a();
        if (z || this.f114676c != 0) {
            if (z) {
                mo137911a();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f114676c == 0) {
                this.f114676c = jElapsedRealtime + (jM86700a - (jElapsedRealtime % jM86700a));
            } else if (this.f114676c <= jElapsedRealtime) {
                this.f114676c += jM86700a;
                if (this.f114676c < jElapsedRealtime) {
                    this.f114676c = jElapsedRealtime + jM86700a;
                }
            }
            Intent intent = new Intent(AbstractC14843an.f62952q);
            intent.setPackage(this.f114675b.getPackageName());
            m137914b(intent, this.f114676c);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m137914b(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f114675b.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = Build.VERSION.SDK_INT;
        Context context = this.f114675b;
        if (i >= 31) {
            this.f114674a = PendingIntent.getBroadcast(context, 0, intent, 33554432);
        } else {
            this.f114674a = PendingIntent.getBroadcast(context, 0, intent, 0);
        }
        if (i < 31 || fvq0.m123356j(this.f114675b)) {
            ikq0.m136882e(alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.f114674a);
        } else {
            alarmManager.set(2, j, this.f114674a);
        }
        ilq0.m137053z("[Alarm] register timer " + j);
    }

    @Override // p149l.uqq0.InterfaceC20487a
    /* JADX INFO: renamed from: a */
    public void mo137911a() {
        if (this.f114674a != null) {
            try {
                ((AlarmManager) this.f114675b.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f114674a);
            } catch (Exception unused) {
            } finally {
                this.f114674a = null;
                ilq0.m137053z("[Alarm] unregister timer");
                this.f114676c = 0L;
            }
        }
        this.f114676c = 0L;
    }

    @Override // p149l.uqq0.InterfaceC20487a
    /* JADX INFO: renamed from: a */
    public boolean mo137913a() {
        return this.f114676c != 0;
    }
}
