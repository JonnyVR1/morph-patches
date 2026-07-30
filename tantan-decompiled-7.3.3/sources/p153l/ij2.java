package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import p137rx.C22421c;
import p153l.iam;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ij2<V extends iam> implements k3m<V>, s1e {

    /* JADX INFO: renamed from: a */
    public V f115168a;

    /* JADX INFO: renamed from: b */
    public s1e f115169b;

    public ij2(s1e s1eVar) {
        this.f115169b = s1eVar;
    }

    @Override // p153l.k3m
    /* JADX INFO: renamed from: C */
    public void mo52715C(V v2) {
        this.f115168a = v2;
        v2.mo22064i1(this);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Act m140179b() {
        return this.f115168a.getAct();
    }

    @Override // p153l.s1e
    public <T> C22421c<T> duringCreated(C22421c<T> c22421c) {
        return this.f115169b.duringCreated(c22421c);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
