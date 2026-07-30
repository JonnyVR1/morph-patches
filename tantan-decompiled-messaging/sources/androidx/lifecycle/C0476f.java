package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.C0476f;
import androidx.lifecycle.Lifecycle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import p149l.jcr;
import p149l.w3e;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Landroidx/lifecycle/f;", "", "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Landroidx/lifecycle/Lifecycle$State;", "minState", "Ll/w3e;", "dispatchQueue", "Lkotlinx/coroutines/o;", "parentJob", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Ll/w3e;Lkotlinx/coroutines/o;)V", "", "b", "()V", "a", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "c", "Ll/w3e;", "Landroidx/lifecycle/LifecycleEventObserver;", Constants.INAPP_DATA_TAG, "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@MainThread
@SourceDebugExtension
public final class C0476f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lifecycle lifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lifecycle.State minState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final w3e dispatchQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LifecycleEventObserver observer;

    public C0476f(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull w3e w3eVar, @NotNull final InterfaceC15486o interfaceC15486o) {
        lifecycle.getClass();
        state.getClass();
        w3eVar.getClass();
        interfaceC15486o.getClass();
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = w3eVar;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: l.fcr
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(jcr jcrVar, Lifecycle.Event event) {
                C0476f.m3020a(this.f96844a, interfaceC15486o, jcrVar, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
            lifecycle.mo2966a(lifecycleEventObserver);
        } else {
            InterfaceC15486o.a.m94245a(interfaceC15486o, null, 1, null);
            m3021b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3020a(C0476f c0476f, InterfaceC15486o interfaceC15486o, jcr jcrVar, Lifecycle.Event event) {
        jcrVar.getClass();
        event.getClass();
        if (jcrVar.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            InterfaceC15486o.a.m94245a(interfaceC15486o, null, 1, null);
            c0476f.m3021b();
            return;
        }
        int iCompareTo = jcrVar.getLifecycle().getState().compareTo(c0476f.minState);
        w3e w3eVar = c0476f.dispatchQueue;
        if (iCompareTo < 0) {
            w3eVar.m201289g();
        } else {
            w3eVar.m201290h();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final void m3021b() {
        this.lifecycle.mo2969d(this.observer);
        this.dispatchQueue.m201288f();
    }
}
