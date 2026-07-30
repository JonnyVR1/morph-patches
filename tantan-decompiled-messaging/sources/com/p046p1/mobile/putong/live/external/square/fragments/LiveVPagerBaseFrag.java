package com.p046p1.mobile.putong.live.external.square.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.f760;
import p149l.j760;
import p149l.mkd0;
import p149l.roj0;
import p149l.v9j;
import p149l.w9j;
import p149l.wsu;
import p149l.xsu;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LiveVPagerBaseFrag extends LiveBaseFrag {
    private boolean viewCreated = false;
    private final String logTag = getClass().getSimpleName();
    private final f760 visibleHelper = new f760(this);
    protected volatile C22393b<roj0> endSubscribeSignal = C22393b.m221521b();

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ C22306c m70818M4(C22306c c22306c) {
        return c22306c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ Pair m70819N4(j760 j760Var) {
        Pair pair = (Pair) j760Var.f116564a;
        return new Pair((Boolean) pair.first, Boolean.valueOf(((Boolean) pair.second).booleanValue() && ((Boolean) j760Var.f116565b).booleanValue()));
    }

    /* JADX INFO: renamed from: O4 */
    public boolean mo69865O4() {
        return true;
    }

    /* JADX INFO: renamed from: P4 */
    public C22306c<Boolean> m70820P4() {
        return this.visibleHelper.m119765g();
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m70821Q4() {
        return this.visibleHelper.m119767i();
    }

    @CallSuper
    /* JADX INFO: renamed from: R4 */
    public void m70822R4(boolean z) {
    }

    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
    }

    /* JADX INFO: renamed from: T4 */
    public void m70823T4(boolean z) {
        this.visibleHelper.m119773o(z);
    }

    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
    }

    /* JADX INFO: renamed from: V4 */
    public void m70824V4(int i, int i2) {
        this.visibleHelper.m119775q(i, i2);
    }

    /* JADX INFO: renamed from: W4 */
    public void m70825W4(int i) {
        this.visibleHelper.m119777s(i);
    }

    @Override // com.p046p1.mobile.android.app.Frag, p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return mkd0.m154952D(v9jVar, mkd0.m154984r(lifecycle().compose(mkd0.m154953E()), m70820P4(), new xsu()).map(new w9j() { // from class: l.ysu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveVPagerBaseFrag.m70819N4((j760) obj);
            }
        }).takeUntil(this.endSubscribeSignal), z);
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.visibleHelper.m119770l(act(), bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.visibleHelper.m119771m();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.endSubscribeSignal.onNext(roj0.f160388a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo68931U4(view, bundle);
        this.viewCreated = true;
        this.visibleHelper.m119774p(getUserVisibleHint(), new wsu(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!this.viewCreated || lifecycle_() == null) {
            return;
        }
        this.visibleHelper.m119776r(z, new wsu(this));
    }

    @Override // com.p046p1.mobile.android.app.Frag, p149l.mcr
    public <T> C22306c<T> duringCreated(final C22306c<T> c22306c) {
        return duringCreated(new v9j() { // from class: l.zsu
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return LiveVPagerBaseFrag.m70818M4(c22306c);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag, p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar) {
        return duringCreated(v9jVar, true);
    }
}
