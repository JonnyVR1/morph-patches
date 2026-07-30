package p133rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.exceptions.OnErrorNotImplementedException;
import p149l.bud0;
import p149l.e30;
import p149l.f30;
import p149l.pu50;
import p149l.v9j;
import p149l.vv5;
import p149l.w9j;
import p149l.x9j;

/* JADX INFO: loaded from: classes3.dex */
public enum InternalObservableUtils {
    ;

    public static final C22366i LONG_COUNTER = new C22366i();
    public static final C22364g OBJECT_EQUALS = new C22364g();
    public static final C22375r TO_ARRAY = new C22375r();
    static final C22373p RETURNS_VOID = new C22373p();
    public static final C22365h COUNTER = new C22365h();
    static final C22363f ERROR_EXTRACTOR = new C22363f();
    public static final e30<Throwable> ERROR_NOT_IMPLEMENTED = new e30<Throwable>() { // from class: rx.internal.util.InternalObservableUtils.d
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };
    public static final C22306c.c<Boolean, Object> IS_EMPTY = new pu50(UtilityFunctions.m221486a(), true);

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$b */
    public static final class C22359b<T, R> implements x9j<R, T, R> {

        /* JADX INFO: renamed from: a */
        public final f30<R, ? super T> f207404a;

        public C22359b(f30<R, ? super T> f30Var) {
            this.f207404a = f30Var;
        }

