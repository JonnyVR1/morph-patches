package p009l;

import android.os.Bundle;
import l.d30;
import l.dml;
import l.e30;
import l.mcr;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class j80 implements mcr {

    /* JADX INFO: renamed from: a */
    public dml f14981a;

    /* JADX INFO: renamed from: b */
    public mcr f14982b;

    public j80(dml dmlVar, mcr mcrVar) {
        this.f14981a = dmlVar;
        this.f14982b = mcrVar;
    }

    public void creates(e30<Bundle> e30Var, d30 d30Var) {
        this.f14982b.creates(e30Var, d30Var);
    }

    public <T> c<T> duringCreated(v9j<c<T>> v9jVar, boolean z) {
        return this.f14981a.g(this.f14982b, (c) v9jVar.call(), z);
    }

    public c<com.p1.mobile.android.app.c> lifecycle() {
        return this.f14982b.lifecycle();
    }

    public com.p1.mobile.android.app.c lifecycle_() {
        return this.f14982b.lifecycle_();
    }

    public void creates(e30<Bundle> e30Var) {
        this.f14982b.creates(e30Var);
    }

    public <T> c<T> duringCreated(v9j<c<T>> v9jVar) {
        return this.f14981a.c(this.f14982b, (c) v9jVar.call());
    }

    public <T> c<T> duringCreated(c<T> cVar) {
        return this.f14981a.c(this.f14982b, cVar);
    }
}
