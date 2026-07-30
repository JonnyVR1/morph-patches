package p153l;

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
public class vop0 {

    /* JADX INFO: renamed from: r */
    public static final long f185071r = 31622400000L;

    /* JADX INFO: renamed from: s */
    public static volatile ScheduledExecutorService f185072s = null;

    /* JADX INFO: renamed from: t */
    public static final Object f185073t = new Object();

    /* JADX INFO: renamed from: u */
    public static volatile q4u0 f185074u = new o9s0();

    /* JADX INFO: renamed from: a */
    public final Object f185075a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("acquireReleaseLock")
    public final PowerManager.WakeLock f185076b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("acquireReleaseLock")
    public int f185077c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("acquireReleaseLock")
    public Future<?> f185078d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("acquireReleaseLock")
    public long f185079e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("acquireReleaseLock")
    public final Set<w1v0> f185080f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("acquireReleaseLock")
    public boolean f185081g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("acquireReleaseLock")
    public int f185082h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("acquireReleaseLock")
    public j9s0 f185083i;

    /* JADX INFO: renamed from: j */
    public Clock f185084j;

    /* JADX INFO: renamed from: k */
    public WorkSource f185085k;

    /* JADX INFO: renamed from: l */
    public final String f185086l;

    /* JADX INFO: renamed from: m */
    public final String f185087m;

    /* JADX INFO: renamed from: n */
    public final Context f185088n;

    /* JADX INFO: renamed from: o */
    @GuardedBy("acquireReleaseLock")
    public final Map<String, e6t0> f185089o;

    /* JADX INFO: renamed from: p */
    public AtomicInteger f185090p;

    /* JADX INFO: renamed from: q */
    public final ScheduledExecutorService f185091q;

    @KeepForSdk
    public vop0(@NonNull Context context, int i, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f185075a = new Object();
        this.f185077c = 0;
        this.f185080f = new HashSet();
        this.f185081g = true;
        this.f185084j = DefaultClock.getInstance();
        this.f185089o = new HashMap();
        this.f185090p = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f185088n = context.getApplicationContext();
        this.f185087m = str;
        this.f185083i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f185086l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f185086l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.f185076b = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.f185085k = workSourceFromPackage;
            if (workSourceFromPackage != null) {
                m202127i(wakeLockNewWakeLock, workSourceFromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f185072s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f185073t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f185072s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        iix0.m140170a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f185072s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f185091q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m202126e(@NonNull vop0 vop0Var) {
        synchronized (vop0Var.f185075a) {
            try {
                if (vop0Var.m202129b()) {
                    Log.e("WakeLock", String.valueOf(vop0Var.f185086l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    vop0Var.m202133g();
                    if (vop0Var.m202129b()) {
                        vop0Var.f185077c = 1;
                        vop0Var.m202134h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m202127i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public void m202128a(long j) {
        this.f185090p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f185071r), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f185075a) {
            try {
                if (!m202129b()) {
                    this.f185083i = j9s0.m143950b(false, null);
                    this.f185076b.acquire();
                    this.f185084j.elapsedRealtime();
                }
                this.f185077c++;
                this.f185082h++;
                m202132f(null);
                e6t0 e6t0Var = this.f185089o.get(null);
                if (e6t0Var == null) {
                    e6t0Var = new e6t0(null);
                    this.f185089o.put(null, e6t0Var);
                }
                e6t0Var.f92358a++;
                long jElapsedRealtime = this.f185084j.elapsedRealtime();
                long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j2 > this.f185079e) {
                    this.f185079e = j2;
                    Future<?> future = this.f185078d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f185078d = this.f185091q.schedule(new Runnable() { // from class: l.z9r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            vop0.m202126e(this.f203509a);
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
    public boolean m202129b() {
        boolean z;
        synchronized (this.f185075a) {
            z = this.f185077c > 0;
        }
        return z;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public void m202130c() {
        if (this.f185090p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f185086l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f185075a) {
            try {
                m202132f(null);
                if (this.f185089o.containsKey(null)) {
                    e6t0 e6t0Var = this.f185089o.get(null);
                    if (e6t0Var != null) {
                        int i = e6t0Var.f92358a - 1;
                        e6t0Var.f92358a = i;
                        if (i == 0) {
                            this.f185089o.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f185086l).concat(" counter does not exist");
                }
                m202134h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m202131d(boolean z) {
        synchronized (this.f185075a) {
            this.f185081g = z;
        }
    }

    @GuardedBy("acquireReleaseLock")
    /* JADX INFO: renamed from: f */
    public final String m202132f(String str) {
        if (this.f185081g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    @GuardedBy("acquireReleaseLock")
    /* JADX INFO: renamed from: g */
    public final void m202133g() {
        if (this.f185080f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f185080f);
        this.f185080f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m202134h(int i) {
        synchronized (this.f185075a) {
            try {
                if (m202129b()) {
                    if (this.f185081g) {
                        int i2 = this.f185077c - 1;
                        this.f185077c = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.f185077c = 0;
                    }
                    m202133g();
                    Iterator<e6t0> it = this.f185089o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f92358a = 0;
                    }
                    this.f185089o.clear();
                    Future<?> future = this.f185078d;
                    if (future != null) {
                        future.cancel(false);
                        this.f185078d = null;
                        this.f185079e = 0L;
                    }
                    this.f185082h = 0;
                    if (this.f185076b.isHeld()) {
                        try {
                            try {
                                this.f185076b.release();
                                if (this.f185083i != null) {
                                    this.f185083i = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.f185086l).concat(" failed to release!"), e);
                                if (this.f185083i != null) {
                                    this.f185083i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f185083i != null) {
                                this.f185083i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f185086l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
