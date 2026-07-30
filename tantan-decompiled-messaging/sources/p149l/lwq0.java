package p149l;

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
public class lwq0 {

    /* JADX INFO: renamed from: f */
    static final InterfaceC18334d<C18336f, Runnable> f130284f = new C18331a();

    /* JADX INFO: renamed from: g */
    static final InterfaceC18334d<Message, Runnable> f130285g = new C18332b();

    /* JADX INFO: renamed from: a */
    private final HandlerThread f130286a;

    /* JADX INFO: renamed from: d */
    private volatile Handler f130289d;

    /* JADX INFO: renamed from: b */
    private final Queue<C18336f> f130287b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    private final Queue<Message> f130288c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e */
    private final Object f130290e = new Object();

    /* JADX INFO: renamed from: l.lwq0$a */
    public static class C18331a implements InterfaceC18334d<C18336f, Runnable> {
        @Override // p149l.lwq0.InterfaceC18334d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo151998a(C18336f c18336f, Runnable runnable) {
            Message message;
            Message message2;
            if (runnable == null) {
                return c18336f == null || (message2 = c18336f.f130295a) == null || message2.getCallback() == null;
            }
            return (c18336f == null || (message = c18336f.f130295a) == null || !runnable.equals(message.getCallback())) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.lwq0$b */
    public static class C18332b implements InterfaceC18334d<Message, Runnable> {
        @Override // p149l.lwq0.InterfaceC18334d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo151998a(Message message, Runnable runnable) {
            if (runnable == null) {
                return message == null || message.getCallback() == null;
            }
            return message != null && runnable.equals(message.getCallback());
        }
    }

    /* JADX INFO: renamed from: l.lwq0$c */
    public class RunnableC18333c implements Runnable {
        public RunnableC18333c() {
        }

        /* JADX INFO: renamed from: a */
        public void m152001a() {
            while (!lwq0.this.f130287b.isEmpty()) {
                C18336f c18336f = (C18336f) lwq0.this.f130287b.poll();
                if (lwq0.this.f130289d != null) {
                    try {
                        lwq0.this.f130289d.sendMessageAtTime(c18336f.f130295a, c18336f.f130296b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m152002b() {
            while (!lwq0.this.f130288c.isEmpty()) {
                if (lwq0.this.f130289d != null) {
                    try {
                        lwq0.this.f130289d.sendMessageAtFrontOfQueue((Message) lwq0.this.f130288c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m152002b();
            m152001a();
        }
    }

    /* JADX INFO: renamed from: l.lwq0$d */
    public interface InterfaceC18334d<A, B> {
        /* JADX INFO: renamed from: a */
        boolean mo151998a(A a, B b);
    }

    /* JADX INFO: renamed from: l.lwq0$e */
    public class HandlerThreadC18335e extends HandlerThread {

        /* JADX INFO: renamed from: a */
        volatile int f130292a;

        /* JADX INFO: renamed from: b */
        volatile boolean f130293b;

        public HandlerThreadC18335e(String str) {
            super(str);
            this.f130292a = 0;
            this.f130293b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (lwq0.this.f130290e) {
                try {
                    lwq0.this.f130289d = new Handler();
                } catch (Throwable th) {
                    throw th;
                }
            }
            lwq0.this.f130289d.post(lwq0.this.new RunnableC18333c());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        poq0.m170637e();
                        if (this.f130292a < 5) {
                            jnq0.m142383a();
                            jnq0.m142384b("NPTH_CATCH", th2);
                        } else if (!this.f130293b) {
                            this.f130293b = true;
                            jnq0.m142383a();
                            jnq0.m142384b("NPTH_ERR_MAX", new RuntimeException());
                        }
                        this.f130292a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.lwq0$f */
    public static class C18336f {

        /* JADX INFO: renamed from: a */
        Message f130295a;

        /* JADX INFO: renamed from: b */
        long f130296b;

        public C18336f(Message message, long j) {
            this.f130295a = message;
            this.f130296b = j;
        }
    }

    public lwq0(String str) {
        this.f130286a = new HandlerThreadC18335e(str);
    }

    /* JADX INFO: renamed from: g */
    public static <L, O> boolean m151985g(Collection<L> collection, O o, InterfaceC18334d<? super L, O> interfaceC18334d) {
        boolean z = false;
        if (collection != null && !collection.isEmpty() && interfaceC18334d != null) {
            try {
                Iterator<L> it = collection.iterator();
                while (it.hasNext()) {
                    if (interfaceC18334d.mo151998a(it.next(), o)) {
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
    private Message m151987m(Runnable runnable) {
        return Message.obtain(this.f130289d, runnable);
    }

    /* JADX INFO: renamed from: a */
    public Handler m151990a() {
        return this.f130289d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m151991d(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m151996k(message, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m151992e(Runnable runnable) {
        return m151991d(m151987m(runnable), 0L);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m151993f(Runnable runnable, long j) {
        return m151991d(m151987m(runnable), j);
    }

    /* JADX INFO: renamed from: i */
    public void m151994i() {
        this.f130286a.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m151995j(Runnable runnable) {
        if (!this.f130287b.isEmpty() || !this.f130288c.isEmpty()) {
            m151985g(this.f130287b, runnable, f130284f);
            m151985g(this.f130288c, runnable, f130285g);
        }
        if (this.f130289d != null) {
            this.f130289d.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m151996k(Message message, long j) {
        if (this.f130289d == null) {
            synchronized (this.f130290e) {
                try {
                    if (this.f130289d == null) {
                        this.f130287b.add(new C18336f(message, j));
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            return this.f130289d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public HandlerThread m151997l() {
        return this.f130286a;
    }
}
