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
import p153l.bui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m88121d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/bui;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C15547xdf1aa1b6 implements bui<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function3 f67504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bui f67505b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1, reason: invalid class name */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m88263f = "Limit.kt", m88264l = {CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, m88265m = "emit")
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
            return C15547xdf1aa1b6.this.emit(null, this);
        }
    }

    public C15547xdf1aa1b6(Function3 function3, bui buiVar) {
        this.f67504a = function3;
        this.f67505b = buiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p153l.bui
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
        Object objM198688e = uyp.m198688e();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objInvoke);
            Function3 function3 = this.f67504a;
            bui buiVar = this.f67505b;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            InlineMarker.m88373c(6);
            objInvoke = function3.invoke(buiVar, obj, anonymousClass1);
            InlineMarker.m88373c(7);
            if (objInvoke == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (C15547xdf1aa1b6) anonymousClass1.L$0;
            ResultKt.m88128b(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(this);
    }
}
