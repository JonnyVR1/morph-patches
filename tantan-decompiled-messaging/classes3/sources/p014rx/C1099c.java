package p014rx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import l.ig3;
import l.jfd0;
import l.qkq0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p003l.aaj;
import p003l.ag50;
import p003l.av50;
import p003l.aw50;
import p003l.ax50;
import p003l.baj;
import p003l.bg50;
import p003l.bud0;
import p003l.bv50;
import p003l.bw50;
import p003l.bx50;
import p003l.c4g0;
import p003l.caj;
import p003l.cg50;
import p003l.cv50;
import p003l.cw50;
import p003l.cx50;
import p003l.d30;
import p003l.daj;
import p003l.dg50;
import p003l.dv50;
import p003l.dw50;
import p003l.dx50;
import p003l.e30;
import p003l.e40;
import p003l.eaj;
import p003l.eg50;
import p003l.ejd0;
import p003l.ev50;
import p003l.ew50;
import p003l.ex50;
import p003l.f30;
import p003l.f5f;
import p003l.faj;
import p003l.fg50;
import p003l.fv50;
import p003l.fw50;
import p003l.fx50;
import p003l.gv50;
import p003l.gw50;
import p003l.gx50;
import p003l.h4g0;
import p003l.hg50;
import p003l.hri0;
import p003l.hv50;
import p003l.hw50;
import p003l.i40;
import p003l.ig50;
import p003l.iv50;
import p003l.iw50;
import p003l.jg50;
import p003l.jv50;
import p003l.jw50;
import p003l.k250;
import p003l.kaj;
import p003l.kg50;
import p003l.kv50;
import p003l.kw50;
import p003l.l21;
import p003l.lg50;
import p003l.lod0;
import p003l.lv50;
import p003l.lw50;
import p003l.m250;
import p003l.mg50;
import p003l.mv50;
import p003l.mw50;
import p003l.nqi0;
import p003l.nv50;
import p003l.nw50;
import p003l.o250;
import p003l.ou50;
import p003l.ov50;
import p003l.ow50;
import p003l.pf50;
import p003l.pu50;
import p003l.pv50;
import p003l.pw50;
import p003l.qu50;
import p003l.qv50;
import p003l.qw50;
import p003l.rf50;
import p003l.rjd0;
import p003l.ru50;
import p003l.rv50;
import p003l.rw50;
import p003l.sf50;
import p003l.su50;
import p003l.sv50;
import p003l.tf50;
import p003l.tu50;
import p003l.tv50;
import p003l.tw50;
import p003l.uf50;
import p003l.uu50;
import p003l.uv50;
import p003l.uw50;
import p003l.v30;
import p003l.v9j;
import p003l.vf50;
import p003l.vv5;
import p003l.vv50;
import p003l.vw50;
import p003l.w9j;
import p003l.wf50;
import p003l.wv50;
import p003l.ww50;
import p003l.x9j;
import p003l.xf50;
import p003l.xv50;
import p003l.xw50;
import p003l.y33;
import p003l.y9j;
import p003l.yf50;
import p003l.ynk;
import p003l.yu50;
import p003l.yv50;
import p003l.yw50;
import p003l.z3g0;
import p003l.z9j;
import p003l.zf50;
import p003l.zu50;
import p003l.zv50;
import p003l.zw50;
import p014rx.exceptions.OnErrorFailedException;
import p014rx.internal.operators.C1144a;
import p014rx.internal.operators.CachedObservable;
import p014rx.internal.operators.EmptyObservableHolder;
import p014rx.internal.operators.NeverObservableHolder;
import p014rx.internal.operators.OnSubscribeCombineLatest;
import p014rx.internal.operators.OnSubscribeDetach;
import p014rx.internal.operators.OnSubscribeFromArray;
import p014rx.internal.operators.OnSubscribeFromAsync;
import p014rx.internal.operators.OnSubscribeFromIterable;
import p014rx.internal.operators.OnSubscribeRange;
import p014rx.internal.operators.OnSubscribeUsing;
import p014rx.internal.operators.OperatorBufferWithSize;
import p014rx.internal.operators.OperatorEagerConcatMap;
import p014rx.internal.operators.OperatorElementAt;
import p014rx.internal.operators.OperatorGroupBy;
import p014rx.internal.operators.OperatorMerge;
import p014rx.internal.operators.OperatorOnBackpressureLatest;
import p014rx.internal.operators.OperatorPublish;
import p014rx.internal.operators.OperatorReplay;
import p014rx.internal.operators.OperatorWindowWithSize;
import p014rx.internal.operators.OperatorZip;
import p014rx.internal.util.InternalObservableUtils;
import p014rx.internal.util.ScalarSynchronousObservable;
import p014rx.internal.util.UtilityFunctions;
import p014rx.observables.SyncOnSubscribe;
import p014rx.schedulers.Schedulers;

