package p149l;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class psd implements Runnable {

    /* JADX INFO: renamed from: d */
    public static psd f150992d;

    /* JADX INFO: renamed from: c */
    public Callable<Boolean> f150995c;

    /* JADX INFO: renamed from: b */
    public volatile boolean f150994b = false;

    /* JADX INFO: renamed from: a */
    public boolean f150993a = false;

    /* JADX INFO: renamed from: c */
    public static synchronized void m171132c() {
        try {
            psd psdVar = f150992d;
            if (psdVar != null) {
                psdVar.m171134b();
            }
            f150992d = new psd();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m171133d() {
        psd psdVar = f150992d;
        if (psdVar == null || psdVar.f150993a) {
            return;
        }
        psdVar.f150993a = true;
        final long jCurrentTimeMillis = System.currentTimeMillis() + 180000;
        f150992d.f150995c = new Callable() { // from class: l.osd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(jCurrentTimeMillis < System.currentTimeMillis());
            }
        };
        xei0.m208583e("DelayKillProcessTask").m214349a(f150992d);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m171134b() {
        this.f150994b = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m171135e() {
        if (this.f150994b) {
            return;
        }
        Process.killProcess(Process.myPid());
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.f150994b && !this.f150995c.call().booleanValue()) {
            try {
                try {
                    TimeUnit.SECONDS.sleep(1L);
                } catch (Exception e) {
                    e.printStackTrace();
                    m171135e();
                    return;
                }
            } catch (Throwable th) {
                m171135e();
                throw th;
            }
        }
        m171135e();
    }
}
