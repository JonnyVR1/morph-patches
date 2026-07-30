package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.C0477f;
import androidx.lifecycle.Lifecycle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import p153l.k5e;
import p153l.ker;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Landroidx/lifecycle/f;", "", "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Landroidx/lifecycle/Lifecycle$State;", "minState", "Ll/k5e;", "dispatchQueue", "Lkotlinx/coroutines/o;", "parentJob", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Ll/k5e;Lkotlinx/coroutines/o;)V", "", "b", "()V", "a", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "c", "Ll/k5e;", "Landroidx/lifecycle/LifecycleEventObserver;", Constants.INAPP_DATA_TAG, "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "lifecycle-common"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@MainThread
@SourceDebugExtension
public final class C0477f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lifecycle lifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lifecycle.State minState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final k5e dispatchQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LifecycleEventObserver observer;

    public C0477f(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull k5e k5eVar, @NotNull final InterfaceC15593o interfaceC15593o) {
        lifecycle.getClass();
        state.getClass();
        k5eVar.getClass();
        interfaceC15593o.getClass();
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = k5eVar;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: l.ger
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(ker kerVar, Lifecycle.Event event) {
                C0477f.m3021a(this.f103851a, interfaceC15593o, kerVar, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
            lifecycle.mo2967a(lifecycleEventObserver);
        } else {
            InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
            m3022b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3021a(C0477f c0477f, InterfaceC15593o interfaceC15593o, ker kerVar, Lifecycle.Event event) {
        kerVar.getClass();
        event.getClass();
        if (kerVar.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
            c0477f.m3022b();
            return;
        }
        int iCompareTo = kerVar.getLifecycle().getState().compareTo(c0477f.minState);
        k5e k5eVar = c0477f.dispatchQueue;
        if (iCompareTo < 0) {
            k5eVar.m148357g();
        } else {
            k5eVar.m148358h();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final void m3022b() {
        this.lifecycle.mo2970d(this.observer);
        this.dispatchQueue.m148356f();
    }
}
