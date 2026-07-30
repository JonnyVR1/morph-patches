package p137rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.exceptions.OnErrorNotImplementedException;
import p153l.ax5;
import p153l.f2e0;
import p153l.pcj;
import p153l.qcj;
import p153l.rcj;
import p153l.v260;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes3.dex */
public enum InternalObservableUtils {
    ;

    public static final C22481i LONG_COUNTER = new C22481i();
    public static final C22479g OBJECT_EQUALS = new C22479g();
    public static final C22490r TO_ARRAY = new C22490r();
    static final C22488p RETURNS_VOID = new C22488p();
    public static final C22480h COUNTER = new C22480h();
    static final C22478f ERROR_EXTRACTOR = new C22478f();
    public static final y20<Throwable> ERROR_NOT_IMPLEMENTED = new y20<Throwable>() { // from class: rx.internal.util.InternalObservableUtils.d
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };
    public static final C22421c.c<Boolean, Object> IS_EMPTY = new v260(UtilityFunctions.m222732a(), true);

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$b */
    public static final class C22474b<T, R> implements rcj<R, T, R> {

        /* JADX INFO: renamed from: a */
        public final z20<R, ? super T> f208326a;

        public C22474b(z20<R, ? super T> z20Var) {
            this.f208326a = z20Var;
        }

