package p153l;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;
import p137rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class o43<T> {

    /* JADX INFO: renamed from: b */
    public static final Object f144914b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f144915c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f144916d = new Object();

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f144917a;

    /* JADX INFO: renamed from: l.o43$a */
    public class C19028a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CountDownLatch f144918e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicReference f144919f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AtomicReference f144920g;

        public C19028a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f144918e = countDownLatch;
            this.f144919f = atomicReference;
            this.f144920g = atomicReference2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f144918e.countDown();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f144919f.set(th);
            this.f144918e.countDown();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f144920g.set(t);
        }
    }

    /* JADX INFO: renamed from: l.o43$b */
    public class C19029b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BlockingQueue f144922e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationLite f144923f;

        public C19029b(BlockingQueue blockingQueue, NotificationLite notificationLite) {
            this.f144922e = blockingQueue;
            this.f144923f = notificationLite;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f144922e.offer(this.f144923f.m222583b());
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f144922e.offer(this.f144923f.m222584c(th));
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f144922e.offer(this.f144923f.m222590j(t));
        }
    }

    public o43(C22421c<? extends T> c22421c) {
        this.f144917a = c22421c;
    }

    /* JADX INFO: renamed from: d */
    public static <T> o43<T> m165961d(C22421c<? extends T> c22421c) {
        return new o43<>(c22421c);
    }

    /* JADX INFO: renamed from: a */
    public final T m165962a(C22421c<? extends T> c22421c) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        p43.m170541a(countDownLatch, c22421c.subscribe((gcg0<? super Object>) new C19028a(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            j6f.m143661c((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    /* JADX INFO: renamed from: b */
    public T m165963b() {
        return m165962a(this.f144917a.first());
    }

    /* JADX INFO: renamed from: c */
    public T m165964c(T t) {
        return m165962a(this.f144917a.map(UtilityFunctions.m222733b()).firstOrDefault(t));
    }

    /* JADX INFO: renamed from: e */
    public T m165965e() {
        return m165962a(this.f144917a.single());
    }

    /* JADX INFO: renamed from: f */
    public void m165966f(bb50<? super T> bb50Var) {
        Object objPoll;
        NotificationLite notificationLiteM222581f = NotificationLite.m222581f();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        kcg0 kcg0VarSubscribe = this.f144917a.subscribe((gcg0<? super Object>) new C19029b(linkedBlockingQueue, notificationLiteM222581f));
        do {
            try {
                try {
                    objPoll = linkedBlockingQueue.poll();
                    if (objPoll == null) {
                        objPoll = linkedBlockingQueue.take();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    bb50Var.onError(e);
                    kcg0VarSubscribe.unsubscribe();
                    return;
                }
            } catch (Throwable th) {
                kcg0VarSubscribe.unsubscribe();
                throw th;
            }
        } while (!notificationLiteM222581f.m222582a(bb50Var, objPoll));
        kcg0VarSubscribe.unsubscribe();
    }
}
