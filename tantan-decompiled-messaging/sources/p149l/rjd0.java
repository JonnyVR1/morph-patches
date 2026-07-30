package p149l;

import java.util.Queue;
import p133rx.exceptions.MissingBackpressureException;
import p133rx.internal.operators.NotificationLite;
import p133rx.internal.util.unsafe.SpmcArrayQueue;
import p133rx.internal.util.unsafe.SpscArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public class rjd0 implements c4g0 {

    /* JADX INFO: renamed from: e */
    public static final NotificationLite<Object> f159668e = NotificationLite.m221335f();

    /* JADX INFO: renamed from: f */
    public static int f159669f;

    /* JADX INFO: renamed from: g */
    public static final int f159670g;

    /* JADX INFO: renamed from: h */
    public static final q050<Queue<Object>> f159671h;

    /* JADX INFO: renamed from: i */
    public static final q050<Queue<Object>> f159672i;

    /* JADX INFO: renamed from: a */
    public Queue<Object> f159673a;

    /* JADX INFO: renamed from: b */
    public final int f159674b;

    /* JADX INFO: renamed from: c */
    public final q050<Queue<Object>> f159675c;

    /* JADX INFO: renamed from: d */
    public volatile Object f159676d;

    /* JADX INFO: renamed from: l.rjd0$a */
    public static class C19711a extends q050<Queue<Object>> {
        @Override // p149l.q050
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SpscArrayQueue<Object> mo172286b() {
            return new SpscArrayQueue<>(rjd0.f159670g);
        }
    }

    /* JADX INFO: renamed from: l.rjd0$b */
    public static class C19712b extends q050<Queue<Object>> {
        @Override // p149l.q050
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SpmcArrayQueue<Object> mo172286b() {
            return new SpmcArrayQueue<>(rjd0.f159670g);
        }
    }

    static {
        f159669f = 128;
        if (w480.m201477c()) {
            f159669f = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                f159669f = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        f159670g = f159669f;
        f159671h = new C19711a();
        f159672i = new C19712b();
    }

    public rjd0(q050<Queue<Object>> q050Var, int i) {
        this.f159675c = q050Var;
        this.f159673a = q050Var.m172285a();
        this.f159674b = i;
    }

    /* JADX INFO: renamed from: a */
    public static rjd0 m179580a() {
        return UnsafeAccess.isUnsafeAvailable() ? new rjd0(f159672i, f159670g) : new rjd0();
    }

    /* JADX INFO: renamed from: b */
    public static rjd0 m179581b() {
        return UnsafeAccess.isUnsafeAvailable() ? new rjd0(f159671h, f159670g) : new rjd0();
    }

    /* JADX INFO: renamed from: c */
    public Object m179582c(Object obj) {
        return f159668e.m221340e(obj);
    }

    /* JADX INFO: renamed from: d */
    public boolean m179583d(Object obj) {
        return f159668e.m221341g(obj);
    }

    /* JADX INFO: renamed from: e */
    public boolean m179584e() {
        Queue<Object> queue = this.f159673a;
        if (queue == null) {
            return true;
        }
        return queue.isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public void m179585f() {
        if (this.f159676d == null) {
            this.f159676d = f159668e.m221337b();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m179586g(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            try {
                Queue<Object> queue = this.f159673a;
                z = true;
                z2 = false;
                if (queue != null) {
                    z = false;
                    z2 = !queue.offer(f159668e.m221344j(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            qkq0.m175383a("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (z2) {
            throw new MissingBackpressureException();
        }
    }

    /* JADX INFO: renamed from: h */
    public Object m179587h() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f159673a;
                if (queue == null) {
                    return null;
                }
                Object objPeek = queue.peek();
                Object obj = this.f159676d;
                if (objPeek == null && obj != null && queue.peek() == null) {
                    objPeek = obj;
                }
                return objPeek;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public Object m179588i() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f159673a;
                if (queue == null) {
                    return null;
                }
                Object objPoll = queue.poll();
                Object obj = this.f159676d;
                if (objPoll == null && obj != null && queue.peek() == null) {
                    this.f159676d = null;
                    objPoll = obj;
                }
                return objPoll;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.f159673a == null;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m179589j() {
        Queue<Object> queue = this.f159673a;
        q050<Queue<Object>> q050Var = this.f159675c;
        if (q050Var != null && queue != null) {
            queue.clear();
            this.f159673a = null;
            q050Var.m172288d(queue);
        }
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        m179589j();
    }

    public rjd0(Queue<Object> queue, int i) {
        this.f159673a = queue;
        this.f159675c = null;
        this.f159674b = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rjd0() {
        int i = f159670g;
        this(new igh0(i), i);
    }
}
