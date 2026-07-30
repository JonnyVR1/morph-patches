package com.clevertap.android.sdk.inapp.pipsdk.internal.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.jcr;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/lifecycle/PIPLifecycleObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "Lkotlin/Function0;", "", "onStop", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Ll/jcr;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "onStateChanged", "(Ll/jcr;Landroidx/lifecycle/Lifecycle$Event;)V", "Lkotlin/jvm/functions/Function0;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class PIPLifecycleObserver implements LifecycleEventObserver {

    @NotNull
    private final Function0<Unit> onStop;

    public PIPLifecycleObserver(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.onStop = function0;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull jcr source, @NotNull Lifecycle.Event event) {
        source.getClass();
        event.getClass();
        if (event == Lifecycle.Event.ON_STOP) {
            this.onStop.invoke();
        }
    }
}
