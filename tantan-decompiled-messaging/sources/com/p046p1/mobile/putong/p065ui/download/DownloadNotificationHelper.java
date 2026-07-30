package com.p046p1.mobile.putong.p065ui.download;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import p149l.f16;
import p149l.iw3;
import p149l.j3c0;
import p149l.nr40;
import p149l.u7e;
import p149l.up40;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadNotificationHelper {

    /* JADX INFO: renamed from: a */
    public nr40 f54441a;

    /* JADX INFO: renamed from: b */
    public SparseArray<NotificationCompat.Builder> f54442b = new SparseArray<>();

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                int i = intent.getExtras().getInt("task_id", 0);
                String action = intent.getAction();
                if (action == null || i == 0) {
                    return;
                }
                DownloadTask downloadTaskM79670t = C13111a.m79654u().m79670t(i);
                if (downloadTaskM79670t == null) {
                    C13111a.m79654u().m79663m(i);
                    return;
                }
                if (action.equals("cancel")) {
                    C13111a.m79654u().m79664n(downloadTaskM79670t);
                } else if (action.equals("pause")) {
                    C13111a.m79654u().m79675z(downloadTaskM79670t);
                } else if (action.equals("resume")) {
                    C13111a.m79654u().m79658D(downloadTaskM79670t);
                }
            }
        }
    }

    static {
        m79569g();
    }

    public DownloadNotificationHelper() {
        this.f54441a = null;
        this.f54441a = nr40.m160709e(f16.m119092a());
    }

    /* JADX INFO: renamed from: g */
    public static void m79569g() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) f16.m119092a().getSystemService("notification")) == null) {
            return;
        }
        iw3.m138716a();
        NotificationChannel notificationChannelM194605a = up40.m194605a("tantan_download", f16.m119092a().getResources().getString(R$string.f54497b), 2);
        notificationChannelM194605a.setDescription(f16.m119092a().getResources().getString(R$string.f54496a));
        notificationChannelM194605a.setSound(null, null);
        notificationManager.createNotificationChannel(notificationChannelM194605a);
    }

    /* JADX INFO: renamed from: a */
    public void m79570a(int i) {
        NotificationCompat.Builder ongoing = m79576h(f16.m119092a()).setSmallIcon(j3c0.f116023a).setContentTitle("").setContentText("").setAutoCancel(false).setShowWhen(false).setOngoing(true);
        synchronized (this.f54442b) {
            this.f54442b.put(i, ongoing);
        }
        m79572c(i);
        m79573d(i);
    }

    /* JADX INFO: renamed from: b */
    public final NotificationCompat.Action m79571b(NotificationCompat.Builder builder, int i) {
        ArrayList<NotificationCompat.Action> arrayList;
        if (builder == null || u7e.m192133a() || (arrayList = builder.mActions) == null) {
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
    public void m79572c(int i) {
        NotificationCompat.Action actionM79571b;
        NotificationCompat.Builder builderM79577i = m79577i(i);
        if (builderM79577i == null || (actionM79571b = m79571b(builderM79577i, 0)) == null) {
            return;
        }
        actionM79571b.icon = 0;
        actionM79571b.title = f16.m119092a().getString(R$string.f54498c);
        actionM79571b.actionIntent = m79578j(i, "cancel");
    }

    /* JADX INFO: renamed from: d */
    public void m79573d(int i) {
        NotificationCompat.Action actionM79571b;
        NotificationCompat.Builder builderM79577i = m79577i(i);
        if (builderM79577i == null || (actionM79571b = m79571b(builderM79577i, 1)) == null) {
            return;
        }
        actionM79571b.icon = 0;
        actionM79571b.title = f16.m119092a().getString(R$string.f54501f);
        actionM79571b.actionIntent = m79578j(i, "pause");
    }

    /* JADX INFO: renamed from: e */
    public void m79574e(int i) {
        NotificationCompat.Action actionM79571b;
        NotificationCompat.Builder builderM79577i = m79577i(i);
        if (builderM79577i == null || (actionM79571b = m79571b(builderM79577i, 1)) == null) {
            return;
        }
        actionM79571b.icon = 0;
        actionM79571b.title = f16.m119092a().getString(R$string.f54499d);
        actionM79571b.actionIntent = m79578j(i, "resume");
    }

    /* JADX INFO: renamed from: f */
    public void m79575f(int i) {
        synchronized (this.f54442b) {
            try {
                NotificationCompat.Builder builder = this.f54442b.get(i);
                this.f54442b.remove(i);
                if (builder != null) {
                    this.f54441a.m160713b(builder.hashCode());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final NotificationCompat.Builder m79576h(Context context) {
        return new NotificationCompat.Builder(context, "tantan_download");
    }

    /* JADX INFO: renamed from: i */
    public NotificationCompat.Builder m79577i(int i) {
        return this.f54442b.get(i);
    }

    /* JADX INFO: renamed from: j */
    public final PendingIntent m79578j(int i, String str) {
        Intent intent = new Intent(f16.m119092a(), (Class<?>) BroadcastReceiver.class);
        intent.putExtra("task_id", i);
        intent.setAction(str);
        return PendingIntent.getBroadcast(f16.m119092a(), intent.hashCode(), intent, 134217728);
    }

    /* JADX INFO: renamed from: k */
    public boolean m79579k() {
        return this.f54441a.m160712a();
    }

    /* JADX INFO: renamed from: l */
    public void m79580l(int i) {
        synchronized (this.f54442b) {
            try {
                NotificationCompat.Builder builderM79577i = m79577i(i);
                if (builderM79577i != null) {
                    this.f54441a.m160716g(builderM79577i.hashCode(), builderM79577i.build());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
