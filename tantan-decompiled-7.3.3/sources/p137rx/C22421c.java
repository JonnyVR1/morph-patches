package p137rx;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p137rx.exceptions.OnErrorFailedException;
import p137rx.internal.operators.C22466a;
import p137rx.internal.operators.CachedObservable;
import p137rx.internal.operators.EmptyObservableHolder;
import p137rx.internal.operators.NeverObservableHolder;
import p137rx.internal.operators.OnSubscribeCombineLatest;
import p137rx.internal.operators.OnSubscribeDetach;
import p137rx.internal.operators.OnSubscribeFromArray;
import p137rx.internal.operators.OnSubscribeFromAsync;
import p137rx.internal.operators.OnSubscribeFromIterable;
import p137rx.internal.operators.OnSubscribeRange;
import p137rx.internal.operators.OnSubscribeUsing;
import p137rx.internal.operators.OperatorBufferWithSize;
import p137rx.internal.operators.OperatorEagerConcatMap;
import p137rx.internal.operators.OperatorElementAt;
import p137rx.internal.operators.OperatorGroupBy;
import p137rx.internal.operators.OperatorMerge;
import p137rx.internal.operators.OperatorOnBackpressureLatest;
import p137rx.internal.operators.OperatorPublish;
import p137rx.internal.operators.OperatorReplay;
import p137rx.internal.operators.OperatorWindowWithSize;
import p137rx.internal.operators.OperatorZip;
import p137rx.internal.util.InternalObservableUtils;
import p137rx.internal.util.ScalarSynchronousObservable;
import p137rx.internal.util.UtilityFunctions;
import p137rx.observables.SyncOnSubscribe;
import p137rx.schedulers.Schedulers;
import p153l.a360;
import p153l.a460;
import p153l.a560;
import p153l.ao50;
import p153l.ax5;
import p153l.b460;
import p153l.b560;
import p153l.bb50;
import p153l.bo50;
import p153l.c40;
import p153l.c460;
import p153l.c560;
import p153l.co50;
import p153l.d460;
import p153l.d560;
import p153l.db50;
import p153l.do50;
import p153l.e360;
import p153l.e460;
import p153l.e560;
import p153l.edj;
import p153l.eo50;
import p153l.f2e0;
import p153l.f360;
import p153l.f460;
import p153l.f560;
import p153l.fo50;
import p153l.g360;
import p153l.g460;
import p153l.g560;
import p153l.gcg0;
import p153l.go50;
import p153l.h360;
import p153l.h460;
import p153l.h560;
import p153l.ho50;
import p153l.hrd0;
import p153l.i360;
import p153l.i460;
import p153l.i560;
import p153l.io50;
import p153l.j360;
import p153l.j460;
import p153l.j560;
import p153l.j6f;
import p153l.jo50;
import p153l.k0j0;
import p153l.k360;
import p153l.k460;
import p153l.k560;
import p153l.kcg0;
import p153l.ko50;
import p153l.l360;
import p153l.l460;
import p153l.l560;
import p153l.lo50;
import p153l.m360;
import p153l.m460;
import p153l.m560;
import p153l.mnd0;
import p153l.n360;
import p153l.n460;
import p153l.no50;
import p153l.nwd0;
import p153l.o360;
import p153l.o43;
import p153l.o460;
import p153l.oo50;
import p153l.oqk;
import p153l.p30;
import p153l.p360;
import p153l.p460;
import p153l.pcg0;
import p153l.pcj;
import p153l.po50;
import p153l.q360;
import p153l.q460;
import p153l.qcj;
import p153l.qo50;
import p153l.qzi0;
import p153l.r360;
import p153l.r460;
import p153l.rcj;
import p153l.ro50;
import p153l.s21;
import p153l.s360;
import p153l.s460;
import p153l.scj;
import p153l.so50;
import p153l.t360;
import p153l.t460;
import p153l.tcj;
import p153l.u260;
import p153l.u360;
import p153l.u460;
import p153l.ucj;
import p153l.urd0;
import p153l.v260;
import p153l.v360;
import p153l.v460;
import p153l.vcj;
import p153l.vn50;
import p153l.w260;
import p153l.w360;
import p153l.w460;
import p153l.wcj;
import p153l.wg3;
import p153l.wtq0;
import p153l.x20;
import p153l.x260;
import p153l.x360;
import p153l.x460;
import p153l.xcj;
import p153l.xn50;
import p153l.y20;
import p153l.y260;
import p153l.y30;
import p153l.y360;
import p153l.ycj;
import p153l.yn50;
import p153l.z20;
import p153l.z260;
import p153l.z360;
import p153l.z460;
import p153l.za50;
import p153l.zcj;
import p153l.zn50;

/* JADX INFO: renamed from: rx.c */
/* JADX INFO: loaded from: classes3.dex */
public class C22421c<T> {
    final a<T> onSubscribe;

    /* JADX INFO: renamed from: rx.c$a */
    public interface a<T> extends y20<gcg0<? super T>> {
    }

    /* JADX INFO: renamed from: rx.c$b */
    public static final class b<T> implements a<T> {

        /* JADX INFO: renamed from: a */
        public final C22421c<T> f208035a;

        public b(C22421c<T> c22421c) {
            this.f208035a = c22421c;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            gcg0Var.m129866b(C22421c.subscribe(gcg0Var, this.f208035a));
        }
    }

    /* JADX INFO: renamed from: rx.c$c */
    public interface c<R, T> extends qcj<gcg0<? super R>, gcg0<? super T>> {
    }

    /* JADX INFO: renamed from: rx.c$d */
    public interface d<T, R> extends qcj<C22421c<T>, C22421c<R>> {
    }

    public C22421c(a<T> aVar) {
        this.onSubscribe = aVar;
    }

    public static <T> C22421c<T> amb(Iterable<? extends C22421c<? extends T>> iterable) {
        return create(vn50.m201925a(iterable));
    }

    public static <T1, T2, R> C22421c<R> combineLatest(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, rcj<? super T1, ? super T2, ? extends R> rcjVar) {
        return combineLatest(Arrays.asList(c22421c, c22421c2), edj.m120459a(rcjVar));
    }

    public static <T, R> C22421c<R> combineLatestDelayError(Iterable<? extends C22421c<? extends T>> iterable, zcj<? extends R> zcjVar) {
        return create(new OnSubscribeCombineLatest(null, iterable, zcjVar, urd0.f180601g, true));
    }

    public static <T> C22421c<T> concat(C22421c<? extends C22421c<? extends T>> c22421c) {
        return (C22421c<T>) c22421c.concatMap(UtilityFunctions.m222733b());
    }

    public static <T> C22421c<T> concatDelayError(C22421c<? extends C22421c<? extends T>> c22421c) {
        return (C22421c<T>) c22421c.concatMapDelayError(UtilityFunctions.m222733b());
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2) {
        return concatEager(Arrays.asList(c22421c, c22421c2));
    }

    public static <T> C22421c<T> create(a<T> aVar) {
        return new C22421c<>(hrd0.m136790h(aVar));
    }

    public static <T> C22421c<T> defer(pcj<C22421c<T>> pcjVar) {
        return create(new zn50(pcjVar));
    }

    public static <T> C22421c<T> empty() {
        return EmptyObservableHolder.instance();
    }

    public static <T> C22421c<T> error(Throwable th) {
        return create(new po50(th));
    }

