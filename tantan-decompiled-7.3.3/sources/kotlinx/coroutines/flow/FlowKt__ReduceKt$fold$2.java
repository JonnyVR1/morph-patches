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
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 176)
@SourceDebugExtension
public final class FlowKt__ReduceKt$fold$2<T> implements bui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef<R> f67517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> f67518b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        this.f67517a = objectRef;
        this.f67518b = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p153l.bui
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$fold$2$emit$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.ObjectRef objectRef2 = this.f67517a;
            Function3<R, T, Continuation<? super R>, Object> function3 = this.f67518b;
            T t2 = objectRef2.element;
            flowKt__ReduceKt$fold$2$emit$1.L$0 = objectRef2;
            flowKt__ReduceKt$fold$2$emit$1.label = 1;
            Object objInvoke = function3.invoke((R) t2, t, flowKt__ReduceKt$fold$2$emit$1);
            if (objInvoke == objM198688e) {
                return objM198688e;
            }
            obj = (T) objInvoke;
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$fold$2$emit$1.L$0;
            ResultKt.m88128b(obj);
        }
        objectRef.element = (T) obj;
        return Unit.INSTANCE;
    }
}
