package p003l;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;
import p014rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class y33<T> {

    /* JADX INFO: renamed from: b */
    public static final Object f8897b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f8898c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f8899d = new Object();

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f8900a;

    /* JADX INFO: renamed from: l.y33$a */
    public class C0652a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CountDownLatch f8901e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicReference f8902f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AtomicReference f8903g;

        public C0652a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f8901e = countDownLatch;
            this.f8902f = atomicReference;
            this.f8903g = atomicReference2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f8901e.countDown();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8902f.set(th);
            this.f8901e.countDown();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f8903g.set(t);
        }
    }

    /* JADX INFO: renamed from: l.y33$b */
    public class C0653b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BlockingQueue f8905e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationLite f8906f;

        public C0653b(BlockingQueue blockingQueue, NotificationLite notificationLite) {
            this.f8905e = blockingQueue;
            this.f8906f = notificationLite;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f8905e.offer(this.f8906f.m9794b());
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8905e.offer(this.f8906f.m9795c(th));
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f8905e.offer(this.f8906f.m9801j(t));
        }
    }

    public y33(C1099c<? extends T> c1099c) {
        this.f8900a = c1099c;
    }

    /* JADX INFO: renamed from: d */
    public static <T> y33<T> m8881d(C1099c<? extends T> c1099c) {
        return new y33<>(c1099c);
    }

    /* JADX INFO: renamed from: a */
    public final T m8882a(C1099c<? extends T> c1099c) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        z33.m9239a(countDownLatch, c1099c.subscribe((z3g0<? super Object>) new C0652a(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            f5f.m3962c((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    /* JADX INFO: renamed from: b */
    public T m8883b() {
        return m8882a(this.f8900a.first());
    }

    /* JADX INFO: renamed from: c */
    public T m8884c(T t) {
        return m8882a(this.f8900a.map(UtilityFunctions.m9944b()).firstOrDefault(t));
    }

    /* JADX INFO: renamed from: e */
    public T m8885e() {
        return m8882a(this.f8900a.single());
    }

    /* JADX INFO: renamed from: f */
    public void m8886f(m250<? super T> m250Var) {
        Object objPoll;
        NotificationLite notificationLiteM9792f = NotificationLite.m9792f();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        c4g0 c4g0VarSubscribe = this.f8900a.subscribe((z3g0<? super Object>) new C0653b(linkedBlockingQueue, notificationLiteM9792f));
        do {
            try {
                try {
                    objPoll = linkedBlockingQueue.poll();
                    if (objPoll == null) {
                        objPoll = linkedBlockingQueue.take();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    m250Var.onError(e);
                    c4g0VarSubscribe.unsubscribe();
                    return;
                }
            } catch (Throwable th) {
                c4g0VarSubscribe.unsubscribe();
                throw th;
            }
        } while (!notificationLiteM9792f.m9793a(m250Var, objPoll));
        c4g0VarSubscribe.unsubscribe();
    }
}
