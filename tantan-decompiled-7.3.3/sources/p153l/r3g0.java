package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/r3g0;", "Ll/y7;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "<init>", "()V", "flow", "", Constants.INAPP_DATA_TAG, "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "Lkotlin/coroutines/Continuation;", "", "f", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "g", "h", "()Z", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class r3g0 extends AbstractC21534y7<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // p153l.AbstractC21534y7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo156925a(@NotNull StateFlowImpl<?> flow) {
        if (st5.m187844a(this._state) != null) {
            return false;
        }
        st5.m187845b(this._state, q3g0.f155445a);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m179614e(@NotNull Continuation<? super Unit> continuation) {
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        if (!m31.m156916a(this._state, q3g0.f155445a, c15514c)) {
            Result.Companion companion = Result.INSTANCE;
            c15514c.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
    }

    @Override // p153l.AbstractC21534y7
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation<Unit>[] mo156926b(@NotNull StateFlowImpl<?> flow) {
        st5.m187845b(this._state, null);
        return C21262x7.f192655a;
    }

    /* JADX INFO: renamed from: g */
    public final void m179616g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objM187844a = st5.m187844a(atomicReference);
            if (objM187844a == null || objM187844a == q3g0.f155446b) {
                return;
            }
            goh0 goh0Var = q3g0.f155445a;
            AtomicReference<Object> atomicReference2 = this._state;
            if (objM187844a == goh0Var) {
                if (m31.m156916a(atomicReference2, objM187844a, q3g0.f155446b)) {
                    return;
                }
            } else if (m31.m156916a(atomicReference2, objM187844a, q3g0.f155445a)) {
                Result.Companion companion = Result.INSTANCE;
                ((C15514c) objM187844a).resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m179617h() {
        Object andSet = this._state.getAndSet(q3g0.f155445a);
        andSet.getClass();
        return andSet == q3g0.f155446b;
    }
}
