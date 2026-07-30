package p149l;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;
import p133rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class y33<T> {

    /* JADX INFO: renamed from: b */
    public static final Object f195743b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f195744c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f195745d = new Object();

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f195746a;

    /* JADX INFO: renamed from: l.y33$a */
    public class C21300a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CountDownLatch f195747e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicReference f195748f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AtomicReference f195749g;

        public C21300a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f195747e = countDownLatch;
            this.f195748f = atomicReference;
            this.f195749g = atomicReference2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f195747e.countDown();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f195748f.set(th);
            this.f195747e.countDown();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f195749g.set(t);
        }
    }

    /* JADX INFO: renamed from: l.y33$b */
    public class C21301b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BlockingQueue f195751e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NotificationLite f195752f;

        public C21301b(BlockingQueue blockingQueue, NotificationLite notificationLite) {
            this.f195751e = blockingQueue;
            this.f195752f = notificationLite;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f195751e.offer(this.f195752f.m221337b());
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f195751e.offer(this.f195752f.m221338c(th));
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f195751e.offer(this.f195752f.m221344j(t));
        }
    }

    public y33(C22306c<? extends T> c22306c) {
        this.f195746a = c22306c;
    }

    /* JADX INFO: renamed from: d */
    public static <T> y33<T> m212768d(C22306c<? extends T> c22306c) {
        return new y33<>(c22306c);
    }

    /* JADX INFO: renamed from: a */
    public final T m212769a(C22306c<? extends T> c22306c) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        z33.m217013a(countDownLatch, c22306c.subscribe((z3g0<? super Object>) new C21300a(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            f5f.m119489c((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    /* JADX INFO: renamed from: b */
    public T m212770b() {
        return m212769a(this.f195746a.first());
    }

    /* JADX INFO: renamed from: c */
    public T m212771c(T t) {
        return m212769a(this.f195746a.map(UtilityFunctions.m221487b()).firstOrDefault(t));
    }

    /* JADX INFO: renamed from: e */
    public T m212772e() {
        return m212769a(this.f195746a.single());
    }

    /* JADX INFO: renamed from: f */
    public void m212773f(m250<? super T> m250Var) {
        Object objPoll;
        NotificationLite notificationLiteM221335f = NotificationLite.m221335f();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        c4g0 c4g0VarSubscribe = this.f195746a.subscribe((z3g0<? super Object>) new C21301b(linkedBlockingQueue, notificationLiteM221335f));
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
        } while (!notificationLiteM221335f.m221336a(m250Var, objPoll));
        c4g0VarSubscribe.unsubscribe();
    }
}
