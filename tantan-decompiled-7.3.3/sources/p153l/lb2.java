package p153l;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lb2 extends cf60 {

    /* JADX INFO: renamed from: a */
    public C22508b<Object> f130763a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public C22508b<Object> f130764b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public ViewGroup f130765c;

    /* JADX INFO: renamed from: d */
    public Object f130766d;

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C22421c m153555k(C22421c c22421c) {
        return c22421c;
    }

    @Override // p153l.cf60
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f130763a.onNext(obj);
        mo40045o(viewGroup, i, obj);
    }

    @Override // p153l.cf60
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        this.f130765c = viewGroup;
        Object objMo40046p = mo40046p(viewGroup, i);
        this.f130766d = objMo40046p;
        mo44299m(objMo40046p);
        this.f130764b.onNext(this.f130766d);
        return this.f130766d;
    }

    /* JADX INFO: renamed from: n */
    public <V> C22421c<V> m153557n(final ner nerVar, final C22421c<V> c22421c) {
        final AtomicReference atomicReference = new AtomicReference();
        return psd0.m173593D(new pcj() { // from class: l.kb2
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return lb2.m153555k(c22421c);
            }
        }, this.f130764b.first().doOnNext(new y20() { // from class: l.hb2
            @Override // p153l.y20
            public final void call(Object obj) {
                atomicReference.set(obj);
            }
        }).flatMap(new qcj() { // from class: l.ib2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return nerVar.lifecycle();
            }
        }).compose(psd0.m173594E()).takeUntil(this.f130763a.filter(new qcj() { // from class: l.jb2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(obj == atomicReference.get());
            }
        })), true);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo40045o(ViewGroup viewGroup, int i, Object obj);

    /* JADX INFO: renamed from: p */
    public abstract Object mo40046p(ViewGroup viewGroup, int i);

    @Override // p153l.cf60
    public final void destroyItem(View view, int i, Object obj) {
        super.destroyItem(view, i, obj);
    }

    @Override // p153l.cf60
    public final Object instantiateItem(View view, int i) {
        return super.instantiateItem(view, i);
    }

    /* JADX INFO: renamed from: m */
    public void mo44299m(Object obj) {
    }
}
