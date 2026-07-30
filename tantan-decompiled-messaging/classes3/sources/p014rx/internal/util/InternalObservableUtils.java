package p014rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p003l.bud0;
import p003l.e30;
import p003l.f30;
import p003l.pu50;
import p003l.v9j;
import p003l.vv5;
import p003l.w9j;
import p003l.x9j;
import p014rx.C1099c;
import p014rx.Notification;
import p014rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum InternalObservableUtils {
    ;

    public static final C1159i LONG_COUNTER = new C1159i();
    public static final C1157g OBJECT_EQUALS = new C1157g();
    public static final C1168r TO_ARRAY = new C1168r();
    static final C1166p RETURNS_VOID = new C1166p();
    public static final C1158h COUNTER = new C1158h();
    static final C1156f ERROR_EXTRACTOR = new C1156f();
    public static final e30<Throwable> ERROR_NOT_IMPLEMENTED = new e30<Throwable>() { // from class: rx.internal.util.InternalObservableUtils.d
        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };
    public static final C1099c.c<Boolean, Object> IS_EMPTY = new pu50(UtilityFunctions.m9943a(), true);

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$b */
    public static final class C1152b<T, R> implements x9j<R, T, R> {

        /* JADX INFO: renamed from: a */
        public final f30<R, ? super T> f11029a;

        public C1152b(f30<R, ? super T> f30Var) {
            this.f11029a = f30Var;
        }

        @Override // p003l.x9j
        public R call(R r, T t) {
            this.f11029a.call(r, t);
            return r;
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$c */
    public static final class C1153c implements w9j<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final Object f11030a;

        public C1153c(Object obj) {
            this.f11030a = obj;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            Object obj2 = this.f11030a;
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$e */
    public static final class C1155e implements w9j<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final Class<?> f11031a;

        public C1155e(Class<?> cls) {
            this.f11031a = cls;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.f11031a.isInstance(obj));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$f */
    public static final class C1156f implements w9j<Notification<?>, Throwable> {
        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Notification<?> notification) {
            return notification.m9751e();
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$g */
    public static final class C1157g implements x9j<Object, Object, Boolean> {
        @Override // p003l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$h */
    public static final class C1158h implements x9j<Integer, Object, Integer> {
        @Override // p003l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$i */
    public static final class C1159i implements x9j<Long, Object, Long> {
        @Override // p003l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call(Long l2, Object obj) {
            return Long.valueOf(l2.longValue() + 1);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$j */
    public static final class C1160j implements w9j<C1099c<? extends Notification<?>>, C1099c<?>> {

        /* JADX INFO: renamed from: a */
        public final w9j<? super C1099c<? extends Void>, ? extends C1099c<?>> f11032a;

        public C1160j(w9j<? super C1099c<? extends Void>, ? extends C1099c<?>> w9jVar) {
            this.f11032a = w9jVar;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<?> call(C1099c<? extends Notification<?>> c1099c) {
            return this.f11032a.call(c1099c.map(InternalObservableUtils.RETURNS_VOID));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$k */
    public static final class C1161k<T> implements v9j<vv5<T>> {

        /* JADX INFO: renamed from: a */
        public final C1099c<T> f11033a;

        /* JADX INFO: renamed from: b */
        public final int f11034b;

        public C1161k(C1099c<T> c1099c, int i) {
            this.f11033a = c1099c;
            this.f11034b = i;
        }

        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv5<T> call() {
            return this.f11033a.replay(this.f11034b);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$l */
    public static final class C1162l<T> implements v9j<vv5<T>> {

        /* JADX INFO: renamed from: a */
        public final TimeUnit f11035a;

        /* JADX INFO: renamed from: b */
        public final C1099c<T> f11036b;

        /* JADX INFO: renamed from: c */
        public final long f11037c;

        /* JADX INFO: renamed from: d */
        public final bud0 f11038d;

        public C1162l(C1099c<T> c1099c, long j, TimeUnit timeUnit, bud0 bud0Var) {
            this.f11035a = timeUnit;
            this.f11036b = c1099c;
            this.f11037c = j;
            this.f11038d = bud0Var;
        }

        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv5<T> call() {
            return this.f11036b.replay(this.f11037c, this.f11035a, this.f11038d);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$m */
    public static final class C1163m<T> implements v9j<vv5<T>> {

        /* JADX INFO: renamed from: a */
        public final C1099c<T> f11039a;

        public C1163m(C1099c<T> c1099c) {
            this.f11039a = c1099c;
        }

        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv5<T> call() {
            return this.f11039a.replay();
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$n */
    public static final class C1164n<T> implements v9j<vv5<T>> {

        /* JADX INFO: renamed from: a */
        public final long f11040a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f11041b;

        /* JADX INFO: renamed from: c */
        public final bud0 f11042c;

        /* JADX INFO: renamed from: d */
        public final int f11043d;

        /* JADX INFO: renamed from: e */
        public final C1099c<T> f11044e;

        public C1164n(C1099c<T> c1099c, int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
            this.f11040a = j;
            this.f11041b = timeUnit;
            this.f11042c = bud0Var;
            this.f11043d = i;
            this.f11044e = c1099c;
        }

        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv5<T> call() {
            return this.f11044e.replay(this.f11043d, this.f11040a, this.f11041b, this.f11042c);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$o */
    public static final class C1165o implements w9j<C1099c<? extends Notification<?>>, C1099c<?>> {

        /* JADX INFO: renamed from: a */
        public final w9j<? super C1099c<? extends Throwable>, ? extends C1099c<?>> f11045a;

        public C1165o(w9j<? super C1099c<? extends Throwable>, ? extends C1099c<?>> w9jVar) {
            this.f11045a = w9jVar;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<?> call(C1099c<? extends Notification<?>> c1099c) {
            return this.f11045a.call(c1099c.map(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$p */
    public static final class C1166p implements w9j<Object, Void> {
        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$q */
    public static final class C1167q<T, R> implements w9j<C1099c<T>, C1099c<R>> {

        /* JADX INFO: renamed from: a */
        public final w9j<? super C1099c<T>, ? extends C1099c<R>> f11046a;

        /* JADX INFO: renamed from: b */
        public final bud0 f11047b;

        public C1167q(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, bud0 bud0Var) {
            this.f11046a = w9jVar;
            this.f11047b = bud0Var;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<R> call(C1099c<T> c1099c) {
            return this.f11046a.call(c1099c).observeOn(this.f11047b);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.InternalObservableUtils$r */
    public static final class C1168r implements w9j<List<? extends C1099c<?>>, C1099c<?>[]> {
        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<?>[] call(List<? extends C1099c<?>> list) {
            return (C1099c[]) list.toArray(new C1099c[list.size()]);
        }
    }

    public static <T, R> x9j<R, T, R> createCollectorCaller(f30<R, ? super T> f30Var) {
        return new C1152b(f30Var);
    }

    public static final w9j<C1099c<? extends Notification<?>>, C1099c<?>> createRepeatDematerializer(w9j<? super C1099c<? extends Void>, ? extends C1099c<?>> w9jVar) {
        return new C1160j(w9jVar);
    }

    public static <T, R> w9j<C1099c<T>, C1099c<R>> createReplaySelectorAndObserveOn(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, bud0 bud0Var) {
        return new C1167q(w9jVar, bud0Var);
    }

    public static <T> v9j<vv5<T>> createReplaySupplier(C1099c<T> c1099c, int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return new C1164n(c1099c, i, j, timeUnit, bud0Var);
    }

    public static final w9j<C1099c<? extends Notification<?>>, C1099c<?>> createRetryDematerializer(w9j<? super C1099c<? extends Throwable>, ? extends C1099c<?>> w9jVar) {
        return new C1165o(w9jVar);
    }

    public static w9j<Object, Boolean> equalsWith(Object obj) {
        return new C1153c(obj);
    }

    public static w9j<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new C1155e(cls);
    }

    public static <T> v9j<vv5<T>> createReplaySupplier(C1099c<T> c1099c, int i) {
        return new C1161k(c1099c, i);
    }

    public static <T> v9j<vv5<T>> createReplaySupplier(C1099c<T> c1099c, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return new C1162l(c1099c, j, timeUnit, bud0Var);
    }

    public static <T> v9j<vv5<T>> createReplaySupplier(C1099c<T> c1099c) {
        return new C1163m(c1099c);
    }
}