    public static <T> C22421c<T> from(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return empty();
        }
        return length == 1 ? just(tArr[0]) : create(new OnSubscribeFromArray(tArr));
    }

    public static <T> C22421c<T> fromAsync(y20<AsyncEmitter<T>> y20Var, AsyncEmitter.BackpressureMode backpressureMode) {
        return create(new OnSubscribeFromAsync(y20Var, backpressureMode));
    }

    public static <T> C22421c<T> fromCallable(Callable<? extends T> callable) {
        return create(new eo50(callable));
    }

    public static C22421c<Long> interval(long j, long j2, TimeUnit timeUnit, f2e0 f2e0Var) {
        return create(new ro50(j, j2, timeUnit, f2e0Var));
    }

    public static <T> C22421c<T> just(T t, T t2) {
        return from(new Object[]{t, t2});
    }

    private <R> C22421c<R> mapNotification(qcj<? super T, ? extends R> qcjVar, qcj<? super Throwable, ? extends R> qcjVar2, pcj<? extends R> pcjVar) {
        return lift(new r360(qcjVar, qcjVar2, pcjVar));
    }

    public static <T> C22421c<T> merge(C22421c<? extends C22421c<? extends T>> c22421c) {
        return c22421c.getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) c22421c).m222725d(UtilityFunctions.m222733b()) : (C22421c<T>) c22421c.lift(OperatorMerge.m222627b(false));
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends C22421c<? extends T>> c22421c) {
        return (C22421c<T>) c22421c.lift(OperatorMerge.m222627b(true));
    }

    public static <T> C22421c<T> never() {
        return NeverObservableHolder.instance();
    }

    public static C22421c<Integer> range(int i, int i2) {
        if (i2 < 0) {
            wg3.m206174a("Count can not be negative");
            return null;
        }
        if (i2 == 0) {
            return empty();
        }
        if (i <= Integer.MIN_VALUE - i2) {
            return i2 == 1 ? just(Integer.valueOf(i)) : create(new OnSubscribeRange(i, (i2 - 1) + i));
        }
        wg3.m206174a("start + count can not exceed Integer.MAX_VALUE");
        return null;
    }

    public static <T> C22421c<Boolean> sequenceEqual(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2) {
        return sequenceEqual(c22421c, c22421c2, InternalObservableUtils.OBJECT_EQUALS);
    }

    public static <T> kcg0 subscribe(gcg0<? super T> gcg0Var, C22421c<T> c22421c) {
        if (gcg0Var == null) {
            wg3.m206174a("subscriber can not be null");
            return null;
        }
        if (c22421c.onSubscribe == null) {
            wtq0.m207906a("onSubscribe function can not be null.");
            return null;
        }
        gcg0Var.mo95884d();
        if (!(gcg0Var instanceof nwd0)) {
            gcg0Var = new nwd0(gcg0Var);
        }
        try {
            hrd0.m136798p(c22421c, c22421c.onSubscribe).call(gcg0Var);
            return hrd0.m136797o(gcg0Var);
        } catch (Throwable th) {
            j6f.m143663e(th);
            if (gcg0Var.isUnsubscribed()) {
                hrd0.m136792j(hrd0.m136795m(th));
            } else {
                try {
                    gcg0Var.onError(hrd0.m136795m(th));
                } catch (Throwable th2) {
                    j6f.m143663e(th2);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    hrd0.m136795m(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return pcg0.m171651d();
        }
    }

    public static <T> C22421c<T> switchOnNext(C22421c<? extends C22421c<? extends T>> c22421c) {
        return (C22421c<T>) c22421c.lift(m460.m156979b(false));
    }

    public static <T> C22421c<T> switchOnNextDelayError(C22421c<? extends C22421c<? extends T>> c22421c) {
        return (C22421c<T>) c22421c.lift(m460.m156979b(true));
    }

    @Deprecated
    public static C22421c<Long> timer(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, Schedulers.computation());
    }

    public static <T, Resource> C22421c<T> using(pcj<Resource> pcjVar, qcj<? super Resource, ? extends C22421c<? extends T>> qcjVar, y20<? super Resource> y20Var, boolean z) {
        return create(new OnSubscribeUsing(pcjVar, qcjVar, y20Var, z));
    }

    public static <R> C22421c<R> zip(Iterable<? extends C22421c<?>> iterable, zcj<? extends R> zcjVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends C22421c<?>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return just(arrayList.toArray(new C22421c[arrayList.size()])).lift(new OperatorZip(zcjVar));
    }

    public final C22421c<Boolean> all(qcj<? super T, Boolean> qcjVar) {
        return lift(new u260(qcjVar));
    }

    public final C22421c<T> ambWith(C22421c<? extends T> c22421c) {
        return amb(this, c22421c);
    }

    public final C22421c<T> asObservable() {
        return (C22421c<T>) lift(w260.m204539b());
    }

    public final C22421c<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return (C22421c<List<T>>) lift(new z260(j, j, timeUnit, i, Schedulers.computation()));
    }

    public final C22421c<T> cache() {
        return CachedObservable.m222575a(this);
    }

    public final C22421c<T> cacheWithInitialCapacity(int i) {
        return CachedObservable.m222576b(this, i);
    }

    public final <R> C22421c<R> cast(Class<R> cls) {
        return lift(new a360(cls));
    }

    public final <R> C22421c<R> collect(pcj<R> pcjVar, z20<R, ? super T> z20Var) {
        return create(new xn50(this, pcjVar, z20Var));
    }

    public <R> C22421c<R> compose(d<? super T, ? extends R> dVar) {
        return (C22421c) dVar.call(this);
    }

    public final <R> C22421c<R> concatMap(qcj<? super T, ? extends C22421c<? extends R>> qcjVar) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m222725d(qcjVar) : create(new yn50(this, qcjVar, 2, 0));
    }

    public final <R> C22421c<R> concatMapDelayError(qcj<? super T, ? extends C22421c<? extends R>> qcjVar) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m222725d(qcjVar) : create(new yn50(this, qcjVar, 2, 2));
    }

    public final <R> C22421c<R> concatMapEager(qcj<? super T, ? extends C22421c<? extends R>> qcjVar, int i, int i2) {
        if (i < 1) {
            za50.m219101a("capacityHint > 0 required but it was ", i);
            return null;
        }
        if (i2 >= 1) {
            return lift(new OperatorEagerConcatMap(qcjVar, i, i2));
        }
        za50.m219101a("maxConcurrent > 0 required but it was ", i);
        return null;
    }

    public final <R> C22421c<R> concatMapIterable(qcj<? super T, ? extends Iterable<? extends R>> qcjVar) {
        return C22466a.m222695b(this, qcjVar, urd0.f180601g);
    }

    public final C22421c<T> concatWith(C22421c<? extends T> c22421c) {
        return concat(this, c22421c);
    }

    public final C22421c<Boolean> contains(Object obj) {
        return exists(InternalObservableUtils.equalsWith(obj));
    }

    public final C22421c<Integer> count() {
        return reduce(0, InternalObservableUtils.COUNTER);
    }

    public final C22421c<Long> countLong() {
        return reduce(0L, InternalObservableUtils.LONG_COUNTER);
    }

    public final <U> C22421c<T> debounce(qcj<? super T, ? extends C22421c<U>> qcjVar) {
        return (C22421c<T>) lift(new e360(qcjVar));
    }

    public final C22421c<T> defaultIfEmpty(T t) {
        return switchIfEmpty(just(t));
    }

    public final <U, V> C22421c<T> delay(pcj<? extends C22421c<U>> pcjVar, qcj<? super T, ? extends C22421c<V>> qcjVar) {
        return (C22421c<T>) delaySubscription(pcjVar).lift(new h360(this, qcjVar));
    }

    public final C22421c<T> delaySubscription(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return create(new ao50(this, j, timeUnit, f2e0Var));
    }

    public final <T2> C22421c<T2> dematerialize() {
        return (C22421c<T2>) lift(i360.m138276b());
    }

    public final <U> C22421c<T> distinct(qcj<? super T, ? extends U> qcjVar) {
        return (C22421c<T>) lift(new j360(qcjVar));
    }

    public final <U> C22421c<T> distinctUntilChanged(qcj<? super T, ? extends U> qcjVar) {
        return (C22421c<T>) lift(new k360(qcjVar));
    }

    public final C22421c<T> doAfterTerminate(x20 x20Var) {
        return (C22421c<T>) lift(new l360(x20Var));
    }

    public final C22421c<T> doOnCompleted(x20 x20Var) {
        return (C22421c<T>) lift(new m360(new y30(c40.m107815a(), c40.m107815a(), x20Var)));
    }

    public final C22421c<T> doOnEach(y20<Notification<? super T>> y20Var) {
        return (C22421c<T>) lift(new m360(new p30(y20Var)));
    }

    public final C22421c<T> doOnError(y20<Throwable> y20Var) {
        return (C22421c<T>) lift(new m360(new y30(c40.m107815a(), y20Var, c40.m107815a())));
    }

    public final C22421c<T> doOnNext(y20<? super T> y20Var) {
        return (C22421c<T>) lift(new m360(new y30(y20Var, c40.m107815a(), c40.m107815a())));
    }

    public final C22421c<T> doOnRequest(y20<Long> y20Var) {
        return (C22421c<T>) lift(new n360(y20Var));
    }

    public final C22421c<T> doOnSubscribe(x20 x20Var) {
        return (C22421c<T>) lift(new o360(x20Var));
    }

    public final C22421c<T> doOnTerminate(x20 x20Var) {
        return (C22421c<T>) lift(new m360(new y30(c40.m107815a(), c40.m107816b(x20Var), x20Var)));
    }

    public final C22421c<T> doOnUnsubscribe(x20 x20Var) {
        return (C22421c<T>) lift(new p360(x20Var));
    }

    public final C22421c<T> elementAt(int i) {
        return (C22421c<T>) lift(new OperatorElementAt(i));
    }

    public final C22421c<T> elementAtOrDefault(int i, T t) {
        return (C22421c<T>) lift(new OperatorElementAt(i, t));
    }

    public final C22421c<Boolean> exists(qcj<? super T, Boolean> qcjVar) {
        return lift(new v260(qcjVar, false));
    }

    public <R> R extend(qcj<? super a<T>, ? extends R> qcjVar) {
        return qcjVar.call(new b(this));
    }

    public final C22421c<T> filter(qcj<? super T, Boolean> qcjVar) {
        return create(new do50(this, qcjVar));
    }

    @Deprecated
    public final C22421c<T> finallyDo(x20 x20Var) {
        return (C22421c<T>) lift(new l360(x20Var));
    }

    public final C22421c<T> first() {
        return take(1).single();
    }

    public final C22421c<T> firstOrDefault(T t) {
        return take(1).singleOrDefault(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22421c<R> flatMap(qcj<? super T, ? extends C22421c<? extends R>> qcjVar) {
        return getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) this).m222725d(qcjVar) : merge(map(qcjVar));
    }

    public final <U, R> C22421c<R> flatMapIterable(qcj<? super T, ? extends Iterable<? extends U>> qcjVar, rcj<? super T, ? super U, ? extends R> rcjVar) {
        return flatMap(s360.m184228b(qcjVar), rcjVar);
    }

    public final void forEach(y20<? super T> y20Var) {
        subscribe(y20Var);
    }

    public final <K, R> C22421c<oqk<K, R>> groupBy(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends R> qcjVar2, qcj<y20<K>, Map<K, Object>> qcjVar3) {
        if (qcjVar3 != null) {
            return lift(new OperatorGroupBy(qcjVar, qcjVar2, qcjVar3));
        }
        mnd0.m159157a("evictingMapFactory cannot be null");
        return null;
    }

    public final <T2, D1, D2, R> C22421c<R> groupJoin(C22421c<T2> c22421c, qcj<? super T, ? extends C22421c<D1>> qcjVar, qcj<? super T2, ? extends C22421c<D2>> qcjVar2, rcj<? super T, ? super C22421c<T2>, ? extends R> rcjVar) {
        return create(new fo50(this, c22421c, qcjVar, qcjVar2, rcjVar));
    }

    public final C22421c<T> ignoreElements() {
        return (C22421c<T>) lift(q360.m175117b());
    }

    public final C22421c<Boolean> isEmpty() {
        return lift(InternalObservableUtils.IS_EMPTY);
    }

    public final <TRight, TLeftDuration, TRightDuration, R> C22421c<R> join(C22421c<TRight> c22421c, qcj<T, C22421c<TLeftDuration>> qcjVar, qcj<TRight, C22421c<TRightDuration>> qcjVar2, rcj<T, TRight, R> rcjVar) {
        return create(new go50(this, c22421c, qcjVar, qcjVar2, rcjVar));
    }

    public final C22421c<T> last(qcj<? super T, Boolean> qcjVar) {
        return filter(qcjVar).takeLast(1).single();
    }

    public final C22421c<T> lastOrDefault(T t, qcj<? super T, Boolean> qcjVar) {
        return filter(qcjVar).takeLast(1).singleOrDefault(t);
    }

    public final <R> C22421c<R> lift(c<? extends R, ? super T> cVar) {
        return create(new ho50(this.onSubscribe, cVar));
    }

    public final C22421c<T> limit(int i) {
        return take(i);
    }

    public final <R> C22421c<R> map(qcj<? super T, ? extends R> qcjVar) {
        return create(new io50(this, qcjVar));
    }

    public final C22421c<Notification<T>> materialize() {
        return (C22421c<Notification<T>>) lift(t360.m189077b());
    }

    public final C22421c<T> mergeWith(C22421c<? extends T> c22421c) {
        return merge(this, c22421c);
    }

    public final C22421c<C22421c<T>> nest() {
        return just(this);
    }

    public final C22421c<T> observeOn(f2e0 f2e0Var, boolean z, int i) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m222726e(f2e0Var) : (C22421c<T>) lift(new u360(f2e0Var, z, i));
    }

    public final <R> C22421c<R> ofType(Class<R> cls) {
        return filter(InternalObservableUtils.isInstanceOf(cls)).cast(cls);
    }

    public final C22421c<T> onBackpressureBuffer(long j) {
        return (C22421c<T>) lift(new v360(j));
    }

    public final C22421c<T> onBackpressureDrop(y20<? super T> y20Var) {
        return (C22421c<T>) lift(new w360(y20Var));
    }

    public final C22421c<T> onBackpressureLatest() {
        return (C22421c<T>) lift(OperatorOnBackpressureLatest.m222648b());
    }

    public final C22421c<T> onErrorResumeNext(qcj<Throwable, ? extends C22421c<? extends T>> qcjVar) {
        return (C22421c<T>) lift(new x360(qcjVar));
    }

    public final C22421c<T> onErrorReturn(qcj<Throwable, ? extends T> qcjVar) {
        return (C22421c<T>) lift(x360.m209196d(qcjVar));
    }

    public final C22421c<T> onExceptionResumeNext(C22421c<? extends T> c22421c) {
        return (C22421c<T>) lift(x360.m209194b(c22421c));
    }

    public final C22421c<T> onTerminateDetach() {
        return create(new OnSubscribeDetach(this));
    }

    public final ax5<T> publish() {
        return OperatorPublish.m222651e(this);
    }

    public final C22421c<T> rebatchRequests(int i) {
        if (i > 0) {
            return (C22421c<T>) lift(u360.m194329b(i));
        }
        za50.m219101a("n > 0 required but it was ", i);
        return null;
    }

    public final C22421c<T> reduce(rcj<T, T, T> rcjVar) {
        return create(new ko50(this, rcjVar));
    }

    public final C22421c<T> repeat() {
        return jo50.m146331b(this);
    }

    public final C22421c<T> repeatWhen(qcj<? super C22421c<? extends Void>, ? extends C22421c<?>> qcjVar, f2e0 f2e0Var) {
        return jo50.m146335f(this, InternalObservableUtils.createRepeatDematerializer(qcjVar), f2e0Var);
    }

    public final <R> C22421c<R> replay(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, int i, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        if (i >= 0) {
            return OperatorReplay.m222666j(InternalObservableUtils.createReplaySupplier(this, i, j, timeUnit, f2e0Var), qcjVar);
        }
        wg3.m206174a("bufferSize < 0");
        return null;
    }

    public final C22421c<T> retry(rcj<Integer, Throwable, Boolean> rcjVar) {
        return (C22421c<T>) nest().lift(new y360(rcjVar));
    }

    public final C22421c<T> retryWhen(qcj<? super C22421c<? extends Throwable>, ? extends C22421c<?>> qcjVar) {
        return jo50.m146339j(this, InternalObservableUtils.createRetryDematerializer(qcjVar));
    }

    public final C22421c<T> sample(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new a460(j, timeUnit, f2e0Var));
    }

    public final C22421c<T> scan(rcj<T, T, T> rcjVar) {
        return (C22421c<T>) lift(new b460(rcjVar));
    }

    public final C22421c<T> serialize() {
        return (C22421c<T>) lift(d460.m114110b());
    }

    public final C22421c<T> share() {
        return publish().m100760d();
    }

    public final C22421c<T> single() {
        return (C22421c<T>) lift(e460.m119388b());
    }

    public final C22421c<T> singleOrDefault(T t) {
        return (C22421c<T>) lift(new e460(t));
    }

    public final C22421c<T> skip(int i) {
        return (C22421c<T>) lift(new f460(i));
    }

    public final C22421c<T> skipLast(int i) {
        return (C22421c<T>) lift(new g460(i));
    }

    public final <U> C22421c<T> skipUntil(C22421c<U> c22421c) {
        return (C22421c<T>) lift(new j460(c22421c));
    }

    public final C22421c<T> skipWhile(qcj<? super T, Boolean> qcjVar) {
        return (C22421c<T>) lift(new k460(k460.m148237b(qcjVar)));
    }

    public final C22421c<T> startWith(Iterable<T> iterable) {
        return concat(from(iterable), this);
    }

    public final C22421c<T> subscribeOn(f2e0 f2e0Var) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m222726e(f2e0Var) : create(new l460(this, f2e0Var));
    }

    public final C22421c<T> switchIfEmpty(C22421c<? extends T> c22421c) {
        return (C22421c<T>) lift(new n460(c22421c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22421c<R> switchMap(qcj<? super T, ? extends C22421c<? extends R>> qcjVar) {
        return switchOnNext(map(qcjVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22421c<R> switchMapDelayError(qcj<? super T, ? extends C22421c<? extends R>> qcjVar) {
        return switchOnNextDelayError(map(qcjVar));
    }

    public final C22421c<T> take(int i) {
        return (C22421c<T>) lift(new o460(i));
    }

    public final C22421c<T> takeFirst(qcj<? super T, Boolean> qcjVar) {
        return filter(qcjVar).take(1);
    }

    public final C22421c<T> takeLast(int i) {
        if (i == 0) {
            return ignoreElements();
        }
        return i == 1 ? create(new oo50(this)) : (C22421c<T>) lift(new p460(i));
    }

    public final C22421c<List<T>> takeLastBuffer(int i) {
        return takeLast(i).toList();
    }

    public final <E> C22421c<T> takeUntil(C22421c<? extends E> c22421c) {
        return (C22421c<T>) lift(new s460(c22421c));
    }

    public final C22421c<T> takeWhile(qcj<? super T, Boolean> qcjVar) {
        return (C22421c<T>) lift(new u460(qcjVar));
    }

    public final C22421c<T> throttleFirst(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new v460(j, timeUnit, f2e0Var));
    }

    public final C22421c<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final C22421c<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final C22421c<qzi0<T>> timeInterval(f2e0 f2e0Var) {
        return (C22421c<qzi0<T>>) lift(new w460(f2e0Var));
    }

    public final <U, V> C22421c<T> timeout(pcj<? extends C22421c<U>> pcjVar, qcj<? super T, ? extends C22421c<V>> qcjVar, C22421c<? extends T> c22421c) {
        if (qcjVar != null) {
            return (C22421c<T>) lift(new z460(pcjVar, qcjVar, c22421c));
        }
        mnd0.m159157a("timeoutSelector is null");
        return null;
    }

    public final C22421c<k0j0<T>> timestamp(f2e0 f2e0Var) {
        return (C22421c<k0j0<T>>) lift(new a560(f2e0Var));
    }

    public final o43<T> toBlocking() {
        return o43.m165961d(this);
    }

    public C22420b toCompletable() {
        return C22420b.m222552f(this);
    }

    public final C22421c<List<T>> toList() {
        return (C22421c<List<T>>) lift(d560.m114290b());
    }

    public final <K> C22421c<Map<K, T>> toMap(qcj<? super T, ? extends K> qcjVar) {
        return (C22421c<Map<K, T>>) lift(new b560(qcjVar, UtilityFunctions.m222733b()));
    }

    public final <K> C22421c<Map<K, Collection<T>>> toMultimap(qcj<? super T, ? extends K> qcjVar) {
        return (C22421c<Map<K, Collection<T>>>) lift(new c560(qcjVar, UtilityFunctions.m222733b()));
    }

    public C22422d<T> toSingle() {
        return new C22422d<>(no50.m164042b(this));
    }

    public final C22421c<List<T>> toSortedList() {
        return (C22421c<List<T>>) lift(new e560(10));
    }

    public final kcg0 unsafeSubscribe(gcg0<? super T> gcg0Var) {
        try {
            gcg0Var.mo95884d();
            hrd0.m136798p(this, this.onSubscribe).call(gcg0Var);
            return hrd0.m136797o(gcg0Var);
        } catch (Throwable th) {
            j6f.m143663e(th);
            try {
                gcg0Var.onError(hrd0.m136795m(th));
                return pcg0.m171651d();
            } catch (Throwable th2) {
                j6f.m143663e(th2);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                hrd0.m136795m(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    public final C22421c<T> unsubscribeOn(f2e0 f2e0Var) {
        return (C22421c<T>) lift(new f560(f2e0Var));
    }

    public final C22421c<C22421c<T>> window(int i, int i2) {
        if (i <= 0) {
            za50.m219101a("count > 0 required but it was ", i);
            return null;
        }
        if (i2 > 0) {
            return (C22421c<C22421c<T>>) lift(new OperatorWindowWithSize(i, i2));
        }
        za50.m219101a("skip > 0 required but it was ", i2);
        return null;
    }

    public final <T1, T2, R> C22421c<R> withLatestFrom(C22421c<T1> c22421c, C22421c<T2> c22421c2, scj<? super T, ? super T1, ? super T2, R> scjVar) {
        return create(new l560(this, new C22421c[]{c22421c, c22421c2}, null, edj.m120460b(scjVar)));
    }

    public final <T2, R> C22421c<R> zipWith(Iterable<? extends T2> iterable, rcj<? super T, ? super T2, ? extends R> rcjVar) {
        return lift(new m560(iterable, rcjVar));
    }

    public final void forEach(y20<? super T> y20Var, y20<Throwable> y20Var2) {
        subscribe(y20Var, y20Var2);
    }

    @Deprecated
    public final C22421c<T> cache(int i) {
        return cacheWithInitialCapacity(i);
    }

    public final void forEach(y20<? super T> y20Var, y20<Throwable> y20Var2, x20 x20Var) {
        subscribe(y20Var, y20Var2, x20Var);
    }

    public final <R> C22421c<R> publish(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar) {
        return OperatorPublish.m222652f(this, qcjVar);
    }

    public final C22421c<T> repeat(f2e0 f2e0Var) {
        return jo50.m146336g(this, f2e0Var);
    }

    public final C22421c<T> throttleLast(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return sample(j, timeUnit, f2e0Var);
    }

    public final C22421c<T> throttleWithTimeout(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return debounce(j, timeUnit, f2e0Var);
    }

    public final C22421c<T> repeat(long j) {
        return jo50.m146332c(this, j);
    }

    public static <T> C22421c<Boolean> sequenceEqual(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, rcj<? super T, ? super T, Boolean> rcjVar) {
        return c460.m107863b(c22421c, c22421c2, rcjVar);
    }

    public final C22421c<T> repeat(long j, f2e0 f2e0Var) {
        return jo50.m146333d(this, j, f2e0Var);
    }

    public static <T> C22421c<T> amb(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2) {
        return create(vn50.m201926b(c22421c, c22421c2));
    }

    public static <T> C22421c<T> concat(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2) {
        return concat(just(c22421c, c22421c2));
    }

    public static <T> C22421c<T> concatDelayError(Iterable<? extends C22421c<? extends T>> iterable) {
        return concatDelayError(from(iterable));
    }

    public static <T> C22421c<T> just(T t) {
        return ScalarSynchronousObservable.m222722a(t);
    }

    public final <R> C22421c<R> flatMapIterable(qcj<? super T, ? extends Iterable<? extends R>> qcjVar, int i) {
        return C22466a.m222695b(this, qcjVar, i);
    }

    public final C22421c<T> repeatWhen(qcj<? super C22421c<? extends Void>, ? extends C22421c<?>> qcjVar) {
        return jo50.m146334e(this, InternalObservableUtils.createRepeatDematerializer(qcjVar));
    }

    public final C22421c<T> retryWhen(qcj<? super C22421c<? extends Throwable>, ? extends C22421c<?>> qcjVar, f2e0 f2e0Var) {
        return jo50.m146340k(this, InternalObservableUtils.createRetryDematerializer(qcjVar), f2e0Var);
    }

    public final C22421c<T> single(qcj<? super T, Boolean> qcjVar) {
        return filter(qcjVar).single();
    }

    public final C22421c<T> startWith(C22421c<T> c22421c) {
        return concat(c22421c, this);
    }

    public final C22421c<List<T>> takeLastBuffer(int i, long j, TimeUnit timeUnit) {
        return takeLast(i, j, timeUnit).toList();
    }

    public static <T> C22421c<T> amb(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3) {
        return create(vn50.m201927c(c22421c, c22421c2, c22421c3));
    }

    public static <T> C22421c<T> concat(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3) {
        return concat(just(c22421c, c22421c2, c22421c3));
    }

    public static <S, T> C22421c<T> create(SyncOnSubscribe<S, T> syncOnSubscribe) {
        return create((a) syncOnSubscribe);
    }

    public static <T> C22421c<T> just(T t, T t2, T t3) {
        return from(new Object[]{t, t2, t3});
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends C22421c<? extends T>> c22421c, int i) {
        return (C22421c<T>) c22421c.lift(OperatorMerge.m222628c(true, i));
    }

    public static <T, Resource> C22421c<T> using(pcj<Resource> pcjVar, qcj<? super Resource, ? extends C22421c<? extends T>> qcjVar, y20<? super Resource> y20Var) {
        return using(pcjVar, qcjVar, y20Var, false);
    }

    public final C22421c<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<T> distinct() {
        return (C22421c<T>) lift(j360.m143338b());
    }

    public final C22421c<T> distinctUntilChanged() {
        return (C22421c<T>) lift(k360.m148002c());
    }

    public final C22421c<T> first(qcj<? super T, Boolean> qcjVar) {
        return takeFirst(qcjVar).single();
    }

    public final C22421c<T> firstOrDefault(T t, qcj<? super T, Boolean> qcjVar) {
        return takeFirst(qcjVar).singleOrDefault(t);
    }

    public final <R> C22421c<R> flatMapIterable(qcj<? super T, ? extends Iterable<? extends R>> qcjVar) {
        return flatMapIterable(qcjVar, urd0.f180601g);
    }

    public final C22421c<T> onBackpressureBuffer() {
        return (C22421c<T>) lift(v360.m199205b());
    }

    public final C22421c<T> onBackpressureDrop() {
        return (C22421c<T>) lift(w360.m204762b());
    }

    public final C22421c<T> onErrorResumeNext(C22421c<? extends T> c22421c) {
        return (C22421c<T>) lift(x360.m209195c(c22421c));
    }

    public final <R> C22421c<R> reduce(R r, rcj<R, ? super T, R> rcjVar) {
        return create(new lo50(this, r, rcjVar));
    }

    public final C22421c<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, Schedulers.computation());
    }

    public final <R> C22421c<R> scan(R r, rcj<R, ? super T, R> rcjVar) {
        return lift(new b460(r, rcjVar));
    }

    public final C22421c<T> singleOrDefault(T t, qcj<? super T, Boolean> qcjVar) {
        return filter(qcjVar).singleOrDefault(t);
    }

    public final C22421c<T> skip(long j, TimeUnit timeUnit) {
        return skip(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<T> startWith(T t) {
        return concat(just(t), this);
    }

    public final C22421c<T> take(long j, TimeUnit timeUnit) {
        return take(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<List<T>> takeLastBuffer(int i, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return takeLast(i, j, timeUnit, f2e0Var).toList();
    }

    public final C22421c<T> takeUntil(qcj<? super T, Boolean> qcjVar) {
        return (C22421c<T>) lift(new t460(qcjVar));
    }

    public final C22421c<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<qzi0<T>> timeInterval() {
        return timeInterval(Schedulers.computation());
    }

    public final C22421c<k0j0<T>> timestamp() {
        return timestamp(Schedulers.computation());
    }

    public final <T2, R> C22421c<R> zipWith(C22421c<? extends T2> c22421c, rcj<? super T, ? super T2, ? extends R> rcjVar) {
        return zip(this, c22421c, rcjVar);
    }

    public static <T> C22421c<T> amb(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4) {
        return create(vn50.m201928d(c22421c, c22421c2, c22421c3, c22421c4));
    }

    public static <T> C22421c<T> concat(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4) {
        return concat(just(c22421c, c22421c2, c22421c3, c22421c4));
    }

    public static <S, T> C22421c<T> create(s21<S, T> s21Var) {
        return create((a) s21Var);
    }

    public static <T> C22421c<T> just(T t, T t2, T t3, T t4) {
        return from(new Object[]{t, t2, t3, t4});
    }

    public static <T> C22421c<T> mergeDelayError(Iterable<? extends C22421c<? extends T>> iterable) {
        return mergeDelayError(from(iterable));
    }

    public final C22421c<T> debounce(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new f360(j, timeUnit, f2e0Var));
    }

    public final C22421c<T> distinctUntilChanged(rcj<? super T, ? super T, Boolean> rcjVar) {
        return (C22421c<T>) lift(new k360(rcjVar));
    }

    public final <U, R> C22421c<R> flatMapIterable(qcj<? super T, ? extends Iterable<? extends U>> qcjVar, rcj<? super T, ? super U, ? extends R> rcjVar, int i) {
        return flatMap(s360.m184228b(qcjVar), rcjVar, i);
    }

    public final C22421c<T> onBackpressureBuffer(long j, x20 x20Var) {
        return (C22421c<T>) lift(new v360(j, x20Var));
    }

    public final <U> C22421c<T> sample(C22421c<U> c22421c) {
        return (C22421c<T>) lift(new z360(c22421c));
    }

    public final C22421c<T> skip(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new i460(j, timeUnit, f2e0Var));
    }

    public final C22421c<T> skipLast(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new h460(j, timeUnit, f2e0Var));
    }

    public final C22421c<T> startWith(T t, T t2) {
        return concat(just(t, t2), this);
    }

    public final C22421c<T> take(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new r460(j, timeUnit, f2e0Var));
    }

    public final C22421c<List<T>> takeLastBuffer(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit).toList();
    }

    public static <T> C22421c<T> amb(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5) {
        return create(vn50.m201929e(c22421c, c22421c2, c22421c3, c22421c4, c22421c5));
    }

    public static <T> C22421c<T> concat(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5) {
        return concat(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5));
    }

    public static <T> C22421c<T> just(T t, T t2, T t3, T t4, T t5) {
        return from(new Object[]{t, t2, t3, t4, t5});
    }

    public static <T> C22421c<T> mergeDelayError(Iterable<? extends C22421c<? extends T>> iterable, int i) {
        return mergeDelayError(from(iterable), i);
    }

    @Deprecated
    public static C22421c<Long> timer(long j, long j2, TimeUnit timeUnit, f2e0 f2e0Var) {
        return interval(j, j2, timeUnit, f2e0Var);
    }

    public final C22421c<T> onBackpressureBuffer(long j, x20 x20Var, C22419a.d dVar) {
        return (C22421c<T>) lift(new v360(j, x20Var, dVar));
    }

    public final C22421c<T> startWith(T t, T t2, T t3) {
        return concat(just(t, t2, t3), this);
    }

    public final C22421c<List<T>> takeLastBuffer(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return takeLast(j, timeUnit, f2e0Var).toList();
    }

    public final C22421c<List<T>> toSortedList(rcj<? super T, ? super T, Integer> rcjVar) {
        return (C22421c<List<T>>) lift(new e560(rcjVar, 10));
    }

    public static <T> C22421c<T> amb(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6) {
        return create(vn50.m201930f(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6));
    }

    public static <T> C22421c<T> concat(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6) {
        return concat(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3) {
        return concatEager(Arrays.asList(c22421c, c22421c2, c22421c3));
    }

    public static <T> C22421c<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        return from(new Object[]{t, t2, t3, t4, t5, t6});
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2) {
        return mergeDelayError(just(c22421c, c22421c2));
    }

    public static C22421c<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<T> startWith(T t, T t2, T t3, T t4) {
        return concat(just(t, t2, t3, t4), this);
    }

    public final C22421c<List<T>> toSortedList(int i) {
        return (C22421c<List<T>>) lift(new e560(i));
    }

    public static <T> C22421c<T> amb(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7) {
        return create(vn50.m201931g(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7));
    }

    public static <T> C22421c<T> concat(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7) {
        return concat(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4) {
        return concatEager(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4));
    }

    public static C22421c<Long> interval(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return interval(j, j, timeUnit, f2e0Var);
    }

    public static <T> C22421c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7});
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3) {
        return mergeDelayError(just(c22421c, c22421c2, c22421c3));
    }

    public static C22421c<Long> timer(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return create(new qo50(j, timeUnit, f2e0Var));
    }

    public final <U> C22421c<T> delay(qcj<? super T, ? extends C22421c<U>> qcjVar) {
        return (C22421c<T>) lift(new h360(this, qcjVar));
    }

    public final C22421c<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<T> last() {
        return takeLast(1).single();
    }

    public final C22421c<T> lastOrDefault(T t) {
        return takeLast(1).singleOrDefault(t);
    }

    public final C22421c<T> retry(long j) {
        return jo50.m146338i(this, j);
    }

    public final C22421c<T> startWith(T t, T t2, T t3, T t4, T t5) {
        return concat(just(t, t2, t3, t4, t5), this);
    }

    public final <K, V> C22421c<Map<K, V>> toMap(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2) {
        return (C22421c<Map<K, V>>) lift(new b560(qcjVar, qcjVar2));
    }

    public final <K, V> C22421c<Map<K, Collection<V>>> toMultimap(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2) {
        return (C22421c<Map<K, Collection<V>>>) lift(new c560(qcjVar, qcjVar2));
    }

    public final C22421c<List<T>> toSortedList(rcj<? super T, ? super T, Integer> rcjVar, int i) {
        return (C22421c<List<T>>) lift(new e560(rcjVar, i));
    }

    public static <T> C22421c<T> amb(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8) {
        return create(vn50.m201932h(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8));
    }

    public static <T> C22421c<T> concat(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8) {
        return concat(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5) {
        return concatEager(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5));
    }

    public static C22421c<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, Schedulers.computation());
    }

    public static <T> C22421c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8});
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4) {
        return mergeDelayError(just(c22421c, c22421c2, c22421c3, c22421c4));
    }

    public final C22421c<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.computation());
    }

    public final <U> C22421c<T> delaySubscription(pcj<? extends C22421c<U>> pcjVar) {
        return create(new co50(this, pcjVar));
    }

    public final C22421c<T> doOnEach(bb50<? super T> bb50Var) {
        return (C22421c<T>) lift(new m360(bb50Var));
    }

    public final C22421c<T> retry() {
        return jo50.m146337h(this);
    }

    public final C22421c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6) {
        return concat(just(t, t2, t3, t4, t5, t6), this);
    }

    public final <K, V> C22421c<Map<K, V>> toMap(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, pcj<? extends Map<K, V>> pcjVar) {
        return (C22421c<Map<K, V>>) lift(new b560(qcjVar, qcjVar2, pcjVar));
    }

    public final <K, V> C22421c<Map<K, Collection<V>>> toMultimap(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, pcj<? extends Map<K, Collection<V>>> pcjVar) {
        return (C22421c<Map<K, Collection<V>>>) lift(new c560(qcjVar, qcjVar2, pcjVar));
    }

    public static <T> C22421c<T> amb(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8, C22421c<? extends T> c22421c9) {
        return create(vn50.m201933i(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8, c22421c9));
    }

    public static <T> C22421c<T> concat(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8, C22421c<? extends T> c22421c9) {
        return concat(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8, c22421c9));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6) {
        return concatEager(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6));
    }

    public static C22421c<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, Schedulers.computation());
    }

    public static <T> C22421c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9});
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5) {
        return mergeDelayError(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5));
    }

    public final C22421c<T> delay(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new g360(j, timeUnit, f2e0Var));
    }

    public final <U> C22421c<T> delaySubscription(C22421c<U> c22421c) {
        c22421c.getClass();
        return create(new bo50(this, c22421c));
    }

    public final C22421c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return concat(just(t, t2, t3, t4, t5, t6, t7), this);
    }

    public final <K, V> C22421c<Map<K, Collection<V>>> toMultimap(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, pcj<? extends Map<K, Collection<V>>> pcjVar, qcj<? super K, ? extends Collection<V>> qcjVar3) {
        return (C22421c<Map<K, Collection<V>>>) lift(new c560(qcjVar, qcjVar2, pcjVar, qcjVar3));
    }

    public static <T1, T2, T3, R> C22421c<R> combineLatest(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, scj<? super T1, ? super T2, ? super T3, ? extends R> scjVar) {
        return combineLatest(Arrays.asList(c22421c, c22421c2, c22421c3), edj.m120460b(scjVar));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7) {
        return concatEager(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7));
    }

    public static <T> C22421c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9, t10});
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6) {
        return mergeDelayError(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6));
    }

    public final C22421c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return concat(just(t, t2, t3, t4, t5, t6, t7, t8), this);
    }

    public static <T1, T2, T3, T4, R> C22421c<R> combineLatest(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, tcj<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> tcjVar) {
        return combineLatest(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4), edj.m120461c(tcjVar));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8) {
        return concatEager(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8));
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7) {
        return mergeDelayError(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7));
    }

    public final C22421c<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final C22421c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return concat(just(t, t2, t3, t4, t5, t6, t7, t8, t9), this);
    }

    public static <T1, T2, T3, T4, T5, R> C22421c<R> combineLatest(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, ucj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> ucjVar) {
        return combineLatest(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5), edj.m120462d(ucjVar));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8, C22421c<? extends T> c22421c9) {
        return concatEager(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8, c22421c9));
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8) {
        return mergeDelayError(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8));
    }

    public final C22421c<List<T>> buffer(int i, int i2) {
        return (C22421c<List<T>>) lift(new OperatorBufferWithSize(i, i2));
    }

    public final <K, R> C22421c<oqk<K, R>> groupBy(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends R> qcjVar2) {
        return lift(new OperatorGroupBy(qcjVar, qcjVar2));
    }

    public final <U, V> C22421c<T> timeout(pcj<? extends C22421c<U>> pcjVar, qcj<? super T, ? extends C22421c<V>> qcjVar) {
        return timeout(pcjVar, qcjVar, (C22421c) null);
    }

    public final <U, R> C22421c<R> withLatestFrom(C22421c<? extends U> c22421c, rcj<? super T, ? super U, ? extends R> rcjVar) {
        return lift(new k560(c22421c, rcjVar));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C22421c<R> combineLatest(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, vcj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> vcjVar) {
        return combineLatest(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6), edj.m120463e(vcjVar));
    }

    public static <T> C22421c<T> concatEager(Iterable<? extends C22421c<? extends T>> iterable) {
        return from(iterable).concatMapEager(UtilityFunctions.m222733b());
    }

    public static <T> C22421c<T> mergeDelayError(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8, C22421c<? extends T> c22421c9) {
        return mergeDelayError(just(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8, c22421c9));
    }

    public final C22421c<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return buffer(j, j2, timeUnit, Schedulers.computation());
    }

    public final <K> C22421c<oqk<K, T>> groupBy(qcj<? super T, ? extends K> qcjVar) {
        return (C22421c<oqk<K, T>>) lift(new OperatorGroupBy(qcjVar));
    }

    public final <V> C22421c<T> timeout(qcj<? super T, ? extends C22421c<V>> qcjVar) {
        return timeout((pcj) null, qcjVar, (C22421c) null);
    }

    public final <T1, T2, T3, R> C22421c<R> withLatestFrom(C22421c<T1> c22421c, C22421c<T2> c22421c2, C22421c<T3> c22421c3, tcj<? super T, ? super T1, ? super T2, ? super T3, R> tcjVar) {
        return create(new l560(this, new C22421c[]{c22421c, c22421c2, c22421c3}, null, edj.m120461c(tcjVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C22421c<R> combineLatest(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, C22421c<? extends T7> c22421c7, wcj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> wcjVar) {
        return combineLatest(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7), edj.m120464f(wcjVar));
    }

    public static <T> C22421c<T> concatEager(Iterable<? extends C22421c<? extends T>> iterable, int i) {
        return from(iterable).concatMapEager(UtilityFunctions.m222733b(), i);
    }

    public final C22421c<List<T>> buffer(long j, long j2, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<List<T>>) lift(new z260(j, j2, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, f2e0Var));
    }

    public final C22421c<T> observeOn(f2e0 f2e0Var, int i) {
        return observeOn(f2e0Var, false, i);
    }

    public final <V> C22421c<T> timeout(qcj<? super T, ? extends C22421c<V>> qcjVar, C22421c<? extends T> c22421c) {
        return timeout((pcj) null, qcjVar, c22421c);
    }

    public final <T1, T2, T3, T4, R> C22421c<R> withLatestFrom(C22421c<T1> c22421c, C22421c<T2> c22421c2, C22421c<T3> c22421c3, C22421c<T4> c22421c4, ucj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> ucjVar) {
        return create(new l560(this, new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4}, null, edj.m120462d(ucjVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C22421c<R> combineLatest(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, C22421c<? extends T7> c22421c7, C22421c<? extends T8> c22421c8, xcj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> xcjVar) {
        return combineLatest(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8), edj.m120465g(xcjVar));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends C22421c<? extends T>> c22421c) {
        return (C22421c<T>) c22421c.concatMapEager(UtilityFunctions.m222733b());
    }

    public final C22421c<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, Schedulers.computation());
    }

    public final C22421c<T> observeOn(f2e0 f2e0Var, boolean z) {
        return observeOn(f2e0Var, z, urd0.f180601g);
    }

    public final C22421c<T> timeout(long j, TimeUnit timeUnit) {
        return timeout(j, timeUnit, null, Schedulers.computation());
    }

    public final <T1, T2, T3, T4, T5, R> C22421c<R> withLatestFrom(C22421c<T1> c22421c, C22421c<T2> c22421c2, C22421c<T1> c22421c3, C22421c<T2> c22421c4, C22421c<T1> c22421c5, vcj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, R> vcjVar) {
        return create(new l560(this, new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5}, null, edj.m120463e(vcjVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C22421c<R> combineLatest(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, C22421c<? extends T7> c22421c7, C22421c<? extends T8> c22421c8, C22421c<? extends T9> c22421c9, ycj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> ycjVar) {
        return combineLatest(Arrays.asList(c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8, c22421c9), edj.m120466h(ycjVar));
    }

    public static <T> C22421c<T> concatEager(C22421c<? extends C22421c<? extends T>> c22421c, int i) {
        return (C22421c<T>) c22421c.concatMapEager(UtilityFunctions.m222733b(), i);
    }

    public final <TClosing> C22421c<List<T>> buffer(pcj<? extends C22421c<? extends TClosing>> pcjVar) {
        return (C22421c<List<T>>) lift(new x260(pcjVar, 16));
    }

    public final C22421c<T> observeOn(f2e0 f2e0Var) {
        return observeOn(f2e0Var, urd0.f180601g);
    }

    public final <R> C22421c<R> replay(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar) {
        return OperatorReplay.m222666j(InternalObservableUtils.createReplaySupplier(this), qcjVar);
    }

    public final C22421c<T> timeout(long j, TimeUnit timeUnit, C22421c<? extends T> c22421c) {
        return timeout(j, timeUnit, c22421c, Schedulers.computation());
    }

    public final <T1, T2, T3, T4, T5, T6, R> C22421c<R> withLatestFrom(C22421c<T1> c22421c, C22421c<T2> c22421c2, C22421c<T1> c22421c3, C22421c<T2> c22421c4, C22421c<T1> c22421c5, C22421c<T2> c22421c6, wcj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, R> wcjVar) {
        return create(new l560(this, new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6}, null, edj.m120464f(wcjVar)));
    }

    public static <T, R> C22421c<R> combineLatest(List<? extends C22421c<? extends T>> list, zcj<? extends R> zcjVar) {
        return create(new OnSubscribeCombineLatest(list, zcjVar));
    }

    public final C22421c<List<T>> buffer(long j, TimeUnit timeUnit, int i, f2e0 f2e0Var) {
        return (C22421c<List<T>>) lift(new z260(j, j, timeUnit, i, f2e0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22421c<R> flatMap(qcj<? super T, ? extends C22421c<? extends R>> qcjVar, int i) {
        if (getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) this).m222725d(qcjVar);
        }
        return merge(map(qcjVar), i);
    }

    public final <R> C22421c<R> replay(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, int i) {
        return OperatorReplay.m222666j(InternalObservableUtils.createReplaySupplier(this, i), qcjVar);
    }

    public final C22421c<T> timeout(long j, TimeUnit timeUnit, C22421c<? extends T> c22421c, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new x460(j, timeUnit, c22421c, f2e0Var));
    }

    public final <T1, T2, T3, T4, T5, T6, T7, R> C22421c<R> withLatestFrom(C22421c<T1> c22421c, C22421c<T2> c22421c2, C22421c<T1> c22421c3, C22421c<T2> c22421c4, C22421c<T1> c22421c5, C22421c<T2> c22421c6, C22421c<T1> c22421c7, xcj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, R> xcjVar) {
        return create(new l560(this, new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7}, null, edj.m120465g(xcjVar)));
    }

    public static <T, R> C22421c<R> combineLatest(Iterable<? extends C22421c<? extends T>> iterable, zcj<? extends R> zcjVar) {
        return create(new OnSubscribeCombineLatest(iterable, zcjVar));
    }

    public final C22421c<List<T>> buffer(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return buffer(j, j, timeUnit, f2e0Var);
    }

    public final <R> C22421c<R> replay(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, int i, long j, TimeUnit timeUnit) {
        return replay(qcjVar, i, j, timeUnit, Schedulers.computation());
    }

    public final C22421c<T> timeout(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return timeout(j, timeUnit, null, f2e0Var);
    }

    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> C22421c<R> withLatestFrom(C22421c<T1> c22421c, C22421c<T2> c22421c2, C22421c<T1> c22421c3, C22421c<T2> c22421c4, C22421c<T1> c22421c5, C22421c<T2> c22421c6, C22421c<T1> c22421c7, C22421c<T2> c22421c8, ycj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, R> ycjVar) {
        return create(new l560(this, new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8}, null, edj.m120466h(ycjVar)));
    }

    public final <TOpening, TClosing> C22421c<List<T>> buffer(C22421c<? extends TOpening> c22421c, qcj<? super TOpening, ? extends C22421c<? extends TClosing>> qcjVar) {
        return (C22421c<List<T>>) lift(new y260(c22421c, qcjVar));
    }

    public final ax5<T> replay() {
        return OperatorReplay.m222661e(this);
    }

    public final <R> C22421c<R> withLatestFrom(C22421c<?>[] c22421cArr, zcj<R> zcjVar) {
        return create(new l560(this, c22421cArr, null, zcjVar));
    }

    public final <B> C22421c<List<T>> buffer(C22421c<B> c22421c) {
        return buffer(c22421c, 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22421c<R> flatMap(qcj<? super T, ? extends C22421c<? extends R>> qcjVar, qcj<? super Throwable, ? extends C22421c<? extends R>> qcjVar2, pcj<? extends C22421c<? extends R>> pcjVar) {
        return merge(mapNotification(qcjVar, qcjVar2, pcjVar));
    }

    public final <R> C22421c<R> replay(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, int i, f2e0 f2e0Var) {
        return OperatorReplay.m222666j(InternalObservableUtils.createReplaySupplier(this, i), InternalObservableUtils.createReplaySelectorAndObserveOn(qcjVar, f2e0Var));
    }

    public final <R> C22421c<R> withLatestFrom(Iterable<C22421c<?>> iterable, zcj<R> zcjVar) {
        return create(new l560(this, null, iterable, zcjVar));
    }

    public final <B> C22421c<List<T>> buffer(C22421c<B> c22421c, int i) {
        return (C22421c<List<T>>) lift(new x260(c22421c, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22421c<R> flatMap(qcj<? super T, ? extends C22421c<? extends R>> qcjVar, qcj<? super Throwable, ? extends C22421c<? extends R>> qcjVar2, pcj<? extends C22421c<? extends R>> pcjVar, int i) {
        return merge(mapNotification(qcjVar, qcjVar2, pcjVar), i);
    }

    public final <R> C22421c<R> replay(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, long j, TimeUnit timeUnit) {
        return replay(qcjVar, j, timeUnit, Schedulers.computation());
    }

    public final C22421c<C22421c<T>> window(int i) {
        return window(i, i);
    }

    public static <T> C22421c<T> from(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return create(so50.m187157b(future, j, timeUnit));
    }

    public static <T> C22421c<T> merge(Iterable<? extends C22421c<? extends T>> iterable, int i) {
        return merge(from(iterable), i);
    }

    public final <R> C22421c<R> concatMapEager(qcj<? super T, ? extends C22421c<? extends R>> qcjVar, int i) {
        if (i >= 1) {
            return lift(new OperatorEagerConcatMap(qcjVar, i, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
        za50.m219101a("capacityHint > 0 required but it was ", i);
        return null;
    }

    public final <U, R> C22421c<R> flatMap(qcj<? super T, ? extends C22421c<? extends U>> qcjVar, rcj<? super T, ? super U, ? extends R> rcjVar) {
        return merge(lift(new s360(qcjVar, rcjVar)));
    }

    public final <R> C22421c<R> replay(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return OperatorReplay.m222666j(InternalObservableUtils.createReplaySupplier(this, j, timeUnit, f2e0Var), qcjVar);
    }

    public final <TClosing> C22421c<C22421c<T>> window(pcj<? extends C22421c<? extends TClosing>> pcjVar) {
        return (C22421c<C22421c<T>>) lift(new h560(pcjVar));
    }

    public static <T> C22421c<T> from(Future<? extends T> future, f2e0 f2e0Var) {
        return create(so50.m187156a(future)).subscribeOn(f2e0Var);
    }

    public static <T> C22421c<T> merge(Iterable<? extends C22421c<? extends T>> iterable) {
        return merge(from(iterable));
    }

    public final <U, R> C22421c<R> flatMap(qcj<? super T, ? extends C22421c<? extends U>> qcjVar, rcj<? super T, ? super U, ? extends R> rcjVar, int i) {
        return merge(lift(new s360(qcjVar, rcjVar)), i);
    }

    public final <R> C22421c<R> replay(qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, f2e0 f2e0Var) {
        return OperatorReplay.m222666j(InternalObservableUtils.createReplaySupplier(this), InternalObservableUtils.createReplaySelectorAndObserveOn(qcjVar, f2e0Var));
    }

    public final C22421c<T> takeLast(int i, long j, TimeUnit timeUnit) {
        return takeLast(i, j, timeUnit, Schedulers.computation());
    }

    public final C22421c<C22421c<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, Schedulers.computation());
    }

    public static <T> C22421c<T> merge(C22421c<? extends C22421c<? extends T>> c22421c, int i) {
        if (c22421c.getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) c22421c).m222725d(UtilityFunctions.m222733b());
        }
        return (C22421c<T>) c22421c.lift(OperatorMerge.m222628c(false, i));
    }

    public final <R> C22421c<R> concatMapEager(qcj<? super T, ? extends C22421c<? extends R>> qcjVar) {
        return concatMapEager(qcjVar, urd0.f180601g);
    }

    public final ax5<T> replay(int i) {
        return OperatorReplay.m222662f(this, i);
    }

    public final C22421c<T> takeLast(int i, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new q460(i, j, timeUnit, f2e0Var));
    }

    public final C22421c<C22421c<T>> window(long j, long j2, TimeUnit timeUnit, f2e0 f2e0Var) {
        return window(j, j2, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, f2e0Var);
    }

    public static <T> C22421c<T> from(Iterable<? extends T> iterable) {
        return create(new OnSubscribeFromIterable(iterable));
    }

    public final ax5<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, Schedulers.computation());
    }

    public final C22421c<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<C22421c<T>> window(long j, long j2, TimeUnit timeUnit, int i, f2e0 f2e0Var) {
        return (C22421c<C22421c<T>>) lift(new j560(j, j2, timeUnit, i, f2e0Var));
    }

    public static <T> C22421c<T> from(Future<? extends T> future) {
        return create(so50.m187156a(future));
    }

    public final ax5<T> replay(int i, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        if (i >= 0) {
            return OperatorReplay.m222664h(this, j, timeUnit, f2e0Var, i);
        }
        wg3.m206174a("bufferSize < 0");
        return null;
    }

    public final C22421c<T> takeLast(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return (C22421c<T>) lift(new q460(j, timeUnit, f2e0Var));
    }

    public final C22421c<C22421c<T>> window(long j, TimeUnit timeUnit) {
        return window(j, j, timeUnit, Schedulers.computation());
    }

    public static <T> C22421c<T> merge(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2) {
        return merge(new C22421c[]{c22421c, c22421c2});
    }

    public final C22421c<C22421c<T>> window(long j, TimeUnit timeUnit, int i) {
        return window(j, timeUnit, i, Schedulers.computation());
    }

    public static <T> C22421c<T> merge(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3) {
        return merge(new C22421c[]{c22421c, c22421c2, c22421c3});
    }

    public final ax5<T> replay(int i, f2e0 f2e0Var) {
        return OperatorReplay.m222667k(replay(i), f2e0Var);
    }

    public final C22421c<C22421c<T>> window(long j, TimeUnit timeUnit, int i, f2e0 f2e0Var) {
        return window(j, j, timeUnit, i, f2e0Var);
    }

    public static <T> C22421c<T> merge(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4) {
        return merge(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4});
    }

    public final ax5<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, Schedulers.computation());
    }

    public final C22421c<C22421c<T>> window(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return window(j, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, f2e0Var);
    }

    public static <T> C22421c<T> merge(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5) {
        return merge(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5});
    }

    public final ax5<T> replay(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return OperatorReplay.m222663g(this, j, timeUnit, f2e0Var);
    }

    public final <TOpening, TClosing> C22421c<C22421c<T>> window(C22421c<? extends TOpening> c22421c, qcj<? super TOpening, ? extends C22421c<? extends TClosing>> qcjVar) {
        return (C22421c<C22421c<T>>) lift(new i560(c22421c, qcjVar));
    }

    public static <T> C22421c<T> merge(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6) {
        return merge(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6});
    }

    public final ax5<T> replay(f2e0 f2e0Var) {
        return OperatorReplay.m222667k(replay(), f2e0Var);
    }

    public final <U> C22421c<C22421c<T>> window(C22421c<U> c22421c) {
        return (C22421c<C22421c<T>>) lift(new g560(c22421c));
    }

    public static <T> C22421c<T> merge(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7) {
        return merge(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7});
    }

    public static <T> C22421c<T> merge(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8) {
        return merge(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8});
    }

    public static <T> C22421c<T> merge(C22421c<? extends T> c22421c, C22421c<? extends T> c22421c2, C22421c<? extends T> c22421c3, C22421c<? extends T> c22421c4, C22421c<? extends T> c22421c5, C22421c<? extends T> c22421c6, C22421c<? extends T> c22421c7, C22421c<? extends T> c22421c8, C22421c<? extends T> c22421c9) {
        return merge(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8, c22421c9});
    }

    public static <T> C22421c<T> merge(C22421c<? extends T>[] c22421cArr) {
        return merge(from(c22421cArr));
    }

    public static <T> C22421c<T> merge(C22421c<? extends T>[] c22421cArr, int i) {
        return merge(from(c22421cArr), i);
    }

    public static <R> C22421c<R> zip(C22421c<?>[] c22421cArr, zcj<? extends R> zcjVar) {
        return just(c22421cArr).lift(new OperatorZip(zcjVar));
    }

    public static <R> C22421c<R> zip(C22421c<? extends C22421c<?>> c22421c, zcj<? extends R> zcjVar) {
        return c22421c.toList().map(InternalObservableUtils.TO_ARRAY).lift(new OperatorZip(zcjVar));
    }

    public static C22421c<Integer> range(int i, int i2, f2e0 f2e0Var) {
        return range(i, i2).subscribeOn(f2e0Var);
    }

    public static <T1, T2, R> C22421c<R> zip(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, rcj<? super T1, ? super T2, ? extends R> rcjVar) {
        return just(new C22421c[]{c22421c, c22421c2}).lift(new OperatorZip(rcjVar));
    }

    public static <T1, T2, T3, R> C22421c<R> zip(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, scj<? super T1, ? super T2, ? super T3, ? extends R> scjVar) {
        return just(new C22421c[]{c22421c, c22421c2, c22421c3}).lift(new OperatorZip(scjVar));
    }

    public static <T1, T2, T3, T4, R> C22421c<R> zip(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, tcj<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> tcjVar) {
        return just(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4}).lift(new OperatorZip(tcjVar));
    }

    public static <T1, T2, T3, T4, T5, R> C22421c<R> zip(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, ucj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> ucjVar) {
        return just(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5}).lift(new OperatorZip(ucjVar));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C22421c<R> zip(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, vcj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> vcjVar) {
        return just(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6}).lift(new OperatorZip(vcjVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C22421c<R> zip(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, C22421c<? extends T7> c22421c7, wcj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> wcjVar) {
        return just(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7}).lift(new OperatorZip(wcjVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C22421c<R> zip(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, C22421c<? extends T7> c22421c7, C22421c<? extends T8> c22421c8, xcj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> xcjVar) {
        return just(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8}).lift(new OperatorZip(xcjVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C22421c<R> zip(C22421c<? extends T1> c22421c, C22421c<? extends T2> c22421c2, C22421c<? extends T3> c22421c3, C22421c<? extends T4> c22421c4, C22421c<? extends T5> c22421c5, C22421c<? extends T6> c22421c6, C22421c<? extends T7> c22421c7, C22421c<? extends T8> c22421c8, C22421c<? extends T9> c22421c9, ycj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> ycjVar) {
        return just(new C22421c[]{c22421c, c22421c2, c22421c3, c22421c4, c22421c5, c22421c6, c22421c7, c22421c8, c22421c9}).lift(new OperatorZip(ycjVar));
    }

    public final kcg0 subscribe(y20<? super T> y20Var) {
        if (y20Var != null) {
            return subscribe((gcg0) new y30(y20Var, InternalObservableUtils.ERROR_NOT_IMPLEMENTED, c40.m107815a()));
        }
        wg3.m206174a("onNext can not be null");
        return null;
    }

    public final kcg0 subscribe(y20<? super T> y20Var, y20<Throwable> y20Var2) {
        if (y20Var == null) {
            wg3.m206174a("onNext can not be null");
            return null;
        }
        if (y20Var2 != null) {
            return subscribe((gcg0) new y30(y20Var, y20Var2, c40.m107815a()));
        }
        wg3.m206174a("onError can not be null");
        return null;
    }

    public final kcg0 subscribe(y20<? super T> y20Var, y20<Throwable> y20Var2, x20 x20Var) {
        if (y20Var == null) {
            wg3.m206174a("onNext can not be null");
            return null;
        }
        if (y20Var2 == null) {
            wg3.m206174a("onError can not be null");
            return null;
        }
        if (x20Var != null) {
            return subscribe((gcg0) new y30(y20Var, y20Var2, x20Var));
        }
        wg3.m206174a("onComplete can not be null");
        return null;
    }

    public final kcg0 subscribe(bb50<? super T> bb50Var) {
        if (bb50Var instanceof gcg0) {
            return subscribe((gcg0) bb50Var);
        }
        if (bb50Var != null) {
            return subscribe((gcg0) new db50(bb50Var));
        }
        mnd0.m159157a("observer is null");
        return null;
    }

    public final kcg0 subscribe(gcg0<? super T> gcg0Var) {
        return subscribe(gcg0Var, this);
    }

    public final kcg0 subscribe() {
        return subscribe((gcg0) new y30(c40.m107815a(), InternalObservableUtils.ERROR_NOT_IMPLEMENTED, c40.m107815a()));
    }
}
