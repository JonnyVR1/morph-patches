package tech.sud.runtime.component.p140c;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Process;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import tech.sud.runtime.component.p145h.C22435f;
import tech.sud.runtime.core.JNIShell;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.e */
/* JADX INFO: loaded from: classes3.dex */
public class C22411e {

    /* JADX INFO: renamed from: a */
    private long f207633a;

    /* JADX INFO: renamed from: d */
    private ActivityManager f207636d;

    /* JADX INFO: renamed from: f */
    private boolean f207638f;

    /* JADX INFO: renamed from: g */
    private ScheduledExecutorService f207639g;

    /* JADX INFO: renamed from: h */
    private final ComponentCallbacks2 f207640h;

    /* JADX INFO: renamed from: b */
    private AtomicLong f207634b = new AtomicLong(0);

    /* JADX INFO: renamed from: c */
    private int[] f207635c = new int[1];

    /* JADX INFO: renamed from: e */
    private boolean f207637e = false;

    public C22411e(Context context) {
        this.f207633a = 0L;
        this.f207638f = false;
        ComponentCallbacks2 componentCallbacks2 = new ComponentCallbacks2() { // from class: tech.sud.runtime.component.c.e.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                C22411e.this.m221682a(i);
            }
        };
        this.f207640h = componentCallbacks2;
        this.f207636d = (ActivityManager) context.getSystemService("activity");
        int iMyPid = Process.myPid();
        boolean zDeviceIs64Bit = JNIShell.deviceIs64Bit();
        this.f207638f = false;
        if (!zDeviceIs64Bit) {
            long jM221687b = m221687b();
            this.f207633a = jM221687b;
            if (jM221687b > 3000000) {
                this.f207633a = 3000000L;
                this.f207638f = true;
            }
            this.f207635c[0] = iMyPid;
        }
        context.registerComponentCallbacks(componentCallbacks2);
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f207639g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: tech.sud.runtime.component.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                C22411e.this.m221683a(C22411e.this.f207636d.getProcessMemoryInfo(C22411e.this.f207635c)[0].getTotalPss());
            }
        }, 2L, 2L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m221682a(int i) {
        if (i == 5 || i == 10 || i == 15) {
            m221689c();
        } else if (i == 40 || i == 60 || i == 80) {
            m221689c();
        }
    }

    /* JADX INFO: renamed from: b */
    private long m221687b() {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
            } while (!line.contains("MemTotal"));
            bufferedReader.close();
            String[] strArrSplit = line.split(" kB")[0].split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            return Integer.parseInt(strArrSplit[strArrSplit.length - 1]);
        } catch (Exception unused) {
            C22435f.m221859d("Memory", "getTotalMemory failed");
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m221689c() {
        this.f207637e = true;
    }

    /* JADX INFO: renamed from: a */
    public void m221690a(Context context) {
        this.f207639g.shutdown();
        try {
            context.unregisterComponentCallbacks(this.f207640h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m221691a() {
        if (!this.f207637e) {
            return this.f207638f && this.f207634b.get() >= this.f207633a;
        }
        this.f207637e = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m221683a(long j) {
        this.f207634b.set(j);
    }
}
