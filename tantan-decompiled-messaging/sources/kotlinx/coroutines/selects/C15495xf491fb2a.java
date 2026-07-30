package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlinx.coroutines.selects.SelectImplementation", m87374f = "Select.kt", m87375l = {712}, m87376m = "processResultAndInvokeBlockRecoveringException")
public final class C15495xf491fb2a extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectImplementation<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15495xf491fb2a(SelectImplementation<R> selectImplementation, Continuation<? super C15495xf491fb2a> continuation) {
        super(continuation);
        this.this$0 = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m94320v(null, null, this);
    }
}
