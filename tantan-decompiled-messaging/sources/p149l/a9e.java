package p149l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.heytap.mcssdk.mode.Message;
import com.immomo.downloader.DownloadManager;
import com.immomo.downloader.R$string;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class a9e {

    /* JADX INFO: renamed from: g */
    private static a9e f68144g;

    /* JADX INFO: renamed from: a */
    private final NotificationManager f68145a;

    /* JADX INFO: renamed from: c */
    private Map<Integer, RemoteViews> f68147c;

    /* JADX INFO: renamed from: d */
    private Map<String, Integer> f68148d;

    /* JADX INFO: renamed from: b */
    private long f68146b = 0;

    /* JADX INFO: renamed from: e */
    private NotificationCompat.Builder f68149e = null;

    /* JADX INFO: renamed from: f */
    private int f68150f = 10000;

    private a9e() {
        NotificationManager notificationManager = (NotificationManager) ev0.m118233a().getSystemService("notification");
        this.f68145a = notificationManager;
        if (Build.VERSION.SDK_INT >= 26) {
            iw3.m138716a();
            NotificationChannel notificationChannelM194605a = up40.m194605a("com.immomo.downloader.notification", ev0.m118233a().getResources().getString(R$string.f12925a), 2);
            notificationChannelM194605a.enableLights(false);
            notificationChannelM194605a.enableVibration(false);
            notificationChannelM194605a.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannelM194605a);
        }
        this.f68147c = new HashMap();
        this.f68148d = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    private PendingIntent m95406a(String str, q8e q8eVar) {
        if (ev0.m118233a() == null) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.setPackage(ev0.m118233a().getPackageName());
        intent.putExtra(Message.TASK_ID, q8eVar.f153161a);
        return PendingIntent.getBroadcast(ev0.m118233a(), this.f68148d.get(q8eVar.f153161a).intValue(), intent, 134217728);
    }

    /* JADX INFO: renamed from: c */
    private Notification m95407c(RemoteViews remoteViews, q8e q8eVar) {
        int i;
        if (q8eVar == null || remoteViews == null || ev0.m118233a() == null) {
            return null;
        }
        if (this.f68149e == null) {
            this.f68149e = new NotificationCompat.Builder(ev0.m118233a(), "com.immomo.downloader.notification");
        }
        PendingIntent activity = q8eVar.f153181u == 3 ? PendingIntent.getActivity(ev0.m118233a(), 0, DownloadManager.m18308r().m18325p(q8eVar.f153172l), 134217728) : PendingIntent.getActivity(ev0.m118233a(), 0, new Intent(), 134217728);
        this.f68149e.setSmallIcon(DownloadManager.m18307q().f168693d);
        this.f68149e.setContentTitle(q8eVar.f153164d);
        this.f68149e.setContentText(q8eVar.f153165e);
        this.f68149e.setContentIntent(activity);
        this.f68149e.setOngoing(false);
        this.f68149e.setDeleteIntent(m95406a("com.immomo.momo.download.notification.delete", q8eVar));
        int i2 = q8eVar.f153181u;
        if (i2 == 2) {
            remoteViews.setTextViewText(m4c0.f131285f, kq3.m146920b(q8eVar.f153180t));
        } else {
            remoteViews.setTextViewText(m4c0.f131285f, q8eVar.m173409x(i2));
        }
        try {
            Bitmap bitmap = q8eVar.f153184x;
            if (bitmap == null || bitmap.isRecycled()) {
                remoteViews.setImageViewResource(m4c0.f131281b, DownloadManager.m18307q().f168694e);
            } else {
                remoteViews.setImageViewBitmap(m4c0.f131281b, q8eVar.f153184x);
            }
        } catch (OutOfMemoryError unused) {
        }
        remoteViews.setTextViewText(m4c0.f131282c, TextUtils.isEmpty(q8eVar.f153164d) ? "" : q8eVar.f153164d);
        long j = q8eVar.f153174n;
        if (j > 0) {
            i = (int) ((q8eVar.f153173m * 100) / j);
            if (i >= 100) {
                i = 100;
            }
        } else {
            i = 0;
        }
        remoteViews.setProgressBar(m4c0.f131284e, 100, i, false);
        remoteViews.setTextViewText(m4c0.f131283d, i + "%");
        int i3 = q8eVar.f153181u;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            remoteViews.setImageViewResource(m4c0.f131280a, s2c0.f161972a);
        } else if (i3 == 4) {
            remoteViews.setImageViewResource(m4c0.f131280a, s2c0.f161974c);
        } else if (i3 == 5) {
            remoteViews.setImageViewResource(m4c0.f131280a, s2c0.f161973b);
        } else if (i3 == 3 || i3 == 6) {
            remoteViews.setViewVisibility(m4c0.f131280a, 8);
        }
        remoteViews.setOnClickPendingIntent(m4c0.f131280a, m95406a("com.immomo.momo.download.notification.btn", q8eVar));
        this.f68149e.setContent(remoteViews);
        return this.f68149e.build();
    }

    /* JADX INFO: renamed from: d */
    public static a9e m95408d() {
        if (f68144g == null) {
            f68144g = new a9e();
        }
        return f68144g;
    }

    /* JADX INFO: renamed from: e */
    private int m95409e() {
        if (this.f68150f == Integer.MAX_VALUE) {
            this.f68150f = 10000;
        }
        int i = this.f68150f;
        this.f68150f = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: f */
    private void m95410f(RemoteViews remoteViews, q8e q8eVar) {
        Notification notificationM95407c = m95407c(remoteViews, q8eVar);
        if (notificationM95407c == null) {
            return;
        }
        try {
            ii5.m136337g(this.f68145a, this.f68148d.get(q8eVar.f153161a).intValue(), notificationM95407c);
        } catch (Exception e) {
            DownloadManager.m18309s().m18422e(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m95411b(String str) {
        Integer num = this.f68148d.get(str);
        if (num != null) {
            this.f68145a.cancel(num.intValue());
            this.f68147c.remove(num);
            this.f68148d.remove(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m95412g(q8e q8eVar) {
        if (q8eVar != null && q8eVar.f153179s && this.f68148d.containsKey(q8eVar.f153161a)) {
            m95410f(this.f68147c.get(this.f68148d.get(q8eVar.f153161a)), q8eVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m95413h(q8e q8eVar) {
        if (q8eVar != null && q8eVar.f153179s) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f68146b < 1000 || !this.f68148d.containsKey(q8eVar.f153161a)) {
                return;
            }
            m95410f(this.f68147c.get(this.f68148d.get(q8eVar.f153161a)), q8eVar);
            this.f68146b = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m95414i(q8e q8eVar) {
        if (q8eVar == null || ev0.m118233a() == null || !q8eVar.f153179s) {
            return;
        }
        if (!this.f68148d.containsKey(q8eVar.f153161a)) {
            int iM95409e = m95409e();
            this.f68148d.put(q8eVar.f153161a, Integer.valueOf(iM95409e));
            this.f68147c.put(Integer.valueOf(iM95409e), new RemoteViews(ev0.m118233a().getPackageName(), z5c0.f201792a));
        }
        m95410f(this.f68147c.get(this.f68148d.get(q8eVar.f153161a)), q8eVar);
    }
}
