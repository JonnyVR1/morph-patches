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
import p153l.bui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m88121d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/bui;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<T> implements bui<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f67515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f67516b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m88263f = "Reduce.kt", m88264l = {CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA}, m88265m = "emit")
    @SourceDebugExtension
    public static final class C155551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C155551(Continuation continuation) {
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
        this.f67515a = function2;
        this.f67516b = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p153l.bui
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C155551 c155551;
        if (continuation instanceof C155551) {
            c155551 = (C155551) continuation;
            int i = c155551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c155551.label = i - Integer.MIN_VALUE;
            } else {
                c155551 = new C155551(continuation);
            }
        } else {
            c155551 = new C155551(continuation);
        }
        Object objInvoke = c155551.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c155551.label;
        if (i2 == 0) {
            ResultKt.m88128b(objInvoke);
            Function2 function2 = this.f67515a;
            c155551.L$0 = this;
            c155551.L$1 = t;
            c155551.label = 1;
            InlineMarker.m88373c(6);
            objInvoke = function2.invoke(t, c155551);
            InlineMarker.m88373c(7);
            if (objInvoke == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t = (T) c155551.L$1;
            this = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c155551.L$0;
            ResultKt.m88128b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Unit.INSTANCE;
        }
        this.f67516b.element = t;
        throw new AbortFlowException(this);
    }
}
