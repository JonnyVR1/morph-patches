package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.jcr;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, m87232d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/d;", "generatedAdapter", "<init>", "(Landroidx/lifecycle/d;)V", "Ll/jcr;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Ll/jcr;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/d;", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    @NotNull
    private final InterfaceC0474d generatedAdapter;

    public SingleGeneratedAdapterObserver(@NotNull InterfaceC0474d interfaceC0474d) {
        interfaceC0474d.getClass();
        this.generatedAdapter = interfaceC0474d;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull jcr source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        this.generatedAdapter.m3019a(source, event, false, null);
        this.generatedAdapter.m3019a(source, event, true, null);
    }
}
