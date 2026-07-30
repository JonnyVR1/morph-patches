package p133rx;

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
import p133rx.exceptions.OnErrorFailedException;
import p133rx.internal.operators.C22351a;
import p133rx.internal.operators.CachedObservable;
import p133rx.internal.operators.EmptyObservableHolder;
import p133rx.internal.operators.NeverObservableHolder;
import p133rx.internal.operators.OnSubscribeCombineLatest;
import p133rx.internal.operators.OnSubscribeDetach;
import p133rx.internal.operators.OnSubscribeFromArray;
import p133rx.internal.operators.OnSubscribeFromAsync;
import p133rx.internal.operators.OnSubscribeFromIterable;
import p133rx.internal.operators.OnSubscribeRange;
import p133rx.internal.operators.OnSubscribeUsing;
import p133rx.internal.operators.OperatorBufferWithSize;
import p133rx.internal.operators.OperatorEagerConcatMap;
import p133rx.internal.operators.OperatorElementAt;
import p133rx.internal.operators.OperatorGroupBy;
import p133rx.internal.operators.OperatorMerge;
import p133rx.internal.operators.OperatorOnBackpressureLatest;
import p133rx.internal.operators.OperatorPublish;
import p133rx.internal.operators.OperatorReplay;
import p133rx.internal.operators.OperatorWindowWithSize;
import p133rx.internal.operators.OperatorZip;
import p133rx.internal.util.InternalObservableUtils;
import p133rx.internal.util.ScalarSynchronousObservable;
import p133rx.internal.util.UtilityFunctions;
import p133rx.observables.SyncOnSubscribe;
import p133rx.schedulers.Schedulers;
import p149l.aaj;
import p149l.ag50;
import p149l.av50;
import p149l.aw50;
import p149l.ax50;
import p149l.baj;
import p149l.bg50;
import p149l.bud0;
import p149l.bv50;
import p149l.bw50;
import p149l.bx50;
import p149l.c4g0;
import p149l.caj;
import p149l.cg50;
import p149l.cv50;
import p149l.cw50;
import p149l.cx50;
import p149l.d30;
import p149l.daj;
import p149l.dg50;
import p149l.dv50;
import p149l.dw50;
import p149l.dx50;
import p149l.e30;
import p149l.e40;
import p149l.eaj;
import p149l.eg50;
import p149l.ejd0;
import p149l.ev50;
import p149l.ew50;
import p149l.ex50;
import p149l.f30;
import p149l.f5f;
import p149l.faj;
import p149l.fg50;
import p149l.fv50;
import p149l.fw50;
import p149l.fx50;
import p149l.gv50;
import p149l.gw50;
import p149l.gx50;
import p149l.h4g0;
import p149l.hg50;
import p149l.hri0;
import p149l.hv50;
import p149l.hw50;
import p149l.i40;
import p149l.ig3;
import p149l.ig50;
import p149l.iv50;
import p149l.iw50;
import p149l.jfd0;
import p149l.jg50;
import p149l.jv50;
import p149l.jw50;
import p149l.k250;
import p149l.kaj;
import p149l.kg50;
import p149l.kv50;
import p149l.kw50;
import p149l.l21;
import p149l.lg50;
import p149l.lod0;
import p149l.lv50;
import p149l.lw50;
import p149l.m250;
import p149l.mg50;
import p149l.mv50;
import p149l.mw50;
import p149l.nqi0;
import p149l.nv50;
import p149l.nw50;
import p149l.o250;
import p149l.ou50;
import p149l.ov50;
import p149l.ow50;
import p149l.pf50;
import p149l.pu50;
import p149l.pv50;
import p149l.pw50;
import p149l.qkq0;
import p149l.qu50;
import p149l.qv50;
import p149l.qw50;
import p149l.rf50;
import p149l.rjd0;
import p149l.ru50;
import p149l.rv50;
import p149l.rw50;
import p149l.sf50;
import p149l.su50;
import p149l.sv50;
import p149l.tf50;
import p149l.tu50;
import p149l.tv50;
import p149l.tw50;
import p149l.uf50;
import p149l.uu50;
import p149l.uv50;
import p149l.uw50;
import p149l.v30;
import p149l.v9j;
import p149l.vf50;
import p149l.vv5;
import p149l.vv50;
import p149l.vw50;
import p149l.w9j;
import p149l.wf50;
import p149l.wv50;
import p149l.ww50;
import p149l.x9j;
import p149l.xf50;
import p149l.xv50;
import p149l.xw50;
import p149l.y33;
import p149l.y9j;
import p149l.yf50;
import p149l.ynk;
import p149l.yu50;
import p149l.yv50;
import p149l.yw50;
import p149l.z3g0;
import p149l.z9j;
import p149l.zf50;
import p149l.zu50;
import p149l.zv50;
import p149l.zw50;

/* JADX INFO: renamed from: rx.c */
/* JADX INFO: loaded from: classes3.dex */
public class C22306c<T> {
    final a<T> onSubscribe;

    /* JADX INFO: renamed from: rx.c$a */
    public interface a<T> extends e30<z3g0<? super T>> {
    }

    /* JADX INFO: renamed from: rx.c$b */
    public static final class b<T> implements a<T> {

        /* JADX INFO: renamed from: a */
        public final C22306c<T> f207113a;

        public b(C22306c<T> c22306c) {
            this.f207113a = c22306c;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            z3g0Var.m217046b(C22306c.subscribe(z3g0Var, this.f207113a));
        }
    }

    /* JADX INFO: renamed from: rx.c$c */
    public interface c<R, T> extends w9j<z3g0<? super R>, z3g0<? super T>> {
    }

    /* JADX INFO: renamed from: rx.c$d */
    public interface d<T, R> extends w9j<C22306c<T>, C22306c<R>> {
    }

    public C22306c(a<T> aVar) {
        this.onSubscribe = aVar;
    }

    public static <T> C22306c<T> amb(Iterable<? extends C22306c<? extends T>> iterable) {
        return create(pf50.m168585a(iterable));
    }

    public static <T1, T2, R> C22306c<R> combineLatest(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, x9j<? super T1, ? super T2, ? extends R> x9jVar) {
        return combineLatest(Arrays.asList(c22306c, c22306c2), kaj.m145144a(x9jVar));
    }

    public static <T, R> C22306c<R> combineLatestDelayError(Iterable<? extends C22306c<? extends T>> iterable, faj<? extends R> fajVar) {
        return create(new OnSubscribeCombineLatest(null, iterable, fajVar, rjd0.f159670g, true));
    }

    public static <T> C22306c<T> concat(C22306c<? extends C22306c<? extends T>> c22306c) {
        return (C22306c<T>) c22306c.concatMap(UtilityFunctions.m221487b());
    }

    public static <T> C22306c<T> concatDelayError(C22306c<? extends C22306c<? extends T>> c22306c) {
        return (C22306c<T>) c22306c.concatMapDelayError(UtilityFunctions.m221487b());
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2) {
        return concatEager(Arrays.asList(c22306c, c22306c2));
    }

    public static <T> C22306c<T> create(a<T> aVar) {
        return new C22306c<>(ejd0.m116791h(aVar));
    }

    public static <T> C22306c<T> defer(v9j<C22306c<T>> v9jVar) {
        return create(new tf50(v9jVar));
    }

    public static <T> C22306c<T> empty() {
        return EmptyObservableHolder.instance();
    }

    public static <T> C22306c<T> error(Throwable th) {
        return create(new jg50(th));
    }

