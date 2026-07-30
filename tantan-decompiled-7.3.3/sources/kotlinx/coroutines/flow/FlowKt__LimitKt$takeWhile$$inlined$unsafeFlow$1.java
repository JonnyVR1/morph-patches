package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.eui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m88121d2 = {"l/gwd0", "Ll/aui;", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1<T> implements aui<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aui f67500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function2 f67501b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m88263f = "Limit.kt", m88264l = {123}, m88265m = "collect")
    @SourceDebugExtension
    public static final class C155451 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C155451(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(aui auiVar, Function2 function2) {
        this.f67500a = auiVar;
        this.f67501b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C155451 c155451;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof C155451) {
            c155451 = (C155451) continuation;
            int i = c155451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c155451.label = i - Integer.MIN_VALUE;
            } else {
                c155451 = new C155451(continuation);
            }
        } else {
            c155451 = new C155451(continuation);
        }
        Object obj = c155451.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c155451.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            aui auiVar = this.f67500a;
            FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = new FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(this.f67501b, buiVar);
            try {
                c155451.L$0 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                c155451.label = 1;
                if (auiVar.collect(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2, c155451) == objM198688e) {
                    return objM198688e;
                }
            } catch (AbortFlowException e) {
                e = e;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                eui.m122570a(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c155451.L$0;
            try {
                ResultKt.m88128b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                eui.m122570a(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
            }
        }
        return Unit.INSTANCE;
    }
}
