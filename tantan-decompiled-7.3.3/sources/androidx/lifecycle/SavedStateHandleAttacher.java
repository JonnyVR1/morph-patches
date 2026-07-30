package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.jmk0;
import p153l.jyd0;
import p153l.ker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, m88121d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", "Ll/jyd0;", "provider", "<init>", "(Ll/jyd0;)V", "Ll/ker;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Ll/ker;Landroidx/lifecycle/Lifecycle$Event;)V", "Ll/jyd0;", "lifecycle-viewmodel-savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    @NotNull
    private final jyd0 provider;

    public SavedStateHandleAttacher(@NotNull jyd0 jyd0Var) {
        jyd0Var.getClass();
        this.provider = jyd0Var;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull ker source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        if (event != Lifecycle.Event.ON_CREATE) {
            jmk0.m146166a("Next event must be ON_CREATE, it was ", event);
        } else {
            source.getLifecycle().mo2970d(this);
            this.provider.m147539c();
        }
    }
}
