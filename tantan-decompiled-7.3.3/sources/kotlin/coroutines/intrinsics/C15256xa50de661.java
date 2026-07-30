package kotlin.coroutines.intrinsics;

import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import p153l.wtq0;

/* JADX INFO: renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, m88121d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", Constants.ScionAnalytics.PARAM_LABEL, "", "invokeSuspend", "", LovePlanetStage.result, "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C15256xa50de661 extends ContinuationImpl {
    final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15256xa50de661(Continuation continuation, CoroutineContext coroutineContext, Function1 function1) {
        super(continuation, coroutineContext);
        this.$this_createCoroutineUnintercepted$inlined = function1;
        continuation.getClass();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) throws Throwable {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            ResultKt.m88128b(result);
            this.$this_createCoroutineUnintercepted$inlined.getClass();
            return ((Function1) TypeIntrinsics.m88429g(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
        }
        if (i != 1) {
            wtq0.m207906a("This coroutine had already completed");
            return null;
        }
        this.label = 2;
        ResultKt.m88128b(result);
        return result;
    }
}
