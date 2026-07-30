package p153l;

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
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/twj0;", p7f.GPS_DIRECTION_TRUE, "Ll/mbe0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", Constants.KEY_OLD_VALUE, "", "i1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "h1", "()Z", "state", "d1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class twj0<T> extends mbe0<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public twj0(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        vwj0 vwj0Var = vwj0.INSTANCE;
        super(coroutineContext.get(vwj0Var) == null ? coroutineContext.plus(vwj0Var) : coroutineContext, continuation);
        this.threadStateToRecover = new ThreadLocal<>();
        if (continuation.getContext().get(ContinuationInterceptor.INSTANCE) instanceof CoroutineDispatcher) {
            return;
        }
        Object objM95110c = ThreadContextKt.m95110c(coroutineContext, null);
        ThreadContextKt.m95108a(coroutineContext, objM95110c);
        m193348i1(coroutineContext, objM95110c);
    }

    @Override // p153l.mbe0, kotlinx.coroutines.AbstractC15510a
    /* JADX INFO: renamed from: d1 */
    public void mo94623d1(@Nullable Object state) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                ThreadContextKt.m95108a(pair.component1(), pair.component2());
            }
            this.threadStateToRecover.remove();
        }
        Object objM207260a = wo5.m207260a(state, this.uCont);
        Continuation<T> continuation = this.uCont;
        CoroutineContext context = continuation.getContext();
        Object objM95110c = ThreadContextKt.m95110c(context, null);
        twj0<?> twj0VarM94500g = objM95110c != ThreadContextKt.f67579a ? CoroutineContextKt.m94500g(continuation, context, objM95110c) : null;
        try {
            this.uCont.resumeWith(objM207260a);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (twj0VarM94500g == null || twj0VarM94500g.m193347h1()) {
                ThreadContextKt.m95108a(context, objM95110c);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m193347h1() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m193348i1(@NotNull CoroutineContext context, @Nullable Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(TuplesKt.m88129a(context, oldValue));
    }
}