        @Override // p149l.x9j
        public R call(R r, T t) {
            this.f207404a.call(r, t);
            return r;
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$c */
    public static final class C22360c implements w9j<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final Object f207405a;

        public C22360c(Object obj) {
            this.f207405a = obj;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            Object obj2 = this.f207405a;
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$e */
    public static final class C22362e implements w9j<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final Class<?> f207406a;

        public C22362e(Class<?> cls) {
            this.f207406a = cls;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.f207406a.isInstance(obj));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$f */
    public static final class C22363f implements w9j<Notification<?>, Throwable> {
        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Notification<?> notification) {
            return notification.m221294e();
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$g */
    public static final class C22364g implements x9j<Object, Object, Boolean> {
        @Override // p149l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$h */
    public static final class C22365h implements x9j<Integer, Object, Integer> {
        @Override // p149l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$i */
    public static final class C22366i implements x9j<Long, Object, Long> {
        @Override // p149l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call(Long l2, Object obj) {
            return Long.valueOf(l2.longValue() + 1);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$j */
    public static final class C22367j implements w9j<C22306c<? extends Notification<?>>, C22306c<?>> {

        /* JADX INFO: renamed from: a */
        public final w9j<? super C22306c<? extends Void>, ? extends C22306c<?>> f207407a;

        public C22367j(w9j<? super C22306c<? extends Void>, ? extends C22306c<?>> w9jVar) {
            this.f207407a = w9jVar;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<?> call(C22306c<? extends Notification<?>> c22306c) {
            return this.f207407a.call(c22306c.map(InternalObservableUtils.RETURNS_VOID));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$k */
    public static final class C22368k<T> implements v9j<vv5<T>> {

        /* JADX INFO: renamed from: a */
        public final C22306c<T> f207408a;

        /* JADX INFO: renamed from: b */
        public final int f207409b;

        public C22368k(C22306c<T> c22306c, int i) {
            this.f207408a = c22306c;
            this.f207409b = i;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv5<T> call() {
            return this.f207408a.replay(this.f207409b);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$l */
    public static final class C22369l<T> implements v9j<vv5<T>> {

        /* JADX INFO: renamed from: a */
        public final TimeUnit f207410a;

        /* JADX INFO: renamed from: b */
        public final C22306c<T> f207411b;

        /* JADX INFO: renamed from: c */
        public final long f207412c;

        /* JADX INFO: renamed from: d */
        public final bud0 f207413d;

        public C22369l(C22306c<T> c22306c, long j, TimeUnit timeUnit, bud0 bud0Var) {
            this.f207410a = timeUnit;
            this.f207411b = c22306c;
            this.f207412c = j;
            this.f207413d = bud0Var;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv5<T> call() {
            return this.f207411b.replay(this.f207412c, this.f207410a, this.f207413d);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$m */
    public static final class C22370m<T> implements v9j<vv5<T>> {

        /* JADX INFO: renamed from: a */
        public final C22306c<T> f207414a;

        public C22370m(C22306c<T> c22306c) {
            this.f207414a = c22306c;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv5<T> call() {
            return this.f207414a.replay();
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$n */
    public static final class C22371n<T> implements v9j<vv5<T>> {

        /* JADX INFO: renamed from: a */
        public final long f207415a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f207416b;

        /* JADX INFO: renamed from: c */
        public final bud0 f207417c;

        /* JADX INFO: renamed from: d */
        public final int f207418d;

        /* JADX INFO: renamed from: e */
        public final C22306c<T> f207419e;

        public C22371n(C22306c<T> c22306c, int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
            this.f207415a = j;
            this.f207416b = timeUnit;
            this.f207417c = bud0Var;
            this.f207418d = i;
            this.f207419e = c22306c;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv5<T> call() {
            return this.f207419e.replay(this.f207418d, this.f207415a, this.f207416b, this.f207417c);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$o */
    public static final class C22372o implements w9j<C22306c<? extends Notification<?>>, C22306c<?>> {

        /* JADX INFO: renamed from: a */
        public final w9j<? super C22306c<? extends Throwable>, ? extends C22306c<?>> f207420a;

        public C22372o(w9j<? super C22306c<? extends Throwable>, ? extends C22306c<?>> w9jVar) {
            this.f207420a = w9jVar;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<?> call(C22306c<? extends Notification<?>> c22306c) {
            return this.f207420a.call(c22306c.map(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$p */
    public static final class C22373p implements w9j<Object, Void> {
        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$q */
    public static final class C22374q<T, R> implements w9j<C22306c<T>, C22306c<R>> {

        /* JADX INFO: renamed from: a */
        public final w9j<? super C22306c<T>, ? extends C22306c<R>> f207421a;

        /* JADX INFO: renamed from: b */
        public final bud0 f207422b;

        public C22374q(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, bud0 bud0Var) {
            this.f207421a = w9jVar;
            this.f207422b = bud0Var;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<R> call(C22306c<T> c22306c) {
            return this.f207421a.call(c22306c).observeOn(this.f207422b);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$r */
    public static final class C22375r implements w9j<List<? extends C22306c<?>>, C22306c<?>[]> {
        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<?>[] call(List<? extends C22306c<?>> list) {
            return (C22306c[]) list.toArray(new C22306c[list.size()]);
        }
    }

    public static <T, R> x9j<R, T, R> createCollectorCaller(f30<R, ? super T> f30Var) {
        return new C22359b(f30Var);
    }

    public static final w9j<C22306c<? extends Notification<?>>, C22306c<?>> createRepeatDematerializer(w9j<? super C22306c<? extends Void>, ? extends C22306c<?>> w9jVar) {
        return new C22367j(w9jVar);
    }

    public static <T, R> w9j<C22306c<T>, C22306c<R>> createReplaySelectorAndObserveOn(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, bud0 bud0Var) {
        return new C22374q(w9jVar, bud0Var);
    }

    public static <T> v9j<vv5<T>> createReplaySupplier(C22306c<T> c22306c, int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return new C22371n(c22306c, i, j, timeUnit, bud0Var);
    }

    public static final w9j<C22306c<? extends Notification<?>>, C22306c<?>> createRetryDematerializer(w9j<? super C22306c<? extends Throwable>, ? extends C22306c<?>> w9jVar) {
        return new C22372o(w9jVar);
    }

    public static w9j<Object, Boolean> equalsWith(Object obj) {
        return new C22360c(obj);
    }

    public static w9j<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new C22362e(cls);
    }

    public static <T> v9j<vv5<T>> createReplaySupplier(C22306c<T> c22306c, int i) {
        return new C22368k(c22306c, i);
    }

    public static <T> v9j<vv5<T>> createReplaySupplier(C22306c<T> c22306c, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return new C22369l(c22306c, j, timeUnit, bud0Var);
    }

    public static <T> v9j<vv5<T>> createReplaySupplier(C22306c<T> c22306c) {
        return new C22370m(c22306c);
    }
}
