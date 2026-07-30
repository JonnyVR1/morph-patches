package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.p058ui.greet.AbstractC8522c;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ldk implements ner {

    /* JADX INFO: renamed from: a */
    public AbstractC8522c f131652a;

    public ldk(AbstractC8522c abstractC8522c) {
        this.f131652a = abstractC8522c;
        abstractC8522c.m47074j0(this);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC8522c m153781a() {
        return this.f131652a;
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var, x20 x20Var) {
        this.f131652a.creates(y20Var, x20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return this.f131652a.duringCreated(pcjVar, z);
    }

    @Override // p153l.ner, p153l.r1e
    public C22421c<C4470c> lifecycle() {
        return this.f131652a.lifecycle();
    }

    @Override // p153l.ner
    public C4470c lifecycle_() {
        return this.f131652a.lifecycle_();
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var) {
        this.f131652a.creates(y20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar) {
        return this.f131652a.duringCreated(pcjVar);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(C22421c<T> c22421c) {
        return this.f131652a.duringCreated(c22421c);
    }

    /* JADX INFO: renamed from: b */
    public void mo97077b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo97078c() {
    }
}
