package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.fri;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m87232d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/fri;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C15440xdf1aa1b6 implements fri<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function3 f66830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fri f66831b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1, reason: invalid class name */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m87374f = "Limit.kt", m87375l = {CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, m87376m = "emit")
    @SourceDebugExtension
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C15440xdf1aa1b6.this.emit(null, this);
        }
    }

    public C15440xdf1aa1b6(Function3 function3, fri friVar) {
        this.f66830a = function3;
        this.f66831b = friVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.fri
    @Nullable
    public Object emit(Object obj, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objInvoke = anonymousClass1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.m87239b(objInvoke);
            Function3 function3 = this.f66830a;
            fri friVar = this.f66831b;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            InlineMarker.m87484c(6);
            objInvoke = function3.invoke(friVar, obj, anonymousClass1);
            InlineMarker.m87484c(7);
            if (objInvoke == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (C15440xdf1aa1b6) anonymousClass1.L$0;
            ResultKt.m87239b(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(this);
    }
}
