package p153l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import p137rx.C22421c;
import p153l.iam;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ar2<V extends iam> implements k3m<V>, ner {
    protected ner lifecycleProviderImpl;
    protected V viewModel;

    public ar2(ner nerVar) {
        this.lifecycleProviderImpl = nerVar;
        nerVar.creates(new y20() { // from class: l.wq2
            @Override // p153l.y20
            public final void call(Object obj) {
                ar2.m99637W((Bundle) obj);
            }
        }, new x20() { // from class: l.xq2
            @Override // p153l.x20
            public final void call() {
                this.f195770a.m99639c0();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m99635U(Bundle bundle) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m99637W(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m99639c0() {
        destroy();
    }

    @Override // p153l.k3m
    /* JADX INFO: renamed from: C */
    public void mo52715C(V v2) {
        this.viewModel = v2;
        v2.mo22064i1(this);
        creates(new y20() { // from class: l.yq2
            @Override // p153l.y20
            public final void call(Object obj) {
                ar2.m99635U((Bundle) obj);
            }
        }, new x20() { // from class: l.zq2
            @Override // p153l.x20
            public final void call() {
                this.f205560a.m99641b0();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public Context m99640Y() {
        return this.viewModel.getContext();
    }

    @Nullable
    public Act act() {
        return this.viewModel.act();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m99641b0() {
        this.viewModel.destroy();
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var, x20 x20Var) {
        this.lifecycleProviderImpl.creates(y20Var, x20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return this.lifecycleProviderImpl.duringCreated(pcjVar, z);
    }

    @Override // p153l.ner, p153l.r1e
    public C22421c<C4470c> lifecycle() {
        return this.lifecycleProviderImpl.lifecycle();
    }

    @Override // p153l.ner
    public C4470c lifecycle_() {
        return this.lifecycleProviderImpl.lifecycle_();
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var) {
        this.lifecycleProviderImpl.creates(y20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar) {
        return this.lifecycleProviderImpl.duringCreated(pcjVar);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(C22421c<T> c22421c) {
        return this.lifecycleProviderImpl.duringCreated(c22421c);
    }

    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
    }
}
