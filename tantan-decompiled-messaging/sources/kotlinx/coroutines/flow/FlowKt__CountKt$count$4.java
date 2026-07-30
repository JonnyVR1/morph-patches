package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class FlowKt__CountKt$count$4<T> implements fri {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f66804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.IntRef f66805b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CountKt$count$4(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Ref.IntRef intRef) {
        this.f66804a = function2;
        this.f66805b = intRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.fri
    @Nullable
    public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
        if (continuation instanceof FlowKt__CountKt$count$4$emit$1) {
            flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) continuation;
            int i = flowKt__CountKt$count$4$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$4$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, continuation);
            }
        } else {
            flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, continuation);
        }
        Object objInvoke = flowKt__CountKt$count$4$emit$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__CountKt$count$4$emit$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(objInvoke);
            Function2<T, Continuation<? super Boolean>, Object> function2 = this.f66804a;
            flowKt__CountKt$count$4$emit$1.L$0 = this;
            flowKt__CountKt$count$4$emit$1.label = 1;
            objInvoke = function2.invoke(t, flowKt__CountKt$count$4$emit$1);
            if (objInvoke == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.L$0;
            ResultKt.m87239b(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            this.f66805b.element++;
        }
        return Unit.INSTANCE;
    }
}
