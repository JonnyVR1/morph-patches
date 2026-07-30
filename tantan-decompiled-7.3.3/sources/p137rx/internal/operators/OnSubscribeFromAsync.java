package p137rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.AsyncEmitter;
import p137rx.C22421c;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p153l.gcg0;
import p153l.hrd0;
import p153l.j6f;
import p153l.kcg0;
import p153l.rc2;
import p153l.rzf0;
import p153l.urd0;
import p153l.vk90;
import p153l.wqe0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeFromAsync<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final y20<AsyncEmitter<T>> f208079a;

    /* JADX INFO: renamed from: b */
    public final AsyncEmitter.BackpressureMode f208080b;

    public static abstract class BaseAsyncEmitter<T> extends AtomicLong implements AsyncEmitter<T>, vk90, kcg0 {
        private static final long serialVersionUID = 7326289992464377023L;
        final gcg0<? super T> actual;
        final wqe0 serial = new wqe0();

        public BaseAsyncEmitter(gcg0<? super T> gcg0Var) {
            this.actual = gcg0Var;
        }

        @Override // p153l.kcg0
        public final boolean isUnsubscribed() {
            return this.serial.isUnsubscribed();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            try {
                this.actual.onCompleted();
            } finally {
                this.serial.unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            try {
                this.actual.onError(th);
            } finally {
                this.serial.unsubscribe();
            }
        }

        @Override // p153l.bb50
        public abstract /* synthetic */ void onNext(Object obj);

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        @Override // p153l.vk90
        public final void request(long j) {
            if (rc2.m180778j(j)) {
                rc2.m180770b(this, j);
                onRequested();
            }
        }

        public final long requested() {
            return get();
        }

        public final void setCancellation(AsyncEmitter.InterfaceC22418a interfaceC22418a) {
            setSubscription(new CancellableSubscription(interfaceC22418a));
        }

        public final void setSubscription(kcg0 kcg0Var) {
            this.serial.m207511b(kcg0Var);
        }

        @Override // p153l.kcg0
        public final void unsubscribe() {
            this.serial.unsubscribe();
            onUnsubscribed();
        }
    }

    public static final class BufferAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f208081nl;
        final Queue<Object> queue;
        final AtomicInteger wip;

        public BufferAsyncEmitter(gcg0<? super T> gcg0Var, int i) {
            super(gcg0Var);
            this.queue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new rzf0<>(i);
            this.wip = new AtomicInteger();
            this.f208081nl = NotificationLite.m222581f();
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            gcg0<? super T> gcg0Var = this.actual;
            Queue<Object> queue = this.queue;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (gcg0Var.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z = this.done;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            super.onError(th);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    gcg0Var.onNext(this.f208081nl.m222586e(objPoll));
                    j2++;
                }
                if (j2 == j) {
                    if (gcg0Var.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z3 = this.done;
                    boolean zIsEmpty = queue.isEmpty();
                    if (z3 && zIsEmpty) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            super.onError(th2);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    rc2.m180777i(this, j2);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p153l.bb50
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p153l.bb50
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p153l.bb50
        public void onNext(T t) {
            this.queue.offer(this.f208081nl.m222590j(t));
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter
        public void onRequested() {
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public static final class CancellableSubscription extends AtomicReference<AsyncEmitter.InterfaceC22418a> implements kcg0 {
        private static final long serialVersionUID = 5718521705281392066L;

        public CancellableSubscription(AsyncEmitter.InterfaceC22418a interfaceC22418a) {
            super(interfaceC22418a);
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return get() == null;
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            AsyncEmitter.InterfaceC22418a andSet;
            if (get() == null || (andSet = getAndSet(null)) == null) {
                return;
            }
            try {
                andSet.cancel();
            } catch (Exception e) {
                j6f.m143663e(e);
                hrd0.m136792j(e);
            }
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public DropAsyncEmitter(gcg0<? super T> gcg0Var) {
            super(gcg0Var);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.NoOverflowBaseAsyncEmitter
        public void onOverflow() {
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public ErrorAsyncEmitter(gcg0<? super T> gcg0Var) {
            super(gcg0Var);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.NoOverflowBaseAsyncEmitter
        public void onOverflow() {
            onError(new MissingBackpressureException("fromAsync: could not emit value due to lack of requests"));
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f208082nl;
        final AtomicReference<Object> queue;
        final AtomicInteger wip;

        public LatestAsyncEmitter(gcg0<? super T> gcg0Var) {
            super(gcg0Var);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
            this.f208082nl = NotificationLite.m222581f();
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            gcg0<? super T> gcg0Var = this.actual;
            AtomicReference<Object> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (gcg0Var.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z = this.done;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (z && z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            super.onError(th);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    gcg0Var.onNext(this.f208082nl.m222586e(andSet));
                    j2++;
                }
                if (j2 == j) {
                    if (gcg0Var.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.done;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            super.onError(th2);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    rc2.m180777i(this, j2);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p153l.bb50
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p153l.bb50
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p153l.bb50
        public void onNext(T t) {
            this.queue.set(this.f208082nl.m222590j(t));
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter
        public void onRequested() {
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public NoOverflowBaseAsyncEmitter(gcg0<? super T> gcg0Var) {
            super(gcg0Var);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p153l.bb50
        public final void onNext(T t) {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            if (get() == 0) {
                onOverflow();
            } else {
                this.actual.onNext(t);
                rc2.m180777i(this, 1L);
            }
        }

        public abstract void onOverflow();
    }

    public static final class NoneAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public NoneAsyncEmitter(gcg0<? super T> gcg0Var) {
            super(gcg0Var);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p153l.bb50
        public void onNext(T t) {
            long j;
            if (this.actual.isUnsubscribed()) {
                return;
            }
            this.actual.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeFromAsync$a */
    public static /* synthetic */ class C22435a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f208083a;

        static {
            int[] iArr = new int[AsyncEmitter.BackpressureMode.values().length];
            f208083a = iArr;
            try {
                iArr[AsyncEmitter.BackpressureMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f208083a[AsyncEmitter.BackpressureMode.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f208083a[AsyncEmitter.BackpressureMode.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f208083a[AsyncEmitter.BackpressureMode.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public OnSubscribeFromAsync(y20<AsyncEmitter<T>> y20Var, AsyncEmitter.BackpressureMode backpressureMode) {
        this.f208079a = y20Var;
        this.f208080b = backpressureMode;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        BaseAsyncEmitter noneAsyncEmitter;
        int i = C22435a.f208083a[this.f208080b.ordinal()];
        if (i == 1) {
            noneAsyncEmitter = new NoneAsyncEmitter(gcg0Var);
        } else if (i == 2) {
            noneAsyncEmitter = new ErrorAsyncEmitter(gcg0Var);
        } else if (i != 3) {
            noneAsyncEmitter = i != 4 ? new BufferAsyncEmitter(gcg0Var, urd0.f180601g) : new LatestAsyncEmitter(gcg0Var);
        } else {
            noneAsyncEmitter = new DropAsyncEmitter(gcg0Var);
        }
        gcg0Var.m129866b(noneAsyncEmitter);
        gcg0Var.mo95773f(noneAsyncEmitter);
        this.f208079a.call(noneAsyncEmitter);
    }
}
