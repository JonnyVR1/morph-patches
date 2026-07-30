package p133rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.internal.util.unsafe.SpscArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;
import p149l.c4g0;
import p149l.d30;
import p149l.f5f;
import p149l.frf0;
import p149l.h4g0;
import p149l.jc2;
import p149l.kc2;
import p149l.rc90;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorEagerConcatMap<T, R> implements C22306c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends C22306c<? extends R>> f207190a;

    /* JADX INFO: renamed from: b */
    public final int f207191b;

    /* JADX INFO: renamed from: c */
    public final int f207192c;

    public static final class EagerOuterProducer extends AtomicLong implements rc90 {
        private static final long serialVersionUID = -657299606803478389L;
        final C22324b<?, ?> parent;

        public EagerOuterProducer(C22324b<?, ?> c22324b) {
            this.parent = c22324b;
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                jc2.m140849a("n >= 0 required but it was ", j);
            } else if (j > 0) {
                kc2.m145336b(this, j);
                this.parent.m221368h();
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$a */
    public static final class C22323a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final C22324b<?, T> f207193e;

        /* JADX INFO: renamed from: f */
        public final Queue<Object> f207194f;

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f207195g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f207196h;

        /* JADX INFO: renamed from: i */
        public Throwable f207197i;

        public C22323a(C22324b<?, T> c22324b, int i) {
            this.f207193e = c22324b;
            this.f207194f = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new frf0<>(i);
            this.f207195g = NotificationLite.m221335f();
            m217048e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m221366g(long j) {
            m217048e(j);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f207196h = true;
            this.f207193e.m221368h();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207197i = th;
            this.f207196h = true;
            this.f207193e.m221368h();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f207194f.offer(this.f207195g.m221344j(t));
            this.f207193e.m221368h();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$b */
    public static final class C22324b<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final w9j<? super T, ? extends C22306c<? extends R>> f207198e;

        /* JADX INFO: renamed from: f */
        public final int f207199f;

        /* JADX INFO: renamed from: g */
        public final z3g0<? super R> f207200g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f207202i;

        /* JADX INFO: renamed from: j */
        public Throwable f207203j;

        /* JADX INFO: renamed from: k */
        public volatile boolean f207204k;

        /* JADX INFO: renamed from: m */
        public EagerOuterProducer f207206m;

        /* JADX INFO: renamed from: h */
        public final Queue<C22323a<R>> f207201h = new LinkedList();

        /* JADX INFO: renamed from: l */
        public final AtomicInteger f207205l = new AtomicInteger();

        /* JADX INFO: renamed from: rx.internal.operators.OperatorEagerConcatMap$b$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C22324b.this.f207204k = true;
                if (C22324b.this.f207205l.getAndIncrement() == 0) {
                    C22324b.this.m221367g();
                }
            }
        }

        public C22324b(w9j<? super T, ? extends C22306c<? extends R>> w9jVar, int i, int i2, z3g0<? super R> z3g0Var) {
            this.f207198e = w9jVar;
            this.f207199f = i;
            this.f207200g = z3g0Var;
            m217048e(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : i2);
        }

        /* JADX INFO: renamed from: g */
        public void m221367g() {
            ArrayList arrayList;
            synchronized (this.f207201h) {
                arrayList = new ArrayList(this.f207201h);
                this.f207201h.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c4g0) it.next()).unsubscribe();
            }
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0083  */
        /* JADX INFO: renamed from: h */
        public void m221368h() {
            C22323a<R> c22323aPeek;
            if (this.f207205l.getAndIncrement() != 0) {
                return;
            }
            EagerOuterProducer eagerOuterProducer = this.f207206m;
            z3g0<? super R> z3g0Var = this.f207200g;
            NotificationLite notificationLiteM221335f = NotificationLite.m221335f();
            int iAddAndGet = 1;
            while (!this.f207204k) {
                boolean z = this.f207202i;
                synchronized (this.f207201h) {
                    c22323aPeek = this.f207201h.peek();
                }
                boolean z2 = false;
                boolean z3 = c22323aPeek == null;
                if (z) {
                    Throwable th = this.f207203j;
                    if (th != null) {
                        m221367g();
                        z3g0Var.onError(th);
                        return;
                    } else if (z3) {
                        z3g0Var.onCompleted();
                        return;
                    }
                }
                if (!z3) {
                    long j = eagerOuterProducer.get();
                    Queue<Object> queue = c22323aPeek.f207194f;
                    long j2 = 0;
                    while (true) {
                        boolean z4 = c22323aPeek.f207196h;
                        Object objPeek = queue.peek();
                        boolean z5 = objPeek == null;
                        if (!z4) {
                            if (!z5 || j == j2) {
                                break;
                            }
                            queue.poll();
                            try {
                                z3g0Var.onNext((Object) notificationLiteM221335f.m221340e(objPeek));
                                j2++;
                            } catch (Throwable th2) {
                                f5f.m119493g(th2, z3g0Var, objPeek);
                                return;
                            }
                        } else {
                            Throwable th3 = c22323aPeek.f207197i;
                            if (th3 != null) {
                                m221367g();
                                z3g0Var.onError(th3);
                                return;
                            }
                            if (z5) {
                                synchronized (this.f207201h) {
                                    this.f207201h.poll();
                                }
                                c22323aPeek.unsubscribe();
                                m217048e(1L);
                                z2 = true;
                                break;
                            }
                            if (!z5) {
                                break;
                            }
                            queue.poll();
                            z3g0Var.onNext((Object) notificationLiteM221335f.m221340e(objPeek));
                            j2++;
                        }
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            kc2.m145343i(eagerOuterProducer, j2);
                        }
                        if (!z2) {
                            c22323aPeek.m221366g(j2);
                        }
                    }
                    if (z2) {
                        continue;
                    }
                }
                iAddAndGet = this.f207205l.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            m221367g();
        }

        /* JADX INFO: renamed from: i */
        public void m221369i() {
            this.f207206m = new EagerOuterProducer(this);
            m217046b(h4g0.m129240a(new a()));
            this.f207200g.m217046b(this);
            this.f207200g.mo106696f(this.f207206m);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f207202i = true;
            m221368h();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207203j = th;
            this.f207202i = true;
            m221368h();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                C22306c<? extends R> c22306cCall = this.f207198e.call(t);
                if (this.f207204k) {
                    return;
                }
                C22323a<R> c22323a = new C22323a<>(this, this.f207199f);
                synchronized (this.f207201h) {
                    try {
                        if (this.f207204k) {
                            return;
                        }
                        this.f207201h.add(c22323a);
                        if (this.f207204k) {
                            return;
                        }
                        c22306cCall.unsafeSubscribe(c22323a);
                        m221368h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m119493g(th2, this.f207200g, t);
            }
        }
    }

    public OperatorEagerConcatMap(w9j<? super T, ? extends C22306c<? extends R>> w9jVar, int i, int i2) {
        this.f207190a = w9jVar;
        this.f207191b = i;
        this.f207192c = i2;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        C22324b c22324b = new C22324b(this.f207190a, this.f207191b, this.f207192c, z3g0Var);
        c22324b.m221369i();
        return c22324b;
    }
}
