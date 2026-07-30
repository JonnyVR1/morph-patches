package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import p133rx.C22306c;
import p149l.s7m;

/* JADX INFO: loaded from: classes8.dex */
public abstract class aj2<V extends s7m> implements q0m<V>, e0e {

    /* JADX INFO: renamed from: a */
    public V f70081a;

    /* JADX INFO: renamed from: b */
    public e0e f70082b;

    public aj2(e0e e0eVar) {
        this.f70082b = e0eVar;
    }

    @Override // p149l.q0m
    /* JADX INFO: renamed from: C */
    public void mo51532C(V v2) {
        this.f70081a = v2;
        v2.mo21065i1(this);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Act m96966b() {
        return this.f70081a.getAct();
    }

    @Override // p149l.e0e
    public <T> C22306c<T> duringCreated(C22306c<T> c22306c) {
        return this.f70082b.duringCreated(c22306c);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
