package p153l;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class dud implements Runnable {

    /* JADX INFO: renamed from: d */
    public static dud f90786d;

    /* JADX INFO: renamed from: c */
    public Callable<Boolean> f90789c;

    /* JADX INFO: renamed from: b */
    public volatile boolean f90788b = false;

    /* JADX INFO: renamed from: a */
    public boolean f90787a = false;

    /* JADX INFO: renamed from: c */
    public static synchronized void m118129c() {
        try {
            dud dudVar = f90786d;
            if (dudVar != null) {
                dudVar.m118131b();
            }
            f90786d = new dud();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m118130d() {
        dud dudVar = f90786d;
        if (dudVar == null || dudVar.f90787a) {
            return;
        }
        dudVar.f90787a = true;
        final long jCurrentTimeMillis = System.currentTimeMillis() + 180000;
        f90786d.f90789c = new Callable() { // from class: l.cud
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(jCurrentTimeMillis < System.currentTimeMillis());
            }
        };
        xni0.m212213e("DelayKillProcessTask").m216870a(f90786d);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m118131b() {
        this.f90788b = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m118132e() {
        if (this.f90788b) {
            return;
        }
        Process.killProcess(Process.myPid());
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.f90788b && !this.f90789c.call().booleanValue()) {
            try {
                try {
                    TimeUnit.SECONDS.sleep(1L);
                } catch (Exception e) {
                    e.printStackTrace();
                    m118132e();
                    return;
                }
            } catch (Throwable th) {
                m118132e();
                throw th;
            }
        }
        m118132e();
    }
}