        @Override // p153l.rcj
        public R call(R r, T t) {
            this.f208326a.call(r, t);
            return r;
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$c */
    public static final class C22475c implements qcj<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final Object f208327a;

        public C22475c(Object obj) {
            this.f208327a = obj;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            Object obj2 = this.f208327a;
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$e */
    public static final class C22477e implements qcj<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final Class<?> f208328a;

        public C22477e(Class<?> cls) {
            this.f208328a = cls;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.f208328a.isInstance(obj));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$f */
    public static final class C22478f implements qcj<Notification<?>, Throwable> {
        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Notification<?> notification) {
            return notification.m222540e();
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$g */
    public static final class C22479g implements rcj<Object, Object, Boolean> {
        @Override // p153l.rcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$h */
    public static final class C22480h implements rcj<Integer, Object, Integer> {
        @Override // p153l.rcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$i */
    public static final class C22481i implements rcj<Long, Object, Long> {
        @Override // p153l.rcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call(Long l2, Object obj) {
            return Long.valueOf(l2.longValue() + 1);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$j */
    public static final class C22482j implements qcj<C22421c<? extends Notification<?>>, C22421c<?>> {

        /* JADX INFO: renamed from: a */
        public final qcj<? super C22421c<? extends Void>, ? extends C22421c<?>> f208329a;

        public C22482j(qcj<? super C22421c<? extends Void>, ? extends C22421c<?>> qcjVar) {
            this.f208329a = qcjVar;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<?> call(C22421c<? extends Notification<?>> c22421c) {
            return this.f208329a.call(c22421c.map(InternalObservableUtils.RETURNS_VOID));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$k */
    public static final class C22483k<T> implements pcj<ax5<T>> {

        /* JADX INFO: renamed from: a */
        public final C22421c<T> f208330a;

        /* JADX INFO: renamed from: b */
        public final int f208331b;

        public C22483k(C22421c<T> c22421c, int i) {
            this.f208330a = c22421c;
            this.f208331b = i;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ax5<T> call() {
            return this.f208330a.replay(this.f208331b);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$l */
    public static final class C22484l<T> implements pcj<ax5<T>> {

        /* JADX INFO: renamed from: a */
        public final TimeUnit f208332a;

        /* JADX INFO: renamed from: b */
        public final C22421c<T> f208333b;

        /* JADX INFO: renamed from: c */
        public final long f208334c;

        /* JADX INFO: renamed from: d */
        public final f2e0 f208335d;

        public C22484l(C22421c<T> c22421c, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
            this.f208332a = timeUnit;
            this.f208333b = c22421c;
            this.f208334c = j;
            this.f208335d = f2e0Var;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ax5<T> call() {
            return this.f208333b.replay(this.f208334c, this.f208332a, this.f208335d);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$m */
    public static final class C22485m<T> implements pcj<ax5<T>> {

        /* JADX INFO: renamed from: a */
        public final C22421c<T> f208336a;

        public C22485m(C22421c<T> c22421c) {
            this.f208336a = c22421c;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ax5<T> call() {
            return this.f208336a.replay();
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$n */
    public static final class C22486n<T> implements pcj<ax5<T>> {

        /* JADX INFO: renamed from: a */
        public final long f208337a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f208338b;

        /* JADX INFO: renamed from: c */
        public final f2e0 f208339c;

        /* JADX INFO: renamed from: d */
        public final int f208340d;

        /* JADX INFO: renamed from: e */
        public final C22421c<T> f208341e;

        public C22486n(C22421c<T> c22421c, int i, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
            this.f208337a = j;
            this.f208338b = timeUnit;
            this.f208339c = f2e0Var;
            this.f208340d = i;
            this.f208341e = c22421c;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ax5<T> call() {
            return this.f208341e.replay(this.f208340d, this.f208337a, this.f208338b, this.f208339c);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$o */
    public static final class C22487o implements qcj<C22421c<? extends Notification<?>>, C22421c<?>> {

        /* JADX INFO: renamed from: a */
        public final qcj<? super C22421c<? extends Throwable>, ? extends C22421c<?>> f208342a;

        public C22487o(qcj<? super C22421c<? extends Throwable>, ? extends C22421c<?>> qcjVar) {
            this.f208342a = qcjVar;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<?> call(C22421c<? extends Notification<?>> c22421c) {
            return this.f208342a.call(c22421c.map(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$p */
    public static final class C22488p implements qcj<Object, Void> {
        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$q */
    public static final class C22489q<T, R> implements qcj<C22421c<T>, C22421c<R>> {

        /* JADX INFO: renamed from: a */
        public final qcj<? super C22421c<T>, ? extends C22421c<R>> f208343a;

        /* JADX INFO: renamed from: b */
        public final f2e0 f208344b;

        public C22489q(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, f2e0 f2e0Var) {
            this.f208343a = qcjVar;
            this.f208344b = f2e0Var;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<R> call(C22421c<T> c22421c) {
            return this.f208343a.call(c22421c).observeOn(this.f208344b);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$r */
    public static final class C22490r implements qcj<List<? extends C22421c<?>>, C22421c<?>[]> {
        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<?>[] call(List<? extends C22421c<?>> list) {
            return (C22421c[]) list.toArray(new C22421c[list.size()]);
        }
    }

    public static <T, R> rcj<R, T, R> createCollectorCaller(z20<R, ? super T> z20Var) {
        return new C22474b(z20Var);
    }

    public static final qcj<C22421c<? extends Notification<?>>, C22421c<?>> createRepeatDematerializer(qcj<? super C22421c<? extends Void>, ? extends C22421c<?>> qcjVar) {
        return new C22482j(qcjVar);
    }

    public static <T, R> qcj<C22421c<T>, C22421c<R>> createReplaySelectorAndObserveOn(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, f2e0 f2e0Var) {
        return new C22489q(qcjVar, f2e0Var);
    }

    public static <T> pcj<ax5<T>> createReplaySupplier(C22421c<T> c22421c, int i, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return new C22486n(c22421c, i, j, timeUnit, f2e0Var);
    }

    public static final qcj<C22421c<? extends Notification<?>>, C22421c<?>> createRetryDematerializer(qcj<? super C22421c<? extends Throwable>, ? extends C22421c<?>> qcjVar) {
        return new C22487o(qcjVar);
    }

    public static qcj<Object, Boolean> equalsWith(Object obj) {
        return new C22475c(obj);
    }

    public static qcj<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new C22477e(cls);
    }

    public static <T> pcj<ax5<T>> createReplaySupplier(C22421c<T> c22421c, int i) {
        return new C22483k(c22421c, i);
    }

    public static <T> pcj<ax5<T>> createReplaySupplier(C22421c<T> c22421c, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return new C22484l(c22421c, j, timeUnit, f2e0Var);
    }

    public static <T> pcj<ax5<T>> createReplaySupplier(C22421c<T> c22421c) {
        return new C22485m(c22421c);
    }
}
