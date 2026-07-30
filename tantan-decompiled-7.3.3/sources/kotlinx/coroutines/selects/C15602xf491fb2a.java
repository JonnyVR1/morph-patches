package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlinx.coroutines.selects.SelectImplementation", m88263f = "Select.kt", m88264l = {712}, m88265m = "processResultAndInvokeBlockRecoveringException")
public final class C15602xf491fb2a extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectImplementation<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15602xf491fb2a(SelectImplementation<R> selectImplementation, Continuation<? super C15602xf491fb2a> continuation) {
        super(continuation);
        this.this$0 = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m95213v(null, null, this);
    }
}
