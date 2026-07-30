package p003l;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;
import l.mcr;
import l.mkd0;
import l.w660;
import p014rx.C1099c;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class eb2 extends w660 {

    /* JADX INFO: renamed from: a */
    public C1186b<Object> f3236a = C1186b.m9978b();

    /* JADX INFO: renamed from: b */
    public C1186b<Object> f3237b = C1186b.m9978b();

    /* JADX INFO: renamed from: c */
    public ViewGroup f3238c;

    /* JADX INFO: renamed from: d */
    public Object f3239d;

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C1099c m3805k(C1099c c1099c) {
        return c1099c;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f3236a.onNext(obj);
        mo923o(viewGroup, i, obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        this.f3238c = viewGroup;
        Object objMo924p = mo924p(viewGroup, i);
        this.f3239d = objMo924p;
        m3807m(objMo924p);
        this.f3237b.onNext(this.f3239d);
        return this.f3239d;
    }

    /* JADX INFO: renamed from: n */
    public <V> C1099c<V> m3808n(final mcr mcrVar, final C1099c<V> c1099c) {
        final AtomicReference atomicReference = new AtomicReference();
        return mkd0.D(new v9j() { // from class: l.db2
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return eb2.m3805k(c1099c);
            }
        }, this.f3237b.first().doOnNext(new e30() { // from class: l.ab2
            @Override // p003l.e30
            public final void call(Object obj) {
                atomicReference.set(obj);
            }
        }).flatMap(new w9j() { // from class: l.bb2
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return mcrVar.lifecycle();
            }
        }).compose(mkd0.E()).takeUntil(this.f3236a.filter(new w9j() { // from class: l.cb2
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(obj == atomicReference.get());
            }
        })), true);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo923o(ViewGroup viewGroup, int i, Object obj);

    /* JADX INFO: renamed from: p */
    public abstract Object mo924p(ViewGroup viewGroup, int i);

    public final void destroyItem(View view, int i, Object obj) {
        super.destroyItem(view, i, obj);
    }

    public final Object instantiateItem(View view, int i) {
        return super.instantiateItem(view, i);
    }

    /* JADX INFO: renamed from: m */
    public void m3807m(Object obj) {
    }
}
