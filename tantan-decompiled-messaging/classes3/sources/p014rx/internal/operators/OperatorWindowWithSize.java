package p014rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p003l.c4g0;
import p003l.d30;
import p003l.grf0;
import p003l.h4g0;
import p003l.kc2;
import p003l.p3g0;
import p003l.rc90;
import p003l.y3g0;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorWindowWithSize<T> implements C1099c.c<C1099c<T>, T> {

    /* JADX INFO: renamed from: a */
    public final int f10953a;

    /* JADX INFO: renamed from: b */
    public final int f10954b;

    public static final class WindowOverlap<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<T>> f10955e;

        /* JADX INFO: renamed from: f */
        public final int f10956f;

        /* JADX INFO: renamed from: g */
        public final int f10957g;

        /* JADX INFO: renamed from: i */
        public final c4g0 f10959i;

        /* JADX INFO: renamed from: m */
        public final Queue<p3g0<T, T>> f10963m;

        /* JADX INFO: renamed from: n */
        public Throwable f10964n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f10965o;

        /* JADX INFO: renamed from: p */
        public int f10966p;

        /* JADX INFO: renamed from: q */
        public int f10967q;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f10958h = new AtomicInteger(1);

        /* JADX INFO: renamed from: j */
        public final ArrayDeque<p3g0<T, T>> f10960j = new ArrayDeque<>();

        /* JADX INFO: renamed from: l */
        public final AtomicInteger f10962l = new AtomicInteger();

        /* JADX INFO: renamed from: k */
        public final AtomicLong f10961k = new AtomicLong();

        public final class WindowOverlapProducer extends AtomicBoolean implements rc90 {
            private static final long serialVersionUID = 4625807964358024108L;

            public WindowOverlapProducer() {
            }

            @Override // p003l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m8887a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    WindowOverlap windowOverlap = WindowOverlap.this;
                    if (get() || !compareAndSet(false, true)) {
                        WindowOverlap.this.m9242e(kc2.m5641c(windowOverlap.f10957g, j));
                    } else {
                        windowOverlap.m9242e(kc2.m5639a(kc2.m5641c(windowOverlap.f10957g, j - 1), windowOverlap.f10956f));
                    }
                    kc2.m5640b(windowOverlap.f10961k, j);
                    windowOverlap.m9897k();
                }
            }
        }

        public WindowOverlap(z3g0<? super C1099c<T>> z3g0Var, int i, int i2) {
            this.f10955e = z3g0Var;
            this.f10956f = i;
            this.f10957g = i2;
            c4g0 c4g0VarM4914a = h4g0.m4914a(this);
            this.f10959i = c4g0VarM4914a;
            m9240b(c4g0VarM4914a);
            m9242e(0L);
            this.f10963m = new grf0((i + (i2 - 1)) / i2);
        }

        @Override // p003l.d30
        public void call() {
            if (this.f10958h.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public boolean m9895i(boolean z, boolean z2, z3g0<? super p3g0<T, T>> z3g0Var, Queue<p3g0<T, T>> queue) {
            if (z3g0Var.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f10964n;
            if (th != null) {
                queue.clear();
                z3g0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            z3g0Var.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: j */
        public rc90 m9896j() {
            return new WindowOverlapProducer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k */
        public void m9897k() {
            AtomicInteger atomicInteger = this.f10962l;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super C1099c<T>> z3g0Var = this.f10955e;
            Queue<p3g0<T, T>> queue = this.f10963m;
            int iAddAndGet = 1;
            do {
                long j = this.f10961k.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f10965o;
                    p3g0<T, T> p3g0VarPoll = queue.poll();
                    boolean z2 = p3g0VarPoll == null;
                    if (m9895i(z, z2, z3g0Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    z3g0Var.onNext(p3g0VarPoll);
                    j2++;
                }
                if (j2 == j && m9895i(this.f10965o, queue.isEmpty(), z3g0Var, queue)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f10961k.addAndGet(-j2);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p003l.m250
        public void onCompleted() {
            Iterator<p3g0<T, T>> it = this.f10960j.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.f10960j.clear();
            this.f10965o = true;
            m9897k();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            Iterator<p3g0<T, T>> it = this.f10960j.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.f10960j.clear();
            this.f10964n = th;
            this.f10965o = true;
            m9897k();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            int i = this.f10966p;
            ArrayDeque<p3g0<T, T>> arrayDeque = this.f10960j;
            if (i == 0 && !this.f10955e.isUnsubscribed()) {
                this.f10958h.getAndIncrement();
                UnicastSubject unicastSubjectM9968d = UnicastSubject.m9968d(16, this);
                arrayDeque.offer(unicastSubjectM9968d);
                this.f10963m.offer(unicastSubjectM9968d);
                m9897k();
            }
            Iterator<p3g0<T, T>> it = this.f10960j.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            int i2 = this.f10967q + 1;
            if (i2 == this.f10956f) {
                this.f10967q = i2 - this.f10957g;
                p3g0<T, T> p3g0VarPoll = arrayDeque.poll();
                if (p3g0VarPoll != null) {
                    p3g0VarPoll.onCompleted();
                }
            } else {
                this.f10967q = i2;
            }
            int i3 = i + 1;
            if (i3 == this.f10957g) {
                this.f10966p = 0;
            } else {
                this.f10966p = i3;
            }
        }
    }

    public static final class WindowSkip<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<T>> f10968e;

        /* JADX INFO: renamed from: f */
        public final int f10969f;

        /* JADX INFO: renamed from: g */
        public final int f10970g;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f10971h = new AtomicInteger(1);

        /* JADX INFO: renamed from: i */
        public final c4g0 f10972i;

        /* JADX INFO: renamed from: j */
        public int f10973j;

        /* JADX INFO: renamed from: k */
        public p3g0<T, T> f10974k;

        public final class WindowSkipProducer extends AtomicBoolean implements rc90 {
            private static final long serialVersionUID = 4625807964358024108L;

            public WindowSkipProducer() {
            }

            @Override // p003l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m8887a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    WindowSkip windowSkip = WindowSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        windowSkip.m9242e(kc2.m5641c(j, windowSkip.f10970g));
                    } else {
                        windowSkip.m9242e(kc2.m5639a(kc2.m5641c(j, windowSkip.f10969f), kc2.m5641c(windowSkip.f10970g - windowSkip.f10969f, j - 1)));
                    }
                }
            }
        }

        public WindowSkip(z3g0<? super C1099c<T>> z3g0Var, int i, int i2) {
            this.f10968e = z3g0Var;
            this.f10969f = i;
            this.f10970g = i2;
            c4g0 c4g0VarM4914a = h4g0.m4914a(this);
            this.f10972i = c4g0VarM4914a;
            m9240b(c4g0VarM4914a);
            m9242e(0L);
        }

        @Override // p003l.d30
        public void call() {
            if (this.f10971h.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public rc90 m9900i() {
            return new WindowSkipProducer();
        }

        @Override // p003l.m250
        public void onCompleted() {
            p3g0<T, T> p3g0Var = this.f10974k;
            if (p3g0Var != null) {
                this.f10974k = null;
                p3g0Var.onCompleted();
            }
            this.f10968e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            p3g0<T, T> p3g0Var = this.f10974k;
            if (p3g0Var != null) {
                this.f10974k = null;
                p3g0Var.onError(th);
            }
            this.f10968e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            int i = this.f10973j;
            UnicastSubject unicastSubjectM9968d = this.f10974k;
            if (i == 0) {
                this.f10971h.getAndIncrement();
                unicastSubjectM9968d = UnicastSubject.m9968d(this.f10969f, this);
                this.f10974k = unicastSubjectM9968d;
                this.f10968e.onNext(unicastSubjectM9968d);
            }
            int i2 = i + 1;
            if (unicastSubjectM9968d != null) {
                unicastSubjectM9968d.onNext(t);
            }
            if (i2 == this.f10969f) {
                this.f10973j = i2;
                this.f10974k = null;
                unicastSubjectM9968d.onCompleted();
            } else if (i2 == this.f10970g) {
                this.f10973j = 0;
            } else {
                this.f10973j = i2;
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorWindowWithSize$a */
    public static final class C1141a<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<T>> f10975e;

        /* JADX INFO: renamed from: f */
        public final int f10976f;

        /* JADX INFO: renamed from: g */
        public final AtomicInteger f10977g = new AtomicInteger(1);

        /* JADX INFO: renamed from: h */
        public final c4g0 f10978h;

        /* JADX INFO: renamed from: i */
        public int f10979i;

        /* JADX INFO: renamed from: j */
        public p3g0<T, T> f10980j;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorWindowWithSize$a$a */
        public class a implements rc90 {
            public a() {
            }

            @Override // p003l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m8887a("n >= 0 required but it was ", j);
                } else if (j != 0) {
                    C1141a.this.m9242e(kc2.m5641c(C1141a.this.f10976f, j));
                }
            }
        }

        public C1141a(z3g0<? super C1099c<T>> z3g0Var, int i) {
            this.f10975e = z3g0Var;
            this.f10976f = i;
            c4g0 c4g0VarM4914a = h4g0.m4914a(this);
            this.f10978h = c4g0VarM4914a;
            m9240b(c4g0VarM4914a);
            m9242e(0L);
        }

        @Override // p003l.d30
        public void call() {
            if (this.f10977g.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public rc90 m9902h() {
            return new a();
        }

        @Override // p003l.m250
        public void onCompleted() {
            p3g0<T, T> p3g0Var = this.f10980j;
            if (p3g0Var != null) {
                this.f10980j = null;
                p3g0Var.onCompleted();
            }
            this.f10975e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            p3g0<T, T> p3g0Var = this.f10980j;
            if (p3g0Var != null) {
                this.f10980j = null;
                p3g0Var.onError(th);
            }
            this.f10975e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            int i = this.f10979i;
            UnicastSubject unicastSubjectM9968d = this.f10980j;
            if (i == 0) {
                this.f10977g.getAndIncrement();
                unicastSubjectM9968d = UnicastSubject.m9968d(this.f10976f, this);
                this.f10980j = unicastSubjectM9968d;
                this.f10975e.onNext(unicastSubjectM9968d);
            }
            int i2 = i + 1;
            unicastSubjectM9968d.onNext(t);
            if (i2 != this.f10976f) {
                this.f10979i = i2;
                return;
            }
            this.f10979i = 0;
            this.f10980j = null;
            unicastSubjectM9968d.onCompleted();
        }
    }

    public OperatorWindowWithSize(int i, int i2) {
        this.f10953a = i;
        this.f10954b = i2;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C1099c<T>> z3g0Var) {
        int i = this.f10954b;
        int i2 = this.f10953a;
        if (i == i2) {
            C1141a c1141a = new C1141a(z3g0Var, i2);
            z3g0Var.m9240b(c1141a.f10978h);
            z3g0Var.mo3257f(c1141a.m9902h());
            return c1141a;
        }
        if (i > i2) {
            WindowSkip windowSkip = new WindowSkip(z3g0Var, i2, i);
            z3g0Var.m9240b(windowSkip.f10972i);
            z3g0Var.mo3257f(windowSkip.m9900i());
            return windowSkip;
        }
        WindowOverlap windowOverlap = new WindowOverlap(z3g0Var, i2, i);
        z3g0Var.m9240b(windowOverlap.f10959i);
        z3g0Var.mo3257f(windowOverlap.m9896j());
        return windowOverlap;
    }
}
