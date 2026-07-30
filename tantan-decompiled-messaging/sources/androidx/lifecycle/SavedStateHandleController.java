package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.savedstate.C0677a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.jcr;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m87232d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", Constants.KEY_KEY, "Landroidx/lifecycle/p;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/p;)V", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "", "attachToLifecycle", "(Landroidx/savedstate/a;Landroidx/lifecycle/Lifecycle;)V", "Ll/jcr;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "onStateChanged", "(Ll/jcr;Landroidx/lifecycle/Lifecycle$Event;)V", "close", "()V", "Ljava/lang/String;", "Landroidx/lifecycle/p;", "getHandle", "()Landroidx/lifecycle/p;", "", "value", "isAttached", "Z", "()Z", "lifecycle-viewmodel-savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SavedStateHandleController implements LifecycleEventObserver, AutoCloseable {

    @NotNull
    private final C0486p handle;
    private boolean isAttached;

    @NotNull
    private final String key;

    public SavedStateHandleController(@NotNull String str, @NotNull C0486p c0486p) {
        str.getClass();
        c0486p.getClass();
        this.key = str;
        this.handle = c0486p;
    }

    public final void attachToLifecycle(@NotNull C0677a registry, @NotNull Lifecycle lifecycle) {
        registry.getClass();
        lifecycle.getClass();
        if (this.isAttached) {
            qkq0.m175383a("Already attached to lifecycleOwner");
            return;
        }
        this.isAttached = true;
        lifecycle.mo2966a(this);
        registry.m4023c(this.key, this.handle.m3059a());
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    public final C0486p getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull jcr source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycle().mo2969d(this);
        }
    }
}
