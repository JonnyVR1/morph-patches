package com.p051p1.mobile.putong.p070ui.download;

import android.os.Process;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.r1j0;
import p153l.rg50;
import p153l.xhi0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: renamed from: com.p1.mobile.putong.ui.download.a */
/* JADX INFO: loaded from: classes10.dex */
public class C13274a {

    /* JADX INFO: renamed from: g */
    public static C13274a f55350g;

    /* JADX INFO: renamed from: a */
    public ArrayList<DownloadTask> f55351a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<DownloadTask> f55352b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<DownloadTask> f55353c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public DownloadNotificationHelper f55354d = new DownloadNotificationHelper();

    /* JADX INFO: renamed from: e */
    public AtomicInteger f55355e = new AtomicInteger();

    /* JADX INFO: renamed from: f */
    public Runnable f55356f = new Runnable() { // from class: l.p9e
        @Override // java.lang.Runnable
        public final void run() {
            C13274a.m80833e(this.f151143a);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80829a(C13274a c13274a, y20 y20Var, DownloadTask downloadTask, Throwable th) {
        c13274a.getClass();
        c13274a.m80846m(downloadTask.hashCode());
        if (downloadTask.m80783E() || y20Var == null) {
            return;
        }
        y20Var.call(th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80830b(C13274a c13274a, DownloadTask downloadTask, Boolean bool) {
        c13274a.getClass();
        if (downloadTask.m80783E()) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        DownloadNotificationHelper downloadNotificationHelper = c13274a.f55354d;
        if (zBooleanValue) {
            downloadNotificationHelper.m80757e(downloadTask.hashCode());
        } else {
            downloadNotificationHelper.m80756d(downloadTask.hashCode());
        }
        c13274a.f55354d.m80763l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m80831c(C13274a c13274a, DownloadTask downloadTask) {
        c13274a.getClass();
        c13274a.m80846m(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80832d(C13274a c13274a, DownloadTask downloadTask, Integer num) {
        NotificationCompat.Builder builderM80760i;
        c13274a.getClass();
        if (downloadTask.m80783E() || (builderM80760i = c13274a.f55354d.m80760i(downloadTask.hashCode())) == null) {
            return;
        }
        builderM80760i.setProgress(100, num.intValue(), false);
        builderM80760i.setContentText(num + "%");
        c13274a.f55354d.m80763l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m80833e(C13274a c13274a) {
        c13274a.getClass();
        try {
            Process.setThreadPriority(10);
            DownloadTask downloadTaskM80854v = c13274a.m80854v();
            while (downloadTaskM80854v != null) {
                c13274a.m80842i(downloadTaskM80854v);
                try {
                    downloadTaskM80854v.m80795Q();
                } catch (Throwable th) {
                    CrashHelper.m82479c(th);
                    downloadTaskM80854v.m80790L(th);
                }
                if (downloadTaskM80854v.m80782D()) {
                    c13274a.m80844k(downloadTaskM80854v);
                } else {
                    c13274a.m80838A(downloadTaskM80854v);
                    downloadTaskM80854v.m80789K();
                }
                downloadTaskM80854v = c13274a.m80854v();
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.m82479c(e);
        } catch (SecurityException e2) {
            CrashHelper.m82479c(e2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m80834f(C13274a c13274a, DownloadTask downloadTask, String str) {
        NotificationCompat.Builder builderM80760i = c13274a.f55354d.m80760i(downloadTask.hashCode());
        if (builderM80760i != null) {
            builderM80760i.setContentTitle(str);
        }
        if (downloadTask.m80783E() || builderM80760i == null) {
            return;
        }
        builderM80760i.setProgress(100, 0, false);
        c13274a.f55354d.m80763l(downloadTask.hashCode());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m80835g(C13274a c13274a, y20 y20Var, DownloadTask downloadTask, File file) {
        c13274a.getClass();
        c13274a.m80846m(downloadTask.hashCode());
        if (downloadTask.m80783E() || y20Var == null) {
            return;
        }
        y20Var.call(file);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m80836h(C13274a c13274a, DownloadTask downloadTask) {
        c13274a.f55354d.m80753a(downloadTask.hashCode());
        if (downloadTask.m80783E()) {
            return;
        }
        if (!c13274a.f55354d.m80762k()) {
            r1j0.m179414a(R$string.f55348e);
        }
        NotificationCompat.Builder builderM80760i = c13274a.f55354d.m80760i(downloadTask.hashCode());
        if (builderM80760i != null) {
            builderM80760i.setProgress(100, 0, true);
            c13274a.f55354d.m80763l(downloadTask.hashCode());
        }
    }

    /* JADX INFO: renamed from: u */
    public static C13274a m80837u() {
        if (f55350g == null) {
            synchronized (C13274a.class) {
                try {
                    if (f55350g == null) {
                        f55350g = new C13274a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f55350g;
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m80838A(DownloadTask downloadTask) {
        this.f55353c.remove(downloadTask);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m80839B(DownloadTask downloadTask) {
        this.f55352b.remove(downloadTask);
        this.f55353c.remove(downloadTask);
        this.f55351a.remove(downloadTask);
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m80840C(DownloadTask downloadTask) {
        if (this.f55351a.contains(downloadTask)) {
            this.f55351a.remove(downloadTask);
            downloadTask.m80786H();
            this.f55352b.add(downloadTask);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m80841D(DownloadTask downloadTask) {
        if (downloadTask == null || !downloadTask.m80782D()) {
            return;
        }
        m80840C(downloadTask);
        m80851r();
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m80842i(DownloadTask downloadTask) {
        m80838A(downloadTask);
        this.f55353c.add(downloadTask);
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m80843j(DownloadTask downloadTask) {
        this.f55352b.remove(downloadTask);
        this.f55352b.add(0, downloadTask);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m80844k(DownloadTask downloadTask) {
        m80838A(downloadTask);
        this.f55351a.add(downloadTask);
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m80845l(DownloadTask downloadTask) {
        this.f55352b.remove(downloadTask);
        this.f55352b.add(downloadTask);
    }

    /* JADX INFO: renamed from: m */
    public void m80846m(int i) {
        this.f55354d.m80758f(i);
    }

    /* JADX INFO: renamed from: n */
    public void m80847n(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m80839B(downloadTask);
            downloadTask.m80798p();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m80848o(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m80845l(downloadTask);
            m80851r();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m80849p(DownloadTask downloadTask) {
        if (downloadTask != null) {
            m80843j(downloadTask);
            m80851r();
        }
    }

    /* JADX INFO: renamed from: q */
    public DownloadTask m80850q(rg50 rg50Var, String str, String str2, boolean z, final y20<File> y20Var, final y20<Throwable> y20Var2) {
        DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(rg50Var).m80825q(str).m80823o(str2).m80820l(16384).m80827s(500).m80826r(z).m80817i(new y20() { // from class: l.r9e
            @Override // p153l.y20
            public final void call(Object obj) {
                C13274a.m80836h(this.f161806a, (DownloadTask) obj);
            }
        }).m80813e(new z20() { // from class: l.s9e
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                C13274a.m80834f(this.f166930a, (DownloadTask) obj, (String) obj2);
            }
        }).m80815g(new z20() { // from class: l.t9e
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                C13274a.m80832d(this.f172633a, (DownloadTask) obj, (Integer) obj2);
            }
        }).m80812d(new y20() { // from class: l.u9e
            @Override // p153l.y20
            public final void call(Object obj) {
                C13274a.m80831c(this.f178111a, (DownloadTask) obj);
            }
        }).m80816h(new z20() { // from class: l.v9e
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                C13274a.m80830b(this.f182989a, (DownloadTask) obj, (Boolean) obj2);
            }
        }).m80818j(new z20() { // from class: l.w9e
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                C13274a.m80835g(this.f188004a, y20Var, (DownloadTask) obj, (File) obj2);
            }
        }).m80814f(new z20() { // from class: l.x9e
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                C13274a.m80829a(this.f192935a, y20Var2, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m80809a();
        m80848o(downloadTaskM80809a);
        return downloadTaskM80809a;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m80851r() {
        if (this.f55352b.size() > 0 && this.f55355e.get() < 3) {
            xhi0.m211045a(this.f55356f);
            this.f55355e.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized DownloadTask m80852s(String str) {
        DownloadTask downloadTask;
        downloadTask = null;
        if (str != null) {
            try {
                for (DownloadTask downloadTask2 : this.f55352b) {
                    if (str.equals(downloadTask2.m80806x())) {
                        downloadTask = downloadTask2;
                        break;
                    }
                }
                if (downloadTask == null) {
                    for (DownloadTask downloadTask3 : this.f55353c) {
                        if (str.equals(downloadTask3.m80806x())) {
                            downloadTask = downloadTask3;
                            break;
                        }
                    }
                }
                if (downloadTask == null) {
                    for (DownloadTask downloadTask4 : this.f55351a) {
                        if (str.equals(downloadTask4.m80806x())) {
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
    public DownloadTask m80853t(int i) {
        return m80855w(i);
    }

    /* JADX INFO: renamed from: v */
    public synchronized DownloadTask m80854v() {
        DownloadTask downloadTask;
        try {
            if (this.f55352b.size() > 0) {
                downloadTask = this.f55352b.get(0);
                this.f55352b.remove(0);
            } else {
                downloadTask = null;
            }
            if (downloadTask == null) {
                this.f55355e.decrementAndGet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return downloadTask;
    }

    /* JADX INFO: renamed from: w */
    public synchronized DownloadTask m80855w(int i) {
        for (DownloadTask downloadTask : this.f55353c) {
            if (downloadTask != null && downloadTask.hashCode() == i) {
                return downloadTask;
            }
        }
        for (DownloadTask downloadTask2 : this.f55351a) {
            if (downloadTask2 != null && downloadTask2.hashCode() == i) {
                return downloadTask2;
            }
        }
        for (DownloadTask downloadTask3 : this.f55352b) {
            if (downloadTask3 != null && downloadTask3.hashCode() == i) {
                return downloadTask3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public boolean m80856x(int i) {
        return this.f55354d.m80760i(i) != null;
    }

    /* JADX INFO: renamed from: y */
    public synchronized boolean m80857y(String str) {
        boolean z;
        z = false;
        if (str != null) {
            try {
                Iterator<DownloadTask> it = this.f55352b.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().m80806x())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Iterator<DownloadTask> it2 = this.f55353c.iterator();
                    while (it2.hasNext()) {
                        if (str.equals(it2.next().m80806x())) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    Iterator<DownloadTask> it3 = this.f55351a.iterator();
                    while (it3.hasNext()) {
                        if (str.equals(it3.next().m80806x())) {
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
    public void m80858z(DownloadTask downloadTask) {
        if (downloadTask != null) {
            downloadTask.m80785G();
        }
    }
}
