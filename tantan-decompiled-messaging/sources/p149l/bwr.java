package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class bwr<V extends s7m> implements q0m<V>, mcr {
    protected volatile C22393b<roj0> endSubscribeSignal = C22393b.m221521b();
    protected mcr lifecycleProviderImpl;
    protected V viewModel;

    public bwr(mcr mcrVar) {
        this.lifecycleProviderImpl = mcrVar;
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ C22306c m104243i2(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ Pair m104246m2(C4319c c4319c) {
        return new Pair(Boolean.valueOf(c4319c.f15558d), Boolean.valueOf(c4319c.f15555a));
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ C22306c m104247n2(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: p2 */
    public static C22306c.d<C4319c, Pair<Boolean, Boolean>> m104248p2() {
        return new C22306c.d() { // from class: l.xvr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).filter(new w9j() { // from class: l.zvr
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        C4319c c4319c = (C4319c) obj2;
                        return Boolean.valueOf(c4319c == C4319c.f15545f || TextUtils.equals(c4319c.f15557c, "CreateView") || c4319c == C4319c.f15546g || c4319c == C4319c.f15547h || c4319c == C4319c.f15548i || c4319c == C4319c.f15550k || c4319c == C4319c.f15551l || c4319c == C4319c.f15552m || c4319c == C4319c.f15554o);
                    }
                }).map(new w9j() { // from class: l.awr
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return bwr.m104246m2((C4319c) obj2);
                    }
                });
            }
        };
    }

    @Override // p149l.q0m
    /* JADX INFO: renamed from: C */
    public void mo51532C(V v2) {
        this.viewModel = v2;
        v2.mo21065i1(this);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m104249C0() {
        return this.viewModel.getContext();
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var, d30 d30Var) {
        this.lifecycleProviderImpl.creates(e30Var, d30Var);
    }

    @Override // p149l.q0m
    @CallSuper
    public void destroy() {
        if (this.endSubscribeSignal == null) {
            CrashHelper.m81296c(new Exception("LiveBasePresenter's endSubscribeSignal is null"));
        } else {
            this.endSubscribeSignal.onNext(roj0.f160388a);
        }
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return mkd0.m154952D(v9jVar, this.lifecycleProviderImpl.lifecycle().compose(m104248p2()).takeUntil(this.endSubscribeSignal), z);
    }

    @Override // p149l.mcr, p149l.d0e
    public C22306c<C4319c> lifecycle() {
        return this.lifecycleProviderImpl.lifecycle();
    }

    @Override // p149l.mcr
    public C4319c lifecycle_() {
        return this.lifecycleProviderImpl.lifecycle_();
    }

    /* JADX INFO: renamed from: o2 */
    public <T> C22306c<T> m104250o2(final C22306c<T> c22306c, boolean z) {
        return duringCreated(new v9j() { // from class: l.wvr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return bwr.m104243i2(c22306c);
            }
        }, z);
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var) {
        this.lifecycleProviderImpl.creates(e30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(final C22306c<T> c22306c) {
        return duringCreated(new v9j() { // from class: l.yvr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return bwr.m104247n2(c22306c);
            }
        }, true);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar) {
        return duringCreated(v9jVar, true);
    }
}
