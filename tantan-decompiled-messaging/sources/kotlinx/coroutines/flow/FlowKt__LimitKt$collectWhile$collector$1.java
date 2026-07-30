package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/fri;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 176)
@SourceDebugExtension
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements fri<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f66822a;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$collectWhile$collector$1(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.f66822a = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.fri
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) continuation;
            int i = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        }
        Object objInvoke = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(objInvoke);
            Function2<T, Continuation<? super Boolean>, Object> function2 = this.f66822a;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0 = this;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.label = 1;
            objInvoke = function2.invoke(t, flowKt__LimitKt$collectWhile$collector$1$emit$1);
            if (objInvoke == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0;
            ResultKt.m87239b(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(this);
    }
}
