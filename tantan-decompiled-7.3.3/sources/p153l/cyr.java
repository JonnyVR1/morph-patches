package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.iam;

/* JADX INFO: loaded from: classes13.dex */
public abstract class cyr<V extends iam> implements k3m<V>, ner {
    protected volatile C22508b<uxj0> endSubscribeSignal = C22508b.m222767b();
    protected ner lifecycleProviderImpl;
    protected V viewModel;

    public cyr(ner nerVar) {
        this.lifecycleProviderImpl = nerVar;
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ C22421c m113224i2(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ Pair m113227m2(C4470c c4470c) {
        return new Pair(Boolean.valueOf(c4470c.f16277d), Boolean.valueOf(c4470c.f16274a));
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ C22421c m113228n2(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: p2 */
    public static C22421c.d<C4470c, Pair<Boolean, Boolean>> m113229p2() {
        return new C22421c.d() { // from class: l.yxr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).filter(new qcj() { // from class: l.ayr
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        C4470c c4470c = (C4470c) obj2;
                        return Boolean.valueOf(c4470c == C4470c.f16264f || TextUtils.equals(c4470c.f16276c, "CreateView") || c4470c == C4470c.f16265g || c4470c == C4470c.f16266h || c4470c == C4470c.f16267i || c4470c == C4470c.f16269k || c4470c == C4470c.f16270l || c4470c == C4470c.f16271m || c4470c == C4470c.f16273o);
                    }
                }).map(new qcj() { // from class: l.byr
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return cyr.m113227m2((C4470c) obj2);
                    }
                });
            }
        };
    }

    @Override // p153l.k3m
    /* JADX INFO: renamed from: C */
    public void mo52715C(V v2) {
        this.viewModel = v2;
        v2.mo22064i1(this);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m113230C0() {
        return this.viewModel.getContext();
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var, x20 x20Var) {
        this.lifecycleProviderImpl.creates(y20Var, x20Var);
    }

    @Override // p153l.k3m
    @CallSuper
    public void destroy() {
        if (this.endSubscribeSignal == null) {
            CrashHelper.m82479c(new Exception("LiveBasePresenter's endSubscribeSignal is null"));
        } else {
            this.endSubscribeSignal.onNext(uxj0.f181467a);
        }
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return psd0.m173593D(pcjVar, this.lifecycleProviderImpl.lifecycle().compose(m113229p2()).takeUntil(this.endSubscribeSignal), z);
    }

    @Override // p153l.ner, p153l.r1e
    public C22421c<C4470c> lifecycle() {
        return this.lifecycleProviderImpl.lifecycle();
    }

    @Override // p153l.ner
    public C4470c lifecycle_() {
        return this.lifecycleProviderImpl.lifecycle_();
    }

    /* JADX INFO: renamed from: o2 */
    public <T> C22421c<T> m113231o2(final C22421c<T> c22421c, boolean z) {
        return duringCreated(new pcj() { // from class: l.xxr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return cyr.m113224i2(c22421c);
            }
        }, z);
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var) {
        this.lifecycleProviderImpl.creates(y20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(final C22421c<T> c22421c) {
        return duringCreated(new pcj() { // from class: l.zxr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return cyr.m113228n2(c22421c);
            }
        }, true);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar) {
        return duringCreated(pcjVar, true);
    }
}
