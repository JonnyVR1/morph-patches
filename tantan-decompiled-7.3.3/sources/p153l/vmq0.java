package p153l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.C15596r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m88121d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class vmq0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m201769a(@NotNull Continuation<? super Unit> continuation) {
        Object objM198688e;
        CoroutineContext context = continuation.getContext();
        fpq.m126711j(context);
        Continuation continuationM88257c = IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation);
        l5e l5eVar = continuationM88257c instanceof l5e ? (l5e) continuationM88257c : null;
        if (l5eVar == null) {
            objM198688e = Unit.INSTANCE;
        } else {
            if (l5eVar.dispatcher.isDispatchNeeded(context)) {
                l5eVar.m152935n(context, Unit.INSTANCE);
            } else {
                C15596r c15596r = new C15596r();
                CoroutineContext coroutineContextPlus = context.plus(c15596r);
                Unit unit = Unit.INSTANCE;
                l5eVar.m152935n(coroutineContextPlus, unit);
                objM198688e = (!c15596r.dispatcherWasUnconfined || m5e.m157103d(l5eVar)) ? uyp.m198688e() : unit;
            }
            objM198688e = uyp.m198688e();
        }
        if (objM198688e == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM198688e == uyp.m198688e() ? objM198688e : Unit.INSTANCE;
    }
}
