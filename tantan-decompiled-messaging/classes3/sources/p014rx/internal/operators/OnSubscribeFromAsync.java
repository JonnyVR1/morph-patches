package p014rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p003l.c4g0;
import p003l.e30;
import p003l.ejd0;
import p003l.f5f;
import p003l.irf0;
import p003l.kc2;
import p003l.rc90;
import p003l.rie0;
import p003l.rjd0;
import p003l.z3g0;
import p014rx.AsyncEmitter;
import p014rx.C1099c;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OnSubscribeFromAsync<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final e30<AsyncEmitter<T>> f10782a;

    /* JADX INFO: renamed from: b */
    public final AsyncEmitter.BackpressureMode f10783b;

    public static abstract class BaseAsyncEmitter<T> extends AtomicLong implements AsyncEmitter<T>, rc90, c4g0 {
        private static final long serialVersionUID = 7326289992464377023L;
        final z3g0<? super T> actual;
        final rie0 serial = new rie0();

        public BaseAsyncEmitter(z3g0<? super T> z3g0Var) {
            this.actual = z3g0Var;
        }

        @Override // p003l.c4g0
        public final boolean isUnsubscribed() {
            return this.serial.isUnsubscribed();
        }

        @Override // p003l.m250
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

        @Override // p003l.m250
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

        @Override // p003l.m250
        public abstract /* synthetic */ void onNext(Object obj);

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        @Override // p003l.rc90
        public final void request(long j) {
            if (kc2.m5648j(j)) {
                kc2.m5640b(this, j);
                onRequested();
            }
        }

        public final long requested() {
            return get();
        }

        public final void setCancellation(AsyncEmitter.InterfaceC1096a interfaceC1096a) {
            setSubscription(new CancellableSubscription(interfaceC1096a));
        }

        public final void setSubscription(c4g0 c4g0Var) {
            this.serial.m7260b(c4g0Var);
        }

        @Override // p003l.c4g0
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
        final NotificationLite<T> f10784nl;
        final Queue<Object> queue;
        final AtomicInteger wip;

        public BufferAsyncEmitter(z3g0<? super T> z3g0Var, int i) {
            super(z3g0Var);
            this.queue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new irf0<>(i);
            this.wip = new AtomicInteger();
            this.f10784nl = NotificationLite.m9792f();
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super T> z3g0Var = this.actual;
            Queue<Object> queue = this.queue;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (z3g0Var.isUnsubscribed()) {
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
                    z3g0Var.onNext(this.f10784nl.m9797e(objPoll));
                    j2++;
                }
                if (j2 == j) {
                    if (z3g0Var.isUnsubscribed()) {
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
                    kc2.m5647i(this, j2);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p003l.m250
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p003l.m250
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p003l.m250
        public void onNext(T t) {
            this.queue.offer(this.f10784nl.m9801j(t));
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

    public static final class CancellableSubscription extends AtomicReference<AsyncEmitter.InterfaceC1096a> implements c4g0 {
        private static final long serialVersionUID = 5718521705281392066L;

        public CancellableSubscription(AsyncEmitter.InterfaceC1096a interfaceC1096a) {
            super(interfaceC1096a);
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return get() == null;
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            AsyncEmitter.InterfaceC1096a andSet;
            if (get() == null || (andSet = getAndSet(null)) == null) {
                return;
            }
            try {
                andSet.cancel();
            } catch (Exception e) {
                f5f.m3964e(e);
                ejd0.m3864j(e);
            }
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public DropAsyncEmitter(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.NoOverflowBaseAsyncEmitter
        public void onOverflow() {
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public ErrorAsyncEmitter(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
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
        final NotificationLite<T> f10785nl;
        final AtomicReference<Object> queue;
        final AtomicInteger wip;

        public LatestAsyncEmitter(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
            this.f10785nl = NotificationLite.m9792f();
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super T> z3g0Var = this.actual;
            AtomicReference<Object> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (z3g0Var.isUnsubscribed()) {
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
                    z3g0Var.onNext(this.f10785nl.m9797e(andSet));
                    j2++;
                }
                if (j2 == j) {
                    if (z3g0Var.isUnsubscribed()) {
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
                    kc2.m5647i(this, j2);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p003l.m250
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p003l.m250
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p003l.m250
        public void onNext(T t) {
            this.queue.set(this.f10785nl.m9801j(t));
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

        public NoOverflowBaseAsyncEmitter(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p003l.m250
        public final void onNext(T t) {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            if (get() == 0) {
                onOverflow();
            } else {
                this.actual.onNext(t);
                kc2.m5647i(this, 1L);
            }
        }

        public abstract void onOverflow();
    }

    public static final class NoneAsyncEmitter<T> extends BaseAsyncEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public NoneAsyncEmitter(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
        }

        @Override // rx.internal.operators.OnSubscribeFromAsync.BaseAsyncEmitter, p003l.m250
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
    public static /* synthetic */ class C1113a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10786a;

        static {
            int[] iArr = new int[AsyncEmitter.BackpressureMode.values().length];
            f10786a = iArr;
            try {
                iArr[AsyncEmitter.BackpressureMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10786a[AsyncEmitter.BackpressureMode.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10786a[AsyncEmitter.BackpressureMode.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10786a[AsyncEmitter.BackpressureMode.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public OnSubscribeFromAsync(e30<AsyncEmitter<T>> e30Var, AsyncEmitter.BackpressureMode backpressureMode) {
        this.f10782a = e30Var;
        this.f10783b = backpressureMode;
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
    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        BaseAsyncEmitter noneAsyncEmitter;
        int i = C1113a.f10786a[this.f10783b.ordinal()];
        if (i == 1) {
            noneAsyncEmitter = new NoneAsyncEmitter(z3g0Var);
        } else if (i == 2) {
            noneAsyncEmitter = new ErrorAsyncEmitter(z3g0Var);
        } else if (i != 3) {
            noneAsyncEmitter = i != 4 ? new BufferAsyncEmitter(z3g0Var, rjd0.f6938g) : new LatestAsyncEmitter(z3g0Var);
        } else {
            noneAsyncEmitter = new DropAsyncEmitter(z3g0Var);
        }
        z3g0Var.m9240b(noneAsyncEmitter);
        z3g0Var.mo3257f(noneAsyncEmitter);
        this.f10782a.call(noneAsyncEmitter);
    }
}
