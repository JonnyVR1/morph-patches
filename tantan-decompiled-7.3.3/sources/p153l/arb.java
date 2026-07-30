package p153l;

import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "originalException", "thrownException", "b", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class arb {
    /* JADX INFO: renamed from: a */
    public static final void m99658a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        try {
            xqb xqbVar = (xqb) coroutineContext.get(xqb.INSTANCE);
            if (xqbVar != null) {
                xqbVar.handleException(coroutineContext, th);
            } else {
                zqb.m221002a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            zqb.m221002a(coroutineContext, m99659b(th, th2));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Throwable m99659b(@NotNull Throwable th, @NotNull Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        l6f.m153058a(runtimeException, th);
        return runtimeException;
    }
}
