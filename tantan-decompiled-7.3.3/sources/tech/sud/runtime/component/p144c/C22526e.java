package tech.sud.runtime.component.p144c;

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
import tech.sud.runtime.component.p149h.C22550f;
import tech.sud.runtime.core.JNIShell;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.e */
/* JADX INFO: loaded from: classes3.dex */
public class C22526e {

    /* JADX INFO: renamed from: a */
    private long f208555a;

    /* JADX INFO: renamed from: d */
    private ActivityManager f208558d;

    /* JADX INFO: renamed from: f */
    private boolean f208560f;

    /* JADX INFO: renamed from: g */
    private ScheduledExecutorService f208561g;

    /* JADX INFO: renamed from: h */
    private final ComponentCallbacks2 f208562h;

    /* JADX INFO: renamed from: b */
    private AtomicLong f208556b = new AtomicLong(0);

    /* JADX INFO: renamed from: c */
    private int[] f208557c = new int[1];

    /* JADX INFO: renamed from: e */
    private boolean f208559e = false;

    public C22526e(Context context) {
        this.f208555a = 0L;
        this.f208560f = false;
        ComponentCallbacks2 componentCallbacks2 = new ComponentCallbacks2() { // from class: tech.sud.runtime.component.c.e.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                C22526e.this.m222928a(i);
            }
        };
        this.f208562h = componentCallbacks2;
        this.f208558d = (ActivityManager) context.getSystemService("activity");
        int iMyPid = Process.myPid();
        boolean zDeviceIs64Bit = JNIShell.deviceIs64Bit();
        this.f208560f = false;
        if (!zDeviceIs64Bit) {
            long jM222933b = m222933b();
            this.f208555a = jM222933b;
            if (jM222933b > 3000000) {
                this.f208555a = 3000000L;
                this.f208560f = true;
            }
            this.f208557c[0] = iMyPid;
        }
        context.registerComponentCallbacks(componentCallbacks2);
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f208561g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: tech.sud.runtime.component.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                C22526e.this.m222929a(C22526e.this.f208558d.getProcessMemoryInfo(C22526e.this.f208557c)[0].getTotalPss());
            }
        }, 2L, 2L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m222928a(int i) {
        if (i == 5 || i == 10 || i == 15) {
            m222935c();
        } else if (i == 40 || i == 60 || i == 80) {
            m222935c();
        }
    }

    /* JADX INFO: renamed from: b */
    private long m222933b() {
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
            C22550f.m223105d("Memory", "getTotalMemory failed");
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m222935c() {
        this.f208559e = true;
    }

    /* JADX INFO: renamed from: a */
    public void m222936a(Context context) {
        this.f208561g.shutdown();
        try {
            context.unregisterComponentCallbacks(this.f208562h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m222937a() {
        if (!this.f208559e) {
            return this.f208560f && this.f208556b.get() >= this.f208555a;
        }
        this.f208559e = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m222929a(long j) {
        this.f208556b.set(j);
    }
}
