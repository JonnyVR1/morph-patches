package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.ker;
import p153l.oa00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "", "Landroidx/lifecycle/d;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/d;)V", "Ll/ker;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Ll/ker;Landroidx/lifecycle/Lifecycle$Event;)V", "[Landroidx/lifecycle/d;", "lifecycle-common"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    @NotNull
    private final InterfaceC0475d[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(@NotNull InterfaceC0475d[] interfaceC0475dArr) {
        interfaceC0475dArr.getClass();
        this.generatedAdapters = interfaceC0475dArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull ker source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        oa00 oa00Var = new oa00();
        for (InterfaceC0475d interfaceC0475d : this.generatedAdapters) {
            interfaceC0475d.m3020a(source, event, false, oa00Var);
        }
        for (InterfaceC0475d interfaceC0475d2 : this.generatedAdapters) {
            interfaceC0475d2.m3020a(source, event, true, oa00Var);
        }
    }
}
