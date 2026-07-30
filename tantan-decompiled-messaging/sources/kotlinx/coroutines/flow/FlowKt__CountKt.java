package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001aD\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "", "a", "(Ll/eri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "b", "(Ll/eri;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CountKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$a */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15430a<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.IntRef f66803a;

        public C15430a(Ref.IntRef intRef) {
            this.f66803a = intRef;
        }

        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f66803a.element++;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m94078a(@NotNull eri<? extends T> eriVar, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        FlowKt__CountKt$count$1 flowKt__CountKt$count$1;
        Ref.IntRef intRef;
        if (continuation instanceof FlowKt__CountKt$count$1) {
            flowKt__CountKt$count$1 = (FlowKt__CountKt$count$1) continuation;
            int i = flowKt__CountKt$count$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__CountKt$count$1 = new FlowKt__CountKt$count$1(continuation);
            }
        } else {
            flowKt__CountKt$count$1 = new FlowKt__CountKt$count$1(continuation);
        }
        Object obj = flowKt__CountKt$count$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__CountKt$count$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            fri<? super Object> c15430a = new C15430a<>(intRef2);
            flowKt__CountKt$count$1.L$0 = intRef2;
            flowKt__CountKt$count$1.label = 1;
            if (eriVar.collect(c15430a, flowKt__CountKt$count$1) == objM196133e) {
                return objM196133e;
            }
            intRef = intRef2;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intRef = (Ref.IntRef) flowKt__CountKt$count$1.L$0;
            ResultKt.m87239b(obj);
        }
        return Boxing.m87371b(intRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94079b(@NotNull eri<? extends T> eriVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        FlowKt__CountKt$count$3 flowKt__CountKt$count$3;
        Ref.IntRef intRef;
        if (continuation instanceof FlowKt__CountKt$count$3) {
            flowKt__CountKt$count$3 = (FlowKt__CountKt$count$3) continuation;
            int i = flowKt__CountKt$count$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$3.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__CountKt$count$3 = new FlowKt__CountKt$count$3(continuation);
            }
        } else {
            flowKt__CountKt$count$3 = new FlowKt__CountKt$count$3(continuation);
        }
        Object obj = flowKt__CountKt$count$3.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__CountKt$count$3.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            fri<? super Object> flowKt__CountKt$count$4 = new FlowKt__CountKt$count$4<>(function2, intRef2);
            flowKt__CountKt$count$3.L$0 = intRef2;
            flowKt__CountKt$count$3.label = 1;
            if (eriVar.collect(flowKt__CountKt$count$4, flowKt__CountKt$count$3) == objM196133e) {
                return objM196133e;
            }
            intRef = intRef2;
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intRef = (Ref.IntRef) flowKt__CountKt$count$3.L$0;
            ResultKt.m87239b(obj);
        }
        return Boxing.m87371b(intRef.element);
    }
}
