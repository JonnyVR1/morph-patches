package p149l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.C15489r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m87232d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class qdq0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m174085a(@NotNull Continuation<? super Unit> continuation) {
        Object objM196133e;
        CoroutineContext context = continuation.getContext();
        gnq.m127169j(context);
        Continuation continuationM87368c = IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation);
        x3e x3eVar = continuationM87368c instanceof x3e ? (x3e) continuationM87368c : null;
        if (x3eVar == null) {
            objM196133e = Unit.INSTANCE;
        } else {
            if (x3eVar.dispatcher.isDispatchNeeded(context)) {
                x3eVar.m206902n(context, Unit.INSTANCE);
            } else {
                C15489r c15489r = new C15489r();
                CoroutineContext coroutineContextPlus = context.plus(c15489r);
                Unit unit = Unit.INSTANCE;
                x3eVar.m206902n(coroutineContextPlus, unit);
                objM196133e = (!c15489r.dispatcherWasUnconfined || y3e.m212800d(x3eVar)) ? uwp.m196133e() : unit;
            }
            objM196133e = uwp.m196133e();
        }
        if (objM196133e == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM196133e == uwp.m196133e() ? objM196133e : Unit.INSTANCE;
    }
}
