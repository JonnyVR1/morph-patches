package com.p000p1.mobile.putong.p004ui.download;

import android.os.Process;
import androidx.core.app.NotificationCompat;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import l.e30;
import l.f30;
import l.k850;
import l.osi0;
import l.x8i0;

/* JADX INFO: renamed from: com.p1.mobile.putong.ui.download.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0513a {

    /* JADX INFO: renamed from: g */
    public static C0513a f8108g;

    /* JADX INFO: renamed from: a */
    public ArrayList<DownloadTask> f8109a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<DownloadTask> f8110b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<DownloadTask> f8111c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public DownloadNotificationHelper f8112d = new DownloadNotificationHelper();

    /* JADX INFO: renamed from: e */
    public AtomicInteger f8113e = new AtomicInteger();

    /* JADX INFO: renamed from: f */
    public Runnable f8114f = new Runnable() { // from class: l.e8e
        @Override // java.lang.Runnable
        public final void run() {
            C0513a.m9971e(this.f12447a);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9967a(C0513a c0513a, e30 e30Var, DownloadTask downloadTask, Throwable th) {
        c0513a.getClass();
        c0513a.m9984m(downloadTask.hashCode());
        if (downloadTask.m9921E() || e30Var == null) {
            return;
        }
        e30Var.call(th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9968b(C0513a c0513a, DownloadTask downloadTask, Boolean bool) {
        c0513a.getClass();
        if (downloadTask.m9921E()) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        DownloadNotificationHelper downloadNotificationHelper = c0513a.f8112d;
        if (zBooleanValue) {
            downloadNotificationHelper.m9895e(downloadTask.hashCode());
        } else {
            downloadNotificationHelper.m9894d(downloadTask.hashCode());
        }
        c0513a.f8112d.m9901l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9969c(C0513a c0513a, DownloadTask downloadTask) {
        c0513a.getClass();
        c0513a.m9984m(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9970d(C0513a c0513a, DownloadTask downloadTask, Integer num) {
        NotificationCompat.Builder builderM9898i;
        c0513a.getClass();
        if (downloadTask.m9921E() || (builderM9898i = c0513a.f8112d.m9898i(downloadTask.hashCode())) == null) {
            return;
        }
        builderM9898i.setProgress(100, num.intValue(), false);
        builderM9898i.setContentText(num + "%");
        c0513a.f8112d.m9901l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9971e(C0513a c0513a) {
        c0513a.getClass();
        try {
            Process.setThreadPriority(10);
            DownloadTask downloadTaskM9992v = c0513a.m9992v();
            while (downloadTaskM9992v != null) {
                c0513a.m9980i(downloadTaskM9992v);
                try {
                    downloadTaskM9992v.m9933Q();
                } catch (Throwable th) {
                    CrashHelper.c(th);
                    downloadTaskM9992v.m9928L(th);
                }
                if (downloadTaskM9992v.m9920D()) {
                    c0513a.m9982k(downloadTaskM9992v);
                } else {
                    c0513a.m9976A(downloadTaskM9992v);
                    downloadTaskM9992v.m9927K();
                }
                downloadTaskM9992v = c0513a.m9992v();
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.c(e);
        } catch (SecurityException e2) {
            CrashHelper.c(e2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m9972f(C0513a c0513a, DownloadTask downloadTask, String str) {
        NotificationCompat.Builder builderM9898i = c0513a.f8112d.m9898i(downloadTask.hashCode());
        if (builderM9898i != null) {
            builderM9898i.setContentTitle(str);
        }
        if (downloadTask.m9921E() || builderM9898i == null) {
            return;
        }
        builderM9898i.setProgress(100, 0, false);
        c0513a.f8112d.m9901l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m9973g(C0513a c0513a, e30 e30Var, DownloadTask downloadTask, File file) {
        c0513a.getClass();
        c0513a.m9984m(downloadTask.hashCode());
        if (downloadTask.m9921E() || e30Var == null) {
            return;
        }
        e30Var.call(file);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m9974h(C0513a c0513a, DownloadTask downloadTask) {
        c0513a.f8112d.m9891a(downloadTask.hashCode());
        if (downloadTask.m9921E()) {
            return;
        }
        if (!c0513a.f8112d.m9900k()) {
            osi0.a(R$string.f8106e);
        }
        NotificationCompat.Builder builderM9898i = c0513a.f8112d.m9898i(downloadTask.hashCode());
        if (builderM9898i != null) {
            builderM9898i.setProgress(100, 0, true);
            c0513a.f8112d.m9901l(downloadTask.hashCode());
        }
    }

    /* JADX INFO: renamed from: u */
    public static C0513a m9975u() {
        if (f8108g == null) {
            synchronized (C0513a.class) {
                try {
                    if (f8108g == null) {
                        f8108g = new C0513a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8108g;
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m9976A(DownloadTask downloadTask) {
        this.f8111c.remove(downloadTask);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m9977B(DownloadTask downloadTask) {
        this.f8110b.remove(downloadTask);
        this.f8111c.remove(downloadTask);
        this.f8109a.remove(downloadTask);
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m9978C(DownloadTask downloadTask) {
        if (this.f8109a.contains(downloadTask)) {
            this.f8109a.remove(downloadTask);
            downloadTask.m9924H();
            this.f8110b.add(downloadTask);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m9979D(DownloadTask downloadTask) {
        if (downloadTask == null || !downloadTask.m9920D()) {
            return;
        }
        m9978C(downloadTask);
        m9989r();
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m9980i(DownloadTask downloadTask) {
        m9976A(downloadTask);
        this.f8111c.add(downloadTask);
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m9981j(DownloadTask downloadTask) {
        this.f8110b.remove(downloadTask);
        this.f8110b.add(0, downloadTask);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m9982k(DownloadTask downloadTask) {
        m9976A(downloadTask);
        this.f8109a.add(downloadTask);
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m9983l(DownloadTask downloadTask) {
        this.f8110b.remove(downloadTask);
        this.f8110b.add(downloadTask);
    }

    /* JADX INFO: renamed from: m */
    public void m9984m(int i) {
        this.f8112d.m9896f(i);
    }

    /* JADX INFO: renamed from: n */
    public void m9985n(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m9977B(downloadTask);
            downloadTask.m9936p();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m9986o(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m9983l(downloadTask);
            m9989r();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m9987p(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m9981j(downloadTask);
            m9989r();
        }
    }

    /* JADX INFO: renamed from: q */
    public DownloadTask m9988q(k850 k850Var, String str, String str2, boolean z, final e30<File> e30Var, final e30<Throwable> e30Var2) {
        DownloadTask downloadTaskM9947a = new DownloadTask.C0512b(k850Var).m9963q(str).m9961o(str2).m9958l(16384).m9965s(500).m9964r(z).m9955i(new e30() { // from class: l.g8e
            public final void call(Object obj) {
                C0513a.m9974h(this.f13373a, (DownloadTask) obj);
            }
        }).m9951e(new f30() { // from class: l.h8e
            public final void call(Object obj, Object obj2) {
                C0513a.m9972f(this.f13904a, (DownloadTask) obj, (String) obj2);
            }
        }).m9953g(new f30() { // from class: l.i8e
            public final void call(Object obj, Object obj2) {
                C0513a.m9970d(this.f14436a, (DownloadTask) obj, (Integer) obj2);
            }
        }).m9950d(new e30() { // from class: l.j8e
            public final void call(Object obj) {
                C0513a.m9969c(this.f14986a, (DownloadTask) obj);
            }
        }).m9954h(new f30() { // from class: l.k8e
            public final void call(Object obj, Object obj2) {
                C0513a.m9968b(this.f15477a, (DownloadTask) obj, (Boolean) obj2);
            }
        }).m9956j(new f30() { // from class: l.l8e
            public final void call(Object obj, Object obj2) {
                C0513a.m9973g(this.f15986a, e30Var, (DownloadTask) obj, (File) obj2);
            }
        }).m9952f(new f30() { // from class: l.m8e
            public final void call(Object obj, Object obj2) {
                C0513a.m9967a(this.f16752a, e30Var2, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m9947a();
        m9986o(downloadTaskM9947a);
        return downloadTaskM9947a;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m9989r() {
        if (this.f8110b.size() > 0 && this.f8113e.get() < 3) {
            x8i0.a(this.f8114f);
            this.f8113e.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized DownloadTask m9990s(String str) {
        DownloadTask downloadTask;
        downloadTask = null;
        if (str != null) {
            try {
                for (DownloadTask downloadTask2 : this.f8110b) {
                    if (str.equals(downloadTask2.m9944x())) {
                        downloadTask = downloadTask2;
                        break;
                    }
                }
                if (downloadTask == null) {
                    for (DownloadTask downloadTask3 : this.f8111c) {
                        if (str.equals(downloadTask3.m9944x())) {
                            downloadTask = downloadTask3;
                            break;
                        }
                    }
                }
                if (downloadTask == null) {
                    for (DownloadTask downloadTask4 : this.f8109a) {
                        if (str.equals(downloadTask4.m9944x())) {
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
    public DownloadTask m9991t(int i) {
        return m9993w(i);
    }

    /* JADX INFO: renamed from: v */
    public synchronized DownloadTask m9992v() {
        DownloadTask downloadTask;
        try {
            if (this.f8110b.size() > 0) {
                downloadTask = this.f8110b.get(0);
                this.f8110b.remove(0);
            } else {
                downloadTask = null;
            }
            if (downloadTask == null) {
                this.f8113e.decrementAndGet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return downloadTask;
    }

    /* JADX INFO: renamed from: w */
    public synchronized DownloadTask m9993w(int i) {
        for (DownloadTask downloadTask : this.f8111c) {
            if (downloadTask != null && downloadTask.hashCode() == i) {
                return downloadTask;
            }
        }
        for (DownloadTask downloadTask2 : this.f8109a) {
            if (downloadTask2 != null && downloadTask2.hashCode() == i) {
                return downloadTask2;
            }
        }
        for (DownloadTask downloadTask3 : this.f8110b) {
            if (downloadTask3 != null && downloadTask3.hashCode() == i) {
                return downloadTask3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public boolean m9994x(int i) {
        return this.f8112d.m9898i(i) != null;
    }

    /* JADX INFO: renamed from: y */
    public synchronized boolean m9995y(String str) {
        boolean z;
        z = false;
        if (str != null) {
            try {
                Iterator<DownloadTask> it = this.f8110b.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().m9944x())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Iterator<DownloadTask> it2 = this.f8111c.iterator();
                    while (it2.hasNext()) {
                        if (str.equals(it2.next().m9944x())) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    Iterator<DownloadTask> it3 = this.f8109a.iterator();
                    while (it3.hasNext()) {
                        if (str.equals(it3.next().m9944x())) {
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
    public void m9996z(DownloadTask downloadTask) {
        if (downloadTask != null) {
            downloadTask.m9923G();
        }
    }
}
