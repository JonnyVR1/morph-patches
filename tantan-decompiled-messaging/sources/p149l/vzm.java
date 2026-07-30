package p149l;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class vzm {
    /* JADX INFO: renamed from: b */
    public static final <T> T m200773b(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        try {
            dpi0 dpi0Var = new dpi0(gnq.m127171l(coroutineContext));
            dpi0Var.m112915e();
            try {
                return function0.invoke();
            } finally {
                dpi0Var.m112913b();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
