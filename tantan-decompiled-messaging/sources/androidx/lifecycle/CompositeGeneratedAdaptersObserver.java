package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.jcr;
import p149l.r100;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "", "Landroidx/lifecycle/d;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/d;)V", "Ll/jcr;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Ll/jcr;Landroidx/lifecycle/Lifecycle$Event;)V", "[Landroidx/lifecycle/d;", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    @NotNull
    private final InterfaceC0474d[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(@NotNull InterfaceC0474d[] interfaceC0474dArr) {
        interfaceC0474dArr.getClass();
        this.generatedAdapters = interfaceC0474dArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull jcr source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        r100 r100Var = new r100();
        for (InterfaceC0474d interfaceC0474d : this.generatedAdapters) {
            interfaceC0474d.m3019a(source, event, false, r100Var);
        }
        for (InterfaceC0474d interfaceC0474d2 : this.generatedAdapters) {
            interfaceC0474d2.m3019a(source, event, true, r100Var);
        }
    }
}
