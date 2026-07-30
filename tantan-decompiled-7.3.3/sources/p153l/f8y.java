package p153l;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f8y<T> extends s120<T> {

    /* JADX INFO: renamed from: l */
    public kwd0<LiveData<?>, C16924a<?>> f97789l = new kwd0<>();

    /* JADX INFO: renamed from: l.f8y$a */
    public static class C16924a<V> implements cb50<V> {

        /* JADX INFO: renamed from: a */
        public final LiveData<V> f97790a;

        /* JADX INFO: renamed from: b */
        public final cb50<? super V> f97791b;

        /* JADX INFO: renamed from: c */
        public int f97792c = -1;

        public C16924a(LiveData<V> liveData, cb50<? super V> cb50Var) {
            this.f97790a = liveData;
            this.f97791b = cb50Var;
        }

        /* JADX INFO: renamed from: a */
        public void m124575a() {
            this.f97790a.m2985j(this);
        }

        /* JADX INFO: renamed from: b */
        public void m124576b() {
            this.f97790a.mo2989n(this);
        }

        @Override // p153l.cb50
        public void onChanged(V v2) {
            if (this.f97792c != this.f97790a.m2982g()) {
                this.f97792c = this.f97790a.m2982g();
                this.f97791b.onChanged(v2);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    /* JADX INFO: renamed from: k */
    public void mo2986k() {
        Iterator<Map.Entry<LiveData<?>, C16924a<?>>> it = this.f97789l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m124575a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    /* JADX INFO: renamed from: l */
    public void mo2987l() {
        Iterator<Map.Entry<LiveData<?>, C16924a<?>>> it = this.f97789l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m124576b();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: p */
    public <S> void m124573p(LiveData<S> liveData, cb50<? super S> cb50Var) {
        if (liveData == null) {
            mnd0.m159157a("source cannot be null");
            return;
        }
        C16924a<?> c16924a = new C16924a<>(liveData, cb50Var);
        C16924a<?> c16924aMo110334i = this.f97789l.mo110334i(liveData, c16924a);
        if (c16924aMo110334i != null && c16924aMo110334i.f97791b != cb50Var) {
            wg3.m206174a("This source was already added with the different observer");
        } else if (c16924aMo110334i == null && m2983h()) {
            c16924a.m124575a();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: q */
    public <S> void m124574q(LiveData<S> liveData) {
        C16924a<?> c16924aMo110335j = this.f97789l.mo110335j(liveData);
        if (c16924aMo110335j != null) {
            c16924aMo110335j.m124576b();
        }
    }
}
