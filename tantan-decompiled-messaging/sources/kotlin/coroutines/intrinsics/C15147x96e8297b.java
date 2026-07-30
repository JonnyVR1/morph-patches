package kotlin.coroutines.intrinsics;

import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p149l.qkq0;

/* JADX INFO: renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/Result;", "", LovePlanetStage.result, "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", Constants.ScionAnalytics.PARAM_LABEL, "I", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C15147x96e8297b extends ContinuationImpl {
    final /* synthetic */ Function1<Continuation<Object>, Object> $block;
    private int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15147x96e8297b(Continuation<Object> continuation, CoroutineContext coroutineContext, Function1<? super Continuation<Object>, ? extends Object> function1) {
        super(continuation, coroutineContext);
        this.$block = function1;
        continuation.getClass();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) throws Throwable {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            ResultKt.m87239b(result);
            return this.$block.invoke(this);
        }
        if (i != 1) {
            qkq0.m175383a("This coroutine had already completed");
            return null;
        }
        this.label = 2;
        ResultKt.m87239b(result);
        return result;
    }
}
