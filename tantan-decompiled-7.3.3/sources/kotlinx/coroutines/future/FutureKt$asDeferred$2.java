package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p153l.arb;
import p153l.mo5;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m88121d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", p7f.GPS_DIRECTION_TRUE, "value", "exception", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
final class FutureKt$asDeferred$2 extends Lambda implements Function2<Object, Throwable, Object> {
    final /* synthetic */ mo5<Object> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureKt$asDeferred$2(mo5<Object> mo5Var) {
        super(2);
        this.$result = mo5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Throwable th) {
        boolean zMo159236g;
        Throwable cause;
        mo5<Object> mo5Var = this.$result;
        try {
            if (th == null) {
                zMo159236g = mo5Var.mo159237h(obj);
            } else {
                CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th = cause;
                }
                zMo159236g = mo5Var.mo159236g(th);
            }
            return Boolean.valueOf(zMo159236g);
        } catch (Throwable th2) {
            arb.m99658a(EmptyCoroutineContext.INSTANCE, th2);
            return Unit.INSTANCE;
        }
    }
}
