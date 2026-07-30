package com.p000p1.mobile.putong.p004ui.download;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import l.f16;
import l.iw3;
import l.nr40;
import l.sp40;
import l.up40;
import l.z75;
import l.z8e;
import p009l.j3c0;
import p009l.u7e;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DownloadNotificationHelper {

    /* JADX INFO: renamed from: a */
    public nr40 f8047a;

    /* JADX INFO: renamed from: b */
    public SparseArray<NotificationCompat.Builder> f8048b = new SparseArray<>();

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                int i = intent.getExtras().getInt("task_id", 0);
                String action = intent.getAction();
                if (action == null || i == 0) {
                    return;
                }
                DownloadTask downloadTaskM9991t = C0513a.m9975u().m9991t(i);
                if (downloadTaskM9991t == null) {
                    C0513a.m9975u().m9984m(i);
                    return;
                }
                if (action.equals("cancel")) {
                    C0513a.m9975u().m9985n(downloadTaskM9991t);
                } else if (action.equals("pause")) {
                    C0513a.m9975u().m9996z(downloadTaskM9991t);
                } else if (action.equals("resume")) {
                    C0513a.m9975u().m9979D(downloadTaskM9991t);
                }
            }
        }
    }

    static {
        m9890g();
    }

    public DownloadNotificationHelper() {
        this.f8047a = null;
        this.f8047a = nr40.e(f16.a());
    }

    /* JADX INFO: renamed from: g */
    public static void m9890g() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) f16.a().getSystemService("notification")) == null) {
            return;
        }
        iw3.a();
        NotificationChannel notificationChannelA = up40.a("tantan_download", f16.a().getResources().getString(R$string.f8103b), 2);
        z75.a(notificationChannelA, f16.a().getResources().getString(R$string.f8102a));
        z8e.a(notificationChannelA, (Uri) null, (AudioAttributes) null);
        sp40.a(notificationManager, notificationChannelA);
    }

    /* JADX INFO: renamed from: a */
    public void m9891a(int i) {
        NotificationCompat.Builder ongoing = m9897h(f16.a()).setSmallIcon(j3c0.f14928a).setContentTitle("").setContentText("").setAutoCancel(false).setShowWhen(false).setOngoing(true);
        synchronized (this.f8048b) {
            this.f8048b.put(i, ongoing);
        }
        m9893c(i);
        m9894d(i);
    }

    /* JADX INFO: renamed from: b */
    public final NotificationCompat.Action m9892b(NotificationCompat.Builder builder, int i) {
        ArrayList arrayList;
        if (builder == null || u7e.m22760a() || (arrayList = builder.mActions) == null) {
            return null;
        }
        if (arrayList.size() > i) {
            return (NotificationCompat.Action) arrayList.get(i);
        }
        NotificationCompat.Action action = new NotificationCompat.Action(0, (CharSequence) null, (PendingIntent) null);
        arrayList.add(action);
        return action;
    }

    /* JADX INFO: renamed from: c */
    public void m9893c(int i) {
        NotificationCompat.Action actionM9892b;
        NotificationCompat.Builder builderM9898i = m9898i(i);
        if (builderM9898i == null || (actionM9892b = m9892b(builderM9898i, 0)) == null) {
            return;
        }
        actionM9892b.icon = 0;
        actionM9892b.title = f16.a().getString(R$string.f8104c);
        actionM9892b.actionIntent = m9899j(i, "cancel");
    }

    /* JADX INFO: renamed from: d */
    public void m9894d(int i) {
        NotificationCompat.Action actionM9892b;
        NotificationCompat.Builder builderM9898i = m9898i(i);
        if (builderM9898i == null || (actionM9892b = m9892b(builderM9898i, 1)) == null) {
            return;
        }
        actionM9892b.icon = 0;
        actionM9892b.title = f16.a().getString(R$string.f8107f);
        actionM9892b.actionIntent = m9899j(i, "pause");
    }

    /* JADX INFO: renamed from: e */
    public void m9895e(int i) {
        NotificationCompat.Action actionM9892b;
        NotificationCompat.Builder builderM9898i = m9898i(i);
        if (builderM9898i == null || (actionM9892b = m9892b(builderM9898i, 1)) == null) {
            return;
        }
        actionM9892b.icon = 0;
        actionM9892b.title = f16.a().getString(R$string.f8105d);
        actionM9892b.actionIntent = m9899j(i, "resume");
    }

    /* JADX INFO: renamed from: f */
    public void m9896f(int i) {
        synchronized (this.f8048b) {
            try {
                NotificationCompat.Builder builder = this.f8048b.get(i);
                this.f8048b.remove(i);
                if (builder != null) {
                    this.f8047a.b(builder.hashCode());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final NotificationCompat.Builder m9897h(Context context) {
        return new NotificationCompat.Builder(context, "tantan_download");
    }

    /* JADX INFO: renamed from: i */
    public NotificationCompat.Builder m9898i(int i) {
        return this.f8048b.get(i);
    }

    /* JADX INFO: renamed from: j */
    public final PendingIntent m9899j(int i, String str) {
        Intent intent = new Intent(f16.a(), (Class<?>) BroadcastReceiver.class);
        intent.putExtra("task_id", i);
        intent.setAction(str);
        return PendingIntent.getBroadcast(f16.a(), intent.hashCode(), intent, 134217728);
    }

    /* JADX INFO: renamed from: k */
    public boolean m9900k() {
        return this.f8047a.a();
    }

    /* JADX INFO: renamed from: l */
    public void m9901l(int i) {
        synchronized (this.f8048b) {
            try {
                NotificationCompat.Builder builderM9898i = m9898i(i);
                if (builderM9898i != null) {
                    this.f8047a.g(builderM9898i.hashCode(), builderM9898i.build());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