/* JADX INFO: renamed from: rx.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1099c<T> {
    final a<T> onSubscribe;

    /* JADX INFO: renamed from: rx.c$a */
    public interface a<T> extends e30<z3g0<? super T>> {
    }

    /* JADX INFO: renamed from: rx.c$b */
    public static final class b<T> implements a<T> {

        /* JADX INFO: renamed from: a */
        public final C1099c<T> f10738a;

        public b(C1099c<T> c1099c) {
            this.f10738a = c1099c;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            z3g0Var.m9240b(C1099c.subscribe(z3g0Var, this.f10738a));
        }
    }

    /* JADX INFO: renamed from: rx.c$c */
    public interface c<R, T> extends w9j<z3g0<? super R>, z3g0<? super T>> {
    }

    /* JADX INFO: renamed from: rx.c$d */
    public interface d<T, R> extends w9j<C1099c<T>, C1099c<R>> {
    }

    public C1099c(a<T> aVar) {
        this.onSubscribe = aVar;
    }

    public static <T> C1099c<T> amb(Iterable<? extends C1099c<? extends T>> iterable) {
        return create(pf50.m6839a(iterable));
    }

    public static <T1, T2, R> C1099c<R> combineLatest(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, x9j<? super T1, ? super T2, ? extends R> x9jVar) {
        return combineLatest(Arrays.asList(c1099c, c1099c2), kaj.m5631a(x9jVar));
    }

    public static <T, R> C1099c<R> combineLatestDelayError(Iterable<? extends C1099c<? extends T>> iterable, faj<? extends R> fajVar) {
        return create(new OnSubscribeCombineLatest(null, iterable, fajVar, rjd0.f6938g, true));
    }

    public static <T> C1099c<T> concat(C1099c<? extends C1099c<? extends T>> c1099c) {
        return (C1099c<T>) c1099c.concatMap(UtilityFunctions.m9944b());
    }

    public static <T> C1099c<T> concatDelayError(C1099c<? extends C1099c<? extends T>> c1099c) {
        return (C1099c<T>) c1099c.concatMapDelayError(UtilityFunctions.m9944b());
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2) {
        return concatEager(Arrays.asList(c1099c, c1099c2));
    }

    public static <T> C1099c<T> create(a<T> aVar) {
        return new C1099c<>(ejd0.m3862h(aVar));
    }

    public static <T> C1099c<T> defer(v9j<C1099c<T>> v9jVar) {
        return create(new tf50(v9jVar));
    }

    public static <T> C1099c<T> empty() {
        return EmptyObservableHolder.instance();
    }

    public static <T> C1099c<T> error(Throwable th) {
        return create(new jg50(th));
    }

    public static <T> C1099c<T> from(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return empty();
        }
        return length == 1 ? just(tArr[0]) : create(new OnSubscribeFromArray(tArr));
    }

    public static <T> C1099c<T> fromAsync(e30<AsyncEmitter<T>> e30Var, AsyncEmitter.BackpressureMode backpressureMode) {
        return create(new OnSubscribeFromAsync(e30Var, backpressureMode));
    }

    public static <T> C1099c<T> fromCallable(Callable<? extends T> callable) {
        return create(new yf50(callable));
    }

    public static C1099c<Long> interval(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        return create(new lg50(j, j2, timeUnit, bud0Var));
    }

    public static <T> C1099c<T> just(T t, T t2) {
        return from(new Object[]{t, t2});
    }

    private <R> C1099c<R> mapNotification(w9j<? super T, ? extends R> w9jVar, w9j<? super Throwable, ? extends R> w9jVar2, v9j<? extends R> v9jVar) {
        return lift(new lv50(w9jVar, w9jVar2, v9jVar));
    }

    public static <T> C1099c<T> merge(C1099c<? extends C1099c<? extends T>> c1099c) {
        return c1099c.getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) c1099c).m9936d(UtilityFunctions.m9944b()) : (C1099c<T>) c1099c.lift(OperatorMerge.m9838b(false));
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends C1099c<? extends T>> c1099c) {
        return (C1099c<T>) c1099c.lift(OperatorMerge.m9838b(true));
    }

    public static <T> C1099c<T> never() {
        return NeverObservableHolder.instance();
    }

    public static C1099c<Integer> range(int i, int i2) {
        if (i2 < 0) {
            ig3.a("Count can not be negative");
            return null;
        }
        if (i2 == 0) {
            return empty();
        }
        if (i <= PKIFailureInfo.systemUnavail - i2) {
            return i2 == 1 ? just(Integer.valueOf(i)) : create(new OnSubscribeRange(i, (i2 - 1) + i));
        }
        ig3.a("start + count can not exceed Integer.MAX_VALUE");
        return null;
    }

    public static <T> C1099c<Boolean> sequenceEqual(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2) {
        return sequenceEqual(c1099c, c1099c2, InternalObservableUtils.OBJECT_EQUALS);
    }

    public static <T> c4g0 subscribe(z3g0<? super T> z3g0Var, C1099c<T> c1099c) {
        if (z3g0Var == null) {
            ig3.a("subscriber can not be null");
            return null;
        }
        if (c1099c.onSubscribe == null) {
            qkq0.a("onSubscribe function can not be null.");
            return null;
        }
        z3g0Var.mo2918d();
        if (!(z3g0Var instanceof lod0)) {
            z3g0Var = new lod0(z3g0Var);
        }
        try {
            ejd0.m3870p(c1099c, c1099c.onSubscribe).call(z3g0Var);
            return ejd0.m3869o(z3g0Var);
        } catch (Throwable th) {
            f5f.m3964e(th);
            if (z3g0Var.isUnsubscribed()) {
                ejd0.m3864j(ejd0.m3867m(th));
            } else {
                try {
                    z3g0Var.onError(ejd0.m3867m(th));
                } catch (Throwable th2) {
                    f5f.m3964e(th2);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    ejd0.m3867m(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return h4g0.m4917d();
        }
    }

    public static <T> C1099c<T> switchOnNext(C1099c<? extends C1099c<? extends T>> c1099c) {
        return (C1099c<T>) c1099c.lift(gw50.m4862b(false));
    }

    public static <T> C1099c<T> switchOnNextDelayError(C1099c<? extends C1099c<? extends T>> c1099c) {
        return (C1099c<T>) c1099c.lift(gw50.m4862b(true));
    }

    @Deprecated
    public static C1099c<Long> timer(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, Schedulers.computation());
    }

    public static <T, Resource> C1099c<T> using(v9j<Resource> v9jVar, w9j<? super Resource, ? extends C1099c<? extends T>> w9jVar, e30<? super Resource> e30Var, boolean z) {
        return create(new OnSubscribeUsing(v9jVar, w9jVar, e30Var, z));
    }

    public static <R> C1099c<R> zip(Iterable<? extends C1099c<?>> iterable, faj<? extends R> fajVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends C1099c<?>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return just(arrayList.toArray(new C1099c[arrayList.size()])).lift(new OperatorZip(fajVar));
    }

    public final C1099c<Boolean> all(w9j<? super T, Boolean> w9jVar) {
        return lift(new ou50(w9jVar));
    }

    public final C1099c<T> ambWith(C1099c<? extends T> c1099c) {
        return amb(this, c1099c);
    }

    public final C1099c<T> asObservable() {
        return (C1099c<T>) lift(qu50.m7033b());
    }

    public final C1099c<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return (C1099c<List<T>>) lift(new tu50(j, j, timeUnit, i, Schedulers.computation()));
    }

    public final C1099c<T> cache() {
        return CachedObservable.m9786a(this);
    }

    public final C1099c<T> cacheWithInitialCapacity(int i) {
        return CachedObservable.m9787b(this, i);
    }

    public final <R> C1099c<R> cast(Class<R> cls) {
        return lift(new uu50(cls));
    }

    public final <R> C1099c<R> collect(v9j<R> v9jVar, f30<R, ? super T> f30Var) {
        return create(new rf50(this, v9jVar, f30Var));
    }

    public <R> C1099c<R> compose(d<? super T, ? extends R> dVar) {
        return (C1099c) dVar.call(this);
    }

    public final <R> C1099c<R> concatMap(w9j<? super T, ? extends C1099c<? extends R>> w9jVar) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m9936d(w9jVar) : create(new sf50(this, w9jVar, 2, 0));
    }

    public final <R> C1099c<R> concatMapDelayError(w9j<? super T, ? extends C1099c<? extends R>> w9jVar) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m9936d(w9jVar) : create(new sf50(this, w9jVar, 2, 2));
    }

    public final <R> C1099c<R> concatMapEager(w9j<? super T, ? extends C1099c<? extends R>> w9jVar, int i, int i2) {
        if (i < 1) {
            k250.m5546a("capacityHint > 0 required but it was ", i);
            return null;
        }
        if (i2 >= 1) {
            return lift(new OperatorEagerConcatMap(w9jVar, i, i2));
        }
        k250.m5546a("maxConcurrent > 0 required but it was ", i);
        return null;
    }

    public final <R> C1099c<R> concatMapIterable(w9j<? super T, ? extends Iterable<? extends R>> w9jVar) {
        return C1144a.m9906b(this, w9jVar, rjd0.f6938g);
    }

    public final C1099c<T> concatWith(C1099c<? extends T> c1099c) {
        return concat(this, c1099c);
    }

    public final C1099c<Boolean> contains(Object obj) {
        return exists(InternalObservableUtils.equalsWith(obj));
    }

    public final C1099c<Integer> count() {
        return reduce(0, InternalObservableUtils.COUNTER);
    }

    public final C1099c<Long> countLong() {
        return reduce(0L, InternalObservableUtils.LONG_COUNTER);
    }

    public final <U> C1099c<T> debounce(w9j<? super T, ? extends C1099c<U>> w9jVar) {
        return (C1099c<T>) lift(new yu50(w9jVar));
    }

    public final C1099c<T> defaultIfEmpty(T t) {
        return switchIfEmpty(just(t));
    }

    public final <U, V> C1099c<T> delay(v9j<? extends C1099c<U>> v9jVar, w9j<? super T, ? extends C1099c<V>> w9jVar) {
        return (C1099c<T>) delaySubscription(v9jVar).lift(new bv50(this, w9jVar));
    }

    public final C1099c<T> delaySubscription(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return create(new uf50(this, j, timeUnit, bud0Var));
    }

    public final <T2> C1099c<T2> dematerialize() {
        return (C1099c<T2>) lift(cv50.m3467b());
    }

    public final <U> C1099c<T> distinct(w9j<? super T, ? extends U> w9jVar) {
        return (C1099c<T>) lift(new dv50(w9jVar));
    }

    public final <U> C1099c<T> distinctUntilChanged(w9j<? super T, ? extends U> w9jVar) {
        return (C1099c<T>) lift(new ev50(w9jVar));
    }

    public final C1099c<T> doAfterTerminate(d30 d30Var) {
        return (C1099c<T>) lift(new fv50(d30Var));
    }

    public final C1099c<T> doOnCompleted(d30 d30Var) {
        return (C1099c<T>) lift(new gv50(new e40(i40.m5029a(), i40.m5029a(), d30Var)));
    }

    public final C1099c<T> doOnEach(e30<Notification<? super T>> e30Var) {
        return (C1099c<T>) lift(new gv50(new v30(e30Var)));
    }

    public final C1099c<T> doOnError(e30<Throwable> e30Var) {
        return (C1099c<T>) lift(new gv50(new e40(i40.m5029a(), e30Var, i40.m5029a())));
    }

    public final C1099c<T> doOnNext(e30<? super T> e30Var) {
        return (C1099c<T>) lift(new gv50(new e40(e30Var, i40.m5029a(), i40.m5029a())));
    }

    public final C1099c<T> doOnRequest(e30<Long> e30Var) {
        return (C1099c<T>) lift(new hv50(e30Var));
    }

    public final C1099c<T> doOnSubscribe(d30 d30Var) {
        return (C1099c<T>) lift(new iv50(d30Var));
    }

    public final C1099c<T> doOnTerminate(d30 d30Var) {
        return (C1099c<T>) lift(new gv50(new e40(i40.m5029a(), i40.m5030b(d30Var), d30Var)));
    }

    public final C1099c<T> doOnUnsubscribe(d30 d30Var) {
        return (C1099c<T>) lift(new jv50(d30Var));
    }

    public final C1099c<T> elementAt(int i) {
        return (C1099c<T>) lift(new OperatorElementAt(i));
    }

    public final C1099c<T> elementAtOrDefault(int i, T t) {
        return (C1099c<T>) lift(new OperatorElementAt(i, t));
    }

    public final C1099c<Boolean> exists(w9j<? super T, Boolean> w9jVar) {
        return lift(new pu50(w9jVar, false));
    }

    public <R> R extend(w9j<? super a<T>, ? extends R> w9jVar) {
        return w9jVar.call(new b(this));
    }

    public final C1099c<T> filter(w9j<? super T, Boolean> w9jVar) {
        return create(new xf50(this, w9jVar));
    }

    @Deprecated
    public final C1099c<T> finallyDo(d30 d30Var) {
        return (C1099c<T>) lift(new fv50(d30Var));
    }

    public final C1099c<T> first() {
        return take(1).single();
    }

    public final C1099c<T> firstOrDefault(T t) {
        return take(1).singleOrDefault(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C1099c<R> flatMap(w9j<? super T, ? extends C1099c<? extends R>> w9jVar) {
        return getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) this).m9936d(w9jVar) : merge(map(w9jVar));
    }

    public final <U, R> C1099c<R> flatMapIterable(w9j<? super T, ? extends Iterable<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar) {
        return flatMap(mv50.m6500b(w9jVar), x9jVar);
    }

    public final void forEach(e30<? super T> e30Var) {
        subscribe(e30Var);
    }

    public final <K, R> C1099c<ynk<K, R>> groupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends R> w9jVar2, w9j<e30<K>, Map<K, Object>> w9jVar3) {
        if (w9jVar3 != null) {
            return lift(new OperatorGroupBy(w9jVar, w9jVar2, w9jVar3));
        }
        jfd0.a("evictingMapFactory cannot be null");
        return null;
    }

    public final <T2, D1, D2, R> C1099c<R> groupJoin(C1099c<T2> c1099c, w9j<? super T, ? extends C1099c<D1>> w9jVar, w9j<? super T2, ? extends C1099c<D2>> w9jVar2, x9j<? super T, ? super C1099c<T2>, ? extends R> x9jVar) {
        return create(new zf50(this, c1099c, w9jVar, w9jVar2, x9jVar));
    }

    public final C1099c<T> ignoreElements() {
        return (C1099c<T>) lift(kv50.m5861b());
    }

    public final C1099c<Boolean> isEmpty() {
        return lift(InternalObservableUtils.IS_EMPTY);
    }

    public final <TRight, TLeftDuration, TRightDuration, R> C1099c<R> join(C1099c<TRight> c1099c, w9j<T, C1099c<TLeftDuration>> w9jVar, w9j<TRight, C1099c<TRightDuration>> w9jVar2, x9j<T, TRight, R> x9jVar) {
        return create(new ag50(this, c1099c, w9jVar, w9jVar2, x9jVar));
    }

    public final C1099c<T> last(w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).takeLast(1).single();
    }

    public final C1099c<T> lastOrDefault(T t, w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).takeLast(1).singleOrDefault(t);
    }

    public final <R> C1099c<R> lift(c<? extends R, ? super T> cVar) {
        return create(new bg50(this.onSubscribe, cVar));
    }

    public final C1099c<T> limit(int i) {
        return take(i);
    }

    public final <R> C1099c<R> map(w9j<? super T, ? extends R> w9jVar) {
        return create(new cg50(this, w9jVar));
    }

    public final C1099c<Notification<T>> materialize() {
        return (C1099c<Notification<T>>) lift(nv50.m6569b());
    }

    public final C1099c<T> mergeWith(C1099c<? extends T> c1099c) {
        return merge(this, c1099c);
    }

    public final C1099c<C1099c<T>> nest() {
        return just(this);
    }

    public final C1099c<T> observeOn(bud0 bud0Var, boolean z, int i) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m9937e(bud0Var) : (C1099c<T>) lift(new ov50(bud0Var, z, i));
    }

    public final <R> C1099c<R> ofType(Class<R> cls) {
        return filter(InternalObservableUtils.isInstanceOf(cls)).cast(cls);
    }

    public final C1099c<T> onBackpressureBuffer(long j) {
        return (C1099c<T>) lift(new pv50(j));
    }

    public final C1099c<T> onBackpressureDrop(e30<? super T> e30Var) {
        return (C1099c<T>) lift(new qv50(e30Var));
    }

    public final C1099c<T> onBackpressureLatest() {
        return (C1099c<T>) lift(OperatorOnBackpressureLatest.m9859b());
    }

    public final C1099c<T> onErrorResumeNext(w9j<Throwable, ? extends C1099c<? extends T>> w9jVar) {
        return (C1099c<T>) lift(new rv50(w9jVar));
    }

    public final C1099c<T> onErrorReturn(w9j<Throwable, ? extends T> w9jVar) {
        return (C1099c<T>) lift(rv50.m7395d(w9jVar));
    }

    public final C1099c<T> onExceptionResumeNext(C1099c<? extends T> c1099c) {
        return (C1099c<T>) lift(rv50.m7393b(c1099c));
    }

    public final C1099c<T> onTerminateDetach() {
        return create(new OnSubscribeDetach(this));
    }

    public final vv5<T> publish() {
        return OperatorPublish.m9862e(this);
    }

    public final C1099c<T> rebatchRequests(int i) {
        if (i > 0) {
            return (C1099c<T>) lift(ov50.m6729b(i));
        }
        k250.m5546a("n > 0 required but it was ", i);
        return null;
    }

    public final C1099c<T> reduce(x9j<T, T, T> x9jVar) {
        return create(new eg50(this, x9jVar));
    }

    public final C1099c<T> repeat() {
        return dg50.m3556b(this);
    }

    public final C1099c<T> repeatWhen(w9j<? super C1099c<? extends Void>, ? extends C1099c<?>> w9jVar, bud0 bud0Var) {
        return dg50.m3560f(this, InternalObservableUtils.createRepeatDematerializer(w9jVar), bud0Var);
    }

    public final <R> C1099c<R> replay(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        if (i >= 0) {
            return OperatorReplay.m9877j(InternalObservableUtils.createReplaySupplier(this, i, j, timeUnit, bud0Var), w9jVar);
        }
        ig3.a("bufferSize < 0");
        return null;
    }

    public final C1099c<T> retry(x9j<Integer, Throwable, Boolean> x9jVar) {
        return (C1099c<T>) nest().lift(new sv50(x9jVar));
    }

    public final C1099c<T> retryWhen(w9j<? super C1099c<? extends Throwable>, ? extends C1099c<?>> w9jVar) {
        return dg50.m3564j(this, InternalObservableUtils.createRetryDematerializer(w9jVar));
    }

    public final C1099c<T> sample(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new uv50(j, timeUnit, bud0Var));
    }

    public final C1099c<T> scan(x9j<T, T, T> x9jVar) {
        return (C1099c<T>) lift(new vv50(x9jVar));
    }

    public final C1099c<T> serialize() {
        return (C1099c<T>) lift(xv50.m8871b());
    }

    public final C1099c<T> share() {
        return publish().m8405d();
    }

    public final C1099c<T> single() {
        return (C1099c<T>) lift(yv50.m9236b());
    }

    public final C1099c<T> singleOrDefault(T t) {
        return (C1099c<T>) lift(new yv50(t));
    }

    public final C1099c<T> skip(int i) {
        return (C1099c<T>) lift(new zv50(i));
    }

    public final C1099c<T> skipLast(int i) {
        return (C1099c<T>) lift(new aw50(i));
    }

    public final <U> C1099c<T> skipUntil(C1099c<U> c1099c) {
        return (C1099c<T>) lift(new dw50(c1099c));
    }

    public final C1099c<T> skipWhile(w9j<? super T, Boolean> w9jVar) {
        return (C1099c<T>) lift(new ew50(ew50.m3947b(w9jVar)));
    }

    public final C1099c<T> startWith(Iterable<T> iterable) {
        return concat(from(iterable), this);
    }

    public final C1099c<T> subscribeOn(bud0 bud0Var) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).m9937e(bud0Var) : create(new fw50(this, bud0Var));
    }

    public final C1099c<T> switchIfEmpty(C1099c<? extends T> c1099c) {
        return (C1099c<T>) lift(new hw50(c1099c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C1099c<R> switchMap(w9j<? super T, ? extends C1099c<? extends R>> w9jVar) {
        return switchOnNext(map(w9jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C1099c<R> switchMapDelayError(w9j<? super T, ? extends C1099c<? extends R>> w9jVar) {
        return switchOnNextDelayError(map(w9jVar));
    }

    public final C1099c<T> take(int i) {
        return (C1099c<T>) lift(new iw50(i));
    }

    public final C1099c<T> takeFirst(w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).take(1);
    }

    public final C1099c<T> takeLast(int i) {
        if (i == 0) {
            return ignoreElements();
        }
        return i == 1 ? create(new ig50(this)) : (C1099c<T>) lift(new jw50(i));
    }

    public final C1099c<List<T>> takeLastBuffer(int i) {
        return takeLast(i).toList();
    }

    public final <E> C1099c<T> takeUntil(C1099c<? extends E> c1099c) {
        return (C1099c<T>) lift(new mw50(c1099c));
    }

    public final C1099c<T> takeWhile(w9j<? super T, Boolean> w9jVar) {
        return (C1099c<T>) lift(new ow50(w9jVar));
    }

    public final C1099c<T> throttleFirst(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new pw50(j, timeUnit, bud0Var));
    }

    public final C1099c<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final C1099c<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final C1099c<nqi0<T>> timeInterval(bud0 bud0Var) {
        return (C1099c<nqi0<T>>) lift(new qw50(bud0Var));
    }

    public final <U, V> C1099c<T> timeout(v9j<? extends C1099c<U>> v9jVar, w9j<? super T, ? extends C1099c<V>> w9jVar, C1099c<? extends T> c1099c) {
        if (w9jVar != null) {
            return (C1099c<T>) lift(new tw50(v9jVar, w9jVar, c1099c));
        }
        jfd0.a("timeoutSelector is null");
        return null;
    }

    public final C1099c<hri0<T>> timestamp(bud0 bud0Var) {
        return (C1099c<hri0<T>>) lift(new uw50(bud0Var));
    }

    public final y33<T> toBlocking() {
        return y33.m8881d(this);
    }

    public C1098b toCompletable() {
        return C1098b.m9763f(this);
    }

    public final C1099c<List<T>> toList() {
        return (C1099c<List<T>>) lift(xw50.m8873b());
    }

    public final <K> C1099c<Map<K, T>> toMap(w9j<? super T, ? extends K> w9jVar) {
        return (C1099c<Map<K, T>>) lift(new vw50(w9jVar, UtilityFunctions.m9944b()));
    }

    public final <K> C1099c<Map<K, Collection<T>>> toMultimap(w9j<? super T, ? extends K> w9jVar) {
        return (C1099c<Map<K, Collection<T>>>) lift(new ww50(w9jVar, UtilityFunctions.m9944b()));
    }

    public C1100d<T> toSingle() {
        return new C1100d<>(hg50.m4961b(this));
    }

    public final C1099c<List<T>> toSortedList() {
        return (C1099c<List<T>>) lift(new yw50(10));
    }

    public final c4g0 unsafeSubscribe(z3g0<? super T> z3g0Var) {
        try {
            z3g0Var.mo2918d();
            ejd0.m3870p(this, this.onSubscribe).call(z3g0Var);
            return ejd0.m3869o(z3g0Var);
        } catch (Throwable th) {
            f5f.m3964e(th);
            try {
                z3g0Var.onError(ejd0.m3867m(th));
                return h4g0.m4917d();
            } catch (Throwable th2) {
                f5f.m3964e(th2);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                ejd0.m3867m(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    public final C1099c<T> unsubscribeOn(bud0 bud0Var) {
        return (C1099c<T>) lift(new zw50(bud0Var));
    }

    public final C1099c<C1099c<T>> window(int i, int i2) {
        if (i <= 0) {
            k250.m5546a("count > 0 required but it was ", i);
            return null;
        }
        if (i2 > 0) {
            return (C1099c<C1099c<T>>) lift(new OperatorWindowWithSize(i, i2));
        }
        k250.m5546a("skip > 0 required but it was ", i2);
        return null;
    }

    public final <T1, T2, R> C1099c<R> withLatestFrom(C1099c<T1> c1099c, C1099c<T2> c1099c2, y9j<? super T, ? super T1, ? super T2, R> y9jVar) {
        return create(new fx50(this, new C1099c[]{c1099c, c1099c2}, null, kaj.m5632b(y9jVar)));
    }

    public final <T2, R> C1099c<R> zipWith(Iterable<? extends T2> iterable, x9j<? super T, ? super T2, ? extends R> x9jVar) {
        return lift(new gx50(iterable, x9jVar));
    }

    public final void forEach(e30<? super T> e30Var, e30<Throwable> e30Var2) {
        subscribe(e30Var, e30Var2);
    }

    @Deprecated
    public final C1099c<T> cache(int i) {
        return cacheWithInitialCapacity(i);
    }

    public final void forEach(e30<? super T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        subscribe(e30Var, e30Var2, d30Var);
    }

    public final <R> C1099c<R> publish(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar) {
        return OperatorPublish.m9863f(this, w9jVar);
    }

    public final C1099c<T> repeat(bud0 bud0Var) {
        return dg50.m3561g(this, bud0Var);
    }

    public final C1099c<T> throttleLast(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return sample(j, timeUnit, bud0Var);
    }

    public final C1099c<T> throttleWithTimeout(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return debounce(j, timeUnit, bud0Var);
    }

    public final C1099c<T> repeat(long j) {
        return dg50.m3557c(this, j);
    }

    public static <T> C1099c<Boolean> sequenceEqual(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, x9j<? super T, ? super T, Boolean> x9jVar) {
        return wv50.m8585b(c1099c, c1099c2, x9jVar);
    }

    public final C1099c<T> repeat(long j, bud0 bud0Var) {
        return dg50.m3558d(this, j, bud0Var);
    }

    public static <T> C1099c<T> amb(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2) {
        return create(pf50.m6840b(c1099c, c1099c2));
    }

    public static <T> C1099c<T> concat(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2) {
        return concat(just(c1099c, c1099c2));
    }

    public static <T> C1099c<T> concatDelayError(Iterable<? extends C1099c<? extends T>> iterable) {
        return concatDelayError(from(iterable));
    }

    public static <T> C1099c<T> just(T t) {
        return ScalarSynchronousObservable.m9933a(t);
    }

    public final <R> C1099c<R> flatMapIterable(w9j<? super T, ? extends Iterable<? extends R>> w9jVar, int i) {
        return C1144a.m9906b(this, w9jVar, i);
    }

    public final C1099c<T> repeatWhen(w9j<? super C1099c<? extends Void>, ? extends C1099c<?>> w9jVar) {
        return dg50.m3559e(this, InternalObservableUtils.createRepeatDematerializer(w9jVar));
    }

    public final C1099c<T> retryWhen(w9j<? super C1099c<? extends Throwable>, ? extends C1099c<?>> w9jVar, bud0 bud0Var) {
        return dg50.m3565k(this, InternalObservableUtils.createRetryDematerializer(w9jVar), bud0Var);
    }

    public final C1099c<T> single(w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).single();
    }

    public final C1099c<T> startWith(C1099c<T> c1099c) {
        return concat(c1099c, this);
    }

    public final C1099c<List<T>> takeLastBuffer(int i, long j, TimeUnit timeUnit) {
        return takeLast(i, j, timeUnit).toList();
    }

    public static <T> C1099c<T> amb(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3) {
        return create(pf50.m6841c(c1099c, c1099c2, c1099c3));
    }

    public static <T> C1099c<T> concat(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3) {
        return concat(just(c1099c, c1099c2, c1099c3));
    }

    public static <S, T> C1099c<T> create(SyncOnSubscribe<S, T> syncOnSubscribe) {
        return create((a) syncOnSubscribe);
    }

    public static <T> C1099c<T> just(T t, T t2, T t3) {
        return from(new Object[]{t, t2, t3});
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends C1099c<? extends T>> c1099c, int i) {
        return (C1099c<T>) c1099c.lift(OperatorMerge.m9839c(true, i));
    }

    public static <T, Resource> C1099c<T> using(v9j<Resource> v9jVar, w9j<? super Resource, ? extends C1099c<? extends T>> w9jVar, e30<? super Resource> e30Var) {
        return using(v9jVar, w9jVar, e30Var, false);
    }

    public final C1099c<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<T> distinct() {
        return (C1099c<T>) lift(dv50.m3739b());
    }

    public final C1099c<T> distinctUntilChanged() {
        return (C1099c<T>) lift(ev50.m3944c());
    }

    public final C1099c<T> first(w9j<? super T, Boolean> w9jVar) {
        return takeFirst(w9jVar).single();
    }

    public final C1099c<T> firstOrDefault(T t, w9j<? super T, Boolean> w9jVar) {
        return takeFirst(w9jVar).singleOrDefault(t);
    }

    public final <R> C1099c<R> flatMapIterable(w9j<? super T, ? extends Iterable<? extends R>> w9jVar) {
        return flatMapIterable(w9jVar, rjd0.f6938g);
    }

    public final C1099c<T> onBackpressureBuffer() {
        return (C1099c<T>) lift(pv50.m6923b());
    }

    public final C1099c<T> onBackpressureDrop() {
        return (C1099c<T>) lift(qv50.m7042b());
    }

    public final C1099c<T> onErrorResumeNext(C1099c<? extends T> c1099c) {
        return (C1099c<T>) lift(rv50.m7394c(c1099c));
    }

    public final <R> C1099c<R> reduce(R r, x9j<R, ? super T, R> x9jVar) {
        return create(new fg50(this, r, x9jVar));
    }

    public final C1099c<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, Schedulers.computation());
    }

    public final <R> C1099c<R> scan(R r, x9j<R, ? super T, R> x9jVar) {
        return lift(new vv50(r, x9jVar));
    }

    public final C1099c<T> singleOrDefault(T t, w9j<? super T, Boolean> w9jVar) {
        return filter(w9jVar).singleOrDefault(t);
    }

    public final C1099c<T> skip(long j, TimeUnit timeUnit) {
        return skip(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<T> startWith(T t) {
        return concat(just(t), this);
    }

    public final C1099c<T> take(long j, TimeUnit timeUnit) {
        return take(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<List<T>> takeLastBuffer(int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return takeLast(i, j, timeUnit, bud0Var).toList();
    }

    public final C1099c<T> takeUntil(w9j<? super T, Boolean> w9jVar) {
        return (C1099c<T>) lift(new nw50(w9jVar));
    }

    public final C1099c<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<nqi0<T>> timeInterval() {
        return timeInterval(Schedulers.computation());
    }

    public final C1099c<hri0<T>> timestamp() {
        return timestamp(Schedulers.computation());
    }

    public final <T2, R> C1099c<R> zipWith(C1099c<? extends T2> c1099c, x9j<? super T, ? super T2, ? extends R> x9jVar) {
        return zip(this, c1099c, x9jVar);
    }

    public static <T> C1099c<T> amb(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4) {
        return create(pf50.m6842d(c1099c, c1099c2, c1099c3, c1099c4));
    }

    public static <T> C1099c<T> concat(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4) {
        return concat(just(c1099c, c1099c2, c1099c3, c1099c4));
    }

    public static <S, T> C1099c<T> create(l21<S, T> l21Var) {
        return create((a) l21Var);
    }

    public static <T> C1099c<T> just(T t, T t2, T t3, T t4) {
        return from(new Object[]{t, t2, t3, t4});
    }

    public static <T> C1099c<T> mergeDelayError(Iterable<? extends C1099c<? extends T>> iterable) {
        return mergeDelayError(from(iterable));
    }

    public final C1099c<T> debounce(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new zu50(j, timeUnit, bud0Var));
    }

    public final C1099c<T> distinctUntilChanged(x9j<? super T, ? super T, Boolean> x9jVar) {
        return (C1099c<T>) lift(new ev50(x9jVar));
    }

    public final <U, R> C1099c<R> flatMapIterable(w9j<? super T, ? extends Iterable<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar, int i) {
        return flatMap(mv50.m6500b(w9jVar), x9jVar, i);
    }

    public final C1099c<T> onBackpressureBuffer(long j, d30 d30Var) {
        return (C1099c<T>) lift(new pv50(j, d30Var));
    }

    public final <U> C1099c<T> sample(C1099c<U> c1099c) {
        return (C1099c<T>) lift(new tv50(c1099c));
    }

    public final C1099c<T> skip(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new cw50(j, timeUnit, bud0Var));
    }

    public final C1099c<T> skipLast(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new bw50(j, timeUnit, bud0Var));
    }

    public final C1099c<T> startWith(T t, T t2) {
        return concat(just(t, t2), this);
    }

    public final C1099c<T> take(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new lw50(j, timeUnit, bud0Var));
    }

    public final C1099c<List<T>> takeLastBuffer(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit).toList();
    }

    public static <T> C1099c<T> amb(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5) {
        return create(pf50.m6843e(c1099c, c1099c2, c1099c3, c1099c4, c1099c5));
    }

    public static <T> C1099c<T> concat(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5) {
        return concat(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5));
    }

    public static <T> C1099c<T> just(T t, T t2, T t3, T t4, T t5) {
        return from(new Object[]{t, t2, t3, t4, t5});
    }

    public static <T> C1099c<T> mergeDelayError(Iterable<? extends C1099c<? extends T>> iterable, int i) {
        return mergeDelayError(from(iterable), i);
    }

    @Deprecated
    public static C1099c<Long> timer(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        return interval(j, j2, timeUnit, bud0Var);
    }

    public final C1099c<T> onBackpressureBuffer(long j, d30 d30Var, C1097a.d dVar) {
        return (C1099c<T>) lift(new pv50(j, d30Var, dVar));
    }

    public final C1099c<T> startWith(T t, T t2, T t3) {
        return concat(just(t, t2, t3), this);
    }

    public final C1099c<List<T>> takeLastBuffer(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return takeLast(j, timeUnit, bud0Var).toList();
    }

    public final C1099c<List<T>> toSortedList(x9j<? super T, ? super T, Integer> x9jVar) {
        return (C1099c<List<T>>) lift(new yw50(x9jVar, 10));
    }

    public static <T> C1099c<T> amb(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6) {
        return create(pf50.m6844f(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6));
    }

    public static <T> C1099c<T> concat(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6) {
        return concat(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3) {
        return concatEager(Arrays.asList(c1099c, c1099c2, c1099c3));
    }

    public static <T> C1099c<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        return from(new Object[]{t, t2, t3, t4, t5, t6});
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2) {
        return mergeDelayError(just(c1099c, c1099c2));
    }

    public static C1099c<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<T> startWith(T t, T t2, T t3, T t4) {
        return concat(just(t, t2, t3, t4), this);
    }

    public final C1099c<List<T>> toSortedList(int i) {
        return (C1099c<List<T>>) lift(new yw50(i));
    }

    public static <T> C1099c<T> amb(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7) {
        return create(pf50.m6845g(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7));
    }

    public static <T> C1099c<T> concat(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7) {
        return concat(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4) {
        return concatEager(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4));
    }

    public static C1099c<Long> interval(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return interval(j, j, timeUnit, bud0Var);
    }

    public static <T> C1099c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7});
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3) {
        return mergeDelayError(just(c1099c, c1099c2, c1099c3));
    }

    public static C1099c<Long> timer(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return create(new kg50(j, timeUnit, bud0Var));
    }

    public final <U> C1099c<T> delay(w9j<? super T, ? extends C1099c<U>> w9jVar) {
        return (C1099c<T>) lift(new bv50(this, w9jVar));
    }

    public final C1099c<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<T> last() {
        return takeLast(1).single();
    }

    public final C1099c<T> lastOrDefault(T t) {
        return takeLast(1).singleOrDefault(t);
    }

    public final C1099c<T> retry(long j) {
        return dg50.m3563i(this, j);
    }

    public final C1099c<T> startWith(T t, T t2, T t3, T t4, T t5) {
        return concat(just(t, t2, t3, t4, t5), this);
    }

    public final <K, V> C1099c<Map<K, V>> toMap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        return (C1099c<Map<K, V>>) lift(new vw50(w9jVar, w9jVar2));
    }

    public final <K, V> C1099c<Map<K, Collection<V>>> toMultimap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        return (C1099c<Map<K, Collection<V>>>) lift(new ww50(w9jVar, w9jVar2));
    }

    public final C1099c<List<T>> toSortedList(x9j<? super T, ? super T, Integer> x9jVar, int i) {
        return (C1099c<List<T>>) lift(new yw50(x9jVar, i));
    }

    public static <T> C1099c<T> amb(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8) {
        return create(pf50.m6846h(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8));
    }

    public static <T> C1099c<T> concat(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8) {
        return concat(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5) {
        return concatEager(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5));
    }

    public static C1099c<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, Schedulers.computation());
    }

    public static <T> C1099c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8});
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4) {
        return mergeDelayError(just(c1099c, c1099c2, c1099c3, c1099c4));
    }

    public final C1099c<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.computation());
    }

    public final <U> C1099c<T> delaySubscription(v9j<? extends C1099c<U>> v9jVar) {
        return create(new wf50(this, v9jVar));
    }

    public final C1099c<T> doOnEach(m250<? super T> m250Var) {
        return (C1099c<T>) lift(new gv50(m250Var));
    }

    public final C1099c<T> retry() {
        return dg50.m3562h(this);
    }

    public final C1099c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6) {
        return concat(just(t, t2, t3, t4, t5, t6), this);
    }

    public final <K, V> C1099c<Map<K, V>> toMap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, V>> v9jVar) {
        return (C1099c<Map<K, V>>) lift(new vw50(w9jVar, w9jVar2, v9jVar));
    }

    public final <K, V> C1099c<Map<K, Collection<V>>> toMultimap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, Collection<V>>> v9jVar) {
        return (C1099c<Map<K, Collection<V>>>) lift(new ww50(w9jVar, w9jVar2, v9jVar));
    }

    public static <T> C1099c<T> amb(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8, C1099c<? extends T> c1099c9) {
        return create(pf50.m6847i(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8, c1099c9));
    }

    public static <T> C1099c<T> concat(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8, C1099c<? extends T> c1099c9) {
        return concat(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8, c1099c9));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6) {
        return concatEager(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6));
    }

    public static C1099c<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, Schedulers.computation());
    }

    public static <T> C1099c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9});
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5) {
        return mergeDelayError(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5));
    }

    public final C1099c<T> delay(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new av50(j, timeUnit, bud0Var));
    }

    public final <U> C1099c<T> delaySubscription(C1099c<U> c1099c) {
        c1099c.getClass();
        return create(new vf50(this, c1099c));
    }

    public final C1099c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return concat(just(t, t2, t3, t4, t5, t6, t7), this);
    }

    public final <K, V> C1099c<Map<K, Collection<V>>> toMultimap(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, v9j<? extends Map<K, Collection<V>>> v9jVar, w9j<? super K, ? extends Collection<V>> w9jVar3) {
        return (C1099c<Map<K, Collection<V>>>) lift(new ww50(w9jVar, w9jVar2, v9jVar, w9jVar3));
    }

    public static <T1, T2, T3, R> C1099c<R> combineLatest(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, y9j<? super T1, ? super T2, ? super T3, ? extends R> y9jVar) {
        return combineLatest(Arrays.asList(c1099c, c1099c2, c1099c3), kaj.m5632b(y9jVar));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7) {
        return concatEager(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7));
    }

    public static <T> C1099c<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return from(new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9, t10});
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6) {
        return mergeDelayError(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6));
    }

    public final C1099c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return concat(just(t, t2, t3, t4, t5, t6, t7, t8), this);
    }

    public static <T1, T2, T3, T4, R> C1099c<R> combineLatest(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, z9j<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> z9jVar) {
        return combineLatest(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4), kaj.m5633c(z9jVar));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8) {
        return concatEager(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8));
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7) {
        return mergeDelayError(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7));
    }

    public final C1099c<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final C1099c<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return concat(just(t, t2, t3, t4, t5, t6, t7, t8, t9), this);
    }

    public static <T1, T2, T3, T4, T5, R> C1099c<R> combineLatest(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, aaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> aajVar) {
        return combineLatest(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5), kaj.m5634d(aajVar));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8, C1099c<? extends T> c1099c9) {
        return concatEager(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8, c1099c9));
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8) {
        return mergeDelayError(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8));
    }

    public final C1099c<List<T>> buffer(int i, int i2) {
        return (C1099c<List<T>>) lift(new OperatorBufferWithSize(i, i2));
    }

    public final <K, R> C1099c<ynk<K, R>> groupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends R> w9jVar2) {
        return lift(new OperatorGroupBy(w9jVar, w9jVar2));
    }

    public final <U, V> C1099c<T> timeout(v9j<? extends C1099c<U>> v9jVar, w9j<? super T, ? extends C1099c<V>> w9jVar) {
        return timeout(v9jVar, w9jVar, (C1099c) null);
    }

    public final <U, R> C1099c<R> withLatestFrom(C1099c<? extends U> c1099c, x9j<? super T, ? super U, ? extends R> x9jVar) {
        return lift(new ex50(c1099c, x9jVar));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C1099c<R> combineLatest(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, C1099c<? extends T6> c1099c6, baj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> bajVar) {
        return combineLatest(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6), kaj.m5635e(bajVar));
    }

    public static <T> C1099c<T> concatEager(Iterable<? extends C1099c<? extends T>> iterable) {
        return from(iterable).concatMapEager(UtilityFunctions.m9944b());
    }

    public static <T> C1099c<T> mergeDelayError(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8, C1099c<? extends T> c1099c9) {
        return mergeDelayError(just(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8, c1099c9));
    }

    public final C1099c<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return buffer(j, j2, timeUnit, Schedulers.computation());
    }

    public final <K> C1099c<ynk<K, T>> groupBy(w9j<? super T, ? extends K> w9jVar) {
        return (C1099c<ynk<K, T>>) lift(new OperatorGroupBy(w9jVar));
    }

    public final <V> C1099c<T> timeout(w9j<? super T, ? extends C1099c<V>> w9jVar) {
        return timeout((v9j) null, w9jVar, (C1099c) null);
    }

    public final <T1, T2, T3, R> C1099c<R> withLatestFrom(C1099c<T1> c1099c, C1099c<T2> c1099c2, C1099c<T3> c1099c3, z9j<? super T, ? super T1, ? super T2, ? super T3, R> z9jVar) {
        return create(new fx50(this, new C1099c[]{c1099c, c1099c2, c1099c3}, null, kaj.m5633c(z9jVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C1099c<R> combineLatest(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, C1099c<? extends T6> c1099c6, C1099c<? extends T7> c1099c7, caj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> cajVar) {
        return combineLatest(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7), kaj.m5636f(cajVar));
    }

    public static <T> C1099c<T> concatEager(Iterable<? extends C1099c<? extends T>> iterable, int i) {
        return from(iterable).concatMapEager(UtilityFunctions.m9944b(), i);
    }

    public final C1099c<List<T>> buffer(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<List<T>>) lift(new tu50(j, j2, timeUnit, Integer.MAX_VALUE, bud0Var));
    }

    public final C1099c<T> observeOn(bud0 bud0Var, int i) {
        return observeOn(bud0Var, false, i);
    }

    public final <V> C1099c<T> timeout(w9j<? super T, ? extends C1099c<V>> w9jVar, C1099c<? extends T> c1099c) {
        return timeout((v9j) null, w9jVar, c1099c);
    }

    public final <T1, T2, T3, T4, R> C1099c<R> withLatestFrom(C1099c<T1> c1099c, C1099c<T2> c1099c2, C1099c<T3> c1099c3, C1099c<T4> c1099c4, aaj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> aajVar) {
        return create(new fx50(this, new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4}, null, kaj.m5634d(aajVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C1099c<R> combineLatest(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, C1099c<? extends T6> c1099c6, C1099c<? extends T7> c1099c7, C1099c<? extends T8> c1099c8, daj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> dajVar) {
        return combineLatest(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8), kaj.m5637g(dajVar));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends C1099c<? extends T>> c1099c) {
        return (C1099c<T>) c1099c.concatMapEager(UtilityFunctions.m9944b());
    }

    public final C1099c<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, Integer.MAX_VALUE, Schedulers.computation());
    }

    public final C1099c<T> observeOn(bud0 bud0Var, boolean z) {
        return observeOn(bud0Var, z, rjd0.f6938g);
    }

    public final C1099c<T> timeout(long j, TimeUnit timeUnit) {
        return timeout(j, timeUnit, null, Schedulers.computation());
    }

    public final <T1, T2, T3, T4, T5, R> C1099c<R> withLatestFrom(C1099c<T1> c1099c, C1099c<T2> c1099c2, C1099c<T1> c1099c3, C1099c<T2> c1099c4, C1099c<T1> c1099c5, baj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, R> bajVar) {
        return create(new fx50(this, new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5}, null, kaj.m5635e(bajVar)));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C1099c<R> combineLatest(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, C1099c<? extends T6> c1099c6, C1099c<? extends T7> c1099c7, C1099c<? extends T8> c1099c8, C1099c<? extends T9> c1099c9, eaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> eajVar) {
        return combineLatest(Arrays.asList(c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8, c1099c9), kaj.m5638h(eajVar));
    }

    public static <T> C1099c<T> concatEager(C1099c<? extends C1099c<? extends T>> c1099c, int i) {
        return (C1099c<T>) c1099c.concatMapEager(UtilityFunctions.m9944b(), i);
    }

    public final <TClosing> C1099c<List<T>> buffer(v9j<? extends C1099c<? extends TClosing>> v9jVar) {
        return (C1099c<List<T>>) lift(new ru50(v9jVar, 16));
    }

    public final C1099c<T> observeOn(bud0 bud0Var) {
        return observeOn(bud0Var, rjd0.f6938g);
    }

    public final <R> C1099c<R> replay(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar) {
        return OperatorReplay.m9877j(InternalObservableUtils.createReplaySupplier(this), w9jVar);
    }

    public final C1099c<T> timeout(long j, TimeUnit timeUnit, C1099c<? extends T> c1099c) {
        return timeout(j, timeUnit, c1099c, Schedulers.computation());
    }

    public final <T1, T2, T3, T4, T5, T6, R> C1099c<R> withLatestFrom(C1099c<T1> c1099c, C1099c<T2> c1099c2, C1099c<T1> c1099c3, C1099c<T2> c1099c4, C1099c<T1> c1099c5, C1099c<T2> c1099c6, caj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, R> cajVar) {
        return create(new fx50(this, new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6}, null, kaj.m5636f(cajVar)));
    }

    public static <T, R> C1099c<R> combineLatest(List<? extends C1099c<? extends T>> list, faj<? extends R> fajVar) {
        return create(new OnSubscribeCombineLatest(list, fajVar));
    }

    public final C1099c<List<T>> buffer(long j, TimeUnit timeUnit, int i, bud0 bud0Var) {
        return (C1099c<List<T>>) lift(new tu50(j, j, timeUnit, i, bud0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C1099c<R> flatMap(w9j<? super T, ? extends C1099c<? extends R>> w9jVar, int i) {
        if (getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) this).m9936d(w9jVar);
        }
        return merge(map(w9jVar), i);
    }

    public final <R> C1099c<R> replay(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, int i) {
        return OperatorReplay.m9877j(InternalObservableUtils.createReplaySupplier(this, i), w9jVar);
    }

    public final C1099c<T> timeout(long j, TimeUnit timeUnit, C1099c<? extends T> c1099c, bud0 bud0Var) {
        return (C1099c<T>) lift(new rw50(j, timeUnit, c1099c, bud0Var));
    }

    public final <T1, T2, T3, T4, T5, T6, T7, R> C1099c<R> withLatestFrom(C1099c<T1> c1099c, C1099c<T2> c1099c2, C1099c<T1> c1099c3, C1099c<T2> c1099c4, C1099c<T1> c1099c5, C1099c<T2> c1099c6, C1099c<T1> c1099c7, daj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, R> dajVar) {
        return create(new fx50(this, new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7}, null, kaj.m5637g(dajVar)));
    }

    public static <T, R> C1099c<R> combineLatest(Iterable<? extends C1099c<? extends T>> iterable, faj<? extends R> fajVar) {
        return create(new OnSubscribeCombineLatest(iterable, fajVar));
    }

    public final C1099c<List<T>> buffer(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return buffer(j, j, timeUnit, bud0Var);
    }

    public final <R> C1099c<R> replay(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, int i, long j, TimeUnit timeUnit) {
        return replay(w9jVar, i, j, timeUnit, Schedulers.computation());
    }

    public final C1099c<T> timeout(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return timeout(j, timeUnit, null, bud0Var);
    }

    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> C1099c<R> withLatestFrom(C1099c<T1> c1099c, C1099c<T2> c1099c2, C1099c<T1> c1099c3, C1099c<T2> c1099c4, C1099c<T1> c1099c5, C1099c<T2> c1099c6, C1099c<T1> c1099c7, C1099c<T2> c1099c8, eaj<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, R> eajVar) {
        return create(new fx50(this, new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8}, null, kaj.m5638h(eajVar)));
    }

    public final <TOpening, TClosing> C1099c<List<T>> buffer(C1099c<? extends TOpening> c1099c, w9j<? super TOpening, ? extends C1099c<? extends TClosing>> w9jVar) {
        return (C1099c<List<T>>) lift(new su50(c1099c, w9jVar));
    }

    public final vv5<T> replay() {
        return OperatorReplay.m9872e(this);
    }

    public final <R> C1099c<R> withLatestFrom(C1099c<?>[] c1099cArr, faj<R> fajVar) {
        return create(new fx50(this, c1099cArr, null, fajVar));
    }

    public final <B> C1099c<List<T>> buffer(C1099c<B> c1099c) {
        return buffer(c1099c, 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C1099c<R> flatMap(w9j<? super T, ? extends C1099c<? extends R>> w9jVar, w9j<? super Throwable, ? extends C1099c<? extends R>> w9jVar2, v9j<? extends C1099c<? extends R>> v9jVar) {
        return merge(mapNotification(w9jVar, w9jVar2, v9jVar));
    }

    public final <R> C1099c<R> replay(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, int i, bud0 bud0Var) {
        return OperatorReplay.m9877j(InternalObservableUtils.createReplaySupplier(this, i), InternalObservableUtils.createReplaySelectorAndObserveOn(w9jVar, bud0Var));
    }

    public final <R> C1099c<R> withLatestFrom(Iterable<C1099c<?>> iterable, faj<R> fajVar) {
        return create(new fx50(this, null, iterable, fajVar));
    }

    public final <B> C1099c<List<T>> buffer(C1099c<B> c1099c, int i) {
        return (C1099c<List<T>>) lift(new ru50(c1099c, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C1099c<R> flatMap(w9j<? super T, ? extends C1099c<? extends R>> w9jVar, w9j<? super Throwable, ? extends C1099c<? extends R>> w9jVar2, v9j<? extends C1099c<? extends R>> v9jVar, int i) {
        return merge(mapNotification(w9jVar, w9jVar2, v9jVar), i);
    }

    public final <R> C1099c<R> replay(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, long j, TimeUnit timeUnit) {
        return replay(w9jVar, j, timeUnit, Schedulers.computation());
    }

    public final C1099c<C1099c<T>> window(int i) {
        return window(i, i);
    }

    public static <T> C1099c<T> from(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return create(mg50.m6395b(future, j, timeUnit));
    }

    public static <T> C1099c<T> merge(Iterable<? extends C1099c<? extends T>> iterable, int i) {
        return merge(from(iterable), i);
    }

    public final <R> C1099c<R> concatMapEager(w9j<? super T, ? extends C1099c<? extends R>> w9jVar, int i) {
        if (i >= 1) {
            return lift(new OperatorEagerConcatMap(w9jVar, i, Integer.MAX_VALUE));
        }
        k250.m5546a("capacityHint > 0 required but it was ", i);
        return null;
    }

    public final <U, R> C1099c<R> flatMap(w9j<? super T, ? extends C1099c<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar) {
        return merge(lift(new mv50(w9jVar, x9jVar)));
    }

    public final <R> C1099c<R> replay(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return OperatorReplay.m9877j(InternalObservableUtils.createReplaySupplier(this, j, timeUnit, bud0Var), w9jVar);
    }

    public final <TClosing> C1099c<C1099c<T>> window(v9j<? extends C1099c<? extends TClosing>> v9jVar) {
        return (C1099c<C1099c<T>>) lift(new bx50(v9jVar));
    }

    public static <T> C1099c<T> from(Future<? extends T> future, bud0 bud0Var) {
        return create(mg50.m6394a(future)).subscribeOn(bud0Var);
    }

    public static <T> C1099c<T> merge(Iterable<? extends C1099c<? extends T>> iterable) {
        return merge(from(iterable));
    }

    public final <U, R> C1099c<R> flatMap(w9j<? super T, ? extends C1099c<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar, int i) {
        return merge(lift(new mv50(w9jVar, x9jVar)), i);
    }

    public final <R> C1099c<R> replay(w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, bud0 bud0Var) {
        return OperatorReplay.m9877j(InternalObservableUtils.createReplaySupplier(this), InternalObservableUtils.createReplaySelectorAndObserveOn(w9jVar, bud0Var));
    }

    public final C1099c<T> takeLast(int i, long j, TimeUnit timeUnit) {
        return takeLast(i, j, timeUnit, Schedulers.computation());
    }

    public final C1099c<C1099c<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, Integer.MAX_VALUE, Schedulers.computation());
    }

    public static <T> C1099c<T> merge(C1099c<? extends C1099c<? extends T>> c1099c, int i) {
        if (c1099c.getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) c1099c).m9936d(UtilityFunctions.m9944b());
        }
        return (C1099c<T>) c1099c.lift(OperatorMerge.m9839c(false, i));
    }

    public final <R> C1099c<R> concatMapEager(w9j<? super T, ? extends C1099c<? extends R>> w9jVar) {
        return concatMapEager(w9jVar, rjd0.f6938g);
    }

    public final vv5<T> replay(int i) {
        return OperatorReplay.m9873f(this, i);
    }

    public final C1099c<T> takeLast(int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new kw50(i, j, timeUnit, bud0Var));
    }

    public final C1099c<C1099c<T>> window(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        return window(j, j2, timeUnit, Integer.MAX_VALUE, bud0Var);
    }

    public static <T> C1099c<T> from(Iterable<? extends T> iterable) {
        return create(new OnSubscribeFromIterable(iterable));
    }

    public final vv5<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, Schedulers.computation());
    }

    public final C1099c<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<C1099c<T>> window(long j, long j2, TimeUnit timeUnit, int i, bud0 bud0Var) {
        return (C1099c<C1099c<T>>) lift(new dx50(j, j2, timeUnit, i, bud0Var));
    }

    public static <T> C1099c<T> from(Future<? extends T> future) {
        return create(mg50.m6394a(future));
    }

    public final vv5<T> replay(int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        if (i >= 0) {
            return OperatorReplay.m9875h(this, j, timeUnit, bud0Var, i);
        }
        ig3.a("bufferSize < 0");
        return null;
    }

    public final C1099c<T> takeLast(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return (C1099c<T>) lift(new kw50(j, timeUnit, bud0Var));
    }

    public final C1099c<C1099c<T>> window(long j, TimeUnit timeUnit) {
        return window(j, j, timeUnit, Schedulers.computation());
    }

    public static <T> C1099c<T> merge(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2) {
        return merge(new C1099c[]{c1099c, c1099c2});
    }

    public final C1099c<C1099c<T>> window(long j, TimeUnit timeUnit, int i) {
        return window(j, timeUnit, i, Schedulers.computation());
    }

    public static <T> C1099c<T> merge(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3) {
        return merge(new C1099c[]{c1099c, c1099c2, c1099c3});
    }

    public final vv5<T> replay(int i, bud0 bud0Var) {
        return OperatorReplay.m9878k(replay(i), bud0Var);
    }

    public final C1099c<C1099c<T>> window(long j, TimeUnit timeUnit, int i, bud0 bud0Var) {
        return window(j, j, timeUnit, i, bud0Var);
    }

    public static <T> C1099c<T> merge(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4) {
        return merge(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4});
    }

    public final vv5<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, Schedulers.computation());
    }

    public final C1099c<C1099c<T>> window(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return window(j, timeUnit, Integer.MAX_VALUE, bud0Var);
    }

    public static <T> C1099c<T> merge(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5) {
        return merge(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5});
    }

    public final vv5<T> replay(long j, TimeUnit timeUnit, bud0 bud0Var) {
        return OperatorReplay.m9874g(this, j, timeUnit, bud0Var);
    }

    public final <TOpening, TClosing> C1099c<C1099c<T>> window(C1099c<? extends TOpening> c1099c, w9j<? super TOpening, ? extends C1099c<? extends TClosing>> w9jVar) {
        return (C1099c<C1099c<T>>) lift(new cx50(c1099c, w9jVar));
    }

    public static <T> C1099c<T> merge(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6) {
        return merge(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6});
    }

    public final vv5<T> replay(bud0 bud0Var) {
        return OperatorReplay.m9878k(replay(), bud0Var);
    }

    public final <U> C1099c<C1099c<T>> window(C1099c<U> c1099c) {
        return (C1099c<C1099c<T>>) lift(new ax50(c1099c));
    }

    public static <T> C1099c<T> merge(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7) {
        return merge(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7});
    }

    public static <T> C1099c<T> merge(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8) {
        return merge(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8});
    }

    public static <T> C1099c<T> merge(C1099c<? extends T> c1099c, C1099c<? extends T> c1099c2, C1099c<? extends T> c1099c3, C1099c<? extends T> c1099c4, C1099c<? extends T> c1099c5, C1099c<? extends T> c1099c6, C1099c<? extends T> c1099c7, C1099c<? extends T> c1099c8, C1099c<? extends T> c1099c9) {
        return merge(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8, c1099c9});
    }

    public static <T> C1099c<T> merge(C1099c<? extends T>[] c1099cArr) {
        return merge(from(c1099cArr));
    }

    public static <T> C1099c<T> merge(C1099c<? extends T>[] c1099cArr, int i) {
        return merge(from(c1099cArr), i);
    }

    public static <R> C1099c<R> zip(C1099c<?>[] c1099cArr, faj<? extends R> fajVar) {
        return just(c1099cArr).lift(new OperatorZip(fajVar));
    }

    public static <R> C1099c<R> zip(C1099c<? extends C1099c<?>> c1099c, faj<? extends R> fajVar) {
        return c1099c.toList().map(InternalObservableUtils.TO_ARRAY).lift(new OperatorZip(fajVar));
    }

    public static C1099c<Integer> range(int i, int i2, bud0 bud0Var) {
        return range(i, i2).subscribeOn(bud0Var);
    }

    public static <T1, T2, R> C1099c<R> zip(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, x9j<? super T1, ? super T2, ? extends R> x9jVar) {
        return just(new C1099c[]{c1099c, c1099c2}).lift(new OperatorZip(x9jVar));
    }

    public static <T1, T2, T3, R> C1099c<R> zip(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, y9j<? super T1, ? super T2, ? super T3, ? extends R> y9jVar) {
        return just(new C1099c[]{c1099c, c1099c2, c1099c3}).lift(new OperatorZip(y9jVar));
    }

    public static <T1, T2, T3, T4, R> C1099c<R> zip(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, z9j<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> z9jVar) {
        return just(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4}).lift(new OperatorZip(z9jVar));
    }

    public static <T1, T2, T3, T4, T5, R> C1099c<R> zip(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, aaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> aajVar) {
        return just(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5}).lift(new OperatorZip(aajVar));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C1099c<R> zip(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, C1099c<? extends T6> c1099c6, baj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> bajVar) {
        return just(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6}).lift(new OperatorZip(bajVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C1099c<R> zip(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, C1099c<? extends T6> c1099c6, C1099c<? extends T7> c1099c7, caj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> cajVar) {
        return just(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7}).lift(new OperatorZip(cajVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C1099c<R> zip(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, C1099c<? extends T6> c1099c6, C1099c<? extends T7> c1099c7, C1099c<? extends T8> c1099c8, daj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> dajVar) {
        return just(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8}).lift(new OperatorZip(dajVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C1099c<R> zip(C1099c<? extends T1> c1099c, C1099c<? extends T2> c1099c2, C1099c<? extends T3> c1099c3, C1099c<? extends T4> c1099c4, C1099c<? extends T5> c1099c5, C1099c<? extends T6> c1099c6, C1099c<? extends T7> c1099c7, C1099c<? extends T8> c1099c8, C1099c<? extends T9> c1099c9, eaj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> eajVar) {
        return just(new C1099c[]{c1099c, c1099c2, c1099c3, c1099c4, c1099c5, c1099c6, c1099c7, c1099c8, c1099c9}).lift(new OperatorZip(eajVar));
    }

    public final c4g0 subscribe(e30<? super T> e30Var) {
        if (e30Var != null) {
            return subscribe((z3g0) new e40(e30Var, InternalObservableUtils.ERROR_NOT_IMPLEMENTED, i40.m5029a()));
        }
        ig3.a("onNext can not be null");
        return null;
    }

    public final c4g0 subscribe(e30<? super T> e30Var, e30<Throwable> e30Var2) {
        if (e30Var == null) {
            ig3.a("onNext can not be null");
            return null;
        }
        if (e30Var2 != null) {
            return subscribe((z3g0) new e40(e30Var, e30Var2, i40.m5029a()));
        }
        ig3.a("onError can not be null");
        return null;
    }

    public final c4g0 subscribe(e30<? super T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        if (e30Var == null) {
            ig3.a("onNext can not be null");
            return null;
        }
        if (e30Var2 == null) {
            ig3.a("onError can not be null");
            return null;
        }
        if (d30Var != null) {
            return subscribe((z3g0) new e40(e30Var, e30Var2, d30Var));
        }
        ig3.a("onComplete can not be null");
        return null;
    }

    public final c4g0 subscribe(m250<? super T> m250Var) {
        if (m250Var instanceof z3g0) {
            return subscribe((z3g0) m250Var);
        }
        if (m250Var != null) {
            return subscribe((z3g0) new o250(m250Var));
        }
        jfd0.a("observer is null");
        return null;
    }

    public final c4g0 subscribe(z3g0<? super T> z3g0Var) {
        return subscribe(z3g0Var, this);
    }

    public final c4g0 subscribe() {
        return subscribe((z3g0) new e40(i40.m5029a(), InternalObservableUtils.ERROR_NOT_IMPLEMENTED, i40.m5029a()));
    }
}
