package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.fri;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m87232d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/fri;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<T> implements fri<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f66841a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f66842b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m87374f = "Reduce.kt", m87375l = {CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, m87376m = "emit")
    @SourceDebugExtension
    public static final class C154481 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C154481(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(Function2 function2, Ref.ObjectRef objectRef) {
        this.f66841a = function2;
        this.f66842b = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.fri
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C154481 c154481;
        if (continuation instanceof C154481) {
            c154481 = (C154481) continuation;
            int i = c154481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c154481.label = i - Integer.MIN_VALUE;
            } else {
                c154481 = new C154481(continuation);
            }
        } else {
            c154481 = new C154481(continuation);
        }
        Object objInvoke = c154481.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c154481.label;
        if (i2 == 0) {
            ResultKt.m87239b(objInvoke);
            Function2 function2 = this.f66841a;
            c154481.L$0 = this;
            c154481.L$1 = t;
            c154481.label = 1;
            InlineMarker.m87484c(6);
            objInvoke = function2.invoke(t, c154481);
            InlineMarker.m87484c(7);
            if (objInvoke == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t = (T) c154481.L$1;
            this = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c154481.L$0;
            ResultKt.m87239b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Unit.INSTANCE;
        }
        this.f66842b.element = t;
        throw new AbortFlowException(this);
    }
}
