package p007l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.C0231c;
import l.d30;
import l.e30;
import l.v9j;
import p007l.s7m;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class jq2<V extends s7m> implements q0m<V>, mcr {
    protected mcr lifecycleProviderImpl;
    protected V viewModel;

    public jq2(mcr mcrVar) {
        this.lifecycleProviderImpl = mcrVar;
        mcrVar.creates(new e30() { // from class: l.fq2
            public final void call(Object obj) {
                jq2.m9549W((Bundle) obj);
            }
        }, new d30() { // from class: l.gq2
            public final void call() {
                this.f2791a.m9551c0();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m9547U(Bundle bundle) {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m9549W(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m9551c0() {
        destroy();
    }

    @Override // p007l.q0m
    /* JADX INFO: renamed from: C */
    public void mo8556C(V v) {
        this.viewModel = v;
        v.mo1337i1(this);
        creates(new e30() { // from class: l.hq2
            public final void call(Object obj) {
                jq2.m9547U((Bundle) obj);
            }
        }, new d30() { // from class: l.iq2
            public final void call() {
                this.f2922a.m9554b0();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public Context m9552Y() {
        return this.viewModel.mo1334C0();
    }

    @Nullable
    public Act act() {
        return this.viewModel.act();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m9554b0() {
        this.viewModel.destroy();
    }

    @Override // p007l.mcr
    public void creates(e30<Bundle> e30Var, d30 d30Var) {
        this.lifecycleProviderImpl.creates(e30Var, d30Var);
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(v9j<c<T>> v9jVar, boolean z) {
        return this.lifecycleProviderImpl.duringCreated(v9jVar, z);
    }

    @Override // p007l.mcr, p007l.d0e
    public c<C0231c> lifecycle() {
        return this.lifecycleProviderImpl.lifecycle();
    }

    @Override // p007l.mcr
    public C0231c lifecycle_() {
        return this.lifecycleProviderImpl.lifecycle_();
    }

    @Override // p007l.mcr
    public void creates(e30<Bundle> e30Var) {
        this.lifecycleProviderImpl.creates(e30Var);
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(v9j<c<T>> v9jVar) {
        return this.lifecycleProviderImpl.duringCreated(v9jVar);
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(c<T> cVar) {
        return this.lifecycleProviderImpl.duringCreated(cVar);
    }

    /* JADX INFO: renamed from: Z */
    public void mo9553Z() {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
    }
}
