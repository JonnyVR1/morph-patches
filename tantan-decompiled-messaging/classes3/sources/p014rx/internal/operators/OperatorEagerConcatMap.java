package p014rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p003l.c4g0;
import p003l.d30;
import p003l.f5f;
import p003l.frf0;
import p003l.h4g0;
import p003l.jc2;
import p003l.kc2;
import p003l.rc90;
import p003l.w9j;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.internal.util.unsafe.SpscArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorEagerConcatMap<T, R> implements C1099c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends C1099c<? extends R>> f10815a;

    /* JADX INFO: renamed from: b */
    public final int f10816b;

    /* JADX INFO: renamed from: c */
    public final int f10817c;

    public static final class EagerOuterProducer extends AtomicLong implements rc90 {
        private static final long serialVersionUID = -657299606803478389L;
        final C1117b<?, ?> parent;

        public EagerOuterProducer(C1117b<?, ?> c1117b) {
            this.parent = c1117b;
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j < 0) {
                jc2.m5313a("n >= 0 required but it was ", j);
            } else if (j > 0) {
                kc2.m5640b(this, j);
                this.parent.m9825h();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$a */
    public static final class C1116a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final C1117b<?, T> f10818e;

        /* JADX INFO: renamed from: f */
        public final Queue<Object> f10819f;

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f10820g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f10821h;

        /* JADX INFO: renamed from: i */
        public Throwable f10822i;

        public C1116a(C1117b<?, T> c1117b, int i) {
            this.f10818e = c1117b;
            this.f10819f = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new frf0<>(i);
            this.f10820g = NotificationLite.m9792f();
            m9242e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m9823g(long j) {
            m9242e(j);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f10821h = true;
            this.f10818e.m9825h();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f10822i = th;
            this.f10821h = true;
            this.f10818e.m9825h();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f10819f.offer(this.f10820g.m9801j(t));
            this.f10818e.m9825h();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$b */
    public static final class C1117b<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final w9j<? super T, ? extends C1099c<? extends R>> f10823e;

        /* JADX INFO: renamed from: f */
        public final int f10824f;

        /* JADX INFO: renamed from: g */
        public final z3g0<? super R> f10825g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f10827i;

        /* JADX INFO: renamed from: j */
        public Throwable f10828j;

        /* JADX INFO: renamed from: k */
        public volatile boolean f10829k;

        /* JADX INFO: renamed from: m */
        public EagerOuterProducer f10831m;

        /* JADX INFO: renamed from: h */
        public final Queue<C1116a<R>> f10826h = new LinkedList();

        /* JADX INFO: renamed from: l */
        public final AtomicInteger f10830l = new AtomicInteger();

        /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$b$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C1117b.this.f10829k = true;
                if (C1117b.this.f10830l.getAndIncrement() == 0) {
                    C1117b.this.m9824g();
                }
            }
        }

        public C1117b(w9j<? super T, ? extends C1099c<? extends R>> w9jVar, int i, int i2, z3g0<? super R> z3g0Var) {
            this.f10823e = w9jVar;
            this.f10824f = i;
            this.f10825g = z3g0Var;
            m9242e(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : i2);
        }

        /* JADX INFO: renamed from: g */
        public void m9824g() {
            ArrayList arrayList;
            synchronized (this.f10826h) {
                arrayList = new ArrayList(this.f10826h);
                this.f10826h.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c4g0) it.next()).unsubscribe();
            }
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0083  */
        /* JADX INFO: renamed from: h */
        public void m9825h() {
            C1116a<R> c1116aPeek;
            if (this.f10830l.getAndIncrement() != 0) {
                return;
            }
            EagerOuterProducer eagerOuterProducer = this.f10831m;
            z3g0<? super R> z3g0Var = this.f10825g;
            NotificationLite notificationLiteM9792f = NotificationLite.m9792f();
            int iAddAndGet = 1;
            while (!this.f10829k) {
                boolean z = this.f10827i;
                synchronized (this.f10826h) {
                    c1116aPeek = this.f10826h.peek();
                }
                boolean z2 = false;
                boolean z3 = c1116aPeek == null;
                if (z) {
                    Throwable th = this.f10828j;
                    if (th != null) {
                        m9824g();
                        z3g0Var.onError(th);
                        return;
                    } else if (z3) {
                        z3g0Var.onCompleted();
                        return;
                    }
                }
                if (!z3) {
                    long j = eagerOuterProducer.get();
                    Queue<Object> queue = c1116aPeek.f10819f;
                    long j2 = 0;
                    while (true) {
                        boolean z4 = c1116aPeek.f10821h;
                        Object objPeek = queue.peek();
                        boolean z5 = objPeek == null;
                        if (!z4) {
                            if (!z5 || j == j2) {
                                break;
                            }
                            queue.poll();
                            try {
                                z3g0Var.onNext((Object) notificationLiteM9792f.m9797e(objPeek));
                                j2++;
                            } catch (Throwable th2) {
                                f5f.m3966g(th2, z3g0Var, objPeek);
                                return;
                            }
                        } else {
                            Throwable th3 = c1116aPeek.f10822i;
                            if (th3 != null) {
                                m9824g();
                                z3g0Var.onError(th3);
                                return;
                            }
                            if (z5) {
                                synchronized (this.f10826h) {
                                    this.f10826h.poll();
                                }
                                c1116aPeek.unsubscribe();
                                m9242e(1L);
                                z2 = true;
                                break;
                            }
                            if (!z5) {
                                break;
                            }
                            queue.poll();
                            z3g0Var.onNext((Object) notificationLiteM9792f.m9797e(objPeek));
                            j2++;
                        }
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            kc2.m5647i(eagerOuterProducer, j2);
                        }
                        if (!z2) {
                            c1116aPeek.m9823g(j2);
                        }
                    }
                    if (z2) {
                        continue;
                    }
                }
                iAddAndGet = this.f10830l.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            m9824g();
        }

        /* JADX INFO: renamed from: i */
        public void m9826i() {
            this.f10831m = new EagerOuterProducer(this);
            m9240b(h4g0.m4914a(new a()));
            this.f10825g.m9240b(this);
            this.f10825g.mo3257f(this.f10831m);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f10827i = true;
            m9825h();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f10828j = th;
            this.f10827i = true;
            m9825h();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                C1099c<? extends R> c1099cCall = this.f10823e.call(t);
                if (this.f10829k) {
                    return;
                }
                C1116a<R> c1116a = new C1116a<>(this, this.f10824f);
                synchronized (this.f10826h) {
                    try {
                        if (this.f10829k) {
                            return;
                        }
                        this.f10826h.add(c1116a);
                        if (this.f10829k) {
                            return;
                        }
                        c1099cCall.unsafeSubscribe(c1116a);
                        m9825h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m3966g(th2, this.f10825g, t);
            }
        }
    }

    public OperatorEagerConcatMap(w9j<? super T, ? extends C1099c<? extends R>> w9jVar, int i, int i2) {
        this.f10815a = w9jVar;
        this.f10816b = i;
        this.f10817c = i2;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        C1117b c1117b = new C1117b(this.f10815a, this.f10816b, this.f10817c, z3g0Var);
        c1117b.m9826i();
        return c1117b;
    }
}
