package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 176)
@SourceDebugExtension
public final class FlowKt__ReduceKt$fold$2<T> implements fri {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef<R> f66843a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> f66844b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        this.f66843a = objectRef;
        this.f66844b = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p149l.fri
    @Nullable
    public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__ReduceKt$fold$2$emit$1) {
            flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) continuation;
            int i = flowKt__ReduceKt$fold$2$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$2$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            }
        } else {
            flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
        }
        Object obj = flowKt__ReduceKt$fold$2$emit$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$fold$2$emit$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.ObjectRef objectRef2 = this.f66843a;
            Function3<R, T, Continuation<? super R>, Object> function3 = this.f66844b;
            T t2 = objectRef2.element;
            flowKt__ReduceKt$fold$2$emit$1.L$0 = objectRef2;
            flowKt__ReduceKt$fold$2$emit$1.label = 1;
            Object objInvoke = function3.invoke((R) t2, t, flowKt__ReduceKt$fold$2$emit$1);
            if (objInvoke == objM196133e) {
                return objM196133e;
            }
            obj = (T) objInvoke;
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$fold$2$emit$1.L$0;
            ResultKt.m87239b(obj);
        }
        objectRef.element = (T) obj;
        return Unit.INSTANCE;
    }
}
