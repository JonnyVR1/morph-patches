package p149l;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
public class rfp0 {

    /* JADX INFO: renamed from: r */
    public static final long f159171r = 31622400000L;

    /* JADX INFO: renamed from: s */
    public static volatile ScheduledExecutorService f159172s = null;

    /* JADX INFO: renamed from: t */
    public static final Object f159173t = new Object();

    /* JADX INFO: renamed from: u */
    public static volatile kvt0 f159174u = new i0s0();

    /* JADX INFO: renamed from: a */
    public final Object f159175a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("acquireReleaseLock")
    public final PowerManager.WakeLock f159176b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("acquireReleaseLock")
    public int f159177c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("acquireReleaseLock")
    public Future<?> f159178d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("acquireReleaseLock")
    public long f159179e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("acquireReleaseLock")
    public final Set<qsu0> f159180f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("acquireReleaseLock")
    public boolean f159181g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("acquireReleaseLock")
    public int f159182h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("acquireReleaseLock")
    public d0s0 f159183i;

    /* JADX INFO: renamed from: j */
    public Clock f159184j;

    /* JADX INFO: renamed from: k */
    public WorkSource f159185k;

    /* JADX INFO: renamed from: l */
    public final String f159186l;

    /* JADX INFO: renamed from: m */
    public final String f159187m;

    /* JADX INFO: renamed from: n */
    public final Context f159188n;

    /* JADX INFO: renamed from: o */
    @GuardedBy("acquireReleaseLock")
    public final Map<String, yws0> f159189o;

    /* JADX INFO: renamed from: p */
    public AtomicInteger f159190p;

    /* JADX INFO: renamed from: q */
    public final ScheduledExecutorService f159191q;

    @KeepForSdk
    public rfp0(@NonNull Context context, int i, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f159175a = new Object();
        this.f159177c = 0;
        this.f159180f = new HashSet();
        this.f159181g = true;
        this.f159184j = DefaultClock.getInstance();
        this.f159189o = new HashMap();
        this.f159190p = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f159188n = context.getApplicationContext();
        this.f159187m = str;
        this.f159183i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f159186l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f159186l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.f159176b = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.f159185k = workSourceFromPackage;
            if (workSourceFromPackage != null) {
                m179138i(wakeLockNewWakeLock, workSourceFromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f159172s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f159173t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f159172s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        c9x0.m105913a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f159172s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f159191q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m179137e(@NonNull rfp0 rfp0Var) {
        synchronized (rfp0Var.f159175a) {
            try {
                if (rfp0Var.m179140b()) {
                    Log.e("WakeLock", String.valueOf(rfp0Var.f159186l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    rfp0Var.m179144g();
                    if (rfp0Var.m179140b()) {
                        rfp0Var.f159177c = 1;
                        rfp0Var.m179145h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m179138i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public void m179139a(long j) {
        this.f159190p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f159171r), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f159175a) {
            try {
                if (!m179140b()) {
                    this.f159183i = d0s0.m109530b(false, null);
                    this.f159176b.acquire();
                    this.f159184j.elapsedRealtime();
                }
                this.f159177c++;
                this.f159182h++;
                m179143f(null);
                yws0 yws0Var = this.f159189o.get(null);
                if (yws0Var == null) {
                    yws0Var = new yws0(null);
                    this.f159189o.put(null, yws0Var);
                }
                yws0Var.f200540a++;
                long jElapsedRealtime = this.f159184j.elapsedRealtime();
                long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j2 > this.f159179e) {
                    this.f159179e = j2;
                    Future<?> future = this.f159178d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f159178d = this.f159191q.schedule(new Runnable() { // from class: l.t0r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            rfp0.m179137e(this.f167207a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public boolean m179140b() {
        boolean z;
        synchronized (this.f159175a) {
            z = this.f159177c > 0;
        }
        return z;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public void m179141c() {
        if (this.f159190p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f159186l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f159175a) {
            try {
                m179143f(null);
                if (this.f159189o.containsKey(null)) {
                    yws0 yws0Var = this.f159189o.get(null);
                    if (yws0Var != null) {
                        int i = yws0Var.f200540a - 1;
                        yws0Var.f200540a = i;
                        if (i == 0) {
                            this.f159189o.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f159186l).concat(" counter does not exist");
                }
                m179145h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m179142d(boolean z) {
        synchronized (this.f159175a) {
            this.f159181g = z;
        }
    }

    @GuardedBy("acquireReleaseLock")
    /* JADX INFO: renamed from: f */
    public final String m179143f(String str) {
        if (this.f159181g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    @GuardedBy("acquireReleaseLock")
    /* JADX INFO: renamed from: g */
    public final void m179144g() {
        if (this.f159180f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f159180f);
        this.f159180f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m179145h(int i) {
        synchronized (this.f159175a) {
            try {
                if (m179140b()) {
                    if (this.f159181g) {
                        int i2 = this.f159177c - 1;
                        this.f159177c = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.f159177c = 0;
                    }
                    m179144g();
                    Iterator<yws0> it = this.f159189o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f200540a = 0;
                    }
                    this.f159189o.clear();
                    Future<?> future = this.f159178d;
                    if (future != null) {
                        future.cancel(false);
                        this.f159178d = null;
                        this.f159179e = 0L;
                    }
                    this.f159182h = 0;
                    if (this.f159176b.isHeld()) {
                        try {
                            try {
                                this.f159176b.release();
                                if (this.f159183i != null) {
                                    this.f159183i = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.f159186l).concat(" failed to release!"), e);
                                if (this.f159183i != null) {
                                    this.f159183i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f159183i != null) {
                                this.f159183i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f159186l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