    public static <T> C22306c<T> from(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return empty();
        }
        return length == 1 ? just(tArr[0]) : create(new OnSubscribeFromArray(tArr));
    }

    public static <T> C22306c<T> fromAsync(e30<AsyncEmitter<T>> e30Var, AsyncEmitter.BackpressureMode backpressureMode) {
        return create(new OnSubscribeFromAsync(e30Var, backpressureMode));
    }

    public static <T> C22306c<T> fromCallable(Callable<? extends T> callable) {
        return create(new yf50(callable));
    }

    public static C22306c<Long> interval(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        return create(new lg50(j, j2, timeUnit, bud0Var));
    }

    public static <T> C22306c<T> just(T t, T t2) {
        return from(new Object[]{t, t2});
    }

    private <R> C22306c<R> mapNotification(w9j<? super T, ? extends R> w9jVar, w9j<? super Throwable, ? extends R> w9jVar2, v9j<? extends R> v9jVar) {
        return lift(new lv50(w9jVar, w9jVar2, v9jVar));
    }

    public static <T> C22306c<T> merge(C22306c<? extends C22306c<? extends T>> c22306c) {
        return c22306c.getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) c22306c).m221479d(UtilityFunctions.m221487b()) : (C22306c<T>) c22306c.lift(OperatorMerge.m221381b(false));
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends C22306c<? extends T>> c22306c) {
        return (C22306c<T>) c22306c.lift(OperatorMerge.m221381b(true));
    }

    public static <T> C22306c<T> never() {
        return NeverObservableHolder.instance();
    }

    public static C22306c<Integer> range(int i, int i2) {
        if (i2 < 0) {
            ig3.m135964a("Count can not be negative");
            return null;
        }
        if (i2 == 0) {
            return empty();
        }
        if (i <= Integer.MIN_VALUE - i2) {
            return i2 == 1 ? just(Integer.valueOf(i)) : create(new OnSubscribeRange(i, (i2 - 1) + i));
        }
        ig3.m135964a("start + count can not exceed Integer.MAX_VALUE");
        return null;
    }

    public static <T> C22306c<Boolean> sequenceEqual(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2) {
        return sequenceEqual(c22306c, c22306c2, InternalObservableUtils.OBJECT_EQUALS);
    }

    public static <T> c4g0 subscribe(z3g0<? super T> z3g0Var, C22306c<T> c22306c) {
        if (z3g0Var == null) {
            ig3.m135964a("subscriber can not be null");
            return null;
        }
        if (c22306c.onSubscribe == null) {
            qkq0.m175383a("onSubscribe function can not be null.");
            return null;
        }
        z3g0Var.mo99382d();
        if (!(z3g0Var instanceof lod0)) {
            z3g0Var = new lod0(z3g0Var);
        }
        try {
            ejd0.m116799p(c22306c, c22306c.onSubscribe).call(z3g0Var);
            return ejd0.m116798o(z3g0Var);
        } catch (Throwable th) {
            f5f.m119491e(th);
            if (z3g0Var.isUnsubscribed()) {
                ejd0.m116793j(ejd0.m116796m(th));
            } else {
                try {
                    z3g0Var.onError(ejd0.m116796m(th));
                } catch (Throwable th2) {
                    f5f.m119491e(th2);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    ejd0.m116796m(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return h4g0.m129243d();
        }
    }

    public static <T> C22306c<T> switchOnNext(C22306c<? extends C22306c<? extends T>> c22306c) {
        return (C22306c<T>) c22306c.lift(gw50.m128375b(false));
    }

    public static <T> C22306c<T> switchOnNextDelayError(C22306c<? extends C22306c<? extends T>> c22306c) {
        return (C22306c<T>) c22306c.lift(gw50.m128375b(true));
    }

    @Deprecated
    public static C22306c<Long> timer(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, Schedulers.computation());
    }

    public static <T, Resource> C22306c<T> using(v9j<Resource> v9jVar, w9j<? super Resource, ? extends C22306c<? extends T>> w9jVar, e30<? super Resource> e30Var, boolean z) {
        return create(new OnSubscribeUsing(v9jVar, w9jVar, e30Var, z));
    }

    public static <R> C22306c<R> zip(Iterable<? extends C22306c<?>> iterable, faj<? extends R> fajVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends C22306c<?>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return just(arrayList.toArray(new C22306c[arrayList.size()])).lift(new OperatorZip(fajVar));
    }

    public final C22306c<Boolean> all(w9j<? super T, Boolean> w9jVar) {
        return lift(new ou50(w9jVar));
    }

    public final C22306c<T> ambWith(C22306c<? extends T> c22306c) {
        return amb(this, c22306c);
    }

    public final C22306c<T> asObservable() {
        return (C22306c<T>) lift(qu50.m176540b());
    }

    public final C22306c<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return (C22306c<List<T>>) lift(new tu50(j, j, timeUnit, i, Schedulers.computation()));
    }

    public final C22306c<T> cache() {
        return CachedObservable.m221329a(this);
    }

    public final C22306c<T> cacheWithInitialCapacity(int i) {
        return CachedObservable.m221330b(this, i);
    }

    public final <R> C22306c<R> cast(Class<R> cls) {
        return lift(new uu50(cls));
    }

    public final <R> C22306c<R> collect(v9j<R> v9jVar, f30<R, ? super T> f30Var) {
        return create(new rf50(this, v9jVar, f30Var));
    }

    public <R> C22306c<R> compose(d<? super T, ? extends R> dVar) {
        return (C22306c) dVar.call(this);
    }

    public final <R> C22306c<R> concatMap(w9j<? super T, ? extends C22306c<? extends R>> w9jVar) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m221479d(w9jVar) : create(new sf50(this, w9jVar, 2, 0));
    }

    public final <R> C22306c<R> concatMapDelayError(w9j<? super T, ? extends C22306c<? extends R>> w9jVar) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m221479d(w9jVar) : create(new sf50(this, w9jVar, 2, 2));
    }

    public final <R> C22306c<R> concatMapEager(w9j<? super T, ? extends C22306c<? extends R>> w9jVar, int i, int i2) {
        if (i < 1) {
            k250.m144273a("capacityHint > 0 required but it was ", i);
            return null;
        }
        if (i2 >= 1) {
            return lift(new OperatorEagerConcatMap(w9jVar, i, i2));
        }
        k250.m144273a("maxConcurrent > 0 required but it was ", i);
        return null;
    }

    public final <R> C22306c<R> concatMapIterable(w9j<? super T, ? extends Iterable<? extends R>> w9jVar) {
        return C22351a.m221449b(this, w9jVar, rjd0.f159670g);
    }

    public final C22306c<T> concatWith(C22306c<? extends T> c22306c) {
        return concat(this, c22306c);
    }

    public final C22306c<Boolean> contains(Object obj) {
        return exists(InternalObservableUtils.equalsWith(obj));
    }

    public final C22306c<Integer> count() {
        return reduce(0, InternalObservableUtils.COUNTER);
    }

    public final C22306c<Long> countLong() {
        return reduce(0L, InternalObservableUtils.LONG_COUNTER);
    }

    public final <U> C22306c<T> debounce(w9j<? super T, ? extends C22306c<U>> w9jVar) {
        return (C22306c<T>) lift(new yu50(w9jVar));
    }

    public final C22306c<T> defaultIfEmpty(T t) {
        return switchIfEmpty(just(t));
    }

    public final <U, V> C22306c<T> delay(v9j<? extends C22306c<U>> v9jVar, w9j<? super T, ? extends C22306c<V>> w9jVar) {
        return (C22306c<T>) delaySubscription(v9jVar).lift(new bv50(this, w9jVar));
    }

    public final C22306c<T> delaySubscription(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return create(new uf50(this, j, timeUnit, bud0Var));
    }

    public final <T2> C22306c<T2> dematerialize() {
        return (C22306c<T2>) lift(cv50.m108847b());
    }

    public final <U> C22306c<T> distinct(w9j<? super T, ? extends U> w9jVar) {
        return (C22306c<T>) lift(new dv50(w9jVar));
    }

    public final <U> C22306c<T> distinctUntilChanged(w9j<? super T, ? extends U> w9jVar) {
        return (C22306c<T>) lift(new ev50(w9jVar));
    }

    public final C22306c<T> doAfterTerminate(d30 d30Var) {
        return (C22306c<T>) lift(new fv50(d30Var));
    }

    public final C22306c<T> doOnCompleted(d30 d30Var) {
        return (C22306c<T>) lift(new gv50(new e40(i40.m134309a(), i40.m134309a(), d30Var)));
    }

    public final C22306c<T> doOnEach(e30<Notification<? super T>> e30Var) {
        return (C22306c<T>) lift(new gv50(new v30(e30Var)));
    }

    public final C22306c<T> doOnError(e30<Throwable> e30Var) {
        return (C22306c<T>) lift(new gv50(new e40(i40.m134309a(), e30Var, i40.m134309a())));
    }

    public final C22306c<T> doOnNext(e30<? super T> e30Var) {
        return (C22306c<T>) lift(new gv50(new e40(e30Var, i40.m134309a(), i40.m134309a())));
    }

    public final C22306c<T> doOnRequest(e30<Long> e30Var) {
        return (C22306c<T>) lift(new hv50(e30Var));
    }

    public final C22306c<T> doOnSubscribe(d30 d30Var) {
        return (C22306c<T>) lift(new iv50(d30Var));
    }

    public final C22306c<T> doOnTerminate(d30 d30Var) {
        return (C22306c<T>) lift(new gv50(new e40(i40.m134309a(), i40.m134310b(d30Var), d30Var)));
    }

    public final C22306c<T> doOnUnsubscribe(d30 d30Var) {
        return (C22306c<T>) lift(new jv50(d30Var));
    }

    public final C22306c<T> elementAt(int i) {
        return (C22306c<T>) lift(new OperatorElementAt(i));
    }

    public final C22306c<T> elementAtOrDefault(int i, T t) {
        return (C22306c<T>) lift(new OperatorElementAt(i, t));
    }

    public final C22306c<Boolean> exists(w9j<? super T, Boolean> w9jVar) {
        return lift(new pu50(w9jVar, false));
    }

    public <R> R extend(w9j<? super a<T>, ? extends R> w9jVar) {
        return w9jVar.call(new b(this));
    }

    public final C22306c<T> filter(w9j<? super T, Boolean> w9jVar) {
        return create(new xf50(this, w9jVar));
    }

    @Deprecated
    public final C22306c<T> finallyDo(d30 d30Var) {
        return (C22306c<T>) lift(new fv50(d30Var));
    }

    public final C22306c<T> first() {
        return take(1).single();
    }

    public final C22306c<T> firstOrDefault(T t) {
        return take(1).singleOrDefault(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22306c<R> flatMap(w9j<? super T, ? extends C22306c<? extends R>> w9jVar) {
        return getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) this).m221479d(w9jVar) : merge(map(w9jVar));
    }

    public final <U, R> C22306c<R> flatMapIterable(w9j<? super T, ? extends Iterable<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar) {
        return flatMap(mv50.m156475b(w9jVar), x9jVar);
    }

    public final void forEach(e30<? super T> e30Var) {
        subscribe(e30Var);
    }

    public final <K, R> C22306c<ynk<K, R>> groupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends R> w9jVar2, w9j<e30<K>, Map<K, Object>> w9jVar3) {
        if (w9jVar3 != null) {
            return lift(new OperatorGroupBy(w9jVar, w9jVar2, w9jVar3));
        }
        jfd0.m141176a("evictingMapFactory cannot be null");
        return null;
    }

    public final <T2, D1, D2, R> C22306c<R> groupJoin(C22306c<T2> c22306c, w9j<? super T, ? extends C22306c<D1>> w9jVar, w9j<? super T2, ? extends C22306c<D2>> w9jVar2, x9j<? super T, ? super C22306c<T2>, ? extends R> x9jVar) {
        return create(new zf50(this, c22306c, w9jVar, w9jVar2, x9jVar));
    }

    public final C22306c<T> ignoreElements() {
        return (C22306c<T>) lift(kv50.m147348b());
    }

    public final C22306c<Boolean> isEmpty() {
        return lift(InternalObservableUtils.IS_EMPTY);
    }

    public final <TRight, TLeftDuration, TRightDuration, R> C22306c<R> join(C22306c<TRight> c22306c, w9j<T, C22306c<TLeftDuration>> w9jVar, w9j<TRight, C22306c<TRightDuration>> w9jVar2, x9j<T, TRight, R> x9jVar) {
        return create(new ag50(this, c22306c, w9jVar, w9jVar2, x9jVar));
    }

    public final C22306c<T> last(w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).takeLast(1).single();
    }

    public final C22306c<T> lastOrDefault(T t, w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).takeLast(1).singleOrDefault(t);
    }

    public final <R> C22306c<R> lift(c<? extends R, ? super T> cVar) {
        return create(new bg50(this.onSubscribe, cVar));
    }

    public final C22306c<T> limit(int i) {
        return take(i);
    }

    public final <R> C22306c<R> map(w9j<? super T, ? extends R> w9jVar) {
        return create(new cg50(this, w9jVar));
    }

    public final C22306c<Notification<T>> materialize() {
        return (C22306c<Notification<T>>) lift(nv50.m161569b());
    }

    public final C22306c<T> mergeWith(C22306c<? extends T> c22306c) {
        return merge(this, c22306c);
    }

    public final C22306c<C22306c<T>> nest() {
        return just(this);
    }

    public final C22306c<T> observeOn(bud0 bud0Var, boolean z, int i) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m221480e(bud0Var) : (C22306c<T>) lift(new ov50(bud0Var, z, i));
    }

    public final <R> C22306c<R> ofType(Class<R> cls) {
        return filter(InternalObservableUtils.isInstanceOf(cls)).cast(cls);
    }

    public final C22306c<T> onBackpressureBuffer(long j) {
        return (C22306c<T>) lift(new pv50(j));
    }

    public final C22306c<T> onBackpressureDrop(e30<? super T> e30Var) {
        return (C22306c<T>) lift(new qv50(e30Var));
    }

    public final C22306c<T> onBackpressureLatest() {
        return (C22306c<T>) lift(OperatorOnBackpressureLatest.m221402b());
    }

    public final C22306c<T> onErrorResumeNext(w9j<Throwable, ? extends C22306c<? extends T>> w9jVar) {
        return (C22306c<T>) lift(new rv50(w9jVar));
    }

    public final C22306c<T> onErrorReturn(w9j<Throwable, ? extends T> w9jVar) {
        return (C22306c<T>) lift(rv50.m181234d(w9jVar));
    }

    public final C22306c<T> onExceptionResumeNext(C22306c<? extends T> c22306c) {
        return (C22306c<T>) lift(rv50.m181232b(c22306c));
    }

    public final C22306c<T> onTerminateDetach() {
        return create(new OnSubscribeDetach(this));
    }

    public final vv5<T> publish() {
        return OperatorPublish.m221405e(this);
    }

    public final C22306c<T> rebatchRequests(int i) {
        if (i > 0) {
            return (C22306c<T>) lift(ov50.m166155b(i));
        }
        k250.m144273a("n > 0 required but it was ", i);
        return null;
    }

    public final C22306c<T> reduce(x9j<T, T, T> x9jVar) {
        return create(new eg50(this, x9jVar));
    }

    public final C22306c<T> repeat() {
        return dg50.m111609b(this);
    }

    public final C22306c<T> repeatWhen(w9j<? super C22306c<? extends Void>, ? extends C22306c<?>> w9jVar, bud0 bud0Var) {
        return dg50.m111613f(this, InternalObservableUtils.createRepeatDematerializer(w9jVar), bud0Var);
    }

    public final <R> C22306c<R> replay(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        if (i >= 0) {
            return OperatorReplay.m221420j(InternalObservableUtils.createReplaySupplier(this, i, j, timeUnit, bud0Var), w9jVar);
        }
        ig3.m135964a("bufferSize < 0");
        return null;
    }

    public final C22306c<T> retry(x9j<Integer, Throwable, Boolean> x9jVar) {
        return (C22306c<T>) nest().lift(new sv50(x9jVar));
    }

    public final C22306c<T> retryWhen(w9j<? super C22306c<? extends Throwable>, ? extends C22306c<?>> w9jVar) {
        return dg50.m111617j(this, InternalObservableUtils.createRetryDematerializer(w9jVar));
    }

    public final C22306c<T> sample(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new uv50(j, timeUnit, bud0Var));
    }

    public final C22306c<T> scan(x9j<T, T, T> x9jVar) {
        return (C22306c<T>) lift(new vv50(x9jVar));
    }

    public final C22306c<T> serialize() {
        return (C22306c<T>) lift(xv50.m211245b());
    }

    public final C22306c<T> share() {
        return publish().m200175d();
    }

    public final C22306c<T> single() {
        return (C22306c<T>) lift(yv50.m216192b());
    }

    public final C22306c<T> singleOrDefault(T t) {
        return (C22306c<T>) lift(new yv50(t));
    }

    public final C22306c<T> skip(int i) {
        return (C22306c<T>) lift(new zv50(i));
    }

    public final C22306c<T> skipLast(int i) {
        return (C22306c<T>) lift(new aw50(i));
    }

    public final <U> C22306c<T> skipUntil(C22306c<U> c22306c) {
        return (C22306c<T>) lift(new dw50(c22306c));
    }

    public final C22306c<T> skipWhile(w9j<? super T, Boolean> w9jVar) {
        return (C22306c<T>) lift(new ew50(ew50.m118458b(w9jVar)));
    }

    public final C22306c<T> startWith(Iterable<T> iterable) {
        return concat(from(iterable), this);
    }

    public final C22306c<T> subscribeOn(bud0 bud0Var) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m221480e(bud0Var) : create(new fw50(this, bud0Var));
    }

    public final C22306c<T> switchIfEmpty(C22306c<? extends T> c22306c) {
        return (C22306c<T>) lift(new hw50(c22306c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22306c<R> switchMap(w9j<? super T, ? extends C22306c<? extends R>> w9jVar) {
        return switchOnNext(map(w9jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22306c<R> switchMapDelayError(w9j<? super T, ? extends C22306c<? extends R>> w9jVar) {
        return switchOnNextDelayError(map(w9jVar));
    }

    public final C22306c<T> take(int i) {
        return (C22306c<T>) lift(new iw50(i));
    }

    public final C22306c<T> takeFirst(w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).take(1);
    }

    public final C22306c<T> takeLast(int i) {
        if (i == 0) {
            return ignoreElements();
        }
        return i == 1 ? create(new ig50(this)) : (C22306c<T>) lift(new jw50(i));
    }

    public final C22306c<List<T>> takeLastBuffer(int i) {
        return takeLast(i).toList();
    }

    public final <E> C22306c<T> takeUntil(C22306c<? extends E> c22306c) {
        return (C22306c<T>) lift(new mw50(c22306c));
    }

    public final C22306c<T> takeWhile(w9j<? super T, Boolean> w9jVar) {
        return (C22306c<T>) lift(new ow50(w9jVar));
    }

    public final C22306c<T> throttleFirst(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new pw50(j, timeUnit, bud0Var));
    }

    public final C22306c<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final C22306c<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final C22306c<nqi0<T>> timeInterval(bud0 bud0Var) {
        return (C22306c<nqi0<T>>) lift(new qw50(bud0Var));
    }

    public final <U, V> C22306c<T> timeout(v9j<? extends C22306c<U>> v9jVar, w9j<? super T, ? extends C22306c<V>> w9jVar, C22306c<? extends T> c22306c) {
        if (w9jVar != null) {
            return (C22306c<T>) lift(new tw50(v9jVar, w9jVar, c22306c));
        }
        jfd0.m141176a("timeoutSelector is null");
        return null;
    }

    public final C22306c<hri0<T>> timestamp(bud0 bud0Var) {
        return (C22306c<hri0<T>>) lift(new uw50(bud0Var));
    }

    public final y33<T> toBlocking() {
        return y33.m212768d(this);
    }

    public C22305b toCompletable() {
        return C22305b.m221306f(this);
    }

    public final C22306c<List<T>> toList() {
        return (C22306c<List<T>>) lift(xw50.m211315b());
    }

    public final <K> C22306c<Map<K, T>> toMap(w9j<? super T, ? extends K> w9jVar) {
        return (C22306c<Map<K, T>>) lift(new vw50(w9jVar, UtilityFunctions.m221487b()));
    }

    public final <K> C22306c<Map<K, Collection<T>>> toMultimap(w9j<? super T, ? extends K> w9jVar) {
        return (C22306c<Map<K, Collection<T>>>) lift(new ww50(w9jVar, UtilityFunctions.m221487b()));
    }

    public C22307d<T> toSingle() {
        return new C22307d<>(hg50.m130808b(this));
    }

    public final C22306c<List<T>> toSortedList() {
        return (C22306c<List<T>>) lift(new yw50(10));
    }

    public final c4g0 unsafeSubscribe(z3g0<? super T> z3g0Var) {
        try {
            z3g0Var.mo99382d();
            ejd0.m116799p(this, this.onSubscribe).call(z3g0Var);
            return ejd0.m116798o(z3g0Var);
        } catch (Throwable th) {
            f5f.m119491e(th);
            try {
                z3g0Var.onError(ejd0.m116796m(th));
                return h4g0.m129243d();
            } catch (Throwable th2) {
                f5f.m119491e(th2);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                ejd0.m116796m(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    public final C22306c<T> unsubscribeOn(bud0 bud0Var) {
        return (C22306c<T>) lift(new zw50(bud0Var));
    }

    public final C22306c<C22306c<T>> window(int i, int i2) {
        if (i <= 0) {
            k250.m144273a("count > 0 required but it was ", i);
            return null;
        }
        if (i2 > 0) {
            return (C22306c<C22306c<T>>) lift(new OperatorWindowWithSize(i, i2));
        }
        k250.m144273a("skip > 0 required but it was ", i2);
        return null;
    }

    public final <T1, T2, R> C22306c<R> withLatestFrom(C22306c<T1> c22306c, C22306c<T2> c22306c2, y9j<? super T, ? super T1, ? super T2, R> y9jVar) {
        return create(new fx50(this, new C22306c[]{c22306c, c22306c2}, null, kaj.m145145b(y9jVar)));
    }

    public final <T2, R> C22306c<R> zipWith(Iterable<? extends T2> iterable, x9j<? super T, ? super T2, ? extends R> x9jVar) {
        return lift(new gx50(iterable, x9jVar));
    }

    public final void forEach(e30<? super T> e30Var, e30<Throwable> e30Var2) {
        subscribe(e30Var, e30Var2);
    }

    @Deprecated
    public final C22306c<T> cache(int i) {
        return cacheWithInitialCapacity(i);
    }

    public final void forEach(e30<? super T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        subscribe(e30Var, e30Var2, d30Var);
    }

    public final <R> C22306c<R> publish(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar) {
        return OperatorPublish.m221406f(this, w9jVar);
    }

    public final C22306c<T> repeat(bud0 bud0Var) {
        return dg50.m111614g(this, bud0Var);
    }

    public final C22306c<T> throttleLast(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return sample(j, timeUnit, bud0Var);
    }

    public final C22306c<T> throttleWithTimeout(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return debounce(j, timeUnit, bud0Var);
    }

    public final C22306c<T> repeat(long j) {
        return dg50.m111610c(this, j);
    }

    public static <T> C22306c<Boolean> sequenceEqual(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, x9j<? super T, ? super T, Boolean> x9jVar) {
        return wv50.m205718b(c22306c, c22306c2, x9jVar);
    }

    public final C22306c<T> repeat(long j, bud0 bud0Var) {
        return dg50.m111611d(this, j, bud0Var);
    }

    public static <T> C22306c<T> amb(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2) {
        return create(pf50.m168586b(c22306c, c22306c2));
    }

    public static <T> C22306c<T> concat(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2) {
        return concat(just(c22306c, c22306c2));
    }

    public static <T> C22306c<T> concatDelayError(Iterable<? extends C22306c<? extends T>> iterable) {
        return concatDelayError(from(iterable));
    }

    public static <T> C22306c<T> just(T t) {
        return ScalarSynchronousObservable.m221476a(t);
    }

    public final <R> C22306c<R> flatMapIterable(w9j<? super T, ? extends Iterable<? extends R>> w9jVar, int i) {
        return C22351a.m221449b(this, w9jVar, i);
    }

    public final C22306c<T> repeatWhen(w9j<? super C22306c<? extends Void>, ? extends C22306c<?>> w9jVar) {
        return dg50.m111612e(this, InternalObservableUtils.createRepeatDematerializer(w9jVar));
    }

    public final C22306c<T> retryWhen(w9j<? super C22306c<? extends Throwable>, ? extends C22306c<?>> w9jVar, bud0 bud0Var) {
        return dg50.m111618k(this, InternalObservableUtils.createRetryDematerializer(w9jVar), bud0Var);
    }

    public final C22306c<T> single(w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).single();
    }

    public final C22306c<T> startWith(C22306c<T> c22306c) {
        return concat(c22306c, this);
    }

    public final C22306c<List<T>> takeLastBuffer(int i, long j, TimeUnit timeUnit) {
        return takeLast(i, j, timeUnit).toList();
    }

    public static <T> C22306c<T> amb(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3) {
        return create(pf50.m168587c(c22306c, c22306c2, c22306c3));
    }

    public static <T> C22306c<T> concat(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3) {
        return concat(just(c22306c, c22306c2, c22306c3));
    }

    public static <S, T> C22306c<T> create(SyncOnSubscribe<S, T> syncOnSubscribe) {
        return create((a) syncOnSubscribe);
    }

    public static <T> C22306c<T> just(T t, T t2, T t3) {
        return from(new Object[]{t, t2, t3});
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends C22306c<? extends T>> c22306c, int i) {
        return (C22306c<T>) c22306c.lift(OperatorMerge.m221382c(true, i));
    }

    public static <T, Resource> C22306c<T> using(v9j<Resource> v9jVar, w9j<? super Resource, ? extends C22306c<? extends T>> w9jVar, e30<? super Resource> e30Var) {
        return using(v9jVar, w9jVar, e30Var, false);
    }

    public final C22306c<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<T> distinct() {
        return (C22306c<T>) lift(dv50.m113763b());
    }

    public final C22306c<T> distinctUntilChanged() {
        return (C22306c<T>) lift(ev50.m118242c());
    }

    public final C22306c<T> first(w9j<? super T, Boolean> w9jVar) {
        return takeFirst(w9jVar).single();
    }

    public final C22306c<T> firstOrDefault(T t, w9j<? super T, Boolean> w9jVar) {
        return takeFirst(w9jVar).singleOrDefault(t);
    }

    public final <R> C22306c<R> flatMapIterable(w9j<? super T, ? extends Iterable<? extends R>> w9jVar) {
        return flatMapIterable(w9jVar, rjd0.f159670g);
    }

    public final C22306c<T> onBackpressureBuffer() {
        return (C22306c<T>) lift(pv50.m171539b());
    }

    public final C22306c<T> onBackpressureDrop() {
        return (C22306c<T>) lift(qv50.m176694b());
    }

    public final C22306c<T> onErrorResumeNext(C22306c<? extends T> c22306c) {
        return (C22306c<T>) lift(rv50.m181233c(c22306c));
    }

    public final <R> C22306c<R> reduce(R r, x9j<R, ? super T, R> x9jVar) {
        return create(new fg50(this, r, x9jVar));
    }

    public final C22306c<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, Schedulers.computation());
    }

    public final <R> C22306c<R> scan(R r, x9j<R, ? super T, R> x9jVar) {
        return lift(new vv50(r, x9jVar));
    }

    public final C22306c<T> singleOrDefault(T t, w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).singleOrDefault(t);
    }

    public final C22306c<T> skip(long j, TimeUnit timeUnit) {
        return skip(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<T> startWith(T t) {
        return concat(just(t), this);
    }

    public final C22306c<T> take(long j, TimeUnit timeUnit) {
        return take(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<List<T>> takeLastBuffer(int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return takeLast(i, j, timeUnit, bud0Var).toList();
    }

    public final C22306c<T> takeUntil(w9j<? super T, Boolean> w9jVar) {
        return (C22306c<T>) lift(new nw50(w9jVar));
    }

    public final C22306c<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<nqi0<T>> timeInterval() {
        return timeInterval(Schedulers.computation());
    }

    public final C22306c<hri0<T>> timestamp() {
        return timestamp(Schedulers.computation());
    }

    public final <T2, R> C22306c<R> zipWith(C22306c<? extends T2> c22306c, x9j<? super T, ? super T2, ? extends R> x9jVar) {
        return zip(this, c22306c, x9jVar);
    }

    public static <T> C22306c<T> amb(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4) {
        return create(pf50.m168588d(c22306c, c22306c2, c22306c3, c22306c4));
    }

    public static <T> C22306c<T> concat(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4) {
        return concat(just(c22306c, c22306c2, c22306c3, c22306c4));
    }

    public static <S, T> C22306c<T> create(l21<S, T> l21Var) {
        return create((a) l21Var);
    }

    public static <T> C22306c<T> just(T t, T t2, T t3, T t4) {
        return from(new Object[]{t, t2, t3, t4});
    }

    public static <T> C22306c<T> mergeDelayError(Iterable<? extends C22306c<? extends T>> iterable) {
        return mergeDelayError(from(iterable));
    }

    public final C22306c<T> debounce(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new zu50(j, timeUnit, bud0Var));
    }

    public final C22306c<T> distinctUntilChanged(x9j<? super T, ? super T, Boolean> x9jVar) {
        return (C22306c<T>) lift(new ev50(x9jVar));
    }

    public final <U, R> C22306c<R> flatMapIterable(w9j<? super T, ? extends Iterable<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar, int i) {
        return flatMap(mv50.m156475b(w9jVar), x9jVar, i);
    }

    public final C22306c<T> onBackpressureBuffer(long j, d30 d30Var) {
        return (C22306c<T>) lift(new pv50(j, d30Var));
    }

    public final <U> C22306c<T> sample(C22306c<U> c22306c) {
        return (C22306c<T>) lift(new tv50(c22306c));
    }

    public final C22306c<T> skip(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new cw50(j, timeUnit, bud0Var));
    }

    public final C22306c<T> skipLast(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new bw50(j, timeUnit, bud0Var));
    }

    public final C22306c<T> startWith(T t, T t2) {
        return concat(just(t, t2), this);
    }

    public final C22306c<T> take(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new lw50(j, timeUnit, bud0Var));
    }

    public final C22306c<List<T>> takeLastBuffer(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit).toList();
    }

    public static <T> C22306c<T> amb(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5) {
        return create(pf50.m168589e(c22306c, c22306c2, c22306c3, c22306c4, c22306c5));
    }

    public static <T> C22306c<T> concat(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5) {
        return concat(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5));
    }

    public static <T> C22306c<T> just(T t, T t2, T t3, T t4, T t5) {
        return from(new Object[]{t, t2, t3, t4, t5});
    }

    public static <T> C22306c<T> mergeDelayError(Iterable<? extends C22306c<? extends T>> iterable, int i) {
        return mergeDelayError(from(iterable), i);
    }

    @Deprecated
    public static C22306c<Long> timer(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        return interval(j, j2, timeUnit, bud0Var);
    }

    public final C22306c<T> onBackpressureBuffer(long j, d30 d30Var, C22304a.d dVar) {
        return (C22306c<T>) lift(new pv50(j, d30Var, dVar));
    }

    public final C22306c<T> startWith(T t, T t2, T t3) {
        return concat(just(t, t2, t3), this);
    }

    public final C22306c<List<T>> takeLastBuffer(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return takeLast(j, timeUnit, bud0Var).toList();
    }

    public final C22306c<List<T>> toSortedList(x9j<? super T, ? super T, Integer> x9jVar) {
        return (C22306c<List<T>>) lift(new yw50(x9jVar, 10));
    }

    public static <T> C22306c<T> amb(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6) {
        return create(pf50.m168590f(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6));
    }

    public static <T> C22306c<T> concat(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6) {
        return concat(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3) {
        return concatEager(Arrays.asList(c22306c, c22306c2, c22306c3));
    }

    public static <T> C22306c<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        return from(new Object[]{t, t2, t3, t4, t5, t6});
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2) {
        return mergeDelayError(just(c22306c, c22306c2));
    }

    public static C22306c<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<T> startWith(T t, T t2, T t3, T t4) {
        return concat(just(t, t2, t3, t4), this);
    }

    public final C22306c<List<T>> toSortedList(int i) {
        return (C22306c<List<T>>) lift(new yw50(i));
    }

    public static <T> C22306c<T> amb(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7) {
        return create(pf50.m168591g(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7));
    }

    public static <T> C22306c<T> concat(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7) {
        return concat(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4) {
        return concatEager(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4));
    }

    public static C22306c<Long> interval(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return interval(j, j, timeUnit, bud0Var);
    }

    public static <T> C22306c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7});
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3) {
        return mergeDelayError(just(c22306c, c22306c2, c22306c3));
    }

    public static C22306c<Long> timer(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return create(new kg50(j, timeUnit, bud0Var));
    }

    public final <U> C22306c<T> delay(w9j<? super T, ? extends C22306c<U>> w9jVar) {
        return (C22306c<T>) lift(new bv50(this, w9jVar));
    }

    public final C22306c<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<T> last() {
        return takeLast(1).single();
    }

    public final C22306c<T> lastOrDefault(T t) {
        return takeLast(1).singleOrDefault(t);
    }

    public final C22306c<T> retry(long j) {
        return dg50.m111616i(this, j);
    }

    public final C22306c<T> startWith(T t, T t2, T t3, T t4, T t5) {
        return concat(just(t, t2, t3, t4, t5), this);
    }

    public final <K, V> C22306c<Map<K, V>> toMap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        return (C22306c<Map<K, V>>) lift(new vw50(w9jVar, w9jVar2));
    }

    public final <K, V> C22306c<Map<K, Collection<V>>> toMultimap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        return (C22306c<Map<K, Collection<V>>>) lift(new ww50(w9jVar, w9jVar2));
    }

    public final C22306c<List<T>> toSortedList(x9j<? super T, ? super T, Integer> x9jVar, int i) {
        return (C22306c<List<T>>) lift(new yw50(x9jVar, i));
    }

    public static <T> C22306c<T> amb(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8) {
        return create(pf50.m168592h(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8));
    }

    public static <T> C22306c<T> concat(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8) {
        return concat(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5) {
        return concatEager(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5));
    }

    public static C22306c<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, Schedulers.computation());
    }

    public static <T> C22306c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8});
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4) {
        return mergeDelayError(just(c22306c, c22306c2, c22306c3, c22306c4));
    }

    public final C22306c<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.computation());
    }

    public final <U> C22306c<T> delaySubscription(v9j<? extends C22306c<U>> v9jVar) {
        return create(new wf50(this, v9jVar));
    }

    public final C22306c<T> doOnEach(m250<? super T> m250Var) {
        return (C22306c<T>) lift(new gv50(m250Var));
    }

    public final C22306c<T> retry() {
        return dg50.m111615h(this);
    }

    public final C22306c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6) {
        return concat(just(t, t2, t3, t4, t5, t6), this);
    }

    public final <K, V> C22306c<Map<K, V>> toMap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, V>> v9jVar) {
        return (C22306c<Map<K, V>>) lift(new vw50(w9jVar, w9jVar2, v9jVar));
    }

    public final <K, V> C22306c<Map<K, Collection<V>>> toMultimap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, Collection<V>>> v9jVar) {
        return (C22306c<Map<K, Collection<V>>>) lift(new ww50(w9jVar, w9jVar2, v9jVar));
    }

    public static <T> C22306c<T> amb(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8, C22306c<? extends T> c22306c9) {
        return create(pf50.m168593i(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8, c22306c9));
    }

    public static <T> C22306c<T> concat(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8, C22306c<? extends T> c22306c9) {
        return concat(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8, c22306c9));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6) {
        return concatEager(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6));
    }

    public static C22306c<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, Schedulers.computation());
    }

    public static <T> C22306c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9});
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5) {
        return mergeDelayError(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5));
    }

    public final C22306c<T> delay(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new av50(j, timeUnit, bud0Var));
    }

    public final <U> C22306c<T> delaySubscription(C22306c<U> c22306c) {
        c22306c.getClass();
        return create(new vf50(this, c22306c));
    }

    public final C22306c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return concat(just(t, t2, t3, t4, t5, t6, t7), this);
    }

    public final <K, V> C22306c<Map<K, Collection<V>>> toMultimap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, Collection<V>>> v9jVar, w9j<? super K, ? extends Collection<V>> w9jVar3) {
        return (C22306c<Map<K, Collection<V>>>) lift(new ww50(w9jVar, w9jVar2, v9jVar, w9jVar3));
    }

    public static <T1, T2, T3, R> C22306c<R> combineLatest(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, y9j<? super T1, ? super T2, ? super T3, ? extends R> y9jVar) {
        return combineLatest(Arrays.asList(c22306c, c22306c2, c22306c3), kaj.m145145b(y9jVar));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7) {
        return concatEager(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7));
    }

    public static <T> C22306c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9, t10});
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6) {
        return mergeDelayError(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6));
    }

    public final C22306c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return concat(just(t, t2, t3, t4, t5, t6, t7, t8), this);
    }

    public static <T1, T2, T3, T4, R> C22306c<R> combineLatest(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, z9j<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> z9jVar) {
        return combineLatest(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4), kaj.m145146c(z9jVar));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8) {
        return concatEager(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8));
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7) {
        return mergeDelayError(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7));
    }

    public final C22306c<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final C22306c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return concat(just(t, t2, t3, t4, t5, t6, t7, t8, t9), this);
    }

    public static <T1, T2, T3, T4, T5, R> C22306c<R> combineLatest(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, aaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> aajVar) {
        return combineLatest(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5), kaj.m145147d(aajVar));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8, C22306c<? extends T> c22306c9) {
        return concatEager(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8, c22306c9));
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8) {
        return mergeDelayError(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8));
    }

    public final C22306c<List<T>> buffer(int i, int i2) {
        return (C22306c<List<T>>) lift(new OperatorBufferWithSize(i, i2));
    }

    public final <K, R> C22306c<ynk<K, R>> groupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends R> w9jVar2) {
        return lift(new OperatorGroupBy(w9jVar, w9jVar2));
    }

    public final <U, V> C22306c<T> timeout(v9j<? extends C22306c<U>> v9jVar, w9j<? super T, ? extends C22306c<V>> w9jVar) {
        return timeout(v9jVar, w9jVar, (C22306c) null);
    }

    public final <U, R> C22306c<R> withLatestFrom(C22306c<? extends U> c22306c, x9j<? super T, ? super U, ? extends R> x9jVar) {
        return lift(new ex50(c22306c, x9jVar));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C22306c<R> combineLatest(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, baj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> bajVar) {
        return combineLatest(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6), kaj.m145148e(bajVar));
    }

    public static <T> C22306c<T> concatEager(Iterable<? extends C22306c<? extends T>> iterable) {
        return from(iterable).concatMapEager(UtilityFunctions.m221487b());
    }

    public static <T> C22306c<T> mergeDelayError(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8, C22306c<? extends T> c22306c9) {
        return mergeDelayError(just(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8, c22306c9));
    }

    public final C22306c<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return buffer(j, j2, timeUnit, Schedulers.computation());
    }

    public final <K> C22306c<ynk<K, T>> groupBy(w9j<? super T, ? extends K> w9jVar) {
        return (C22306c<ynk<K, T>>) lift(new OperatorGroupBy(w9jVar));
    }

    public final <V> C22306c<T> timeout(w9j<? super T, ? extends C22306c<V>> w9jVar) {
        return timeout((v9j) null, w9jVar, (C22306c) null);
    }

    public final <T1, T2, T3, R> C22306c<R> withLatestFrom(C22306c<T1> c22306c, C22306c<T2> c22306c2, C22306c<T3> c22306c3, z9j<? super T, ? super T1, ? super T2, ? super T3, R> z9jVar) {
        return create(new fx50(this, new C22306c[]{c22306c, c22306c2, c22306c3}, null, kaj.m145146c(z9jVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C22306c<R> combineLatest(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, C22306c<? extends T7> c22306c7, caj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> cajVar) {
        return combineLatest(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7), kaj.m145149f(cajVar));
    }

    public static <T> C22306c<T> concatEager(Iterable<? extends C22306c<? extends T>> iterable, int i) {
        return from(iterable).concatMapEager(UtilityFunctions.m221487b(), i);
    }

    public final C22306c<List<T>> buffer(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<List<T>>) lift(new tu50(j, j2, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, bud0Var));
    }

    public final C22306c<T> observeOn(bud0 bud0Var, int i) {
        return observeOn(bud0Var, false, i);
    }

    public final <V> C22306c<T> timeout(w9j<? super T, ? extends C22306c<V>> w9jVar, C22306c<? extends T> c22306c) {
        return timeout((v9j) null, w9jVar, c22306c);
    }

    public final <T1, T2, T3, T4, R> C22306c<R> withLatestFrom(C22306c<T1> c22306c, C22306c<T2> c22306c2, C22306c<T3> c22306c3, C22306c<T4> c22306c4, aaj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> aajVar) {
        return create(new fx50(this, new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4}, null, kaj.m145147d(aajVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C22306c<R> combineLatest(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, C22306c<? extends T7> c22306c7, C22306c<? extends T8> c22306c8, daj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> dajVar) {
        return combineLatest(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8), kaj.m145150g(dajVar));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends C22306c<? extends T>> c22306c) {
        return (C22306c<T>) c22306c.concatMapEager(UtilityFunctions.m221487b());
    }

    public final C22306c<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, Schedulers.computation());
    }

    public final C22306c<T> observeOn(bud0 bud0Var, boolean z) {
        return observeOn(bud0Var, z, rjd0.f159670g);
    }

    public final C22306c<T> timeout(long j, TimeUnit timeUnit) {
        return timeout(j, timeUnit, null, Schedulers.computation());
    }

    public final <T1, T2, T3, T4, T5, R> C22306c<R> withLatestFrom(C22306c<T1> c22306c, C22306c<T2> c22306c2, C22306c<T1> c22306c3, C22306c<T2> c22306c4, C22306c<T1> c22306c5, baj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, R> bajVar) {
        return create(new fx50(this, new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5}, null, kaj.m145148e(bajVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C22306c<R> combineLatest(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, C22306c<? extends T7> c22306c7, C22306c<? extends T8> c22306c8, C22306c<? extends T9> c22306c9, eaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> eajVar) {
        return combineLatest(Arrays.asList(c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8, c22306c9), kaj.m145151h(eajVar));
    }

    public static <T> C22306c<T> concatEager(C22306c<? extends C22306c<? extends T>> c22306c, int i) {
        return (C22306c<T>) c22306c.concatMapEager(UtilityFunctions.m221487b(), i);
    }

    public final <TClosing> C22306c<List<T>> buffer(v9j<? extends C22306c<? extends TClosing>> v9jVar) {
        return (C22306c<List<T>>) lift(new ru50(v9jVar, 16));
    }

    public final C22306c<T> observeOn(bud0 bud0Var) {
        return observeOn(bud0Var, rjd0.f159670g);
    }

    public final <R> C22306c<R> replay(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar) {
        return OperatorReplay.m221420j(InternalObservableUtils.createReplaySupplier(this), w9jVar);
    }

    public final C22306c<T> timeout(long j, TimeUnit timeUnit, C22306c<? extends T> c22306c) {
        return timeout(j, timeUnit, c22306c, Schedulers.computation());
    }

    public final <T1, T2, T3, T4, T5, T6, R> C22306c<R> withLatestFrom(C22306c<T1> c22306c, C22306c<T2> c22306c2, C22306c<T1> c22306c3, C22306c<T2> c22306c4, C22306c<T1> c22306c5, C22306c<T2> c22306c6, caj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, R> cajVar) {
        return create(new fx50(this, new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6}, null, kaj.m145149f(cajVar)));
    }

    public static <T, R> C22306c<R> combineLatest(List<? extends C22306c<? extends T>> list, faj<? extends R> fajVar) {
        return create(new OnSubscribeCombineLatest(list, fajVar));
    }

    public final C22306c<List<T>> buffer(long j, TimeUnit timeUnit, int i, bud0 bud0Var) {
        return (C22306c<List<T>>) lift(new tu50(j, j, timeUnit, i, bud0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22306c<R> flatMap(w9j<? super T, ? extends C22306c<? extends R>> w9jVar, int i) {
        if (getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) this).m221479d(w9jVar);
        }
        return merge(map(w9jVar), i);
    }

    public final <R> C22306c<R> replay(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, int i) {
        return OperatorReplay.m221420j(InternalObservableUtils.createReplaySupplier(this, i), w9jVar);
    }

    public final C22306c<T> timeout(long j, TimeUnit timeUnit, C22306c<? extends T> c22306c, bud0 bud0Var) {
        return (C22306c<T>) lift(new rw50(j, timeUnit, c22306c, bud0Var));
    }

    public final <T1, T2, T3, T4, T5, T6, T7, R> C22306c<R> withLatestFrom(C22306c<T1> c22306c, C22306c<T2> c22306c2, C22306c<T1> c22306c3, C22306c<T2> c22306c4, C22306c<T1> c22306c5, C22306c<T2> c22306c6, C22306c<T1> c22306c7, daj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, R> dajVar) {
        return create(new fx50(this, new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7}, null, kaj.m145150g(dajVar)));
    }

    public static <T, R> C22306c<R> combineLatest(Iterable<? extends C22306c<? extends T>> iterable, faj<? extends R> fajVar) {
        return create(new OnSubscribeCombineLatest(iterable, fajVar));
    }

    public final C22306c<List<T>> buffer(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return buffer(j, j, timeUnit, bud0Var);
    }

    public final <R> C22306c<R> replay(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, int i, long j, TimeUnit timeUnit) {
        return replay(w9jVar, i, j, timeUnit, Schedulers.computation());
    }

    public final C22306c<T> timeout(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return timeout(j, timeUnit, null, bud0Var);
    }

    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> C22306c<R> withLatestFrom(C22306c<T1> c22306c, C22306c<T2> c22306c2, C22306c<T1> c22306c3, C22306c<T2> c22306c4, C22306c<T1> c22306c5, C22306c<T2> c22306c6, C22306c<T1> c22306c7, C22306c<T2> c22306c8, eaj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, R> eajVar) {
        return create(new fx50(this, new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8}, null, kaj.m145151h(eajVar)));
    }

    public final <TOpening, TClosing> C22306c<List<T>> buffer(C22306c<? extends TOpening> c22306c, w9j<? super TOpening, ? extends C22306c<? extends TClosing>> w9jVar) {
        return (C22306c<List<T>>) lift(new su50(c22306c, w9jVar));
    }

    public final vv5<T> replay() {
        return OperatorReplay.m221415e(this);
    }

    public final <R> C22306c<R> withLatestFrom(C22306c<?>[] c22306cArr, faj<R> fajVar) {
        return create(new fx50(this, c22306cArr, null, fajVar));
    }

    public final <B> C22306c<List<T>> buffer(C22306c<B> c22306c) {
        return buffer(c22306c, 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22306c<R> flatMap(w9j<? super T, ? extends C22306c<? extends R>> w9jVar, w9j<? super Throwable, ? extends C22306c<? extends R>> w9jVar2, v9j<? extends C22306c<? extends R>> v9jVar) {
        return merge(mapNotification(w9jVar, w9jVar2, v9jVar));
    }

    public final <R> C22306c<R> replay(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, int i, bud0 bud0Var) {
        return OperatorReplay.m221420j(InternalObservableUtils.createReplaySupplier(this, i), InternalObservableUtils.createReplaySelectorAndObserveOn(w9jVar, bud0Var));
    }

    public final <R> C22306c<R> withLatestFrom(Iterable<C22306c<?>> iterable, faj<R> fajVar) {
        return create(new fx50(this, null, iterable, fajVar));
    }

    public final <B> C22306c<List<T>> buffer(C22306c<B> c22306c, int i) {
        return (C22306c<List<T>>) lift(new ru50(c22306c, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C22306c<R> flatMap(w9j<? super T, ? extends C22306c<? extends R>> w9jVar, w9j<? super Throwable, ? extends C22306c<? extends R>> w9jVar2, v9j<? extends C22306c<? extends R>> v9jVar, int i) {
        return merge(mapNotification(w9jVar, w9jVar2, v9jVar), i);
    }

    public final <R> C22306c<R> replay(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, long j, TimeUnit timeUnit) {
        return replay(w9jVar, j, timeUnit, Schedulers.computation());
    }

    public final C22306c<C22306c<T>> window(int i) {
        return window(i, i);
    }

    public static <T> C22306c<T> from(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return create(mg50.m154501b(future, j, timeUnit));
    }

    public static <T> C22306c<T> merge(Iterable<? extends C22306c<? extends T>> iterable, int i) {
        return merge(from(iterable), i);
    }

    public final <R> C22306c<R> concatMapEager(w9j<? super T, ? extends C22306c<? extends R>> w9jVar, int i) {
        if (i >= 1) {
            return lift(new OperatorEagerConcatMap(w9jVar, i, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
        k250.m144273a("capacityHint > 0 required but it was ", i);
        return null;
    }

    public final <U, R> C22306c<R> flatMap(w9j<? super T, ? extends C22306c<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar) {
        return merge(lift(new mv50(w9jVar, x9jVar)));
    }

    public final <R> C22306c<R> replay(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return OperatorReplay.m221420j(InternalObservableUtils.createReplaySupplier(this, j, timeUnit, bud0Var), w9jVar);
    }

    public final <TClosing> C22306c<C22306c<T>> window(v9j<? extends C22306c<? extends TClosing>> v9jVar) {
        return (C22306c<C22306c<T>>) lift(new bx50(v9jVar));
    }

    public static <T> C22306c<T> from(Future<? extends T> future, bud0 bud0Var) {
        return create(mg50.m154500a(future)).subscribeOn(bud0Var);
    }

    public static <T> C22306c<T> merge(Iterable<? extends C22306c<? extends T>> iterable) {
        return merge(from(iterable));
    }

    public final <U, R> C22306c<R> flatMap(w9j<? super T, ? extends C22306c<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar, int i) {
        return merge(lift(new mv50(w9jVar, x9jVar)), i);
    }

    public final <R> C22306c<R> replay(w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, bud0 bud0Var) {
        return OperatorReplay.m221420j(InternalObservableUtils.createReplaySupplier(this), InternalObservableUtils.createReplaySelectorAndObserveOn(w9jVar, bud0Var));
    }

    public final C22306c<T> takeLast(int i, long j, TimeUnit timeUnit) {
        return takeLast(i, j, timeUnit, Schedulers.computation());
    }

    public final C22306c<C22306c<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, Schedulers.computation());
    }

    public static <T> C22306c<T> merge(C22306c<? extends C22306c<? extends T>> c22306c, int i) {
        if (c22306c.getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) c22306c).m221479d(UtilityFunctions.m221487b());
        }
        return (C22306c<T>) c22306c.lift(OperatorMerge.m221382c(false, i));
    }

    public final <R> C22306c<R> concatMapEager(w9j<? super T, ? extends C22306c<? extends R>> w9jVar) {
        return concatMapEager(w9jVar, rjd0.f159670g);
    }

    public final vv5<T> replay(int i) {
        return OperatorReplay.m221416f(this, i);
    }

    public final C22306c<T> takeLast(int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new kw50(i, j, timeUnit, bud0Var));
    }

    public final C22306c<C22306c<T>> window(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        return window(j, j2, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, bud0Var);
    }

    public static <T> C22306c<T> from(Iterable<? extends T> iterable) {
        return create(new OnSubscribeFromIterable(iterable));
    }

    public final vv5<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, Schedulers.computation());
    }

    public final C22306c<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<C22306c<T>> window(long j, long j2, TimeUnit timeUnit, int i, bud0 bud0Var) {
        return (C22306c<C22306c<T>>) lift(new dx50(j, j2, timeUnit, i, bud0Var));
    }

    public static <T> C22306c<T> from(Future<? extends T> future) {
        return create(mg50.m154500a(future));
    }

    public final vv5<T> replay(int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        if (i >= 0) {
            return OperatorReplay.m221418h(this, j, timeUnit, bud0Var, i);
        }
        ig3.m135964a("bufferSize < 0");
        return null;
    }

    public final C22306c<T> takeLast(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C22306c<T>) lift(new kw50(j, timeUnit, bud0Var));
    }

    public final C22306c<C22306c<T>> window(long j, TimeUnit timeUnit) {
        return window(j, j, timeUnit, Schedulers.computation());
    }

    public static <T> C22306c<T> merge(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2) {
        return merge(new C22306c[]{c22306c, c22306c2});
    }

    public final C22306c<C22306c<T>> window(long j, TimeUnit timeUnit, int i) {
        return window(j, timeUnit, i, Schedulers.computation());
    }

    public static <T> C22306c<T> merge(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3) {
        return merge(new C22306c[]{c22306c, c22306c2, c22306c3});
    }

    public final vv5<T> replay(int i, bud0 bud0Var) {
        return OperatorReplay.m221421k(replay(i), bud0Var);
    }

    public final C22306c<C22306c<T>> window(long j, TimeUnit timeUnit, int i, bud0 bud0Var) {
        return window(j, j, timeUnit, i, bud0Var);
    }

    public static <T> C22306c<T> merge(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4) {
        return merge(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4});
    }

    public final vv5<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, Schedulers.computation());
    }

    public final C22306c<C22306c<T>> window(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return window(j, timeUnit, Api.BaseClientBuilder.API_PRIORITY_OTHER, bud0Var);
    }

    public static <T> C22306c<T> merge(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5) {
        return merge(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5});
    }

    public final vv5<T> replay(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return OperatorReplay.m221417g(this, j, timeUnit, bud0Var);
    }

    public final <TOpening, TClosing> C22306c<C22306c<T>> window(C22306c<? extends TOpening> c22306c, w9j<? super TOpening, ? extends C22306c<? extends TClosing>> w9jVar) {
        return (C22306c<C22306c<T>>) lift(new cx50(c22306c, w9jVar));
    }

    public static <T> C22306c<T> merge(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6) {
        return merge(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6});
    }

    public final vv5<T> replay(bud0 bud0Var) {
        return OperatorReplay.m221421k(replay(), bud0Var);
    }

    public final <U> C22306c<C22306c<T>> window(C22306c<U> c22306c) {
        return (C22306c<C22306c<T>>) lift(new ax50(c22306c));
    }

    public static <T> C22306c<T> merge(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7) {
        return merge(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7});
    }

    public static <T> C22306c<T> merge(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8) {
        return merge(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8});
    }

    public static <T> C22306c<T> merge(C22306c<? extends T> c22306c, C22306c<? extends T> c22306c2, C22306c<? extends T> c22306c3, C22306c<? extends T> c22306c4, C22306c<? extends T> c22306c5, C22306c<? extends T> c22306c6, C22306c<? extends T> c22306c7, C22306c<? extends T> c22306c8, C22306c<? extends T> c22306c9) {
        return merge(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8, c22306c9});
    }

    public static <T> C22306c<T> merge(C22306c<? extends T>[] c22306cArr) {
        return merge(from(c22306cArr));
    }

    public static <T> C22306c<T> merge(C22306c<? extends T>[] c22306cArr, int i) {
        return merge(from(c22306cArr), i);
    }

    public static <R> C22306c<R> zip(C22306c<?>[] c22306cArr, faj<? extends R> fajVar) {
        return just(c22306cArr).lift(new OperatorZip(fajVar));
    }

    public static <R> C22306c<R> zip(C22306c<? extends C22306c<?>> c22306c, faj<? extends R> fajVar) {
        return c22306c.toList().map(InternalObservableUtils.TO_ARRAY).lift(new OperatorZip(fajVar));
    }

    public static C22306c<Integer> range(int i, int i2, bud0 bud0Var) {
        return range(i, i2).subscribeOn(bud0Var);
    }

    public static <T1, T2, R> C22306c<R> zip(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, x9j<? super T1, ? super T2, ? extends R> x9jVar) {
        return just(new C22306c[]{c22306c, c22306c2}).lift(new OperatorZip(x9jVar));
    }

    public static <T1, T2, T3, R> C22306c<R> zip(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, y9j<? super T1, ? super T2, ? super T3, ? extends R> y9jVar) {
        return just(new C22306c[]{c22306c, c22306c2, c22306c3}).lift(new OperatorZip(y9jVar));
    }

    public static <T1, T2, T3, T4, R> C22306c<R> zip(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, z9j<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> z9jVar) {
        return just(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4}).lift(new OperatorZip(z9jVar));
    }

    public static <T1, T2, T3, T4, T5, R> C22306c<R> zip(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, aaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> aajVar) {
        return just(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5}).lift(new OperatorZip(aajVar));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C22306c<R> zip(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, baj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> bajVar) {
        return just(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6}).lift(new OperatorZip(bajVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C22306c<R> zip(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, C22306c<? extends T7> c22306c7, caj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> cajVar) {
        return just(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7}).lift(new OperatorZip(cajVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C22306c<R> zip(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, C22306c<? extends T7> c22306c7, C22306c<? extends T8> c22306c8, daj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> dajVar) {
        return just(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8}).lift(new OperatorZip(dajVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C22306c<R> zip(C22306c<? extends T1> c22306c, C22306c<? extends T2> c22306c2, C22306c<? extends T3> c22306c3, C22306c<? extends T4> c22306c4, C22306c<? extends T5> c22306c5, C22306c<? extends T6> c22306c6, C22306c<? extends T7> c22306c7, C22306c<? extends T8> c22306c8, C22306c<? extends T9> c22306c9, eaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> eajVar) {
        return just(new C22306c[]{c22306c, c22306c2, c22306c3, c22306c4, c22306c5, c22306c6, c22306c7, c22306c8, c22306c9}).lift(new OperatorZip(eajVar));
    }

    public final c4g0 subscribe(e30<? super T> e30Var) {
        if (e30Var != null) {
            return subscribe((z3g0) new e40(e30Var, InternalObservableUtils.ERROR_NOT_IMPLEMENTED, i40.m134309a()));
        }
        ig3.m135964a("onNext can not be null");
        return null;
    }

    public final c4g0 subscribe(e30<? super T> e30Var, e30<Throwable> e30Var2) {
        if (e30Var == null) {
            ig3.m135964a("onNext can not be null");
            return null;
        }
        if (e30Var2 != null) {
            return subscribe((z3g0) new e40(e30Var, e30Var2, i40.m134309a()));
        }
        ig3.m135964a("onError can not be null");
        return null;
    }

    public final c4g0 subscribe(e30<? super T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        if (e30Var == null) {
            ig3.m135964a("onNext can not be null");
            return null;
        }
        if (e30Var2 == null) {
            ig3.m135964a("onError can not be null");
            return null;
        }
        if (d30Var != null) {
            return subscribe((z3g0) new e40(e30Var, e30Var2, d30Var));
        }
        ig3.m135964a("onComplete can not be null");
        return null;
    }

    public final c4g0 subscribe(m250<? super T> m250Var) {
        if (m250Var instanceof z3g0) {
            return subscribe((z3g0) m250Var);
        }
        if (m250Var != null) {
            return subscribe((z3g0) new o250(m250Var));
        }
        jfd0.m141176a("observer is null");
        return null;
    }

    public final c4g0 subscribe(z3g0<? super T> z3g0Var) {
        return subscribe(z3g0Var, this);
    }

    public final c4g0 subscribe() {
        return subscribe((z3g0) new e40(i40.m134309a(), InternalObservableUtils.ERROR_NOT_IMPLEMENTED, i40.m134309a()));
    }
}
