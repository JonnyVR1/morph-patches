package p003l;

import java.util.Queue;
import l.qkq0;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.internal.operators.NotificationLite;
import p014rx.internal.util.unsafe.SpmcArrayQueue;
import p014rx.internal.util.unsafe.SpscArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rjd0 implements c4g0 {

    /* JADX INFO: renamed from: e */
    public static final NotificationLite<Object> f6936e = NotificationLite.m9792f();

    /* JADX INFO: renamed from: f */
    public static int f6937f;

    /* JADX INFO: renamed from: g */
    public static final int f6938g;

    /* JADX INFO: renamed from: h */
    public static final q050<Queue<Object>> f6939h;

    /* JADX INFO: renamed from: i */
    public static final q050<Queue<Object>> f6940i;

    /* JADX INFO: renamed from: a */
    public Queue<Object> f6941a;

    /* JADX INFO: renamed from: b */
    public final int f6942b;

    /* JADX INFO: renamed from: c */
    public final q050<Queue<Object>> f6943c;

    /* JADX INFO: renamed from: d */
    public volatile Object f6944d;

    /* JADX INFO: renamed from: l.rjd0$a */
    public static class C0505a extends q050<Queue<Object>> {
        @Override // p003l.q050
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SpscArrayQueue<Object> mo6976b() {
            return new SpscArrayQueue<>(rjd0.f6938g);
        }
    }

    /* JADX INFO: renamed from: l.rjd0$b */
    public static class C0506b extends q050<Queue<Object>> {
        @Override // p003l.q050
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SpmcArrayQueue<Object> mo6976b() {
            return new SpmcArrayQueue<>(rjd0.f6938g);
        }
    }

    static {
        f6937f = 128;
        if (w480.m8472c()) {
            f6937f = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                f6937f = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        f6938g = f6937f;
        f6939h = new C0505a();
        f6940i = new C0506b();
    }

    public rjd0(q050<Queue<Object>> q050Var, int i) {
        this.f6943c = q050Var;
        this.f6941a = q050Var.m6975a();
        this.f6942b = i;
    }

    /* JADX INFO: renamed from: a */
    public static rjd0 m7263a() {
        return UnsafeAccess.isUnsafeAvailable() ? new rjd0(f6940i, f6938g) : new rjd0();
    }

    /* JADX INFO: renamed from: b */
    public static rjd0 m7264b() {
        return UnsafeAccess.isUnsafeAvailable() ? new rjd0(f6939h, f6938g) : new rjd0();
    }

    /* JADX INFO: renamed from: c */
    public Object m7265c(Object obj) {
        return f6936e.m9797e(obj);
    }

    /* JADX INFO: renamed from: d */
    public boolean m7266d(Object obj) {
        return f6936e.m9798g(obj);
    }

    /* JADX INFO: renamed from: e */
    public boolean m7267e() {
        Queue<Object> queue = this.f6941a;
        if (queue == null) {
            return true;
        }
        return queue.isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public void m7268f() {
        if (this.f6944d == null) {
            this.f6944d = f6936e.m9794b();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m7269g(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            try {
                Queue<Object> queue = this.f6941a;
                z = true;
                z2 = false;
                if (queue != null) {
                    z = false;
                    z2 = !queue.offer(f6936e.m9801j(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            qkq0.a("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (z2) {
            throw new MissingBackpressureException();
        }
    }

    /* JADX INFO: renamed from: h */
    public Object m7270h() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f6941a;
                if (queue == null) {
                    return null;
                }
                Object objPeek = queue.peek();
                Object obj = this.f6944d;
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
    public Object m7271i() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f6941a;
                if (queue == null) {
                    return null;
                }
                Object objPoll = queue.poll();
                Object obj = this.f6944d;
                if (objPoll == null && obj != null && queue.peek() == null) {
                    this.f6944d = null;
                    objPoll = obj;
                }
                return objPoll;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f6941a == null;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m7272j() {
        Queue<Object> queue = this.f6941a;
        q050<Queue<Object>> q050Var = this.f6943c;
        if (q050Var != null && queue != null) {
            queue.clear();
            this.f6941a = null;
            q050Var.m6978d(queue);
        }
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        m7272j();
    }

    public rjd0(Queue<Object> queue, int i) {
        this.f6941a = queue;
        this.f6943c = null;
        this.f6942b = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rjd0() {
        int i = f6938g;
        this(new igh0(i), i);
    }
}
