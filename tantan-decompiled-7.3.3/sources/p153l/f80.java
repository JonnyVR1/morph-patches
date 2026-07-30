package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class f80 implements ner {

    /* JADX INFO: renamed from: a */
    public pol f97692a;

    /* JADX INFO: renamed from: b */
    public ner f97693b;

    public f80(pol polVar, ner nerVar) {
        this.f97692a = polVar;
        this.f97693b = nerVar;
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var, x20 x20Var) {
        this.f97693b.creates(y20Var, x20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return this.f97692a.mo68561g(this.f97693b, pcjVar.call(), z);
    }

    @Override // p153l.ner, p153l.r1e
    public C22421c<C4470c> lifecycle() {
        return this.f97693b.lifecycle();
    }

    @Override // p153l.ner
    public C4470c lifecycle_() {
        return this.f97693b.lifecycle_();
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var) {
        this.f97693b.creates(y20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar) {
        return this.f97692a.mo68557c(this.f97693b, pcjVar.call());
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(C22421c<T> c22421c) {
        return this.f97692a.mo68557c(this.f97693b, c22421c);
    }
}
