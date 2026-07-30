package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class tsq0 {

    /* JADX INFO: renamed from: e */
    private static volatile tsq0 f176015e;

    /* JADX INFO: renamed from: a */
    private ScheduledThreadPoolExecutor f176016a = new ScheduledThreadPoolExecutor(1);

    /* JADX INFO: renamed from: b */
    private Map<String, ScheduledFuture> f176017b = new HashMap();

    /* JADX INFO: renamed from: c */
    private Object f176018c = new Object();

    /* JADX INFO: renamed from: d */
    private SharedPreferences f176019d;

    /* JADX INFO: renamed from: l.tsq0$a */
    public class C20392a extends RunnableC20395d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f176020b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f176021c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20392a(AbstractRunnableC20394c abstractRunnableC20394c, boolean z, String str) {
            super(abstractRunnableC20394c);
            this.f176020b = z;
            this.f176021c = str;
        }

        @Override // p153l.tsq0.RunnableC20395d
        /* JADX INFO: renamed from: a */
        public void mo192636a() {
            super.mo192636a();
        }

        @Override // p153l.tsq0.RunnableC20395d
        /* JADX INFO: renamed from: b */
        public void mo192637b() {
            if (this.f176020b) {
                return;
            }
            tsq0.this.f176019d.edit().putLong(this.f176021c, System.currentTimeMillis()).commit();
        }
    }

    /* JADX INFO: renamed from: l.tsq0$b */
    public class C20393b extends RunnableC20395d {
        public C20393b(AbstractRunnableC20394c abstractRunnableC20394c) {
            super(abstractRunnableC20394c);
        }

        @Override // p153l.tsq0.RunnableC20395d
        /* JADX INFO: renamed from: b */
        public void mo192637b() {
            synchronized (tsq0.this.f176018c) {
                tsq0.this.f176017b.remove(this.f176024a.mo87798a());
            }
        }
    }

    /* JADX INFO: renamed from: l.tsq0$c */
    public static abstract class AbstractRunnableC20394c implements Runnable {
        /* JADX INFO: renamed from: a */
        public abstract String mo87798a();
    }

    private tsq0(Context context) {
        this.f176019d = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
    }

    /* JADX INFO: renamed from: c */
    private static String m192624c(String str) {
        return "last_job_time" + str;
    }

    /* JADX INFO: renamed from: e */
    private ScheduledFuture m192626e(AbstractRunnableC20394c abstractRunnableC20394c) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f176018c) {
            scheduledFuture = this.f176017b.get(abstractRunnableC20394c.mo87798a());
        }
        return scheduledFuture;
    }

    /* JADX INFO: renamed from: f */
    public static tsq0 m192627f(Context context) {
        if (f176015e == null) {
            synchronized (tsq0.class) {
                try {
                    if (f176015e == null) {
                        f176015e = new tsq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f176015e;
    }

    /* JADX INFO: renamed from: g */
    public void m192628g(Runnable runnable) {
        m192629h(runnable, 0);
    }

    /* JADX INFO: renamed from: h */
    public void m192629h(Runnable runnable, int i) {
        this.f176016a.schedule(runnable, i, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: i */
    public boolean m192630i(String str) {
        synchronized (this.f176018c) {
            try {
                ScheduledFuture scheduledFuture = this.f176017b.get(str);
                if (scheduledFuture == null) {
                    return false;
                }
                this.f176017b.remove(str);
                return scheduledFuture.cancel(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m192631j(AbstractRunnableC20394c abstractRunnableC20394c) {
        return m192635n(abstractRunnableC20394c, 0);
    }

    /* JADX INFO: renamed from: k */
    public boolean m192632k(AbstractRunnableC20394c abstractRunnableC20394c, int i) {
        return m192633l(abstractRunnableC20394c, i, 0);
    }

    /* JADX INFO: renamed from: l */
    public boolean m192633l(AbstractRunnableC20394c abstractRunnableC20394c, int i, int i2) {
        return m192634m(abstractRunnableC20394c, i, i2, false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m192634m(AbstractRunnableC20394c abstractRunnableC20394c, int i, int i2, boolean z) {
        if (abstractRunnableC20394c == null || m192626e(abstractRunnableC20394c) != null) {
            return false;
        }
        String strM192624c = m192624c(abstractRunnableC20394c.mo87798a());
        C20392a c20392a = new C20392a(abstractRunnableC20394c, z, strM192624c);
        if (!z) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.f176019d.getLong(strM192624c, 0L)) / 1000;
            if (jAbs < i - i2) {
                i2 = (int) (((long) i) - jAbs);
            }
        }
        try {
            ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.f176016a.scheduleAtFixedRate(c20392a, i2, i, TimeUnit.SECONDS);
            synchronized (this.f176018c) {
                try {
                    this.f176017b.put(abstractRunnableC20394c.mo87798a(), scheduledFutureScheduleAtFixedRate);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return true;
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m192635n(AbstractRunnableC20394c abstractRunnableC20394c, int i) {
        if (abstractRunnableC20394c == null || m192626e(abstractRunnableC20394c) != null) {
            return false;
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.f176016a.schedule(new C20393b(abstractRunnableC20394c), i, TimeUnit.SECONDS);
        synchronized (this.f176018c) {
            this.f176017b.put(abstractRunnableC20394c.mo87798a(), scheduledFutureSchedule);
        }
        return true;
    }

    /* JADX INFO: renamed from: l.tsq0$d */
    public static class RunnableC20395d implements Runnable {

        /* JADX INFO: renamed from: a */
        AbstractRunnableC20394c f176024a;

        public RunnableC20395d(AbstractRunnableC20394c abstractRunnableC20394c) {
            this.f176024a = abstractRunnableC20394c;
        }

        /* JADX INFO: renamed from: b */
        public void mo192637b() {
            throw null;
        }

        @Override // java.lang.Runnable
        public void run() {
            mo192636a();
            this.f176024a.run();
            mo192637b();
        }

        /* JADX INFO: renamed from: a */
        public void mo192636a() {
        }
    }
}
