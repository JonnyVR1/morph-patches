package tech.sud.runtime.component.p021c;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import tech.sud.runtime.component.p026h.C1228f;
import tech.sud.runtime.core.JNIShell;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1204e {

    /* JADX INFO: renamed from: a */
    private long f11258a;

    /* JADX INFO: renamed from: d */
    private ActivityManager f11261d;

    /* JADX INFO: renamed from: f */
    private boolean f11263f;

    /* JADX INFO: renamed from: g */
    private ScheduledExecutorService f11264g;

    /* JADX INFO: renamed from: h */
    private final ComponentCallbacks2 f11265h;

    /* JADX INFO: renamed from: b */
    private AtomicLong f11259b = new AtomicLong(0);

    /* JADX INFO: renamed from: c */
    private int[] f11260c = new int[1];

    /* JADX INFO: renamed from: e */
    private boolean f11262e = false;

    public C1204e(Context context) {
        this.f11258a = 0L;
        this.f11263f = false;
        ComponentCallbacks2 componentCallbacks2 = new ComponentCallbacks2() { // from class: tech.sud.runtime.component.c.e.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                C1204e.this.m10153a(i);
            }
        };
        this.f11265h = componentCallbacks2;
        this.f11261d = (ActivityManager) context.getSystemService("activity");
        int iMyPid = Process.myPid();
        boolean zDeviceIs64Bit = JNIShell.deviceIs64Bit();
        this.f11263f = false;
        if (!zDeviceIs64Bit) {
            long jM10158b = m10158b();
            this.f11258a = jM10158b;
            if (jM10158b > 3000000) {
                this.f11258a = 3000000L;
                this.f11263f = true;
            }
            this.f11260c[0] = iMyPid;
        }
        context.registerComponentCallbacks(componentCallbacks2);
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f11264g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: tech.sud.runtime.component.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                C1204e.this.m10154a(C1204e.this.f11261d.getProcessMemoryInfo(C1204e.this.f11260c)[0].getTotalPss());
            }
        }, 2L, 2L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10153a(int i) {
        if (i == 5 || i == 10 || i == 15) {
            m10160c();
        } else if (i == 40 || i == 60 || i == 80) {
            m10160c();
        }
    }

    /* JADX INFO: renamed from: b */
    private long m10158b() {
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
            String[] strArrSplit = line.split(" kB")[0].split(" ");
            return Integer.parseInt(strArrSplit[strArrSplit.length - 1]);
        } catch (Exception unused) {
            C1228f.m10330d("Memory", "getTotalMemory failed");
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10160c() {
        this.f11262e = true;
    }

    /* JADX INFO: renamed from: a */
    public void m10161a(Context context) {
        this.f11264g.shutdown();
        try {
            context.unregisterComponentCallbacks(this.f11265h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m10162a() {
        if (!this.f11262e) {
            return this.f11263f && this.f11259b.get() >= this.f11258a;
        }
        this.f11262e = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10154a(long j) {
        this.f11259b.set(j);
    }
}
