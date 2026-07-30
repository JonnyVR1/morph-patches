package p149l;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC15406b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/we4;", "Lkotlinx/coroutines/b;", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/Future;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class we4 implements InterfaceC15406b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Future<?> future;

    public we4(@NotNull Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.InterfaceC15406b
    /* JADX INFO: renamed from: a */
    public void mo93737a(@Nullable Throwable cause) {
        if (cause != null) {
            this.future.cancel(false);
        }
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }
}
