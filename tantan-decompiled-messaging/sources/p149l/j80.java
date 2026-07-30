package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class j80 implements mcr {

    /* JADX INFO: renamed from: a */
    public dml f116670a;

    /* JADX INFO: renamed from: b */
    public mcr f116671b;

    public j80(dml dmlVar, mcr mcrVar) {
        this.f116670a = dmlVar;
        this.f116671b = mcrVar;
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var, d30 d30Var) {
        this.f116671b.creates(e30Var, d30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return this.f116670a.mo67378g(this.f116671b, v9jVar.call(), z);
    }

    @Override // p149l.mcr, p149l.d0e
    public C22306c<C4319c> lifecycle() {
        return this.f116671b.lifecycle();
    }

    @Override // p149l.mcr
    public C4319c lifecycle_() {
        return this.f116671b.lifecycle_();
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var) {
        this.f116671b.creates(e30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar) {
        return this.f116670a.mo67374c(this.f116671b, v9jVar.call());
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(C22306c<T> c22306c) {
        return this.f116670a.mo67374c(this.f116671b, c22306c);
    }
}
