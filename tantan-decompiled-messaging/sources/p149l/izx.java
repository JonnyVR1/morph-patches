package p149l;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class izx<T> extends kt10<T> {

    /* JADX INFO: renamed from: l */
    public iod0<LiveData<?>, C17656a<?>> f115603l = new iod0<>();

    /* JADX INFO: renamed from: l.izx$a */
    public static class C17656a<V> implements n250<V> {

        /* JADX INFO: renamed from: a */
        public final LiveData<V> f115604a;

        /* JADX INFO: renamed from: b */
        public final n250<? super V> f115605b;

        /* JADX INFO: renamed from: c */
        public int f115606c = -1;

        public C17656a(LiveData<V> liveData, n250<? super V> n250Var) {
            this.f115604a = liveData;
            this.f115605b = n250Var;
        }

        /* JADX INFO: renamed from: a */
        public void m139078a() {
            this.f115604a.m2984j(this);
        }

        /* JADX INFO: renamed from: b */
        public void m139079b() {
            this.f115604a.mo2988n(this);
        }

        @Override // p149l.n250
        public void onChanged(V v2) {
            if (this.f115606c != this.f115604a.m2981g()) {
                this.f115606c = this.f115604a.m2981g();
                this.f115605b.onChanged(v2);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    /* JADX INFO: renamed from: k */
    public void mo2985k() {
        Iterator<Map.Entry<LiveData<?>, C17656a<?>>> it = this.f115603l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m139078a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    /* JADX INFO: renamed from: l */
    public void mo2986l() {
        Iterator<Map.Entry<LiveData<?>, C17656a<?>>> it = this.f115603l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m139079b();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: p */
    public <S> void m139076p(LiveData<S> liveData, n250<? super S> n250Var) {
        if (liveData == null) {
            jfd0.m141176a("source cannot be null");
            return;
        }
        C17656a<?> c17656a = new C17656a<>(liveData, n250Var);
        C17656a<?> c17656aMo137324i = this.f115603l.mo137324i(liveData, c17656a);
        if (c17656aMo137324i != null && c17656aMo137324i.f115605b != n250Var) {
            ig3.m135964a("This source was already added with the different observer");
        } else if (c17656aMo137324i == null && m2982h()) {
            c17656a.m139078a();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: q */
    public <S> void m139077q(LiveData<S> liveData) {
        C17656a<?> c17656aMo137325j = this.f115603l.mo137325j(liveData);
        if (c17656aMo137325j != null) {
            c17656aMo137325j.m139079b();
        }
    }
}
