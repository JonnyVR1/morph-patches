package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class njq0 {

    /* JADX INFO: renamed from: e */
    private static volatile njq0 f139307e;

    /* JADX INFO: renamed from: a */
    private ScheduledThreadPoolExecutor f139308a = new ScheduledThreadPoolExecutor(1);

    /* JADX INFO: renamed from: b */
    private Map<String, ScheduledFuture> f139309b = new HashMap();

    /* JADX INFO: renamed from: c */
    private Object f139310c = new Object();

    /* JADX INFO: renamed from: d */
    private SharedPreferences f139311d;

    /* JADX INFO: renamed from: l.njq0$a */
    public class C18715a extends RunnableC18718d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f139312b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f139313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18715a(AbstractRunnableC18717c abstractRunnableC18717c, boolean z, String str) {
            super(abstractRunnableC18717c);
            this.f139312b = z;
            this.f139313c = str;
        }

        @Override // p149l.njq0.RunnableC18718d
        /* JADX INFO: renamed from: a */
        public void mo159781a() {
            super.mo159781a();
        }

        @Override // p149l.njq0.RunnableC18718d
        /* JADX INFO: renamed from: b */
        public void mo159782b() {
            if (this.f139312b) {
                return;
            }
            njq0.this.f139311d.edit().putLong(this.f139313c, System.currentTimeMillis()).commit();
        }
    }

    /* JADX INFO: renamed from: l.njq0$b */
    public class C18716b extends RunnableC18718d {
        public C18716b(AbstractRunnableC18717c abstractRunnableC18717c) {
            super(abstractRunnableC18717c);
        }

        @Override // p149l.njq0.RunnableC18718d
        /* JADX INFO: renamed from: b */
        public void mo159782b() {
            synchronized (njq0.this.f139310c) {
                njq0.this.f139309b.remove(this.f139316a.mo86627a());
            }
        }
    }

    /* JADX INFO: renamed from: l.njq0$c */
    public static abstract class AbstractRunnableC18717c implements Runnable {
        /* JADX INFO: renamed from: a */
        public abstract String mo86627a();
    }

    private njq0(Context context) {
        this.f139311d = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
    }

    /* JADX INFO: renamed from: c */
    private static String m159769c(String str) {
        return "last_job_time" + str;
    }

    /* JADX INFO: renamed from: e */
    private ScheduledFuture m159771e(AbstractRunnableC18717c abstractRunnableC18717c) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f139310c) {
            scheduledFuture = this.f139309b.get(abstractRunnableC18717c.mo86627a());
        }
        return scheduledFuture;
    }

    /* JADX INFO: renamed from: f */
    public static njq0 m159772f(Context context) {
        if (f139307e == null) {
            synchronized (njq0.class) {
                try {
                    if (f139307e == null) {
                        f139307e = new njq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f139307e;
    }

    /* JADX INFO: renamed from: g */
    public void m159773g(Runnable runnable) {
        m159774h(runnable, 0);
    }

    /* JADX INFO: renamed from: h */
    public void m159774h(Runnable runnable, int i) {
        this.f139308a.schedule(runnable, i, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: i */
    public boolean m159775i(String str) {
        synchronized (this.f139310c) {
            try {
                ScheduledFuture scheduledFuture = this.f139309b.get(str);
                if (scheduledFuture == null) {
                    return false;
                }
                this.f139309b.remove(str);
                return scheduledFuture.cancel(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m159776j(AbstractRunnableC18717c abstractRunnableC18717c) {
        return m159780n(abstractRunnableC18717c, 0);
    }

    /* JADX INFO: renamed from: k */
    public boolean m159777k(AbstractRunnableC18717c abstractRunnableC18717c, int i) {
        return m159778l(abstractRunnableC18717c, i, 0);
    }

    /* JADX INFO: renamed from: l */
    public boolean m159778l(AbstractRunnableC18717c abstractRunnableC18717c, int i, int i2) {
        return m159779m(abstractRunnableC18717c, i, i2, false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m159779m(AbstractRunnableC18717c abstractRunnableC18717c, int i, int i2, boolean z) {
        if (abstractRunnableC18717c == null || m159771e(abstractRunnableC18717c) != null) {
            return false;
        }
        String strM159769c = m159769c(abstractRunnableC18717c.mo86627a());
        C18715a c18715a = new C18715a(abstractRunnableC18717c, z, strM159769c);
        if (!z) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.f139311d.getLong(strM159769c, 0L)) / 1000;
            if (jAbs < i - i2) {
                i2 = (int) (((long) i) - jAbs);
            }
        }
        try {
            ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.f139308a.scheduleAtFixedRate(c18715a, i2, i, TimeUnit.SECONDS);
            synchronized (this.f139310c) {
                try {
                    this.f139309b.put(abstractRunnableC18717c.mo86627a(), scheduledFutureScheduleAtFixedRate);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return true;
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m159780n(AbstractRunnableC18717c abstractRunnableC18717c, int i) {
        if (abstractRunnableC18717c == null || m159771e(abstractRunnableC18717c) != null) {
            return false;
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.f139308a.schedule(new C18716b(abstractRunnableC18717c), i, TimeUnit.SECONDS);
        synchronized (this.f139310c) {
            this.f139309b.put(abstractRunnableC18717c.mo86627a(), scheduledFutureSchedule);
        }
        return true;
    }

    /* JADX INFO: renamed from: l.njq0$d */
    public static class RunnableC18718d implements Runnable {

        /* JADX INFO: renamed from: a */
        AbstractRunnableC18717c f139316a;

        public RunnableC18718d(AbstractRunnableC18717c abstractRunnableC18717c) {
            this.f139316a = abstractRunnableC18717c;
        }

        /* JADX INFO: renamed from: b */
        public void mo159782b() {
            throw null;
        }

        @Override // java.lang.Runnable
        public void run() {
            mo159781a();
            this.f139316a.run();
            mo159782b();
        }

        /* JADX INFO: renamed from: a */
        public void mo159781a() {
        }
    }
}
