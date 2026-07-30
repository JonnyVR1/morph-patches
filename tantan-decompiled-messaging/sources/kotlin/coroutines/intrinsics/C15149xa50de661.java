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
import kotlin.jvm.internal.TypeIntrinsics;
import p149l.qkq0;

/* JADX INFO: renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, m87232d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", Constants.ScionAnalytics.PARAM_LABEL, "", "invokeSuspend", "", LovePlanetStage.result, "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C15149xa50de661 extends ContinuationImpl {
    final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15149xa50de661(Continuation continuation, CoroutineContext coroutineContext, Function1 function1) {
        super(continuation, coroutineContext);
        this.$this_createCoroutineUnintercepted$inlined = function1;
        continuation.getClass();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) throws Throwable {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            ResultKt.m87239b(result);
            this.$this_createCoroutineUnintercepted$inlined.getClass();
            return ((Function1) TypeIntrinsics.m87540g(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
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
