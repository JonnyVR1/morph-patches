package p153l;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC15588j;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010#\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0011\u0010'\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010\tR\u0011\u0010)\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\t¨\u0006*"}, m88121d2 = {"Ll/w4f;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "", "k0", "()J", "", "l0", "()Z", "m0", "Lkotlinx/coroutines/j;", "task", "", "a0", "(Lkotlinx/coroutines/j;)V", "unconfined", "e0", "(Z)V", Constants.INAPP_DATA_TAG, "", "parallelism", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "shutdown", "Z", "(Z)J", "a", "J", "useCount", "b", "shared", "Lkotlin/collections/ArrayDeque;", "c", "Lkotlin/collections/ArrayDeque;", "unconfinedQueue", "d0", "nextTime", "i0", "isUnconfinedLoopActive", "j0", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class w4f extends CoroutineDispatcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long useCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean shared;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ArrayDeque<AbstractC15588j<?>> unconfinedQueue;

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m204874h0(w4f w4fVar, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: incrementUseCount");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        w4fVar.m204879e0(z);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m204875j(w4f w4fVar, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: decrementUseCount");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        w4fVar.m204878d(z);
    }

    /* JADX INFO: renamed from: Z */
    public final long m204876Z(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m204877a0(@NotNull AbstractC15588j<?> task) {
        ArrayDeque<AbstractC15588j<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.unconfinedQueue = arrayDeque;
        }
        arrayDeque.addLast(task);
    }

    /* JADX INFO: renamed from: d */
    public final void m204878d(boolean unconfined) {
        long jM204876Z = this.useCount - m204876Z(unconfined);
        this.useCount = jM204876Z;
        if (jM204876Z <= 0 && this.shared) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public long mo95123d0() {
        ArrayDeque<AbstractC15588j<?>> arrayDeque = this.unconfinedQueue;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m204879e0(boolean unconfined) {
        this.useCount += m204876Z(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m204880i0() {
        return this.useCount >= m204876Z(true);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m204881j0() {
        ArrayDeque<AbstractC15588j<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public long mo95124k0() {
        return !m204882l0() ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m204882l0() throws IllegalAccessException, InvocationTargetException {
        AbstractC15588j<?> abstractC15588jRemoveFirstOrNull;
        ArrayDeque<AbstractC15588j<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null || (abstractC15588jRemoveFirstOrNull = arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        abstractC15588jRemoveFirstOrNull.run();
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public final CoroutineDispatcher limitedParallelism(int parallelism) {
        dor.m117361a(parallelism);
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m204883m0() {
        return false;
    }

    public void shutdown() {
    }
}
