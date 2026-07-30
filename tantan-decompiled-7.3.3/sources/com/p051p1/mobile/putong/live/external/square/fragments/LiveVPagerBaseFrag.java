package com.p051p1.mobile.putong.live.external.square.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.lf60;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.uxj0;
import p153l.xuu;
import p153l.yuu;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LiveVPagerBaseFrag extends LiveBaseFrag {
    private boolean viewCreated = false;
    private final String logTag = getClass().getSimpleName();
    private final lf60 visibleHelper = new lf60(this);
    protected volatile C22508b<uxj0> endSubscribeSignal = C22508b.m222767b();

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ C22421c m72001M4(C22421c c22421c) {
        return c22421c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ Pair m72002N4(pf60 pf60Var) {
        Pair pair = (Pair) pf60Var.f152156a;
        return new Pair((Boolean) pair.first, Boolean.valueOf(((Boolean) pair.second).booleanValue() && ((Boolean) pf60Var.f152157b).booleanValue()));
    }

    /* JADX INFO: renamed from: O4 */
    public boolean mo71048O4() {
        return true;
    }

    /* JADX INFO: renamed from: P4 */
    public C22421c<Boolean> m72003P4() {
        return this.visibleHelper.m153978g();
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m72004Q4() {
        return this.visibleHelper.m153980i();
    }

    @CallSuper
    /* JADX INFO: renamed from: R4 */
    public void m72005R4(boolean z) {
    }

    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
    }

    /* JADX INFO: renamed from: T4 */
    public void m72006T4(boolean z) {
        this.visibleHelper.m153986o(z);
    }

    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
    }

    /* JADX INFO: renamed from: V4 */
    public void m72007V4(int i, int i2) {
        this.visibleHelper.m153988q(i, i2);
    }

    /* JADX INFO: renamed from: W4 */
    public void m72008W4(int i) {
        this.visibleHelper.m153990s(i);
    }

    @Override // com.p051p1.mobile.android.app.Frag, p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return psd0.m173593D(pcjVar, psd0.m173625r(lifecycle().compose(psd0.m173594E()), m72003P4(), new yuu()).map(new qcj() { // from class: l.zuu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveVPagerBaseFrag.m72002N4((pf60) obj);
            }
        }).takeUntil(this.endSubscribeSignal), z);
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.visibleHelper.m153983l(act(), bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.visibleHelper.m153984m();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.endSubscribeSignal.onNext(uxj0.f181467a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo70114U4(view, bundle);
        this.viewCreated = true;
        this.visibleHelper.m153987p(getUserVisibleHint(), new xuu(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!this.viewCreated || lifecycle_() == null) {
            return;
        }
        this.visibleHelper.m153989r(z, new xuu(this));
    }

    @Override // com.p051p1.mobile.android.app.Frag, p153l.ner
    public <T> C22421c<T> duringCreated(final C22421c<T> c22421c) {
        return duringCreated(new pcj() { // from class: l.avu
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return LiveVPagerBaseFrag.m72001M4(c22421c);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag, p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar) {
        return duringCreated(pcjVar, true);
    }
}
