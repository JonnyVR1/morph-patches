package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public class r5r0 {

    /* JADX INFO: renamed from: f */
    static final InterfaceC19772d<C19774f, Runnable> f161390f = new C19769a();

    /* JADX INFO: renamed from: g */
    static final InterfaceC19772d<Message, Runnable> f161391g = new C19770b();

    /* JADX INFO: renamed from: a */
    private final HandlerThread f161392a;

    /* JADX INFO: renamed from: d */
    private volatile Handler f161395d;

    /* JADX INFO: renamed from: b */
    private final Queue<C19774f> f161393b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    private final Queue<Message> f161394c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e */
    private final Object f161396e = new Object();

    /* JADX INFO: renamed from: l.r5r0$a */
    public static class C19769a implements InterfaceC19772d<C19774f, Runnable> {
        @Override // p153l.r5r0.InterfaceC19772d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo179951a(C19774f c19774f, Runnable runnable) {
            Message message;
            Message message2;
            if (runnable == null) {
                return c19774f == null || (message2 = c19774f.f161401a) == null || message2.getCallback() == null;
            }
            return (c19774f == null || (message = c19774f.f161401a) == null || !runnable.equals(message.getCallback())) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.r5r0$b */
    public static class C19770b implements InterfaceC19772d<Message, Runnable> {
        @Override // p153l.r5r0.InterfaceC19772d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo179951a(Message message, Runnable runnable) {
            if (runnable == null) {
                return message == null || message.getCallback() == null;
            }
            return message != null && runnable.equals(message.getCallback());
        }
    }

    /* JADX INFO: renamed from: l.r5r0$c */
    public class RunnableC19771c implements Runnable {
        public RunnableC19771c() {
        }

        /* JADX INFO: renamed from: a */
        public void m179954a() {
            while (!r5r0.this.f161393b.isEmpty()) {
                C19774f c19774f = (C19774f) r5r0.this.f161393b.poll();
                if (r5r0.this.f161395d != null) {
                    try {
                        r5r0.this.f161395d.sendMessageAtTime(c19774f.f161401a, c19774f.f161402b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m179955b() {
            while (!r5r0.this.f161394c.isEmpty()) {
                if (r5r0.this.f161395d != null) {
                    try {
                        r5r0.this.f161395d.sendMessageAtFrontOfQueue((Message) r5r0.this.f161394c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m179955b();
            m179954a();
        }
    }

    /* JADX INFO: renamed from: l.r5r0$d */
    public interface InterfaceC19772d<A, B> {
        /* JADX INFO: renamed from: a */
        boolean mo179951a(A a, B b);
    }

    /* JADX INFO: renamed from: l.r5r0$e */
    public class HandlerThreadC19773e extends HandlerThread {

        /* JADX INFO: renamed from: a */
        volatile int f161398a;

        /* JADX INFO: renamed from: b */
        volatile boolean f161399b;

        public HandlerThreadC19773e(String str) {
            super(str);
            this.f161398a = 0;
            this.f161399b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (r5r0.this.f161396e) {
                try {
                    r5r0.this.f161395d = new Handler();
                } catch (Throwable th) {
                    throw th;
                }
            }
            r5r0.this.f161395d.post(r5r0.this.new RunnableC19771c());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        vxq0.m203872e();
                        if (this.f161398a < 5) {
                            pwq0.m174074a();
                            pwq0.m174075b("NPTH_CATCH", th2);
                        } else if (!this.f161399b) {
                            this.f161399b = true;
                            pwq0.m174074a();
                            pwq0.m174075b("NPTH_ERR_MAX", new RuntimeException());
                        }
                        this.f161398a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.r5r0$f */
    public static class C19774f {

        /* JADX INFO: renamed from: a */
        Message f161401a;

        /* JADX INFO: renamed from: b */
        long f161402b;

        public C19774f(Message message, long j) {
            this.f161401a = message;
            this.f161402b = j;
        }
    }

    public r5r0(String str) {
        this.f161392a = new HandlerThreadC19773e(str);
    }

    /* JADX INFO: renamed from: g */
    public static <L, O> boolean m179938g(Collection<L> collection, O o, InterfaceC19772d<? super L, O> interfaceC19772d) {
        boolean z = false;
        if (collection != null && !collection.isEmpty() && interfaceC19772d != null) {
            try {
                Iterator<L> it = collection.iterator();
                while (it.hasNext()) {
                    if (interfaceC19772d.mo179951a(it.next(), o)) {
                        it.remove();
                        z = true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    private Message m179940m(Runnable runnable) {
        return Message.obtain(this.f161395d, runnable);
    }

    /* JADX INFO: renamed from: a */
    public Handler m179943a() {
        return this.f161395d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m179944d(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m179949k(message, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m179945e(Runnable runnable) {
        return m179944d(m179940m(runnable), 0L);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m179946f(Runnable runnable, long j) {
        return m179944d(m179940m(runnable), j);
    }

    /* JADX INFO: renamed from: i */
    public void m179947i() {
        this.f161392a.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m179948j(Runnable runnable) {
        if (!this.f161393b.isEmpty() || !this.f161394c.isEmpty()) {
            m179938g(this.f161393b, runnable, f161390f);
            m179938g(this.f161394c, runnable, f161391g);
        }
        if (this.f161395d != null) {
            this.f161395d.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m179949k(Message message, long j) {
        if (this.f161395d == null) {
            synchronized (this.f161396e) {
                try {
                    if (this.f161395d == null) {
                        this.f161393b.add(new C19774f(message, j));
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            return this.f161395d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public HandlerThread m179950l() {
        return this.f161392a;
    }
}
