package androidx.lifecycle;

import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.icr;
import p149l.jcr;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m87232d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Ll/icr;", "Ll/jcr;", Owner.TYPE, "", "onCreate", "(Ll/jcr;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface DefaultLifecycleObserver extends icr {
    default void onCreate(@NotNull jcr owner) {
        owner.getClass();
    }

    default void onDestroy(@NotNull jcr owner) {
        owner.getClass();
    }

    default void onPause(@NotNull jcr owner) {
        owner.getClass();
    }

    default void onResume(@NotNull jcr owner) {
        owner.getClass();
    }

    default void onStart(@NotNull jcr owner) {
        owner.getClass();
    }

    default void onStop(@NotNull jcr owner) {
        owner.getClass();
    }
}
