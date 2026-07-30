package p149l;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eb2 extends w660 {

    /* JADX INFO: renamed from: a */
    public C22393b<Object> f90286a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public C22393b<Object> f90287b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public ViewGroup f90288c;

    /* JADX INFO: renamed from: d */
    public Object f90289d;

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C22306c m115450k(C22306c c22306c) {
        return c22306c;
    }

    @Override // p149l.w660
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f90286a.onNext(obj);
        mo39042o(viewGroup, i, obj);
    }

    @Override // p149l.w660
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        this.f90288c = viewGroup;
        Object objMo39043p = mo39043p(viewGroup, i);
        this.f90289d = objMo39043p;
        mo43284m(objMo39043p);
        this.f90287b.onNext(this.f90289d);
        return this.f90289d;
    }

    /* JADX INFO: renamed from: n */
    public <V> C22306c<V> m115452n(final mcr mcrVar, final C22306c<V> c22306c) {
        final AtomicReference atomicReference = new AtomicReference();
        return mkd0.m154952D(new v9j() { // from class: l.db2
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return eb2.m115450k(c22306c);
            }
        }, this.f90287b.first().doOnNext(new e30() { // from class: l.ab2
            @Override // p149l.e30
            public final void call(Object obj) {
                atomicReference.set(obj);
            }
        }).flatMap(new w9j() { // from class: l.bb2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mcrVar.lifecycle();
            }
        }).compose(mkd0.m154953E()).takeUntil(this.f90286a.filter(new w9j() { // from class: l.cb2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(obj == atomicReference.get());
            }
        })), true);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo39042o(ViewGroup viewGroup, int i, Object obj);

    /* JADX INFO: renamed from: p */
    public abstract Object mo39043p(ViewGroup viewGroup, int i);

    @Override // p149l.w660
    public final void destroyItem(View view, int i, Object obj) {
        super.destroyItem(view, i, obj);
    }

    @Override // p149l.w660
    public final Object instantiateItem(View view, int i) {
        return super.instantiateItem(view, i);
    }

    /* JADX INFO: renamed from: m */
    public void mo43284m(Object obj) {
    }
}
