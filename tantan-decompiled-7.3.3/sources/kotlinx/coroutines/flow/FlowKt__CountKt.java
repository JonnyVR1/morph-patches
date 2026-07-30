package kotlinx.coroutines.flow;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001aD\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "", "a", "(Ll/aui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "b", "(Ll/aui;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CountKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$a */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C15537a<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.IntRef f67477a;

        public C15537a(Ref.IntRef intRef) {
            this.f67477a = intRef;
        }

        @Override // p153l.bui
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f67477a.element++;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m94971a(@NotNull aui<? extends T> auiVar, @NotNull Continuation<? super Integer> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__CountKt$count$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            bui<? super Object> c15537a = new C15537a<>(intRef2);
            flowKt__CountKt$count$1.L$0 = intRef2;
            flowKt__CountKt$count$1.label = 1;
            if (auiVar.collect(c15537a, flowKt__CountKt$count$1) == objM198688e) {
                return objM198688e;
            }
            intRef = intRef2;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intRef = (Ref.IntRef) flowKt__CountKt$count$1.L$0;
            ResultKt.m88128b(obj);
        }
        return Boxing.m88260b(intRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m94972b(@NotNull aui<? extends T> auiVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Integer> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__CountKt$count$3.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            bui<? super Object> flowKt__CountKt$count$4 = new FlowKt__CountKt$count$4<>(function2, intRef2);
            flowKt__CountKt$count$3.L$0 = intRef2;
            flowKt__CountKt$count$3.label = 1;
            if (auiVar.collect(flowKt__CountKt$count$4, flowKt__CountKt$count$3) == objM198688e) {
                return objM198688e;
            }
            intRef = intRef2;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intRef = (Ref.IntRef) flowKt__CountKt$count$3.L$0;
            ResultKt.m88128b(obj);
        }
        return Boxing.m88260b(intRef.element);
    }
}
