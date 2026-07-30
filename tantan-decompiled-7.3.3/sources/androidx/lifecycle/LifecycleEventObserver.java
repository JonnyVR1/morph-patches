package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.jer;
import p153l.ker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m88121d2 = {"Landroidx/lifecycle/LifecycleEventObserver;", "Ll/jer;", "Ll/ker;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Ll/ker;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-common"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface LifecycleEventObserver extends jer {
    void onStateChanged(@NotNull ker source, @NotNull Lifecycle.Event event);
}
