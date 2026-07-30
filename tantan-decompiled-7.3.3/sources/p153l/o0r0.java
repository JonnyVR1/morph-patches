package p153l;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.xiaomi.push.service.AbstractC14991an;
import com.xiaomi.push.service.C15019m;

/* JADX INFO: loaded from: classes2.dex */
class o0r0 implements a0r0.InterfaceC15614a {

    /* JADX INFO: renamed from: b */
    protected Context f144568b;

    /* JADX INFO: renamed from: a */
    private PendingIntent f144567a = null;

    /* JADX INFO: renamed from: c */
    private volatile long f144569c = 0;

    public o0r0(Context context) {
        this.f144568b = null;
        this.f144568b = context;
    }

    @Override // p153l.a0r0.InterfaceC15614a
    /* JADX INFO: renamed from: a */
    public void mo95415a(boolean z) {
        long jM87871a = C15019m.m87852a(this.f144568b).m87871a();
        if (z || this.f144569c != 0) {
            if (z) {
                mo95414a();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f144569c == 0) {
                this.f144569c = jElapsedRealtime + (jM87871a - (jElapsedRealtime % jM87871a));
            } else if (this.f144569c <= jElapsedRealtime) {
                this.f144569c += jM87871a;
                if (this.f144569c < jElapsedRealtime) {
                    this.f144569c = jElapsedRealtime + jM87871a;
                }
            }
            Intent intent = new Intent(AbstractC14991an.f63799q);
            intent.setPackage(this.f144568b.getPackageName());
            m165546b(intent, this.f144569c);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m165546b(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f144568b.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = Build.VERSION.SDK_INT;
        Context context = this.f144568b;
        if (i >= 31) {
            this.f144567a = PendingIntent.getBroadcast(context, 0, intent, 33554432);
        } else {
            this.f144567a = PendingIntent.getBroadcast(context, 0, intent, 0);
        }
        if (i < 31 || l4r0.m152825j(this.f144568b)) {
            otq0.m169167e(alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.f144567a);
        } else {
            alarmManager.set(2, j, this.f144567a);
        }
        ouq0.m169406z("[Alarm] register timer " + j);
    }

    @Override // p153l.a0r0.InterfaceC15614a
    /* JADX INFO: renamed from: a */
    public void mo95414a() {
        if (this.f144567a != null) {
            try {
                ((AlarmManager) this.f144568b.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f144567a);
            } catch (Exception unused) {
            } finally {
                this.f144567a = null;
                ouq0.m169406z("[Alarm] unregister timer");
                this.f144569c = 0L;
            }
        }
        this.f144569c = 0L;
    }

    @Override // p153l.a0r0.InterfaceC15614a
    /* JADX INFO: renamed from: a */
    public boolean mo95416a() {
        return this.f144569c != 0;
    }
}
