package com.p046p1.mobile.putong.p065ui.download;

import android.os.Process;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.e30;
import p149l.f30;
import p149l.k850;
import p149l.osi0;
import p149l.x8i0;

/* JADX INFO: renamed from: com.p1.mobile.putong.ui.download.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13111a {

    /* JADX INFO: renamed from: g */
    public static C13111a f54502g;

    /* JADX INFO: renamed from: a */
    public ArrayList<DownloadTask> f54503a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<DownloadTask> f54504b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<DownloadTask> f54505c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public DownloadNotificationHelper f54506d = new DownloadNotificationHelper();

    /* JADX INFO: renamed from: e */
    public AtomicInteger f54507e = new AtomicInteger();

    /* JADX INFO: renamed from: f */
    public Runnable f54508f = new Runnable() { // from class: l.e8e
        @Override // java.lang.Runnable
        public final void run() {
            C13111a.m79650e(this.f89818a);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79646a(C13111a c13111a, e30 e30Var, DownloadTask downloadTask, Throwable th) {
        c13111a.getClass();
        c13111a.m79663m(downloadTask.hashCode());
        if (downloadTask.m79600E() || e30Var == null) {
            return;
        }
        e30Var.call(th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m79647b(C13111a c13111a, DownloadTask downloadTask, Boolean bool) {
        c13111a.getClass();
        if (downloadTask.m79600E()) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        DownloadNotificationHelper downloadNotificationHelper = c13111a.f54506d;
        if (zBooleanValue) {
            downloadNotificationHelper.m79574e(downloadTask.hashCode());
        } else {
            downloadNotificationHelper.m79573d(downloadTask.hashCode());
        }
        c13111a.f54506d.m79580l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m79648c(C13111a c13111a, DownloadTask downloadTask) {
        c13111a.getClass();
        c13111a.m79663m(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79649d(C13111a c13111a, DownloadTask downloadTask, Integer num) {
        NotificationCompat.Builder builderM79577i;
        c13111a.getClass();
        if (downloadTask.m79600E() || (builderM79577i = c13111a.f54506d.m79577i(downloadTask.hashCode())) == null) {
            return;
        }
        builderM79577i.setProgress(100, num.intValue(), false);
        builderM79577i.setContentText(num + "%");
        c13111a.f54506d.m79580l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m79650e(C13111a c13111a) {
        c13111a.getClass();
        try {
            Process.setThreadPriority(10);
            DownloadTask downloadTaskM79671v = c13111a.m79671v();
            while (downloadTaskM79671v != null) {
                c13111a.m79659i(downloadTaskM79671v);
                try {
                    downloadTaskM79671v.m79612Q();
                } catch (Throwable th) {
                    CrashHelper.m81296c(th);
                    downloadTaskM79671v.m79607L(th);
                }
                if (downloadTaskM79671v.m79599D()) {
                    c13111a.m79661k(downloadTaskM79671v);
                } else {
                    c13111a.m79655A(downloadTaskM79671v);
                    downloadTaskM79671v.m79606K();
                }
                downloadTaskM79671v = c13111a.m79671v();
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.m81296c(e);
        } catch (SecurityException e2) {
            CrashHelper.m81296c(e2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m79651f(C13111a c13111a, DownloadTask downloadTask, String str) {
        NotificationCompat.Builder builderM79577i = c13111a.f54506d.m79577i(downloadTask.hashCode());
        if (builderM79577i != null) {
            builderM79577i.setContentTitle(str);
        }
        if (downloadTask.m79600E() || builderM79577i == null) {
            return;
        }
        builderM79577i.setProgress(100, 0, false);
        c13111a.f54506d.m79580l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m79652g(C13111a c13111a, e30 e30Var, DownloadTask downloadTask, File file) {
        c13111a.getClass();
        c13111a.m79663m(downloadTask.hashCode());
        if (downloadTask.m79600E() || e30Var == null) {
            return;
        }
        e30Var.call(file);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m79653h(C13111a c13111a, DownloadTask downloadTask) {
        c13111a.f54506d.m79570a(downloadTask.hashCode());
        if (downloadTask.m79600E()) {
            return;
        }
        if (!c13111a.f54506d.m79579k()) {
            osi0.m165777a(R$string.f54500e);
        }
        NotificationCompat.Builder builderM79577i = c13111a.f54506d.m79577i(downloadTask.hashCode());
        if (builderM79577i != null) {
            builderM79577i.setProgress(100, 0, true);
            c13111a.f54506d.m79580l(downloadTask.hashCode());
        }
    }

    /* JADX INFO: renamed from: u */
    public static C13111a m79654u() {
        if (f54502g == null) {
            synchronized (C13111a.class) {
                try {
                    if (f54502g == null) {
                        f54502g = new C13111a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f54502g;
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m79655A(DownloadTask downloadTask) {
        this.f54505c.remove(downloadTask);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m79656B(DownloadTask downloadTask) {
        this.f54504b.remove(downloadTask);
        this.f54505c.remove(downloadTask);
        this.f54503a.remove(downloadTask);
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m79657C(DownloadTask downloadTask) {
        if (this.f54503a.contains(downloadTask)) {
            this.f54503a.remove(downloadTask);
            downloadTask.m79603H();
            this.f54504b.add(downloadTask);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m79658D(DownloadTask downloadTask) {
        if (downloadTask == null || !downloadTask.m79599D()) {
            return;
        }
        m79657C(downloadTask);
        m79668r();
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m79659i(DownloadTask downloadTask) {
        m79655A(downloadTask);
        this.f54505c.add(downloadTask);
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m79660j(DownloadTask downloadTask) {
        this.f54504b.remove(downloadTask);
        this.f54504b.add(0, downloadTask);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m79661k(DownloadTask downloadTask) {
        m79655A(downloadTask);
        this.f54503a.add(downloadTask);
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m79662l(DownloadTask downloadTask) {
        this.f54504b.remove(downloadTask);
        this.f54504b.add(downloadTask);
    }

    /* JADX INFO: renamed from: m */
    public void m79663m(int i) {
        this.f54506d.m79575f(i);
    }

    /* JADX INFO: renamed from: n */
    public void m79664n(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m79656B(downloadTask);
            downloadTask.m79615p();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m79665o(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m79662l(downloadTask);
            m79668r();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m79666p(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m79660j(downloadTask);
            m79668r();
        }
    }

    /* JADX INFO: renamed from: q */
    public DownloadTask m79667q(k850 k850Var, String str, String str2, boolean z, final e30<File> e30Var, final e30<Throwable> e30Var2) {
        DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(k850Var).m79642q(str).m79640o(str2).m79637l(16384).m79644s(500).m79643r(z).m79634i(new e30() { // from class: l.g8e
            @Override // p149l.e30
            public final void call(Object obj) {
                C13111a.m79653h(this.f101493a, (DownloadTask) obj);
            }
        }).m79630e(new f30() { // from class: l.h8e
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                C13111a.m79651f(this.f106403a, (DownloadTask) obj, (String) obj2);
            }
        }).m79632g(new f30() { // from class: l.i8e
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                C13111a.m79649d(this.f112031a, (DownloadTask) obj, (Integer) obj2);
            }
        }).m79629d(new e30() { // from class: l.j8e
            @Override // p149l.e30
            public final void call(Object obj) {
                C13111a.m79648c(this.f116711a, (DownloadTask) obj);
            }
        }).m79633h(new f30() { // from class: l.k8e
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                C13111a.m79647b(this.f121801a, (DownloadTask) obj, (Boolean) obj2);
            }
        }).m79635j(new f30() { // from class: l.l8e
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                C13111a.m79652g(this.f126820a, e30Var, (DownloadTask) obj, (File) obj2);
            }
        }).m79631f(new f30() { // from class: l.m8e
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                C13111a.m79646a(this.f132564a, e30Var2, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m79626a();
        m79665o(downloadTaskM79626a);
        return downloadTaskM79626a;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m79668r() {
        if (this.f54504b.size() > 0 && this.f54507e.get() < 3) {
            x8i0.m207417a(this.f54508f);
            this.f54507e.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized DownloadTask m79669s(String str) {
        DownloadTask downloadTask;
        downloadTask = null;
        if (str != null) {
            try {
                for (DownloadTask downloadTask2 : this.f54504b) {
                    if (str.equals(downloadTask2.m79623x())) {
                        downloadTask = downloadTask2;
                        break;
                    }
                }
                if (downloadTask == null) {
                    for (DownloadTask downloadTask3 : this.f54505c) {
                        if (str.equals(downloadTask3.m79623x())) {
                            downloadTask = downloadTask3;
                            break;
                        }
                    }
                }
                if (downloadTask == null) {
                    for (DownloadTask downloadTask4 : this.f54503a) {
                        if (str.equals(downloadTask4.m79623x())) {
                            downloadTask = downloadTask4;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return downloadTask;
    }

    /* JADX INFO: renamed from: t */
    public DownloadTask m79670t(int i) {
        return m79672w(i);
    }

    /* JADX INFO: renamed from: v */
    public synchronized DownloadTask m79671v() {
        DownloadTask downloadTask;
        try {
            if (this.f54504b.size() > 0) {
                downloadTask = this.f54504b.get(0);
                this.f54504b.remove(0);
            } else {
                downloadTask = null;
            }
            if (downloadTask == null) {
                this.f54507e.decrementAndGet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return downloadTask;
    }

    /* JADX INFO: renamed from: w */
    public synchronized DownloadTask m79672w(int i) {
        for (DownloadTask downloadTask : this.f54505c) {
            if (downloadTask != null && downloadTask.hashCode() == i) {
                return downloadTask;
            }
        }
        for (DownloadTask downloadTask2 : this.f54503a) {
            if (downloadTask2 != null && downloadTask2.hashCode() == i) {
                return downloadTask2;
            }
        }
        for (DownloadTask downloadTask3 : this.f54504b) {
            if (downloadTask3 != null && downloadTask3.hashCode() == i) {
                return downloadTask3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public boolean m79673x(int i) {
        return this.f54506d.m79577i(i) != null;
    }

    /* JADX INFO: renamed from: y */
    public synchronized boolean m79674y(String str) {
        boolean z;
        z = false;
        if (str != null) {
            try {
                Iterator<DownloadTask> it = this.f54504b.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().m79623x())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Iterator<DownloadTask> it2 = this.f54505c.iterator();
                    while (it2.hasNext()) {
                        if (str.equals(it2.next().m79623x())) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    Iterator<DownloadTask> it3 = this.f54503a.iterator();
                    while (it3.hasNext()) {
                        if (str.equals(it3.next().m79623x())) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public void m79675z(DownloadTask downloadTask) {
        if (downloadTask != null) {
            downloadTask.m79602G();
        }
    }
}
