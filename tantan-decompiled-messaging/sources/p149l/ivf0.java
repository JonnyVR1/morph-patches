package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/ivf0;", "Ll/d8;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "<init>", "()V", "flow", "", Constants.INAPP_DATA_TAG, "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "Lkotlin/coroutines/Continuation;", "", "f", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "g", "h", "()Z", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ivf0 extends AbstractC16310d8<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // p149l.AbstractC16310d8
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo110260a(@NotNull StateFlowImpl<?> flow) {
        if (os5.m165697a(this._state) != null) {
            return false;
        }
        os5.m165698b(this._state, hvf0.f109641a);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m138618e(@NotNull Continuation<? super Unit> continuation) {
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        if (!f31.m119248a(this._state, hvf0.f109641a, c15407c)) {
            Result.Companion companion = Result.INSTANCE;
            c15407c.resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
        }
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
    }

    @Override // p149l.AbstractC16310d8
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation<Unit>[] mo110261b(@NotNull StateFlowImpl<?> flow) {
        os5.m165698b(this._state, null);
        return C16091c8.f79669a;
    }

    /* JADX INFO: renamed from: g */
    public final void m138620g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objM165697a = os5.m165697a(atomicReference);
            if (objM165697a == null || objM165697a == hvf0.f109642b) {
                return;
            }
            yfh0 yfh0Var = hvf0.f109641a;
            AtomicReference<Object> atomicReference2 = this._state;
            if (objM165697a == yfh0Var) {
                if (f31.m119248a(atomicReference2, objM165697a, hvf0.f109642b)) {
                    return;
                }
            } else if (f31.m119248a(atomicReference2, objM165697a, hvf0.f109641a)) {
                Result.Companion companion = Result.INSTANCE;
                ((C15407c) objM165697a).resumeWith(Result.m223820constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m138621h() {
        Object andSet = this._state.getAndSet(hvf0.f109641a);
        andSet.getClass();
        return andSet == hvf0.f109642b;
    }
}
