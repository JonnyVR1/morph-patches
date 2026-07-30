package p149l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import p133rx.C22306c;
import p149l.s7m;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jq2<V extends s7m> implements q0m<V>, mcr {
    protected mcr lifecycleProviderImpl;
    protected V viewModel;

    public jq2(mcr mcrVar) {
        this.lifecycleProviderImpl = mcrVar;
        mcrVar.creates(new e30() { // from class: l.fq2
            @Override // p149l.e30
            public final void call(Object obj) {
                jq2.m142770W((Bundle) obj);
            }
        }, new d30() { // from class: l.gq2
            @Override // p149l.d30
            public final void call() {
                this.f103873a.m142772c0();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m142768U(Bundle bundle) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m142770W(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m142772c0() {
        destroy();
    }

    @Override // p149l.q0m
    /* JADX INFO: renamed from: C */
    public void mo51532C(V v2) {
        this.viewModel = v2;
        v2.mo21065i1(this);
        creates(new e30() { // from class: l.hq2
            @Override // p149l.e30
            public final void call(Object obj) {
                jq2.m142768U((Bundle) obj);
            }
        }, new d30() { // from class: l.iq2
            @Override // p149l.d30
            public final void call() {
                this.f114369a.m142774b0();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public Context m142773Y() {
        return this.viewModel.getContext();
    }

    @Nullable
    public Act act() {
        return this.viewModel.act();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m142774b0() {
        this.viewModel.destroy();
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var, d30 d30Var) {
        this.lifecycleProviderImpl.creates(e30Var, d30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return this.lifecycleProviderImpl.duringCreated(v9jVar, z);
    }

    @Override // p149l.mcr, p149l.d0e
    public C22306c<C4319c> lifecycle() {
        return this.lifecycleProviderImpl.lifecycle();
    }

    @Override // p149l.mcr
    public C4319c lifecycle_() {
        return this.lifecycleProviderImpl.lifecycle_();
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var) {
        this.lifecycleProviderImpl.creates(e30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar) {
        return this.lifecycleProviderImpl.duringCreated(v9jVar);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(C22306c<T> c22306c) {
        return this.lifecycleProviderImpl.duringCreated(c22306c);
    }

    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
    }
}
