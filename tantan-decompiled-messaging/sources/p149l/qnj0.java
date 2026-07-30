package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/qnj0;", j6f.GPS_DIRECTION_TRUE, "Ll/i3e0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", Constants.KEY_OLD_VALUE, "", "i1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "h1", "()Z", "state", "d1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qnj0<T> extends i3e0<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public qnj0(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        snj0 snj0Var = snj0.INSTANCE;
        super(coroutineContext.get(snj0Var) == null ? coroutineContext.plus(snj0Var) : coroutineContext, continuation);
        this.threadStateToRecover = new ThreadLocal<>();
        if (continuation.getContext().get(ContinuationInterceptor.INSTANCE) instanceof CoroutineDispatcher) {
            return;
        }
        Object objM94217c = ThreadContextKt.m94217c(coroutineContext, null);
        ThreadContextKt.m94215a(coroutineContext, objM94217c);
        m175682i1(coroutineContext, objM94217c);
    }

    @Override // p149l.i3e0, kotlinx.coroutines.AbstractC15403a
    /* JADX INFO: renamed from: d1 */
    public void mo93731d1(@Nullable Object state) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                ThreadContextKt.m94215a(pair.component1(), pair.component2());
            }
            this.threadStateToRecover.remove();
        }
        Object objM185031a = sn5.m185031a(state, this.uCont);
        Continuation<T> continuation = this.uCont;
        CoroutineContext context = continuation.getContext();
        Object objM94217c = ThreadContextKt.m94217c(context, null);
        qnj0<?> qnj0VarM93609g = objM94217c != ThreadContextKt.f66905a ? CoroutineContextKt.m93609g(continuation, context, objM94217c) : null;
        try {
            this.uCont.resumeWith(objM185031a);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (qnj0VarM93609g == null || qnj0VarM93609g.m175681h1()) {
                ThreadContextKt.m94215a(context, objM94217c);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m175681h1() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m175682i1(@NotNull CoroutineContext context, @Nullable Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(TuplesKt.m87240a(context, oldValue));
    }
}
