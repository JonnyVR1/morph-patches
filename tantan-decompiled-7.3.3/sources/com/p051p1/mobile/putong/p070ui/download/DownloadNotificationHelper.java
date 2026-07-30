package com.p051p1.mobile.putong.p070ui.download;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import p153l.c050;
import p153l.hx3;
import p153l.i9e;
import p153l.iy40;
import p153l.k26;
import p153l.pbc0;

/* JADX INFO: loaded from: classes10.dex */
public class DownloadNotificationHelper {

    /* JADX INFO: renamed from: a */
    public c050 f55289a;

    /* JADX INFO: renamed from: b */
    public SparseArray<NotificationCompat.Builder> f55290b = new SparseArray<>();

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                int i = intent.getExtras().getInt("task_id", 0);
                String action = intent.getAction();
                if (action == null || i == 0) {
                    return;
                }
                DownloadTask downloadTaskM80853t = C13274a.m80837u().m80853t(i);
                if (downloadTaskM80853t == null) {
                    C13274a.m80837u().m80846m(i);
                    return;
                }
                if (action.equals("cancel")) {
                    C13274a.m80837u().m80847n(downloadTaskM80853t);
                } else if (action.equals("pause")) {
                    C13274a.m80837u().m80858z(downloadTaskM80853t);
                } else if (action.equals("resume")) {
                    C13274a.m80837u().m80841D(downloadTaskM80853t);
                }
            }
        }
    }

    static {
        m80752g();
    }

    public DownloadNotificationHelper() {
        this.f55289a = null;
        this.f55289a = c050.m107319e(k26.m147943a());
    }

    /* JADX INFO: renamed from: g */
    public static void m80752g() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) k26.m147943a().getSystemService("notification")) == null) {
            return;
        }
        hx3.m137557a();
        NotificationChannel notificationChannelM142608a = iy40.m142608a("tantan_download", k26.m147943a().getResources().getString(R$string.f55345b), 2);
        notificationChannelM142608a.setDescription(k26.m147943a().getResources().getString(R$string.f55344a));
        notificationChannelM142608a.setSound(null, null);
        notificationManager.createNotificationChannel(notificationChannelM142608a);
    }

    /* JADX INFO: renamed from: a */
    public void m80753a(int i) {
        NotificationCompat.Builder ongoing = m80759h(k26.m147943a()).setSmallIcon(pbc0.f151374a).setContentTitle("").setContentText("").setAutoCancel(false).setShowWhen(false).setOngoing(true);
        synchronized (this.f55290b) {
            this.f55290b.put(i, ongoing);
        }
        m80755c(i);
        m80756d(i);
    }

    /* JADX INFO: renamed from: b */
    public final NotificationCompat.Action m80754b(NotificationCompat.Builder builder, int i) {
        ArrayList<NotificationCompat.Action> arrayList;
        if (builder == null || i9e.m139094a() || (arrayList = builder.mActions) == null) {
            return null;
        }
        if (arrayList.size() > i) {
            return arrayList.get(i);
        }
        NotificationCompat.Action action = new NotificationCompat.Action(0, (CharSequence) null, (PendingIntent) null);
        arrayList.add(action);
        return action;
    }

    /* JADX INFO: renamed from: c */
    public void m80755c(int i) {
        NotificationCompat.Action actionM80754b;
        NotificationCompat.Builder builderM80760i = m80760i(i);
        if (builderM80760i == null || (actionM80754b = m80754b(builderM80760i, 0)) == null) {
            return;
        }
        actionM80754b.icon = 0;
        actionM80754b.title = k26.m147943a().getString(R$string.f55346c);
        actionM80754b.actionIntent = m80761j(i, "cancel");
    }

    /* JADX INFO: renamed from: d */
    public void m80756d(int i) {
        NotificationCompat.Action actionM80754b;
        NotificationCompat.Builder builderM80760i = m80760i(i);
        if (builderM80760i == null || (actionM80754b = m80754b(builderM80760i, 1)) == null) {
            return;
        }
        actionM80754b.icon = 0;
        actionM80754b.title = k26.m147943a().getString(R$string.f55349f);
        actionM80754b.actionIntent = m80761j(i, "pause");
    }

    /* JADX INFO: renamed from: e */
    public void m80757e(int i) {
        NotificationCompat.Action actionM80754b;
        NotificationCompat.Builder builderM80760i = m80760i(i);
        if (builderM80760i == null || (actionM80754b = m80754b(builderM80760i, 1)) == null) {
            return;
        }
        actionM80754b.icon = 0;
        actionM80754b.title = k26.m147943a().getString(R$string.f55347d);
        actionM80754b.actionIntent = m80761j(i, "resume");
    }

    /* JADX INFO: renamed from: f */
    public void m80758f(int i) {
        synchronized (this.f55290b) {
            try {
                NotificationCompat.Builder builder = this.f55290b.get(i);
                this.f55290b.remove(i);
                if (builder != null) {
                    this.f55289a.m107323b(builder.hashCode());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final NotificationCompat.Builder m80759h(Context context) {
        return new NotificationCompat.Builder(context, "tantan_download");
    }

    /* JADX INFO: renamed from: i */
    public NotificationCompat.Builder m80760i(int i) {
        return this.f55290b.get(i);
    }

    /* JADX INFO: renamed from: j */
    public final PendingIntent m80761j(int i, String str) {
        Intent intent = new Intent(k26.m147943a(), (Class<?>) BroadcastReceiver.class);
        intent.putExtra("task_id", i);
        intent.setAction(str);
        return PendingIntent.getBroadcast(k26.m147943a(), intent.hashCode(), intent, 134217728);
    }

    /* JADX INFO: renamed from: k */
    public boolean m80762k() {
        return this.f55289a.m107322a();
    }

    /* JADX INFO: renamed from: l */
    public void m80763l(int i) {
        synchronized (this.f55290b) {
            try {
                NotificationCompat.Builder builderM80760i = m80760i(i);
                if (builderM80760i != null) {
                    this.f55289a.m107326g(builderM80760i.hashCode(), builderM80760i.build());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
