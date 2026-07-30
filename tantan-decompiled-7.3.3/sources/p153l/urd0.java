package p153l;

import java.util.Queue;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.internal.operators.NotificationLite;
import p137rx.internal.util.unsafe.SpmcArrayQueue;
import p137rx.internal.util.unsafe.SpscArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public class urd0 implements kcg0 {

    /* JADX INFO: renamed from: e */
    public static final NotificationLite<Object> f180599e = NotificationLite.m222581f();

    /* JADX INFO: renamed from: f */
    public static int f180600f;

    /* JADX INFO: renamed from: g */
    public static final int f180601g;

    /* JADX INFO: renamed from: h */
    public static final f950<Queue<Object>> f180602h;

    /* JADX INFO: renamed from: i */
    public static final f950<Queue<Object>> f180603i;

    /* JADX INFO: renamed from: a */
    public Queue<Object> f180604a;

    /* JADX INFO: renamed from: b */
    public final int f180605b;

    /* JADX INFO: renamed from: c */
    public final f950<Queue<Object>> f180606c;

    /* JADX INFO: renamed from: d */
    public volatile Object f180607d;

    /* JADX INFO: renamed from: l.urd0$a */
    public static class C20636a extends f950<Queue<Object>> {
        @Override // p153l.f950
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SpscArrayQueue<Object> mo124628b() {
            return new SpscArrayQueue<>(urd0.f180601g);
        }
    }

    /* JADX INFO: renamed from: l.urd0$b */
    public static class C20637b extends f950<Queue<Object>> {
        @Override // p153l.f950
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SpmcArrayQueue<Object> mo124628b() {
            return new SpmcArrayQueue<>(urd0.f180601g);
        }
    }

    static {
        f180600f = 128;
        if (cd80.m109126c()) {
            f180600f = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                f180600f = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        f180601g = f180600f;
        f180602h = new C20636a();
        f180603i = new C20637b();
    }

    public urd0(f950<Queue<Object>> f950Var, int i) {
        this.f180606c = f950Var;
        this.f180604a = f950Var.m124627a();
        this.f180605b = i;
    }

    /* JADX INFO: renamed from: a */
    public static urd0 m197504a() {
        return UnsafeAccess.isUnsafeAvailable() ? new urd0(f180603i, f180601g) : new urd0();
    }

    /* JADX INFO: renamed from: b */
    public static urd0 m197505b() {
        return UnsafeAccess.isUnsafeAvailable() ? new urd0(f180602h, f180601g) : new urd0();
    }

    /* JADX INFO: renamed from: c */
    public Object m197506c(Object obj) {
        return f180599e.m222586e(obj);
    }

    /* JADX INFO: renamed from: d */
    public boolean m197507d(Object obj) {
        return f180599e.m222587g(obj);
    }

    /* JADX INFO: renamed from: e */
    public boolean m197508e() {
        Queue<Object> queue = this.f180604a;
        if (queue == null) {
            return true;
        }
        return queue.isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public void m197509f() {
        if (this.f180607d == null) {
            this.f180607d = f180599e.m222583b();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m197510g(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            try {
                Queue<Object> queue = this.f180604a;
                z = true;
                z2 = false;
                if (queue != null) {
                    z = false;
                    z2 = !queue.offer(f180599e.m222590j(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            wtq0.m207906a("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (z2) {
            throw new MissingBackpressureException();
        }
    }

    /* JADX INFO: renamed from: h */
    public Object m197511h() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f180604a;
                if (queue == null) {
                    return null;
                }
                Object objPeek = queue.peek();
                Object obj = this.f180607d;
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
    public Object m197512i() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f180604a;
                if (queue == null) {
                    return null;
                }
                Object objPoll = queue.poll();
                Object obj = this.f180607d;
                if (objPoll == null && obj != null && queue.peek() == null) {
                    this.f180607d = null;
                    objPoll = obj;
                }
                return objPoll;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f180604a == null;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m197513j() {
        Queue<Object> queue = this.f180604a;
        f950<Queue<Object>> f950Var = this.f180606c;
        if (f950Var != null && queue != null) {
            queue.clear();
            this.f180604a = null;
            f950Var.m124630d(queue);
        }
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        m197513j();
    }

    public urd0(Queue<Object> queue, int i) {
        this.f180604a = queue;
        this.f180606c = null;
        this.f180605b = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public urd0() {
        int i = f180601g;
        this(new poh0(i), i);
    }
}
