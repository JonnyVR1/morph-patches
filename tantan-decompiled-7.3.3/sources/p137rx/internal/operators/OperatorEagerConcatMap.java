package p137rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.internal.util.unsafe.SpscArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p153l.gcg0;
import p153l.j6f;
import p153l.kcg0;
import p153l.ozf0;
import p153l.pcg0;
import p153l.qc2;
import p153l.qcj;
import p153l.rc2;
import p153l.vk90;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorEagerConcatMap<T, R> implements C22421c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends C22421c<? extends R>> f208112a;

    /* JADX INFO: renamed from: b */
    public final int f208113b;

    /* JADX INFO: renamed from: c */
    public final int f208114c;

    public static final class EagerOuterProducer extends AtomicLong implements vk90 {
        private static final long serialVersionUID = -657299606803478389L;
        final C22439b<?, ?> parent;

        public EagerOuterProducer(C22439b<?, ?> c22439b) {
            this.parent = c22439b;
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j < 0) {
                qc2.m176107a("n >= 0 required but it was ", j);
            } else if (j > 0) {
                rc2.m180770b(this, j);
                this.parent.m222614h();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$a */
    public static final class C22438a<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final C22439b<?, T> f208115e;

        /* JADX INFO: renamed from: f */
        public final Queue<Object> f208116f;

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f208117g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f208118h;

        /* JADX INFO: renamed from: i */
        public Throwable f208119i;

        public C22438a(C22439b<?, T> c22439b, int i) {
            this.f208115e = c22439b;
            this.f208116f = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new ozf0<>(i);
            this.f208117g = NotificationLite.m222581f();
            m129868e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m222612g(long j) {
            m129868e(j);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f208118h = true;
            this.f208115e.m222614h();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208119i = th;
            this.f208118h = true;
            this.f208115e.m222614h();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f208116f.offer(this.f208117g.m222590j(t));
            this.f208115e.m222614h();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$b */
    public static final class C22439b<T, R> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final qcj<? super T, ? extends C22421c<? extends R>> f208120e;

        /* JADX INFO: renamed from: f */
        public final int f208121f;

        /* JADX INFO: renamed from: g */
        public final gcg0<? super R> f208122g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f208124i;

        /* JADX INFO: renamed from: j */
        public Throwable f208125j;

        /* JADX INFO: renamed from: k */
        public volatile boolean f208126k;

        /* JADX INFO: renamed from: m */
        public EagerOuterProducer f208128m;

        /* JADX INFO: renamed from: h */
        public final Queue<C22438a<R>> f208123h = new LinkedList();

        /* JADX INFO: renamed from: l */
        public final AtomicInteger f208127l = new AtomicInteger();

        /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$b$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C22439b.this.f208126k = true;
                if (C22439b.this.f208127l.getAndIncrement() == 0) {
                    C22439b.this.m222613g();
                }
            }
        }

        public C22439b(qcj<? super T, ? extends C22421c<? extends R>> qcjVar, int i, int i2, gcg0<? super R> gcg0Var) {
            this.f208120e = qcjVar;
            this.f208121f = i;
            this.f208122g = gcg0Var;
            m129868e(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : i2);
        }

        /* JADX INFO: renamed from: g */
        public void m222613g() {
            ArrayList arrayList;
            synchronized (this.f208123h) {
                arrayList = new ArrayList(this.f208123h);
                this.f208123h.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((kcg0) it.next()).unsubscribe();
            }
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0083  */
        /* JADX INFO: renamed from: h */
        public void m222614h() {
            C22438a<R> c22438aPeek;
            if (this.f208127l.getAndIncrement() != 0) {
                return;
            }
            EagerOuterProducer eagerOuterProducer = this.f208128m;
            gcg0<? super R> gcg0Var = this.f208122g;
            NotificationLite notificationLiteM222581f = NotificationLite.m222581f();
            int iAddAndGet = 1;
            while (!this.f208126k) {
                boolean z = this.f208124i;
                synchronized (this.f208123h) {
                    c22438aPeek = this.f208123h.peek();
                }
                boolean z2 = false;
                boolean z3 = c22438aPeek == null;
                if (z) {
                    Throwable th = this.f208125j;
                    if (th != null) {
                        m222613g();
                        gcg0Var.onError(th);
                        return;
                    } else if (z3) {
                        gcg0Var.onCompleted();
                        return;
                    }
                }
                if (!z3) {
                    long j = eagerOuterProducer.get();
                    Queue<Object> queue = c22438aPeek.f208116f;
                    long j2 = 0;
                    while (true) {
                        boolean z4 = c22438aPeek.f208118h;
                        Object objPeek = queue.peek();
                        boolean z5 = objPeek == null;
                        if (!z4) {
                            if (!z5 || j == j2) {
                                break;
                            }
                            queue.poll();
                            try {
                                gcg0Var.onNext((Object) notificationLiteM222581f.m222586e(objPeek));
                                j2++;
                            } catch (Throwable th2) {
                                j6f.m143665g(th2, gcg0Var, objPeek);
                                return;
                            }
                        } else {
                            Throwable th3 = c22438aPeek.f208119i;
                            if (th3 != null) {
                                m222613g();
                                gcg0Var.onError(th3);
                                return;
                            }
                            if (z5) {
                                synchronized (this.f208123h) {
                                    this.f208123h.poll();
                                }
                                c22438aPeek.unsubscribe();
                                m129868e(1L);
                                z2 = true;
                                break;
                            }
                            if (!z5) {
                                break;
                            }
                            queue.poll();
                            gcg0Var.onNext((Object) notificationLiteM222581f.m222586e(objPeek));
                            j2++;
                        }
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            rc2.m180777i(eagerOuterProducer, j2);
                        }
                        if (!z2) {
                            c22438aPeek.m222612g(j2);
                        }
                    }
                    if (z2) {
                        continue;
                    }
                }
                iAddAndGet = this.f208127l.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            m222613g();
        }

        /* JADX INFO: renamed from: i */
        public void m222615i() {
            this.f208128m = new EagerOuterProducer(this);
            m129866b(pcg0.m171648a(new a()));
            this.f208122g.m129866b(this);
            this.f208122g.mo95773f(this.f208128m);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f208124i = true;
            m222614h();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208125j = th;
            this.f208124i = true;
            m222614h();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                C22421c<? extends R> c22421cCall = this.f208120e.call(t);
                if (this.f208126k) {
                    return;
                }
                C22438a<R> c22438a = new C22438a<>(this, this.f208121f);
                synchronized (this.f208123h) {
                    try {
                        if (this.f208126k) {
                            return;
                        }
                        this.f208123h.add(c22438a);
                        if (this.f208126k) {
                            return;
                        }
                        c22421cCall.unsafeSubscribe(c22438a);
                        m222614h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                j6f.m143665g(th2, this.f208122g, t);
            }
        }
    }

    public OperatorEagerConcatMap(qcj<? super T, ? extends C22421c<? extends R>> qcjVar, int i, int i2) {
        this.f208112a = qcjVar;
        this.f208113b = i;
        this.f208114c = i2;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super R> gcg0Var) {
        C22439b c22439b = new C22439b(this.f208112a, this.f208113b, this.f208114c, gcg0Var);
        c22439b.m222615i();
        return c22439b;
    }
}
