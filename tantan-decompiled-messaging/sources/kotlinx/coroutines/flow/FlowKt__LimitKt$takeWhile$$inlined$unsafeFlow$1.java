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
import p149l.eri;
import p149l.fri;
import p149l.iri;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m87232d2 = {"l/eod0", "Ll/eri;", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1<T> implements eri<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eri f66826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function2 f66827b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m87374f = "Limit.kt", m87375l = {123}, m87376m = "collect")
    @SourceDebugExtension
    public static final class C154381 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C154381(Continuation continuation) {
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

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(eri eriVar, Function2 function2) {
        this.f66826a = eriVar;
        this.f66827b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C154381 c154381;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof C154381) {
            c154381 = (C154381) continuation;
            int i = c154381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c154381.label = i - Integer.MIN_VALUE;
            } else {
                c154381 = new C154381(continuation);
            }
        } else {
            c154381 = new C154381(continuation);
        }
        Object obj = c154381.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c154381.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            eri eriVar = this.f66826a;
            FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = new FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(this.f66827b, friVar);
            try {
                c154381.L$0 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                c154381.label = 1;
                if (eriVar.collect(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2, c154381) == objM196133e) {
                    return objM196133e;
                }
            } catch (AbortFlowException e) {
                e = e;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                iri.m137898a(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c154381.L$0;
            try {
                ResultKt.m87239b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                iri.m137898a(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
            }
        }
        return Unit.INSTANCE;
    }
}
