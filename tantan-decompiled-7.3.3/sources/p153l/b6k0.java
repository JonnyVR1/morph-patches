package p153l;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b6k0<T, Params> {

    /* JADX INFO: renamed from: a */
    @NonNull
    protected final lxi0 f75195a;

    /* JADX INFO: renamed from: b */
    @NonNull
    protected final tl80 f75196b;

    /* JADX INFO: renamed from: c */
    @NonNull
    protected final CompositeDisposable f75197c = new CompositeDisposable();

    public b6k0(@NonNull lxi0 lxi0Var, @NonNull tl80 tl80Var) {
        this.f75195a = lxi0Var;
        this.f75196b = tl80Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m102764a(@NonNull Disposable disposable) {
        this.f75197c.add(disposable);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract Flowable<T> mo102765b(@Nullable Params params);

    @CallSuper
    /* JADX INFO: renamed from: c */
    public void m102766c() {
        if (this.f75197c.isDisposed()) {
            return;
        }
        this.f75197c.dispose();
    }

    /* JADX INFO: renamed from: d */
    public final <E extends Subscriber<? super T>> void m102767d(@NonNull E e, @NonNull Params params) {
        m102768e(e, params, null);
    }

    /* JADX INFO: renamed from: e */
    public final <E extends Subscriber<? super T>> void m102768e(@NonNull E e, @Nullable Params params, @Nullable Action action) {
        xn80.m212100e(Disposable.class.isInstance(e), "subscriber cannot be cast to Disposable");
        m102764a((action == null ? mo102765b(params).subscribeOn(Schedulers.from(this.f75195a)).observeOn(this.f75196b.mo17551a(), true) : mo102765b(params).subscribeOn(Schedulers.from(this.f75195a)).observeOn(this.f75196b.mo17551a(), true).compose(new u1n(action))).subscribeWith(e));
    }
}
