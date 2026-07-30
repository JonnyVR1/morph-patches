package p007l;

import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import p007l.s7m;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class aj2<V extends s7m> implements q0m<V>, e0e {

    /* JADX INFO: renamed from: a */
    public V f1861a;

    /* JADX INFO: renamed from: b */
    public e0e f1862b;

    public aj2(e0e e0eVar) {
        this.f1862b = e0eVar;
    }

    @Override // p007l.q0m
    /* JADX INFO: renamed from: C */
    public void mo8556C(V v) {
        this.f1861a = v;
        v.mo1337i1(this);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Act m8557b() {
        return this.f1861a.act();
    }

    @Override // p007l.e0e
    public <T> c<T> duringCreated(c<T> cVar) {
        return this.f1862b.duringCreated(cVar);
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
