package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class FlowKt__CountKt$count$4<T> implements bui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f67478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.IntRef f67479b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CountKt$count$4(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Ref.IntRef intRef) {
        this.f67478a = function2;
        this.f67479b = intRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p153l.bui
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__CountKt$count$4$emit$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objInvoke);
            Function2<T, Continuation<? super Boolean>, Object> function2 = this.f67478a;
            flowKt__CountKt$count$4$emit$1.L$0 = this;
            flowKt__CountKt$count$4$emit$1.label = 1;
            objInvoke = function2.invoke(t, flowKt__CountKt$count$4$emit$1);
            if (objInvoke == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.L$0;
            ResultKt.m88128b(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            this.f67479b.element++;
        }
        return Unit.INSTANCE;
    }
}
