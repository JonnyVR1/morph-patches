package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.p053ui.greet.AbstractC8359c;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uak implements mcr {

    /* JADX INFO: renamed from: a */
    public AbstractC8359c f175606a;

    public uak(AbstractC8359c abstractC8359c) {
        this.f175606a = abstractC8359c;
        abstractC8359c.m45891j0(this);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC8359c m192761a() {
        return this.f175606a;
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var, d30 d30Var) {
        this.f175606a.creates(e30Var, d30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return this.f175606a.duringCreated(v9jVar, z);
    }

    @Override // p149l.mcr, p149l.d0e
    public C22306c<C4319c> lifecycle() {
        return this.f175606a.lifecycle();
    }

    @Override // p149l.mcr
    public C4319c lifecycle_() {
        return this.f175606a.lifecycle_();
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var) {
        this.f175606a.creates(e30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar) {
        return this.f175606a.duringCreated(v9jVar);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(C22306c<T> c22306c) {
        return this.f175606a.duringCreated(c22306c);
    }

    /* JADX INFO: renamed from: b */
    public void mo140693b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo140694c() {
    }
}
